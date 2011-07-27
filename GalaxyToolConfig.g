grammar GalaxyToolConfig;
options {output=AST;}

command	:	binary (ifstatement param+ (ELSE param+)? ENDIF | param)*
	;
	
binary 	:	WORD
	;

ifstatement 
	:	IF ( STRING | VARIABLE ) EQTEST ( STRING | VARIABLE )(COLON)
	;

param 	:	(DBLDASH)(WORD)*(EQ)(VARIABLE|STRING)
	;
	
text 	:	WORD+
	;	
	
IF	:	'#if'
	;

ELSE	:	'#else'
	;
	
ENDIF 	:	'#end if'
	;
	
EQTEST 	:	'=='
	;
	
	
DBLDASH	:	'--'
	;
	
EQ	:	'='
	;
	
COLON 	:	':'
	;
	
	
STRING	:	'"'('a'..'z'|'A'..'Z')+'"'
	;
	
VARIABLE 
	:	'$'('{')?WORD('}')?
	;
	
WORD	:	('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'.'|'_'|'0'..'9')*
	;
	
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
    
