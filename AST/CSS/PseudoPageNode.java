package AST.CSS;

import AST.ASTnode;

public class PseudoPageNode extends ASTnode {
    public String name;

    public PseudoPageNode(int lineNumber, String name) {
        super("pseudoPage", lineNumber);
        this.name = name;
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": " + name);
    }
}
