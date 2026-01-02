package Symbols;

import java.util.*;

public class SymbolTableManager {
    private Stack<Map<String, Symbol>> scopes = new Stack<>();
    private Stack<String> scopeNames = new Stack<>();

    public void enterScope(String name) {
        scopes.push(new LinkedHashMap<>());
        scopeNames.push(name);
    }

    public void exitScope() {
        scopes.pop();
        scopeNames.pop();
    }

    public void insert(String name, String kind, String type, int line, int declOrder) {
        scopes.peek().put(name, new Symbol(name, kind, type, line, declOrder));
    }

    public Symbol lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(name)) return scopes.get(i).get(name);
        }
        return null;
    }

    public void printAll() {
        System.out.println("\n? FINAL SYMBOL TABLE:");
        for (int i = scopes.size() - 1; i >= 0; i--) {
            String scopeName = scopeNames.get(i);
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("| SCOPE: " + scopeName);
            System.out.println("------------------------------------------------------------------------------------");
            System.out.printf("| %-30s | %-20s | %-15s | %-5s |\n", "Name", "Kind", "DeclaredType", "Line");
            System.out.println("------------------------------------------------------------------------------------");
            for (Symbol s : scopes.get(i).values()) {
                System.out.printf("| %-30s | %-20s | %-15s | %-5d |\n",
                        s.getName(), s.getKind(), s.getType(), s.getLine());
            }
        }
    }
}
