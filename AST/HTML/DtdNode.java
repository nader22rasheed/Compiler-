package AST.HTML;

import AST.ASTnode;

public class DtdNode extends ASTnode {
    public String content; // <!DOCTYPE html>

    public DtdNode(String content, int line) {
        super("DTD", line);
        this.content = content;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("DTD: " + content);
    }
}
