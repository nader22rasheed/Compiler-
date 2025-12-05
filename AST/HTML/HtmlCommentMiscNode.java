package AST.HTML;

public class HtmlCommentMiscNode extends HtmlMiscNode {
    public String comment;

    public HtmlCommentMiscNode(String comment, int line) {
        super("HtmlCommentMisc", line);
        this.comment = comment;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Comment: <!-- ... -->");
    }
}
