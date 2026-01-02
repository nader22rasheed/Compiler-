package Visitor;

import AST.JINJA.*;
import AST.ASTnode;
import Symbols.SymbolTableManager;
import Symbols.Symbol;
public class Jinja2ASTVisitor {
    private SymbolTableManager symbols;
    public Jinja2ASTVisitor() {
        this.symbols = new SymbolTableManager();
    }
    public Jinja2ASTVisitor(SymbolTableManager symbols) {
        this.symbols = symbols;
    }
    public void visit(ASTnode node) {
        if (node == null) return;

        switch (node.getNodeName())
        {
            case "Assignment":
                visitAssignment((AssignmentNode) node); break;
            case "BoolEq":
                visitBoolEq((BoolEqNode) node); break;
            case "BoolLiteral":
                visitBoolLiteral((EqBoolLiteralNode) node); break;
            case "EqBoolPar":
                visitEqBoolPar((EqBoolParNode) node); break;
            case "EqDbl":
                visitEqDbl((EqDblNode) node); break;
            case "EqInt":
                visitEqInt((EqIntNode) node); break;
            case "EqMul":
                visitEqMul((EqMulNode) node); break;
            case "EqPar":
                visitEqPar((EqParNode) node); break;
            case "EqStr":
                visitEqStr((EqStrNode) node); break;
            case "EqVar":
                visitEqVar((EqVarNode) node); break;
            case "IfFragment":
                visitIfFragment((IfFragmentNode) node); break;
            case "IfStatement":
                visitIfStatement((IfStatementNode) node); break;
            case "ElifFragment":
                visitElifFragment((ElifFragmentNode) node); break;
            case "ElifStatement":
                visitElifStatement((ElifStatementNode) node); break;
            case "ElseFragment":
                visitElseFragment((ElseFragmentNode) node); break;
            case "ElseStatement":
                visitElseStatement((ElseStatementNode) node); break;
            case "EndIfFragment":
                visitEndIfFragment((EndIfFragmentNode) node); break;
            case "EndWhileFragment":
                visitEndWhileFragment((EndWhileFragmentNode) node); break;
            case "JinjaExpression":
                visitJinjaExpression((JinjaExpressionNode) node); break;
            case "StmtAssign":
                visitStmtAssign((StmtAssignNode) node); break;
            case "StmtExpr":
                visitStmtExpr((StmtExprNode) node); break;
            case "StmtIf":
                visitStmtIf((StmtIfNode) node); break;
            case "StmtWhile":
                visitStmtWhile((StmtWhileNode) node); break;
            case "WhileFragment":
                visitWhileFragment((WhileFragmentNode) node); break;
            case "WhileStatement":
                visitWhileStatement((WhileStatementNode) node); break;
            case "RelationExpr":
                visitRelationExpr((RelationExprNode) node); break;
            case "EqAdd":
                visitEqAdd((EqAddNode) node); break;
            case "CodeBlock":
                visitCodeBlock((CodeBlockNode) node);
                break;


            default:
                System.out.println("Unknown node type: " + node.getNodeName());
        }
    }


    public void visitAssignment(AssignmentNode node) {
        System.out.println("Visiting Assignment: " + node.variable);

        String kind = "variable";
        String declaredType = "int";

        symbols.insert(
                node.variable,
                kind,
                declaredType,
                node.getLineNumber(),
                node.getLineNumber()
        );

        visit(node.value);
    }


    public void visitBoolEq(BoolEqNode node) {
        System.out.println("Visiting BoolEq (" + node.operator + ")");
        visit(node.left);
        visit(node.right);
    }

    public void visitBoolLiteral(EqBoolLiteralNode node) {
        System.out.println("Visiting BoolLiteral: " + node.value);
    }

    public void visitEqBoolPar(EqBoolParNode node) {
        System.out.println("Visiting EqBoolPar");
        visit(node.inside);
    }

    public void visitEqDbl(EqDblNode node) {
        System.out.println("Visiting EqDbl: " + node.value);
    }

    public void visitEqInt(EqIntNode node) {
        System.out.println("Visiting EqInt: " + node.value);
    }

    public void visitEqMul(EqMulNode node) {
        System.out.println("Visiting EqMul (" + node.operator + ")");
        visit(node.left);
        visit(node.right);
    }

    public void visitEqPar(EqParNode node) {
        System.out.println("Visiting EqPar");
        visit(node.inside);
    }

    public void visitEqStr(EqStrNode node) {
        System.out.println("Visiting EqStr: " + node.value);
    }

    public void visitEqVar(EqVarNode node) {
        System.out.println("Visiting EqVar: " + node.name);

        Symbol s = symbols.lookup(node.name);
        if (s == null) {
            System.out.println(
                    "Error: Variable '" + node.name + "' not defined (line " + node.getLineNumber() + ")"
            );
        }
    }

    public void visitIfFragment(IfFragmentNode node) {
        System.out.println("Visiting IfFragment");
        visit(node.condition);
    }

    public void visitIfStatement(IfStatementNode node) {
        System.out.println("Visiting IfStatement");
        visit(node.ifFragment);
        symbols.enterScope("if");

        visit(node.code);
        if (node.elifChain != null) visit(node.elifChain);
        if (node.elseStmt != null) visit(node.elseStmt);
        symbols.exitScope();
        visit(node.endifFragment);
    }

    public void visitElifFragment(ElifFragmentNode node) {
        System.out.println("Visiting ElifFragment");
        visit(node.condition);
    }

    public void visitElifStatement(ElifStatementNode node) {
        System.out.println("Visiting ElifStatement");
        visit(node.fragment);
        visit(node.code);
        if (node.nextElif != null) visit(node.nextElif);
        if (node.elseStmt != null) visit(node.elseStmt);
    }

    public void visitElseFragment(ElseFragmentNode node) {
        System.out.println("Visiting ElseFragment");
    }

    public void visitElseStatement(ElseStatementNode node) {
        System.out.println("Visiting ElseStatement");
        visit(node.fragment);
        visit(node.code);
    }

    public void visitEndIfFragment(EndIfFragmentNode node) {
        System.out.println("Visiting EndIfFragment");
    }

    public void visitEndWhileFragment(EndWhileFragmentNode node) {
        System.out.println("Visiting EndWhileFragment");
    }

    public void visitJinjaExpression(JinjaExpressionNode node) {
        System.out.println("Visiting JinjaExpression");
        visit(node.inner);
    }

    public void visitStmtAssign(StmtAssignNode node) {
        System.out.println("Visiting StmtAssign");
        visit(node.assign);
    }

    public void visitStmtExpr(StmtExprNode node) {
        System.out.println("Visiting StmtExpr");
        visit(node.expr);
    }

    public void visitStmtIf(StmtIfNode node) {
        System.out.println("Visiting StmtIf");
        visit(node.ifStmt);
    }

    public void visitStmtWhile(StmtWhileNode node) {
        System.out.println("Visiting StmtWhile");
        visit(node.whileStmt);
    }

    public void visitWhileFragment(WhileFragmentNode node) {
        System.out.println("Visiting WhileFragment");
        visit(node.condition);
    }

    public void visitWhileStatement(WhileStatementNode node) {
        System.out.println("Visiting WhileStatement");
        symbols.enterScope("while");

        visit(node.whileFragment);
        for (ASTnode stmt : node.body) {
            visit(stmt);
        }
        symbols.exitScope();

        visit(node.endWhile);
    }

    public void visitRelationExpr(RelationExprNode node) {
        System.out.println("Visiting RelationExpr (" + node.operator + ")");
        visit(node.left);
        visit(node.right);
    }

    public void visitEqAdd(EqAddNode node) {
        System.out.println("Visiting EqAdd (" + node.operator + ")");
        visit(node.left);
        visit(node.right);
    }
    public void visitCodeBlock(CodeBlockNode node) {
        symbols.enterScope("block");

        if (node.html != null) {
            visit(node.html);
        }

        symbols.exitScope();
    }





    public void printSymbolTable() {
        symbols.printAll();
    }
}
