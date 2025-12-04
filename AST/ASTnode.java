package AST;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTnode {
    protected String nodeName;  // اسم العقدة (مثل "FunctionDef")
    protected int lineNumber;   // رقم السطر من الكود الأصلي
    protected List<ASTnode> children = new ArrayList<>();  // قائمة الأبناء (مثل parameters أو body)

    public ASTnode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }

    public void addChild(ASTnode child) {
        if (child != null) {
            children.add(child);
        }
    }

    // دالة طباعة polymorphic (تُطبق في كل فئة فرعية)
    public abstract void print(int indent);

    @Override
    public String toString() {
        return nodeName + " (Line: " + lineNumber + ")";
    }
}