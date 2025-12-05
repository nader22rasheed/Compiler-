package AST.JINJA;

public class BoolEqNode extends BooleanExpressionNode {
    public JinjaExpressionInnerNode left, right;
    public String operator; // == !=

    public BoolEqNode(JinjaExpressionInnerNode left, String op, JinjaExpressionInnerNode right, int line) {
        super("BoolEq", line);
        this.left = left;
        this.operator = op;
        this.right = right;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("BoolEq (" + operator + ")");
        left.print(indent + 1);
        right.print(indent + 1);
    }
}
