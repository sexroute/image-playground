grammar ScriptGrammar;

// to generate Java source: java -cp /path/to/antlr.jar org.antlr.Tool ScriptGrammar.g

options {
    output=AST;
    ASTLabelType=CommonTree; // type of $stat.tree ref etc...
    backtrack = false;
}

tokens {
    CALL;
    NEG;
    BLOCK;
}

@header  {
package com.google.imageplayground.parser;
}
@lexer::header  {
package com.google.imageplayground.parser;
}

prog:   (block)+ ;

block: '{' NEWLINE block* '}' -> ^(BLOCK block*)
    |  stat
    ;

stat:   expr NEWLINE        -> expr
    |   TYPE assign -> ^(TYPE assign)
    |   assign
    |   retexp
    |   ifexp
    |   whileexp
    |   forexp
    |   NEWLINE             ->
    ;
    
assign: ID '=' expr NEWLINE -> ^('=' ID expr)
    ;
    
retexp: 'return' expr NEWLINE -> ^('return' expr)
    ;
    
expr:   multExpr (('+'^|'-'^|'&'^|'|'^|'>>'^|'<<'^|'<<<'^) multExpr)*
    ; 

multExpr
    :   unaryExp (('*'^|'/'^|'%'^) unaryExp)*
    ; 
    
unaryExp
    :   '-' atom -> ^(NEG atom)
    |   '~' atom -> ^('~' atom)
    |   atom
    ;
    
atom:   INT 
    |   ID
    |   '('! expr ')'!
    |   funcall
    ;

funcall: ID '(' expr (',' expr)* ')'-> ^(CALL ID expr*)
    ;

ifexp:  'if' boolexp block -> ^('if' boolexp block)
    ;
    
whileexp:  'while' boolexp block -> ^('while' boolexp block)
    ;
    
boolexp:  boolterm ('=='^|'!='^|'>'^|'>='^|'<'^|'<=') boolterm
    ;

boolterm: (ID|INT)
    ;
    
forexp: 'for' ID ',' forterm block -> ^('for' ID forterm block)
    ;
    
forterm: (ID|INT)
    ;

TYPE: ('int'|'long'|'float'|'double'|'boolean') ;
ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;