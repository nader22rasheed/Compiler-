package Symbols;

import java.util.*;

public class Scope {

    private String name;
    private Map<String, Symbol> symbols = new LinkedHashMap<>();
    private Scope parent;
    private List<Scope> children = new ArrayList<>();

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
    }

    public Scope createChild(String name) {
        Scope child = new Scope(name, this);
        children.add(child);
        return child;
    }

    public void insert(Symbol s) {
        symbols.put(s.getName(), s);
    }

    public Symbol lookup(String name) {
        if (symbols.containsKey(name))
            return symbols.get(name);
        if (parent != null)
            return parent.lookup(name);
        return null;
    }

    public void print() {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("| SCOPE: " + name);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("| Name | Kind | DeclaredType | Line |");
        System.out.println("------------------------------------------------------------------------------------");
        for (Symbol s : symbols.values()) {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------------------------------------");
        for (Scope child : children) {
            child.print();
        }
    }
}
