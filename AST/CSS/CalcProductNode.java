package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

public class CalcProductNode extends ASTnode {
    public List<CalcValueNode> values = new ArrayList<>();
    public List<String> operators = new ArrayList<>();

    public CalcProductNode(int line) {
        super("calcProduct", line);
    }

    public void addValue(CalcValueNode val, String operator) {
        values.add(val);
        if (operator != null) operators.add(operator);
        addChild(val);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        for (int i = 0; i < values.size(); i++) {
            if (i < operators.size()) System.out.println(" ".repeat(indent + 2) + "Operator: " + operators.get(i));
            values.get(i).print(indent + 2);
        }
    }
}
