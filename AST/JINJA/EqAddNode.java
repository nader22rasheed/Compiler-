package AST.JINJA;

public class EqAddNode extends JinjaExpressionInnerNode {
    public JinjaExpressionInnerNode left, right;
    public String operator; // + or -

    public EqAddNode(JinjaExpressionInnerNode left, String op, JinjaExpressionInnerNode right, int line) {
        super("EqAdd", line);
        this.left = left;
        this.operator = op;
        this.right = right;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("EqAdd (" + operator + ")");
        left.print(indent + 1);
        right.print(indent + 1);
    }
}
