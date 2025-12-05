package AST.JINJA;

import AST.ASTnode;

public class StmtIfNode extends ASTnode {
    public IfStatementNode ifStmt;

    public StmtIfNode(IfStatementNode ifStmt, int line) {
        super("StmtIf", line);
        this.ifStmt = ifStmt;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("StmtIf");
        ifStmt.print(indent + 1);
    }
}
