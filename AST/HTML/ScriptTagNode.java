package AST.HTML;

public class ScriptTagNode extends HtmlElementNode {
    public String body;

    public ScriptTagNode(String body, int line) {
        super("ScriptTag", line);
        this.body = body;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("ScriptTag <script>");
    }
}
