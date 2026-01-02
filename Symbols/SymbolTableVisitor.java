package Symbols;

import AST.ASTnode;
import AST.JINJA.*;
import Symbols.SymbolTableManager;

public class SymbolTableVisitor {

    private SymbolTableManager symbols;

    public SymbolTableVisitor(SymbolTableManager symbols) {
        this.symbols = symbols;
    }

    public void visit(ASTnode node) {
        if (node == null) return;

        if (node instanceof StmtAssignNode) {
            visitStmtAssign((StmtAssignNode) node);
        }
        else if (node instanceof IfStatementNode) {
            visitIfStatement((IfStatementNode) node);
        }
        else if (node instanceof WhileStatementNode) {
            visitWhileStatement((WhileStatementNode) node);
        }
        else if (node instanceof CodeBlockNode) {
            visitCodeBlock((CodeBlockNode) node);
        }
    }

    private void visitStmtAssign(StmtAssignNode node) {
        AssignmentNode a = node.assign;

        String type = inferType(a.value);

        symbols.insert(
                a.variable,
                "variable",
                type,
                a.getLineNumber(),
                0
        );

        visit(a.value);
    }

    private void visitIfStatement(IfStatementNode node) {

        visit(node.ifFragment.condition);

        symbols.enterScope("if");
        visit(node.code);
        symbols.exitScope();

        if (node.elifChain != null) {
            visit(node.elifChain);
        }

        if (node.elseStmt != null) {
            symbols.enterScope("else");
            visit(node.elseStmt.code);
            symbols.exitScope();
        }
    }
    private void visitWhileStatement(WhileStatementNode node) {
        visit(node.whileFragment.condition);
//        symbols.enterScope("While");

        symbols.enterScope("while");
        for (ASTnode stmt : node.body) {
            visit(stmt);
        }
        symbols.exitScope();
    }

    public void visitCodeBlock(CodeBlockNode node) {
        for (ASTnode child : node.getChildren()) {
            visit(child);
        }
    }
    private String inferType(ASTnode expr) {

        if (expr instanceof EqIntNode) {
            return "int";
        }

        if (expr instanceof EqStrNode) {
            return "string";
        }

        if (expr instanceof EqVarNode) {
            EqVarNode v = (EqVarNode) expr;
            Symbol s = symbols.lookup(v.name);
            if (s != null) return s.getType();
        }

        return "unknown";
    }

}
