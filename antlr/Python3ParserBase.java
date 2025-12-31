package antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;

public class Python3ParserBase extends Parser {
    public Python3ParserBase(TokenStream input) { super(input); }

    @Override
    public String[] getTokenNames() {
        return new String[0];
    }

    @Override
    public String[] getRuleNames() {
        return new String[0];
    }

    @Override
    public String getGrammarFileName() {
        return "";
    }

    @Override
    public ATN getATN() {
        return null;
    }
    // مؤقتًا لتجنب الـ errors
    public boolean CannotBePlusMinus() {
        return true;  // أو false حسب الحاجة
    }

    public boolean CannotBeDotLpEq() {
        return true;  // أو false حسب الحاجة
    }
}
