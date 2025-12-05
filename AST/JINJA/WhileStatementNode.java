package AST.JINJA;

import AST.ASTnode;

import java.util.List;

public class WhileStatementNode extends ASTnode {
    public WhileFragmentNode whileFragment;
    public List<ASTnode> body;  // قائمة بالـ statements داخل الـ while
    public EndWhileFragmentNode endWhile;

    public WhileStatementNode(WhileFragmentNode whileFragment,
                              List<ASTnode> body,
                              EndWhileFragmentNode endWhile, int line) {
        super("WhileStatement", line);
        this.whileFragment = whileFragment;
        this.body = body;
        this.endWhile = endWhile;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("WhileStatement");
        whileFragment.print(indent + 1);
        for (ASTnode stmt : body) {
            stmt.print(indent + 2);
        }
        endWhile.print(indent + 1);
    }
}
