// $ANTLR 3.5.1 C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g 2017-10-10 13:34:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class crl_gramParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Action", "Actions", "Breackits", 
		"CRL", "Char_lit", "Condition", "Conditions", "Constraint", "DIGIT", "EOL", 
		"Ident_token", "Identifier", "J_Expression", "J_expr", "J_int_literal", 
		"Java_string_expr", "LETTER", "Other_literals", "Set_mark", "String_lit", 
		"WS", "'\"'", "','", "'.'", "':'", "'add label'", "'as'", "'category'", 
		"'cell'", "'end'", "'entry'", "'group'", "'label'", "'lock-on-active'", 
		"'merge'", "'new entry'", "'new label'", "'no categories'", "'no cells'", 
		"'no entries'", "'no labels'", "'of'", "'print'", "'printf'", "'rule #'", 
		"'set category'", "'set indent'", "'set mark'", "'set parent'", "'set text'", 
		"'set value'", "'split'", "'then'", "'to'", "'update'", "'when'", "'with'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "j_expr", "action_", "set_category", "crl_rule", "crl", 
		"constraints", "set_value", "set_parent", "j_expr_", "c_print", "identifier", 
		"new_entry", "group", "query", "set_indent", "action", "split", "merge", 
		"update", "set_mark", "new_label", "add_label", "condition", "set_text"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public crl_gramParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public crl_gramParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public crl_gramParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return crl_gramParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g"; }


	public static class crl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "crl"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:27:1: crl : ( crl_rule )+ -> ^( CRL ( crl_rule )+ ) ;
	public final crl_gramParser.crl_return crl() throws RecognitionException {
		crl_gramParser.crl_return retval = new crl_gramParser.crl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope crl_rule1 =null;

		RewriteRuleSubtreeStream stream_crl_rule=new RewriteRuleSubtreeStream(adaptor,"rule crl_rule");

		try { dbg.enterRule(getGrammarFileName(), "crl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:28:2: ( ( crl_rule )+ -> ^( CRL ( crl_rule )+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:28:4: ( crl_rule )+
			{
			dbg.location(28,4);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:28:4: ( crl_rule )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==48) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:28:4: crl_rule
					{
					dbg.location(28,4);
					pushFollow(FOLLOW_crl_rule_in_crl93);
					crl_rule1=crl_rule();
					state._fsp--;

					stream_crl_rule.add(crl_rule1.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}

			// AST REWRITE
			// elements: crl_rule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 28:14: -> ^( CRL ( crl_rule )+ )
			{
				dbg.location(28,17);
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:28:17: ^( CRL ( crl_rule )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(28,19);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CRL, "CRL"), root_1);
				dbg.location(28,23);
				if ( !(stream_crl_rule.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_crl_rule.hasNext() ) {
					dbg.location(28,23);
					adaptor.addChild(root_1, stream_crl_rule.nextTree());
				}
				stream_crl_rule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(29, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "crl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "crl"


	public static class crl_rule_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "crl_rule"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:30:1: crl_rule : 'rule #' J_int_literal ( 'lock-on-active' )? EOL 'when' EOL ( condition )+ 'then' EOL ( action )+ 'end' ( EOL )? -> ^( J_int_literal ^( Conditions ( condition )+ ) ^( Actions ( action )+ ) ) ;
	public final crl_gramParser.crl_rule_return crl_rule() throws RecognitionException {
		crl_gramParser.crl_rule_return retval = new crl_gramParser.crl_rule_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal2=null;
		CommonToken J_int_literal3=null;
		CommonToken string_literal4=null;
		CommonToken EOL5=null;
		CommonToken string_literal6=null;
		CommonToken EOL7=null;
		CommonToken string_literal9=null;
		CommonToken EOL10=null;
		CommonToken string_literal12=null;
		CommonToken EOL13=null;
		ParserRuleReturnScope condition8 =null;
		ParserRuleReturnScope action11 =null;

		CommonTree string_literal2_tree=null;
		CommonTree J_int_literal3_tree=null;
		CommonTree string_literal4_tree=null;
		CommonTree EOL5_tree=null;
		CommonTree string_literal6_tree=null;
		CommonTree EOL7_tree=null;
		CommonTree string_literal9_tree=null;
		CommonTree EOL10_tree=null;
		CommonTree string_literal12_tree=null;
		CommonTree EOL13_tree=null;
		RewriteRuleTokenStream stream_J_int_literal=new RewriteRuleTokenStream(adaptor,"token J_int_literal");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");

		try { dbg.enterRule(getGrammarFileName(), "crl_rule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:31:2: ( 'rule #' J_int_literal ( 'lock-on-active' )? EOL 'when' EOL ( condition )+ 'then' EOL ( action )+ 'end' ( EOL )? -> ^( J_int_literal ^( Conditions ( condition )+ ) ^( Actions ( action )+ ) ) )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:31:4: 'rule #' J_int_literal ( 'lock-on-active' )? EOL 'when' EOL ( condition )+ 'then' EOL ( action )+ 'end' ( EOL )?
			{
			dbg.location(31,4);
			string_literal2=(CommonToken)match(input,48,FOLLOW_48_in_crl_rule113);  
			stream_48.add(string_literal2);
			dbg.location(31,13);
			J_int_literal3=(CommonToken)match(input,J_int_literal,FOLLOW_J_int_literal_in_crl_rule115);  
			stream_J_int_literal.add(J_int_literal3);
			dbg.location(31,27);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:31:27: ( 'lock-on-active' )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==37) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:31:27: 'lock-on-active'
					{
					dbg.location(31,27);
					string_literal4=(CommonToken)match(input,37,FOLLOW_37_in_crl_rule117);  
					stream_37.add(string_literal4);

					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(31,45);
			EOL5=(CommonToken)match(input,EOL,FOLLOW_EOL_in_crl_rule120);  
			stream_EOL.add(EOL5);
			dbg.location(32,3);
			string_literal6=(CommonToken)match(input,59,FOLLOW_59_in_crl_rule124);  
			stream_59.add(string_literal6);
			dbg.location(32,10);
			EOL7=(CommonToken)match(input,EOL,FOLLOW_EOL_in_crl_rule126);  
			stream_EOL.add(EOL7);
			dbg.location(33,3);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:33:3: ( condition )+
			int cnt3=0;
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 31 && LA3_0 <= 32)||LA3_0==34||LA3_0==36||(LA3_0 >= 41 && LA3_0 <= 44)) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:33:3: condition
					{
					dbg.location(33,3);
					pushFollow(FOLLOW_condition_in_crl_rule131);
					condition8=condition();
					state._fsp--;

					stream_condition.add(condition8.getTree());
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt3++;
			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(34,3);
			string_literal9=(CommonToken)match(input,56,FOLLOW_56_in_crl_rule136);  
			stream_56.add(string_literal9);
			dbg.location(34,10);
			EOL10=(CommonToken)match(input,EOL,FOLLOW_EOL_in_crl_rule138);  
			stream_EOL.add(EOL10);
			dbg.location(35,3);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:35:3: ( action )+
			int cnt4=0;
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==29||LA4_0==35||(LA4_0 >= 38 && LA4_0 <= 40)||(LA4_0 >= 46 && LA4_0 <= 47)||(LA4_0 >= 49 && LA4_0 <= 53)||LA4_0==55||LA4_0==58) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:35:3: action
					{
					dbg.location(35,3);
					pushFollow(FOLLOW_action_in_crl_rule142);
					action11=action();
					state._fsp--;

					stream_action.add(action11.getTree());
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt4++;
			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(36,3);
			string_literal12=(CommonToken)match(input,33,FOLLOW_33_in_crl_rule147);  
			stream_33.add(string_literal12);
			dbg.location(36,9);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:36:9: ( EOL )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==EOL) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:36:9: EOL
					{
					dbg.location(36,9);
					EOL13=(CommonToken)match(input,EOL,FOLLOW_EOL_in_crl_rule149);  
					stream_EOL.add(EOL13);

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

			// AST REWRITE
			// elements: action, J_int_literal, condition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 36:14: -> ^( J_int_literal ^( Conditions ( condition )+ ) ^( Actions ( action )+ ) )
			{
				dbg.location(36,17);
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:36:17: ^( J_int_literal ^( Conditions ( condition )+ ) ^( Actions ( action )+ ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(36,19);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_J_int_literal.nextNode(), root_1);
				dbg.location(36,33);
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:36:33: ^( Conditions ( condition )+ )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				dbg.location(36,35);
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Conditions, "Conditions"), root_2);
				dbg.location(36,46);
				if ( !(stream_condition.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_condition.hasNext() ) {
					dbg.location(36,46);
					adaptor.addChild(root_2, stream_condition.nextTree());
				}
				stream_condition.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(36,58);
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:36:58: ^( Actions ( action )+ )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				dbg.location(36,60);
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Actions, "Actions"), root_2);
				dbg.location(36,68);
				if ( !(stream_action.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_action.hasNext() ) {
					dbg.location(36,68);
					adaptor.addChild(root_2, stream_action.nextTree());
				}
				stream_action.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(37, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "crl_rule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "crl_rule"


	public static class condition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:38:1: condition : query identifier ( constraints )? ( EOL )? -> ^( Condition query identifier ( constraints )? ) ;
	public final crl_gramParser.condition_return condition() throws RecognitionException {
		crl_gramParser.condition_return retval = new crl_gramParser.condition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken EOL17=null;
		ParserRuleReturnScope query14 =null;
		ParserRuleReturnScope identifier15 =null;
		ParserRuleReturnScope constraints16 =null;

		CommonTree EOL17_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
		RewriteRuleSubtreeStream stream_constraints=new RewriteRuleSubtreeStream(adaptor,"rule constraints");

		try { dbg.enterRule(getGrammarFileName(), "condition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:39:2: ( query identifier ( constraints )? ( EOL )? -> ^( Condition query identifier ( constraints )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:39:4: query identifier ( constraints )? ( EOL )?
			{
			dbg.location(39,4);
			pushFollow(FOLLOW_query_in_condition180);
			query14=query();
			state._fsp--;

			stream_query.add(query14.getTree());dbg.location(39,10);
			pushFollow(FOLLOW_identifier_in_condition182);
			identifier15=identifier();
			state._fsp--;

			stream_identifier.add(identifier15.getTree());dbg.location(39,21);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:39:21: ( constraints )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==28) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:39:21: constraints
					{
					dbg.location(39,21);
					pushFollow(FOLLOW_constraints_in_condition184);
					constraints16=constraints();
					state._fsp--;

					stream_constraints.add(constraints16.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(39,34);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:39:34: ( EOL )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==EOL) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:39:34: EOL
					{
					dbg.location(39,34);
					EOL17=(CommonToken)match(input,EOL,FOLLOW_EOL_in_condition187);  
					stream_EOL.add(EOL17);

					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

			// AST REWRITE
			// elements: identifier, query, constraints
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 39:39: -> ^( Condition query identifier ( constraints )? )
			{
				dbg.location(39,42);
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:39:42: ^( Condition query identifier ( constraints )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(39,44);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Condition, "Condition"), root_1);
				dbg.location(39,54);
				adaptor.addChild(root_1, stream_query.nextTree());dbg.location(39,60);
				adaptor.addChild(root_1, stream_identifier.nextTree());dbg.location(39,71);
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:39:71: ( constraints )?
				if ( stream_constraints.hasNext() ) {
					dbg.location(39,71);
					adaptor.addChild(root_1, stream_constraints.nextTree());
				}
				stream_constraints.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(40, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "condition"


	public static class query_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:41:1: query : ( 'cell' | 'entry' | 'label' | 'category' | 'no cells' | 'no labels' | 'no entries' | 'no categories' );
	public final crl_gramParser.query_return query() throws RecognitionException {
		crl_gramParser.query_return retval = new crl_gramParser.query_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken set18=null;

		CommonTree set18_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "query");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:42:2: ( 'cell' | 'entry' | 'label' | 'category' | 'no cells' | 'no labels' | 'no entries' | 'no categories' )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(42,2);
			set18=(CommonToken)input.LT(1);
			if ( (input.LA(1) >= 31 && input.LA(1) <= 32)||input.LA(1)==34||input.LA(1)==36||(input.LA(1) >= 41 && input.LA(1) <= 44) ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set18));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(43, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "query");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "query"


	public static class constraints_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constraints"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:44:1: constraints : ':' j_expr ( ',' j_expr )* EOL -> ( ^( Constraint j_expr ) )+ ;
	public final crl_gramParser.constraints_return constraints() throws RecognitionException {
		crl_gramParser.constraints_return retval = new crl_gramParser.constraints_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken char_literal19=null;
		CommonToken char_literal21=null;
		CommonToken EOL23=null;
		ParserRuleReturnScope j_expr20 =null;
		ParserRuleReturnScope j_expr22 =null;

		CommonTree char_literal19_tree=null;
		CommonTree char_literal21_tree=null;
		CommonTree EOL23_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_j_expr=new RewriteRuleSubtreeStream(adaptor,"rule j_expr");

		try { dbg.enterRule(getGrammarFileName(), "constraints");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:45:2: ( ':' j_expr ( ',' j_expr )* EOL -> ( ^( Constraint j_expr ) )+ )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:45:4: ':' j_expr ( ',' j_expr )* EOL
			{
			dbg.location(45,4);
			char_literal19=(CommonToken)match(input,28,FOLLOW_28_in_constraints235);  
			stream_28.add(char_literal19);
			dbg.location(45,8);
			pushFollow(FOLLOW_j_expr_in_constraints237);
			j_expr20=j_expr();
			state._fsp--;

			stream_j_expr.add(j_expr20.getTree());dbg.location(45,15);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:45:15: ( ',' j_expr )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==26) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:45:16: ',' j_expr
					{
					dbg.location(45,16);
					char_literal21=(CommonToken)match(input,26,FOLLOW_26_in_constraints240);  
					stream_26.add(char_literal21);
					dbg.location(45,20);
					pushFollow(FOLLOW_j_expr_in_constraints242);
					j_expr22=j_expr();
					state._fsp--;

					stream_j_expr.add(j_expr22.getTree());
					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(45,29);
			EOL23=(CommonToken)match(input,EOL,FOLLOW_EOL_in_constraints246);  
			stream_EOL.add(EOL23);

			// AST REWRITE
			// elements: j_expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 45:33: -> ( ^( Constraint j_expr ) )+
			{
				dbg.location(45,36);
				if ( !(stream_j_expr.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_j_expr.hasNext() ) {
					dbg.location(45,36);
					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:45:36: ^( Constraint j_expr )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					dbg.location(45,38);
					root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Constraint, "Constraint"), root_1);
					dbg.location(45,49);
					adaptor.addChild(root_1, stream_j_expr.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_j_expr.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(46, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constraints");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "constraints"


	public static class j_expr_return extends ParserRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "j_expr"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:47:1: j_expr returns [String value] : i= j_expr_ -> J_Expression[$i.value] ;
	public final crl_gramParser.j_expr_return j_expr() throws RecognitionException {
		crl_gramParser.j_expr_return retval = new crl_gramParser.j_expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope i =null;

		RewriteRuleSubtreeStream stream_j_expr_=new RewriteRuleSubtreeStream(adaptor,"rule j_expr_");

		try { dbg.enterRule(getGrammarFileName(), "j_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:48:2: (i= j_expr_ -> J_Expression[$i.value] )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:48:4: i= j_expr_
			{
			dbg.location(48,5);
			pushFollow(FOLLOW_j_expr__in_j_expr271);
			i=j_expr_();
			state._fsp--;

			stream_j_expr_.add(i.getTree());dbg.location(48,14);
			 retval.value =(i!=null?((crl_gramParser.j_expr__return)i).value:null); 
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 48:34: -> J_Expression[$i.value]
			{
				dbg.location(48,37);
				adaptor.addChild(root_0, (CommonTree)adaptor.create(J_Expression, (i!=null?((crl_gramParser.j_expr__return)i).value:null)));
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(49, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "j_expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "j_expr"


	public static class j_expr__return extends ParserRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "j_expr_"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:54:1: j_expr_ returns [String value] : (i=~ ( ',' | '\"' | ':' | 'to' | 'as' | 'of' | 'with' | EOL ) )* ;
	public final crl_gramParser.j_expr__return j_expr_() throws RecognitionException {
		crl_gramParser.j_expr__return retval = new crl_gramParser.j_expr__return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken i=null;

		CommonTree i_tree=null;

		retval.value ="";
		try { dbg.enterRule(getGrammarFileName(), "j_expr_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:56:2: ( (i=~ ( ',' | '\"' | ':' | 'to' | 'as' | 'of' | 'with' | EOL ) )* )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:56:5: (i=~ ( ',' | '\"' | ':' | 'to' | 'as' | 'of' | 'with' | EOL ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(56,5);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:56:5: (i=~ ( ',' | '\"' | ':' | 'to' | 'as' | 'of' | 'with' | EOL ) )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				switch ( input.LA(1) ) {
				case 56:
					{
					int LA9_2 = input.LA(2);
					if ( (LA9_2==EOF||LA9_2==EOL||LA9_2==26||LA9_2==28||(LA9_2 >= 30 && LA9_2 <= 32)||LA9_2==34||LA9_2==36||(LA9_2 >= 41 && LA9_2 <= 45)||(LA9_2 >= 56 && LA9_2 <= 57)||LA9_2==60) ) {
						alt9=1;
					}
					else if ( ((LA9_2 >= Action && LA9_2 <= DIGIT)||(LA9_2 >= Ident_token && LA9_2 <= WS)||LA9_2==27||LA9_2==29||LA9_2==33||LA9_2==35||(LA9_2 >= 37 && LA9_2 <= 40)||(LA9_2 >= 46 && LA9_2 <= 55)||(LA9_2 >= 58 && LA9_2 <= 59)) ) {
						alt9=1;
					}

					}
					break;
				case 31:
				case 32:
				case 34:
				case 36:
				case 41:
				case 42:
				case 43:
				case 44:
					{
					int LA9_3 = input.LA(2);
					if ( (LA9_3==EOF||LA9_3==EOL||LA9_3==Identifier||LA9_3==26||LA9_3==28||(LA9_3 >= 30 && LA9_3 <= 32)||LA9_3==34||LA9_3==36||(LA9_3 >= 41 && LA9_3 <= 45)||(LA9_3 >= 56 && LA9_3 <= 57)||LA9_3==60) ) {
						alt9=1;
					}
					else if ( ((LA9_3 >= Action && LA9_3 <= DIGIT)||LA9_3==Ident_token||(LA9_3 >= J_Expression && LA9_3 <= WS)||LA9_3==27||LA9_3==29||LA9_3==33||LA9_3==35||(LA9_3 >= 37 && LA9_3 <= 40)||(LA9_3 >= 46 && LA9_3 <= 55)||(LA9_3 >= 58 && LA9_3 <= 59)) ) {
						alt9=1;
					}

					}
					break;
				case Action:
				case Actions:
				case Breackits:
				case CRL:
				case Char_lit:
				case Condition:
				case Conditions:
				case Constraint:
				case DIGIT:
				case Ident_token:
				case Identifier:
				case J_Expression:
				case J_expr:
				case J_int_literal:
				case Java_string_expr:
				case LETTER:
				case Other_literals:
				case Set_mark:
				case String_lit:
				case WS:
				case 27:
				case 29:
				case 33:
				case 35:
				case 37:
				case 38:
				case 39:
				case 40:
				case 46:
				case 47:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 58:
				case 59:
					{
					alt9=1;
					}
					break;
				}
				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:56:6: i=~ ( ',' | '\"' | ':' | 'to' | 'as' | 'of' | 'with' | EOL )
					{
					dbg.location(56,7);
					i=(CommonToken)input.LT(1);
					if ( (input.LA(1) >= Action && input.LA(1) <= DIGIT)||(input.LA(1) >= Ident_token && input.LA(1) <= WS)||input.LA(1)==27||input.LA(1)==29||(input.LA(1) >= 31 && input.LA(1) <= 44)||(input.LA(1) >= 46 && input.LA(1) <= 56)||(input.LA(1) >= 58 && input.LA(1) <= 59) ) {
						input.consume();
						adaptor.addChild(root_0, (CommonTree)adaptor.create(i));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(56,51);
					 retval.value+=(i!=null?i.getText():null); 
					}
					break;

				default :
					break loop9;
				}
			}
			} finally {dbg.exitSubRule(9);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(57, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "j_expr_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "j_expr_"


	public static class action_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "action"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:58:1: action : action_ EOL -> ^( Action action_ ) ;
	public final crl_gramParser.action_return action() throws RecognitionException {
		crl_gramParser.action_return retval = new crl_gramParser.action_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken EOL25=null;
		ParserRuleReturnScope action_24 =null;

		CommonTree EOL25_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleSubtreeStream stream_action_=new RewriteRuleSubtreeStream(adaptor,"rule action_");

		try { dbg.enterRule(getGrammarFileName(), "action");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:59:2: ( action_ EOL -> ^( Action action_ ) )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:59:4: action_ EOL
			{
			dbg.location(59,4);
			pushFollow(FOLLOW_action__in_action338);
			action_24=action_();
			state._fsp--;

			stream_action_.add(action_24.getTree());dbg.location(59,12);
			EOL25=(CommonToken)match(input,EOL,FOLLOW_EOL_in_action340);  
			stream_EOL.add(EOL25);

			// AST REWRITE
			// elements: action_
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 59:16: -> ^( Action action_ )
			{
				dbg.location(59,19);
				// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:59:19: ^( Action action_ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(59,21);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Action, "Action"), root_1);
				dbg.location(59,28);
				adaptor.addChild(root_1, stream_action_.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(60, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "action");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "action"


	public static class action__return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "action_"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:61:1: action_ : ( set_mark | set_text | set_indent | split | merge | new_label | add_label | set_category | set_parent | new_entry | group | c_print | update );
	public final crl_gramParser.action__return action_() throws RecognitionException {
		crl_gramParser.action__return retval = new crl_gramParser.action__return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope set_mark26 =null;
		ParserRuleReturnScope set_text27 =null;
		ParserRuleReturnScope set_indent28 =null;
		ParserRuleReturnScope split29 =null;
		ParserRuleReturnScope merge30 =null;
		ParserRuleReturnScope new_label31 =null;
		ParserRuleReturnScope add_label32 =null;
		ParserRuleReturnScope set_category33 =null;
		ParserRuleReturnScope set_parent34 =null;
		ParserRuleReturnScope new_entry35 =null;
		ParserRuleReturnScope group36 =null;
		ParserRuleReturnScope c_print37 =null;
		ParserRuleReturnScope update38 =null;


		try { dbg.enterRule(getGrammarFileName(), "action_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:62:2: ( set_mark | set_text | set_indent | split | merge | new_label | add_label | set_category | set_parent | new_entry | group | c_print | update )
			int alt10=13;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case 51:
				{
				alt10=1;
				}
				break;
			case 53:
				{
				alt10=2;
				}
				break;
			case 50:
				{
				alt10=3;
				}
				break;
			case 55:
				{
				alt10=4;
				}
				break;
			case 38:
				{
				alt10=5;
				}
				break;
			case 40:
				{
				alt10=6;
				}
				break;
			case 29:
				{
				alt10=7;
				}
				break;
			case 49:
				{
				alt10=8;
				}
				break;
			case 52:
				{
				alt10=9;
				}
				break;
			case 39:
				{
				alt10=10;
				}
				break;
			case 35:
				{
				alt10=11;
				}
				break;
			case 46:
			case 47:
				{
				alt10=12;
				}
				break;
			case 58:
				{
				alt10=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:62:4: set_mark
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(62,4);
					pushFollow(FOLLOW_set_mark_in_action_358);
					set_mark26=set_mark();
					state._fsp--;

					adaptor.addChild(root_0, set_mark26.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:63:4: set_text
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(63,4);
					pushFollow(FOLLOW_set_text_in_action_363);
					set_text27=set_text();
					state._fsp--;

					adaptor.addChild(root_0, set_text27.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:64:4: set_indent
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(64,4);
					pushFollow(FOLLOW_set_indent_in_action_368);
					set_indent28=set_indent();
					state._fsp--;

					adaptor.addChild(root_0, set_indent28.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:65:4: split
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(65,4);
					pushFollow(FOLLOW_split_in_action_373);
					split29=split();
					state._fsp--;

					adaptor.addChild(root_0, split29.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:66:4: merge
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(66,4);
					pushFollow(FOLLOW_merge_in_action_378);
					merge30=merge();
					state._fsp--;

					adaptor.addChild(root_0, merge30.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:67:4: new_label
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(67,4);
					pushFollow(FOLLOW_new_label_in_action_383);
					new_label31=new_label();
					state._fsp--;

					adaptor.addChild(root_0, new_label31.getTree());

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:68:4: add_label
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(68,4);
					pushFollow(FOLLOW_add_label_in_action_388);
					add_label32=add_label();
					state._fsp--;

					adaptor.addChild(root_0, add_label32.getTree());

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:69:4: set_category
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(69,4);
					pushFollow(FOLLOW_set_category_in_action_393);
					set_category33=set_category();
					state._fsp--;

					adaptor.addChild(root_0, set_category33.getTree());

					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:70:4: set_parent
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(70,4);
					pushFollow(FOLLOW_set_parent_in_action_398);
					set_parent34=set_parent();
					state._fsp--;

					adaptor.addChild(root_0, set_parent34.getTree());

					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:71:4: new_entry
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(71,4);
					pushFollow(FOLLOW_new_entry_in_action_403);
					new_entry35=new_entry();
					state._fsp--;

					adaptor.addChild(root_0, new_entry35.getTree());

					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:72:4: group
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(72,4);
					pushFollow(FOLLOW_group_in_action_408);
					group36=group();
					state._fsp--;

					adaptor.addChild(root_0, group36.getTree());

					}
					break;
				case 12 :
					dbg.enterAlt(12);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:73:4: c_print
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(73,4);
					pushFollow(FOLLOW_c_print_in_action_413);
					c_print37=c_print();
					state._fsp--;

					adaptor.addChild(root_0, c_print37.getTree());

					}
					break;
				case 13 :
					dbg.enterAlt(13);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:74:4: update
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(74,4);
					pushFollow(FOLLOW_update_in_action_418);
					update38=update();
					state._fsp--;

					adaptor.addChild(root_0, update38.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "action_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "action_"


	public static class set_mark_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_mark"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:76:1: set_mark : 'set mark' j_expr 'to' identifier ;
	public final crl_gramParser.set_mark_return set_mark() throws RecognitionException {
		crl_gramParser.set_mark_return retval = new crl_gramParser.set_mark_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal39=null;
		CommonToken string_literal41=null;
		ParserRuleReturnScope j_expr40 =null;
		ParserRuleReturnScope identifier42 =null;

		CommonTree string_literal39_tree=null;
		CommonTree string_literal41_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "set_mark");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:77:2: ( 'set mark' j_expr 'to' identifier )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:77:4: 'set mark' j_expr 'to' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(77,4);
			string_literal39=(CommonToken)match(input,51,FOLLOW_51_in_set_mark428); 
			string_literal39_tree = (CommonTree)adaptor.create(string_literal39);
			adaptor.addChild(root_0, string_literal39_tree);
			dbg.location(77,15);
			pushFollow(FOLLOW_j_expr_in_set_mark430);
			j_expr40=j_expr();
			state._fsp--;

			adaptor.addChild(root_0, j_expr40.getTree());
			dbg.location(77,22);
			string_literal41=(CommonToken)match(input,57,FOLLOW_57_in_set_mark432); 
			string_literal41_tree = (CommonTree)adaptor.create(string_literal41);
			adaptor.addChild(root_0, string_literal41_tree);
			dbg.location(77,27);
			pushFollow(FOLLOW_identifier_in_set_mark434);
			identifier42=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier42.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(78, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "set_mark");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "set_mark"


	public static class set_text_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_text"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:79:1: set_text : 'set text' j_expr 'to' identifier ;
	public final crl_gramParser.set_text_return set_text() throws RecognitionException {
		crl_gramParser.set_text_return retval = new crl_gramParser.set_text_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal43=null;
		CommonToken string_literal45=null;
		ParserRuleReturnScope j_expr44 =null;
		ParserRuleReturnScope identifier46 =null;

		CommonTree string_literal43_tree=null;
		CommonTree string_literal45_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "set_text");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:80:2: ( 'set text' j_expr 'to' identifier )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:80:4: 'set text' j_expr 'to' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(80,4);
			string_literal43=(CommonToken)match(input,53,FOLLOW_53_in_set_text444); 
			string_literal43_tree = (CommonTree)adaptor.create(string_literal43);
			adaptor.addChild(root_0, string_literal43_tree);
			dbg.location(80,15);
			pushFollow(FOLLOW_j_expr_in_set_text446);
			j_expr44=j_expr();
			state._fsp--;

			adaptor.addChild(root_0, j_expr44.getTree());
			dbg.location(80,22);
			string_literal45=(CommonToken)match(input,57,FOLLOW_57_in_set_text448); 
			string_literal45_tree = (CommonTree)adaptor.create(string_literal45);
			adaptor.addChild(root_0, string_literal45_tree);
			dbg.location(80,27);
			pushFollow(FOLLOW_identifier_in_set_text450);
			identifier46=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier46.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(81, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "set_text");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "set_text"


	public static class set_indent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_indent"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:82:1: set_indent : 'set indent' J_int_literal 'to' identifier ;
	public final crl_gramParser.set_indent_return set_indent() throws RecognitionException {
		crl_gramParser.set_indent_return retval = new crl_gramParser.set_indent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal47=null;
		CommonToken J_int_literal48=null;
		CommonToken string_literal49=null;
		ParserRuleReturnScope identifier50 =null;

		CommonTree string_literal47_tree=null;
		CommonTree J_int_literal48_tree=null;
		CommonTree string_literal49_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "set_indent");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:83:2: ( 'set indent' J_int_literal 'to' identifier )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:83:4: 'set indent' J_int_literal 'to' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(83,4);
			string_literal47=(CommonToken)match(input,50,FOLLOW_50_in_set_indent460); 
			string_literal47_tree = (CommonTree)adaptor.create(string_literal47);
			adaptor.addChild(root_0, string_literal47_tree);
			dbg.location(83,17);
			J_int_literal48=(CommonToken)match(input,J_int_literal,FOLLOW_J_int_literal_in_set_indent462); 
			J_int_literal48_tree = (CommonTree)adaptor.create(J_int_literal48);
			adaptor.addChild(root_0, J_int_literal48_tree);
			dbg.location(83,31);
			string_literal49=(CommonToken)match(input,57,FOLLOW_57_in_set_indent464); 
			string_literal49_tree = (CommonTree)adaptor.create(string_literal49);
			adaptor.addChild(root_0, string_literal49_tree);
			dbg.location(83,36);
			pushFollow(FOLLOW_identifier_in_set_indent466);
			identifier50=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier50.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(84, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "set_indent");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "set_indent"


	public static class split_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "split"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:85:1: split : 'split' identifier ;
	public final crl_gramParser.split_return split() throws RecognitionException {
		crl_gramParser.split_return retval = new crl_gramParser.split_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal51=null;
		ParserRuleReturnScope identifier52 =null;

		CommonTree string_literal51_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "split");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(85, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:86:2: ( 'split' identifier )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:86:4: 'split' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(86,4);
			string_literal51=(CommonToken)match(input,55,FOLLOW_55_in_split476); 
			string_literal51_tree = (CommonTree)adaptor.create(string_literal51);
			adaptor.addChild(root_0, string_literal51_tree);
			dbg.location(86,12);
			pushFollow(FOLLOW_identifier_in_split478);
			identifier52=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier52.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(87, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "split");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "split"


	public static class merge_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "merge"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:88:1: merge : 'merge' identifier 'with' identifier ;
	public final crl_gramParser.merge_return merge() throws RecognitionException {
		crl_gramParser.merge_return retval = new crl_gramParser.merge_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal53=null;
		CommonToken string_literal55=null;
		ParserRuleReturnScope identifier54 =null;
		ParserRuleReturnScope identifier56 =null;

		CommonTree string_literal53_tree=null;
		CommonTree string_literal55_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "merge");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(88, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:89:2: ( 'merge' identifier 'with' identifier )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:89:4: 'merge' identifier 'with' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(89,4);
			string_literal53=(CommonToken)match(input,38,FOLLOW_38_in_merge488); 
			string_literal53_tree = (CommonTree)adaptor.create(string_literal53);
			adaptor.addChild(root_0, string_literal53_tree);
			dbg.location(89,12);
			pushFollow(FOLLOW_identifier_in_merge490);
			identifier54=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier54.getTree());
			dbg.location(89,23);
			string_literal55=(CommonToken)match(input,60,FOLLOW_60_in_merge492); 
			string_literal55_tree = (CommonTree)adaptor.create(string_literal55);
			adaptor.addChild(root_0, string_literal55_tree);
			dbg.location(89,30);
			pushFollow(FOLLOW_identifier_in_merge494);
			identifier56=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier56.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(90, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "merge");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "merge"


	public static class new_entry_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "new_entry"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:91:1: new_entry : 'new entry' identifier ( 'as' j_expr )? ;
	public final crl_gramParser.new_entry_return new_entry() throws RecognitionException {
		crl_gramParser.new_entry_return retval = new crl_gramParser.new_entry_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal57=null;
		CommonToken string_literal59=null;
		ParserRuleReturnScope identifier58 =null;
		ParserRuleReturnScope j_expr60 =null;

		CommonTree string_literal57_tree=null;
		CommonTree string_literal59_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "new_entry");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(91, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:92:2: ( 'new entry' identifier ( 'as' j_expr )? )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:92:4: 'new entry' identifier ( 'as' j_expr )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(92,4);
			string_literal57=(CommonToken)match(input,39,FOLLOW_39_in_new_entry504); 
			string_literal57_tree = (CommonTree)adaptor.create(string_literal57);
			adaptor.addChild(root_0, string_literal57_tree);
			dbg.location(92,16);
			pushFollow(FOLLOW_identifier_in_new_entry506);
			identifier58=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier58.getTree());
			dbg.location(92,27);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:92:27: ( 'as' j_expr )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==30) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:92:28: 'as' j_expr
					{
					dbg.location(92,28);
					string_literal59=(CommonToken)match(input,30,FOLLOW_30_in_new_entry509); 
					string_literal59_tree = (CommonTree)adaptor.create(string_literal59);
					adaptor.addChild(root_0, string_literal59_tree);
					dbg.location(92,33);
					pushFollow(FOLLOW_j_expr_in_new_entry511);
					j_expr60=j_expr();
					state._fsp--;

					adaptor.addChild(root_0, j_expr60.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(93, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "new_entry");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "new_entry"


	public static class set_value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_value"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:94:1: set_value : 'set value' j_expr 'to' identifier ;
	public final crl_gramParser.set_value_return set_value() throws RecognitionException {
		crl_gramParser.set_value_return retval = new crl_gramParser.set_value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal61=null;
		CommonToken string_literal63=null;
		ParserRuleReturnScope j_expr62 =null;
		ParserRuleReturnScope identifier64 =null;

		CommonTree string_literal61_tree=null;
		CommonTree string_literal63_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "set_value");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(94, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:95:2: ( 'set value' j_expr 'to' identifier )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:95:4: 'set value' j_expr 'to' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(95,4);
			string_literal61=(CommonToken)match(input,54,FOLLOW_54_in_set_value523); 
			string_literal61_tree = (CommonTree)adaptor.create(string_literal61);
			adaptor.addChild(root_0, string_literal61_tree);
			dbg.location(95,16);
			pushFollow(FOLLOW_j_expr_in_set_value525);
			j_expr62=j_expr();
			state._fsp--;

			adaptor.addChild(root_0, j_expr62.getTree());
			dbg.location(95,23);
			string_literal63=(CommonToken)match(input,57,FOLLOW_57_in_set_value527); 
			string_literal63_tree = (CommonTree)adaptor.create(string_literal63);
			adaptor.addChild(root_0, string_literal63_tree);
			dbg.location(95,28);
			pushFollow(FOLLOW_identifier_in_set_value529);
			identifier64=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier64.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(96, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "set_value");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "set_value"


	public static class set_category_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_category"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:97:1: set_category : 'set category' identifier 'to' identifier ;
	public final crl_gramParser.set_category_return set_category() throws RecognitionException {
		crl_gramParser.set_category_return retval = new crl_gramParser.set_category_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal65=null;
		CommonToken string_literal67=null;
		ParserRuleReturnScope identifier66 =null;
		ParserRuleReturnScope identifier68 =null;

		CommonTree string_literal65_tree=null;
		CommonTree string_literal67_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "set_category");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:98:2: ( 'set category' identifier 'to' identifier )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:98:4: 'set category' identifier 'to' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(98,4);
			string_literal65=(CommonToken)match(input,49,FOLLOW_49_in_set_category540); 
			string_literal65_tree = (CommonTree)adaptor.create(string_literal65);
			adaptor.addChild(root_0, string_literal65_tree);
			dbg.location(98,19);
			pushFollow(FOLLOW_identifier_in_set_category542);
			identifier66=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier66.getTree());
			dbg.location(98,30);
			string_literal67=(CommonToken)match(input,57,FOLLOW_57_in_set_category544); 
			string_literal67_tree = (CommonTree)adaptor.create(string_literal67);
			adaptor.addChild(root_0, string_literal67_tree);
			dbg.location(98,35);
			pushFollow(FOLLOW_identifier_in_set_category546);
			identifier68=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier68.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(99, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "set_category");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "set_category"


	public static class set_parent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_parent"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:100:1: set_parent : 'set parent' identifier 'to' identifier ;
	public final crl_gramParser.set_parent_return set_parent() throws RecognitionException {
		crl_gramParser.set_parent_return retval = new crl_gramParser.set_parent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal69=null;
		CommonToken string_literal71=null;
		ParserRuleReturnScope identifier70 =null;
		ParserRuleReturnScope identifier72 =null;

		CommonTree string_literal69_tree=null;
		CommonTree string_literal71_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "set_parent");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:101:2: ( 'set parent' identifier 'to' identifier )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:101:4: 'set parent' identifier 'to' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(101,4);
			string_literal69=(CommonToken)match(input,52,FOLLOW_52_in_set_parent556); 
			string_literal69_tree = (CommonTree)adaptor.create(string_literal69);
			adaptor.addChild(root_0, string_literal69_tree);
			dbg.location(101,17);
			pushFollow(FOLLOW_identifier_in_set_parent558);
			identifier70=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier70.getTree());
			dbg.location(101,28);
			string_literal71=(CommonToken)match(input,57,FOLLOW_57_in_set_parent560); 
			string_literal71_tree = (CommonTree)adaptor.create(string_literal71);
			adaptor.addChild(root_0, string_literal71_tree);
			dbg.location(101,33);
			pushFollow(FOLLOW_identifier_in_set_parent562);
			identifier72=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier72.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(102, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "set_parent");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "set_parent"


	public static class group_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "group"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:103:1: group : 'group' identifier 'with' identifier ;
	public final crl_gramParser.group_return group() throws RecognitionException {
		crl_gramParser.group_return retval = new crl_gramParser.group_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal73=null;
		CommonToken string_literal75=null;
		ParserRuleReturnScope identifier74 =null;
		ParserRuleReturnScope identifier76 =null;

		CommonTree string_literal73_tree=null;
		CommonTree string_literal75_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "group");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:104:2: ( 'group' identifier 'with' identifier )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:104:4: 'group' identifier 'with' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(104,4);
			string_literal73=(CommonToken)match(input,35,FOLLOW_35_in_group572); 
			string_literal73_tree = (CommonTree)adaptor.create(string_literal73);
			adaptor.addChild(root_0, string_literal73_tree);
			dbg.location(104,12);
			pushFollow(FOLLOW_identifier_in_group574);
			identifier74=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier74.getTree());
			dbg.location(104,23);
			string_literal75=(CommonToken)match(input,60,FOLLOW_60_in_group576); 
			string_literal75_tree = (CommonTree)adaptor.create(string_literal75);
			adaptor.addChild(root_0, string_literal75_tree);
			dbg.location(104,30);
			pushFollow(FOLLOW_identifier_in_group578);
			identifier76=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier76.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(105, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "group");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "group"


	public static class add_label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "add_label"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:106:1: add_label : 'add label' identifier ( 'of' identifier )? 'to' identifier ;
	public final crl_gramParser.add_label_return add_label() throws RecognitionException {
		crl_gramParser.add_label_return retval = new crl_gramParser.add_label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal77=null;
		CommonToken string_literal79=null;
		CommonToken string_literal81=null;
		ParserRuleReturnScope identifier78 =null;
		ParserRuleReturnScope identifier80 =null;
		ParserRuleReturnScope identifier82 =null;

		CommonTree string_literal77_tree=null;
		CommonTree string_literal79_tree=null;
		CommonTree string_literal81_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "add_label");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:107:2: ( 'add label' identifier ( 'of' identifier )? 'to' identifier )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:107:4: 'add label' identifier ( 'of' identifier )? 'to' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(107,4);
			string_literal77=(CommonToken)match(input,29,FOLLOW_29_in_add_label588); 
			string_literal77_tree = (CommonTree)adaptor.create(string_literal77);
			adaptor.addChild(root_0, string_literal77_tree);
			dbg.location(107,16);
			pushFollow(FOLLOW_identifier_in_add_label590);
			identifier78=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier78.getTree());
			dbg.location(107,27);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:107:27: ( 'of' identifier )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==45) ) {
				alt12=1;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:107:28: 'of' identifier
					{
					dbg.location(107,28);
					string_literal79=(CommonToken)match(input,45,FOLLOW_45_in_add_label593); 
					string_literal79_tree = (CommonTree)adaptor.create(string_literal79);
					adaptor.addChild(root_0, string_literal79_tree);
					dbg.location(107,33);
					pushFollow(FOLLOW_identifier_in_add_label595);
					identifier80=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier80.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(12);}
			dbg.location(107,46);
			string_literal81=(CommonToken)match(input,57,FOLLOW_57_in_add_label599); 
			string_literal81_tree = (CommonTree)adaptor.create(string_literal81);
			adaptor.addChild(root_0, string_literal81_tree);
			dbg.location(107,51);
			pushFollow(FOLLOW_identifier_in_add_label601);
			identifier82=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier82.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(108, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "add_label");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "add_label"


	public static class new_label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "new_label"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:109:1: new_label : 'new label' identifier ( 'as' j_expr )? ;
	public final crl_gramParser.new_label_return new_label() throws RecognitionException {
		crl_gramParser.new_label_return retval = new crl_gramParser.new_label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal83=null;
		CommonToken string_literal85=null;
		ParserRuleReturnScope identifier84 =null;
		ParserRuleReturnScope j_expr86 =null;

		CommonTree string_literal83_tree=null;
		CommonTree string_literal85_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "new_label");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(109, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:110:2: ( 'new label' identifier ( 'as' j_expr )? )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:110:4: 'new label' identifier ( 'as' j_expr )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(110,4);
			string_literal83=(CommonToken)match(input,40,FOLLOW_40_in_new_label611); 
			string_literal83_tree = (CommonTree)adaptor.create(string_literal83);
			adaptor.addChild(root_0, string_literal83_tree);
			dbg.location(110,16);
			pushFollow(FOLLOW_identifier_in_new_label613);
			identifier84=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier84.getTree());
			dbg.location(110,27);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:110:27: ( 'as' j_expr )?
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==30) ) {
				alt13=1;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:110:28: 'as' j_expr
					{
					dbg.location(110,28);
					string_literal85=(CommonToken)match(input,30,FOLLOW_30_in_new_label616); 
					string_literal85_tree = (CommonTree)adaptor.create(string_literal85);
					adaptor.addChild(root_0, string_literal85_tree);
					dbg.location(110,33);
					pushFollow(FOLLOW_j_expr_in_new_label618);
					j_expr86=j_expr();
					state._fsp--;

					adaptor.addChild(root_0, j_expr86.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(111, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "new_label");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "new_label"


	public static class update_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "update"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:112:1: update : 'update' identifier ;
	public final crl_gramParser.update_return update() throws RecognitionException {
		crl_gramParser.update_return retval = new crl_gramParser.update_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal87=null;
		ParserRuleReturnScope identifier88 =null;

		CommonTree string_literal87_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "update");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(112, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:113:2: ( 'update' identifier )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:113:4: 'update' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(113,4);
			string_literal87=(CommonToken)match(input,58,FOLLOW_58_in_update630); 
			string_literal87_tree = (CommonTree)adaptor.create(string_literal87);
			adaptor.addChild(root_0, string_literal87_tree);
			dbg.location(113,13);
			pushFollow(FOLLOW_identifier_in_update632);
			identifier88=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier88.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(114, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "update");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "update"


	public static class c_print_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "c_print"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:115:1: c_print : ( 'print' | 'printf' ) j_expr ;
	public final crl_gramParser.c_print_return c_print() throws RecognitionException {
		crl_gramParser.c_print_return retval = new crl_gramParser.c_print_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken set89=null;
		ParserRuleReturnScope j_expr90 =null;

		CommonTree set89_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "c_print");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(115, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:116:2: ( ( 'print' | 'printf' ) j_expr )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:116:4: ( 'print' | 'printf' ) j_expr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(116,4);
			set89=(CommonToken)input.LT(1);
			if ( (input.LA(1) >= 46 && input.LA(1) <= 47) ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set89));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(116,23);
			pushFollow(FOLLOW_j_expr_in_c_print648);
			j_expr90=j_expr();
			state._fsp--;

			adaptor.addChild(root_0, j_expr90.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(117, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "c_print");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "c_print"


	public static class identifier_return extends ParserRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:118:1: identifier returns [String value] : Identifier ( '.' i= j_expr )? -> Ident_token[$value] ;
	public final crl_gramParser.identifier_return identifier() throws RecognitionException {
		crl_gramParser.identifier_return retval = new crl_gramParser.identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken Identifier91=null;
		CommonToken char_literal92=null;
		ParserRuleReturnScope i =null;

		CommonTree Identifier91_tree=null;
		CommonTree char_literal92_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_j_expr=new RewriteRuleSubtreeStream(adaptor,"rule j_expr");

		 retval.value =""; 
		try { dbg.enterRule(getGrammarFileName(), "identifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(118, 0);

		try {
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:120:2: ( Identifier ( '.' i= j_expr )? -> Ident_token[$value] )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:120:5: Identifier ( '.' i= j_expr )?
			{
			dbg.location(120,5);
			Identifier91=(CommonToken)match(input,Identifier,FOLLOW_Identifier_in_identifier668);  
			stream_Identifier.add(Identifier91);
			dbg.location(120,16);
			 retval.value =(Identifier91!=null?Identifier91.getText():null); dbg.location(120,44);
			// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:120:44: ( '.' i= j_expr )?
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==27) ) {
				alt14=1;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\crl_gram.g:120:45: '.' i= j_expr
					{
					dbg.location(120,45);
					char_literal92=(CommonToken)match(input,27,FOLLOW_27_in_identifier672);  
					stream_27.add(char_literal92);
					dbg.location(120,50);
					pushFollow(FOLLOW_j_expr_in_identifier676);
					i=j_expr();
					state._fsp--;

					stream_j_expr.add(i.getTree());dbg.location(120,58);
					 retval.value+="."+(i!=null?((crl_gramParser.j_expr_return)i).value:null);
					}
					break;

			}
			} finally {dbg.exitSubRule(14);}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 120:86: -> Ident_token[$value]
			{
				dbg.location(120,89);
				adaptor.addChild(root_0, (CommonTree)adaptor.create(Ident_token, retval.value));
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(121, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "identifier"

	// Delegated rules



	public static final BitSet FOLLOW_crl_rule_in_crl93 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_crl_rule113 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_J_int_literal_in_crl_rule115 = new BitSet(new long[]{0x0000002000002000L});
	public static final BitSet FOLLOW_37_in_crl_rule117 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EOL_in_crl_rule120 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_crl_rule124 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EOL_in_crl_rule126 = new BitSet(new long[]{0x00001E1580000000L});
	public static final BitSet FOLLOW_condition_in_crl_rule131 = new BitSet(new long[]{0x01001E1580000000L});
	public static final BitSet FOLLOW_56_in_crl_rule136 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EOL_in_crl_rule138 = new BitSet(new long[]{0x04BEC1C820000000L});
	public static final BitSet FOLLOW_action_in_crl_rule142 = new BitSet(new long[]{0x04BEC1CA20000000L});
	public static final BitSet FOLLOW_33_in_crl_rule147 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_EOL_in_crl_rule149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_condition180 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_condition182 = new BitSet(new long[]{0x0000000010002002L});
	public static final BitSet FOLLOW_constraints_in_condition184 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_EOL_in_condition187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_constraints235 = new BitSet(new long[]{0x0DFFDFFFA9FFDFF0L});
	public static final BitSet FOLLOW_j_expr_in_constraints237 = new BitSet(new long[]{0x0000000004002000L});
	public static final BitSet FOLLOW_26_in_constraints240 = new BitSet(new long[]{0x0DFFDFFFA9FFDFF0L});
	public static final BitSet FOLLOW_j_expr_in_constraints242 = new BitSet(new long[]{0x0000000004002000L});
	public static final BitSet FOLLOW_EOL_in_constraints246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_j_expr__in_j_expr271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_j_expr_306 = new BitSet(new long[]{0x0DFFDFFFA9FFDFF2L});
	public static final BitSet FOLLOW_action__in_action338 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EOL_in_action340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_mark_in_action_358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_text_in_action_363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_indent_in_action_368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_split_in_action_373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_merge_in_action_378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_new_label_in_action_383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_add_label_in_action_388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_category_in_action_393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_parent_in_action_398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_new_entry_in_action_403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_in_action_408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_c_print_in_action_413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_update_in_action_418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_set_mark428 = new BitSet(new long[]{0x0DFFDFFFA9FFDFF0L});
	public static final BitSet FOLLOW_j_expr_in_set_mark430 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_set_mark432 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_set_mark434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_set_text444 = new BitSet(new long[]{0x0DFFDFFFA9FFDFF0L});
	public static final BitSet FOLLOW_j_expr_in_set_text446 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_set_text448 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_set_text450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_set_indent460 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_J_int_literal_in_set_indent462 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_set_indent464 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_set_indent466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_split476 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_split478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_merge488 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_merge490 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_merge492 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_merge494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_new_entry504 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_new_entry506 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_new_entry509 = new BitSet(new long[]{0x0DFFDFFFA9FFDFF0L});
	public static final BitSet FOLLOW_j_expr_in_new_entry511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_set_value523 = new BitSet(new long[]{0x0DFFDFFFA9FFDFF0L});
	public static final BitSet FOLLOW_j_expr_in_set_value525 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_set_value527 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_set_value529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_set_category540 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_set_category542 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_set_category544 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_set_category546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_set_parent556 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_set_parent558 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_set_parent560 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_set_parent562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_group572 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_group574 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_group576 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_group578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_add_label588 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_add_label590 = new BitSet(new long[]{0x0200200000000000L});
	public static final BitSet FOLLOW_45_in_add_label593 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_add_label595 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_add_label599 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_add_label601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_new_label611 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_new_label613 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_new_label616 = new BitSet(new long[]{0x0DFFDFFFA9FFDFF0L});
	public static final BitSet FOLLOW_j_expr_in_new_label618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_update630 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_update632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_c_print642 = new BitSet(new long[]{0x0DFFDFFFA9FFDFF0L});
	public static final BitSet FOLLOW_j_expr_in_c_print648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifier668 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_identifier672 = new BitSet(new long[]{0x0DFFDFFFA9FFDFF0L});
	public static final BitSet FOLLOW_j_expr_in_identifier676 = new BitSet(new long[]{0x0000000000000002L});
}
