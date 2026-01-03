//import AST.ASTnode;
//import AST.JINJA.*;
//import Symbols.SymbolTableManager;
//import Symbols.SymbolTableVisitor;
//import java.io.PrintWriter;
//import java.io.IOException;
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        SymbolTableManager symbols = new SymbolTableManager();
//        symbols.enterScope("global");
//
//
//        // x = 1
//        AssignmentNode assignX = new AssignmentNode("x", new EqIntNode(1, 1), 1);
//        StmtAssignNode stmtX = new StmtAssignNode(assignX, 1);
//
//        // if x: y = 2
//        EqVarNode condX = new EqVarNode("x", 2);
//        IfFragmentNode ifFrag = new IfFragmentNode(condX, 2);
//
//        AssignmentNode assignY = new AssignmentNode("y", new EqIntNode(2, 2), 2);
//        StmtAssignNode stmtY = new StmtAssignNode(assignY, 2);
//
//        CodeBlockNode ifBlock = new CodeBlockNode(2);
//        ifBlock.addChild(stmtY);
//
//        EndIfFragmentNode endIf = new EndIfFragmentNode(3);
//        IfStatementNode ifStmt = new IfStatementNode(ifFrag, ifBlock, null, null, endIf, 2);
//
//        // z = 3
//        AssignmentNode assignZ = new AssignmentNode("z", new EqIntNode(3, 3), 3);
//        StmtAssignNode stmtZ = new StmtAssignNode(assignZ, 3);
//
//        CodeBlockNode root = new CodeBlockNode(0);
//        root.addChild(stmtX);
//        root.addChild(ifStmt);
//        root.addChild(stmtZ);
//
//        System.out.println("===== AST TREE =====");
//        root.print(0);
//
//        try {
//            root.saveToFile("ast.txt");
//            System.out.println("AST saved to ast.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        SymbolTableVisitor visitor = new SymbolTableVisitor(symbols);
//        visitor.visit(root);
//
//        System.out.println("\n? FINAL SYMBOL TABLE:");
//        symbols.printAll();
//    }
//}

// Main.java
// Detect file type (Flask vs HTML/CSS/Jinja2), parse with ANTLR (SLL, with protected LL fallback),
// try to build AST using known visitors, and save parse-tree and AST (when available).
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.DefaultErrorStrategy;

import java.lang.reflect.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;

public class Main {
    // default input files (you can pass args or edit)
    static final List<String> INPUT_FILES = Arrays.asList(
            "tests/display_products.txt",
            "tests/add_product.txt",
            "tests/product_details.txt"
    );

    static final int MAX_CHARS = 2_000_000;
    static final int MAX_TOKENS = 500_000;
    static final int MAX_ZERO_LEN_REPEAT = 50;

    // Known parser/lexer roots & visitor hints
    static class ParserInfo {
        String lexerClass;
        String parserClass;
        String rootMethod; // e.g. htmlDocument, file_input
        String[] visitors;
        ParserInfo(String l, String p, String r, String[] v){ lexerClass=l; parserClass=p; rootMethod=r; visitors=v; }
    }

    static final ParserInfo HTML_INFO = new ParserInfo(
            "antlr.HTMLCSSJinjaLexer",
            "antlr.HTMLCSSJinjaParser",
            "htmlDocument",
            new String[] { "Visitor.Jinja2ASTVisitor","Jinja2ASTVisitor","Visitor.HTMLASTVisitor","HTMLASTVisitor","Visitor.FlaskASTVisitor","FlaskASTVisitor" }
    );

    static final ParserInfo FLASK_INFO = new ParserInfo(
            "antlr.FlaskLexer",
            "antlr.FlaskParser",
            "file_input",
            new String[] { "Visitor.FlaskASTVisitor","FlaskASTVisitor","Visitor.HTMLASTVisitor","HTMLASTVisitor" }
    );

    // Utilities to write files
    private static void writeStringFile(Path p, String s) throws IOException { Files.writeString(p, s, StandardCharsets.UTF_8); }

    private static void writeParseTreeToFile(ParseTree tree, Parser parser, Path outFile) {
        try {
            String treeStr = (parser != null) ? tree.toStringTree(parser) : tree.toStringTree();
            writeStringFile(outFile, treeStr);
            System.out.println("Saved: " + outFile.toAbsolutePath());
        } catch (Throwable t) {
            System.err.println("Error writing parse-tree: " + t.getMessage());
        }
    }

    private static void writeASTToFile(Object astRoot, Path outFile) {
        if (astRoot == null) return;
        try {
            // try print(int) first, else toString
            Method printM = null;
            try { printM = astRoot.getClass().getMethod("print", int.class); } catch (NoSuchMethodException e) { printM = null; }
            if (printM != null) {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                PrintStream ps = new PrintStream(baos, true, StandardCharsets.UTF_8.name());
                PrintStream old = System.out;
                System.setOut(ps);
                printM.invoke(astRoot, 0);
                System.out.flush();
                System.setOut(old);
                writeStringFile(outFile, baos.toString(StandardCharsets.UTF_8));
            } else {
                writeStringFile(outFile, astRoot.toString());
            }
            System.out.println("Saved AST to: " + outFile.toAbsolutePath());
        } catch (Throwable t) {
            System.err.println("Error writing AST: " + t.getMessage());
        }
    }

    // Strip Jinja minimally (safe placeholder)
    private static String stripJinja(String s) {
        if (s == null) return s;
        s = s.replace("\r\n", "\n").replace('\r','\n');
        s = s.replaceAll("(?s)\\{\\{.*?\\}\\}", "PLACEHOLDER");
        // keep control blocks for now (we may replace full blocks later)
        return s;
    }

    private static String preProcessSimplify(String stripped) {
        if (stripped == null) return stripped;
        // remove comments
        stripped = stripped.replaceAll("(?s)<!--.*?-->", " ");
        // remove attributes: <tag ...> -> <tag>
        stripped = stripped.replaceAll("<\\s*([a-zA-Z0-9_-]+)(\\s+[^>]*?)?>", "<$1>");
        // compress spaces
        stripped = stripped.replaceAll("[ \\t\\x0B\\f\\u00A0]+", " ");
        stripped = stripped.replaceAll("\\n{2,}", "\n");
        return stripped;
    }

    private static String escapeShort(String s) {
        if (s == null) return "";
        String t = s.replace("\n","\\n").replace("\r","\\r");
        if (t.length() > 80) return t.substring(0,77) + "...";
        return t;
    }

    // Parse using given ParserInfo. Try SLL (bail) first. Return ParseTree+Parser or null.
    private static Pair<ParseTree, Parser> parseWithSLLThenLL(String content, ParserInfo info, boolean buildParseTree) throws Exception {
        Class<?> lexCls = Class.forName(info.lexerClass);
        Constructor<?> lexCtor = lexCls.getConstructor(CharStream.class);
        Class<?> parCls = Class.forName(info.parserClass);
        Constructor<?> parCtor = parCls.getConstructor(TokenStream.class);

        // Try SLL (Bail)
        try {
            CharStream cs = CharStreams.fromString(content);
            Lexer lexer = (Lexer) lexCtor.newInstance(cs);
            UnbufferedTokenStream<Token> stream = new UnbufferedTokenStream<>(lexer);
            Object pObj = parCtor.newInstance(stream);
            if (!(pObj instanceof Parser)) throw new RuntimeException("Parser class not Parser");
            Parser parser = (Parser) pObj;
            parser.setBuildParseTree(buildParseTree);
            try { parser.getInterpreter().setPredictionMode(PredictionMode.SLL); } catch (Exception ignore) {}
            parser.setErrorHandler(new BailErrorStrategy());
            Method root = parCls.getMethod(info.rootMethod);
            Object res = root.invoke(parser);
            if (res instanceof ParseTree) return new Pair<>((ParseTree) res, parser.getBuildParseTree() ? parser : null);
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            if (cause instanceof ParseCancellationException) {
                System.err.println("SLL failed.");
                // fallthrough to LL fallback below
            } else if (cause instanceof OutOfMemoryError) {
                throw (OutOfMemoryError) cause;
            } else {
                throw ite;
            }
        }

        // LL fallback (protected)
        try {
            CharStream cs = CharStreams.fromString(content);
            Lexer lexer = (Lexer) lexCtor.newInstance(cs);
            UnbufferedTokenStream<Token> stream = new UnbufferedTokenStream<>(lexer);
            Object pObj = parCtor.newInstance(stream);
            Parser parser = (Parser) pObj;
            parser.setBuildParseTree(true);
            try { parser.getInterpreter().setPredictionMode(PredictionMode.LL); } catch (Exception ignore) {}
            parser.setErrorHandler(new DefaultErrorStrategy());
            Method root = parCls.getMethod(info.rootMethod);
            Object res = root.invoke(parser);
            if (res instanceof ParseTree) return new Pair<>((ParseTree) res, parser);
            return null;
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            if (cause instanceof OutOfMemoryError) {
                throw (OutOfMemoryError) cause;
            } else {
                System.err.println("LL parse failed: " + ite.getCause());
                return null;
            }
        }
    }

    // Try visitors to build AST (best-effort)
    private static Object tryBuildAST(ParseTree tree, ParserInfo info) {
        for (String visName : info.visitors) {
            try {
                Class<?> visCls = Class.forName(visName);
                Constructor<?> vc = visCls.getDeclaredConstructor();
                Object visObj = vc.newInstance();
                try {
                    Method m = visCls.getMethod("visit", ParseTree.class);
                    Object ast = m.invoke(visObj, tree);
                    if (ast != null) return ast;
                } catch (NoSuchMethodException nsme) {
                    // try generic visit(Object)
                    try {
                        Method m2 = visCls.getMethod("visit", Object.class);
                        Object ast = m2.invoke(visObj, tree);
                        if (ast != null) return ast;
                    } catch (Throwable ignored) {}
                }
            } catch (ClassNotFoundException cnf) {
                // visitor not present, ignore
            } catch (OutOfMemoryError oom) {
                System.err.println("OOM while building AST with " + visName);
                return null;
            } catch (Throwable t) {
                System.err.println("Visitor " + visName + " failed: " + t.getMessage());
            }
        }
        return null;
    }

    // Simple Pair
    private static class Pair<A,B>{ final A a; final B b; Pair(A a,B b){this.a=a;this.b=b;} }

    // Detect file type heuristically
    private static ParserInfo detectParserInfo(String content) {
        String low = content.toLowerCase();
        if (low.contains("from flask") || low.contains("flask import") || low.contains("@app.route") || low.contains("def ") && low.contains("flask(")) {
            return FLASK_INFO;
        }
        if (low.contains("<html") || low.contains("{%") || low.contains("{{")) {
            return HTML_INFO;
        }
        // default to HTML parser if unsure
        return HTML_INFO;
    }

    public static void main(String[] args) {
        boolean buildAST = false;
        List<String> files = new ArrayList<>();
        files.addAll(INPUT_FILES);
        for (String a: args) {
            if ("--ast".equals(a)) buildAST = true;
            else files.add(a);
        }

        System.out.println("Main started. buildAST=" + buildAST);

        for (String path : files) {
            System.out.println("\n=== Processing: " + path + " ===");
            try {
                String content = Files.readString(Paths.get(path));
                if (content.length() > MAX_CHARS) {
                    System.err.println("File too large; skipping.");
                    continue;
                }

                ParserInfo info = detectParserInfo(content);
                System.out.println("Using parser: " + info.parserClass + " lexer: " + info.lexerClass);

                // Preprocess to help lexing (optional)
                String stripped = stripJinja(content);
                stripped = preProcessSimplify(stripped);

                // token estimate (light)
                try {
                    CharStream csCount = CharStreams.fromString(stripped);
                    Lexer countingLexer = (Lexer) Class.forName(info.lexerClass).getConstructor(CharStream.class).newInstance(csCount);
                    countingLexer.removeErrorListeners();
                    int tokenCount = 0, zeroLenRepeat = 0, lastStart = -1;
                    List<String> firstTokens = new ArrayList<>();
                    while(true) {
                        Token t = countingLexer.nextToken();
                        if (t==null) break;
                        tokenCount++;
                        if (tokenCount<=20) firstTokens.add(String.format("%d:[%d] \"%s\"", tokenCount, t.getType(), escapeShort(t.getText())));
                        if (t.getType()==Token.EOF) break;
                        int start = t.getStartIndex();
                        int len = t.getText()!=null ? t.getText().length() : -1;
                        if (start==lastStart || len==0) zeroLenRepeat++; else zeroLenRepeat=0;
                        lastStart = start;
                        if (zeroLenRepeat>MAX_ZERO_LEN_REPEAT) { System.err.println("Lexer repeated zero-length tokens — aborting count."); break; }
                        if (tokenCount>MAX_TOKENS) break;
                    }
                    System.out.println("Token estimate: " + tokenCount);
                    if (!firstTokens.isEmpty()) { firstTokens.forEach(System.out::println); }
                    if (tokenCount>MAX_TOKENS) { System.err.println("Too many tokens; skipping."); continue; }
                } catch (Throwable t) {
                    System.err.println("Token counting failed: " + t.getMessage());
                }

                Pair<ParseTree, Parser> result = null;
                try {
                    result = parseWithSLLThenLL(stripped, info, buildAST);
                } catch (OutOfMemoryError oom) {
                    System.err.println("OOM during parse. Try running with larger heap -Xmx2g");
                    oom.printStackTrace();
                    break;
                }

                if (result == null || result.a == null) {
                    System.err.println("Parsing failed for " + path);
                    Path preview = Paths.get("preview_" + path.replaceAll("[^a-zA-Z0-9_.-]","_") + ".txt");
                    writeStringFile(preview, stripped);
                    System.out.println("Saved preview to " + preview.toAbsolutePath());
                    continue;
                }

                String safe = path.replaceAll("[^a-zA-Z0-9_.-]","_");
                Path parseOut = Paths.get("parse_tree_" + safe + ".txt");
                writeParseTreeToFile(result.a, result.b, parseOut);

                if (buildAST) {
                    Object ast = tryBuildAST(result.a, info);
                    if (ast != null) {
                        Path astOut = Paths.get("ast_" + safe + ".txt");
                        writeASTToFile(ast, astOut);
                    } else {
                        System.out.println("No AST built for " + path + " (no visitor or visitor failed).");
                    }
                }

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }

        System.out.println("\nMain finished.");
    }
}
