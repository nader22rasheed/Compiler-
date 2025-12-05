package AST.HTML;

public class AttrNoValueNode extends HtmlAttributeNode {
    public AttrNoValueNode(String name, int line) {
        super(name, line);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Attr (boolean): " + name);
    }
}
