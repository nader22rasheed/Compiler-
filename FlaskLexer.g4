lexer grammar FlaskLexer;

@header{
package antlr;
}

tokens {
    INDENT,
    DEDENT
}

STRING: STRING_LITERAL | BYTES_LITERAL;

NUMBER: INTEGER | FLOAT_NUMBER | IMAG_NUMBER;

INTEGER: DECIMAL_INTEGER | OCT_INTEGER | HEX_INTEGER | BIN_INTEGER;

AND        : 'and';
AS         : 'as';
ASSERT     : 'assert';
ASYNC      : 'async';
AWAIT      : 'await';
BREAK      : 'break';
CASE       : 'case';
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


NAME: ID_START ID_CONTINUE*;

STRING_LITERAL: ( [rR] | [uU] | [fF] | ( [fF] [rR]) | ( [rR] [fF]))? ( SHORT_STRING | LONG_STRING);

BYTES_LITERAL: ( [bB] | ( [bB] [rR]) | ( [rR] [bB])) ( SHORT_BYTES | LONG_BYTES);

DECIMAL_INTEGER: NON_ZERO_DIGIT DIGIT* | '0'+;

OCT_INTEGER: '0' [oO] OCT_DIGIT+;

HEX_INTEGER: '0' [xX] HEX_DIGIT+;

BIN_INTEGER: '0' [bB] BIN_DIGIT+;

FLOAT_NUMBER: POINT_FLOAT | EXPONENT_FLOAT;

IMAG_NUMBER: ( FLOAT_NUMBER | INT_PART) [jJ];

DOT                : '.';
ELLIPSIS           : '...';
STAR               : '*';
OPEN_PAREN         : '(' ;
CLOSE_PAREN        : ')' ;
COMMA              : ',';
COLON              : ':';
SEMI_COLON         : ';';
POWER              : '**';
ASSIGN             : '=';
OPEN_BRACK         : '[' ;
CLOSE_BRACK        : ']' ;
OR_OP              : '|';
XOR                : '^';
AND_OP             : '&';
LEFT_SHIFT         : '<<';
RIGHT_SHIFT        : '>>';
ADD                : '+';
MINUS              : '-';
DIV                : '/';
MOD                : '%';
IDIV               : '//';
NOT_OP             : '~';
OPEN_BRACE         : '{' ;
CLOSE_BRACE        : '}' ;
LESS_THAN          : '<';
GREATER_THAN       : '>';
EQUALS             : '==';
GT_EQ              : '>=';
LT_EQ              : '<=';
NOT_EQ_1           : '<>';
NOT_EQ_2           : '!=';
AT                 : '@';
ARROW              : '->';
ADD_ASSIGN         : '+=';
SUB_ASSIGN         : '-=';
MULT_ASSIGN        : '*=';
AT_ASSIGN          : '@=';
DIV_ASSIGN         : '/=';
MOD_ASSIGN         : '%=';
AND_ASSIGN         : '&=';
OR_ASSIGN          : '|=';
XOR_ASSIGN         : '^=';
LEFT_SHIFT_ASSIGN  : '<<=';
RIGHT_SHIFT_ASSIGN : '>>=';
POWER_ASSIGN       : '**=';
IDIV_ASSIGN        : '//=';

SKIP_: ( SPACES | COMMENT | LINE_JOINING) -> skip;

UNKNOWN_CHAR: .;

/*
 * fragments
 */

fragment SHORT_STRING:
    '\'' (STRING_ESCAPE_SEQ | ~[\\\r\n\f'])* '\''
    | '"' ( STRING_ESCAPE_SEQ | ~[\\\r\n\f"])* '"'
;
fragment LONG_STRING: '\'\'\'' LONG_STRING_ITEM*? '\'\'\'' | '"""' LONG_STRING_ITEM*? '"""';

fragment LONG_STRING_ITEM: LONG_STRING_CHAR | STRING_ESCAPE_SEQ;

fragment LONG_STRING_CHAR: ~'\\';

fragment STRING_ESCAPE_SEQ: '\\' . | '\\' NEWLINE;

NEWLINE: ' ';


fragment NON_ZERO_DIGIT: [1-9];

fragment DIGIT: [0-9];

fragment OCT_DIGIT: [0-7];

fragment HEX_DIGIT: [0-9a-fA-F];

fragment BIN_DIGIT: [01];

fragment POINT_FLOAT: INT_PART? FRACTION | INT_PART '.';

fragment EXPONENT_FLOAT: ( INT_PART | POINT_FLOAT) EXPONENT;

fragment INT_PART: DIGIT+;

fragment FRACTION: '.' DIGIT+;

fragment EXPONENT: [eE] [+-]? DIGIT+;

fragment SHORT_BYTES:
    '\'' (SHORT_BYTES_CHAR_NO_SINGLE_QUOTE | BYTES_ESCAPE_SEQ)* '\''
    | '"' ( SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE | BYTES_ESCAPE_SEQ)* '"'
;

fragment LONG_BYTES: '\'\'\'' LONG_BYTES_ITEM*? '\'\'\'' | '"""' LONG_BYTES_ITEM*? '"""';

fragment LONG_BYTES_ITEM: LONG_BYTES_CHAR | BYTES_ESCAPE_SEQ;

fragment SHORT_BYTES_CHAR_NO_SINGLE_QUOTE:
    [-\u0009]
    | [\u000B-\u000C]
    | [\u000E-\u0026]
    | [\u0028-\u005B]
    | [\u005D-\u007F]
;

fragment SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE:
    [-\u0009]
    | [\u000B-\u000C]
    | [\u000E-\u0021]
    | [\u0023-\u005B]
    | [\u005D-\u007F]
;

fragment LONG_BYTES_CHAR: [-\u005B] | [\u005D-\u007F];

fragment BYTES_ESCAPE_SEQ: '\\' [-\u007F];

fragment SPACES: [ \t]+;

fragment COMMENT: '#' ~[\r\n\f]*;

fragment LINE_JOINING: '\\' SPACES? ( '\r'? '\n' | '\r' | '\f');


fragment UNICODE_OIDS: '\u1885' ..'\u1886' | '\u2118' | '\u212e' | '\u309b' ..'\u309c';

fragment UNICODE_OIDC: '\u00b7' | '\u0387' | '\u1369' ..'\u1371' | '\u19da';

fragment ID_START:
    '_'
    | [A-Z] | [a-z]
    | '\u00AA'
    | '\u00B5'
    | '\u00BA'
    | [\u00C0-\u00D6]
    | [\u00D8-\u00F6]
    | [\u00F8-\u01BA]
    | '\u01BB'
    | [\u01BC-\u01BF]
    | [\u01C0-\u01C3]
    | [\u01C4-\u0241]
    | [\u0250-\u02AF]
    | [\u02B0-\u02C1]
    | [\u02C6-\u02D1]
    | [\u02E0-\u02E4]
    | '\u02EE'
    | '\u037A'
    | '\u0386'
    | [\u0388-\u038A]
    | '\u038C'
    | [\u038E-\u03A1]
    | [\u03A3-\u03CE]
    | [\u03D0-\u03F5]
    | [\u03F7-\u0481]
    | [\u048A-\u04CE]
    | [\u04D0-\u04F9]
    | [\u0500-\u0525]
    | [\u0531-\u0556]
    | '\u0559'
    | [\u0561-\u0587]
    | [\u05D0-\u05EA]
    | [\u05F0-\u05F2]
    | [\u0621-\u063A]
    | '\u0640'
    | [\u0641-\u064A]
    | [\u066E-\u066F]
    | [\u0671-\u06D3]
    | '\u06D5'
    | [\u06E5-\u06E6]
    | [\u06EE-\u06EF]
    | [\u06FA-\u06FC]
    | '\u06FF'
    | '\u0710'
    | [\u0712-\u072F]
    | [\u074D-\u076D]
    | [\u0780-\u07A5]
    | '\u07B1'
    | [\u07CA-\u07EA]
    | [\u07F4-\u07F5]
    | '\u07FA'
    | [\u0904-\u0939]
    | '\u093D'
    | '\u0950'
    | [\u0958-\u0961]
    | '\u097D'
    | [\u0985-\u098C]
    | [\u098F-\u0990]
    | [\u0993-\u09A8]
    | [\u09AA-\u09B0]
    | '\u09B2'
    | [\u09B6-\u09B9]
    | '\u09BD'
    | '\u09CE'
    | [\u09DC-\u09DD]
    | [\u09DF-\u09E1]
    | [\u09F0-\u09F1]
    | [\u0A05-\u0A0A]
    | [\u0A0F-\u0A10]
    | [\u0A13-\u0A28]
    | [\u0A2A-\u0A30]
    | [\u0A32-\u0A33]
    | [\u0A35-\u0A36]
    | [\u0A38-\u0A39]
    | [\u0A59-\u0A5C]
    | '\u0A5E'
    | [\u0A72-\u0A74]
    | [\u0A85-\u0A8D]
    | [\u0A8F-\u0A91]
    | [\u0A93-\u0AA8]
    | [\u0AAA-\u0AB0]
    | [\u0AB2-\u0AB3]
    | [\u0AB5-\u0AB9]
    | '\u0ABD'
    | '\u0AD0'
    | [\u0AE0-\u0AE1]
    | [\u0B05-\u0B0C]
    | [\u0B0F-\u0B10]
    | [\u0B13-\u0B28]
    | [\u0B2A-\u0B30]
    | [\u0B32-\u0B33]
    | [\u0B35-\u0B39]
    | '\u0B3D'
    | [\u0B5C-\u0B5D]
    | [\u0B5F-\u0B61]
    | '\u0B71'
    | '\u0B83'
    | [\u0B85-\u0B8A]
    | [\u0B8E-\u0B90]
    | [\u0B92-\u0B95]
    | [\u0B99-\u0B9A]
    | '\u0B9C'
    | [\u0B9E-\u0B9F]
    | [\u0BA3-\u0BA4]
    | [\u0BA8-\u0BAA]
    | [\u0BAE-\u0BB9]
    | [\u0C05-\u0C0C]
    | [\u0C0E-\u0C10]
    | [\u0C12-\u0C28]
    | [\u0C2A-\u0C33]
    | [\u0C35-\u0C39]
    | [\u0C60-\u0C61]
    | [\u0C85-\u0C8C]
    | [\u0C8E-\u0C90]
    | [\u0C92-\u0CA8]
    | [\u0CAA-\u0CB3]
    | [\u0CB5-\u0CB9]
    | '\u0CBD'
    | '\u0CDE'
    | [\u0CE0-\u0CE1]
    | [\u0D05-\u0D0C]
    | [\u0D0E-\u0D10]
    | [\u0D12-\u0D28]
    | [\u0D2A-\u0D39]
    | [\u0D60-\u0D61]
    | [\u0D85-\u0D96]
    | [\u0D9A-\u0DB1]
    | [\u0DB3-\u0DBB]
    | '\u0DBD'
    | [\u0DC0-\u0DC6]
    | [\u0E01-\u0E30]
    | [\u0E32-\u0E33]
    | [\u0E40-\u0E45]
    | '\u0E46'
    | [\u0E81-\u0E82]
    | '\u0E84'
    | [\u0E87-\u0E88]
    | '\u0E8A'
    | '\u0E8D'
    | [\u0E94-\u0E97]
    | [\u0E99-\u0E9F]
    | [\u0EA1-\u0EA3]
    | '\u0EA5'
    | '\u0EA7'
    | [\u0EAA-\u0EAB]
    | [\u0EAD-\u0EB0]
    | [\u0EB2-\u0EB3]
    | '\u0EBD'
    | [\u0EC0-\u0EC4]
    | '\u0EC6'
    | [\u0EDC-\u0EDD]
    | '\u0F00'
    | [\u0F40-\u0F47]
    | [\u0F49-\u0F6A]
    | [\u0F88-\u0F8B]
    | [\u1000-\u1021]
    | [\u1023-\u1027]
    | [\u1029-\u102A]
    | [\u1050-\u1055]
    | [\u10A0-\u10C5]
    | '\u10D0'
    | [\u10FA-\u10FB]
    | [\u1100-\u1159]
    | [\u115F-\u11A2]
    | [\u11A8-\u11F9]
    | [\u1200-\u1248]
    | [\u124A-\u124D]
    | [\u1250-\u1256]
    | '\u1258'
    | [\u125A-\u125D]
    | [\u1260-\u1288]
    | [\u128A-\u128D]
    | [\u1290-\u12B0]
    | [\u12B2-\u12B5]
    | [\u12B8-\u12BE]
    | '\u12C0'
    | [\u12C2-\u12C5]
    | [\u12C8-\u12D6]
    | [\u12D8-\u1310]
    | [\u1312-\u1315]
    | [\u1318-\u135A]
    | [\u1380-\u138F]
    | [\u13A0-\u13F4]
    | [\u1401-\u166C]
    | [\u166F-\u1676]
    | [\u1681-\u169A]
    | [\u16A0-\u16EA]
    | [\u1700-\u170C]
    | [\u170E-\u1711]
    | [\u1720-\u1731]
    | [\u1740-\u1751]
    | [\u1760-\u176C]
    | [\u176E-\u1770]
    | [\u1780-\u17B3]
    | '\u17D7'
    | '\u17DC'
    | [\u1820-\u1842]
    | '\u1843'
    | [\u1844-\u1877]
    | [\u1880-\u18A8]
    | [\u1900-\u191C]
    | [\u1950-\u196D]
    | [\u1970-\u1974]
    | [\u1980-\u19A9]
    | [\u19C1-\u19C7]
    | [\u1A00-\u1A16]
    | [\u1D00-\u1D2B]
    | [\u1D2C-\u1D61]
    | [\u1D62-\u1D77]
    | [\u1D78]
    | [\u1D79-\u1D9A]
    | [\u1D9B-\u1DBF]
    | [\u1E00-\u1E9D]
    | [\u1E9E-\u1E9F]
    | [\u1EA0-\u1EF9]
    | [\u1F00-\u1F15]
    | [\u1F18-\u1F1D]
    | [\u1F20-\u1F45]
    | [\u1F48-\u1F4D]
    | [\u1F50-\u1F57]
    | '\u1F59'
    | '\u1F5B'
    | '\u1F5D'
    | [\u1F5F-\u1F7D]
    | [\u1F80-\u1FB4]
    | [\u1FB6-\u1FBC]
    | '\u1FBE'
    | [\u1FC2-\u1FC4]
    | [\u1FC6-\u1FCC]
    | [\u1FD0-\u1FD3]
    | [\u1FD6-\u1FDB]
    | [\u1FE0-\u1FEC]
    | [\u1FF2-\u1FF4]
    | [\u1FF6-\u1FFC]
    | '\u2071'
    | '\u207F'
    | [\u2090-\u2094]
    | '\u2102'
    | '\u2107'
    | [\u210A-\u2113]
    | '\u2115'
    | '\u2119'
    | '\u211A'
    | '\u211B'
    | '\u211C'
    | '\u211D'
    | '\u2124'
    | '\u2126'
    | '\u2128'
    | [\u212A-\u212D]
    | [\u212F-\u2131]
    | [\u2133-\u2134]
    | [\u2135-\u2138]
    | '\u2139'
    | [\u213C-\u213D]
    | [\u213E-\u213F]
    | [\u2145-\u2149]
    | '\u214E'
    | [\u2183-\u2184]
    | [\u2C00-\u2C2E]
    | [\u2C30-\u2C5E]
    | [\u2C80-\u2CE4]
    | [\u2D00-\u2D25]
    | [\u2D30-\u2D65]
    | '\u2D6F'
    | [\u2D80-\u2D96]
    | [\u2DA0-\u2DA6]
    | [\u2DA8-\u2DAE]
    | [\u2DB0-\u2DB6]
    | [\u2DB8-\u2DBE]
    | [\u2DC0-\u2DC6]
    | [\u2DC8-\u2DCE]
    | [\u2DD0-\u2DD6]
    | [\u2DD8-\u2DDE]
    | '\u3005'
    | '\u3006'
    | [\u302A-\u302D]
    | '\u302E'
    | '\u302F'
    | [\u3031-\u3035]
    | [\u3038-\u303A]
    | '\u303B'
    | [\u3041-\u3096]
    | [\u309D-\u309E]
    | '\u309F'
    | [\u30A1-\u30FA]
    | [\u30FC-\u30FE]
    | '\u30FF'
    | [\u3105-\u312D]
    | [\u3131-\u318E]
    | [\u31A0-\u31B7]
    | [\u31F0-\u31FF]
    | [\u3400-\u4DB5]
    | [\u4E00-\u9FC3]
    | [\uA000-\uA014]
    | [\uA016-\uA48C]
    | [\uA500-\uA60B]
    | '\uA60C'
    | [\uA610-\uA61F]
    | [\uA62A-\uA62B]
    | [\uA66E]
    | [\uA717-\uA71F]
    | [\uA722-\uA76F]
    | '\uA770'
    | [\uA771-\uA787]
    | [\uA7FB-\uA801]
    | '\uA803'
    | '\uA804'
    | '\uA805'
    | [\uA807-\uA80A]
    | '\uA80C'
    | [\uA80D-\uA822]
    | [\uAC00-\uD7A3]
    | [\uF900-\uFA2D]
    | [\uFA30-\uFA6A]
    | [\uFA70-\uFAD9]
    | [\uFB00-\uFB06]
    | [\uFB13-\uFB17]
    | '\uFB1D'
    | [\uFB1F-\uFB28]
    | [\uFB2A-\uFB36]
    | [\uFB38-\uFB3C]
    | '\uFB3E'
    | [\uFB40-\uFB41]
    | [\uFB43-\uFB44]
    | [\uFB46-\uFBB1]
    | [\uFBD3-\uFD3D]
    | [\uFD50-\uFD8F]
    | [\uFD92-\uFDC7]
    | [\uFDF0-\uFDFB]
    | [\uFE70-\uFE74]
    | [\uFE76-\uFEFC]
    | [\uFF21-\uFF3A]
    | [\uFF41-\uFF5A]
    | [\uFF66-\uFF6F]
    | [\uFF70]
    | [\uFF71-\uFF9D]
    | [\uFF9E-\uFF9F]
    | [\uFFA0-\uFFBE]
    | [\uFFC2-\uFFC7]
    | [\uFFCA-\uFFCF]
    | [\uFFD2-\uFFD7]
    | [\uFFDA-\uFFDC]
 | UNICODE_OIDS
;

fragment ID_CONTINUE:
    ID_START
    | [0-9]
    | [\u0300-\u036F]
    | [\u0483-\u0486]
    | [\u0591-\u05B9]
    | [\u05BB-\u05BD]
    | '\u05BF'
    | [\u05C1-\u05C2]
    | '\u05C4'
    | '\u05C5'
    | '\u05C7'
    | [\u0610-\u0615]
    | [\u064B-\u065E]
    | '\u0670'
    | [\u06D6-\u06DA]
    | [\u06DB-\u06DC]
    | [\u06DF-\u06E4]
    | [\u06E7-\u06E8]
    | [\u06EA-\u06ED]
    | '\u0711'
    | [\u0730-\u074A]
    | [\u07A6-\u07B0]
    | [\u07EB-\u07F3]
    | '\u0901'
    | '\u0902'
    | '\u0903'
    | '\u093C'
    | [\u093E-\u0940]
    | [\u0941-\u0948]
    | [\u0949-\u094C]
    | '\u094D'
    | [\u0951-\u0954]
    | [\u0962-\u0963]
    | '\u0981'
    | '\u0982'
    | '\u0983'
    | '\u09BC'
    | [\u09BE-\u09C0]
    | [\u09C1-\u09C4]
    | [\u09CD]
    | [\u09D7]
    | [\u09E2-\u09E3]
    | '\u0A01'
    | '\u0A02'
    | '\u0A03'
    | '\u0A3C'
    | [\u0A3E-\u0A40]
    | [\u0A41-\u0A42]
    | '\u0A47'
    | '\u0A48'
    | '\u0A4B'
    | '\u0A4C'
    | '\u0A4D'
    | '\u0A70'
    | '\u0A71'
    | '\u0A81'
    | '\u0A82'
    | '\u0A83'
    | '\u0ABC'
    | [\u0ABE-\u0AC0]
    | [\u0AC1-\u0AC5]
    | '\u0AC7'
    | '\u0AC8'
    | '\u0AC9'
    | '\u0ACB'
    | '\u0ACC'
    | '\u0ACD'
    | [\u0AE2-\u0AE3]
    | '\u0B01'
    | '\u0B02'
    | '\u0B03'
    | '\u0B3C'
    | '\u0B3E'
    | '\u0B3F'
    | '\u0B40'
    | [\u0B41-\u0B43]
    | '\u0B4D'
    | '\u0B56'
    | '\u0B57'
    | [\u0B82]
    | '\u0B3E'
    | [\u0BBE-\u0BBF]
    | [\u0BC0]
    | [\u0BC1-\u0BC2]
    | '\u0BCD'
    | '\u0C3E'
    | '\u0C3F'
    | '\u0C40'
    | [\u0C46-\u0C48]
    | [\u0C4A-\u0C4D]
    | [\u0C55-\u0C56]
    | '\u0CBC'
    | '\u0CBF'
    | '\u0CC0'
    | '\u0CC6'
    | '\u0CC7'
    | '\u0CC8'
    | [\u0CCA-\u0CCD]
    | [\u0D41-\u0D43]
    | '\u0D4D'
    | [\u0DCA]
    | [\u0DCF-\u0DD1]
    | [\u0DD2-\u0DD4]
    | '\u0DD6'
    | '\u0E31'
    | [\u0E34-\u0E3A]
    | [\u0E47-\u0E4E]
    | '\u0EB1'
    | [\u0EB4-\u0EB9]
    | [\u0EBB-\u0EBC]
    | [\u0EC8-\u0ECD]
    | [\u0F18-\u0F19]
    | '\u0F35'
    | '\u0F37'
    | '\u0F39'
    | [\u0F71-\u0F7E]
    | [\u0F80-\u0F84]
    | [\u0F86-\u0F87]
    | [\u0F90-\u0F97]
    | [\u0F99-\u0FBC]
    | '\u0FC6'
    | '\u102D'
    | '\u102E'
    | '\u102F'
    | '\u1030'
    | '\u1038'
    | [\u1058-\u1059]
    | '\u135F'
    | [\u1712-\u1714]
    | [\u1732-\u1734]
    | [\u1752-\u1753]
    | [\u1772-\u1773]
    | [\u17B7-\u17BD]
    | '\u17C6'
    | [\u17C9-\u17D3]
    | '\u17DD'
    | [\u180B-\u180D]
    | '\u18A9'
    | [\u1920-\u1922]
    | [\u1927-\u1928]
    | '\u1932'
    | [\u1939-\u193B]
    | [\u1A17-\u1A18]
    | '\u1DC0'
    | '\u1DC1'
    | '\u1DC2'
    | '\u1DC3'
    | [\u20D0-\u20DC]
    | '\u20DD'
    | '\u20DE'
    | '\u20DF'
    | '\u20E0'
    | '\u20E1'
    | [\u20E2-\u20E4]
    | [\u20E5-\u20EF]
    | [\u302A-\u302F]
    | '\u3099'
    | '\u309A'
    | '\uA806'
    | '\uFB1E'
    | [\uFE00-\uFE0F]
    | [\uFE20-\uFE23]
    | '\uFEFF'
    | [\uFFF9-\uFFFB]
 | UNICODE_OIDC
;