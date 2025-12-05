package AST.JINJA;

public class EqBoolParNode extends BooleanExpressionNode {
    public BooleanExpressionNode inside;

    public EqBoolParNode(BooleanExpressionNode inside, int line) {
        super("EqBoolPar", line);
        this.inside = inside;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("EqBoolPar");
        inside.print(indent + 1);
    }
}
