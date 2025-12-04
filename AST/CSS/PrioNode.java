package AST.CSS;

import AST.ASTnode;

// Prio (important)
public class PrioNode extends ASTnode {
    public PrioNode(int lineNumber) {
        super("prioRule", lineNumber);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
    }
}
