grammar GalaxyToolConfig;
options {output=AST;}

command	:	binary (ifstatement param+ (ELSE param+)? ENDIF | param)*
	;
	
binary 	:	WORD
	;

ifstatement 
	:	IF (STRING|VARIABLE) EQTEST (STRING|VARIABLE) COLON
	;

param 	:	DBLDASH WORD* EQ (VARIABLE|STRING)
	;
	
WORD	:	('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'.'|'_'|'0'..'9')*
	;

VARIABLE 
	:	'$'('{')?WORD('}')?
	;

STRING	:	'"'('a'..'z'|'A'..'Z')+'"'
	;

IF	:	'#if'
	;

ELSE	:	'#else'
	;
	
ENDIF 	:	'#end if'
	;
	
EQ	:	'='
	;

EQTEST 	:	'=='
	;
	
DBLDASH	:	'--'
	;
	
COLON 	:	':'
	;
	
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
    
