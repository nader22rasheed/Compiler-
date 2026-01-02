// $antlr-format alignTrailingComments true, columnLimit 150, minEmptyLines 1, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine false, allowShortBlocksOnASingleLine true, alignSemicolons hanging, alignColons hanging

parser grammar HTMLCSSJinjaParser;
@header{
package antlr;
}

options {
    tokenVocab = HTMLCSSJinjaLexer;
}


//AST.HTML parser rule

htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements* #htmlDoc
    ;

scriptletOrSeaWs
    : SCRIPTLET #scr
    | SEA_WS #ws
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc* EOF #htmlElems
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute*  TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? #htmlNormalTag
    | TAG_OPEN TAG_NAME htmlAttribute* TAG_SLASH_CLOSE   #htmlSelfClosing
    |SCRIPTLET #htmlScriptlet
    |script #htmlScript
    |style #htmlStyle
    ;


htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment | jinja_block | jinja_expression ) htmlChardata?)* #htmlContentRule
    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS attributeValue)? #htmlAttr
    ;

attributeValue
  : ATT_WS? DOUBLE_QUOTE_START (DQUOTE_TEXT | DQUOTE_JINJA_START (jinja_expression_inner | boolean_expression) JINJA_EXPR_END | DQUOTE_JINJA_BLOCK_START jinja_block_content JINJA_BLOCK_END )* DOUBLE_QUOTE_END #attrDouble
  | ATT_WS? SINGLE_QUOTE_START (SQUOTE_TEXT | SQUOTE_JINJA_START (jinja_expression_inner | boolean_expression) JINJA_EXPR_END | SQUOTE_JINJA_BLOCK_START jinja_block_content JINJA_BLOCK_END )* SINGLE_QUOTE_END #attrSingle
  | ATT_WS? ATTCHARS #attrChars
  | ATT_WS? HEXCHARS #attrHex
  | ATT_WS? DECCHARS #attrDec
  ;

htmlChardata
  : HTML_TEXT #htmlText
  | SEA_WS #htmlWs
  ;

htmlMisc
    : htmlComment #htmlCommentMisc
    | SEA_WS #htmlMiscWs
    ;


htmlComment
    : HTML_COMMENT #htmlCommentNormal
    | HTML_CONDITIONAL_COMMENT #htmlCommentConditional
    ;

script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY) #scriptTag
    ;

style
    : STYLE_OPEN stylesheet CSS_STYLE_CLOSE #styleTag
    ;


// Jinja parser rules

statement
    : jinja_expression #stmtExpr
    | jinja_block #stmtBlock
    | assignment_statement #stmtAssign
    | if_statement #stmtIf
    | while_statement #stmtWhile
    ;

jinja_block
    : JINJA_BLOCK_START jinja_block_content JINJA_BLOCK_END JINJA_NEWLINE? #jinjaBlock
    ;

jinja_block_content
    :  if_fragment #blkIf
    | elif_fragment #blkElif
    | else_fragment #blkElse
    | endif_fragment  #blkEndIf
    | while_fragment #blkWhile
    | endwhile_fragment #blkEndWhile
    |  assignment_statement  #blkAssign
    ;

assignment_statement
    : JINJA_SET JINJA_LPAREN JINJA_ID EQ jinja_expression_inner JINJA_RPAREN #assignStmt
    ;

jinja_expression
    : JINJA_EXPR_START (jinja_expression_inner | boolean_expression) JINJA_EXPR_END  #jinjaExpr
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
    : if_fragment code_block (elif_statement | else_statement)? endif_fragment  #ifStmt
    ;

elif_statement: elif_fragment code_block (elif_statement | else_statement)? #elifStmt  ;

else_statement: else_fragment code_block  #elseStmt;

if_fragment: JINJA_IF JINJA_LPAREN boolean_expression JINJA_RPAREN JINJA_NEWLINE? #ifFrg ;

elif_fragment: JINJA_ELIF JINJA_LPAREN boolean_expression JINJA_RPAREN JINJA_NEWLINE?  #elifFrg;

else_fragment: JINJA_ELSE JINJA_NEWLINE? #elseFrg ;

endif_fragment: JINJA_ENDIF JINJA_NEWLINE? #endifFrg;

code_block: JINJA_NEWLINE? htmlContent JINJA_NEWLINE? #codeblock;

while_statement: while_fragment statement*? endwhile_fragment  #whileStmt;

while_fragment: JINJA_WHILE JINJA_LPAREN boolean_expression JINJA_RPAREN JINJA_NEWLINE? #whileFrg;

endwhile_fragment: JINJA_ENDWHILE JINJA_NEWLINE? #endwhileFrg;




// AST.CSS parser rules

stylesheet:
(  charset| imports|  nestedStatement |. )*?  #stylesheetRule
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
    : CSS_Media css_ws mediaQueryList groupRuleBody css_ws #mediaRule
    ;

mediaQueryList
    : (mediaQuery ( CSS_Comma css_ws mediaQuery)*)? css_ws #mediaQueryListRule
    ;

mediaQuery
    : (CSS_MediaOnly | CSS_Not)? css_ws mediaType css_ws (CSS_And css_ws mediaExpression)* #mediaTypeQuery
    | mediaExpression ( CSS_And css_ws mediaExpression)* #mediaExprQuery
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
    : CSS_Page css_ws pseudoPage? CSS_OpenBrace css_ws declaration? (CSS_SemiColon css_ws declaration?)* CSS_CloseBrace css_ws #pageRule
    ;

pseudoPage
    : CSS_Colon css_ident css_ws
    ;

selectorGroup
    : selector (CSS_Comma css_ws selector)* #selectorGroupRule
    ;

selector
    : simpleSelectorSequence css_ws (combinator simpleSelectorSequence css_ws)* #selectorRule
    ;

combinator
    : CSS_Plus css_ws
    | CSS_Greater css_ws
    | CSS_Tilde css_ws
    | CSS_Space css_ws
    ;

simpleSelectorSequence
    : (typeSelector | universal) (CSS_Hash | className | attrib | pseudo | negation)*  #simpleSeq1
    | ( CSS_Hash | className | attrib | pseudo | negation)+  #simpleSeq2
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
    : CSS_Function_ css_ws css_expression CSS_CloseParen #funcPseudo
    ;

css_expression
    : (( CSS_Plus | CSS_Minus | CSS_Dimension | CSS_Dimension | CSS_Number | CSS_String_ | css_ident) css_ws)+ #cssExpr
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
    : (CSS_SemiColon css_ws)* declaration css_ws (CSS_SemiColon css_ws declaration?)* #declList
    ;

declaration
    : property_ CSS_Colon css_ws expr prio? # knownDeclaration
    | property_ CSS_Colon css_ws value      # unknownDeclaration
    ;

prio
    : CSS_Important css_ws #prioRule
    ;

value
    : (any_ | block | CSS_AtKeyword css_ws)+ #valueRule
    ;

expr
    : term (operator_? term)* #exprRule
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
    : CSS_Function_ css_ws expr CSS_CloseParen css_ws #funcRule
    ;

dxImageTransform
    : CSS_DxImageTransform css_ws expr CSS_CloseParen css_ws #dxTransform
    ;

hexcolor
    : CSS_Hash css_ws
    ;

css_number
    : (CSS_Plus | CSS_Minus)? CSS_Number #cssNum
    ;

css_percentage
    : (CSS_Plus | CSS_Minus)? CSS_Percentage #cssPercent
    ;

css_dimension
    : (CSS_Plus | CSS_Minus)? CSS_Dimension  #cssDim
    ;

any_
    : css_ident css_ws #anyIdent
    | css_number css_ws #anyNumber
    | css_percentage css_ws #anyPercent
    | CSS_Dimension css_ws #anyDim
    | CSS_String_ css_ws #anyString
    | css_url css_ws #anyUrl
    | CSS_Hash css_ws #anyHash
    | CSS_UnicodeRange css_ws #anyUnicode
    | CSS_Includes css_ws #anyInclude
    | CSS_DashMatch css_ws #anyDashMatch
    | CSS_Colon css_ws #anyColon
    | CSS_Function_ css_ws (any_ | unused)* CSS_CloseParen css_ws #anyFunc
    | CSS_OpenParen css_ws (any_ | unused)* CSS_CloseParen css_ws #anyParen
    | CSS_OpenBracket css_ws (any_ | unused)* CSS_CloseBracket css_ws #anyBrackets
    ;


atRule
    : CSS_AtKeyword css_ws any_* (block | CSS_SemiColon css_ws) #atRuleUnknown
    ;

unused
     : block #unusedBlock
     | CSS_AtKeyword css_ws #unusedAt
     | CSS_SemiColon css_ws #unusedSemi
     | CSS_Cdo css_ws #unusedCdo
     | CSS_Cdc css_ws #unusedCdc
     ;


block
   : CSS_OpenBrace css_ws (declarationList | nestedStatement | any_ | block | CSS_AtKeyword css_ws | CSS_SemiColon css_ws)* CSS_CloseBrace css_ws #blockRule
   ;

nestedStatement
     : ruleset #nestRuleset
     | media #nestMedia
     | page #nestPage
     | fontFaceRule #nestFontFace
     | keyframesRule #nestKeyframes
     | supportsRule #nestSupports
     | viewport #nestViewport
     | counterStyle #nestCounter
     | fontFeatureValuesRule #nestFontFeature
     | atRule #nestAtRule
     ;


groupRuleBody
       : CSS_OpenBrace css_ws nestedStatement* CSS_CloseBrace css_ws #groupBody
        ;


supportsRule
    : CSS_Supports css_ws supportsCondition css_ws groupRuleBody #supportsRuleLabel
    ;

supportsCondition
    : supportsNegation
    | supportsConjunction
    | supportsDisjunction
    | supportsConditionInParens
    ;

supportsConditionInParens
     : CSS_OpenParen css_ws supportsCondition css_ws CSS_CloseParen #supportParen
     | supportsDeclarationCondition #supportDeclCond
     | generalEnclosed #supportGeneral
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
 : (CSS_Function_ | CSS_OpenParen) (any_ | unused)* CSS_CloseParen #generalEnclosedRule
 ;

var_ : VAR css_ws CSS_Variable css_ws CSS_CloseParen css_ws #varRule ;

calc : CALC css_ws calcSum CSS_CloseParen css_ws #calcRule ;

calcSum :
 calcProduct (CSS_Space css_ws (CSS_Plus | CSS_Minus) css_ws CSS_Space css_ws calcProduct)* #calcSumRule ;


calcProduct : calcValue (CSS_Multiply css_ws calcValue | CSS_Divide css_ws css_number css_ws)* #calcProdRule ;

calcValue
   : css_number css_ws #calcValNum
   | CSS_Dimension css_ws #calcValDim
   | CSS_Percentage css_ws #calcValPercent
   | CSS_OpenParen css_ws calcSum CSS_CloseParen css_ws #calcValParen
   ;

fontFaceRule
: CSS_FontFace css_ws CSS_OpenBrace css_ws fontFaceDeclaration? (CSS_SemiColon css_ws fontFaceDeclaration?)* CSS_CloseBrace css_ws #fontFaceRuleLabel
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

fontFamilyNameList : fontFamilyName (css_ws CSS_Comma css_ws fontFamilyName)* #ffNameList ;

fontFamilyName
   : CSS_String_ #ffNameStr
   | css_ident (css_ws css_ident)* #ffNameIdent ;


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