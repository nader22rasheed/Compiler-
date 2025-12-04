package AST.CSS;

import AST.ASTnode;

// Unused
public class UnusedNode extends ASTnode {
    public ASTnode item;

    public UnusedNode(int lineNumber, ASTnode item) {
        super("unusedNode", lineNumber);
        this.item = item;
        addChild(item);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        if (item != null) item.print(indent + 2);
    }
}
