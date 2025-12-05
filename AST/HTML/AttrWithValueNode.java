package AST.HTML;

public class AttrWithValueNode extends HtmlAttributeNode {
    public AttributeValueNode value;

    public AttrWithValueNode(String name, AttributeValueNode value, int line) {
        super(name, line);
        this.value = value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Attr: " + name + " = ...");
        if (value != null) value.print(indent + 1);
    }
}
