grammar GalaxyToolConfig;


command	:	text? IF text? ELSE text? ENDIF text?
	;
	
text	:	CHAR+
	;	
	
IF	:	'#if'
	;
	
ELSE	:	'#else'
	;
	
ENDIF 	:	'#end if'
	;

// CHAR	:	('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'.'|'$'|'{'|'}'|'='|'"'|'-'|':'|';')
// 	;


CHAR	:	~(' '|'\t'|'\r'|'\n')
	;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
    
