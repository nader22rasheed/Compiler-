package AST.HTML;

import AST.ASTnode;

// ====================== 7. attributeValue variants ======================
public abstract class AttributeValueNode extends ASTnode {
    public AttributeValueNode(String name, int line) {
        super(name, line);
    }
}
