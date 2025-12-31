import AST.ASTnode;
import AST.JINJA.*;
import Symbols.SymbolTableManager;
import Visitor.Jinja2ASTVisitor;

public class Main {
    public static void main(String[] args) {

        SymbolTableManager symbols = new SymbolTableManager();
        symbols.enterScope("global");

        // ===================
        // x = 1

        AssignmentNode assignX =
                new AssignmentNode("x", new EqIntNode(1, 1), 1);
        StmtAssignNode stmtX =
                new StmtAssignNode(assignX, 1);

        // =============//========
        // if x:
        //        y = 2
        EqVarNode condX = new EqVarNode("x", 2);
        IfFragmentNode ifFrag =
                new IfFragmentNode(condX, 2);

        AssignmentNode assignY =
                new AssignmentNode("y", new EqIntNode(2, 2), 2);
        StmtAssignNode stmtY =
                new StmtAssignNode(assignY, 2);

        CodeBlockNode ifBlock = new CodeBlockNode(2);
        ifBlock.addChild(stmtY);

        EndIfFragmentNode endIf =
                new EndIfFragmentNode(3);

        IfStatementNode ifStmt =
                new IfStatementNode(ifFrag, ifBlock, null, null, endIf, 2);

        // z = 3
        // ===============================
        AssignmentNode assignZ =
                new AssignmentNode("z", new EqIntNode(3, 3), 3);
        StmtAssignNode stmtZ =
                new StmtAssignNode(assignZ, 3);


        Jinja2ASTVisitor visitor =
                new Jinja2ASTVisitor(symbols);

        visitor.visit(stmtX);
        visitor.visit(ifStmt);
        visitor.visit(stmtZ);


        symbols.printAll();
    }
}
