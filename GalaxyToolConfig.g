grammar GalaxyToolConfig;
options {output=AST;}

command	:	text? IF^ text? (ELSE^ text? (ENDIF^ text?))
	;
	
text 	:	WORD+
	;	
	
IF	:	'#if'
	;
	
ELSE	:	'#else'
	;
	
ENDIF 	:	'#end if'
	;

// CHAR	:	('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'.'|'$'|'{'|'}'|'='|'"'|'-'|':'|';')
// 	;


WORD	:	(~(' '|'\t'|'\r'|'\n'))+
	;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
    
