package AST.JINJA;

import AST.ASTnode;

public class StmtWhileNode extends ASTnode {
    public WhileStatementNode whileStmt;

    public StmtWhileNode(WhileStatementNode whileStmt, int line) {
        super("StmtWhile", line);
        this.whileStmt = whileStmt;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("StmtWhile");
        whileStmt.print(indent + 1);
    }
}
