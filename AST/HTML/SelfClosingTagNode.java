package AST.HTML;

import java.util.List;

public class SelfClosingTagNode extends HtmlElementNode {
    public String tagName;
    public List<HtmlAttributeNode> attributes;

    public SelfClosingTagNode(String tagName, List<HtmlAttributeNode> attrs, int line) {
        super("SelfClosingTag", line);
        this.tagName = tagName;
        this.attributes = attrs;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("SelfClosingTag: <" + tagName + "/>");
        for (HtmlAttributeNode a : attributes) a.print(indent + 1);
    }
}
