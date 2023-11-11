// Generated from MyGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, OPS=15, EQUALS=16, IDENTIFIER=17, 
		VALUE_NUM=18, QUOTED_TEXT=19, BOOLEAN=20, IGNORE_SPACES=21;
	public static final int
		RULE_prog = 0, RULE_action = 1, RULE_setVar = 2, RULE_calcStep = 3, RULE_computation = 4, 
		RULE_listValues = 5, RULE_items = 6, RULE_assignOp = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "action", "setVar", "calcStep", "computation", "listValues", 
			"items", "assignOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'/'", "'%'", "'+'", "'-'", "'['", "']'", 
			"','", "'PLUSEQ'", "'MINUSEQ'", "'MULTEQ'", "'DIVEQ'", null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "OPS", "EQUALS", "IDENTIFIER", "VALUE_NUM", "QUOTED_TEXT", 
			"BOOLEAN", "IGNORE_SPACES"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

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

	@SuppressWarnings("CheckReturnValue")
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
				setState(16);
				action();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1966338L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
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
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				setVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				calcStep();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public ComputationContext computation() {
			return getRuleContext(ComputationContext.class,0);
		}
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
			setState(25);
			match(IDENTIFIER);
			setState(26);
			assignOp();
			setState(27);
			computation(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CalcStepContext extends ParserRuleContext {
		public Token mathOp;
		public List<ComputationContext> computation() {
			return getRuleContexts(ComputationContext.class);
		}
		public ComputationContext computation(int i) {
			return getRuleContext(ComputationContext.class,i);
		}
		public List<TerminalNode> OPS() { return getTokens(MyGrammarParser.OPS); }
		public TerminalNode OPS(int i) {
			return getToken(MyGrammarParser.OPS, i);
		}
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
			setState(29);
			computation(0);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPS) {
				{
				{
				setState(30);
				((CalcStepContext)_localctx).mathOp = match(OPS);
				setState(31);
				computation(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComputationContext extends ParserRuleContext {
		public List<ComputationContext> computation() {
			return getRuleContexts(ComputationContext.class);
		}
		public ComputationContext computation(int i) {
			return getRuleContext(ComputationContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public TerminalNode VALUE_NUM() { return getToken(MyGrammarParser.VALUE_NUM, 0); }
		public TerminalNode QUOTED_TEXT() { return getToken(MyGrammarParser.QUOTED_TEXT, 0); }
		public TerminalNode BOOLEAN() { return getToken(MyGrammarParser.BOOLEAN, 0); }
		public ListValuesContext listValues() {
			return getRuleContext(ListValuesContext.class,0);
		}
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
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(38);
				match(T__0);
				setState(39);
				computation(0);
				setState(40);
				match(T__1);
				}
				break;
			case IDENTIFIER:
				{
				setState(42);
				match(IDENTIFIER);
				}
				break;
			case VALUE_NUM:
				{
				setState(43);
				match(VALUE_NUM);
				}
				break;
			case QUOTED_TEXT:
				{
				setState(44);
				match(QUOTED_TEXT);
				}
				break;
			case BOOLEAN:
				{
				setState(45);
				match(BOOLEAN);
				}
				break;
			case T__7:
				{
				setState(46);
				listValues();
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
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ComputationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_computation);
						setState(49);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(50);
						match(T__2);
						setState(51);
						computation(11);
						}
						break;
					case 2:
						{
						_localctx = new ComputationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_computation);
						setState(52);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(53);
						match(T__3);
						setState(54);
						computation(10);
						}
						break;
					case 3:
						{
						_localctx = new ComputationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_computation);
						setState(55);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(56);
						match(T__4);
						setState(57);
						computation(9);
						}
						break;
					case 4:
						{
						_localctx = new ComputationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_computation);
						setState(58);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(59);
						match(T__5);
						setState(60);
						computation(8);
						}
						break;
					case 5:
						{
						_localctx = new ComputationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_computation);
						setState(61);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(62);
						match(T__6);
						setState(63);
						computation(7);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(69);
			match(T__7);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966338L) != 0)) {
				{
				setState(70);
				items();
				}
			}

			setState(73);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItemsContext extends ParserRuleContext {
		public List<ComputationContext> computation() {
			return getRuleContexts(ComputationContext.class);
		}
		public ComputationContext computation(int i) {
			return getRuleContext(ComputationContext.class,i);
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
			setState(75);
			computation(0);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(76);
				match(T__9);
				setState(77);
				computation(0);
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 96256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return computation_sempred((ComputationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean computation_sempred(ComputationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015V\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003!\b\u0003"+
		"\n\u0003\f\u0003$\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u00040\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"A\b\u0004\n\u0004\f\u0004D\t\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"H\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006O\b\u0006\n\u0006\f\u0006R\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0000\u0001\b\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000"+
		"\u0001\u0002\u0000\u000b\u000e\u0010\u0010\\\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000"+
		"\u0000\u0006\u001d\u0001\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000"+
		"\nE\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000\u000eS\u0001\u0000"+
		"\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0001\u0001\u0000"+
		"\u0000\u0000\u0015\u0018\u0003\u0004\u0002\u0000\u0016\u0018\u0003\u0006"+
		"\u0003\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0016\u0001\u0000"+
		"\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0011"+
		"\u0000\u0000\u001a\u001b\u0003\u000e\u0007\u0000\u001b\u001c\u0003\b\u0004"+
		"\u0000\u001c\u0005\u0001\u0000\u0000\u0000\u001d\"\u0003\b\u0004\u0000"+
		"\u001e\u001f\u0005\u000f\u0000\u0000\u001f!\u0003\b\u0004\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#\u0007\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000%&\u0006\u0004\uffff\uffff\u0000&\'\u0005\u0001\u0000"+
		"\u0000\'(\u0003\b\u0004\u0000()\u0005\u0002\u0000\u0000)0\u0001\u0000"+
		"\u0000\u0000*0\u0005\u0011\u0000\u0000+0\u0005\u0012\u0000\u0000,0\u0005"+
		"\u0013\u0000\u0000-0\u0005\u0014\u0000\u0000.0\u0003\n\u0005\u0000/%\u0001"+
		"\u0000\u0000\u0000/*\u0001\u0000\u0000\u0000/+\u0001\u0000\u0000\u0000"+
		"/,\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000"+
		"\u00000B\u0001\u0000\u0000\u000012\n\n\u0000\u000023\u0005\u0003\u0000"+
		"\u00003A\u0003\b\u0004\u000b45\n\t\u0000\u000056\u0005\u0004\u0000\u0000"+
		"6A\u0003\b\u0004\n78\n\b\u0000\u000089\u0005\u0005\u0000\u00009A\u0003"+
		"\b\u0004\t:;\n\u0007\u0000\u0000;<\u0005\u0006\u0000\u0000<A\u0003\b\u0004"+
		"\b=>\n\u0006\u0000\u0000>?\u0005\u0007\u0000\u0000?A\u0003\b\u0004\u0007"+
		"@1\u0001\u0000\u0000\u0000@4\u0001\u0000\u0000\u0000@7\u0001\u0000\u0000"+
		"\u0000@:\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000AD\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\t\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EG\u0005\b\u0000\u0000FH\u0003"+
		"\f\u0006\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IJ\u0005\t\u0000\u0000J\u000b\u0001\u0000\u0000\u0000"+
		"KP\u0003\b\u0004\u0000LM\u0005\n\u0000\u0000MO\u0003\b\u0004\u0000NL\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000Q\r\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000ST\u0007\u0000\u0000\u0000T\u000f\u0001\u0000\u0000\u0000\b\u0013"+
		"\u0017\"/@BGP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}