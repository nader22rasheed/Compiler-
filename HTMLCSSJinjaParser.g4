// $antlr-format alignTrailingComments true, columnLimit 150, minEmptyLines 1, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine false, allowShortBlocksOnASingleLine true, alignSemicolons hanging, alignColons hanging

parser grammar HTMLCSSJinjaParser;
@header{
package antlr;
}

options {
    tokenVocab = HTMLCSSJinjaLexer;
}

htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute* (
        TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)?
        | TAG_SLASH_CLOSE
    )
    | SCRIPTLET
    | script
    | style
    ;

htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment | jinja_block | jinja_expression ) htmlChardata?)*
    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS attributeValue)?
    ;

attributeValue
    : ATT_WS? ( DOUBLE_QUOTE_START (DQUOTE_TEXT | DQUOTE_JINJA_START (jinja_expression_inner | boolean_expression) JINJA_EXPR_END | DQUOTE_JINJA_BLOCK_START jinja_block_content JINJA_BLOCK_END)* DOUBLE_QUOTE_END
              | SINGLE_QUOTE_START (SQUOTE_TEXT | SQUOTE_JINJA_START (jinja_expression_inner | boolean_expression) JINJA_EXPR_END | SQUOTE_JINJA_BLOCK_START jinja_block_content JINJA_BLOCK_END)* SINGLE_QUOTE_END
              | ATTCHARS
              | HEXCHARS
              | DECCHARS
              )
    ;

htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN stylesheet CSS_STYLE_CLOSE
    ;

// Jinja parser rules

statement
    : jinja_expression
    | jinja_block
    | assignment_statement
    | if_statement
    | while_statement
    ;

jinja_block
    : JINJA_BLOCK_START jinja_block_content JINJA_BLOCK_END JINJA_NEWLINE?
    ;

jinja_block_content
    : assignment_statement
    | if_fragment
    | elif_fragment
    | else_fragment
    | endif_fragment
    | while_fragment
    | endwhile_fragment
    ;

assignment_statement
    : JINJA_SET JINJA_LPAREN JINJA_ID EQ jinja_expression_inner JINJA_RPAREN
    ;

jinja_expression
    : JINJA_EXPR_START (jinja_expression_inner | boolean_expression) JINJA_EXPR_END
    ;

jinja_expression_inner
    : JINJA_LPAREN jinja_expression_inner JINJA_RPAREN                                               #eqPar
    | left = jinja_expression_inner operator = (JINJA_MUL|JINJA_DIV) right = jinja_expression_inner        #eqMUL
    | left = jinja_expression_inner operator = (JINJA_ADD|JINJA_SUB) right = jinja_expression_inner        #eqAdd
    | JINJA_DOUBLE                                                           #eqDbl
    | JINJA_INT                                                              #eqInt
    | JINJA_STRING                                                           #eqStr
    | JINJA_ID                                                               #eqVar
    ;

boolean_expression
    : JINJA_LPAREN boolean_expression JINJA_RPAREN                                               #eqBoolPar
    | left = jinja_expression_inner operator=(JINJA_GT|JINJA_GTEQ|JINJA_LT|JINJA_LTEQ) right = jinja_expression_inner          #relationExpr
    | left = jinja_expression_inner operator=(JINJA_EQ|JINJA_NEQ) right = jinja_expression_inner                   #boolEq
    | JINJA_BOOL                                                                     #eqBool
    ;

if_statement
    : if_fragment code_block (elif_statement | else_statement)? endif_fragment
    ;

elif_statement: elif_fragment code_block (elif_statement | else_statement)? ;

else_statement: else_fragment code_block ;

if_fragment: JINJA_IF JINJA_LPAREN boolean_expression JINJA_RPAREN JINJA_NEWLINE? ;

elif_fragment: JINJA_ELIF JINJA_LPAREN boolean_expression JINJA_RPAREN JINJA_NEWLINE?;

else_fragment: JINJA_ELSE JINJA_NEWLINE? ;

endif_fragment: JINJA_ENDIF JINJA_NEWLINE?;

code_block: JINJA_NEWLINE? htmlContent JINJA_NEWLINE?;

while_statement: while_fragment statement*? endwhile_fragment ;

while_fragment: JINJA_WHILE JINJA_LPAREN boolean_expression JINJA_RPAREN JINJA_NEWLINE? ;

endwhile_fragment: JINJA_ENDWHILE JINJA_NEWLINE?;

// CSS parser rules

stylesheet
    : css_ws (charset ( CSS_Comment | CSS_Space | CSS_Cdo | CSS_Cdc)*)* (imports ( CSS_Comment | CSS_Space | CSS_Cdo | CSS_Cdc)*)* (
        namespace_ ( CSS_Comment | CSS_Space | CSS_Cdo | CSS_Cdc)*
    )* (nestedStatement ( CSS_Comment | CSS_Space | CSS_Cdo | CSS_Cdc)*)* EOF
    ;

charset
    : CSS_Charset css_ws CSS_String_ css_ws CSS_SemiColon css_ws # goodCharset
    | CSS_Charset css_ws CSS_String_ css_ws        # badCharset
    ;

imports
    : CSS_Import css_ws (CSS_String_ | css_url) css_ws mediaQueryList CSS_SemiColon css_ws # goodImport
    | CSS_Import css_ws ( CSS_String_ | css_url) css_ws CSS_SemiColon css_ws               # goodImport
    | CSS_Import css_ws ( CSS_String_ | css_url) css_ws mediaQueryList       # badImport
    | CSS_Import css_ws ( CSS_String_ | css_url) css_ws                      # badImport
    ;

namespace_
    : CSS_Namespace css_ws (namespacePrefix css_ws)? (CSS_String_ | css_url) css_ws CSS_SemiColon css_ws # goodNamespace
    | CSS_Namespace css_ws (namespacePrefix css_ws)? ( CSS_String_ | css_url) css_ws       # badNamespace
    ;

namespacePrefix
    : css_ident
    ;

media
    : CSS_Media css_ws mediaQueryList groupRuleBody css_ws
    ;

mediaQueryList
    : (mediaQuery ( CSS_Comma css_ws mediaQuery)*)? css_ws
    ;

mediaQuery
    : (CSS_MediaOnly | CSS_Not)? css_ws mediaType css_ws (CSS_And css_ws mediaExpression)*
    | mediaExpression ( CSS_And css_ws mediaExpression)*
    ;

mediaType
    : css_ident
    ;

mediaExpression
    : CSS_OpenParen css_ws mediaFeature (CSS_Colon css_ws expr)? CSS_CloseParen css_ws
    ;

mediaFeature
    : css_ident css_ws
    ;

page
    : CSS_Page css_ws pseudoPage? CSS_OpenBrace css_ws declaration? (CSS_SemiColon css_ws declaration?)* CSS_CloseBrace css_ws
    ;

pseudoPage
    : CSS_Colon css_ident css_ws
    ;

selectorGroup
    : selector (CSS_Comma css_ws selector)*
    ;

selector
    : simpleSelectorSequence css_ws (combinator simpleSelectorSequence css_ws)*
    ;

combinator
    : CSS_Plus css_ws
    | CSS_Greater css_ws
    | CSS_Tilde css_ws
    | CSS_Space css_ws
    ;

simpleSelectorSequence
    : (typeSelector | universal) (CSS_Hash | className | attrib | pseudo | negation)*
    | ( CSS_Hash | className | attrib | pseudo | negation)+
    ;

typeSelector
    : typeNamespacePrefix? elementName
    ;

typeNamespacePrefix
    : (css_ident | CSS_Multiply)? CSS_Pipe
    ;

elementName
    : css_ident
    ;

universal
    : typeNamespacePrefix? CSS_Multiply
    ;

className
    : CSS_Dot css_ident
    ;

attrib
    : CSS_OpenBracket css_ws typeNamespacePrefix? css_ident css_ws (
        (CSS_PrefixMatch | CSS_SuffixMatch | CSS_SubstringMatch | CSS_Equal | CSS_Includes | CSS_DashMatch) css_ws (
            css_ident
            | CSS_String_
        ) css_ws
    )? CSS_CloseBracket
    ;

pseudo
    : CSS_Colon CSS_Colon? (css_ident | functionalPseudo)
    ;

functionalPseudo
    : CSS_Function_ css_ws css_expression CSS_CloseParen
    ;

css_expression
    : (( CSS_Plus | CSS_Minus | CSS_Dimension | CSS_Dimension | CSS_Number | CSS_String_ | css_ident) css_ws)+
    ;

negation
    : CSS_PseudoNot css_ws negationArg css_ws CSS_CloseParen
    ;

negationArg
    : typeSelector
    | universal
    | CSS_Hash
    | className
    | attrib
    | pseudo
    ;

operator_
    : CSS_Divide css_ws   # goodOperator
    | CSS_Comma css_ws # goodOperator
    | CSS_Space css_ws # goodOperator
    | CSS_Equal css_ws   # badOperator
    ;

property_
    : css_ident css_ws    # goodProperty
    | CSS_Variable css_ws # goodProperty
    | CSS_Multiply css_ident   # badProperty
    | CSS_Underscore css_ident   # badProperty
    ;

ruleset
    : selectorGroup CSS_OpenBrace css_ws declarationList? CSS_CloseBrace css_ws # knownRuleset
    | any_* CSS_OpenBrace css_ws declarationList? CSS_CloseBrace css_ws         # unknownRuleset
    ;

declarationList
    : (CSS_SemiColon css_ws)* declaration css_ws (CSS_SemiColon css_ws declaration?)*
    ;

declaration
    : property_ CSS_Colon css_ws expr prio? # knownDeclaration
    | property_ CSS_Colon css_ws value      # unknownDeclaration
    ;

prio
    : CSS_Important css_ws
    ;

value
    : (any_ | block | CSS_AtKeyword css_ws)+
    ;

expr
    : term (operator_? term)*
    ;

term
    : css_number css_ws           # knownTerm
    | CSS_Percentage css_ws       # knownTerm
    | CSS_Dimension css_ws        # knownTerm
    | CSS_String_ css_ws          # knownTerm
    | CSS_UnicodeRange css_ws     # knownTerm
    | css_ident css_ws            # knownTerm
    | var_                        # knownTerm
    | css_url css_ws              # knownTerm
    | hexcolor                    # knownTerm
    | calc                        # knownTerm
    | function_                   # knownTerm
    | CSS_Dimension css_ws        # unknownTerm
    | dxImageTransform            # badTerm
    ;

function_
    : CSS_Function_ css_ws expr CSS_CloseParen css_ws
    ;

dxImageTransform
    : CSS_DxImageTransform css_ws expr CSS_CloseParen css_ws
    ;

hexcolor
    : CSS_Hash css_ws
    ;

css_number
    : (CSS_Plus | CSS_Minus)? CSS_Number
    ;

css_percentage
    : (CSS_Plus | CSS_Minus)? CSS_Percentage
    ;

css_dimension
    : (CSS_Plus | CSS_Minus)? CSS_Dimension
    ;

any_
    : css_ident css_ws
    | css_number css_ws
    | css_percentage css_ws
    | CSS_Dimension css_ws
    | CSS_Dimension css_ws
    | CSS_String_ css_ws
    | css_url css_ws
    | CSS_Hash css_ws
    | CSS_UnicodeRange css_ws
    | CSS_Includes css_ws
    | CSS_DashMatch css_ws
    | CSS_Colon css_ws
    | CSS_Function_ css_ws ( any_ | unused)* CSS_CloseParen css_ws
    | CSS_OpenParen css_ws ( any_ | unused)* CSS_CloseParen css_ws
    | CSS_OpenBracket css_ws ( any_ | unused)* CSS_CloseBracket css_ws
    ;

atRule
    : CSS_AtKeyword css_ws any_* (block | CSS_SemiColon css_ws) # unknownAtRule
    ;

unused
    : block
    | CSS_AtKeyword css_ws
    | CSS_SemiColon css_ws
    | CSS_Cdo css_ws
    | CSS_Cdc css_ws
    ;

block
    : CSS_OpenBrace css_ws (declarationList | nestedStatement | any_ | block | CSS_AtKeyword css_ws | CSS_SemiColon css_ws)* CSS_CloseBrace css_ws
    ;

nestedStatement
    : ruleset
    | media
    | page
    | fontFaceRule
    | keyframesRule
    | supportsRule
    | viewport
    | counterStyle
    | fontFeatureValuesRule
    | atRule
    ;

groupRuleBody
    : CSS_OpenBrace css_ws nestedStatement* CSS_CloseBrace css_ws
    ;

supportsRule
    : CSS_Supports css_ws supportsCondition css_ws groupRuleBody
    ;

supportsCondition
    : supportsNegation
    | supportsConjunction
    | supportsDisjunction
    | supportsConditionInParens
    ;

supportsConditionInParens
    : CSS_OpenParen css_ws supportsCondition css_ws CSS_CloseParen
    | supportsDeclarationCondition
    | generalEnclosed
    ;

supportsNegation
    : CSS_Not css_ws CSS_Space css_ws supportsConditionInParens
    ;

supportsConjunction
    : supportsConditionInParens (css_ws CSS_Space css_ws CSS_And css_ws CSS_Space css_ws supportsConditionInParens)+
    ;

supportsDisjunction
    : supportsConditionInParens (css_ws CSS_Space css_ws CSS_Or css_ws CSS_Space css_ws supportsConditionInParens)+
    ;

supportsDeclarationCondition
    : CSS_OpenParen css_ws declaration CSS_CloseParen
    ;

generalEnclosed
    : (CSS_Function_ | CSS_OpenParen) (any_ | unused)* CSS_CloseParen
    ;

var_
    : VAR css_ws CSS_Variable css_ws CSS_CloseParen css_ws
    ;

calc
    : CALC css_ws calcSum CSS_CloseParen css_ws
    ;

calcSum
    : calcProduct (CSS_Space css_ws ( CSS_Plus | CSS_Minus) css_ws CSS_Space css_ws calcProduct)*
    ;

calcProduct
    : calcValue (CSS_Multiply css_ws calcValue | CSS_Divide css_ws css_number css_ws)*
    ;

calcValue
    : css_number css_ws
    | CSS_Dimension css_ws
    | CSS_Dimension css_ws
    | CSS_Percentage css_ws
    | CSS_OpenParen css_ws calcSum CSS_CloseParen css_ws
    ;

fontFaceRule
    : CSS_FontFace css_ws CSS_OpenBrace css_ws fontFaceDeclaration? (CSS_SemiColon css_ws fontFaceDeclaration?)* CSS_CloseBrace css_ws
    ;

fontFaceDeclaration
    : property_ CSS_Colon css_ws expr  # knownFontFaceDeclaration
    | property_ CSS_Colon css_ws value # unknownFontFaceDeclaration
    ;

keyframesRule
    : CSS_Keyframes css_ws CSS_Space css_ws css_ident css_ws CSS_OpenBrace css_ws keyframeBlock* CSS_CloseBrace css_ws
    ;

keyframeBlock
    : (keyframeSelector CSS_OpenBrace css_ws declarationList? CSS_CloseBrace css_ws)
    ;

keyframeSelector
    : (CSS_From | CSS_To | CSS_Percentage) css_ws (CSS_Comma css_ws ( CSS_From | CSS_To | CSS_Percentage) css_ws)*
    ;

viewport
    : CSS_Viewport css_ws CSS_OpenBrace css_ws declarationList? CSS_CloseBrace css_ws
    ;

counterStyle
    : CSS_CounterStyle css_ws css_ident css_ws CSS_OpenBrace css_ws declarationList? CSS_CloseBrace css_ws
    ;

fontFeatureValuesRule
    : CSS_FontFeatureValues css_ws fontFamilyNameList css_ws CSS_OpenBrace css_ws featureValueBlock* CSS_CloseBrace css_ws
    ;

fontFamilyNameList
    : fontFamilyName (css_ws CSS_Comma css_ws fontFamilyName)*
    ;

fontFamilyName
    : CSS_String_
    | css_ident ( css_ws css_ident)*
    ;

featureValueBlock
    : featureType css_ws CSS_OpenBrace css_ws featureValueDefinition? (css_ws CSS_SemiColon css_ws featureValueDefinition?)* CSS_CloseBrace css_ws
    ;

featureType
    : CSS_AtKeyword
    ;

featureValueDefinition
    : css_ident css_ws CSS_Colon css_ws css_number (css_ws css_number)*
    ;

css_ident
    : CSS_Ident
    | CSS_MediaOnly
    | CSS_Not
    | CSS_And
    | CSS_Or
    | CSS_From
    | CSS_To
    ;

css_ws
    : (CSS_Comment | CSS_Space)*
    ;

css_url
    : CSS_Url_ css_ws CSS_String_ css_ws CSS_CloseParen
    | CSS_Url_
    ;