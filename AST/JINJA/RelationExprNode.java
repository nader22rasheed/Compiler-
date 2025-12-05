package AST.JINJA;

public class RelationExprNode extends BooleanExpressionNode {
    public JinjaExpressionInnerNode left, right;
    public String operator; // > >= < <=

    public RelationExprNode(JinjaExpressionInnerNode left, String op, JinjaExpressionInnerNode right, int line) {
        super("RelationExpr", line);
        this.left = left;
        this.operator = op;
        this.right = right;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("RelationExpr (" + operator + ")");
        left.print(indent + 1);
        right.print(indent + 1);
    }
}
