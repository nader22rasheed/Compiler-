package AST.CSS;

import AST.ASTnode;

// Namespace
public class NamespaceNode extends ASTnode implements NeastedStatementNode {
    public String prefix, url;
    public boolean isGood;

    public NamespaceNode(int lineNumber ,String p, String u, boolean isGood) {
        super(isGood ? "goodNamespace" : "badNamespace", lineNumber);
        prefix=p; url=u;
        this.isGood = isGood;
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName +
                (prefix==null?" (default)":" "+prefix) + ": " + url);
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }
}
