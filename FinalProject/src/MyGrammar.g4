grammar MyGrammar;

prog: action+ ;
action: setVar | calcStep ;

setVar: IDENTIFIER assignOp computation ;
calcStep: computation (mathOp=OPS computation)* ;

computation
    : '(' computation ')'
    | computation '*' computation 
    | computation '/' computation 
    | computation '%' computation 
    | computation '+' computation
    | computation '-' computation
    | IDENTIFIER	//variable reference
    | VALUE_NUM		//integer or floating point number
    | QUOTED_TEXT	//quoted text (strings)
    | BOOLEAN		//T/F
    | listValues	//lists
    ;

listValues
    : '[' items? ']'
    ;

items
    : computation (',' computation)* //Elements separated by commas
    ;


OPS:'ADD'|'SUBTRACT'|'MULTIPLY'|'DIVIDE'|'MODULO' ; //Operator definitions
assignOp: EQUALS |'PLUSEQ'|'MINUSEQ'|'MULTEQ'|'DIVEQ';

EQUALS: '=';
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]*;
VALUE_NUM: SERIES_OF_DIGITS+ ('.' SERIES_OF_DIGITS+)?;
QUOTED_TEXT: D_QUOTE (~["\r\n])* D_QUOTE | S_QUOTE (~['\r\n])* S_QUOTE;
BOOLEAN: 'True' | 'False';


IGNORE_SPACES: [ \t\r\n]+ -> skip ;


fragment SERIES_OF_DIGITS: [0-9] ;
fragment D_QUOTE: '"' ;
fragment S_QUOTE: '\'' ;
