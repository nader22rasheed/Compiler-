package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

// Expr
public class ExprNode extends ASTnode {
    public List<TermNode> terms = new ArrayList<>();
    public List<OperatorNode> operators = new ArrayList<>();

    public ExprNode(int lineNumber) {
        super("exprRule", lineNumber);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        for(int i=0; i<terms.size(); i++) {
            terms.get(i).print(indent + 2);
            if(i < operators.size()) operators.get(i).print(indent + 2);
        }
    }
}

