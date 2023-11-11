// Generated from MyGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, OPS=15, EQUALS=16, IDENTIFIER=17, 
		VALUE_NUM=18, QUOTED_TEXT=19, BOOLEAN=20, IGNORE_SPACES=21;
	public static final String[] tokenNames = {
		"<INVALID>", "'PLUSEQ'", "'/'", "'DIVEQ'", "'['", "']'", "'MINUSEQ'", 
		"'MULTEQ'", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "OPS", "'='", 
		"IDENTIFIER", "VALUE_NUM", "QUOTED_TEXT", "BOOLEAN", "IGNORE_SPACES"
	};
	public static final int
		RULE_prog = 0, RULE_action = 1, RULE_setVar = 2, RULE_calcStep = 3, RULE_computation = 4, 
		RULE_listValues = 5, RULE_items = 6, RULE_assignOp = 7;
	public static final String[] ruleNames = {
		"prog", "action", "setVar", "calcStep", "computation", "listValues", "items", 
		"assignOp"
	};

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16); action();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__5) | (1L << IDENTIFIER) | (1L << VALUE_NUM) | (1L << QUOTED_TEXT) | (1L << BOOLEAN))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public SetVarContext setVar() {
			return getRuleContext(SetVarContext.class,0);
		}
		public CalcStepContext calcStep() {
			return getRuleContext(CalcStepContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_action);
		try {
			setState(23);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21); setVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22); calcStep();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetVarContext extends ParserRuleContext {
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public ComputationContext computation() {
			return getRuleContext(ComputationContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public SetVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSetVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSetVar(this);
		}
	}

	public final SetVarContext setVar() throws RecognitionException {
		SetVarContext _localctx = new SetVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(IDENTIFIER);
			setState(26); assignOp();
			setState(27); computation(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalcStepContext extends ParserRuleContext {
		public Token mathOp;
		public ComputationContext computation(int i) {
			return getRuleContext(ComputationContext.class,i);
		}
		public TerminalNode OPS(int i) {
			return getToken(MyGrammarParser.OPS, i);
		}
		public List<ComputationContext> computation() {
			return getRuleContexts(ComputationContext.class);
		}
		public List<TerminalNode> OPS() { return getTokens(MyGrammarParser.OPS); }
		public CalcStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCalcStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCalcStep(this);
		}
	}

	public final CalcStepContext calcStep() throws RecognitionException {
		CalcStepContext _localctx = new CalcStepContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_calcStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); computation(0);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPS) {
				{
				{
				setState(30); ((CalcStepContext)_localctx).mathOp = match(OPS);
				setState(31); computation(0);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComputationContext extends ParserRuleContext {
		public ComputationContext computation(int i) {
			return getRuleContext(ComputationContext.class,i);
		}
		public ListValuesContext listValues() {
			return getRuleContext(ListValuesContext.class,0);
		}
		public List<ComputationContext> computation() {
			return getRuleContexts(ComputationContext.class);
		}
		public TerminalNode BOOLEAN() { return getToken(MyGrammarParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public TerminalNode QUOTED_TEXT() { return getToken(MyGrammarParser.QUOTED_TEXT, 0); }
		public TerminalNode VALUE_NUM() { return getToken(MyGrammarParser.VALUE_NUM, 0); }
		public ComputationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterComputation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitComputation(this);
		}
	}

	public final ComputationContext computation() throws RecognitionException {
		return computation(0);
	}

	private ComputationContext computation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComputationContext _localctx = new ComputationContext(_ctx, _parentState);
		ComputationContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_computation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(38); match(T__5);
				setState(39); computation(0);
				setState(40); match(T__4);
				}
				break;
			case IDENTIFIER:
				{
				setState(42); match(IDENTIFIER);
				}
				break;
			case VALUE_NUM:
				{
				setState(43); match(VALUE_NUM);
				}
				break;
			case QUOTED_TEXT:
				{
				setState(44); match(QUOTED_TEXT);
				}
				break;
			case BOOLEAN:
				{
				setState(45); match(BOOLEAN);
				}
				break;
			case T__10:
				{
				setState(46); listValues();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ComputationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_computation);
						setState(49);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(50); match(T__3);
						setState(51); computation(11);
						}
						break;
					case 2:
						{
						_localctx = new ComputationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_computation);
						setState(52);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(53); match(T__12);
						setState(54); computation(10);
						}
						break;
					case 3:
						{
						_localctx = new ComputationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_computation);
						setState(55);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(56); match(T__6);
						setState(57); computation(9);
						}
						break;
					case 4:
						{
						_localctx = new ComputationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_computation);
						setState(58);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(59); match(T__2);
						setState(60); computation(8);
						}
						break;
					case 5:
						{
						_localctx = new ComputationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_computation);
						setState(61);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(62); match(T__0);
						setState(63); computation(7);
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListValuesContext extends ParserRuleContext {
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public ListValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterListValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitListValues(this);
		}
	}

	public final ListValuesContext listValues() throws RecognitionException {
		ListValuesContext _localctx = new ListValuesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(T__10);
			setState(71);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__5) | (1L << IDENTIFIER) | (1L << VALUE_NUM) | (1L << QUOTED_TEXT) | (1L << BOOLEAN))) != 0)) {
				{
				setState(70); items();
				}
			}

			setState(73); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemsContext extends ParserRuleContext {
		public ComputationContext computation(int i) {
			return getRuleContext(ComputationContext.class,i);
		}
		public List<ComputationContext> computation() {
			return getRuleContexts(ComputationContext.class);
		}
		public ItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitItems(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); computation(0);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(76); match(T__1);
				setState(77); computation(0);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(MyGrammarParser.EQUALS, 0); }
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAssignOp(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__11) | (1L << T__8) | (1L << T__7) | (1L << EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return computation_sempred((ComputationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean computation_sempred(ComputationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 10);
		case 1: return precpred(_ctx, 9);
		case 2: return precpred(_ctx, 8);
		case 3: return precpred(_ctx, 7);
		case 4: return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27X\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r\2"+
		"\16\2\25\3\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5#\n\5\f\5\16"+
		"\5&\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6C\n\6\f\6\16\6F"+
		"\13\6\3\7\3\7\5\7J\n\7\3\7\3\7\3\b\3\b\3\b\7\bQ\n\b\f\b\16\bT\13\b\3\t"+
		"\3\t\3\t\2\3\n\n\2\4\6\b\n\f\16\20\2\3\6\2\3\3\5\5\b\t\22\22^\2\23\3\2"+
		"\2\2\4\31\3\2\2\2\6\33\3\2\2\2\b\37\3\2\2\2\n\61\3\2\2\2\fG\3\2\2\2\16"+
		"M\3\2\2\2\20U\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23"+
		"\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\32\5\6\4\2\30\32\5\b\5\2\31\27"+
		"\3\2\2\2\31\30\3\2\2\2\32\5\3\2\2\2\33\34\7\23\2\2\34\35\5\20\t\2\35\36"+
		"\5\n\6\2\36\7\3\2\2\2\37$\5\n\6\2 !\7\21\2\2!#\5\n\6\2\" \3\2\2\2#&\3"+
		"\2\2\2$\"\3\2\2\2$%\3\2\2\2%\t\3\2\2\2&$\3\2\2\2\'(\b\6\1\2()\7\13\2\2"+
		")*\5\n\6\2*+\7\f\2\2+\62\3\2\2\2,\62\7\23\2\2-\62\7\24\2\2.\62\7\25\2"+
		"\2/\62\7\26\2\2\60\62\5\f\7\2\61\'\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\61"+
		".\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62D\3\2\2\2\63\64\f\f\2\2\64\65\7"+
		"\r\2\2\65C\5\n\6\r\66\67\f\13\2\2\678\7\4\2\28C\5\n\6\f9:\f\n\2\2:;\7"+
		"\n\2\2;C\5\n\6\13<=\f\t\2\2=>\7\16\2\2>C\5\n\6\n?@\f\b\2\2@A\7\20\2\2"+
		"AC\5\n\6\tB\63\3\2\2\2B\66\3\2\2\2B9\3\2\2\2B<\3\2\2\2B?\3\2\2\2CF\3\2"+
		"\2\2DB\3\2\2\2DE\3\2\2\2E\13\3\2\2\2FD\3\2\2\2GI\7\6\2\2HJ\5\16\b\2IH"+
		"\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\7\2\2L\r\3\2\2\2MR\5\n\6\2NO\7\17\2\2"+
		"OQ\5\n\6\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\17\3\2\2\2TR\3\2\2"+
		"\2UV\t\2\2\2V\21\3\2\2\2\n\25\31$\61BDIR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}