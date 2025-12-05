package AST.JINJA;

public class EqMulNode extends JinjaExpressionInnerNode {
    public JinjaExpressionInnerNode left, right;
    public String operator; // * or /

    public EqMulNode(JinjaExpressionInnerNode left, String op, JinjaExpressionInnerNode right, int line) {
        super("EqMul", line);
        this.left = left;
        this.operator = op;
        this.right = right;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("EqMul (" + operator + ")");
        left.print(indent + 1);
        right.print(indent + 1);
    }
}
