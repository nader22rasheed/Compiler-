package AST.JINJA;

import AST.ASTnode;

public class StmtExprNode extends ASTnode {
    public JinjaExpressionNode expr;

    public StmtExprNode(JinjaExpressionNode expr, int line) {
        super("StmtExpr", line);
        this.expr = expr;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("StmtExpr");
        if (expr != null) expr.print(indent + 1);
    }
}
