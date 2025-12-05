package AST.HTML;

import AST.ASTnode;

public class HtmlWsNode extends ASTnode {
    public String ws;

    public HtmlWsNode(String ws, int line) {
        super("HtmlWs", line);
        this.ws = ws;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Whitespace");
    }
}
