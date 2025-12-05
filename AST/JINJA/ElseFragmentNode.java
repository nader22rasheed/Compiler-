package AST.JINJA;

import AST.ASTnode;

public class ElseFragmentNode extends ASTnode {
    public ElseFragmentNode(int line) {
        super("ElseFragment", line);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("ElseFragment");
    }
}
