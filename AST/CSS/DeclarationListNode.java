package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

public class DeclarationListNode extends ASTnode {
    public List<DeclarationNode> declarations = new ArrayList<>();

    public DeclarationListNode(int line) {
        super("declarationList", line);
    }

    public void addDeclaration(DeclarationNode decl) {
        declarations.add(decl);
        addChild(decl);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        for (DeclarationNode decl : declarations) {
            decl.print(indent + 2);
        }
    }
}
