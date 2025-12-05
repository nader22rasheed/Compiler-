package AST.HTML;

import AST.ASTnode;

import java.util.List;

// ====================== 3. htmlElements ======================
public class HtmlElementsNode extends ASTnode {
    public List<HtmlMiscNode> leadingMisc;
    public HtmlElementNode mainElement;
    public List<HtmlMiscNode> trailingMisc;

    public HtmlElementsNode(List<HtmlMiscNode> leading, HtmlElementNode main,
                            List<HtmlMiscNode> trailing, int line) {
        super("HtmlElements", line);
        this.leadingMisc = leading;
        this.mainElement = main;
        this.trailingMisc = trailing;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("HtmlElements");
        for (HtmlMiscNode m : leadingMisc) m.print(indent + 1);
        mainElement.print(indent + 1);
        for (HtmlMiscNode m : trailingMisc) m.print(indent + 1);
    }
}
