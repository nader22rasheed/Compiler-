package AST.HTML;

import java.util.List;

public class NormalTagNode extends HtmlElementNode {
    public String tagName;
    public List<HtmlAttributeNode> attributes;
    public HtmlContentNode content;  // قد يكون null إذا فارغ

    public NormalTagNode(String tagName, List<HtmlAttributeNode> attrs,
                         HtmlContentNode content, int line) {
        super("NormalTag", line);
        this.tagName = tagName;
        this.attributes = attrs;
        this.content = content;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("NormalTag: <" + tagName + ">");
        for (HtmlAttributeNode a : attributes) a.print(indent + 1);
        if (content != null) content.print(indent + 1);
    }
}
