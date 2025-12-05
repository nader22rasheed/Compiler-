package AST.HTML;

import AST.ASTnode;

// ====================== 4. htmlElement variants ======================
public abstract class HtmlElementNode extends ASTnode {
    public HtmlElementNode(String name, int line) {
        super(name, line);
    }
}
