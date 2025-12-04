package AST.CSS;

import AST.ASTnode;

// Declaration
 class DeclarationNode extends ASTnode {
    public String property;
    public ExprNode value;
    public boolean important;

    public DeclarationNode(int line, String property, ExprNode value, boolean important) {
        super("declaration", line);
        this.property = property;
        this.value = value;
        this.important = important;
        if(value != null) addChild(value);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + " Property: " + property + (important ? " !important" : ""));
        if(value != null) value.print(indent + 2);
    }
}