package AST.CSS;

import AST.ASTnode;

public abstract class SimpleSelectorNode extends ASTnode {
    protected SimpleSelectorNode(String name, int line) {
        super(name, line);
    }
}
