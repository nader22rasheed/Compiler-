package AST.HTML;
import AST.ASTnode;
import AST.CSS.StylesheetNode;

import java.util.List;

public class HtmlDocumentNode extends ASTnode {
    public List<ASTnode> prelude;
    public List<HtmlElementNode> elements;

    public HtmlDocumentNode(List<ASTnode> prelude, List<HtmlElementNode> elements, int line) {
        super("HtmlDocument", line);
        this.prelude = prelude;
        this.elements = elements;
    }

    @Override public void print(int indent) {
        printIndent(indent); System.out.println("HtmlDocument");
        for (ASTnode n : prelude) n.print(indent + 1);
        for (HtmlElementNode e : elements) e.print(indent + 1);
    }
}


