package AST.HTML;

import AST.ASTnode;

public class XmlDeclarationNode extends ASTnode {
    public String content; // <?xml version="1.0" encoding="UTF-8"?>

    public XmlDeclarationNode(String content, int line) {
        super("XmlDecl", line);
        this.content = content;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("XML Declaration: " + content);
    }
}
