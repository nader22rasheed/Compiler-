import AST.ASTnode;
import AST.JINJA.*;
import Symbols.SymbolTableManager;
import Symbols.SymbolTableVisitor;
import java.io.PrintWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        SymbolTableManager symbols = new SymbolTableManager();
        symbols.enterScope("global");


        // x = 1
        AssignmentNode assignX = new AssignmentNode("x", new EqIntNode(1, 1), 1);
        StmtAssignNode stmtX = new StmtAssignNode(assignX, 1);

        // if x: y = 2
        EqVarNode condX = new EqVarNode("x", 2);
        IfFragmentNode ifFrag = new IfFragmentNode(condX, 2);

        AssignmentNode assignY = new AssignmentNode("y", new EqIntNode(2, 2), 2);
        StmtAssignNode stmtY = new StmtAssignNode(assignY, 2);

        CodeBlockNode ifBlock = new CodeBlockNode(2);
        ifBlock.addChild(stmtY);

        EndIfFragmentNode endIf = new EndIfFragmentNode(3);
        IfStatementNode ifStmt = new IfStatementNode(ifFrag, ifBlock, null, null, endIf, 2);

        // z = 3
        AssignmentNode assignZ = new AssignmentNode("z", new EqIntNode(3, 3), 3);
        StmtAssignNode stmtZ = new StmtAssignNode(assignZ, 3);

        CodeBlockNode root = new CodeBlockNode(0);
        root.addChild(stmtX);
        root.addChild(ifStmt);
        root.addChild(stmtZ);

        System.out.println("===== AST TREE =====");
        root.print(0);

        try {
            root.saveToFile("ast.txt");
            System.out.println("AST saved to ast.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SymbolTableVisitor visitor = new SymbolTableVisitor(symbols);
        visitor.visit(root);

        System.out.println("\n? FINAL SYMBOL TABLE:");
        symbols.printAll();
    }
}
