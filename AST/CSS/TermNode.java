package AST.CSS;

import AST.ASTnode;

// Term
public class TermNode extends ASTnode {
    public String value;
    public boolean known;

    public TermNode(int lineNumber, String value, boolean known) {
        super(known ? "knownTerm" : "unknownTerm", lineNumber);
        this.value = value;
        this.known = known;
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": " + value);
    }
}
