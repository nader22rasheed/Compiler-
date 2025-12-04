package AST.CSS;

import AST.ASTnode;

public class PseudoClassSelectorNode extends SimpleSelectorNode {
    public String name;
    public ASTnode argument;

    public PseudoClassSelectorNode(int line, String n, ASTnode arg) {
        super("pseudoClass", line);
        name = n;
        argument = arg;
        if (arg != null) addChild(arg);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": :" + name);
        if (argument != null) argument.print(indent + 2);
    }
}
