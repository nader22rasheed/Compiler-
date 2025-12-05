package AST.HTML;

import AST.ASTnode;

// ====================== 8. htmlChardata ======================
public class HtmlTextNode extends ASTnode {
    public String text;

    public HtmlTextNode(String text, int line) {
        super("HtmlText", line);
        this.text = text;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Text: " + text.replace("\n", "\\n"));
    }
}
