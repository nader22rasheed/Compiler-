package Symbols;

public class Symbol {
    private String name, kind, type;
    private int line, declOrder;

    public Symbol(String name, String kind, String type, int line, int declOrder) {
        this.name = name;
        this.kind = kind;
        this.type = type;
        this.line = line;
        this.declOrder = declOrder;
    }

    public String getName() { return name; }
    public String getKind() { return kind; }
    public String getType() { return type; }
    public int getLine() { return line; }
}
