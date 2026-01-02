lexer grammar FlaskLexer;

@header {
package antlr;
}

// Tokens for indentation
tokens { INDENT, DEDENT }

// Keywords
AND        : 'and';
AS         : 'as';
ASSERT     : 'assert';
ASYNC      : 'async';
AWAIT      : 'await';
BREAK      : 'break';
CLASS      : 'class';
CONTINUE   : 'continue';
DEF        : 'def';
DEL        : 'del';
ELIF       : 'elif';
ELSE       : 'else';
EXCEPT     : 'except';
FALSE      : 'False';
FINALLY    : 'finally';
FOR        : 'for';
FROM       : 'from';
GLOBAL     : 'global';
IF         : 'if';
IMPORT     : 'import';
IN         : 'in';
IS         : 'is';
LAMBDA     : 'lambda';
MATCH      : 'match';
NONE       : 'None';
NONLOCAL   : 'nonlocal';
NOT        : 'not';
OR         : 'or';
PASS       : 'pass';
RAISE      : 'raise';
RETURN     : 'return';
TRUE       : 'True';
TRY        : 'try';
UNDERSCORE : '_';
WHILE      : 'while';
WITH       : 'with';
YIELD      : 'yield';

// Identifiers
NAME : ID_START ID_CONTINUE*;

// Numbers
NUMBER      : INTEGER | FLOAT_NUMBER | IMAG_NUMBER;
INTEGER     : DECIMAL_INTEGER | OCT_INTEGER | HEX_INTEGER | BIN_INTEGER;
DECIMAL_INTEGER : NON_ZERO_DIGIT DIGIT* | '0'+;
OCT_INTEGER     : '0' [oO] OCT_DIGIT+;
HEX_INTEGER     : '0' [xX] HEX_DIGIT+;
BIN_INTEGER     : '0' [bB] BIN_DIGIT+;
FLOAT_NUMBER    : POINT_FLOAT | EXPONENT_FLOAT;
IMAG_NUMBER     : (FLOAT_NUMBER | INT_PART) [jJ];

// Operators & delimiters
ELLIPSIS   : '...';
POWER      : '**';
IDIV       : '//';
LESS_THAN : '<';
GREATER_THAN : '>';
LT_EQ : '<=';
GT_EQ : '>=';
EQUALS : '==';
NOT_EQ_1 : '!=';
NOT_EQ_2 : '<>';
ADD_ASSIGN : '+=' ;
SUB_ASSIGN : '-=' ;
MULT_ASSIGN : '*=' ;
AT_ASSIGN : '@=' ;
DIV_ASSIGN : '/=' ;
MOD_ASSIGN : '%=' ;
AND_ASSIGN : '&=' ;
OR_ASSIGN : '|=' ;
XOR_ASSIGN : '^=' ;
LEFT_SHIFT_ASSIGN : '<<=' ;
RIGHT_SHIFT_ASSIGN : '>>=' ;
POWER_ASSIGN : '**=' ;
IDIV_ASSIGN : '//=' ;

DOT        : '.';
STAR       : '*';
ASSIGN     : '=';
OPEN_PAREN : '(';
CLOSE_PAREN: ')';
OPEN_BRACK : '[';
CLOSE_BRACK: ']';
OPEN_BRACE : '{';
CLOSE_BRACE: '}';
COMMA      : ',';
COLON      : ':';
SEMI_COLON : ';';
ADD        : '+';
MINUS      : '-';
DIV        : '/';
MOD        : '%';
AT         : '@';
ARROW      : '->';

// Newlines with INDENT/DEDENT
NEWLINE
    : ('\r'? '\n' | '\r' | '\f') {skip();} // لاحقاً سنضيف logic للمسافات
    ;

// Skip spaces and comments
SKIP_
    : (SPACES | COMMENT | LINE_JOINING) -> skip
    ;

UNKNOWN_CHAR : .;

// Fragments
fragment SPACES : [ \t]+;
fragment COMMENT : '#' ~[\r\n\f]*;
fragment LINE_JOINING : '\\' SPACES? ('\r'? '\n' | '\r' | '\f');

fragment NON_ZERO_DIGIT : [1-9];
fragment DIGIT : [0-9];
fragment OCT_DIGIT : [0-7];
fragment HEX_DIGIT : [0-9a-fA-F];
fragment BIN_DIGIT : [01];

fragment POINT_FLOAT : INT_PART? FRACTION | INT_PART '.' ;
fragment EXPONENT_FLOAT : (INT_PART | POINT_FLOAT) EXPONENT;
fragment INT_PART : DIGIT+;
fragment FRACTION : '.' DIGIT+;
fragment EXPONENT : [eE] [+-]? DIGIT+;

// Strings & bytes
fragment STRING_LITERAL
    : ([rR]|[uU]|[fF]|([fF][rR])|([rR][fF]))? (SHORT_STRING | LONG_STRING)
    ;

fragment BYTES_LITERAL
    : ([bB]|([bB][rR])|([rR][bB])) (SHORT_BYTES | LONG_BYTES)
    ;

fragment SHORT_STRING
    : '\'' (STRING_ESCAPE_SEQ | ~[\\\r\n\f'])* '\''
    | '"'  (STRING_ESCAPE_SEQ | ~[\\\r\n\f"])* '"'
    ;


fragment LONG_STRING
    : '\'\'\'' (LONG_STRING_CHAR | STRING_ESCAPE_SEQ)* '\'\'\''
    | '"""' (LONG_STRING_CHAR | STRING_ESCAPE_SEQ)* '"""'
    ;

fragment LONG_STRING_CHAR : ~['\\];

fragment STRING_ESCAPE_SEQ : '\\' . | '\\' NEWLINE;

// Identifier fragments
fragment ID_START : '_' | [A-Za-z];
fragment ID_CONTINUE : ID_START | [0-9];

// Bytes literals
fragment SHORT_BYTES
    : '\'' (BYTES_ESCAPE_SEQ | ~[\\\r\n\f'])* '\''
    | '"'  (BYTES_ESCAPE_SEQ | ~[\\\r\n\f"])* '"'
    ;

fragment LONG_BYTES
    : '\'\'\'' (LONG_BYTES_CHAR | BYTES_ESCAPE_SEQ)* '\'\'\''
    | '"""' (LONG_BYTES_CHAR | BYTES_ESCAPE_SEQ)* '"""'
    ;

fragment LONG_BYTES_CHAR : ~['\\];
fragment BYTES_ESCAPE_SEQ : '\\' . | '\\' NEWLINE;




