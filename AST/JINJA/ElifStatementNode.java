package AST.JINJA;

import AST.ASTnode;

// Elif متكرر (recursive)
public class ElifStatementNode extends ASTnode {
    public ElifFragmentNode fragment;
    public CodeBlockNode code;
    public ElifStatementNode nextElif;  // قد يكون هناك elif آخر
    public ElseStatementNode elseStmt;  // أو else

    public ElifStatementNode(ElifFragmentNode fragment, CodeBlockNode code,
                             ElifStatementNode nextElif, ElseStatementNode elseStmt, int line) {
        super("ElifStatement", line);
        this.fragment = fragment;
        this.code = code;
        this.nextElif = nextElif;
        this.elseStmt = elseStmt;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("ElifStatement");
        fragment.print(indent + 1);
        code.print(indent + 1);
        if (nextElif != null) nextElif.print(indent + 1);
        if (elseStmt != null) elseStmt.print(indent + 1);
    }
}
