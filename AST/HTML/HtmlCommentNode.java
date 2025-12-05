package AST.HTML;

import AST.ASTnode;

// ====================== 10. htmlComment ======================
public class HtmlCommentNode extends ASTnode {
    public String content;
    public boolean conditional; // true إذا كان <![if ...]>

    public HtmlCommentNode(String content, boolean conditional, int line) {
        super("HtmlComment", line);
        this.content = content;
        this.conditional = conditional;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(conditional ? "Conditional Comment" : "Normal Comment");
    }
}
