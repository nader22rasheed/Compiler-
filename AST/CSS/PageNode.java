package AST.CSS;

import AST.ASTnode;

// Page
public class PageNode extends ASTnode implements NeastedStatementNode {
    public PseudoPageNode pseudo;
    public DeclarationListNode declarations;

    public PageNode(int lineNumber) {
        super("pageRule", lineNumber);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        if(pseudo != null) pseudo.print(indent + 2);
        if(declarations != null) declarations.print(indent + 2);
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }
}


