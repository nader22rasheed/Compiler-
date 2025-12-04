package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

public class CalcSumNode extends ASTnode {
    public List<CalcProductNode> products = new ArrayList<>();
    public List<String> operators = new ArrayList<>();

    public CalcSumNode(int line) {
        super("calcSum", line);
    }

    public void addProduct(CalcProductNode prod, String operator) {
        products.add(prod);
        if (operator != null) operators.add(operator);
        addChild(prod);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        for (int i = 0; i < products.size(); i++) {
            if (i < operators.size()) System.out.println(" ".repeat(indent + 2) + "Operator: " + operators.get(i));
            products.get(i).print(indent + 2);
        }
    }
}
