package AST.JINJA;

import AST.ASTnode;

public class EndIfFragmentNode extends ASTnode {
    public EndIfFragmentNode(int line) {
        super("EndIfFragment", line);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("EndIfFragment");
    }
}
