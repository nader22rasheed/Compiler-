package AST.CSS;

import AST.ASTnode;

// Calc
public class CalcNode extends ASTnode {
    public CalcSumNode sum;

    public CalcNode(int lineNumber, CalcSumNode sum) {
        super("calcRule", lineNumber);
        this.sum = sum;
        addChild(sum);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        if(sum != null) sum.print(indent + 2);
    }
}
