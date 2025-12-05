package AST.JINJA;

public class EqStrNode extends JinjaExpressionInnerNode {
    public String value;

    public EqStrNode(String value, int line) {
        super("EqStr", line);
        this.value = value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("EqStr: \"" + value + "\"");
    }
}
