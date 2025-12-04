package AST.CSS;

import AST.ASTnode;

// Function
public class FunctionNode extends ASTnode {
    public String name;
    public ASTnode arguments;

    public FunctionNode(int lineNumber, String name, ASTnode arguments) {
        super("funcRule", lineNumber);
        this.name = name;
        this.arguments = arguments;
        addChild(arguments);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": " + name);
        if (arguments != null) arguments.print(indent + 2);
    }
}
