package AST.JINJA;

public class EqVarNode extends JinjaExpressionInnerNode {
    public String name;

    public EqVarNode(String name, int line) {
        super("EqVar", line);
        this.name = name;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("EqVar: " + name);
    }
}
