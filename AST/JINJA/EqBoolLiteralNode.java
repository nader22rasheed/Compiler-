package AST.JINJA;

public class EqBoolLiteralNode extends BooleanExpressionNode {
    public boolean value;

    public EqBoolLiteralNode(boolean value, int line) {
        super("EqBool", line);
        this.value = value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("EqBool: " + value);
    }
}
