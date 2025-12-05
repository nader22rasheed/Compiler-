package AST.HTML;

import AST.ASTnode;

// ====================== 6. htmlAttribute ======================
public abstract class HtmlAttributeNode extends ASTnode {
    public String name;

    public HtmlAttributeNode(String name, int line) {
        super("HtmlAttribute", line);
        this.name = name;
    }
}
