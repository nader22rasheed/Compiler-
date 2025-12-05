package AST.JINJA;

import AST.ASTnode;

public class EndWhileFragmentNode extends ASTnode {
    public EndWhileFragmentNode(int line) {
        super("EndWhileFragment", line);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("EndWhileFragment");
    }
}
