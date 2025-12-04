package AST.CSS;

import AST.ASTnode;

public class CalcValueNode extends ASTnode {
    private String value;
    private CalcSumNode innerSum;

    public CalcValueNode(int line, String value) {
        super("calcValue", line);
        this.value = value;
    }

    public CalcValueNode(int line, CalcSumNode innerSum) {
        super("calcValue", line);
        this.innerSum = innerSum;
        addChild(innerSum);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + (value != null ? ": " + value : ""));
        if (innerSum != null) innerSum.print(indent + 2);
    }
}
