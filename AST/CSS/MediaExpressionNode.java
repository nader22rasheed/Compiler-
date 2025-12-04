package AST.CSS;

import AST.ASTnode;

public class MediaExpressionNode extends ASTnode {
    public String feature;
    public String expr;

    public MediaExpressionNode(int line, String feature, String expr) {
        super("mediaExpression", line);
        this.feature = feature;
        this.expr = expr;
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + " Feature: " + feature + " Expr: " + expr);
    }
}
