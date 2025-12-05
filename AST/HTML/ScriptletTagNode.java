package AST.HTML;

public class ScriptletTagNode extends HtmlElementNode {
    public String content;

    public ScriptletTagNode(String content, int line) {
        super("ScriptletTag", line);
        this.content = content;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("ScriptletTag: <% ... %>");
    }
}
