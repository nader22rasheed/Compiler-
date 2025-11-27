
lexer grammar HTMLCSSJinjaLexer;
@header{
package antlr;
}

channels {
    ERROR
}

HTML_COMMENT: '<!--' .*? '-->';

HTML_CONDITIONAL_COMMENT: '<![' .*? ']>';

XML: '<?xml' .*? '>';

CDATA: '<![CDATA[' .*? ']]>';

DTD: '<!' .*? '>';

SCRIPTLET: '<?' .*? '?>' | '<%' .*? '%>';

SEA_WS: (' ' | '\t' | '\r'? '\n')+;

SCRIPT_OPEN: '<script' .*? '>' -> pushMode(SCRIPT);

STYLE_OPEN: '<style' .*? '>' -> pushMode(STYLE);

TAG_OPEN: '<' -> pushMode(TAG);

HTML_TEXT: ( ~[<{] | '{' ~[{%#] )+ ;

JINJA_BLOCK_START: '{%' -> pushMode(JINJA);

JINJA_EXPR_START: '{{' -> pushMode(JINJA);

JINJA_COMMENT: '{#' .*? '#}' -> skip;

// tag declarations

mode TAG;

TAG_CLOSE: '>' -> popMode;

TAG_SLASH_CLOSE: '/>' -> popMode;

TAG_SLASH: '/';

TAG_EQUALS: '=' -> pushMode(ATTVALUE);

TAG_NAME: TAG_NameStartChar TAG_NameChar*;

TAG_WHITESPACE: [ \t\r\n] -> channel(HIDDEN);

fragment HEXDIGIT: [a-fA-F0-9];

fragment DIGIT: [0-9];

fragment TAG_NameChar:
    TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
;

fragment TAG_NameStartChar:
    [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
;

// <scripts>

mode SCRIPT;

SCRIPT_BODY: .*? '</script>' -> popMode;

SCRIPT_SHORT_BODY: .*? '</>' -> popMode;

// <styles>

mode STYLE;

CSS_STYLE_CLOSE: '</style>' -> popMode;

CSS_STYLE_SHORT_BODY: '</>' -> popMode;

CSS_OpenBracket : '[';

CSS_CloseBracket : ']';

CSS_OpenParen : '(';

CSS_CloseParen : ')';

CSS_OpenBrace : '{';

CSS_CloseBrace : '}';

CSS_SemiColon : ';';

CSS_Equal : '=';

CSS_Colon : ':';

CSS_Dot : '.';

CSS_Multiply : '*';

CSS_Divide : '/';

CSS_Pipe : '|';

CSS_Underscore : '_';

CSS_Comment: '/*' ~'*'* '*'+ ( ~[/*] ~'*'* '*'+)* '/';

CSS_Space: [ \t\r\n\f]+ ;

CSS_Cdo: '<!--';

CSS_Cdc: '-->';

CSS_Includes: '~=';

CSS_DashMatch: '|=';

CSS_Hash: '#' CSS_Name;

CSS_Import: CSS_At CSS_I CSS_M CSS_P CSS_O CSS_R CSS_T;

CSS_Page: CSS_At CSS_P CSS_A CSS_G CSS_E;

CSS_Media: CSS_At CSS_M CSS_E CSS_D CSS_I CSS_A;

CSS_Namespace: CSS_At CSS_N CSS_A CSS_M CSS_E CSS_S CSS_P CSS_A CSS_C CSS_E;

CSS_Charset: '@charset ' ;

CSS_Important: '!' (CSS_Space | CSS_Comment)* CSS_I CSS_M CSS_P CSS_O CSS_R CSS_T CSS_A CSS_N CSS_T;

CSS_Percentage: CSS_Number '%';

CSS_Url_: 'url(';

CSS_UnicodeRange:
    [u|U] '+?' '?'? '?'? '?'? '?'? '?'?
    | [u|U] '+' CSS_Hex '?'? '?'? '?'? '?'? '?'?
    | [u|U] '+' CSS_Hex CSS_Hex '?'? '?'? '?'? '?'?
    | [u|U] '+' CSS_Hex CSS_Hex CSS_Hex '?'? '?'? '?'?
    | [u|U] '+' CSS_Hex CSS_Hex CSS_Hex CSS_Hex '?'? '?'?
    | [u|U] '+' CSS_Hex CSS_Hex CSS_Hex CSS_Hex CSS_Hex '?'?
;

CSS_MediaOnly: CSS_O CSS_N CSS_L CSS_Y;

CSS_Not: CSS_N CSS_O CSS_T;

CSS_And: CSS_A CSS_N CSS_D;

CSS_Or: CSS_O CSS_R;

CSS_From: CSS_F CSS_R CSS_O CSS_M;

CSS_To: CSS_T CSS_O;

CSS_Number: [0-9]+ | [0-9]* '.' [0-9]+ ;

CSS_String_:
    '"' (~[\n\r\f\\"] | '\\' CSS_Newline | CSS_Nonascii | CSS_Escape)* '"'
    | '\'' ( ~[\n\r\f\\'] | '\\' CSS_Newline | CSS_Nonascii | CSS_Escape)* '\''
 ;

CSS_PrefixMatch: '^=';

CSS_SuffixMatch: '$=';

CSS_SubstringMatch: '*=';

CSS_FontFace: CSS_At CSS_F CSS_O CSS_N CSS_T CSS_DashChar CSS_F CSS_A CSS_C CSS_E;

CSS_Supports: CSS_At CSS_S CSS_U CSS_P CSS_P CSS_O CSS_R CSS_T CSS_S;

CSS_Keyframes: CSS_At ( '-' CSS_M CSS_O CSS_Z '-' | '-' CSS_W CSS_E CSS_B CSS_K CSS_I CSS_T '-' | '-' CSS_O '-')? CSS_K CSS_E CSS_Y CSS_F CSS_R CSS_A CSS_M CSS_E CSS_S;

CSS_Viewport: CSS_At CSS_V CSS_I CSS_E CSS_W CSS_P CSS_O CSS_R CSS_T;

CSS_CounterStyle: CSS_At CSS_C CSS_O CSS_U CSS_N CSS_T CSS_E CSS_R CSS_DashChar CSS_S CSS_T CSS_Y CSS_L CSS_E;

CSS_FontFeatureValues: CSS_At CSS_F CSS_O CSS_N CSS_T CSS_DashChar CSS_F CSS_E CSS_A CSS_T CSS_U CSS_R CSS_E CSS_DashChar CSS_V CSS_A CSS_L CSS_U CSS_E CSS_S;

CSS_DxImageTransform: 'progid:DXImageTransform.Microsoft.' CSS_Function_ ;

CSS_Variable: '--' CSS_Nmstart CSS_Nmchar*;

CSS_Ident: '-'? CSS_Nmstart CSS_Nmchar*;

CSS_Function_: CSS_Ident '(';

CSS_AtKeyword: CSS_At CSS_Ident;

CSS_Dimension: (CSS_Plus | CSS_Minus)? CSS_Number CSS_Ident;

CSS_Plus: '+';

CSS_Minus: '-';

CSS_Greater: '>';

CSS_Comma: ',';

CSS_Tilde: '~';

CSS_PseudoNot: ':' CSS_N CSS_O CSS_T '(';

CSS_UnexpectedCharacter: . -> channel(ERROR);

fragment CSS_At: '@';

fragment CSS_Hex: [0-9a-fA-F];

fragment CSS_NewlineOrSpace: '\r\n' | [ \t\r\n\f] |;

fragment CSS_Unicode: '\\' CSS_Hex CSS_Hex? CSS_Hex? CSS_Hex? CSS_Hex? CSS_Hex? CSS_NewlineOrSpace;

fragment CSS_Escape: CSS_Unicode | '\\' ~[\r\n\f0-9a-fA-F];

fragment CSS_Nmstart: [_a-zA-Z] | CSS_Nonascii | CSS_Escape;

fragment CSS_Nmchar: [_a-zA-Z0-9\-] | CSS_Nonascii | CSS_Escape;

fragment CSS_Name: CSS_Nmchar+ ;

fragment CSS_Nonascii: ~[-\u007f];

fragment CSS_Newline: '\n' | '\r\n' | '\r' | '\f';

fragment CSS_ZeroToFourZeros: '0'? '0'? '0'? '0'? ;

fragment CSS_DashChar: '-' | '\\' CSS_ZeroToFourZeros '2d' CSS_NewlineOrSpace;

fragment CSS_A: 'a' | 'A' | '\\' CSS_ZeroToFourZeros ('41' | '61') CSS_NewlineOrSpace;

fragment CSS_B: 'b' | 'B' | '\\' CSS_ZeroToFourZeros ('42' | '62') CSS_NewlineOrSpace;

fragment CSS_C: 'c' | 'C' | '\\' CSS_ZeroToFourZeros ('43' | '63') CSS_NewlineOrSpace;

fragment CSS_D: 'd' | 'D' | '\\' CSS_ZeroToFourZeros ('44' | '64') CSS_NewlineOrSpace;

fragment CSS_E: 'e' | 'E' | '\\' CSS_ZeroToFourZeros ('45' | '65') CSS_NewlineOrSpace;

fragment CSS_F: 'f' | 'F' | '\\' CSS_ZeroToFourZeros ('46' | '66') CSS_NewlineOrSpace;

fragment CSS_G: 'g' | 'G' | '\\' CSS_ZeroToFourZeros ('47' | '67') CSS_NewlineOrSpace | '\\g' | '\\G';

fragment CSS_H: 'h' | 'H' | '\\' CSS_ZeroToFourZeros ('48' | '68') CSS_NewlineOrSpace | '\\h' | '\\H';

fragment CSS_I: 'i' | 'I' | '\\' CSS_ZeroToFourZeros ('49' | '69') CSS_NewlineOrSpace | '\\i' | '\\I';

fragment CSS_K: 'k' | 'K' | '\\' CSS_ZeroToFourZeros ('4b' | '6b') CSS_NewlineOrSpace | '\\k' | '\\K';

fragment CSS_L: 'l' | 'L' | '\\' CSS_ZeroToFourZeros ('4c' | '6c') CSS_NewlineOrSpace | '\\l' | '\\L';

fragment CSS_M: 'm' | 'M' | '\\' CSS_ZeroToFourZeros ('4d' | '6d') CSS_NewlineOrSpace | '\\m' | '\\M';

fragment CSS_N: 'n' | 'N' | '\\' CSS_ZeroToFourZeros ('4e' | '6e') CSS_NewlineOrSpace | '\\n' | '\\N';

fragment CSS_O: 'o' | 'O' | '\\' CSS_ZeroToFourZeros ('4f' | '6f') CSS_NewlineOrSpace | '\\o' | '\\O';

fragment CSS_P: 'p' | 'P' | '\\' CSS_ZeroToFourZeros ('50' | '70') CSS_NewlineOrSpace | '\\p' | '\\P';

fragment CSS_Q: 'q' | 'Q' | '\\' CSS_ZeroToFourZeros ('51' | '71') CSS_NewlineOrSpace | '\\q' | '\\Q';

fragment CSS_R: 'r' | 'R' | '\\' CSS_ZeroToFourZeros ('52' | '72') CSS_NewlineOrSpace | '\\r' | '\\R';

fragment CSS_S: 's' | 'S' | '\\' CSS_ZeroToFourZeros ('53' | '73') CSS_NewlineOrSpace | '\\s' | '\\S';

fragment CSS_T: 't' | 'T' | '\\' CSS_ZeroToFourZeros ('54' | '74') CSS_NewlineOrSpace | '\\t' | '\\T';

fragment CSS_U: 'u' | 'U' | '\\' CSS_ZeroToFourZeros ('55' | '75') CSS_NewlineOrSpace | '\\u' | '\\U';

fragment CSS_V: 'v' | 'V' | '\\' CSS_ZeroToFourZeros ('56' | '76') CSS_NewlineOrSpace | '\\v' | '\\V';

fragment CSS_W: 'w' | 'W' | '\\' CSS_ZeroToFourZeros ('57' | '77') CSS_NewlineOrSpace | '\\w' | '\\W';

fragment CSS_X: 'x' | 'X' | '\\' CSS_ZeroToFourZeros ('58' | '78') CSS_NewlineOrSpace | '\\x' | '\\X';

fragment CSS_Y: 'y' | 'Y' | '\\' CSS_ZeroToFourZeros ('59' | '79') CSS_NewlineOrSpace | '\\y' | '\\Y';

fragment CSS_Z: 'z' | 'Z' | '\\' CSS_ZeroToFourZeros ('5a' | '7a') CSS_NewlineOrSpace | '\\z' | '\\Z';

mode ATTVALUE;

// an attribute value may have spaces b/t the '=' and the value

ATT_WS: ' '* -> channel(HIDDEN);

ATTCHARS: ATTCHAR+ ' '? -> popMode;

fragment ATTCHAR: '-' | '_' | '.' | '/' | '+' | ',' | '?' | '=' | ':' | ';' | '#' | [0-9a-zA-Z];

HEXCHARS: '#' [0-9a-fA-F]+ -> popMode;

DECCHARS: [0-9]+ '%'? -> popMode;

DOUBLE_QUOTE_START: '"' -> pushMode(DQUOTE_ATT);

SINGLE_QUOTE_START: '\'' -> pushMode(SQUOTE_ATT);

mode DQUOTE_ATT;

DQUOTE_TEXT: ( ~["{] | '{' ~[{%#] )+ ;

DQUOTE_JINJA_START: '{{' -> pushMode(JINJA);

DQUOTE_JINJA_BLOCK_START: '{%' -> pushMode(JINJA);

DOUBLE_QUOTE_END: '"' -> popMode;

mode SQUOTE_ATT;

SQUOTE_TEXT: ( ~['{] | '{' ~[{%#] )+ ;

SQUOTE_JINJA_START: '{{' -> pushMode(JINJA);

SQUOTE_JINJA_BLOCK_START: '{%' -> pushMode(JINJA);

SINGLE_QUOTE_END: '\'' -> popMode;

mode JINJA;

JINJA_WS: [ \t] -> skip;

JINJA_NEWLINE: [\r\n]+;

JINJA_ID: [a-z] [a-zA-Z0-9_]* ;

JINJA_INT: '-'? [0-9]+ ;

JINJA_DOUBLE: '-'? [0-9]+ '.' [0-9]+ | '-'? '.' [0-9]+ ;

JINJA_STRING : '\'' (JINJA_ESC|.)*? '\'' ;

fragment JINJA_ESC: '\\"'|'\\\\';

JINJA_TRUE : 'True' ;

JINJA_FALSE : 'False' ;

JINJA_BOOL : JINJA_TRUE | JINJA_FALSE ;

JINJA_ADD : '+' ;

JINJA_SUB : '-' ;

JINJA_MUL : '*' ;

JINJA_DIV : '/' ;

JINJA_NOT : 'NOT' ;

JINJA_EQ : '==' ;

JINJA_NEQ : '!=' ;

JINJA_GT : '>' ;

JINJA_LT : '<' ;

JINJA_GTEQ : '>=' ;

JINJA_LTEQ : '<=' ;

JINJA_LPAREN : '(' ;

JINJA_RPAREN : ')' ;

JINJA_IF : 'if' ;

JINJA_ELIF : 'elif' ;

JINJA_ELSE : 'else' ;

JINJA_ENDIF : 'endif' ;

JINJA_WHILE : 'while' ;

JINJA_ENDWHILE : 'endwhile' ;

JINJA_SET : 'set' ;

JINJA_BLOCK_END : '%}' -> popMode ;

JINJA_EXPR_END : '}}' -> popMode ;

JINJA_SYMBOLS: ( '_'  | '/' | ';' | '="' | '"' ) ;