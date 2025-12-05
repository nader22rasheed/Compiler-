package AST.HTML;

import AST.ASTnode;

import java.util.List;

// ====================== 5. htmlContent ======================
public class HtmlContentNode extends ASTnode {
    public List<ASTnode> children; // HtmlChardata, HtmlElement, CDATA, Comment, JinjaBlock, JinjaExpr

    public HtmlContentNode(List<ASTnode> children, int line) {
        super("HtmlContent", line);
        this.children = children;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("HtmlContent");
        for (ASTnode c : children) c.print(indent + 1);
    }
}
