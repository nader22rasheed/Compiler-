package AST.HTML;

public class UnquotedAttrNode extends AttributeValueNode {
    public String text; // ATTCHARS | HEXCHARS | DECCHARS

    public UnquotedAttrNode(String text, int line) {
        super("UnquotedAttr", line);
        this.text = text;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("UnquotedAttr: " + text);
    }
}
