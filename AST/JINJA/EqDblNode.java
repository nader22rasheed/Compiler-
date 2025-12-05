package AST.JINJA;

public class EqDblNode extends JinjaExpressionInnerNode {
    public double value;

    public EqDblNode(double value, int line) {
        super("EqDbl", line);
        this.value = value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("EqDbl: " + value);
    }
}
