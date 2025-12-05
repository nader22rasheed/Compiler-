package AST.JINJA;

public class EqParNode extends JinjaExpressionInnerNode {
    public JinjaExpressionInnerNode inside;

    public EqParNode(JinjaExpressionInnerNode inside, int line) {
        super("EqPar", line);
        this.inside = inside;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("EqPar");
        inside.print(indent + 1);
    }
}
