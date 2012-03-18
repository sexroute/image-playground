grammar ScriptGrammar;

// to generate Java source: java -cp /path/to/antlr.jar org.antlr.Tool ScriptGrammar.g

options {
    output=AST;
    ASTLabelType=CommonTree; // type of $stat.tree ref etc...
}

tokens {
    CALL;
    NEG;
}

@header  {
package com.google.imageplayground.parser;
}
@lexer::header  {
package com.google.imageplayground.parser;
}

prog:   (stat)+ ;

stat:   expr NEWLINE        -> expr
    |   TYPE assign -> ^(TYPE assign)
    |   assign
    |   retexp
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

TYPE: ('int'|'long'|'float'|'double'|'boolean') ;
ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;