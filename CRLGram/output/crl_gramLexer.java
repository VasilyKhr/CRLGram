// $ANTLR 3.5.1 C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g 2017-10-10 13:34:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class crl_gramLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int Action=4;
	public static final int Actions=5;
	public static final int Breackits=6;
	public static final int CRL=7;
	public static final int Char_lit=8;
	public static final int Condition=9;
	public static final int Conditions=10;
	public static final int Constraint=11;
	public static final int DIGIT=12;
	public static final int EOL=13;
	public static final int Ident_token=14;
	public static final int Identifier=15;
	public static final int J_Expression=16;
	public static final int J_expr=17;
	public static final int J_int_literal=18;
	public static final int Java_string_expr=19;
	public static final int LETTER=20;
	public static final int Other_literals=21;
	public static final int Set_mark=22;
	public static final int String_lit=23;
	public static final int WS=24;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public crl_gramLexer() {} 
	public crl_gramLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public crl_gramLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g"; }

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:8:7: ( '\"' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:8:9: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:9:7: ( ',' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:9:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:10:7: ( '.' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:10:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:11:7: ( ':' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:11:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:12:7: ( 'add label' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:12:9: 'add label'
			{
			match("add label"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:13:7: ( 'as' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:13:9: 'as'
			{
			match("as"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:14:7: ( 'category' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:14:9: 'category'
			{
			match("category"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:15:7: ( 'cell' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:15:9: 'cell'
			{
			match("cell"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:16:7: ( 'end' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:16:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:17:7: ( 'entry' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:17:9: 'entry'
			{
			match("entry"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:18:7: ( 'group' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:18:9: 'group'
			{
			match("group"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:19:7: ( 'label' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:19:9: 'label'
			{
			match("label"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:20:7: ( 'lock-on-active' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:20:9: 'lock-on-active'
			{
			match("lock-on-active"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:21:7: ( 'merge' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:21:9: 'merge'
			{
			match("merge"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:22:7: ( 'new entry' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:22:9: 'new entry'
			{
			match("new entry"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:23:7: ( 'new label' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:23:9: 'new label'
			{
			match("new label"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:24:7: ( 'no categories' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:24:9: 'no categories'
			{
			match("no categories"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:25:7: ( 'no cells' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:25:9: 'no cells'
			{
			match("no cells"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:26:7: ( 'no entries' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:26:9: 'no entries'
			{
			match("no entries"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:27:7: ( 'no labels' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:27:9: 'no labels'
			{
			match("no labels"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:28:7: ( 'of' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:28:9: 'of'
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:29:7: ( 'print' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:29:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:30:7: ( 'printf' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:30:9: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:31:7: ( 'rule #' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:31:9: 'rule #'
			{
			match("rule #"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:32:7: ( 'set category' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:32:9: 'set category'
			{
			match("set category"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:33:7: ( 'set indent' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:33:9: 'set indent'
			{
			match("set indent"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:34:7: ( 'set mark' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:34:9: 'set mark'
			{
			match("set mark"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:35:7: ( 'set parent' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:35:9: 'set parent'
			{
			match("set parent"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:36:7: ( 'set text' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:36:9: 'set text'
			{
			match("set text"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:37:7: ( 'set value' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:37:9: 'set value'
			{
			match("set value"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:38:7: ( 'split' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:38:9: 'split'
			{
			match("split"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:39:7: ( 'then' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:39:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:40:7: ( 'to' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:40:9: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:41:7: ( 'update' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:41:9: 'update'
			{
			match("update"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:42:7: ( 'when' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:42:9: 'when'
			{
			match("when"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:43:7: ( 'with' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:43:9: 'with'
			{
			match("with"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:125:2: ( ( ' ' )+ )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:125:5: ( ' ' )+
			{
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:125:5: ( ' ' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:125:6: ' '
					{
					match(' '); 
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "EOL"
	public final void mEOL() throws RecognitionException {
		try {
			int _type = EOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:129:2: ( ( '\\n' | '\\r' )+ )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:129:4: ( '\\n' | '\\r' )+
			{
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:129:4: ( '\\n' | '\\r' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\n'||LA2_0=='\r') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:
					{
					if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EOL"

	// $ANTLR start "J_int_literal"
	public final void mJ_int_literal() throws RecognitionException {
		try {
			int _type = J_int_literal;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:132:2: ( ( DIGIT )+ )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:132:4: ( DIGIT )+
			{
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:132:4: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "J_int_literal"

	// $ANTLR start "Other_literals"
	public final void mOther_literals() throws RecognitionException {
		try {
			int _type = Other_literals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:135:2: ( '=' | '!' | '?' | '|' | '>' | '<' | '.' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)=='.'||(input.LA(1) >= '<' && input.LA(1) <= '?')||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Other_literals"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:138:2: ( ( '$' | '_' | LETTER ) ( '$' | '_' | LETTER | DIGIT )* )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:138:4: ( '$' | '_' | LETTER ) ( '$' | '_' | LETTER | DIGIT )*
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:138:20: ( '$' | '_' | LETTER | DIGIT )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='$'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "String_lit"
	public final void mString_lit() throws RecognitionException {
		try {
			int _type = String_lit;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:141:2: ( '\"' ( . )* '\"' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:141:4: '\"' ( . )* '\"'
			{
			match('\"'); 
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:141:8: ( . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\"') ) {
					alt5=2;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:141:9: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "String_lit"

	// $ANTLR start "Char_lit"
	public final void mChar_lit() throws RecognitionException {
		try {
			int _type = Char_lit;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:145:2: ( '\\'' ( . ) '\\'' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:145:4: '\\'' ( . ) '\\''
			{
			match('\''); 
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:145:9: ( . )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:145:10: .
			{
			matchAny(); 
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Char_lit"

	// $ANTLR start "Breackits"
	public final void mBreackits() throws RecognitionException {
		try {
			int _type = Breackits;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:148:2: ( '(' | ')' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:
			{
			if ( (input.LA(1) >= '(' && input.LA(1) <= ')') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Breackits"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:154:2: ( '0' .. '9' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:157:2: ( 'A' .. 'Z' | 'a' .. 'z' )
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:8: ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | WS | EOL | J_int_literal | Other_literals | Identifier | String_lit | Char_lit | Breackits )
		int alt6=44;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:10: T__25
				{
				mT__25(); 

				}
				break;
			case 2 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:16: T__26
				{
				mT__26(); 

				}
				break;
			case 3 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:22: T__27
				{
				mT__27(); 

				}
				break;
			case 4 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:28: T__28
				{
				mT__28(); 

				}
				break;
			case 5 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:34: T__29
				{
				mT__29(); 

				}
				break;
			case 6 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:40: T__30
				{
				mT__30(); 

				}
				break;
			case 7 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:46: T__31
				{
				mT__31(); 

				}
				break;
			case 8 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:52: T__32
				{
				mT__32(); 

				}
				break;
			case 9 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:58: T__33
				{
				mT__33(); 

				}
				break;
			case 10 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:64: T__34
				{
				mT__34(); 

				}
				break;
			case 11 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:70: T__35
				{
				mT__35(); 

				}
				break;
			case 12 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:76: T__36
				{
				mT__36(); 

				}
				break;
			case 13 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:82: T__37
				{
				mT__37(); 

				}
				break;
			case 14 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:88: T__38
				{
				mT__38(); 

				}
				break;
			case 15 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:94: T__39
				{
				mT__39(); 

				}
				break;
			case 16 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:100: T__40
				{
				mT__40(); 

				}
				break;
			case 17 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:106: T__41
				{
				mT__41(); 

				}
				break;
			case 18 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:112: T__42
				{
				mT__42(); 

				}
				break;
			case 19 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:118: T__43
				{
				mT__43(); 

				}
				break;
			case 20 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:124: T__44
				{
				mT__44(); 

				}
				break;
			case 21 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:130: T__45
				{
				mT__45(); 

				}
				break;
			case 22 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:136: T__46
				{
				mT__46(); 

				}
				break;
			case 23 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:142: T__47
				{
				mT__47(); 

				}
				break;
			case 24 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:148: T__48
				{
				mT__48(); 

				}
				break;
			case 25 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:154: T__49
				{
				mT__49(); 

				}
				break;
			case 26 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:160: T__50
				{
				mT__50(); 

				}
				break;
			case 27 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:166: T__51
				{
				mT__51(); 

				}
				break;
			case 28 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:172: T__52
				{
				mT__52(); 

				}
				break;
			case 29 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:178: T__53
				{
				mT__53(); 

				}
				break;
			case 30 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:184: T__54
				{
				mT__54(); 

				}
				break;
			case 31 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:190: T__55
				{
				mT__55(); 

				}
				break;
			case 32 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:196: T__56
				{
				mT__56(); 

				}
				break;
			case 33 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:202: T__57
				{
				mT__57(); 

				}
				break;
			case 34 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:208: T__58
				{
				mT__58(); 

				}
				break;
			case 35 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:214: T__59
				{
				mT__59(); 

				}
				break;
			case 36 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:220: T__60
				{
				mT__60(); 

				}
				break;
			case 37 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:226: WS
				{
				mWS(); 

				}
				break;
			case 38 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:229: EOL
				{
				mEOL(); 

				}
				break;
			case 39 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:233: J_int_literal
				{
				mJ_int_literal(); 

				}
				break;
			case 40 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:247: Other_literals
				{
				mOther_literals(); 

				}
				break;
			case 41 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:262: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 42 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:273: String_lit
				{
				mString_lit(); 

				}
				break;
			case 43 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:284: Char_lit
				{
				mChar_lit(); 

				}
				break;
			case 44 :
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:1:293: Breackits
				{
				mBreackits(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\1\uffff\1\32\3\uffff\16\27\12\uffff\1\27\1\63\11\27\1\76\5\27\1\104\4"+
		"\27\1\uffff\2\27\1\113\6\27\2\uffff\5\27\1\uffff\3\27\1\uffff\1\27\1\136"+
		"\1\uffff\5\27\4\uffff\2\27\1\uffff\1\27\1\161\1\27\1\163\1\164\1\27\1"+
		"\uffff\1\166\1\167\1\170\1\uffff\1\171\4\uffff\1\173\7\uffff\1\174\1\uffff"+
		"\1\27\2\uffff\1\27\4\uffff\1\177\2\uffff\1\u0080\1\27\2\uffff\1\u0082"+
		"\1\uffff";
	static final String DFA6_eofS =
		"\u0083\uffff";
	static final String DFA6_minS =
		"\1\12\1\0\3\uffff\1\144\1\141\1\156\1\162\1\141\2\145\1\146\1\162\1\165"+
		"\1\145\1\150\1\160\1\150\12\uffff\1\144\1\44\1\164\1\154\1\144\1\157\1"+
		"\142\1\143\1\162\1\167\1\40\1\44\1\151\1\154\1\164\1\154\1\145\1\44\1"+
		"\144\1\145\1\164\1\40\1\uffff\1\145\1\154\1\44\1\162\1\165\1\145\1\153"+
		"\1\147\1\40\1\143\1\uffff\1\156\1\145\1\40\1\151\1\156\1\uffff\1\141\1"+
		"\156\1\150\1\uffff\1\147\1\44\1\uffff\1\171\1\160\1\154\1\55\2\145\1\141"+
		"\2\uffff\1\164\1\40\1\143\1\164\1\44\1\164\2\44\1\157\1\uffff\3\44\1\uffff"+
		"\1\44\4\uffff\1\44\7\uffff\1\44\1\uffff\1\145\2\uffff\1\162\4\uffff\1"+
		"\44\2\uffff\1\44\1\171\2\uffff\1\44\1\uffff";
	static final String DFA6_maxS =
		"\1\174\1\uffff\3\uffff\1\163\1\145\1\156\1\162\1\157\1\145\1\157\1\146"+
		"\1\162\1\165\1\160\1\157\1\160\1\151\12\uffff\1\144\1\172\1\164\1\154"+
		"\1\164\1\157\1\142\1\143\1\162\1\167\1\40\1\172\1\151\1\154\1\164\1\154"+
		"\1\145\1\172\1\144\1\145\1\164\1\40\1\uffff\1\145\1\154\1\172\1\162\1"+
		"\165\1\145\1\153\1\147\1\40\1\154\1\uffff\1\156\1\145\1\40\1\151\1\156"+
		"\1\uffff\1\141\1\156\1\150\1\uffff\1\147\1\172\1\uffff\1\171\1\160\1\154"+
		"\1\55\1\145\1\154\1\145\2\uffff\1\164\1\40\1\166\1\164\1\172\1\164\2\172"+
		"\1\157\1\uffff\3\172\1\uffff\1\172\4\uffff\1\172\7\uffff\1\172\1\uffff"+
		"\1\145\2\uffff\1\162\4\uffff\1\172\2\uffff\1\172\1\171\2\uffff\1\172\1"+
		"\uffff";
	static final String DFA6_acceptS =
		"\2\uffff\1\2\1\3\1\4\16\uffff\1\45\1\46\1\47\1\50\1\51\1\53\1\54\1\1\1"+
		"\52\1\3\26\uffff\1\6\12\uffff\1\25\5\uffff\1\41\3\uffff\1\5\2\uffff\1"+
		"\11\7\uffff\1\23\1\24\11\uffff\1\10\3\uffff\1\15\1\uffff\1\17\1\20\1\21"+
		"\1\22\1\uffff\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\uffff\1\40\1\uffff"+
		"\1\43\1\44\1\uffff\1\12\1\13\1\14\1\16\1\uffff\1\26\1\37\2\uffff\1\27"+
		"\1\42\1\uffff\1\7";
	static final String DFA6_specialS =
		"\1\uffff\1\0\u0081\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\24\2\uffff\1\24\22\uffff\1\23\1\26\1\1\1\uffff\1\27\2\uffff\1\30\2"+
			"\31\2\uffff\1\2\1\uffff\1\3\1\uffff\12\25\1\4\1\uffff\4\26\1\uffff\32"+
			"\27\4\uffff\1\27\1\uffff\1\5\1\27\1\6\1\27\1\7\1\27\1\10\4\27\1\11\1"+
			"\12\1\13\1\14\1\15\1\27\1\16\1\17\1\20\1\21\1\27\1\22\3\27\1\uffff\1"+
			"\26",
			"\0\33",
			"",
			"",
			"",
			"\1\35\16\uffff\1\36",
			"\1\37\3\uffff\1\40",
			"\1\41",
			"\1\42",
			"\1\43\15\uffff\1\44",
			"\1\45",
			"\1\46\11\uffff\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53\12\uffff\1\54",
			"\1\55\6\uffff\1\56",
			"\1\57",
			"\1\60\1\61",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\64",
			"\1\65",
			"\1\66\17\uffff\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"\1\111",
			"\1\112",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122\1\uffff\1\123\6\uffff\1\124",
			"",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"",
			"\1\132",
			"\1\133",
			"\1\134",
			"",
			"\1\135",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144\6\uffff\1\145",
			"\1\146\3\uffff\1\147",
			"",
			"",
			"\1\150",
			"\1\151",
			"\1\152\5\uffff\1\153\3\uffff\1\154\2\uffff\1\155\3\uffff\1\156\1\uffff"+
			"\1\157",
			"\1\160",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\162",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\165",
			"",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"",
			"",
			"",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\5\27\1\172\24"+
			"\27",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\1\175",
			"",
			"",
			"\1\176",
			"",
			"",
			"",
			"",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\u0081",
			"",
			"",
			"\1\27\13\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | WS | EOL | J_int_literal | Other_literals | Identifier | String_lit | Char_lit | Breackits );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA6_1 = input.LA(1);
						s = -1;
						if ( ((LA6_1 >= '\u0000' && LA6_1 <= '\uFFFF')) ) {s = 27;}
						else s = 26;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 6, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
