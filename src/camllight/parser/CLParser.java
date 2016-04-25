// Generated from  by ANTLR 4.2.2

package camllight.parser;
import static camllight.parser.Tokens.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__37=1, T__36=2, T__35=3, T__34=4, T__33=5, T__32=6, T__31=7, T__30=8, 
		T__29=9, T__28=10, T__27=11, T__26=12, T__25=13, T__24=14, T__23=15, T__22=16, 
		T__21=17, T__20=18, T__19=19, T__18=20, T__17=21, T__16=22, T__15=23, 
		T__14=24, T__13=25, T__12=26, T__11=27, T__10=28, T__9=29, T__8=30, T__7=31, 
		T__6=32, T__5=33, T__4=34, T__3=35, T__2=36, T__1=37, T__0=38, WILDCARD=39, 
		WS=40, NUM=41, BOOL=42, ID=43;
	public static final String[] tokenNames = {
		"<INVALID>", "'as'", "'fun'", "'||'", "';'", "'while'", "'&&'", "'='", 
		"'if'", "'for'", "'<='", "'&'", "'print'", "'do'", "'('", "'*'", "','", 
		"'->'", "'done'", "'to'", "'>='", "'<'", "'|'", "'with'", "'>'", "'or'", 
		"'let'", "'match'", "'else'", "'begin'", "'in'", "'function'", "'end'", 
		"')'", "'downto'", "'and'", "'+'", "'then'", "'not'", "'_'", "WS", "NUM", 
		"BOOL", "ID"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_pattmatchcurried = 2, RULE_decl = 3, 
		RULE_patt = 4, RULE_ident = 5, RULE_pattmatchsingle = 6, RULE_pattmatchmultiple = 7, 
		RULE_prog = 8, RULE_exptuple = 9, RULE_declpattmono = 10, RULE_letExp = 11, 
		RULE_patttuple = 12, RULE_function = 13, RULE_exp = 14;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "pattmatchcurried", "decl", "patt", "ident", 
		"pattmatchsingle", "pattmatchmultiple", "prog", "exptuple", "declpattmono", 
		"letExp", "patttuple", "function", "exp"
	};

	@Override
	public String getGrammarFileName() { return ""; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private camllight.algebras.AllAlg builder;
	public void setBuilder(camllight.algebras.AllAlg builder) { this.builder = builder; }
	private static <X> java.util.List<X> lift(String name, java.util.List<?> ctxs, X ...heads) {
	  java.util.List<X> l = new java.util.ArrayList<X>();
	  for (X h: heads) { l.add(h); }
	  for (Object ctx: ctxs) {
	    try {
	      l.add((X)ctx.getClass().getField(name).get(ctx));
	    } catch (Throwable e) {
	      throw new RuntimeException(e);
	    }
	  }
	  return l;
	}

	public CLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PattmatchContext extends ParserRuleContext {
		public Object _pattmatch;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchContext pattmatch_0;
		public PattmatchmultipleContext pattmatchmultiple_0;
		public PattmatchmultipleContext pattmatchmultiple() {
			return getRuleContext(PattmatchmultipleContext.class,0);
		}
		public PattmatchsingleContext pattmatchsingle() {
			return getRuleContext(PattmatchsingleContext.class,0);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public PattmatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatch; }
	}

	public final PattmatchContext pattmatch() throws RecognitionException {
		PattmatchContext _localctx = new PattmatchContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pattmatch);
		try {
			setState(40);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch1((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33); match(22);
				setState(34); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch2((((PattmatchContext)_localctx).pattmatchmultiple_0._pattmatchmultiple));
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

	public static class ConstantContext extends ParserRuleContext {
		public Object _constant;
		public Token NUM_0;
		public Token BOOL_0;
		public TerminalNode BOOL() { return getToken(CLParser.BOOL, 0); }
		public TerminalNode NUM() { return getToken(CLParser.NUM, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constant);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); ((ConstantContext)_localctx).NUM_0 = match(NUM);
				((ConstantContext)_localctx)._constant =  builder.int_(num((((ConstantContext)_localctx).NUM_0!=null?((ConstantContext)_localctx).NUM_0.getText():null)));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); ((ConstantContext)_localctx).BOOL_0 = match(BOOL);
				((ConstantContext)_localctx)._constant =  builder.bool(bool((((ConstantContext)_localctx).BOOL_0!=null?((ConstantContext)_localctx).BOOL_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PattmatchcurriedContext extends ParserRuleContext {
		public Object _pattmatchcurried;
		public PattContext patt;
		public List<PattContext> patt_0_list = new ArrayList<PattContext>();
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public PattmatchcurriedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatchcurried; }
	}

	public final PattmatchcurriedContext pattmatchcurried() throws RecognitionException {
		PattmatchcurriedContext _localctx = new PattmatchcurriedContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << WILDCARD) | (1L << NUM) | (1L << BOOL) | (1L << ID))) != 0) );
			setState(53); match(17);
			setState(54); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
			((PattmatchcurriedContext)_localctx)._pattmatchcurried =  builder.pattMatchCurriedMulti(lift("_patt", ((PattmatchcurriedContext)_localctx).patt_0_list),(((PattmatchcurriedContext)_localctx).exp_1._exp));
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

	public static class DeclContext extends ParserRuleContext {
		public Object _decl;
		public PattContext patt_0;
		public ExpContext exp_1;
		public DeclContext decl_0;
		public DeclpattmonoContext declpattmono_0;
		public DeclContext decl_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclpattmonoContext declpattmono() {
			return getRuleContext(DeclpattmonoContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); ((DeclContext)_localctx).patt_0 = patt(0);
				setState(58); match(7);
				setState(59); ((DeclContext)_localctx).exp_1 = exp(0);
				((DeclContext)_localctx)._decl =  builder.declBindPatt((((DeclContext)_localctx).patt_0._patt),(((DeclContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); match(26);
				setState(63); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); ((DeclContext)_localctx).declpattmono_0 = declpattmono();
				setState(67); match(35);
				setState(68); ((DeclContext)_localctx).decl_1 = decl();
				((DeclContext)_localctx)._decl =  builder.andDecl((((DeclContext)_localctx).declpattmono_0._declpattmono),(((DeclContext)_localctx).decl_1._decl));
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

	public static class PattContext extends ParserRuleContext {
		public Object _patt;
		public PattContext patt_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public IdentContext ident_0;
		public Token WILDCARD_0;
		public ConstantContext constant_0;
		public IdentContext ident_1;
		public PatttupleContext patttuple(int i) {
			return getRuleContext(PatttupleContext.class,i);
		}
		public List<PatttupleContext> patttuple() {
			return getRuleContexts(PatttupleContext.class);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(CLParser.WILDCARD, 0); }
		public PattContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patt; }
	}

	public final PattContext patt() throws RecognitionException {
		return patt(0);
	}

	private PattContext patt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PattContext _localctx = new PattContext(_ctx, _parentState);
		PattContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_patt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(74); match(14);
				setState(75); ((PattContext)_localctx).patt_0 = patt(0);
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==16 );
				setState(81); match(33);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 2:
				{
				setState(84); match(14);
				setState(85); ((PattContext)_localctx).patt_0 = patt(0);
				setState(86); match(33);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 3:
				{
				setState(89); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(92); ((PattContext)_localctx).WILDCARD_0 = match(WILDCARD);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcard((((PattContext)_localctx).WILDCARD_0!=null?((PattContext)_localctx).WILDCARD_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(94); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PattContext(_parentctx, _parentState);
					_localctx.patt_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_patt);
					setState(99);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(100); match(1);
					setState(101); ((PattContext)_localctx).ident_1 = ident();
					((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class IdentContext extends ParserRuleContext {
		public Object _ident;
		public Token ID_0;
		public TerminalNode ID() { return getToken(CLParser.ID, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); ((IdentContext)_localctx).ID_0 = match(ID);
			((IdentContext)_localctx)._ident =  builder.id(id((((IdentContext)_localctx).ID_0!=null?((IdentContext)_localctx).ID_0.getText():null)));
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

	public static class PattmatchsingleContext extends ParserRuleContext {
		public Object _pattmatchsingle;
		public PattContext patt_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public PattmatchsingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatchsingle; }
	}

	public final PattmatchsingleContext pattmatchsingle() throws RecognitionException {
		PattmatchsingleContext _localctx = new PattmatchsingleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(113); match(17);
			setState(114); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
			((PattmatchsingleContext)_localctx)._pattmatchsingle =  builder.pattMatchSingle((((PattmatchsingleContext)_localctx).patt_0._patt),(((PattmatchsingleContext)_localctx).exp_1._exp));
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

	public static class PattmatchmultipleContext extends ParserRuleContext {
		public Object _pattmatchmultiple;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchContext pattmatch_1;
		public PattmatchsingleContext pattmatchsingle() {
			return getRuleContext(PattmatchsingleContext.class,0);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public PattmatchmultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatchmultiple; }
	}

	public final PattmatchmultipleContext pattmatchmultiple() throws RecognitionException {
		PattmatchmultipleContext _localctx = new PattmatchmultipleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pattmatchmultiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(118); match(22);
			setState(119); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
			((PattmatchmultipleContext)_localctx)._pattmatchmultiple =  builder.pattMatchMulti((((PattmatchmultipleContext)_localctx).pattmatchsingle_0._pattmatchsingle),(((PattmatchmultipleContext)_localctx).pattmatch_1._pattmatch));
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

	public static class ProgContext extends ParserRuleContext {
		public Object _prog;
		public ExpContext exp_0;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); ((ProgContext)_localctx).exp_0 = exp(0);
			((ProgContext)_localctx)._prog =  builder.start((((ProgContext)_localctx).exp_0._exp));
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

	public static class ExptupleContext extends ParserRuleContext {
		public Object _exptuple;
		public ExpContext exp_0;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExptupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exptuple; }
	}

	public final ExptupleContext exptuple() throws RecognitionException {
		ExptupleContext _localctx = new ExptupleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exptuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(16);
			setState(126); ((ExptupleContext)_localctx).exp_0 = exp(0);
			((ExptupleContext)_localctx)._exptuple =  builder.exprTupleSingle((((ExptupleContext)_localctx).exp_0._exp));
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

	public static class DeclpattmonoContext extends ParserRuleContext {
		public Object _declpattmono;
		public PattContext patt_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public DeclpattmonoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declpattmono; }
	}

	public final DeclpattmonoContext declpattmono() throws RecognitionException {
		DeclpattmonoContext _localctx = new DeclpattmonoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declpattmono);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); ((DeclpattmonoContext)_localctx).patt_0 = patt(0);
			setState(130); match(7);
			setState(131); ((DeclpattmonoContext)_localctx).exp_1 = exp(0);
			((DeclpattmonoContext)_localctx)._declpattmono =  builder.declBindPattMono((((DeclpattmonoContext)_localctx).patt_0._patt),(((DeclpattmonoContext)_localctx).exp_1._exp));
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

	public static class LetExpContext extends ParserRuleContext {
		public Object _letExp;
		public DeclContext decl_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public LetExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExp; }
	}

	public final LetExpContext letExp() throws RecognitionException {
		LetExpContext _localctx = new LetExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); ((LetExpContext)_localctx).decl_0 = decl();
			setState(135); match(30);
			setState(136); ((LetExpContext)_localctx).exp_1 = exp(0);
			((LetExpContext)_localctx)._letExp =  builder.letInExp((((LetExpContext)_localctx).decl_0._decl),(((LetExpContext)_localctx).exp_1._exp));
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

	public static class PatttupleContext extends ParserRuleContext {
		public Object _patttuple;
		public PattContext patt_0;
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public PatttupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patttuple; }
	}

	public final PatttupleContext patttuple() throws RecognitionException {
		PatttupleContext _localctx = new PatttupleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(16);
			setState(140); ((PatttupleContext)_localctx).patt_0 = patt(0);
			((PatttupleContext)_localctx)._patttuple =  builder.pattTupleSingle((((PatttupleContext)_localctx).patt_0._patt));
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

	public static class FunctionContext extends ParserRuleContext {
		public Object _function;
		public FunctionContext function_0;
		public PattmatchContext pattmatch_0;
		public Token ID_0;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchcurriedContext pattmatchcurried_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(CLParser.ID, 0); }
		public PattmatchsingleContext pattmatchsingle() {
			return getRuleContext(PattmatchsingleContext.class,0);
		}
		public PattmatchcurriedContext pattmatchcurried() {
			return getRuleContext(PattmatchcurriedContext.class,0);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		return function(0);
	}

	private FunctionContext function(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionContext _localctx = new FunctionContext(_ctx, _parentState);
		FunctionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(144); match(31);
				setState(145); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(148); match(29);
				setState(149); ((FunctionContext)_localctx).function_0 = function(0);
				setState(150); match(32);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(153); ((FunctionContext)_localctx).ID_0 = match(ID);
				((FunctionContext)_localctx)._function =  builder.functionId(id((((FunctionContext)_localctx).ID_0!=null?((FunctionContext)_localctx).ID_0.getText():null)));
				}
				break;

			case 4:
				{
				setState(155); match(14);
				setState(156); ((FunctionContext)_localctx).function_0 = function(0);
				setState(157); match(33);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(160); match(2);
				setState(161); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(164); match(2);
				setState(165); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(170);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(171); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ExpContext extends ParserRuleContext {
		public Object _exp;
		public ExpContext exp_0;
		public ExpContext exp_1;
		public ExpContext exp_2;
		public IdentContext ident_0;
		public ExpContext exp_3;
		public PattmatchContext pattmatch_1;
		public ConstantContext constant_0;
		public LetExpContext letExp_0;
		public ExptupleContext exptuple;
		public List<ExptupleContext> exptuple_1_list = new ArrayList<ExptupleContext>();
		public FunctionContext function_0;
		public Token op_80;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExptupleContext exptuple(int i) {
			return getRuleContext(ExptupleContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<ExptupleContext> exptuple() {
			return getRuleContexts(ExptupleContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(180); match(12);
				setState(181); ((ExpContext)_localctx).exp_0 = exp(21);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(184); match(8);
				setState(185); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(186); match(37);
				setState(187); ((ExpContext)_localctx).exp_1 = exp(18);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				{
				setState(190); match(8);
				setState(191); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(192); match(37);
				setState(193); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(194); match(28);
				setState(195); ((ExpContext)_localctx).exp_2 = exp(14);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 4:
				{
				setState(198); match(38);
				setState(199); ((ExpContext)_localctx).exp_0 = exp(4);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(202); match(9);
				setState(203); ((ExpContext)_localctx).ident_0 = ident();
				setState(204); match(7);
				setState(205); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(206); match(19);
				setState(207); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(208); match(13);
				setState(209); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(210); match(18);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 6:
				{
				setState(213); match(5);
				setState(214); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(215); match(13);
				setState(216); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(217); match(18);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 7:
				{
				setState(220); match(9);
				setState(221); ((ExpContext)_localctx).ident_0 = ident();
				setState(222); match(7);
				setState(223); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(224); match(34);
				setState(225); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(226); match(13);
				setState(227); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(228); match(18);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 8:
				{
				setState(231); match(27);
				setState(232); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(233); match(23);
				setState(234); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 9:
				{
				setState(237); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 10:
				{
				setState(240); match(29);
				setState(241); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(242); match(32);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 11:
				{
				setState(245); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 12:
				{
				setState(248); match(14);
				setState(249); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(250); match(33);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(253); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;

			case 14:
				{
				setState(256); match(14);
				setState(257); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(258); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(261); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==16 );
				setState(263); match(33);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 15:
				{
				setState(266); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(301);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(271);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(272); match(4);
						setState(273); ((ExpContext)_localctx).exp_1 = exp(16);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(276);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(277); match(15);
						setState(278); ((ExpContext)_localctx).exp_1 = exp(8);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(281);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(282); match(36);
						setState(283); ((ExpContext)_localctx).exp_1 = exp(7);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(286);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(287);
						((ExpContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 10) | (1L << 20) | (1L << 21) | (1L << 24))) != 0)) ) {
							((ExpContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(288); ((ExpContext)_localctx).exp_1 = exp(6);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(292);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==11) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(293); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(296);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(297);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==25) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(298); ((ExpContext)_localctx).exp_1 = exp(3);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return patt_sempred((PattContext)_localctx, predIndex);

		case 13: return function_sempred((FunctionContext)_localctx, predIndex);

		case 14: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 15);

		case 3: return precpred(_ctx, 7);

		case 4: return precpred(_ctx, 6);

		case 5: return precpred(_ctx, 5);

		case 6: return precpred(_ctx, 3);

		case 7: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0135\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\6\4\64\n"+
		"\4\r\4\16\4\65\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\6\6P\n\6\r\6\16\6Q\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ab\n\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00b1\n\17\f\17\16\17\u00b4\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\6\20\u0106\n\20\r\20\16\20\u0107\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0110\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0130\n\20\f\20\16\20\u0133\13"+
		"\20\3\20\2\5\n\34\36\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\6\2"+
		"\t\t\f\f\26\27\32\32\4\2\b\b\r\r\4\2\5\5\33\33\u014c\2*\3\2\2\2\4\60\3"+
		"\2\2\2\6\63\3\2\2\2\bI\3\2\2\2\nc\3\2\2\2\fo\3\2\2\2\16r\3\2\2\2\20w\3"+
		"\2\2\2\22|\3\2\2\2\24\177\3\2\2\2\26\u0083\3\2\2\2\30\u0088\3\2\2\2\32"+
		"\u008d\3\2\2\2\34\u00aa\3\2\2\2\36\u010f\3\2\2\2 !\5\16\b\2!\"\b\2\1\2"+
		"\"+\3\2\2\2#$\7\30\2\2$%\5\2\2\2%&\b\2\1\2&+\3\2\2\2\'(\5\20\t\2()\b\2"+
		"\1\2)+\3\2\2\2* \3\2\2\2*#\3\2\2\2*\'\3\2\2\2+\3\3\2\2\2,-\7+\2\2-\61"+
		"\b\3\1\2./\7,\2\2/\61\b\3\1\2\60,\3\2\2\2\60.\3\2\2\2\61\5\3\2\2\2\62"+
		"\64\5\n\6\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\67\3\2\2\2\678\7\23\2\289\5\36\20\29:\b\4\1\2:\7\3\2\2\2;<\5\n\6\2<="+
		"\7\t\2\2=>\5\36\20\2>?\b\5\1\2?J\3\2\2\2@A\7\34\2\2AB\5\b\5\2BC\b\5\1"+
		"\2CJ\3\2\2\2DE\5\26\f\2EF\7%\2\2FG\5\b\5\2GH\b\5\1\2HJ\3\2\2\2I;\3\2\2"+
		"\2I@\3\2\2\2ID\3\2\2\2J\t\3\2\2\2KL\b\6\1\2LM\7\20\2\2MO\5\n\6\2NP\5\32"+
		"\16\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7#\2\2TU\b\6"+
		"\1\2Ud\3\2\2\2VW\7\20\2\2WX\5\n\6\2XY\7#\2\2YZ\b\6\1\2Zd\3\2\2\2[\\\5"+
		"\f\7\2\\]\b\6\1\2]d\3\2\2\2^_\7)\2\2_d\b\6\1\2`a\5\4\3\2ab\b\6\1\2bd\3"+
		"\2\2\2cK\3\2\2\2cV\3\2\2\2c[\3\2\2\2c^\3\2\2\2c`\3\2\2\2dl\3\2\2\2ef\f"+
		"\7\2\2fg\7\3\2\2gh\5\f\7\2hi\b\6\1\2ik\3\2\2\2je\3\2\2\2kn\3\2\2\2lj\3"+
		"\2\2\2lm\3\2\2\2m\13\3\2\2\2nl\3\2\2\2op\7-\2\2pq\b\7\1\2q\r\3\2\2\2r"+
		"s\5\n\6\2st\7\23\2\2tu\5\36\20\2uv\b\b\1\2v\17\3\2\2\2wx\5\16\b\2xy\7"+
		"\30\2\2yz\5\2\2\2z{\b\t\1\2{\21\3\2\2\2|}\5\36\20\2}~\b\n\1\2~\23\3\2"+
		"\2\2\177\u0080\7\22\2\2\u0080\u0081\5\36\20\2\u0081\u0082\b\13\1\2\u0082"+
		"\25\3\2\2\2\u0083\u0084\5\n\6\2\u0084\u0085\7\t\2\2\u0085\u0086\5\36\20"+
		"\2\u0086\u0087\b\f\1\2\u0087\27\3\2\2\2\u0088\u0089\5\b\5\2\u0089\u008a"+
		"\7 \2\2\u008a\u008b\5\36\20\2\u008b\u008c\b\r\1\2\u008c\31\3\2\2\2\u008d"+
		"\u008e\7\22\2\2\u008e\u008f\5\n\6\2\u008f\u0090\b\16\1\2\u0090\33\3\2"+
		"\2\2\u0091\u0092\b\17\1\2\u0092\u0093\7!\2\2\u0093\u0094\5\2\2\2\u0094"+
		"\u0095\b\17\1\2\u0095\u00ab\3\2\2\2\u0096\u0097\7\37\2\2\u0097\u0098\5"+
		"\34\17\2\u0098\u0099\7\"\2\2\u0099\u009a\b\17\1\2\u009a\u00ab\3\2\2\2"+
		"\u009b\u009c\7-\2\2\u009c\u00ab\b\17\1\2\u009d\u009e\7\20\2\2\u009e\u009f"+
		"\5\34\17\2\u009f\u00a0\7#\2\2\u00a0\u00a1\b\17\1\2\u00a1\u00ab\3\2\2\2"+
		"\u00a2\u00a3\7\4\2\2\u00a3\u00a4\5\16\b\2\u00a4\u00a5\b\17\1\2\u00a5\u00ab"+
		"\3\2\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00a8\5\6\4\2\u00a8\u00a9\b\17\1\2"+
		"\u00a9\u00ab\3\2\2\2\u00aa\u0091\3\2\2\2\u00aa\u0096\3\2\2\2\u00aa\u009b"+
		"\3\2\2\2\u00aa\u009d\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab"+
		"\u00b2\3\2\2\2\u00ac\u00ad\f\b\2\2\u00ad\u00ae\5\36\20\2\u00ae\u00af\b"+
		"\17\1\2\u00af\u00b1\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\35\3\2\2\2\u00b4\u00b2\3\2\2"+
		"\2\u00b5\u00b6\b\20\1\2\u00b6\u00b7\7\16\2\2\u00b7\u00b8\5\36\20\27\u00b8"+
		"\u00b9\b\20\1\2\u00b9\u0110\3\2\2\2\u00ba\u00bb\7\n\2\2\u00bb\u00bc\5"+
		"\36\20\2\u00bc\u00bd\7\'\2\2\u00bd\u00be\5\36\20\24\u00be\u00bf\b\20\1"+
		"\2\u00bf\u0110\3\2\2\2\u00c0\u00c1\7\n\2\2\u00c1\u00c2\5\36\20\2\u00c2"+
		"\u00c3\7\'\2\2\u00c3\u00c4\5\36\20\2\u00c4\u00c5\7\36\2\2\u00c5\u00c6"+
		"\5\36\20\20\u00c6\u00c7\b\20\1\2\u00c7\u0110\3\2\2\2\u00c8\u00c9\7(\2"+
		"\2\u00c9\u00ca\5\36\20\6\u00ca\u00cb\b\20\1\2\u00cb\u0110\3\2\2\2\u00cc"+
		"\u00cd\7\13\2\2\u00cd\u00ce\5\f\7\2\u00ce\u00cf\7\t\2\2\u00cf\u00d0\5"+
		"\36\20\2\u00d0\u00d1\7\25\2\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\7\17\2"+
		"\2\u00d3\u00d4\5\36\20\2\u00d4\u00d5\7\24\2\2\u00d5\u00d6\b\20\1\2\u00d6"+
		"\u0110\3\2\2\2\u00d7\u00d8\7\7\2\2\u00d8\u00d9\5\36\20\2\u00d9\u00da\7"+
		"\17\2\2\u00da\u00db\5\36\20\2\u00db\u00dc\7\24\2\2\u00dc\u00dd\b\20\1"+
		"\2\u00dd\u0110\3\2\2\2\u00de\u00df\7\13\2\2\u00df\u00e0\5\f\7\2\u00e0"+
		"\u00e1\7\t\2\2\u00e1\u00e2\5\36\20\2\u00e2\u00e3\7$\2\2\u00e3\u00e4\5"+
		"\36\20\2\u00e4\u00e5\7\17\2\2\u00e5\u00e6\5\36\20\2\u00e6\u00e7\7\24\2"+
		"\2\u00e7\u00e8\b\20\1\2\u00e8\u0110\3\2\2\2\u00e9\u00ea\7\35\2\2\u00ea"+
		"\u00eb\5\36\20\2\u00eb\u00ec\7\31\2\2\u00ec\u00ed\5\2\2\2\u00ed\u00ee"+
		"\b\20\1\2\u00ee\u0110\3\2\2\2\u00ef\u00f0\5\4\3\2\u00f0\u00f1\b\20\1\2"+
		"\u00f1\u0110\3\2\2\2\u00f2\u00f3\7\37\2\2\u00f3\u00f4\5\36\20\2\u00f4"+
		"\u00f5\7\"\2\2\u00f5\u00f6\b\20\1\2\u00f6\u0110\3\2\2\2\u00f7\u00f8\5"+
		"\f\7\2\u00f8\u00f9\b\20\1\2\u00f9\u0110\3\2\2\2\u00fa\u00fb\7\20\2\2\u00fb"+
		"\u00fc\5\36\20\2\u00fc\u00fd\7#\2\2\u00fd\u00fe\b\20\1\2\u00fe\u0110\3"+
		"\2\2\2\u00ff\u0100\5\30\r\2\u0100\u0101\b\20\1\2\u0101\u0110\3\2\2\2\u0102"+
		"\u0103\7\20\2\2\u0103\u0105\5\36\20\2\u0104\u0106\5\24\13\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7#\2\2\u010a\u010b\b\20\1\2\u010b\u0110\3\2"+
		"\2\2\u010c\u010d\5\34\17\2\u010d\u010e\b\20\1\2\u010e\u0110\3\2\2\2\u010f"+
		"\u00b5\3\2\2\2\u010f\u00ba\3\2\2\2\u010f\u00c0\3\2\2\2\u010f\u00c8\3\2"+
		"\2\2\u010f\u00cc\3\2\2\2\u010f\u00d7\3\2\2\2\u010f\u00de\3\2\2\2\u010f"+
		"\u00e9\3\2\2\2\u010f\u00ef\3\2\2\2\u010f\u00f2\3\2\2\2\u010f\u00f7\3\2"+
		"\2\2\u010f\u00fa\3\2\2\2\u010f\u00ff\3\2\2\2\u010f\u0102\3\2\2\2\u010f"+
		"\u010c\3\2\2\2\u0110\u0131\3\2\2\2\u0111\u0112\f\21\2\2\u0112\u0113\7"+
		"\6\2\2\u0113\u0114\5\36\20\22\u0114\u0115\b\20\1\2\u0115\u0130\3\2\2\2"+
		"\u0116\u0117\f\t\2\2\u0117\u0118\7\21\2\2\u0118\u0119\5\36\20\n\u0119"+
		"\u011a\b\20\1\2\u011a\u0130\3\2\2\2\u011b\u011c\f\b\2\2\u011c\u011d\7"+
		"&\2\2\u011d\u011e\5\36\20\t\u011e\u011f\b\20\1\2\u011f\u0130\3\2\2\2\u0120"+
		"\u0121\f\7\2\2\u0121\u0122\t\2\2\2\u0122\u0123\5\36\20\b\u0123\u0124\b"+
		"\20\1\2\u0124\u0130\3\2\2\2\u0125\u0126\f\5\2\2\u0126\u0127\t\3\2\2\u0127"+
		"\u0128\5\36\20\6\u0128\u0129\b\20\1\2\u0129\u0130\3\2\2\2\u012a\u012b"+
		"\f\4\2\2\u012b\u012c\t\4\2\2\u012c\u012d\5\36\20\5\u012d\u012e\b\20\1"+
		"\2\u012e\u0130\3\2\2\2\u012f\u0111\3\2\2\2\u012f\u0116\3\2\2\2\u012f\u011b"+
		"\3\2\2\2\u012f\u0120\3\2\2\2\u012f\u0125\3\2\2\2\u012f\u012a\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\37\3\2\2"+
		"\2\u0133\u0131\3\2\2\2\17*\60\65IQcl\u00aa\u00b2\u0107\u010f\u012f\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}