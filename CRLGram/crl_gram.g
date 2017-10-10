grammar crl_gram;

options {
	language=Java;
	TokenLabelType=CommonToken;
	output=AST;
	ASTLabelType=CommonTree;
	//backtrack=true;
}

tokens
{	
	CRL;
	J_Expression;
	Constraint;
	Condition;
	Conditions;
	Action;
	Actions;
	Set_mark;
	Java_string_expr;
	J_expr;
	Ident_token;
}
//parser

crl
	:	crl_rule+ -> ^(CRL crl_rule+)
	;
crl_rule
	:	'rule #' J_int_literal 'lock-on-active'? EOL
		'when' EOL 
		condition+
		'then' EOL
		action+
		'end' EOL? -> ^(J_int_literal ^(Conditions condition+) ^(Actions action+))
	;
condition
	:	query identifier constraints? EOL? -> ^(Condition query identifier constraints?)
	;
query
	:	'cell'|'entry'|'label'|'category'|'no cells'|'no labels'|'no entries'|'no categories'
	;
constraints
	:	':' j_expr (',' j_expr)* EOL -> ^(Constraint j_expr)+
	;
j_expr returns [String value]
	:	i=j_expr_ { $value=$i.value; }-> J_Expression [$i.value] //^(J_Expression j_expr_)
	;
/*j_expr_ returns [String value]
@init	{$value="";}
	:	( i=j_expr_sym { $value+=$i.value; } )*
	;*/
j_expr_ returns [String value]
@init	{$value="";}
	:	 (i=  ~(','|'"'|':'|'to'|'as'|'of'|'with'|EOL) { $value+=$i.text; })* //-> J_Expression [$value]
	;
action
	:	action_ EOL -> ^(Action action_)
	;
action_
	:	set_mark
		|set_text
		|set_indent
		|split
		|merge
		|new_label
		|add_label
		|set_category
		|set_parent
		|new_entry
		|group
		|c_print
		|update
	;
set_mark
	:	'set mark' j_expr 'to' identifier
	;
set_text
	:	'set text' j_expr 'to' identifier
	;
set_indent
	:	'set indent' J_int_literal 'to' identifier
	;
split
	:	'split' identifier
	;
merge
	:	'merge' identifier 'with' identifier
	;
new_entry
	:	'new entry' identifier ('as' j_expr)?
	;
set_value
	:	'set value' j_expr 'to' identifier 
	;
set_category
	:	'set category' identifier 'to' identifier
	;
set_parent
	:	'set parent' identifier 'to' identifier
	;
group
	:	'group' identifier 'with' identifier
	;
add_label
	:	'add label' identifier ('of' identifier)? 'to' identifier
	;
new_label
	:	'new label' identifier ('as' j_expr)?
	;
update
	:	'update' identifier
	;
c_print
	:	('print'|'printf') j_expr
	;
identifier returns [String value]
@init { $value=""; }
	: 	Identifier { $value=$Identifier.text; }('.' i=j_expr { $value+="."+$i.value;} )? -> Ident_token [$value]
	;

//lexer
WS
	:	 (' ')+ { $channel=HIDDEN; } 
	;
//S	:	' '	;
EOL
	:	('\n'|'\r')+
	;
J_int_literal
	:	DIGIT+
	;
Other_literals
	:	'='|'!'|'?'|'|'|'>'|'<'|'.'
	;
Identifier
	:	('$'|'_'|LETTER)('$'|'_'|LETTER|DIGIT)*
	;
String_lit
	:	'"' (.)* '"'
	;

Char_lit
	:	'\'' (.) '\''
	;
Breackits
	:	'('|')'
	;
/*lockonactive
	:	'lockonactive'
	;*/
fragment DIGIT
	:	'0'..'9'
	;
fragment LETTER
	:	'A'..'Z'|'a'..'z'
	;