package AST.HTML;

public class HtmlMiscWsNode extends HtmlMiscNode {
    public String ws;

    public HtmlMiscWsNode(String ws, int line) {
        super("HtmlMiscWs", line);
        this.ws = ws;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Misc Whitespace");
    }
}
