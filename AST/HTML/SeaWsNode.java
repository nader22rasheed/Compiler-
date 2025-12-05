package AST.HTML;

import AST.ASTnode;

public class SeaWsNode extends ASTnode {
    public String text;

    public SeaWsNode(String text, int line) {
        super("SeaWs", line);
        this.text = text;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("SEA_WS");
    }
}
