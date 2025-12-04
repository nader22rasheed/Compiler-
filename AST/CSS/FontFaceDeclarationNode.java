package AST.CSS;

import AST.ASTnode;

public class FontFaceDeclarationNode extends ASTnode {
    public String property;
    public ASTnode value;
    public boolean known;

    public FontFaceDeclarationNode(int lineNumber, String property, ASTnode value, boolean known) {
        super(known ? "knownFontFaceDeclaration" : "unknownFontFaceDeclaration", lineNumber);
        this.property = property;
        this.value = value;
        this.known = known;
        addChild(value);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": " + property);
        if (value != null) value.print(indent + 2);
    }
}
