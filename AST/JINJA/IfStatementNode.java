package AST.JINJA;

import AST.ASTnode;

public class IfStatementNode extends ASTnode {
    public IfFragmentNode ifFragment;
    public CodeBlockNode code;
    public ElifStatementNode elifChain;   // سلسلة elif (قد تكون null)
    public ElseStatementNode elseStmt;    // optional
    public EndIfFragmentNode endifFragment;

    public IfStatementNode(IfFragmentNode ifFragment, CodeBlockNode code,
                           ElifStatementNode elifChain, ElseStatementNode elseStmt,
                           EndIfFragmentNode endifFragment, int line) {
        super("IfStatement", line);
        this.ifFragment = ifFragment;
        this.code = code;
        this.elifChain = elifChain;
        this.elseStmt = elseStmt;
        this.endifFragment = endifFragment;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("IfStatement");
        ifFragment.print(indent + 1);
        code.print(indent + 1);
        if (elifChain != null) elifChain.print(indent + 1);
        if (elseStmt != null) elseStmt.print(indent + 1);
        endifFragment.print(indent + 1);
    }
}
