package Symbols;

import java.util.LinkedHashMap;
import java.util.Map;

public class SymbolTable {

    private Map<String, Symbol> table = new LinkedHashMap<>();
    private String scopeName;

    public SymbolTable(String scopeName) {
        this.scopeName = scopeName;
    }

    public void insert(Symbol s) {
        table.put(s.getName(), s);
    }

    public Symbol lookup(String name) {
        return table.get(name);
    }

    public String getScopeName() {
        return scopeName;
    }

    public void print() {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("| SCOPE: %s%n", scopeName);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("| Name                           | Kind                 | DeclaredType   | Line  |");
        System.out.println("------------------------------------------------------------------------------------");
        for (Symbol s : table.values()) {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------------------------------------");
    }
}
