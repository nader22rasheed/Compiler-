package AST.JINJA;

public class EqIntNode extends JinjaExpressionInnerNode {
    public int value;
    public EqIntNode(int value, int line) {
        super("EqInt", line);
        this.value = value;
    }
    @Override public void print(int indent) {
        printIndent(indent); System.out.println("EqInt: " + value);
    }
}
