package AST.JINJA;

import AST.ASTnode;

public class ElseStatementNode extends ASTnode {
    public ElseFragmentNode fragment;
    public CodeBlockNode code;

    public ElseStatementNode(ElseFragmentNode fragment, CodeBlockNode code, int line) {
        super("ElseStatement", line);
        this.fragment = fragment;
        this.code = code;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("ElseStatement");
        fragment.print(indent + 1);
        code.print(indent + 1);
    }
}
