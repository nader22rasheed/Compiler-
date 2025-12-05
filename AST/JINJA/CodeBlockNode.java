package AST.JINJA;

import AST.ASTnode;
import AST.HTML.HtmlContentNode;

public class CodeBlockNode extends ASTnode {
    public HtmlContentNode html; // محتوى HTML عادي (أو قائمة لاحقًا)

    public CodeBlockNode(HtmlContentNode html, int line) {
        super("CodeBlock", line);
        this.html = html;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("CodeBlock");
        if (html != null) html.print(indent + 1);
    }
}
