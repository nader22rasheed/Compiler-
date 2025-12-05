package AST.JINJA;

import AST.ASTnode;

public class AssignmentNode extends ASTnode {
    public String variable;
    public JinjaExpressionInnerNode value;

    public AssignmentNode(String variable, JinjaExpressionInnerNode value, int line) {
        super("Assignment", line);
        this.variable = variable;
        this.value = value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Assignment: " + variable);
        if (value != null) value.print(indent + 1);
    }
}
