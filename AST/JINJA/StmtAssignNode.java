package AST.JINJA;

import AST.ASTnode;

public class StmtAssignNode extends ASTnode {
    public AssignmentNode assign;

    public StmtAssignNode(AssignmentNode assign, int line) {
        super("StmtAssign", line);
        this.assign = assign;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("StmtAssign");
        if (assign != null) assign.print(indent + 1);
    }
}
