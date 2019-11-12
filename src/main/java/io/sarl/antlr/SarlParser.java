// Generated from SarlParser.g4 by ANTLR 4.7.2

package io.sarl.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SarlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ShebangLine=1, DelimitedComment=2, LineComment=3, WS=4, NL=5, RESERVED=6, 
		DOT=7, COMMA=8, LPAREN=9, RPAREN=10, LSQUARE=11, RSQUARE=12, LCURL=13, 
		RCURL=14, MULT=15, MOD=16, DIV=17, ADD=18, SUB=19, INCR=20, DECR=21, CONJ=22, 
		DISJ=23, EXCL=24, COLON=25, SEMICOLON=26, ASSIGNMENT=27, ADD_ASSIGNMENT=28, 
		SUB_ASSIGNMENT=29, MULT_ASSIGNMENT=30, DIV_ASSIGNMENT=31, MOD_ASSIGNMENT=32, 
		ARROW=33, DOUBLE_ARROW=34, RANGE=35, COLONCOLON=36, Q_COLONCOLON=37, DOUBLE_SEMICOLON=38, 
		HASH=39, AT=40, QUEST=41, ELVIS=42, LANGLE=43, RANGLE=44, LE=45, GE=46, 
		EXCL_EQ=47, EXCL_EQEQ=48, AS_SAFE=49, EQEQ=50, EQEQEQ=51, SINGLE_QUOTE=52, 
		RETURN_AT=53, CONTINUE_AT=54, BREAK_AT=55, FILE=56, PACKAGE=57, IMPORT=58, 
		CLASS=59, INTERFACE=60, FUN=61, OBJECT=62, VAL=63, VAR=64, TYPE_ALIAS=65, 
		CONSTRUCTOR=66, BY=67, COMPANION=68, INIT=69, THIS=70, SUPER=71, TYPEOF=72, 
		WHERE=73, IF=74, ELSE=75, WHEN=76, TRY=77, CATCH=78, FINALLY=79, FOR=80, 
		DO=81, WHILE=82, THROW=83, RETURN=84, CONTINUE=85, BREAK=86, AS=87, IS=88, 
		IN=89, NOT_IS=90, NOT_IN=91, OUT=92, FIELD=93, PROPERTY=94, GET=95, SET=96, 
		GETTER=97, SETTER=98, RECEIVER=99, PARAM=100, SETPARAM=101, DELEGATE=102, 
		DYNAMIC=103, PUBLIC=104, PRIVATE=105, PROTECTED=106, INTERNAL=107, ENUM=108, 
		SEALED=109, ANNOTATION=110, DATA=111, INNER=112, TAILREC=113, OPERATOR=114, 
		INLINE=115, INFIX=116, EXTERNAL=117, SUSPEND=118, OVERRIDE=119, ABSTRACT=120, 
		FINAL=121, OPEN=122, CONST=123, LATEINIT=124, VARARG=125, NOINLINE=126, 
		CROSSINLINE=127, REIFIED=128, AGENT=129, BEHAVIOR=130, CAPACITY=131, EVENT=132, 
		SKILL=133, OCCURRENCE=134, ON=135, USES=136, QUOTE_OPEN=137, TRIPLE_QUOTE_OPEN=138, 
		RealLiteral=139, FloatLiteral=140, DoubleLiteral=141, LongLiteral=142, 
		IntegerLiteral=143, HexLiteral=144, BinLiteral=145, BooleanLiteral=146, 
		NullLiteral=147, Identifier=148, LabelReference=149, LabelDefinition=150, 
		FieldIdentifier=151, CharacterLiteral=152, UNICODE_CLASS_LL=153, UNICODE_CLASS_LM=154, 
		UNICODE_CLASS_LO=155, UNICODE_CLASS_LT=156, UNICODE_CLASS_LU=157, UNICODE_CLASS_ND=158, 
		UNICODE_CLASS_NL=159, Inside_Comment=160, Inside_WS=161, Inside_NL=162, 
		QUOTE_CLOSE=163, LineStrRef=164, LineStrText=165, LineStrEscapedChar=166, 
		LineStrExprStart=167, TRIPLE_QUOTE_CLOSE=168, MultiLineStringQuote=169, 
		MultiLineStrRef=170, MultiLineStrText=171, MultiLineStrEscapedChar=172, 
		MultiLineStrExprStart=173, MultiLineNL=174, StrExpr_IN=175, StrExpr_Comment=176, 
		StrExpr_WS=177, StrExpr_NL=178, ERRCHAR=179;
	public static final int
		RULE_sarlFile = 0, RULE_preamble = 1, RULE_fileAnnotations = 2, RULE_fileAnnotation = 3, 
		RULE_packageHeader = 4, RULE_importList = 5, RULE_importHeader = 6, RULE_importAlias = 7, 
		RULE_topLevelObject = 8, RULE_classDeclaration = 9, RULE_agentDeclaration = 10, 
		RULE_behaviorDeclaration = 11, RULE_capacityDeclaration = 12, RULE_eventDeclaration = 13, 
		RULE_skillDeclaration = 14, RULE_primaryConstructor = 15, RULE_classParameters = 16, 
		RULE_classParameter = 17, RULE_delegationSpecifiers = 18, RULE_delegationSpecifier = 19, 
		RULE_constructorInvocation = 20, RULE_explicitDelegation = 21, RULE_classBody = 22, 
		RULE_agentBody = 23, RULE_behaviorBody = 24, RULE_classMemberDeclaration = 25, 
		RULE_agentMemberDeclaration = 26, RULE_behaviorMemberDeclaration = 27, 
		RULE_anonymousInitializer = 28, RULE_secondaryConstructor = 29, RULE_constructorDelegationCall = 30, 
		RULE_enumClassBody = 31, RULE_enumEntries = 32, RULE_enumEntry = 33, RULE_functionDeclaration = 34, 
		RULE_functionValueParameters = 35, RULE_functionValueParameter = 36, RULE_parameter = 37, 
		RULE_functionBody = 38, RULE_onDeclaration = 39, RULE_usesDeclaration = 40, 
		RULE_objectDeclaration = 41, RULE_companionObject = 42, RULE_propertyDeclaration = 43, 
		RULE_multiVariableDeclaration = 44, RULE_variableDeclaration = 45, RULE_getter = 46, 
		RULE_setter = 47, RULE_typeAlias = 48, RULE_typeParameters = 49, RULE_typeParameter = 50, 
		RULE_type = 51, RULE_typeModifierList = 52, RULE_parenthesizedType = 53, 
		RULE_nullableType = 54, RULE_typeReference = 55, RULE_functionType = 56, 
		RULE_functionTypeReceiver = 57, RULE_userType = 58, RULE_simpleUserType = 59, 
		RULE_functionTypeParameters = 60, RULE_typeConstraints = 61, RULE_typeConstraint = 62, 
		RULE_block = 63, RULE_statements = 64, RULE_statement = 65, RULE_blockLevelExpression = 66, 
		RULE_declaration = 67, RULE_expression = 68, RULE_disjunction = 69, RULE_conjunction = 70, 
		RULE_equalityComparison = 71, RULE_comparison = 72, RULE_namedInfix = 73, 
		RULE_elvisExpression = 74, RULE_infixFunctionCall = 75, RULE_rangeExpression = 76, 
		RULE_additiveExpression = 77, RULE_multiplicativeExpression = 78, RULE_typeRHS = 79, 
		RULE_prefixUnaryExpression = 80, RULE_postfixUnaryExpression = 81, RULE_atomicExpression = 82, 
		RULE_parenthesizedExpression = 83, RULE_callSuffix = 84, RULE_annotatedLambda = 85, 
		RULE_arrayAccess = 86, RULE_valueArguments = 87, RULE_typeArguments = 88, 
		RULE_typeProjection = 89, RULE_typeProjectionModifierList = 90, RULE_valueArgument = 91, 
		RULE_literalConstant = 92, RULE_stringLiteral = 93, RULE_lineStringLiteral = 94, 
		RULE_multiLineStringLiteral = 95, RULE_lineStringContent = 96, RULE_lineStringExpression = 97, 
		RULE_multiLineStringContent = 98, RULE_multiLineStringExpression = 99, 
		RULE_functionLiteral = 100, RULE_lambdaParameters = 101, RULE_lambdaParameter = 102, 
		RULE_objectLiteral = 103, RULE_collectionLiteral = 104, RULE_thisExpression = 105, 
		RULE_superExpression = 106, RULE_conditionalExpression = 107, RULE_ifExpression = 108, 
		RULE_controlStructureBody = 109, RULE_whenExpression = 110, RULE_whenEntry = 111, 
		RULE_whenCondition = 112, RULE_rangeTest = 113, RULE_typeTest = 114, RULE_tryExpression = 115, 
		RULE_catchBlock = 116, RULE_finallyBlock = 117, RULE_loopExpression = 118, 
		RULE_forExpression = 119, RULE_whileExpression = 120, RULE_doWhileExpression = 121, 
		RULE_jumpExpression = 122, RULE_callableReference = 123, RULE_assignmentOperator = 124, 
		RULE_equalityOperation = 125, RULE_comparisonOperator = 126, RULE_inOperator = 127, 
		RULE_isOperator = 128, RULE_additiveOperator = 129, RULE_multiplicativeOperation = 130, 
		RULE_typeOperation = 131, RULE_prefixUnaryOperation = 132, RULE_postfixUnaryOperation = 133, 
		RULE_memberAccessOperator = 134, RULE_modifierList = 135, RULE_modifier = 136, 
		RULE_classModifier = 137, RULE_memberModifier = 138, RULE_visibilityModifier = 139, 
		RULE_varianceAnnotation = 140, RULE_functionModifier = 141, RULE_propertyModifier = 142, 
		RULE_inheritanceModifier = 143, RULE_parameterModifier = 144, RULE_typeParameterModifier = 145, 
		RULE_labelDefinition = 146, RULE_annotations = 147, RULE_annotation = 148, 
		RULE_annotationList = 149, RULE_annotationUseSiteTarget = 150, RULE_unescapedAnnotation = 151, 
		RULE_identifier = 152, RULE_simpleIdentifier = 153, RULE_semi = 154, RULE_anysemi = 155;
	private static String[] makeRuleNames() {
		return new String[] {
			"sarlFile", "preamble", "fileAnnotations", "fileAnnotation", "packageHeader", 
			"importList", "importHeader", "importAlias", "topLevelObject", "classDeclaration", 
			"agentDeclaration", "behaviorDeclaration", "capacityDeclaration", "eventDeclaration", 
			"skillDeclaration", "primaryConstructor", "classParameters", "classParameter", 
			"delegationSpecifiers", "delegationSpecifier", "constructorInvocation", 
			"explicitDelegation", "classBody", "agentBody", "behaviorBody", "classMemberDeclaration", 
			"agentMemberDeclaration", "behaviorMemberDeclaration", "anonymousInitializer", 
			"secondaryConstructor", "constructorDelegationCall", "enumClassBody", 
			"enumEntries", "enumEntry", "functionDeclaration", "functionValueParameters", 
			"functionValueParameter", "parameter", "functionBody", "onDeclaration", 
			"usesDeclaration", "objectDeclaration", "companionObject", "propertyDeclaration", 
			"multiVariableDeclaration", "variableDeclaration", "getter", "setter", 
			"typeAlias", "typeParameters", "typeParameter", "type", "typeModifierList", 
			"parenthesizedType", "nullableType", "typeReference", "functionType", 
			"functionTypeReceiver", "userType", "simpleUserType", "functionTypeParameters", 
			"typeConstraints", "typeConstraint", "block", "statements", "statement", 
			"blockLevelExpression", "declaration", "expression", "disjunction", "conjunction", 
			"equalityComparison", "comparison", "namedInfix", "elvisExpression", 
			"infixFunctionCall", "rangeExpression", "additiveExpression", "multiplicativeExpression", 
			"typeRHS", "prefixUnaryExpression", "postfixUnaryExpression", "atomicExpression", 
			"parenthesizedExpression", "callSuffix", "annotatedLambda", "arrayAccess", 
			"valueArguments", "typeArguments", "typeProjection", "typeProjectionModifierList", 
			"valueArgument", "literalConstant", "stringLiteral", "lineStringLiteral", 
			"multiLineStringLiteral", "lineStringContent", "lineStringExpression", 
			"multiLineStringContent", "multiLineStringExpression", "functionLiteral", 
			"lambdaParameters", "lambdaParameter", "objectLiteral", "collectionLiteral", 
			"thisExpression", "superExpression", "conditionalExpression", "ifExpression", 
			"controlStructureBody", "whenExpression", "whenEntry", "whenCondition", 
			"rangeTest", "typeTest", "tryExpression", "catchBlock", "finallyBlock", 
			"loopExpression", "forExpression", "whileExpression", "doWhileExpression", 
			"jumpExpression", "callableReference", "assignmentOperator", "equalityOperation", 
			"comparisonOperator", "inOperator", "isOperator", "additiveOperator", 
			"multiplicativeOperation", "typeOperation", "prefixUnaryOperation", "postfixUnaryOperation", 
			"memberAccessOperator", "modifierList", "modifier", "classModifier", 
			"memberModifier", "visibilityModifier", "varianceAnnotation", "functionModifier", 
			"propertyModifier", "inheritanceModifier", "parameterModifier", "typeParameterModifier", 
			"labelDefinition", "annotations", "annotation", "annotationList", "annotationUseSiteTarget", 
			"unescapedAnnotation", "identifier", "simpleIdentifier", "semi", "anysemi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'...'", "'.'", "','", "'('", null, 
			"'['", null, "'{'", "'}'", "'*'", "'%'", "'/'", "'+'", "'-'", "'++'", 
			"'--'", "'&&'", "'||'", "'!'", "':'", "';'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'->'", "'=>'", "'..'", "'::'", "'?::'", "';;'", "'#'", 
			"'@'", "'?'", "'?:'", "'<'", "'>'", "'<='", "'>='", "'!='", "'!=='", 
			"'as?'", "'=='", "'==='", "'''", null, null, null, "'@file'", "'package'", 
			"'import'", "'class'", "'interface'", "'fun'", "'object'", "'val'", "'var'", 
			"'typealias'", "'constructor'", "'by'", "'companion'", "'init'", "'this'", 
			"'super'", "'typeof'", "'where'", "'if'", "'else'", "'when'", "'try'", 
			"'catch'", "'finally'", "'for'", "'do'", "'while'", "'throw'", "'return'", 
			"'continue'", "'break'", "'as'", "'is'", "'in'", null, null, "'out'", 
			"'@field'", "'@property'", "'@get'", "'@set'", "'get'", "'set'", "'@receiver'", 
			"'@param'", "'@setparam'", "'@delegate'", "'dynamic'", "'public'", "'private'", 
			"'protected'", "'internal'", "'enum'", "'sealed'", "'annotation'", "'data'", 
			"'inner'", "'tailrec'", "'operator'", "'inline'", "'infix'", "'external'", 
			"'suspend'", "'override'", "'abstract'", "'final'", "'open'", "'const'", 
			"'lateinit'", "'vararg'", "'noinline'", "'crossinline'", "'reified'", 
			"'agent'", "'behavior'", "'capacity'", "'event'", "'skill'", "'occurrence'", 
			"'on'", "'uses'", null, "'\"\"\"'", null, null, null, null, null, null, 
			null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ShebangLine", "DelimitedComment", "LineComment", "WS", "NL", "RESERVED", 
			"DOT", "COMMA", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURL", "RCURL", 
			"MULT", "MOD", "DIV", "ADD", "SUB", "INCR", "DECR", "CONJ", "DISJ", "EXCL", 
			"COLON", "SEMICOLON", "ASSIGNMENT", "ADD_ASSIGNMENT", "SUB_ASSIGNMENT", 
			"MULT_ASSIGNMENT", "DIV_ASSIGNMENT", "MOD_ASSIGNMENT", "ARROW", "DOUBLE_ARROW", 
			"RANGE", "COLONCOLON", "Q_COLONCOLON", "DOUBLE_SEMICOLON", "HASH", "AT", 
			"QUEST", "ELVIS", "LANGLE", "RANGLE", "LE", "GE", "EXCL_EQ", "EXCL_EQEQ", 
			"AS_SAFE", "EQEQ", "EQEQEQ", "SINGLE_QUOTE", "RETURN_AT", "CONTINUE_AT", 
			"BREAK_AT", "FILE", "PACKAGE", "IMPORT", "CLASS", "INTERFACE", "FUN", 
			"OBJECT", "VAL", "VAR", "TYPE_ALIAS", "CONSTRUCTOR", "BY", "COMPANION", 
			"INIT", "THIS", "SUPER", "TYPEOF", "WHERE", "IF", "ELSE", "WHEN", "TRY", 
			"CATCH", "FINALLY", "FOR", "DO", "WHILE", "THROW", "RETURN", "CONTINUE", 
			"BREAK", "AS", "IS", "IN", "NOT_IS", "NOT_IN", "OUT", "FIELD", "PROPERTY", 
			"GET", "SET", "GETTER", "SETTER", "RECEIVER", "PARAM", "SETPARAM", "DELEGATE", 
			"DYNAMIC", "PUBLIC", "PRIVATE", "PROTECTED", "INTERNAL", "ENUM", "SEALED", 
			"ANNOTATION", "DATA", "INNER", "TAILREC", "OPERATOR", "INLINE", "INFIX", 
			"EXTERNAL", "SUSPEND", "OVERRIDE", "ABSTRACT", "FINAL", "OPEN", "CONST", 
			"LATEINIT", "VARARG", "NOINLINE", "CROSSINLINE", "REIFIED", "AGENT", 
			"BEHAVIOR", "CAPACITY", "EVENT", "SKILL", "OCCURRENCE", "ON", "USES", 
			"QUOTE_OPEN", "TRIPLE_QUOTE_OPEN", "RealLiteral", "FloatLiteral", "DoubleLiteral", 
			"LongLiteral", "IntegerLiteral", "HexLiteral", "BinLiteral", "BooleanLiteral", 
			"NullLiteral", "Identifier", "LabelReference", "LabelDefinition", "FieldIdentifier", 
			"CharacterLiteral", "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", 
			"UNICODE_CLASS_LT", "UNICODE_CLASS_LU", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL", 
			"Inside_Comment", "Inside_WS", "Inside_NL", "QUOTE_CLOSE", "LineStrRef", 
			"LineStrText", "LineStrEscapedChar", "LineStrExprStart", "TRIPLE_QUOTE_CLOSE", 
			"MultiLineStringQuote", "MultiLineStrRef", "MultiLineStrText", "MultiLineStrEscapedChar", 
			"MultiLineStrExprStart", "MultiLineNL", "StrExpr_IN", "StrExpr_Comment", 
			"StrExpr_WS", "StrExpr_NL", "ERRCHAR"
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
	public String getGrammarFileName() { return "SarlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SarlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SarlFileContext extends ParserRuleContext {
		public PreambleContext preamble() {
			return getRuleContext(PreambleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SarlParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<AnysemiContext> anysemi() {
			return getRuleContexts(AnysemiContext.class);
		}
		public AnysemiContext anysemi(int i) {
			return getRuleContext(AnysemiContext.class,i);
		}
		public List<TopLevelObjectContext> topLevelObject() {
			return getRuleContexts(TopLevelObjectContext.class);
		}
		public TopLevelObjectContext topLevelObject(int i) {
			return getRuleContext(TopLevelObjectContext.class,i);
		}
		public SarlFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sarlFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterSarlFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitSarlFile(this);
		}
	}

	public final SarlFileContext sarlFile() throws RecognitionException {
		SarlFileContext _localctx = new SarlFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sarlFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(NL);
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(318);
			preamble();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL || _la==SEMICOLON) {
				{
				{
				setState(319);
				anysemi();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (AGENT - 104)) | (1L << (BEHAVIOR - 104)) | (1L << (CAPACITY - 104)) | (1L << (EVENT - 104)) | (1L << (SKILL - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				setState(325);
				topLevelObject();
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL || _la==SEMICOLON) {
					{
					{
					setState(327); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(326);
							anysemi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(329); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (AGENT - 104)) | (1L << (BEHAVIOR - 104)) | (1L << (CAPACITY - 104)) | (1L << (EVENT - 104)) | (1L << (SKILL - 104)) | (1L << (LabelReference - 104)))) != 0)) {
						{
						setState(331);
						topLevelObject();
						}
					}

					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(341);
			match(EOF);
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

	public static class PreambleContext extends ParserRuleContext {
		public PackageHeaderContext packageHeader() {
			return getRuleContext(PackageHeaderContext.class,0);
		}
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public FileAnnotationsContext fileAnnotations() {
			return getRuleContext(FileAnnotationsContext.class,0);
		}
		public PreambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterPreamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitPreamble(this);
		}
	}

	public final PreambleContext preamble() throws RecognitionException {
		PreambleContext _localctx = new PreambleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preamble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(343);
				fileAnnotations();
				}
				break;
			}
			setState(346);
			packageHeader();
			setState(347);
			importList();
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

	public static class FileAnnotationsContext extends ParserRuleContext {
		public List<FileAnnotationContext> fileAnnotation() {
			return getRuleContexts(FileAnnotationContext.class);
		}
		public FileAnnotationContext fileAnnotation(int i) {
			return getRuleContext(FileAnnotationContext.class,i);
		}
		public FileAnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileAnnotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterFileAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitFileAnnotations(this);
		}
	}

	public final FileAnnotationsContext fileAnnotations() throws RecognitionException {
		FileAnnotationsContext _localctx = new FileAnnotationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fileAnnotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(349);
					fileAnnotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(352); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FileAnnotationContext extends ParserRuleContext {
		public List<TerminalNode> FILE() { return getTokens(SarlParser.FILE); }
		public TerminalNode FILE(int i) {
			return getToken(SarlParser.FILE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(SarlParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SarlParser.COLON, i);
		}
		public List<TerminalNode> LSQUARE() { return getTokens(SarlParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(SarlParser.LSQUARE, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(SarlParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(SarlParser.RSQUARE, i);
		}
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public FileAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterFileAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitFileAnnotation(this);
		}
	}

	public final FileAnnotationContext fileAnnotation() throws RecognitionException {
		FileAnnotationContext _localctx = new FileAnnotationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fileAnnotation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(354);
					match(FILE);
					setState(355);
					match(COLON);
					setState(365);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LSQUARE:
						{
						setState(356);
						match(LSQUARE);
						setState(358); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(357);
							unescapedAnnotation();
							}
							}
							setState(360); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
						setState(362);
						match(RSQUARE);
						}
						break;
					case IMPORT:
					case CONSTRUCTOR:
					case BY:
					case COMPANION:
					case INIT:
					case WHERE:
					case CATCH:
					case FINALLY:
					case OUT:
					case GETTER:
					case SETTER:
					case DYNAMIC:
					case PUBLIC:
					case PRIVATE:
					case PROTECTED:
					case INTERNAL:
					case ENUM:
					case SEALED:
					case ANNOTATION:
					case DATA:
					case INNER:
					case TAILREC:
					case OPERATOR:
					case INLINE:
					case INFIX:
					case EXTERNAL:
					case SUSPEND:
					case OVERRIDE:
					case ABSTRACT:
					case FINAL:
					case OPEN:
					case CONST:
					case LATEINIT:
					case VARARG:
					case NOINLINE:
					case CROSSINLINE:
					case REIFIED:
					case Identifier:
						{
						setState(364);
						unescapedAnnotation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(367);
						semi();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(372); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PackageHeaderContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(SarlParser.PACKAGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public PackageHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterPackageHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitPackageHeader(this);
		}
	}

	public final PackageHeaderContext packageHeader() throws RecognitionException {
		PackageHeaderContext _localctx = new PackageHeaderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_packageHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(374);
					modifierList();
					}
				}

				setState(377);
				match(PACKAGE);
				setState(378);
				identifier();
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(379);
					semi();
					}
					break;
				}
				}
				break;
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

	public static class ImportListContext extends ParserRuleContext {
		public List<ImportHeaderContext> importHeader() {
			return getRuleContexts(ImportHeaderContext.class);
		}
		public ImportHeaderContext importHeader(int i) {
			return getRuleContext(ImportHeaderContext.class,i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitImportList(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(384);
				importHeader();
				}
				}
				setState(389);
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

	public static class ImportHeaderContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(SarlParser.IMPORT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SarlParser.DOT, 0); }
		public TerminalNode MULT() { return getToken(SarlParser.MULT, 0); }
		public ImportAliasContext importAlias() {
			return getRuleContext(ImportAliasContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public ImportHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterImportHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitImportHeader(this);
		}
	}

	public final ImportHeaderContext importHeader() throws RecognitionException {
		ImportHeaderContext _localctx = new ImportHeaderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(IMPORT);
			setState(391);
			identifier();
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(392);
				match(DOT);
				setState(393);
				match(MULT);
				}
				break;
			case AS:
				{
				setState(394);
				importAlias();
				}
				break;
			case EOF:
			case NL:
			case SEMICOLON:
			case AT:
			case FILE:
			case IMPORT:
			case CLASS:
			case INTERFACE:
			case FUN:
			case OBJECT:
			case VAL:
			case VAR:
			case TYPE_ALIAS:
			case IN:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case AGENT:
			case BEHAVIOR:
			case CAPACITY:
			case EVENT:
			case SKILL:
			case LabelReference:
				break;
			default:
				break;
			}
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(397);
				semi();
				}
				break;
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

	public static class ImportAliasContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SarlParser.AS, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ImportAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterImportAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitImportAlias(this);
		}
	}

	public final ImportAliasContext importAlias() throws RecognitionException {
		ImportAliasContext _localctx = new ImportAliasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(AS);
			setState(401);
			simpleIdentifier();
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

	public static class TopLevelObjectContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public AgentDeclarationContext agentDeclaration() {
			return getRuleContext(AgentDeclarationContext.class,0);
		}
		public BehaviorDeclarationContext behaviorDeclaration() {
			return getRuleContext(BehaviorDeclarationContext.class,0);
		}
		public CapacityDeclarationContext capacityDeclaration() {
			return getRuleContext(CapacityDeclarationContext.class,0);
		}
		public EventDeclarationContext eventDeclaration() {
			return getRuleContext(EventDeclarationContext.class,0);
		}
		public SkillDeclarationContext skillDeclaration() {
			return getRuleContext(SkillDeclarationContext.class,0);
		}
		public TopLevelObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTopLevelObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTopLevelObject(this);
		}
	}

	public final TopLevelObjectContext topLevelObject() throws RecognitionException {
		TopLevelObjectContext _localctx = new TopLevelObjectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_topLevelObject);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				objectDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				propertyDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
				typeAlias();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(408);
				agentDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(409);
				behaviorDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(410);
				capacityDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(411);
				eventDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(412);
				skillDeclaration();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(SarlParser.CLASS, 0); }
		public TerminalNode INTERFACE() { return getToken(SarlParser.INTERFACE, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumClassBodyContext enumClassBody() {
			return getRuleContext(EnumClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(415);
				modifierList();
				}
			}

			setState(418);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==INTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(419);
				match(NL);
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			simpleIdentifier();
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(426);
					match(NL);
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(432);
				typeParameters();
				}
				break;
			}
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(435);
					match(NL);
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(441);
				primaryConstructor();
				}
				break;
			}
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(444);
					match(NL);
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(450);
				match(COLON);
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(451);
					match(NL);
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(457);
				delegationSpecifiers();
				}
				break;
			}
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(460);
					match(NL);
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(466);
				typeConstraints();
				}
				break;
			}
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(469);
					match(NL);
					}
					}
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(475);
				classBody();
				}
				break;
			case 2:
				{
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(476);
					match(NL);
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(482);
				enumClassBody();
				}
				break;
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

	public static class AgentDeclarationContext extends ParserRuleContext {
		public TerminalNode AGENT() { return getToken(SarlParser.AGENT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public AgentBodyContext agentBody() {
			return getRuleContext(AgentBodyContext.class,0);
		}
		public AgentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAgentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAgentDeclaration(this);
		}
	}

	public final AgentDeclarationContext agentDeclaration() throws RecognitionException {
		AgentDeclarationContext _localctx = new AgentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_agentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(485);
				modifierList();
				}
			}

			setState(488);
			match(AGENT);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(489);
				match(NL);
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			simpleIdentifier();
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(496);
					match(NL);
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(502);
				typeParameters();
				}
				break;
			}
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(505);
					match(NL);
					}
					}
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(511);
				primaryConstructor();
				}
				break;
			}
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(514);
					match(NL);
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(520);
				match(COLON);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(521);
					match(NL);
					}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(527);
				delegationSpecifiers();
				}
				break;
			}
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(530);
					match(NL);
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
				typeConstraints();
				}
				break;
			}
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(539);
					match(NL);
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(545);
				agentBody();
				}
				break;
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

	public static class BehaviorDeclarationContext extends ParserRuleContext {
		public TerminalNode BEHAVIOR() { return getToken(SarlParser.BEHAVIOR, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public BehaviorBodyContext behaviorBody() {
			return getRuleContext(BehaviorBodyContext.class,0);
		}
		public BehaviorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behaviorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterBehaviorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitBehaviorDeclaration(this);
		}
	}

	public final BehaviorDeclarationContext behaviorDeclaration() throws RecognitionException {
		BehaviorDeclarationContext _localctx = new BehaviorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_behaviorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(548);
				modifierList();
				}
			}

			setState(551);
			match(BEHAVIOR);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(552);
				match(NL);
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
			simpleIdentifier();
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(559);
					match(NL);
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(565);
				typeParameters();
				}
				break;
			}
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(568);
					match(NL);
					}
					}
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(574);
				primaryConstructor();
				}
				break;
			}
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(577);
					match(NL);
					}
					}
					setState(582);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(583);
				match(COLON);
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(584);
					match(NL);
					}
					}
					setState(589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(590);
				delegationSpecifiers();
				}
				break;
			}
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(593);
					match(NL);
					}
					}
					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(599);
				typeConstraints();
				}
				break;
			}
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(602);
					match(NL);
					}
					}
					setState(607);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(608);
				behaviorBody();
				}
				break;
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

	public static class CapacityDeclarationContext extends ParserRuleContext {
		public TerminalNode CAPACITY() { return getToken(SarlParser.CAPACITY, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumClassBodyContext enumClassBody() {
			return getRuleContext(EnumClassBodyContext.class,0);
		}
		public CapacityDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capacityDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterCapacityDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitCapacityDeclaration(this);
		}
	}

	public final CapacityDeclarationContext capacityDeclaration() throws RecognitionException {
		CapacityDeclarationContext _localctx = new CapacityDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_capacityDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(611);
				modifierList();
				}
			}

			setState(614);
			match(CAPACITY);
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(615);
				match(NL);
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
			simpleIdentifier();
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(622);
					match(NL);
					}
					}
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(628);
				typeParameters();
				}
				break;
			}
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(631);
					match(NL);
					}
					}
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(637);
				primaryConstructor();
				}
				break;
			}
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(640);
					match(NL);
					}
					}
					setState(645);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(646);
				match(COLON);
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(647);
					match(NL);
					}
					}
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(653);
				delegationSpecifiers();
				}
				break;
			}
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(656);
					match(NL);
					}
					}
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(662);
				typeConstraints();
				}
				break;
			}
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(665);
					match(NL);
					}
					}
					setState(670);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(671);
				classBody();
				}
				break;
			case 2:
				{
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(672);
					match(NL);
					}
					}
					setState(677);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(678);
				enumClassBody();
				}
				break;
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

	public static class EventDeclarationContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(SarlParser.EVENT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumClassBodyContext enumClassBody() {
			return getRuleContext(EnumClassBodyContext.class,0);
		}
		public EventDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterEventDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitEventDeclaration(this);
		}
	}

	public final EventDeclarationContext eventDeclaration() throws RecognitionException {
		EventDeclarationContext _localctx = new EventDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_eventDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(681);
				modifierList();
				}
			}

			setState(684);
			match(EVENT);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(685);
				match(NL);
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(691);
			simpleIdentifier();
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(692);
					match(NL);
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(698);
				typeParameters();
				}
				break;
			}
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(701);
					match(NL);
					}
					}
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(707);
				primaryConstructor();
				}
				break;
			}
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(710);
					match(NL);
					}
					}
					setState(715);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(716);
				match(COLON);
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(717);
					match(NL);
					}
					}
					setState(722);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(723);
				delegationSpecifiers();
				}
				break;
			}
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(726);
					match(NL);
					}
					}
					setState(731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(732);
				typeConstraints();
				}
				break;
			}
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(735);
					match(NL);
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(741);
				classBody();
				}
				break;
			case 2:
				{
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(742);
					match(NL);
					}
					}
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(748);
				enumClassBody();
				}
				break;
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

	public static class SkillDeclarationContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode SKILL() { return getToken(SarlParser.SKILL, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumClassBodyContext enumClassBody() {
			return getRuleContext(EnumClassBodyContext.class,0);
		}
		public SkillDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skillDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterSkillDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitSkillDeclaration(this);
		}
	}

	public final SkillDeclarationContext skillDeclaration() throws RecognitionException {
		SkillDeclarationContext _localctx = new SkillDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_skillDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(751);
				modifierList();
				}
			}

			{
			setState(754);
			match(SKILL);
			}
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(755);
				match(NL);
				}
				}
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(761);
			simpleIdentifier();
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(762);
					match(NL);
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(768);
				typeParameters();
				}
				break;
			}
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(771);
					match(NL);
					}
					}
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(777);
				primaryConstructor();
				}
				break;
			}
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(780);
					match(NL);
					}
					}
					setState(785);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(786);
				match(COLON);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(787);
					match(NL);
					}
					}
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(793);
				delegationSpecifiers();
				}
				break;
			}
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(796);
					match(NL);
					}
					}
					setState(801);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(802);
				typeConstraints();
				}
				break;
			}
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(805);
					match(NL);
					}
					}
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(811);
				classBody();
				}
				break;
			case 2:
				{
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(812);
					match(NL);
					}
					}
					setState(817);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(818);
				enumClassBody();
				}
				break;
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

	public static class PrimaryConstructorContext extends ParserRuleContext {
		public ClassParametersContext classParameters() {
			return getRuleContext(ClassParametersContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode CONSTRUCTOR() { return getToken(SarlParser.CONSTRUCTOR, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public PrimaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterPrimaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitPrimaryConstructor(this);
		}
	}

	public final PrimaryConstructorContext primaryConstructor() throws RecognitionException {
		PrimaryConstructorContext _localctx = new PrimaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(821);
				modifierList();
				}
			}

			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRUCTOR) {
				{
				setState(824);
				match(CONSTRUCTOR);
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(825);
					match(NL);
					}
					}
					setState(830);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(833);
			classParameters();
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

	public static class ClassParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public List<ClassParameterContext> classParameter() {
			return getRuleContexts(ClassParameterContext.class);
		}
		public ClassParameterContext classParameter(int i) {
			return getRuleContext(ClassParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public ClassParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterClassParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitClassParameters(this);
		}
	}

	public final ClassParametersContext classParameters() throws RecognitionException {
		ClassParametersContext _localctx = new ClassParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(LPAREN);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (IMPORT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (BY - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (WHERE - 40)) | (1L << (CATCH - 40)) | (1L << (FINALLY - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (GETTER - 40)) | (1L << (SETTER - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)) | (1L << (DYNAMIC - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (Identifier - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				setState(836);
				classParameter();
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(837);
					match(COMMA);
					setState(838);
					classParameter();
					}
					}
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(846);
			match(RPAREN);
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

	public static class ClassParameterContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(SarlParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAL() { return getToken(SarlParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(SarlParser.VAR, 0); }
		public ClassParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterClassParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitClassParameter(this);
		}
	}

	public final ClassParameterContext classParameter() throws RecognitionException {
		ClassParameterContext _localctx = new ClassParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(848);
				modifierList();
				}
				break;
			}
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL || _la==VAR) {
				{
				setState(851);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(854);
			simpleIdentifier();
			setState(855);
			match(COLON);
			setState(856);
			type();
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(857);
				match(ASSIGNMENT);
				setState(858);
				expression();
				}
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

	public static class DelegationSpecifiersContext extends ParserRuleContext {
		public List<DelegationSpecifierContext> delegationSpecifier() {
			return getRuleContexts(DelegationSpecifierContext.class);
		}
		public DelegationSpecifierContext delegationSpecifier(int i) {
			return getRuleContext(DelegationSpecifierContext.class,i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public DelegationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterDelegationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitDelegationSpecifiers(this);
		}
	}

	public final DelegationSpecifiersContext delegationSpecifiers() throws RecognitionException {
		DelegationSpecifiersContext _localctx = new DelegationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_delegationSpecifiers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(861);
				annotations();
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(867);
			delegationSpecifier();
			setState(884);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(871);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(868);
						match(NL);
						}
						}
						setState(873);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(874);
					match(COMMA);
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(875);
						match(NL);
						}
						}
						setState(880);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(881);
					delegationSpecifier();
					}
					} 
				}
				setState(886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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

	public static class DelegationSpecifierContext extends ParserRuleContext {
		public ConstructorInvocationContext constructorInvocation() {
			return getRuleContext(ConstructorInvocationContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ExplicitDelegationContext explicitDelegation() {
			return getRuleContext(ExplicitDelegationContext.class,0);
		}
		public DelegationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterDelegationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitDelegationSpecifier(this);
		}
	}

	public final DelegationSpecifierContext delegationSpecifier() throws RecognitionException {
		DelegationSpecifierContext _localctx = new DelegationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_delegationSpecifier);
		try {
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				constructorInvocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
				userType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(889);
				explicitDelegation();
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

	public static class ConstructorInvocationContext extends ParserRuleContext {
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public CallSuffixContext callSuffix() {
			return getRuleContext(CallSuffixContext.class,0);
		}
		public ConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitConstructorInvocation(this);
		}
	}

	public final ConstructorInvocationContext constructorInvocation() throws RecognitionException {
		ConstructorInvocationContext _localctx = new ConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructorInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			userType();
			setState(893);
			callSuffix();
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

	public static class ExplicitDelegationContext extends ParserRuleContext {
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public TerminalNode BY() { return getToken(SarlParser.BY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public ExplicitDelegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitDelegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterExplicitDelegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitExplicitDelegation(this);
		}
	}

	public final ExplicitDelegationContext explicitDelegation() throws RecognitionException {
		ExplicitDelegationContext _localctx = new ExplicitDelegationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_explicitDelegation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			userType();
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(896);
				match(NL);
				}
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(902);
			match(BY);
			setState(906);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(903);
					match(NL);
					}
					} 
				}
				setState(908);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(909);
			expression();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(SarlParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SarlParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(LCURL);
			setState(915);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(912);
					match(NL);
					}
					} 
				}
				setState(917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				{
				setState(918);
				classMemberDeclaration();
				}
				}
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(924);
				match(NL);
				}
				}
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(930);
			match(RCURL);
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

	public static class AgentBodyContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(SarlParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SarlParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<AgentMemberDeclarationContext> agentMemberDeclaration() {
			return getRuleContexts(AgentMemberDeclarationContext.class);
		}
		public AgentMemberDeclarationContext agentMemberDeclaration(int i) {
			return getRuleContext(AgentMemberDeclarationContext.class,i);
		}
		public AgentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAgentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAgentBody(this);
		}
	}

	public final AgentBodyContext agentBody() throws RecognitionException {
		AgentBodyContext _localctx = new AgentBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_agentBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(LCURL);
			setState(936);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(933);
					match(NL);
					}
					} 
				}
				setState(938);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (ON - 104)) | (1L << (USES - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				{
				setState(939);
				agentMemberDeclaration();
				}
				}
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(945);
				match(NL);
				}
				}
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(951);
			match(RCURL);
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

	public static class BehaviorBodyContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(SarlParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SarlParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<BehaviorMemberDeclarationContext> behaviorMemberDeclaration() {
			return getRuleContexts(BehaviorMemberDeclarationContext.class);
		}
		public BehaviorMemberDeclarationContext behaviorMemberDeclaration(int i) {
			return getRuleContext(BehaviorMemberDeclarationContext.class,i);
		}
		public BehaviorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behaviorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterBehaviorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitBehaviorBody(this);
		}
	}

	public final BehaviorBodyContext behaviorBody() throws RecognitionException {
		BehaviorBodyContext _localctx = new BehaviorBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_behaviorBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(LCURL);
			setState(957);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(954);
					match(NL);
					}
					} 
				}
				setState(959);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (ON - 104)) | (1L << (USES - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				{
				setState(960);
				behaviorMemberDeclaration();
				}
				}
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(966);
				match(NL);
				}
				}
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(972);
			match(RCURL);
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public CompanionObjectContext companionObject() {
			return getRuleContext(CompanionObjectContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public AnonymousInitializerContext anonymousInitializer() {
			return getRuleContext(AnonymousInitializerContext.class,0);
		}
		public SecondaryConstructorContext secondaryConstructor() {
			return getRuleContext(SecondaryConstructorContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public List<AnysemiContext> anysemi() {
			return getRuleContexts(AnysemiContext.class);
		}
		public AnysemiContext anysemi(int i) {
			return getRuleContext(AnysemiContext.class,i);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_classMemberDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(974);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(975);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(976);
				objectDeclaration();
				}
				break;
			case 4:
				{
				setState(977);
				companionObject();
				}
				break;
			case 5:
				{
				setState(978);
				propertyDeclaration();
				}
				break;
			case 6:
				{
				setState(979);
				anonymousInitializer();
				}
				break;
			case 7:
				{
				setState(980);
				secondaryConstructor();
				}
				break;
			case 8:
				{
				setState(981);
				typeAlias();
				}
				break;
			}
			setState(987);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(984);
					anysemi();
					}
					} 
				}
				setState(989);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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

	public static class AgentMemberDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public UsesDeclarationContext usesDeclaration() {
			return getRuleContext(UsesDeclarationContext.class,0);
		}
		public OnDeclarationContext onDeclaration() {
			return getRuleContext(OnDeclarationContext.class,0);
		}
		public List<AnysemiContext> anysemi() {
			return getRuleContexts(AnysemiContext.class);
		}
		public AnysemiContext anysemi(int i) {
			return getRuleContext(AnysemiContext.class,i);
		}
		public AgentMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAgentMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAgentMemberDeclaration(this);
		}
	}

	public final AgentMemberDeclarationContext agentMemberDeclaration() throws RecognitionException {
		AgentMemberDeclarationContext _localctx = new AgentMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_agentMemberDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
			case FILE:
			case CLASS:
			case INTERFACE:
			case FUN:
			case OBJECT:
			case VAL:
			case VAR:
			case TYPE_ALIAS:
			case CONSTRUCTOR:
			case COMPANION:
			case INIT:
			case IN:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case LabelReference:
				{
				setState(990);
				classMemberDeclaration();
				}
				break;
			case USES:
				{
				setState(991);
				usesDeclaration();
				}
				break;
			case ON:
				{
				setState(992);
				onDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(998);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(995);
					anysemi();
					}
					} 
				}
				setState(1000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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

	public static class BehaviorMemberDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public UsesDeclarationContext usesDeclaration() {
			return getRuleContext(UsesDeclarationContext.class,0);
		}
		public OnDeclarationContext onDeclaration() {
			return getRuleContext(OnDeclarationContext.class,0);
		}
		public List<AnysemiContext> anysemi() {
			return getRuleContexts(AnysemiContext.class);
		}
		public AnysemiContext anysemi(int i) {
			return getRuleContext(AnysemiContext.class,i);
		}
		public BehaviorMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behaviorMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterBehaviorMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitBehaviorMemberDeclaration(this);
		}
	}

	public final BehaviorMemberDeclarationContext behaviorMemberDeclaration() throws RecognitionException {
		BehaviorMemberDeclarationContext _localctx = new BehaviorMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_behaviorMemberDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
			case FILE:
			case CLASS:
			case INTERFACE:
			case FUN:
			case OBJECT:
			case VAL:
			case VAR:
			case TYPE_ALIAS:
			case CONSTRUCTOR:
			case COMPANION:
			case INIT:
			case IN:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case LabelReference:
				{
				setState(1001);
				classMemberDeclaration();
				}
				break;
			case USES:
				{
				setState(1002);
				usesDeclaration();
				}
				break;
			case ON:
				{
				setState(1003);
				onDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1006);
					anysemi();
					}
					} 
				}
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
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

	public static class AnonymousInitializerContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(SarlParser.INIT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public AnonymousInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAnonymousInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAnonymousInitializer(this);
		}
	}

	public final AnonymousInitializerContext anonymousInitializer() throws RecognitionException {
		AnonymousInitializerContext _localctx = new AnonymousInitializerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_anonymousInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(INIT);
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1013);
				match(NL);
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1019);
			block();
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

	public static class SecondaryConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(SarlParser.CONSTRUCTOR, 0); }
		public FunctionValueParametersContext functionValueParameters() {
			return getRuleContext(FunctionValueParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public ConstructorDelegationCallContext constructorDelegationCall() {
			return getRuleContext(ConstructorDelegationCallContext.class,0);
		}
		public SecondaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterSecondaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitSecondaryConstructor(this);
		}
	}

	public final SecondaryConstructorContext secondaryConstructor() throws RecognitionException {
		SecondaryConstructorContext _localctx = new SecondaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_secondaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(1021);
				modifierList();
				}
			}

			setState(1024);
			match(CONSTRUCTOR);
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1025);
				match(NL);
				}
				}
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1031);
			functionValueParameters();
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1032);
					match(NL);
					}
					}
					setState(1037);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1038);
				match(COLON);
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1039);
					match(NL);
					}
					}
					setState(1044);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1045);
				constructorDelegationCall();
				}
				break;
			}
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1048);
				match(NL);
				}
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1054);
			block();
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

	public static class ConstructorDelegationCallContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(SarlParser.THIS, 0); }
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TerminalNode SUPER() { return getToken(SarlParser.SUPER, 0); }
		public ConstructorDelegationCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDelegationCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterConstructorDelegationCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitConstructorDelegationCall(this);
		}
	}

	public final ConstructorDelegationCallContext constructorDelegationCall() throws RecognitionException {
		ConstructorDelegationCallContext _localctx = new ConstructorDelegationCallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constructorDelegationCall);
		int _la;
		try {
			setState(1072);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1056);
				match(THIS);
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1057);
					match(NL);
					}
					}
					setState(1062);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1063);
				valueArguments();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				match(SUPER);
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1065);
					match(NL);
					}
					}
					setState(1070);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1071);
				valueArguments();
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

	public static class EnumClassBodyContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(SarlParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SarlParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public EnumEntriesContext enumEntries() {
			return getRuleContext(EnumEntriesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SarlParser.SEMICOLON, 0); }
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public EnumClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumClassBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterEnumClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitEnumClassBody(this);
		}
	}

	public final EnumClassBodyContext enumClassBody() throws RecognitionException {
		EnumClassBodyContext _localctx = new EnumClassBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumClassBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(LCURL);
			setState(1078);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1075);
					match(NL);
					}
					} 
				}
				setState(1080);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				setState(1081);
				enumEntries();
				}
			}

			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1084);
					match(NL);
					}
					}
					setState(1089);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1090);
				match(SEMICOLON);
				setState(1094);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1091);
						match(NL);
						}
						} 
					}
					setState(1096);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (LabelReference - 104)))) != 0)) {
					{
					{
					setState(1097);
					classMemberDeclaration();
					}
					}
					setState(1102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1105);
				match(NL);
				}
				}
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1111);
			match(RCURL);
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

	public static class EnumEntriesContext extends ParserRuleContext {
		public List<EnumEntryContext> enumEntry() {
			return getRuleContexts(EnumEntryContext.class);
		}
		public EnumEntryContext enumEntry(int i) {
			return getRuleContext(EnumEntryContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(SarlParser.SEMICOLON, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public EnumEntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterEnumEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitEnumEntries(this);
		}
	}

	public final EnumEntriesContext enumEntries() throws RecognitionException {
		EnumEntriesContext _localctx = new EnumEntriesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enumEntries);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1113);
				enumEntry();
				setState(1117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1114);
						match(NL);
						}
						} 
					}
					setState(1119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				}
				}
				}
				setState(1122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
			setState(1125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1124);
				match(SEMICOLON);
				}
				break;
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

	public static class EnumEntryContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SarlParser.COMMA, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public EnumEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterEnumEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitEnumEntry(this);
		}
	}

	public final EnumEntryContext enumEntry() throws RecognitionException {
		EnumEntryContext _localctx = new EnumEntryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enumEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			simpleIdentifier();
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1128);
					match(NL);
					}
					}
					setState(1133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1134);
				valueArguments();
				}
				break;
			}
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1137);
					match(NL);
					}
					}
					setState(1142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1143);
				classBody();
				}
				break;
			}
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1146);
					match(NL);
					}
					}
					setState(1151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1152);
				match(COMMA);
				}
				break;
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(SarlParser.FUN, 0); }
		public FunctionValueParametersContext functionValueParameters() {
			return getRuleContext(FunctionValueParametersContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SarlParser.DOT, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(1155);
				modifierList();
				}
			}

			setState(1158);
			match(FUN);
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1159);
					match(NL);
					}
					}
					setState(1164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1165);
				type();
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1166);
					match(NL);
					}
					}
					setState(1171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1172);
				match(DOT);
				}
				break;
			}
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1176);
					match(NL);
					}
					}
					setState(1181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1182);
				typeParameters();
				}
				break;
			}
			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1185);
					match(NL);
					}
					}
					setState(1190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1191);
				identifier();
				}
				break;
			}
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1194);
				match(NL);
				}
				}
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1200);
			functionValueParameters();
			setState(1215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1201);
					match(NL);
					}
					}
					setState(1206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1207);
				match(COLON);
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1208);
					match(NL);
					}
					}
					setState(1213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1214);
				type();
				}
				break;
			}
			setState(1224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1217);
					match(NL);
					}
					}
					setState(1222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1223);
				typeConstraints();
				}
				break;
			}
			setState(1233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1226);
					match(NL);
					}
					}
					setState(1231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1232);
				functionBody();
				}
				break;
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

	public static class FunctionValueParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public List<FunctionValueParameterContext> functionValueParameter() {
			return getRuleContexts(FunctionValueParameterContext.class);
		}
		public FunctionValueParameterContext functionValueParameter(int i) {
			return getRuleContext(FunctionValueParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public FunctionValueParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionValueParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterFunctionValueParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitFunctionValueParameters(this);
		}
	}

	public final FunctionValueParametersContext functionValueParameters() throws RecognitionException {
		FunctionValueParametersContext _localctx = new FunctionValueParametersContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionValueParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(LPAREN);
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (IMPORT - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (BY - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (WHERE - 40)) | (1L << (CATCH - 40)) | (1L << (FINALLY - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (GETTER - 40)) | (1L << (SETTER - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)) | (1L << (DYNAMIC - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (Identifier - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				setState(1236);
				functionValueParameter();
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1237);
					match(COMMA);
					setState(1238);
					functionValueParameter();
					}
					}
					setState(1243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1246);
			match(RPAREN);
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

	public static class FunctionValueParameterContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(SarlParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionValueParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionValueParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterFunctionValueParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitFunctionValueParameter(this);
		}
	}

	public final FunctionValueParameterContext functionValueParameter() throws RecognitionException {
		FunctionValueParameterContext _localctx = new FunctionValueParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionValueParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1248);
				modifierList();
				}
				break;
			}
			setState(1251);
			parameter();
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1252);
				match(ASSIGNMENT);
				setState(1253);
				expression();
				}
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

	public static class ParameterContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			simpleIdentifier();
			setState(1257);
			match(COLON);
			setState(1258);
			type();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(SarlParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionBody);
		try {
			int _alt;
			setState(1269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				block();
				}
				break;
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				match(ASSIGNMENT);
				setState(1265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1262);
						match(NL);
						}
						} 
					}
					setState(1267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				}
				setState(1268);
				expression();
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

	public static class OnDeclarationContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SarlParser.ON, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public OnDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterOnDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitOnDeclaration(this);
		}
	}

	public final OnDeclarationContext onDeclaration() throws RecognitionException {
		OnDeclarationContext _localctx = new OnDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_onDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(ON);
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1272);
					match(NL);
					}
					}
					setState(1277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1278);
				typeReference();
				}
				break;
			}
			setState(1288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1281);
					match(NL);
					}
					}
					setState(1286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1287);
				functionBody();
				}
				break;
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

	public static class UsesDeclarationContext extends ParserRuleContext {
		public TerminalNode USES() { return getToken(SarlParser.USES, 0); }
		public List<TypeReferenceContext> typeReference() {
			return getRuleContexts(TypeReferenceContext.class);
		}
		public TypeReferenceContext typeReference(int i) {
			return getRuleContext(TypeReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public UsesDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usesDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterUsesDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitUsesDeclaration(this);
		}
	}

	public final UsesDeclarationContext usesDeclaration() throws RecognitionException {
		UsesDeclarationContext _localctx = new UsesDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_usesDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(USES);
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				{
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1291);
					match(NL);
					}
					}
					setState(1296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1297);
				typeReference();
				}
				}
				break;
			case 2:
				{
				setState(1309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1301);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1298);
							match(NL);
							}
							}
							setState(1303);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1304);
						typeReference();
						setState(1305);
						match(COMMA);
						}
						} 
					}
					setState(1311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				{
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1312);
					match(NL);
					}
					}
					setState(1317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1318);
				typeReference();
				}
				}
				break;
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

	public static class ObjectDeclarationContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(SarlParser.OBJECT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitObjectDeclaration(this);
		}
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_objectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(1321);
				modifierList();
				}
			}

			setState(1324);
			match(OBJECT);
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1325);
				match(NL);
				}
				}
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1331);
			simpleIdentifier();
			setState(1339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1332);
					match(NL);
					}
					}
					setState(1337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1338);
				primaryConstructor();
				}
				break;
			}
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1341);
					match(NL);
					}
					}
					setState(1346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1347);
				match(COLON);
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1348);
					match(NL);
					}
					}
					setState(1353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1354);
				delegationSpecifiers();
				}
				break;
			}
			setState(1364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1357);
					match(NL);
					}
					}
					setState(1362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1363);
				classBody();
				}
				break;
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

	public static class CompanionObjectContext extends ParserRuleContext {
		public TerminalNode COMPANION() { return getToken(SarlParser.COMPANION, 0); }
		public TerminalNode OBJECT() { return getToken(SarlParser.OBJECT, 0); }
		public List<ModifierListContext> modifierList() {
			return getRuleContexts(ModifierListContext.class);
		}
		public ModifierListContext modifierList(int i) {
			return getRuleContext(ModifierListContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public CompanionObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_companionObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterCompanionObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitCompanionObject(this);
		}
	}

	public final CompanionObjectContext companionObject() throws RecognitionException {
		CompanionObjectContext _localctx = new CompanionObjectContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_companionObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(1366);
				modifierList();
				}
			}

			setState(1369);
			match(COMPANION);
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1370);
				match(NL);
				}
				}
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(1376);
				modifierList();
				}
			}

			setState(1379);
			match(OBJECT);
			setState(1387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1380);
					match(NL);
					}
					}
					setState(1385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1386);
				simpleIdentifier();
				}
				break;
			}
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1389);
					match(NL);
					}
					}
					setState(1394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1395);
				match(COLON);
				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1396);
					match(NL);
					}
					}
					setState(1401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1402);
				delegationSpecifiers();
				}
				break;
			}
			setState(1412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1405);
					match(NL);
					}
					}
					setState(1410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1411);
				classBody();
				}
				break;
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

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(SarlParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(SarlParser.VAR, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SarlParser.DOT, 0); }
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public MultiVariableDeclarationContext multiVariableDeclaration() {
			return getRuleContext(MultiVariableDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode BY() { return getToken(SarlParser.BY, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(SarlParser.ASSIGNMENT, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitPropertyDeclaration(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_propertyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(1414);
				modifierList();
				}
			}

			setState(1417);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1418);
					match(NL);
					}
					}
					setState(1423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1424);
				typeParameters();
				}
				break;
			}
			setState(1442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1427);
					match(NL);
					}
					}
					setState(1432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1433);
				type();
				setState(1437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1434);
					match(NL);
					}
					}
					setState(1439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1440);
				match(DOT);
				}
				break;
			}
			{
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1444);
				match(NL);
				}
				}
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1450);
				multiVariableDeclaration();
				}
				break;
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				{
				setState(1451);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1454);
					match(NL);
					}
					}
					setState(1459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1460);
				typeConstraints();
				}
				break;
			}
			setState(1477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1463);
					match(NL);
					}
					}
					setState(1468);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1469);
				_la = _input.LA(1);
				if ( !(_la==ASSIGNMENT || _la==BY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1470);
						match(NL);
						}
						} 
					}
					setState(1475);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				}
				setState(1476);
				expression();
				}
				break;
			}
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1479);
				getter();
				setState(1483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1480);
					semi();
					setState(1481);
					setter();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1485);
				setter();
				setState(1489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1486);
					semi();
					setState(1487);
					getter();
					}
					break;
				}
				}
				break;
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

	public static class MultiVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public MultiVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterMultiVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitMultiVariableDeclaration(this);
		}
	}

	public final MultiVariableDeclarationContext multiVariableDeclaration() throws RecognitionException {
		MultiVariableDeclarationContext _localctx = new MultiVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_multiVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(LPAREN);
			setState(1494);
			variableDeclaration();
			setState(1499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1495);
				match(COMMA);
				setState(1496);
				variableDeclaration();
				}
				}
				setState(1501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1502);
			match(RPAREN);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			simpleIdentifier();
			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1505);
				match(COLON);
				setState(1506);
				type();
				}
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

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode GETTER() { return getToken(SarlParser.GETTER, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(SarlParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitGetter(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_getter);
		int _la;
		try {
			int _alt;
			setState(1558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(1509);
					modifierList();
					}
				}

				setState(1512);
				match(GETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(1513);
					modifierList();
					}
				}

				setState(1516);
				match(GETTER);
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1517);
					match(NL);
					}
					}
					setState(1522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1523);
				match(LPAREN);
				setState(1524);
				match(RPAREN);
				setState(1539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1528);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1525);
						match(NL);
						}
						}
						setState(1530);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1531);
					match(COLON);
					setState(1535);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1532);
						match(NL);
						}
						}
						setState(1537);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1538);
					type();
					}
					break;
				}
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1541);
					match(NL);
					}
					}
					setState(1546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1556);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LCURL:
					{
					setState(1547);
					block();
					}
					break;
				case ASSIGNMENT:
					{
					setState(1548);
					match(ASSIGNMENT);
					setState(1552);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1549);
							match(NL);
							}
							} 
						}
						setState(1554);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
					}
					setState(1555);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode SETTER() { return getToken(SarlParser.SETTER, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<ParameterModifierContext> parameterModifier() {
			return getRuleContexts(ParameterModifierContext.class);
		}
		public ParameterModifierContext parameterModifier(int i) {
			return getRuleContext(ParameterModifierContext.class,i);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitSetter(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_setter);
		int _la;
		try {
			int _alt;
			setState(1595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(1560);
					modifierList();
					}
				}

				setState(1563);
				match(SETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
					{
					setState(1564);
					modifierList();
					}
				}

				setState(1567);
				match(SETTER);
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1568);
					match(NL);
					}
					}
					setState(1573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1574);
				match(LPAREN);
				setState(1579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(1577);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case AT:
						case FILE:
						case FIELD:
						case PROPERTY:
						case GET:
						case SET:
						case RECEIVER:
						case PARAM:
						case SETPARAM:
						case DELEGATE:
						case LabelReference:
							{
							setState(1575);
							annotations();
							}
							break;
						case VARARG:
						case NOINLINE:
						case CROSSINLINE:
							{
							setState(1576);
							parameterModifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(1581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
				}
				setState(1584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1582);
					simpleIdentifier();
					}
					break;
				case 2:
					{
					setState(1583);
					parameter();
					}
					break;
				}
				setState(1586);
				match(RPAREN);
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1587);
					match(NL);
					}
					}
					setState(1592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1593);
				functionBody();
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

	public static class TypeAliasContext extends ParserRuleContext {
		public TerminalNode TYPE_ALIAS() { return getToken(SarlParser.TYPE_ALIAS, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(SarlParser.ASSIGNMENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeAlias(this);
		}
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0)) {
				{
				setState(1597);
				modifierList();
				}
			}

			setState(1600);
			match(TYPE_ALIAS);
			setState(1604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1601);
				match(NL);
				}
				}
				setState(1606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1607);
			simpleIdentifier();
			setState(1615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(1611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1608);
					match(NL);
					}
					}
					setState(1613);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1614);
				typeParameters();
				}
				break;
			}
			setState(1620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1617);
				match(NL);
				}
				}
				setState(1622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1623);
			match(ASSIGNMENT);
			setState(1627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1624);
				match(NL);
				}
				}
				setState(1629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1630);
			type();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(SarlParser.LANGLE, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(SarlParser.RANGLE, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			match(LANGLE);
			setState(1636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1633);
					match(NL);
					}
					} 
				}
				setState(1638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			}
			setState(1639);
			typeParameter();
			setState(1656);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1643);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1640);
						match(NL);
						}
						}
						setState(1645);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1646);
					match(COMMA);
					setState(1650);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1647);
							match(NL);
							}
							} 
						}
						setState(1652);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
					}
					setState(1653);
					typeParameter();
					}
					} 
				}
				setState(1658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			}
			setState(1662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1659);
				match(NL);
				}
				}
				setState(1664);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1665);
			match(RANGLE);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1667);
				modifierList();
				}
				break;
			}
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1670);
				match(NL);
				}
				}
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1676);
			simpleIdentifier();
			setState(1691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1677);
					match(NL);
					}
					}
					setState(1682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1683);
				match(COLON);
				setState(1687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1684);
					match(NL);
					}
					}
					setState(1689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1690);
				type();
				}
				break;
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

	public static class TypeContext extends ParserRuleContext {
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public NullableTypeContext nullableType() {
			return getRuleContext(NullableTypeContext.class,0);
		}
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TypeModifierListContext typeModifierList() {
			return getRuleContext(TypeModifierListContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(1693);
				typeModifierList();
				}
				break;
			}
			setState(1700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(1696);
				functionType();
				}
				break;
			case 2:
				{
				setState(1697);
				parenthesizedType();
				}
				break;
			case 3:
				{
				setState(1698);
				nullableType();
				}
				break;
			case 4:
				{
				setState(1699);
				typeReference();
				}
				break;
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

	public static class TypeModifierListContext extends ParserRuleContext {
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> SUSPEND() { return getTokens(SarlParser.SUSPEND); }
		public TerminalNode SUSPEND(int i) {
			return getToken(SarlParser.SUSPEND, i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TypeModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeModifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeModifierList(this);
		}
	}

	public final TypeModifierListContext typeModifierList() throws RecognitionException {
		TypeModifierListContext _localctx = new TypeModifierListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typeModifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1710); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1710);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AT:
					case FILE:
					case FIELD:
					case PROPERTY:
					case GET:
					case SET:
					case RECEIVER:
					case PARAM:
					case SETPARAM:
					case DELEGATE:
					case LabelReference:
						{
						setState(1702);
						annotations();
						}
						break;
					case SUSPEND:
						{
						setState(1703);
						match(SUSPEND);
						setState(1707);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1704);
							match(NL);
							}
							}
							setState(1709);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1712); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ParenthesizedTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public ParenthesizedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterParenthesizedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitParenthesizedType(this);
		}
	}

	public final ParenthesizedTypeContext parenthesizedType() throws RecognitionException {
		ParenthesizedTypeContext _localctx = new ParenthesizedTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			match(LPAREN);
			setState(1715);
			type();
			setState(1716);
			match(RPAREN);
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

	public static class NullableTypeContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<TerminalNode> QUEST() { return getTokens(SarlParser.QUEST); }
		public TerminalNode QUEST(int i) {
			return getToken(SarlParser.QUEST, i);
		}
		public NullableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterNullableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitNullableType(this);
		}
	}

	public final NullableTypeContext nullableType() throws RecognitionException {
		NullableTypeContext _localctx = new NullableTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_nullableType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(1718);
				typeReference();
				}
				break;
			case 2:
				{
				setState(1719);
				parenthesizedType();
				}
				break;
			}
			setState(1725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1722);
				match(NL);
				}
				}
				setState(1727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1729); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1728);
					match(QUEST);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1731); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TypeReferenceContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public TerminalNode DYNAMIC() { return getToken(SarlParser.DYNAMIC, 0); }
		public TypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeReference(this);
		}
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeReference);
		try {
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1733);
				match(LPAREN);
				setState(1734);
				typeReference();
				setState(1735);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1737);
				userType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1738);
				match(DYNAMIC);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionTypeParametersContext functionTypeParameters() {
			return getRuleContext(FunctionTypeParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(SarlParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionTypeReceiverContext functionTypeReceiver() {
			return getRuleContext(FunctionTypeReceiverContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SarlParser.DOT, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(1741);
				functionTypeReceiver();
				setState(1745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1742);
					match(NL);
					}
					}
					setState(1747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1748);
				match(DOT);
				setState(1752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1749);
					match(NL);
					}
					}
					setState(1754);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1757);
			functionTypeParameters();
			setState(1761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1758);
				match(NL);
				}
				}
				setState(1763);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1764);
			match(ARROW);
			{
			setState(1768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1765);
				match(NL);
				}
				}
				setState(1770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1771);
			type();
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

	public static class FunctionTypeReceiverContext extends ParserRuleContext {
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public NullableTypeContext nullableType() {
			return getRuleContext(NullableTypeContext.class,0);
		}
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public FunctionTypeReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterFunctionTypeReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitFunctionTypeReceiver(this);
		}
	}

	public final FunctionTypeReceiverContext functionTypeReceiver() throws RecognitionException {
		FunctionTypeReceiverContext _localctx = new FunctionTypeReceiverContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_functionTypeReceiver);
		try {
			setState(1776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1773);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
				nullableType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1775);
				typeReference();
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

	public static class UserTypeContext extends ParserRuleContext {
		public List<SimpleUserTypeContext> simpleUserType() {
			return getRuleContexts(SimpleUserTypeContext.class);
		}
		public SimpleUserTypeContext simpleUserType(int i) {
			return getRuleContext(SimpleUserTypeContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SarlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SarlParser.DOT, i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public UserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitUserType(this);
		}
	}

	public final UserTypeContext userType() throws RecognitionException {
		UserTypeContext _localctx = new UserTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_userType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			simpleUserType();
			setState(1795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1782);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1779);
						match(NL);
						}
						}
						setState(1784);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1785);
					match(DOT);
					setState(1789);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1786);
						match(NL);
						}
						}
						setState(1791);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1792);
					simpleUserType();
					}
					} 
				}
				setState(1797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
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

	public static class SimpleUserTypeContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public SimpleUserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUserType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterSimpleUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitSimpleUserType(this);
		}
	}

	public final SimpleUserTypeContext simpleUserType() throws RecognitionException {
		SimpleUserTypeContext _localctx = new SimpleUserTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_simpleUserType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			simpleIdentifier();
			setState(1806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(1802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1799);
					match(NL);
					}
					}
					setState(1804);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1805);
				typeArguments();
				}
				break;
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

	public static class FunctionTypeParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public FunctionTypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterFunctionTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitFunctionTypeParameters(this);
		}
	}

	public final FunctionTypeParametersContext functionTypeParameters() throws RecognitionException {
		FunctionTypeParametersContext _localctx = new FunctionTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionTypeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			match(LPAREN);
			setState(1811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(1809);
				parameter();
				}
				break;
			case 2:
				{
				setState(1810);
				type();
				}
				break;
			}
			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1813);
				match(COMMA);
				setState(1816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(1814);
					parameter();
					}
					break;
				case 2:
					{
					setState(1815);
					type();
					}
					break;
				}
				}
				}
				setState(1822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1823);
			match(RPAREN);
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

	public static class TypeConstraintsContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SarlParser.WHERE, 0); }
		public List<TypeConstraintContext> typeConstraint() {
			return getRuleContexts(TypeConstraintContext.class);
		}
		public TypeConstraintContext typeConstraint(int i) {
			return getRuleContext(TypeConstraintContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public TypeConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeConstraints(this);
		}
	}

	public final TypeConstraintsContext typeConstraints() throws RecognitionException {
		TypeConstraintsContext _localctx = new TypeConstraintsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_typeConstraints);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			match(WHERE);
			setState(1829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1826);
				match(NL);
				}
				}
				setState(1831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1832);
			typeConstraint();
			setState(1849);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1836);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1833);
						match(NL);
						}
						}
						setState(1838);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1839);
					match(COMMA);
					setState(1843);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1840);
						match(NL);
						}
						}
						setState(1845);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1846);
					typeConstraint();
					}
					} 
				}
				setState(1851);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
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

	public static class TypeConstraintContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TypeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeConstraint(this);
		}
	}

	public final TypeConstraintContext typeConstraint() throws RecognitionException {
		TypeConstraintContext _localctx = new TypeConstraintContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_typeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(1852);
				annotations();
				}
				}
				setState(1857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1858);
			simpleIdentifier();
			setState(1862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1859);
				match(NL);
				}
				}
				setState(1864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1865);
			match(COLON);
			setState(1869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1866);
				match(NL);
				}
				}
				setState(1871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1872);
			type();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(SarlParser.LCURL, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(SarlParser.RCURL, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1874);
			match(LCURL);
			setState(1875);
			statements();
			setState(1876);
			match(RCURL);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<AnysemiContext> anysemi() {
			return getRuleContexts(AnysemiContext.class);
		}
		public AnysemiContext anysemi(int i) {
			return getRuleContext(AnysemiContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1878);
					anysemi();
					}
					} 
				}
				setState(1883);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			}
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(1884);
				statement();
				setState(1895);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1886); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1885);
								anysemi();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1888); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1891);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
						case 1:
							{
							setState(1890);
							statement();
							}
							break;
						}
						}
						} 
					}
					setState(1897);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
				}
				}
				break;
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockLevelExpressionContext blockLevelExpression() {
			return getRuleContext(BlockLevelExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_statement);
		try {
			setState(1902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1900);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1901);
				blockLevelExpression();
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

	public static class BlockLevelExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public BlockLevelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLevelExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterBlockLevelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitBlockLevelExpression(this);
		}
	}

	public final BlockLevelExpressionContext blockLevelExpression() throws RecognitionException {
		BlockLevelExpressionContext _localctx = new BlockLevelExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_blockLevelExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1904);
					annotations();
					}
					} 
				}
				setState(1909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			}
			setState(1913);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1910);
					match(NL);
					}
					} 
				}
				setState(1915);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			}
			setState(1916);
			expression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public List<LabelDefinitionContext> labelDefinition() {
			return getRuleContexts(LabelDefinitionContext.class);
		}
		public LabelDefinitionContext labelDefinition(int i) {
			return getRuleContext(LabelDefinitionContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LabelDefinition) {
				{
				{
				setState(1918);
				labelDefinition();
				}
				}
				setState(1923);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(1924);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(1925);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(1926);
				propertyDeclaration();
				}
				break;
			case 4:
				{
				setState(1927);
				typeAlias();
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public List<AssignmentOperatorContext> assignmentOperator() {
			return getRuleContexts(AssignmentOperatorContext.class);
		}
		public AssignmentOperatorContext assignmentOperator(int i) {
			return getRuleContext(AssignmentOperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			disjunction();
			setState(1936);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1931);
					assignmentOperator();
					setState(1932);
					disjunction();
					}
					} 
				}
				setState(1938);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
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

	public static class DisjunctionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<TerminalNode> DISJ() { return getTokens(SarlParser.DISJ); }
		public TerminalNode DISJ(int i) {
			return getToken(SarlParser.DISJ, i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_disjunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1939);
			conjunction();
			setState(1956);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1943);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1940);
						match(NL);
						}
						}
						setState(1945);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1946);
					match(DISJ);
					setState(1950);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1947);
							match(NL);
							}
							} 
						}
						setState(1952);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
					}
					setState(1953);
					conjunction();
					}
					} 
				}
				setState(1958);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public List<EqualityComparisonContext> equalityComparison() {
			return getRuleContexts(EqualityComparisonContext.class);
		}
		public EqualityComparisonContext equalityComparison(int i) {
			return getRuleContext(EqualityComparisonContext.class,i);
		}
		public List<TerminalNode> CONJ() { return getTokens(SarlParser.CONJ); }
		public TerminalNode CONJ(int i) {
			return getToken(SarlParser.CONJ, i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_conjunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			equalityComparison();
			setState(1976);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1963);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1960);
						match(NL);
						}
						}
						setState(1965);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1966);
					match(CONJ);
					setState(1970);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1967);
							match(NL);
							}
							} 
						}
						setState(1972);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
					}
					setState(1973);
					equalityComparison();
					}
					} 
				}
				setState(1978);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
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

	public static class EqualityComparisonContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<EqualityOperationContext> equalityOperation() {
			return getRuleContexts(EqualityOperationContext.class);
		}
		public EqualityOperationContext equalityOperation(int i) {
			return getRuleContext(EqualityOperationContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public EqualityComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterEqualityComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitEqualityComparison(this);
		}
	}

	public final EqualityComparisonContext equalityComparison() throws RecognitionException {
		EqualityComparisonContext _localctx = new EqualityComparisonContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_equalityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1979);
			comparison();
			setState(1991);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1980);
					equalityOperation();
					setState(1984);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1981);
							match(NL);
							}
							} 
						}
						setState(1986);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
					}
					setState(1987);
					comparison();
					}
					} 
				}
				setState(1993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<NamedInfixContext> namedInfix() {
			return getRuleContexts(NamedInfixContext.class);
		}
		public NamedInfixContext namedInfix(int i) {
			return getRuleContext(NamedInfixContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1994);
			namedInfix();
			setState(2004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(1995);
				comparisonOperator();
				setState(1999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1996);
						match(NL);
						}
						} 
					}
					setState(2001);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
				}
				setState(2002);
				namedInfix();
				}
				break;
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

	public static class NamedInfixContext extends ParserRuleContext {
		public List<ElvisExpressionContext> elvisExpression() {
			return getRuleContexts(ElvisExpressionContext.class);
		}
		public ElvisExpressionContext elvisExpression(int i) {
			return getRuleContext(ElvisExpressionContext.class,i);
		}
		public IsOperatorContext isOperator() {
			return getRuleContext(IsOperatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<InOperatorContext> inOperator() {
			return getRuleContexts(InOperatorContext.class);
		}
		public InOperatorContext inOperator(int i) {
			return getRuleContext(InOperatorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public NamedInfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedInfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterNamedInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitNamedInfix(this);
		}
	}

	public final NamedInfixContext namedInfix() throws RecognitionException {
		NamedInfixContext _localctx = new NamedInfixContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_namedInfix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2006);
			elvisExpression();
			setState(2029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				{
				setState(2016); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2007);
						inOperator();
						setState(2011);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(2008);
								match(NL);
								}
								} 
							}
							setState(2013);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
						}
						setState(2014);
						elvisExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2018); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				{
				setState(2020);
				isOperator();
				setState(2024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2021);
					match(NL);
					}
					}
					setState(2026);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2027);
				type();
				}
				}
				break;
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

	public static class ElvisExpressionContext extends ParserRuleContext {
		public List<InfixFunctionCallContext> infixFunctionCall() {
			return getRuleContexts(InfixFunctionCallContext.class);
		}
		public InfixFunctionCallContext infixFunctionCall(int i) {
			return getRuleContext(InfixFunctionCallContext.class,i);
		}
		public List<TerminalNode> ELVIS() { return getTokens(SarlParser.ELVIS); }
		public TerminalNode ELVIS(int i) {
			return getToken(SarlParser.ELVIS, i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public ElvisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elvisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterElvisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitElvisExpression(this);
		}
	}

	public final ElvisExpressionContext elvisExpression() throws RecognitionException {
		ElvisExpressionContext _localctx = new ElvisExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_elvisExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			infixFunctionCall();
			setState(2048);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2035);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2032);
						match(NL);
						}
						}
						setState(2037);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2038);
					match(ELVIS);
					setState(2042);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2039);
							match(NL);
							}
							} 
						}
						setState(2044);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
					}
					setState(2045);
					infixFunctionCall();
					}
					} 
				}
				setState(2050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
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

	public static class InfixFunctionCallContext extends ParserRuleContext {
		public List<RangeExpressionContext> rangeExpression() {
			return getRuleContexts(RangeExpressionContext.class);
		}
		public RangeExpressionContext rangeExpression(int i) {
			return getRuleContext(RangeExpressionContext.class,i);
		}
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public InfixFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterInfixFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitInfixFunctionCall(this);
		}
	}

	public final InfixFunctionCallContext infixFunctionCall() throws RecognitionException {
		InfixFunctionCallContext _localctx = new InfixFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_infixFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
			rangeExpression();
			setState(2063);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2052);
					simpleIdentifier();
					setState(2056);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2053);
							match(NL);
							}
							} 
						}
						setState(2058);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
					}
					setState(2059);
					rangeExpression();
					}
					} 
				}
				setState(2065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
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

	public static class RangeExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> RANGE() { return getTokens(SarlParser.RANGE); }
		public TerminalNode RANGE(int i) {
			return getToken(SarlParser.RANGE, i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitRangeExpression(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_rangeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			additiveExpression();
			setState(2077);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2067);
					match(RANGE);
					setState(2071);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2068);
							match(NL);
							}
							} 
						}
						setState(2073);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
					}
					setState(2074);
					additiveExpression();
					}
					} 
				}
				setState(2079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<AdditiveOperatorContext> additiveOperator() {
			return getRuleContexts(AdditiveOperatorContext.class);
		}
		public AdditiveOperatorContext additiveOperator(int i) {
			return getRuleContext(AdditiveOperatorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			multiplicativeExpression();
			setState(2092);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2081);
					additiveOperator();
					setState(2085);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2082);
							match(NL);
							}
							} 
						}
						setState(2087);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
					}
					setState(2088);
					multiplicativeExpression();
					}
					} 
				}
				setState(2094);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<TypeRHSContext> typeRHS() {
			return getRuleContexts(TypeRHSContext.class);
		}
		public TypeRHSContext typeRHS(int i) {
			return getRuleContext(TypeRHSContext.class,i);
		}
		public List<MultiplicativeOperationContext> multiplicativeOperation() {
			return getRuleContexts(MultiplicativeOperationContext.class);
		}
		public MultiplicativeOperationContext multiplicativeOperation(int i) {
			return getRuleContext(MultiplicativeOperationContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			typeRHS();
			setState(2107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2096);
					multiplicativeOperation();
					setState(2100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2097);
							match(NL);
							}
							} 
						}
						setState(2102);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
					}
					setState(2103);
					typeRHS();
					}
					} 
				}
				setState(2109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
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

	public static class TypeRHSContext extends ParserRuleContext {
		public List<PrefixUnaryExpressionContext> prefixUnaryExpression() {
			return getRuleContexts(PrefixUnaryExpressionContext.class);
		}
		public PrefixUnaryExpressionContext prefixUnaryExpression(int i) {
			return getRuleContext(PrefixUnaryExpressionContext.class,i);
		}
		public List<TypeOperationContext> typeOperation() {
			return getRuleContexts(TypeOperationContext.class);
		}
		public TypeOperationContext typeOperation(int i) {
			return getRuleContext(TypeOperationContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TypeRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRHS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeRHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeRHS(this);
		}
	}

	public final TypeRHSContext typeRHS() throws RecognitionException {
		TypeRHSContext _localctx = new TypeRHSContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_typeRHS);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			prefixUnaryExpression();
			setState(2122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2111);
						match(NL);
						}
						}
						setState(2116);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2117);
					typeOperation();
					setState(2118);
					prefixUnaryExpression();
					}
					} 
				}
				setState(2124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
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

	public static class PrefixUnaryExpressionContext extends ParserRuleContext {
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public List<PrefixUnaryOperationContext> prefixUnaryOperation() {
			return getRuleContexts(PrefixUnaryOperationContext.class);
		}
		public PrefixUnaryOperationContext prefixUnaryOperation(int i) {
			return getRuleContext(PrefixUnaryOperationContext.class,i);
		}
		public PrefixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterPrefixUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitPrefixUnaryExpression(this);
		}
	}

	public final PrefixUnaryExpressionContext prefixUnaryExpression() throws RecognitionException {
		PrefixUnaryExpressionContext _localctx = new PrefixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_prefixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,327,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2125);
					prefixUnaryOperation();
					}
					} 
				}
				setState(2130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,327,_ctx);
			}
			setState(2131);
			postfixUnaryExpression();
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

	public static class PostfixUnaryExpressionContext extends ParserRuleContext {
		public AtomicExpressionContext atomicExpression() {
			return getRuleContext(AtomicExpressionContext.class,0);
		}
		public CallableReferenceContext callableReference() {
			return getRuleContext(CallableReferenceContext.class,0);
		}
		public List<PostfixUnaryOperationContext> postfixUnaryOperation() {
			return getRuleContexts(PostfixUnaryOperationContext.class);
		}
		public PostfixUnaryOperationContext postfixUnaryOperation(int i) {
			return getRuleContext(PostfixUnaryOperationContext.class,i);
		}
		public PostfixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterPostfixUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitPostfixUnaryExpression(this);
		}
	}

	public final PostfixUnaryExpressionContext postfixUnaryExpression() throws RecognitionException {
		PostfixUnaryExpressionContext _localctx = new PostfixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_postfixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				{
				setState(2133);
				atomicExpression();
				}
				break;
			case 2:
				{
				setState(2134);
				callableReference();
				}
				break;
			}
			setState(2140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2137);
					postfixUnaryOperation();
					}
					} 
				}
				setState(2142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
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

	public static class AtomicExpressionContext extends ParserRuleContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public ThisExpressionContext thisExpression() {
			return getRuleContext(ThisExpressionContext.class,0);
		}
		public SuperExpressionContext superExpression() {
			return getRuleContext(SuperExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TryExpressionContext tryExpression() {
			return getRuleContext(TryExpressionContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public JumpExpressionContext jumpExpression() {
			return getRuleContext(JumpExpressionContext.class,0);
		}
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public CollectionLiteralContext collectionLiteral() {
			return getRuleContext(CollectionLiteralContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAtomicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAtomicExpression(this);
		}
	}

	public final AtomicExpressionContext atomicExpression() throws RecognitionException {
		AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_atomicExpression);
		try {
			setState(2155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2143);
				parenthesizedExpression();
				}
				break;
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
			case RealLiteral:
			case LongLiteral:
			case IntegerLiteral:
			case HexLiteral:
			case BinLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2144);
				literalConstant();
				}
				break;
			case LCURL:
			case AT:
			case FILE:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case LabelReference:
				enterOuterAlt(_localctx, 3);
				{
				setState(2145);
				functionLiteral();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(2146);
				thisExpression();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 5);
				{
				setState(2147);
				superExpression();
				}
				break;
			case IF:
			case WHEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(2148);
				conditionalExpression();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 7);
				{
				setState(2149);
				tryExpression();
				}
				break;
			case OBJECT:
				enterOuterAlt(_localctx, 8);
				{
				setState(2150);
				objectLiteral();
				}
				break;
			case RETURN_AT:
			case CONTINUE_AT:
			case BREAK_AT:
			case THROW:
			case RETURN:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(2151);
				jumpExpression();
				}
				break;
			case FOR:
			case DO:
			case WHILE:
				enterOuterAlt(_localctx, 10);
				{
				setState(2152);
				loopExpression();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2153);
				collectionLiteral();
				}
				break;
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				enterOuterAlt(_localctx, 12);
				{
				setState(2154);
				simpleIdentifier();
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

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitParenthesizedExpression(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			match(LPAREN);
			setState(2158);
			expression();
			setState(2159);
			match(RPAREN);
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

	public static class CallSuffixContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public List<AnnotatedLambdaContext> annotatedLambda() {
			return getRuleContexts(AnnotatedLambdaContext.class);
		}
		public AnnotatedLambdaContext annotatedLambda(int i) {
			return getRuleContext(AnnotatedLambdaContext.class,i);
		}
		public CallSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterCallSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitCallSuffix(this);
		}
	}

	public final CallSuffixContext callSuffix() throws RecognitionException {
		CallSuffixContext _localctx = new CallSuffixContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_callSuffix);
		try {
			int _alt;
			setState(2183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2161);
				typeArguments();
				setState(2163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(2162);
					valueArguments();
					}
					break;
				}
				setState(2168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2165);
						annotatedLambda();
						}
						} 
					}
					setState(2170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2171);
				valueArguments();
				setState(2175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2172);
						annotatedLambda();
						}
						} 
					}
					setState(2177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
				}
				}
				break;
			case NL:
			case LCURL:
			case AT:
			case FILE:
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
			case LabelReference:
			case LabelDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(2179); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2178);
						annotatedLambda();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2181); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AnnotatedLambdaContext extends ParserRuleContext {
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public TerminalNode LabelDefinition() { return getToken(SarlParser.LabelDefinition, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public AnnotatedLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAnnotatedLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAnnotatedLambda(this);
		}
	}

	public final AnnotatedLambdaContext annotatedLambda() throws RecognitionException {
		AnnotatedLambdaContext _localctx = new AnnotatedLambdaContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				{
				setState(2185);
				unescapedAnnotation();
				}
				}
				setState(2190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LabelDefinition) {
				{
				setState(2191);
				match(LabelDefinition);
				}
			}

			setState(2197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2194);
				match(NL);
				}
				}
				setState(2199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2200);
			functionLiteral();
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(SarlParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(SarlParser.RSQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
			match(LSQUARE);
			setState(2211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (QUOTE_OPEN - 137)) | (1L << (TRIPLE_QUOTE_OPEN - 137)) | (1L << (RealLiteral - 137)) | (1L << (LongLiteral - 137)) | (1L << (IntegerLiteral - 137)) | (1L << (HexLiteral - 137)) | (1L << (BinLiteral - 137)) | (1L << (BooleanLiteral - 137)) | (1L << (NullLiteral - 137)) | (1L << (Identifier - 137)) | (1L << (LabelReference - 137)) | (1L << (LabelDefinition - 137)) | (1L << (CharacterLiteral - 137)))) != 0)) {
				{
				setState(2203);
				expression();
				setState(2208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2204);
					match(COMMA);
					setState(2205);
					expression();
					}
					}
					setState(2210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2213);
			match(RSQUARE);
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

	public static class ValueArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public List<ValueArgumentContext> valueArgument() {
			return getRuleContexts(ValueArgumentContext.class);
		}
		public ValueArgumentContext valueArgument(int i) {
			return getRuleContext(ValueArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public ValueArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterValueArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitValueArguments(this);
		}
	}

	public final ValueArgumentsContext valueArguments() throws RecognitionException {
		ValueArgumentsContext _localctx = new ValueArgumentsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_valueArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			match(LPAREN);
			setState(2224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << MULT) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (QUOTE_OPEN - 137)) | (1L << (TRIPLE_QUOTE_OPEN - 137)) | (1L << (RealLiteral - 137)) | (1L << (LongLiteral - 137)) | (1L << (IntegerLiteral - 137)) | (1L << (HexLiteral - 137)) | (1L << (BinLiteral - 137)) | (1L << (BooleanLiteral - 137)) | (1L << (NullLiteral - 137)) | (1L << (Identifier - 137)) | (1L << (LabelReference - 137)) | (1L << (LabelDefinition - 137)) | (1L << (CharacterLiteral - 137)))) != 0)) {
				{
				setState(2216);
				valueArgument();
				setState(2221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2217);
					match(COMMA);
					setState(2218);
					valueArgument();
					}
					}
					setState(2223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2226);
			match(RPAREN);
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(SarlParser.LANGLE, 0); }
		public List<TypeProjectionContext> typeProjection() {
			return getRuleContexts(TypeProjectionContext.class);
		}
		public TypeProjectionContext typeProjection(int i) {
			return getRuleContext(TypeProjectionContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(SarlParser.RANGLE, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_typeArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2228);
			match(LANGLE);
			setState(2232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2229);
				match(NL);
				}
				}
				setState(2234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2235);
			typeProjection();
			setState(2246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2236);
						match(NL);
						}
						}
						setState(2241);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2242);
					match(COMMA);
					setState(2243);
					typeProjection();
					}
					} 
				}
				setState(2248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
			}
			setState(2252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2249);
				match(NL);
				}
				}
				setState(2254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2255);
			match(RANGLE);
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

	public static class TypeProjectionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeProjectionModifierListContext typeProjectionModifierList() {
			return getRuleContext(TypeProjectionModifierListContext.class,0);
		}
		public TerminalNode MULT() { return getToken(SarlParser.MULT, 0); }
		public TypeProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeProjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeProjection(this);
		}
	}

	public final TypeProjectionContext typeProjection() throws RecognitionException {
		TypeProjectionContext _localctx = new TypeProjectionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_typeProjection);
		try {
			setState(2262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case AT:
			case FILE:
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case IN:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
			case LabelReference:
				enterOuterAlt(_localctx, 1);
				{
				setState(2258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
				case 1:
					{
					setState(2257);
					typeProjectionModifierList();
					}
					break;
				}
				setState(2260);
				type();
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2261);
				match(MULT);
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

	public static class TypeProjectionModifierListContext extends ParserRuleContext {
		public List<VarianceAnnotationContext> varianceAnnotation() {
			return getRuleContexts(VarianceAnnotationContext.class);
		}
		public VarianceAnnotationContext varianceAnnotation(int i) {
			return getRuleContext(VarianceAnnotationContext.class,i);
		}
		public TypeProjectionModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeProjectionModifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeProjectionModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeProjectionModifierList(this);
		}
	}

	public final TypeProjectionModifierListContext typeProjectionModifierList() throws RecognitionException {
		TypeProjectionModifierListContext _localctx = new TypeProjectionModifierListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_typeProjectionModifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2265); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2264);
					varianceAnnotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2267); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ValueArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(SarlParser.ASSIGNMENT, 0); }
		public TerminalNode MULT() { return getToken(SarlParser.MULT, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public ValueArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterValueArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitValueArgument(this);
		}
	}

	public final ValueArgumentContext valueArgument() throws RecognitionException {
		ValueArgumentContext _localctx = new ValueArgumentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_valueArgument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				{
				setState(2269);
				simpleIdentifier();
				setState(2273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2270);
					match(NL);
					}
					}
					setState(2275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2276);
				match(ASSIGNMENT);
				setState(2280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,351,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2277);
						match(NL);
						}
						} 
					}
					setState(2282);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,351,_ctx);
				}
				}
				break;
			}
			setState(2286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULT) {
				{
				setState(2285);
				match(MULT);
				}
			}

			setState(2291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2288);
					match(NL);
					}
					} 
				}
				setState(2293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
			}
			setState(2294);
			expression();
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

	public static class LiteralConstantContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SarlParser.BooleanLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(SarlParser.IntegerLiteral, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(SarlParser.HexLiteral, 0); }
		public TerminalNode BinLiteral() { return getToken(SarlParser.BinLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(SarlParser.CharacterLiteral, 0); }
		public TerminalNode RealLiteral() { return getToken(SarlParser.RealLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(SarlParser.NullLiteral, 0); }
		public TerminalNode LongLiteral() { return getToken(SarlParser.LongLiteral, 0); }
		public LiteralConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterLiteralConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitLiteralConstant(this);
		}
	}

	public final LiteralConstantContext literalConstant() throws RecognitionException {
		LiteralConstantContext _localctx = new LiteralConstantContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_literalConstant);
		try {
			setState(2305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2296);
				match(BooleanLiteral);
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2297);
				match(IntegerLiteral);
				}
				break;
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(2298);
				stringLiteral();
				}
				break;
			case HexLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2299);
				match(HexLiteral);
				}
				break;
			case BinLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(2300);
				match(BinLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(2301);
				match(CharacterLiteral);
				}
				break;
			case RealLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2302);
				match(RealLiteral);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 8);
				{
				setState(2303);
				match(NullLiteral);
				}
				break;
			case LongLiteral:
				enterOuterAlt(_localctx, 9);
				{
				setState(2304);
				match(LongLiteral);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public LineStringLiteralContext lineStringLiteral() {
			return getRuleContext(LineStringLiteralContext.class,0);
		}
		public MultiLineStringLiteralContext multiLineStringLiteral() {
			return getRuleContext(MultiLineStringLiteralContext.class,0);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_stringLiteral);
		try {
			setState(2309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2307);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2308);
				multiLineStringLiteral();
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

	public static class LineStringLiteralContext extends ParserRuleContext {
		public TerminalNode QUOTE_OPEN() { return getToken(SarlParser.QUOTE_OPEN, 0); }
		public TerminalNode QUOTE_CLOSE() { return getToken(SarlParser.QUOTE_CLOSE, 0); }
		public List<LineStringContentContext> lineStringContent() {
			return getRuleContexts(LineStringContentContext.class);
		}
		public LineStringContentContext lineStringContent(int i) {
			return getRuleContext(LineStringContentContext.class,i);
		}
		public List<LineStringExpressionContext> lineStringExpression() {
			return getRuleContexts(LineStringExpressionContext.class);
		}
		public LineStringExpressionContext lineStringExpression(int i) {
			return getRuleContext(LineStringExpressionContext.class,i);
		}
		public LineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitLineStringLiteral(this);
		}
	}

	public final LineStringLiteralContext lineStringLiteral() throws RecognitionException {
		LineStringLiteralContext _localctx = new LineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2311);
			match(QUOTE_OPEN);
			setState(2316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (LineStrRef - 164)) | (1L << (LineStrText - 164)) | (1L << (LineStrEscapedChar - 164)) | (1L << (LineStrExprStart - 164)))) != 0)) {
				{
				setState(2314);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LineStrRef:
				case LineStrText:
				case LineStrEscapedChar:
					{
					setState(2312);
					lineStringContent();
					}
					break;
				case LineStrExprStart:
					{
					setState(2313);
					lineStringExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2319);
			match(QUOTE_CLOSE);
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

	public static class MultiLineStringLiteralContext extends ParserRuleContext {
		public TerminalNode TRIPLE_QUOTE_OPEN() { return getToken(SarlParser.TRIPLE_QUOTE_OPEN, 0); }
		public TerminalNode TRIPLE_QUOTE_CLOSE() { return getToken(SarlParser.TRIPLE_QUOTE_CLOSE, 0); }
		public List<MultiLineStringContentContext> multiLineStringContent() {
			return getRuleContexts(MultiLineStringContentContext.class);
		}
		public MultiLineStringContentContext multiLineStringContent(int i) {
			return getRuleContext(MultiLineStringContentContext.class,i);
		}
		public List<MultiLineStringExpressionContext> multiLineStringExpression() {
			return getRuleContexts(MultiLineStringExpressionContext.class);
		}
		public MultiLineStringExpressionContext multiLineStringExpression(int i) {
			return getRuleContext(MultiLineStringExpressionContext.class,i);
		}
		public List<LineStringLiteralContext> lineStringLiteral() {
			return getRuleContexts(LineStringLiteralContext.class);
		}
		public LineStringLiteralContext lineStringLiteral(int i) {
			return getRuleContext(LineStringLiteralContext.class,i);
		}
		public List<TerminalNode> MultiLineStringQuote() { return getTokens(SarlParser.MultiLineStringQuote); }
		public TerminalNode MultiLineStringQuote(int i) {
			return getToken(SarlParser.MultiLineStringQuote, i);
		}
		public MultiLineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterMultiLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitMultiLineStringLiteral(this);
		}
	}

	public final MultiLineStringLiteralContext multiLineStringLiteral() throws RecognitionException {
		MultiLineStringLiteralContext _localctx = new MultiLineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2321);
			match(TRIPLE_QUOTE_OPEN);
			setState(2328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (QUOTE_OPEN - 137)) | (1L << (MultiLineStringQuote - 137)) | (1L << (MultiLineStrRef - 137)) | (1L << (MultiLineStrText - 137)) | (1L << (MultiLineStrEscapedChar - 137)) | (1L << (MultiLineStrExprStart - 137)))) != 0)) {
				{
				setState(2326);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrRef:
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(2322);
					multiLineStringContent();
					}
					break;
				case MultiLineStrExprStart:
					{
					setState(2323);
					multiLineStringExpression();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(2324);
					lineStringLiteral();
					}
					break;
				case MultiLineStringQuote:
					{
					setState(2325);
					match(MultiLineStringQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2331);
			match(TRIPLE_QUOTE_CLOSE);
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

	public static class LineStringContentContext extends ParserRuleContext {
		public TerminalNode LineStrText() { return getToken(SarlParser.LineStrText, 0); }
		public TerminalNode LineStrEscapedChar() { return getToken(SarlParser.LineStrEscapedChar, 0); }
		public TerminalNode LineStrRef() { return getToken(SarlParser.LineStrRef, 0); }
		public LineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitLineStringContent(this);
		}
	}

	public final LineStringContentContext lineStringContent() throws RecognitionException {
		LineStringContentContext _localctx = new LineStringContentContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2333);
			_la = _input.LA(1);
			if ( !(((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (LineStrRef - 164)) | (1L << (LineStrText - 164)) | (1L << (LineStrEscapedChar - 164)))) != 0)) ) {
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

	public static class LineStringExpressionContext extends ParserRuleContext {
		public TerminalNode LineStrExprStart() { return getToken(SarlParser.LineStrExprStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(SarlParser.RCURL, 0); }
		public LineStringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterLineStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitLineStringExpression(this);
		}
	}

	public final LineStringExpressionContext lineStringExpression() throws RecognitionException {
		LineStringExpressionContext _localctx = new LineStringExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_lineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			match(LineStrExprStart);
			setState(2336);
			expression();
			setState(2337);
			match(RCURL);
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

	public static class MultiLineStringContentContext extends ParserRuleContext {
		public TerminalNode MultiLineStrText() { return getToken(SarlParser.MultiLineStrText, 0); }
		public TerminalNode MultiLineStrEscapedChar() { return getToken(SarlParser.MultiLineStrEscapedChar, 0); }
		public TerminalNode MultiLineStrRef() { return getToken(SarlParser.MultiLineStrRef, 0); }
		public MultiLineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterMultiLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitMultiLineStringContent(this);
		}
	}

	public final MultiLineStringContentContext multiLineStringContent() throws RecognitionException {
		MultiLineStringContentContext _localctx = new MultiLineStringContentContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_multiLineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339);
			_la = _input.LA(1);
			if ( !(((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (MultiLineStrRef - 170)) | (1L << (MultiLineStrText - 170)) | (1L << (MultiLineStrEscapedChar - 170)))) != 0)) ) {
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

	public static class MultiLineStringExpressionContext extends ParserRuleContext {
		public TerminalNode MultiLineStrExprStart() { return getToken(SarlParser.MultiLineStrExprStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(SarlParser.RCURL, 0); }
		public MultiLineStringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterMultiLineStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitMultiLineStringExpression(this);
		}
	}

	public final MultiLineStringExpressionContext multiLineStringExpression() throws RecognitionException {
		MultiLineStringExpressionContext _localctx = new MultiLineStringExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_multiLineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			match(MultiLineStrExprStart);
			setState(2342);
			expression();
			setState(2343);
			match(RCURL);
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

	public static class FunctionLiteralContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(SarlParser.LCURL, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(SarlParser.RCURL, 0); }
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(SarlParser.ARROW, 0); }
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public FunctionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterFunctionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitFunctionLiteral(this);
		}
	}

	public final FunctionLiteralContext functionLiteral() throws RecognitionException {
		FunctionLiteralContext _localctx = new FunctionLiteralContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_functionLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(2345);
				annotations();
				}
				}
				setState(2350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
			case 1:
				{
				setState(2351);
				match(LCURL);
				setState(2355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2352);
						match(NL);
						}
						} 
					}
					setState(2357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
				}
				setState(2358);
				statements();
				setState(2362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2359);
					match(NL);
					}
					}
					setState(2364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2365);
				match(RCURL);
				}
				break;
			case 2:
				{
				setState(2367);
				match(LCURL);
				setState(2371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,364,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2368);
						match(NL);
						}
						} 
					}
					setState(2373);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,364,_ctx);
				}
				setState(2374);
				lambdaParameters();
				setState(2378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2375);
					match(NL);
					}
					}
					setState(2380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2381);
				match(ARROW);
				setState(2385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2382);
						match(NL);
						}
						} 
					}
					setState(2387);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
				}
				setState(2388);
				statements();
				setState(2392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2389);
					match(NL);
					}
					}
					setState(2394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2395);
				match(RCURL);
				}
				break;
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<LambdaParameterContext> lambdaParameter() {
			return getRuleContexts(LambdaParameterContext.class);
		}
		public LambdaParameterContext lambdaParameter(int i) {
			return getRuleContext(LambdaParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_lambdaParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==IMPORT || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (WHERE - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (OUT - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)))) != 0) || _la==Identifier) {
				{
				setState(2399);
				lambdaParameter();
				}
			}

			setState(2418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,372,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2405);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2402);
						match(NL);
						}
						}
						setState(2407);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2408);
					match(COMMA);
					setState(2412);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2409);
						match(NL);
						}
						}
						setState(2414);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2415);
					lambdaParameter();
					}
					} 
				}
				setState(2420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,372,_ctx);
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

	public static class LambdaParameterContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MultiVariableDeclarationContext multiVariableDeclaration() {
			return getRuleContext(MultiVariableDeclarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public LambdaParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterLambdaParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitLambdaParameter(this);
		}
	}

	public final LambdaParameterContext lambdaParameter() throws RecognitionException {
		LambdaParameterContext _localctx = new LambdaParameterContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_lambdaParameter);
		int _la;
		try {
			setState(2439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2421);
				variableDeclaration();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2422);
				multiVariableDeclaration();
				setState(2437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
				case 1:
					{
					setState(2426);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2423);
						match(NL);
						}
						}
						setState(2428);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2429);
					match(COLON);
					setState(2433);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2430);
						match(NL);
						}
						}
						setState(2435);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2436);
					type();
					}
					break;
				}
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

	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(SarlParser.OBJECT, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2441);
			match(OBJECT);
			setState(2456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				{
				setState(2445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2442);
					match(NL);
					}
					}
					setState(2447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2448);
				match(COLON);
				setState(2452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2449);
					match(NL);
					}
					}
					setState(2454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2455);
				delegationSpecifiers();
				}
				break;
			}
			setState(2461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2458);
				match(NL);
				}
				}
				setState(2463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2464);
			classBody();
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

	public static class CollectionLiteralContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(SarlParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(SarlParser.RSQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public CollectionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterCollectionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitCollectionLiteral(this);
		}
	}

	public final CollectionLiteralContext collectionLiteral() throws RecognitionException {
		CollectionLiteralContext _localctx = new CollectionLiteralContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_collectionLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			match(LSQUARE);
			setState(2468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (QUOTE_OPEN - 137)) | (1L << (TRIPLE_QUOTE_OPEN - 137)) | (1L << (RealLiteral - 137)) | (1L << (LongLiteral - 137)) | (1L << (IntegerLiteral - 137)) | (1L << (HexLiteral - 137)) | (1L << (BinLiteral - 137)) | (1L << (BooleanLiteral - 137)) | (1L << (NullLiteral - 137)) | (1L << (Identifier - 137)) | (1L << (LabelReference - 137)) | (1L << (LabelDefinition - 137)) | (1L << (CharacterLiteral - 137)))) != 0)) {
				{
				setState(2467);
				expression();
				}
			}

			setState(2474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2470);
				match(COMMA);
				setState(2471);
				expression();
				}
				}
				setState(2476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2477);
			match(RSQUARE);
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

	public static class ThisExpressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(SarlParser.THIS, 0); }
		public TerminalNode LabelReference() { return getToken(SarlParser.LabelReference, 0); }
		public ThisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitThisExpression(this);
		}
	}

	public final ThisExpressionContext thisExpression() throws RecognitionException {
		ThisExpressionContext _localctx = new ThisExpressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_thisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			match(THIS);
			setState(2481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
			case 1:
				{
				setState(2480);
				match(LabelReference);
				}
				break;
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

	public static class SuperExpressionContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(SarlParser.SUPER, 0); }
		public TerminalNode LANGLE() { return getToken(SarlParser.LANGLE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RANGLE() { return getToken(SarlParser.RANGLE, 0); }
		public TerminalNode LabelReference() { return getToken(SarlParser.LabelReference, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public SuperExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitSuperExpression(this);
		}
	}

	public final SuperExpressionContext superExpression() throws RecognitionException {
		SuperExpressionContext _localctx = new SuperExpressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_superExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			match(SUPER);
			setState(2500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
			case 1:
				{
				setState(2484);
				match(LANGLE);
				setState(2488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2485);
					match(NL);
					}
					}
					setState(2490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2491);
				type();
				setState(2495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2492);
					match(NL);
					}
					}
					setState(2497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2498);
				match(RANGLE);
				}
				break;
			}
			setState(2503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
			case 1:
				{
				setState(2502);
				match(LabelReference);
				}
				break;
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public WhenExpressionContext whenExpression() {
			return getRuleContext(WhenExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_conditionalExpression);
		try {
			setState(2507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(2505);
				ifExpression();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2506);
				whenExpression();
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

	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SarlParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<ControlStructureBodyContext> controlStructureBody() {
			return getRuleContexts(ControlStructureBodyContext.class);
		}
		public ControlStructureBodyContext controlStructureBody(int i) {
			return getRuleContext(ControlStructureBodyContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(SarlParser.SEMICOLON, 0); }
		public TerminalNode ELSE() { return getToken(SarlParser.ELSE, 0); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitIfExpression(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2509);
			match(IF);
			setState(2513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2510);
				match(NL);
				}
				}
				setState(2515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2516);
			match(LPAREN);
			setState(2517);
			expression();
			setState(2518);
			match(RPAREN);
			setState(2522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,390,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2519);
					match(NL);
					}
					} 
				}
				setState(2524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,390,_ctx);
			}
			setState(2526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
			case 1:
				{
				setState(2525);
				controlStructureBody();
				}
				break;
			}
			setState(2529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
			case 1:
				{
				setState(2528);
				match(SEMICOLON);
				}
				break;
			}
			setState(2547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
			case 1:
				{
				setState(2534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2531);
					match(NL);
					}
					}
					setState(2536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2537);
				match(ELSE);
				setState(2541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2538);
						match(NL);
						}
						} 
					}
					setState(2543);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
				}
				setState(2545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
				case 1:
					{
					setState(2544);
					controlStructureBody();
					}
					break;
				}
				}
				break;
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

	public static class ControlStructureBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ControlStructureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStructureBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterControlStructureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitControlStructureBody(this);
		}
	}

	public final ControlStructureBodyContext controlStructureBody() throws RecognitionException {
		ControlStructureBodyContext _localctx = new ControlStructureBodyContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_controlStructureBody);
		try {
			setState(2551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2549);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2550);
				expression();
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

	public static class WhenExpressionContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(SarlParser.WHEN, 0); }
		public TerminalNode LCURL() { return getToken(SarlParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SarlParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public List<WhenEntryContext> whenEntry() {
			return getRuleContexts(WhenEntryContext.class);
		}
		public WhenEntryContext whenEntry(int i) {
			return getRuleContext(WhenEntryContext.class,i);
		}
		public WhenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterWhenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitWhenExpression(this);
		}
	}

	public final WhenExpressionContext whenExpression() throws RecognitionException {
		WhenExpressionContext _localctx = new WhenExpressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_whenExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2553);
			match(WHEN);
			setState(2557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,398,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2554);
					match(NL);
					}
					} 
				}
				setState(2559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,398,_ctx);
			}
			setState(2564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2560);
				match(LPAREN);
				setState(2561);
				expression();
				setState(2562);
				match(RPAREN);
				}
			}

			setState(2569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2566);
				match(NL);
				}
				}
				setState(2571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2572);
			match(LCURL);
			setState(2576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,401,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2573);
					match(NL);
					}
					} 
				}
				setState(2578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,401,_ctx);
			}
			setState(2588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,403,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2579);
					whenEntry();
					setState(2583);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2580);
							match(NL);
							}
							} 
						}
						setState(2585);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
					}
					}
					} 
				}
				setState(2590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,403,_ctx);
			}
			setState(2594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2591);
				match(NL);
				}
				}
				setState(2596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2597);
			match(RCURL);
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

	public static class WhenEntryContext extends ParserRuleContext {
		public List<WhenConditionContext> whenCondition() {
			return getRuleContexts(WhenConditionContext.class);
		}
		public WhenConditionContext whenCondition(int i) {
			return getRuleContext(WhenConditionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(SarlParser.ARROW, 0); }
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SarlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SarlParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SarlParser.ELSE, 0); }
		public WhenEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterWhenEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitWhenEntry(this);
		}
	}

	public final WhenEntryContext whenEntry() throws RecognitionException {
		WhenEntryContext _localctx = new WhenEntryContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_whenEntry);
		int _la;
		try {
			int _alt;
			setState(2651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
			case LPAREN:
			case LSQUARE:
			case LCURL:
			case ADD:
			case SUB:
			case INCR:
			case DECR:
			case EXCL:
			case COLONCOLON:
			case Q_COLONCOLON:
			case AT:
			case RETURN_AT:
			case CONTINUE_AT:
			case BREAK_AT:
			case FILE:
			case IMPORT:
			case OBJECT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case THIS:
			case SUPER:
			case WHERE:
			case IF:
			case WHEN:
			case TRY:
			case CATCH:
			case FINALLY:
			case FOR:
			case DO:
			case WHILE:
			case THROW:
			case RETURN:
			case CONTINUE:
			case BREAK:
			case IS:
			case IN:
			case NOT_IS:
			case NOT_IN:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
			case RealLiteral:
			case LongLiteral:
			case IntegerLiteral:
			case HexLiteral:
			case BinLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case Identifier:
			case LabelReference:
			case LabelDefinition:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2599);
				whenCondition();
				setState(2616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,407,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2603);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2600);
							match(NL);
							}
							}
							setState(2605);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2606);
						match(COMMA);
						setState(2610);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,406,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(2607);
								match(NL);
								}
								} 
							}
							setState(2612);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,406,_ctx);
						}
						setState(2613);
						whenCondition();
						}
						} 
					}
					setState(2618);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,407,_ctx);
				}
				setState(2622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2619);
					match(NL);
					}
					}
					setState(2624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2625);
				match(ARROW);
				setState(2629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,409,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2626);
						match(NL);
						}
						} 
					}
					setState(2631);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,409,_ctx);
				}
				setState(2632);
				controlStructureBody();
				setState(2634);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,410,_ctx) ) {
				case 1:
					{
					setState(2633);
					semi();
					}
					break;
				}
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2636);
				match(ELSE);
				setState(2640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2637);
					match(NL);
					}
					}
					setState(2642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2643);
				match(ARROW);
				setState(2647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,412,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2644);
						match(NL);
						}
						} 
					}
					setState(2649);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,412,_ctx);
				}
				setState(2650);
				controlStructureBody();
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

	public static class WhenConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeTestContext rangeTest() {
			return getRuleContext(RangeTestContext.class,0);
		}
		public TypeTestContext typeTest() {
			return getRuleContext(TypeTestContext.class,0);
		}
		public WhenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterWhenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitWhenCondition(this);
		}
	}

	public final WhenConditionContext whenCondition() throws RecognitionException {
		WhenConditionContext _localctx = new WhenConditionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_whenCondition);
		try {
			setState(2656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
			case LPAREN:
			case LSQUARE:
			case LCURL:
			case ADD:
			case SUB:
			case INCR:
			case DECR:
			case EXCL:
			case COLONCOLON:
			case Q_COLONCOLON:
			case AT:
			case RETURN_AT:
			case CONTINUE_AT:
			case BREAK_AT:
			case FILE:
			case IMPORT:
			case OBJECT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case THIS:
			case SUPER:
			case WHERE:
			case IF:
			case WHEN:
			case TRY:
			case CATCH:
			case FINALLY:
			case FOR:
			case DO:
			case WHILE:
			case THROW:
			case RETURN:
			case CONTINUE:
			case BREAK:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
			case RealLiteral:
			case LongLiteral:
			case IntegerLiteral:
			case HexLiteral:
			case BinLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case Identifier:
			case LabelReference:
			case LabelDefinition:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2653);
				expression();
				}
				break;
			case IN:
			case NOT_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2654);
				rangeTest();
				}
				break;
			case IS:
			case NOT_IS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2655);
				typeTest();
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

	public static class RangeTestContext extends ParserRuleContext {
		public InOperatorContext inOperator() {
			return getRuleContext(InOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public RangeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterRangeTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitRangeTest(this);
		}
	}

	public final RangeTestContext rangeTest() throws RecognitionException {
		RangeTestContext _localctx = new RangeTestContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_rangeTest);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2658);
			inOperator();
			setState(2662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,415,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2659);
					match(NL);
					}
					} 
				}
				setState(2664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,415,_ctx);
			}
			setState(2665);
			expression();
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

	public static class TypeTestContext extends ParserRuleContext {
		public IsOperatorContext isOperator() {
			return getRuleContext(IsOperatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TypeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeTest(this);
		}
	}

	public final TypeTestContext typeTest() throws RecognitionException {
		TypeTestContext _localctx = new TypeTestContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_typeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2667);
			isOperator();
			setState(2671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2668);
				match(NL);
				}
				}
				setState(2673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2674);
			type();
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

	public static class TryExpressionContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(SarlParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTryExpression(this);
		}
	}

	public final TryExpressionContext tryExpression() throws RecognitionException {
		TryExpressionContext _localctx = new TryExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_tryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2676);
			match(TRY);
			setState(2680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2677);
				match(NL);
				}
				}
				setState(2682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2683);
			block();
			setState(2693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,419,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2687);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2684);
						match(NL);
						}
						}
						setState(2689);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2690);
					catchBlock();
					}
					} 
				}
				setState(2695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,419,_ctx);
			}
			setState(2703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,421,_ctx) ) {
			case 1:
				{
				setState(2699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2696);
					match(NL);
					}
					}
					setState(2701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2702);
				finallyBlock();
				}
				break;
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

	public static class CatchBlockContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(SarlParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterCatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitCatchBlock(this);
		}
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_catchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2705);
			match(CATCH);
			setState(2709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2706);
				match(NL);
				}
				}
				setState(2711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2712);
			match(LPAREN);
			setState(2716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(2713);
				annotations();
				}
				}
				setState(2718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2719);
			simpleIdentifier();
			setState(2720);
			match(COLON);
			setState(2721);
			userType();
			setState(2722);
			match(RPAREN);
			setState(2726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2723);
				match(NL);
				}
				}
				setState(2728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2729);
			block();
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(SarlParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_finallyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2731);
			match(FINALLY);
			setState(2735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2732);
				match(NL);
				}
				}
				setState(2737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2738);
			block();
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

	public static class LoopExpressionContext extends ParserRuleContext {
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public WhileExpressionContext whileExpression() {
			return getRuleContext(WhileExpressionContext.class,0);
		}
		public DoWhileExpressionContext doWhileExpression() {
			return getRuleContext(DoWhileExpressionContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitLoopExpression(this);
		}
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_loopExpression);
		try {
			setState(2743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2740);
				forExpression();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2741);
				whileExpression();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(2742);
				doWhileExpression();
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

	public static class ForExpressionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SarlParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public TerminalNode IN() { return getToken(SarlParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MultiVariableDeclarationContext multiVariableDeclaration() {
			return getRuleContext(MultiVariableDeclarationContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitForExpression(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_forExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2745);
			match(FOR);
			setState(2749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2746);
				match(NL);
				}
				}
				setState(2751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2752);
			match(LPAREN);
			setState(2756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(2753);
				annotations();
				}
				}
				setState(2758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				{
				setState(2759);
				variableDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(2760);
				multiVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2763);
			match(IN);
			setState(2764);
			expression();
			setState(2765);
			match(RPAREN);
			setState(2769);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,430,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2766);
					match(NL);
					}
					} 
				}
				setState(2771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,430,_ctx);
			}
			setState(2773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,431,_ctx) ) {
			case 1:
				{
				setState(2772);
				controlStructureBody();
				}
				break;
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

	public static class WhileExpressionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SarlParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public WhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitWhileExpression(this);
		}
	}

	public final WhileExpressionContext whileExpression() throws RecognitionException {
		WhileExpressionContext _localctx = new WhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_whileExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2775);
			match(WHILE);
			setState(2779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2776);
				match(NL);
				}
				}
				setState(2781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2782);
			match(LPAREN);
			setState(2783);
			expression();
			setState(2784);
			match(RPAREN);
			setState(2788);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,433,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2785);
					match(NL);
					}
					} 
				}
				setState(2790);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,433,_ctx);
			}
			setState(2792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,434,_ctx) ) {
			case 1:
				{
				setState(2791);
				controlStructureBody();
				}
				break;
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

	public static class DoWhileExpressionContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(SarlParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(SarlParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(SarlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SarlParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public DoWhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterDoWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitDoWhileExpression(this);
		}
	}

	public final DoWhileExpressionContext doWhileExpression() throws RecognitionException {
		DoWhileExpressionContext _localctx = new DoWhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_doWhileExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2794);
			match(DO);
			setState(2798);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,435,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2795);
					match(NL);
					}
					} 
				}
				setState(2800);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,435,_ctx);
			}
			setState(2802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,436,_ctx) ) {
			case 1:
				{
				setState(2801);
				controlStructureBody();
				}
				break;
			}
			setState(2807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2804);
				match(NL);
				}
				}
				setState(2809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2810);
			match(WHILE);
			setState(2814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2811);
				match(NL);
				}
				}
				setState(2816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2817);
			match(LPAREN);
			setState(2818);
			expression();
			setState(2819);
			match(RPAREN);
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

	public static class JumpExpressionContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(SarlParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TerminalNode RETURN() { return getToken(SarlParser.RETURN, 0); }
		public TerminalNode RETURN_AT() { return getToken(SarlParser.RETURN_AT, 0); }
		public TerminalNode CONTINUE() { return getToken(SarlParser.CONTINUE, 0); }
		public TerminalNode CONTINUE_AT() { return getToken(SarlParser.CONTINUE_AT, 0); }
		public TerminalNode BREAK() { return getToken(SarlParser.BREAK, 0); }
		public TerminalNode BREAK_AT() { return getToken(SarlParser.BREAK_AT, 0); }
		public JumpExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterJumpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitJumpExpression(this);
		}
	}

	public final JumpExpressionContext jumpExpression() throws RecognitionException {
		JumpExpressionContext _localctx = new JumpExpressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_jumpExpression);
		int _la;
		try {
			int _alt;
			setState(2837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2821);
				match(THROW);
				setState(2825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,439,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2822);
						match(NL);
						}
						} 
					}
					setState(2827);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,439,_ctx);
				}
				setState(2828);
				expression();
				}
				break;
			case RETURN_AT:
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2829);
				_la = _input.LA(1);
				if ( !(_la==RETURN_AT || _la==RETURN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2831);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,440,_ctx) ) {
				case 1:
					{
					setState(2830);
					expression();
					}
					break;
				}
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2833);
				match(CONTINUE);
				}
				break;
			case CONTINUE_AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2834);
				match(CONTINUE_AT);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2835);
				match(BREAK);
				}
				break;
			case BREAK_AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2836);
				match(BREAK_AT);
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

	public static class CallableReferenceContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(SarlParser.COLONCOLON, 0); }
		public TerminalNode Q_COLONCOLON() { return getToken(SarlParser.Q_COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(SarlParser.CLASS, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public List<TerminalNode> QUEST() { return getTokens(SarlParser.QUEST); }
		public TerminalNode QUEST(int i) {
			return getToken(SarlParser.QUEST, i);
		}
		public CallableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterCallableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitCallableReference(this);
		}
	}

	public final CallableReferenceContext callableReference() throws RecognitionException {
		CallableReferenceContext _localctx = new CallableReferenceContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_callableReference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				setState(2839);
				userType();
				setState(2849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==QUEST) {
					{
					{
					setState(2840);
					match(QUEST);
					setState(2844);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,442,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2841);
							match(NL);
							}
							} 
						}
						setState(2846);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,442,_ctx);
					}
					}
					}
					setState(2851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2854);
				match(NL);
				}
				}
				setState(2859);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2860);
			_la = _input.LA(1);
			if ( !(_la==COLONCOLON || _la==Q_COLONCOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2861);
				match(NL);
				}
				}
				setState(2866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				{
				setState(2867);
				identifier();
				}
				break;
			case CLASS:
				{
				setState(2868);
				match(CLASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(SarlParser.ASSIGNMENT, 0); }
		public TerminalNode ADD_ASSIGNMENT() { return getToken(SarlParser.ADD_ASSIGNMENT, 0); }
		public TerminalNode SUB_ASSIGNMENT() { return getToken(SarlParser.SUB_ASSIGNMENT, 0); }
		public TerminalNode MULT_ASSIGNMENT() { return getToken(SarlParser.MULT_ASSIGNMENT, 0); }
		public TerminalNode DIV_ASSIGNMENT() { return getToken(SarlParser.DIV_ASSIGNMENT, 0); }
		public TerminalNode MOD_ASSIGNMENT() { return getToken(SarlParser.MOD_ASSIGNMENT, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2871);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGNMENT) | (1L << ADD_ASSIGNMENT) | (1L << SUB_ASSIGNMENT) | (1L << MULT_ASSIGNMENT) | (1L << DIV_ASSIGNMENT) | (1L << MOD_ASSIGNMENT))) != 0)) ) {
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

	public static class EqualityOperationContext extends ParserRuleContext {
		public TerminalNode EXCL_EQ() { return getToken(SarlParser.EXCL_EQ, 0); }
		public TerminalNode EXCL_EQEQ() { return getToken(SarlParser.EXCL_EQEQ, 0); }
		public TerminalNode EQEQ() { return getToken(SarlParser.EQEQ, 0); }
		public TerminalNode EQEQEQ() { return getToken(SarlParser.EQEQEQ, 0); }
		public EqualityOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterEqualityOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitEqualityOperation(this);
		}
	}

	public final EqualityOperationContext equalityOperation() throws RecognitionException {
		EqualityOperationContext _localctx = new EqualityOperationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_equalityOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2873);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCL_EQ) | (1L << EXCL_EQEQ) | (1L << EQEQ) | (1L << EQEQEQ))) != 0)) ) {
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(SarlParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(SarlParser.RANGLE, 0); }
		public TerminalNode LE() { return getToken(SarlParser.LE, 0); }
		public TerminalNode GE() { return getToken(SarlParser.GE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2875);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LE) | (1L << GE))) != 0)) ) {
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

	public static class InOperatorContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(SarlParser.IN, 0); }
		public TerminalNode NOT_IN() { return getToken(SarlParser.NOT_IN, 0); }
		public InOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterInOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitInOperator(this);
		}
	}

	public final InOperatorContext inOperator() throws RecognitionException {
		InOperatorContext _localctx = new InOperatorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_inOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2877);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==NOT_IN) ) {
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

	public static class IsOperatorContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(SarlParser.IS, 0); }
		public TerminalNode NOT_IS() { return getToken(SarlParser.NOT_IS, 0); }
		public IsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterIsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitIsOperator(this);
		}
	}

	public final IsOperatorContext isOperator() throws RecognitionException {
		IsOperatorContext _localctx = new IsOperatorContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2879);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==NOT_IS) ) {
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SarlParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SarlParser.SUB, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAdditiveOperator(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2881);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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

	public static class MultiplicativeOperationContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(SarlParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(SarlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SarlParser.MOD, 0); }
		public MultiplicativeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterMultiplicativeOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitMultiplicativeOperation(this);
		}
	}

	public final MultiplicativeOperationContext multiplicativeOperation() throws RecognitionException {
		MultiplicativeOperationContext _localctx = new MultiplicativeOperationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_multiplicativeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2883);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << MOD) | (1L << DIV))) != 0)) ) {
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

	public static class TypeOperationContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SarlParser.AS, 0); }
		public TerminalNode AS_SAFE() { return getToken(SarlParser.AS_SAFE, 0); }
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public TypeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeOperation(this);
		}
	}

	public final TypeOperationContext typeOperation() throws RecognitionException {
		TypeOperationContext _localctx = new TypeOperationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_typeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2885);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (COLON - 25)) | (1L << (AS_SAFE - 25)) | (1L << (AS - 25)))) != 0)) ) {
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

	public static class PrefixUnaryOperationContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(SarlParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(SarlParser.DECR, 0); }
		public TerminalNode ADD() { return getToken(SarlParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SarlParser.SUB, 0); }
		public TerminalNode EXCL() { return getToken(SarlParser.EXCL, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public PrefixUnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterPrefixUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitPrefixUnaryOperation(this);
		}
	}

	public final PrefixUnaryOperationContext prefixUnaryOperation() throws RecognitionException {
		PrefixUnaryOperationContext _localctx = new PrefixUnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_prefixUnaryOperation);
		try {
			setState(2894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2887);
				match(INCR);
				}
				break;
			case DECR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2888);
				match(DECR);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2889);
				match(ADD);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2890);
				match(SUB);
				}
				break;
			case EXCL:
				enterOuterAlt(_localctx, 5);
				{
				setState(2891);
				match(EXCL);
				}
				break;
			case AT:
			case FILE:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case LabelReference:
				enterOuterAlt(_localctx, 6);
				{
				setState(2892);
				annotations();
				}
				break;
			case LabelDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(2893);
				labelDefinition();
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

	public static class PostfixUnaryOperationContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(SarlParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(SarlParser.DECR, 0); }
		public List<TerminalNode> EXCL() { return getTokens(SarlParser.EXCL); }
		public TerminalNode EXCL(int i) {
			return getToken(SarlParser.EXCL, i);
		}
		public CallSuffixContext callSuffix() {
			return getRuleContext(CallSuffixContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MemberAccessOperatorContext memberAccessOperator() {
			return getRuleContext(MemberAccessOperatorContext.class,0);
		}
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public PostfixUnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterPostfixUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitPostfixUnaryOperation(this);
		}
	}

	public final PostfixUnaryOperationContext postfixUnaryOperation() throws RecognitionException {
		PostfixUnaryOperationContext _localctx = new PostfixUnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_postfixUnaryOperation);
		int _la;
		try {
			setState(2911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,450,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2896);
				match(INCR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2897);
				match(DECR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2898);
				match(EXCL);
				setState(2899);
				match(EXCL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2900);
				callSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2901);
				arrayAccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2902);
					match(NL);
					}
					}
					setState(2907);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2908);
				memberAccessOperator();
				setState(2909);
				postfixUnaryExpression();
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

	public static class MemberAccessOperatorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SarlParser.DOT, 0); }
		public TerminalNode QUEST() { return getToken(SarlParser.QUEST, 0); }
		public MemberAccessOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccessOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterMemberAccessOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitMemberAccessOperator(this);
		}
	}

	public final MemberAccessOperatorContext memberAccessOperator() throws RecognitionException {
		MemberAccessOperatorContext _localctx = new MemberAccessOperatorContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_memberAccessOperator);
		try {
			setState(2916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2913);
				match(DOT);
				}
				break;
			case QUEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(2914);
				match(QUEST);
				setState(2915);
				match(DOT);
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

	public static class ModifierListContext extends ParserRuleContext {
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitModifierList(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_modifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2920); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2920);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AT:
					case FILE:
					case FIELD:
					case PROPERTY:
					case GET:
					case SET:
					case RECEIVER:
					case PARAM:
					case SETPARAM:
					case DELEGATE:
					case LabelReference:
						{
						setState(2918);
						annotations();
						}
						break;
					case IN:
					case OUT:
					case PUBLIC:
					case PRIVATE:
					case PROTECTED:
					case INTERNAL:
					case ENUM:
					case SEALED:
					case ANNOTATION:
					case DATA:
					case INNER:
					case TAILREC:
					case OPERATOR:
					case INLINE:
					case INFIX:
					case EXTERNAL:
					case SUSPEND:
					case OVERRIDE:
					case ABSTRACT:
					case FINAL:
					case OPEN:
					case CONST:
					case LATEINIT:
					case VARARG:
					case NOINLINE:
					case CROSSINLINE:
					case REIFIED:
						{
						setState(2919);
						modifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2922); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,453,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassModifierContext classModifier() {
			return getRuleContext(ClassModifierContext.class,0);
		}
		public MemberModifierContext memberModifier() {
			return getRuleContext(MemberModifierContext.class,0);
		}
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
		}
		public VarianceAnnotationContext varianceAnnotation() {
			return getRuleContext(VarianceAnnotationContext.class,0);
		}
		public FunctionModifierContext functionModifier() {
			return getRuleContext(FunctionModifierContext.class,0);
		}
		public PropertyModifierContext propertyModifier() {
			return getRuleContext(PropertyModifierContext.class,0);
		}
		public InheritanceModifierContext inheritanceModifier() {
			return getRuleContext(InheritanceModifierContext.class,0);
		}
		public ParameterModifierContext parameterModifier() {
			return getRuleContext(ParameterModifierContext.class,0);
		}
		public TypeParameterModifierContext typeParameterModifier() {
			return getRuleContext(TypeParameterModifierContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_modifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2933);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
				{
				setState(2924);
				classModifier();
				}
				break;
			case OVERRIDE:
			case LATEINIT:
				{
				setState(2925);
				memberModifier();
				}
				break;
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
				{
				setState(2926);
				visibilityModifier();
				}
				break;
			case IN:
			case OUT:
				{
				setState(2927);
				varianceAnnotation();
				}
				break;
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
				{
				setState(2928);
				functionModifier();
				}
				break;
			case CONST:
				{
				setState(2929);
				propertyModifier();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case OPEN:
				{
				setState(2930);
				inheritanceModifier();
				}
				break;
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
				{
				setState(2931);
				parameterModifier();
				}
				break;
			case REIFIED:
				{
				setState(2932);
				typeParameterModifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2938);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,455,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2935);
					match(NL);
					}
					} 
				}
				setState(2940);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,455,_ctx);
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

	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(SarlParser.ENUM, 0); }
		public TerminalNode SEALED() { return getToken(SarlParser.SEALED, 0); }
		public TerminalNode ANNOTATION() { return getToken(SarlParser.ANNOTATION, 0); }
		public TerminalNode DATA() { return getToken(SarlParser.DATA, 0); }
		public TerminalNode INNER() { return getToken(SarlParser.INNER, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2941);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (ENUM - 108)) | (1L << (SEALED - 108)) | (1L << (ANNOTATION - 108)) | (1L << (DATA - 108)) | (1L << (INNER - 108)))) != 0)) ) {
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

	public static class MemberModifierContext extends ParserRuleContext {
		public TerminalNode OVERRIDE() { return getToken(SarlParser.OVERRIDE, 0); }
		public TerminalNode LATEINIT() { return getToken(SarlParser.LATEINIT, 0); }
		public MemberModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterMemberModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitMemberModifier(this);
		}
	}

	public final MemberModifierContext memberModifier() throws RecognitionException {
		MemberModifierContext _localctx = new MemberModifierContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2943);
			_la = _input.LA(1);
			if ( !(_la==OVERRIDE || _la==LATEINIT) ) {
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

	public static class VisibilityModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(SarlParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(SarlParser.PRIVATE, 0); }
		public TerminalNode INTERNAL() { return getToken(SarlParser.INTERNAL, 0); }
		public TerminalNode PROTECTED() { return getToken(SarlParser.PROTECTED, 0); }
		public VisibilityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilityModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterVisibilityModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitVisibilityModifier(this);
		}
	}

	public final VisibilityModifierContext visibilityModifier() throws RecognitionException {
		VisibilityModifierContext _localctx = new VisibilityModifierContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_visibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2945);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)))) != 0)) ) {
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

	public static class VarianceAnnotationContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(SarlParser.IN, 0); }
		public TerminalNode OUT() { return getToken(SarlParser.OUT, 0); }
		public VarianceAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varianceAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterVarianceAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitVarianceAnnotation(this);
		}
	}

	public final VarianceAnnotationContext varianceAnnotation() throws RecognitionException {
		VarianceAnnotationContext _localctx = new VarianceAnnotationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_varianceAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2947);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OUT) ) {
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

	public static class FunctionModifierContext extends ParserRuleContext {
		public TerminalNode TAILREC() { return getToken(SarlParser.TAILREC, 0); }
		public TerminalNode OPERATOR() { return getToken(SarlParser.OPERATOR, 0); }
		public TerminalNode INFIX() { return getToken(SarlParser.INFIX, 0); }
		public TerminalNode INLINE() { return getToken(SarlParser.INLINE, 0); }
		public TerminalNode EXTERNAL() { return getToken(SarlParser.EXTERNAL, 0); }
		public TerminalNode SUSPEND() { return getToken(SarlParser.SUSPEND, 0); }
		public FunctionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterFunctionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitFunctionModifier(this);
		}
	}

	public final FunctionModifierContext functionModifier() throws RecognitionException {
		FunctionModifierContext _localctx = new FunctionModifierContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2949);
			_la = _input.LA(1);
			if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (TAILREC - 113)) | (1L << (OPERATOR - 113)) | (1L << (INLINE - 113)) | (1L << (INFIX - 113)) | (1L << (EXTERNAL - 113)) | (1L << (SUSPEND - 113)))) != 0)) ) {
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

	public static class PropertyModifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SarlParser.CONST, 0); }
		public PropertyModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterPropertyModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitPropertyModifier(this);
		}
	}

	public final PropertyModifierContext propertyModifier() throws RecognitionException {
		PropertyModifierContext _localctx = new PropertyModifierContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_propertyModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2951);
			match(CONST);
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

	public static class InheritanceModifierContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(SarlParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(SarlParser.FINAL, 0); }
		public TerminalNode OPEN() { return getToken(SarlParser.OPEN, 0); }
		public InheritanceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterInheritanceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitInheritanceModifier(this);
		}
	}

	public final InheritanceModifierContext inheritanceModifier() throws RecognitionException {
		InheritanceModifierContext _localctx = new InheritanceModifierContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_inheritanceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2953);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (ABSTRACT - 120)) | (1L << (FINAL - 120)) | (1L << (OPEN - 120)))) != 0)) ) {
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

	public static class ParameterModifierContext extends ParserRuleContext {
		public TerminalNode VARARG() { return getToken(SarlParser.VARARG, 0); }
		public TerminalNode NOINLINE() { return getToken(SarlParser.NOINLINE, 0); }
		public TerminalNode CROSSINLINE() { return getToken(SarlParser.CROSSINLINE, 0); }
		public ParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitParameterModifier(this);
		}
	}

	public final ParameterModifierContext parameterModifier() throws RecognitionException {
		ParameterModifierContext _localctx = new ParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_parameterModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2955);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (VARARG - 125)) | (1L << (NOINLINE - 125)) | (1L << (CROSSINLINE - 125)))) != 0)) ) {
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

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public TerminalNode REIFIED() { return getToken(SarlParser.REIFIED, 0); }
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2957);
			match(REIFIED);
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

	public static class LabelDefinitionContext extends ParserRuleContext {
		public TerminalNode LabelDefinition() { return getToken(SarlParser.LabelDefinition, 0); }
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitLabelDefinition(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_labelDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2959);
			match(LabelDefinition);
			setState(2963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,456,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2960);
					match(NL);
					}
					} 
				}
				setState(2965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,456,_ctx);
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

	public static class AnnotationsContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,457,_ctx) ) {
			case 1:
				{
				setState(2966);
				annotation();
				}
				break;
			case 2:
				{
				setState(2967);
				annotationList();
				}
				break;
			}
			setState(2973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,458,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2970);
					match(NL);
					}
					} 
				}
				setState(2975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,458,_ctx);
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationUseSiteTargetContext annotationUseSiteTarget() {
			return getRuleContext(AnnotationUseSiteTargetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public UnescapedAnnotationContext unescapedAnnotation() {
			return getRuleContext(UnescapedAnnotationContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TerminalNode LabelReference() { return getToken(SarlParser.LabelReference, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_annotation);
		int _la;
		try {
			setState(3011);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2976);
				annotationUseSiteTarget();
				setState(2980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2977);
					match(NL);
					}
					}
					setState(2982);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2983);
				match(COLON);
				setState(2987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2984);
					match(NL);
					}
					}
					setState(2989);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2990);
				unescapedAnnotation();
				}
				break;
			case LabelReference:
				enterOuterAlt(_localctx, 2);
				{
				setState(2992);
				match(LabelReference);
				setState(3000);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,462,_ctx) ) {
				case 1:
					{
					setState(2996);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2993);
						match(NL);
						}
						}
						setState(2998);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2999);
					typeArguments();
					}
					break;
				}
				setState(3009);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,464,_ctx) ) {
				case 1:
					{
					setState(3005);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(3002);
						match(NL);
						}
						}
						setState(3007);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3008);
					valueArguments();
					}
					break;
				}
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

	public static class AnnotationListContext extends ParserRuleContext {
		public AnnotationUseSiteTargetContext annotationUseSiteTarget() {
			return getRuleContext(AnnotationUseSiteTargetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SarlParser.COLON, 0); }
		public TerminalNode LSQUARE() { return getToken(SarlParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(SarlParser.RSQUARE, 0); }
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public TerminalNode AT() { return getToken(SarlParser.AT, 0); }
		public AnnotationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAnnotationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAnnotationList(this);
		}
	}

	public final AnnotationListContext annotationList() throws RecognitionException {
		AnnotationListContext _localctx = new AnnotationListContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_annotationList);
		int _la;
		try {
			setState(3032);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3013);
				annotationUseSiteTarget();
				setState(3014);
				match(COLON);
				setState(3015);
				match(LSQUARE);
				setState(3017); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3016);
					unescapedAnnotation();
					}
					}
					setState(3019); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
				setState(3021);
				match(RSQUARE);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3023);
				match(AT);
				setState(3024);
				match(LSQUARE);
				setState(3026); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3025);
					unescapedAnnotation();
					}
					}
					setState(3028); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
				setState(3030);
				match(RSQUARE);
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

	public static class AnnotationUseSiteTargetContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SarlParser.FIELD, 0); }
		public TerminalNode FILE() { return getToken(SarlParser.FILE, 0); }
		public TerminalNode PROPERTY() { return getToken(SarlParser.PROPERTY, 0); }
		public TerminalNode GET() { return getToken(SarlParser.GET, 0); }
		public TerminalNode SET() { return getToken(SarlParser.SET, 0); }
		public TerminalNode RECEIVER() { return getToken(SarlParser.RECEIVER, 0); }
		public TerminalNode PARAM() { return getToken(SarlParser.PARAM, 0); }
		public TerminalNode SETPARAM() { return getToken(SarlParser.SETPARAM, 0); }
		public TerminalNode DELEGATE() { return getToken(SarlParser.DELEGATE, 0); }
		public AnnotationUseSiteTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationUseSiteTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAnnotationUseSiteTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAnnotationUseSiteTarget(this);
		}
	}

	public final AnnotationUseSiteTargetContext annotationUseSiteTarget() throws RecognitionException {
		AnnotationUseSiteTargetContext _localctx = new AnnotationUseSiteTargetContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_annotationUseSiteTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3034);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (FILE - 56)) | (1L << (FIELD - 56)) | (1L << (PROPERTY - 56)) | (1L << (GET - 56)) | (1L << (SET - 56)) | (1L << (RECEIVER - 56)) | (1L << (PARAM - 56)) | (1L << (SETPARAM - 56)) | (1L << (DELEGATE - 56)))) != 0)) ) {
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

	public static class UnescapedAnnotationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public UnescapedAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unescapedAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterUnescapedAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitUnescapedAnnotation(this);
		}
	}

	public final UnescapedAnnotationContext unescapedAnnotation() throws RecognitionException {
		UnescapedAnnotationContext _localctx = new UnescapedAnnotationContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_unescapedAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3036);
			identifier();
			setState(3038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(3037);
				typeArguments();
				}
			}

			setState(3041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,470,_ctx) ) {
			case 1:
				{
				setState(3040);
				valueArguments();
				}
				break;
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SarlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SarlParser.DOT, i);
		}
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3043);
			simpleIdentifier();
			setState(3054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,472,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3047);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(3044);
						match(NL);
						}
						}
						setState(3049);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3050);
					match(DOT);
					setState(3051);
					simpleIdentifier();
					}
					} 
				}
				setState(3056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,472,_ctx);
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

	public static class SimpleIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SarlParser.Identifier, 0); }
		public TerminalNode ABSTRACT() { return getToken(SarlParser.ABSTRACT, 0); }
		public TerminalNode ANNOTATION() { return getToken(SarlParser.ANNOTATION, 0); }
		public TerminalNode BY() { return getToken(SarlParser.BY, 0); }
		public TerminalNode CATCH() { return getToken(SarlParser.CATCH, 0); }
		public TerminalNode COMPANION() { return getToken(SarlParser.COMPANION, 0); }
		public TerminalNode CONSTRUCTOR() { return getToken(SarlParser.CONSTRUCTOR, 0); }
		public TerminalNode CROSSINLINE() { return getToken(SarlParser.CROSSINLINE, 0); }
		public TerminalNode DATA() { return getToken(SarlParser.DATA, 0); }
		public TerminalNode DYNAMIC() { return getToken(SarlParser.DYNAMIC, 0); }
		public TerminalNode ENUM() { return getToken(SarlParser.ENUM, 0); }
		public TerminalNode EXTERNAL() { return getToken(SarlParser.EXTERNAL, 0); }
		public TerminalNode FINAL() { return getToken(SarlParser.FINAL, 0); }
		public TerminalNode FINALLY() { return getToken(SarlParser.FINALLY, 0); }
		public TerminalNode GETTER() { return getToken(SarlParser.GETTER, 0); }
		public TerminalNode IMPORT() { return getToken(SarlParser.IMPORT, 0); }
		public TerminalNode INFIX() { return getToken(SarlParser.INFIX, 0); }
		public TerminalNode INIT() { return getToken(SarlParser.INIT, 0); }
		public TerminalNode INLINE() { return getToken(SarlParser.INLINE, 0); }
		public TerminalNode INNER() { return getToken(SarlParser.INNER, 0); }
		public TerminalNode INTERNAL() { return getToken(SarlParser.INTERNAL, 0); }
		public TerminalNode LATEINIT() { return getToken(SarlParser.LATEINIT, 0); }
		public TerminalNode NOINLINE() { return getToken(SarlParser.NOINLINE, 0); }
		public TerminalNode OPEN() { return getToken(SarlParser.OPEN, 0); }
		public TerminalNode OPERATOR() { return getToken(SarlParser.OPERATOR, 0); }
		public TerminalNode OUT() { return getToken(SarlParser.OUT, 0); }
		public TerminalNode OVERRIDE() { return getToken(SarlParser.OVERRIDE, 0); }
		public TerminalNode PRIVATE() { return getToken(SarlParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(SarlParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(SarlParser.PUBLIC, 0); }
		public TerminalNode REIFIED() { return getToken(SarlParser.REIFIED, 0); }
		public TerminalNode SEALED() { return getToken(SarlParser.SEALED, 0); }
		public TerminalNode TAILREC() { return getToken(SarlParser.TAILREC, 0); }
		public TerminalNode SETTER() { return getToken(SarlParser.SETTER, 0); }
		public TerminalNode VARARG() { return getToken(SarlParser.VARARG, 0); }
		public TerminalNode WHERE() { return getToken(SarlParser.WHERE, 0); }
		public TerminalNode CONST() { return getToken(SarlParser.CONST, 0); }
		public TerminalNode SUSPEND() { return getToken(SarlParser.SUSPEND, 0); }
		public SimpleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterSimpleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitSimpleIdentifier(this);
		}
	}

	public final SimpleIdentifierContext simpleIdentifier() throws RecognitionException {
		SimpleIdentifierContext _localctx = new SimpleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_simpleIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3057);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) ) {
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

	public static class SemiContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(SarlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SarlParser.NL, i);
		}
		public TerminalNode SEMICOLON() { return getToken(SarlParser.SEMICOLON, 0); }
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitSemi(this);
		}
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_semi);
		int _la;
		try {
			int _alt;
			setState(3077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,476,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3060); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3059);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3062); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,473,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(3064);
					match(NL);
					}
					}
					setState(3069);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3070);
				match(SEMICOLON);
				setState(3074);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,475,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3071);
						match(NL);
						}
						} 
					}
					setState(3076);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,475,_ctx);
				}
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

	public static class AnysemiContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SarlParser.NL, 0); }
		public TerminalNode SEMICOLON() { return getToken(SarlParser.SEMICOLON, 0); }
		public AnysemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anysemi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).enterAnysemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SarlParserListener ) ((SarlParserListener)listener).exitAnysemi(this);
		}
	}

	public final AnysemiContext anysemi() throws RecognitionException {
		AnysemiContext _localctx = new AnysemiContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_anysemi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3079);
			_la = _input.LA(1);
			if ( !(_la==NL || _la==SEMICOLON) ) {
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

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b5\u0c0c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\3\2\7\2\u013c\n\2\f\2\16\2\u013f\13\2"+
		"\3\2\3\2\7\2\u0143\n\2\f\2\16\2\u0146\13\2\3\2\3\2\6\2\u014a\n\2\r\2\16"+
		"\2\u014b\3\2\5\2\u014f\n\2\7\2\u0151\n\2\f\2\16\2\u0154\13\2\5\2\u0156"+
		"\n\2\3\2\3\2\3\3\5\3\u015b\n\3\3\3\3\3\3\3\3\4\6\4\u0161\n\4\r\4\16\4"+
		"\u0162\3\5\3\5\3\5\3\5\6\5\u0169\n\5\r\5\16\5\u016a\3\5\3\5\3\5\5\5\u0170"+
		"\n\5\3\5\5\5\u0173\n\5\6\5\u0175\n\5\r\5\16\5\u0176\3\6\5\6\u017a\n\6"+
		"\3\6\3\6\3\6\5\6\u017f\n\6\5\6\u0181\n\6\3\7\7\7\u0184\n\7\f\7\16\7\u0187"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u018e\n\b\3\b\5\b\u0191\n\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01a0\n\n\3\13\5\13\u01a3"+
		"\n\13\3\13\3\13\7\13\u01a7\n\13\f\13\16\13\u01aa\13\13\3\13\3\13\7\13"+
		"\u01ae\n\13\f\13\16\13\u01b1\13\13\3\13\5\13\u01b4\n\13\3\13\7\13\u01b7"+
		"\n\13\f\13\16\13\u01ba\13\13\3\13\5\13\u01bd\n\13\3\13\7\13\u01c0\n\13"+
		"\f\13\16\13\u01c3\13\13\3\13\3\13\7\13\u01c7\n\13\f\13\16\13\u01ca\13"+
		"\13\3\13\5\13\u01cd\n\13\3\13\7\13\u01d0\n\13\f\13\16\13\u01d3\13\13\3"+
		"\13\5\13\u01d6\n\13\3\13\7\13\u01d9\n\13\f\13\16\13\u01dc\13\13\3\13\3"+
		"\13\7\13\u01e0\n\13\f\13\16\13\u01e3\13\13\3\13\5\13\u01e6\n\13\3\f\5"+
		"\f\u01e9\n\f\3\f\3\f\7\f\u01ed\n\f\f\f\16\f\u01f0\13\f\3\f\3\f\7\f\u01f4"+
		"\n\f\f\f\16\f\u01f7\13\f\3\f\5\f\u01fa\n\f\3\f\7\f\u01fd\n\f\f\f\16\f"+
		"\u0200\13\f\3\f\5\f\u0203\n\f\3\f\7\f\u0206\n\f\f\f\16\f\u0209\13\f\3"+
		"\f\3\f\7\f\u020d\n\f\f\f\16\f\u0210\13\f\3\f\5\f\u0213\n\f\3\f\7\f\u0216"+
		"\n\f\f\f\16\f\u0219\13\f\3\f\5\f\u021c\n\f\3\f\7\f\u021f\n\f\f\f\16\f"+
		"\u0222\13\f\3\f\5\f\u0225\n\f\3\r\5\r\u0228\n\r\3\r\3\r\7\r\u022c\n\r"+
		"\f\r\16\r\u022f\13\r\3\r\3\r\7\r\u0233\n\r\f\r\16\r\u0236\13\r\3\r\5\r"+
		"\u0239\n\r\3\r\7\r\u023c\n\r\f\r\16\r\u023f\13\r\3\r\5\r\u0242\n\r\3\r"+
		"\7\r\u0245\n\r\f\r\16\r\u0248\13\r\3\r\3\r\7\r\u024c\n\r\f\r\16\r\u024f"+
		"\13\r\3\r\5\r\u0252\n\r\3\r\7\r\u0255\n\r\f\r\16\r\u0258\13\r\3\r\5\r"+
		"\u025b\n\r\3\r\7\r\u025e\n\r\f\r\16\r\u0261\13\r\3\r\5\r\u0264\n\r\3\16"+
		"\5\16\u0267\n\16\3\16\3\16\7\16\u026b\n\16\f\16\16\16\u026e\13\16\3\16"+
		"\3\16\7\16\u0272\n\16\f\16\16\16\u0275\13\16\3\16\5\16\u0278\n\16\3\16"+
		"\7\16\u027b\n\16\f\16\16\16\u027e\13\16\3\16\5\16\u0281\n\16\3\16\7\16"+
		"\u0284\n\16\f\16\16\16\u0287\13\16\3\16\3\16\7\16\u028b\n\16\f\16\16\16"+
		"\u028e\13\16\3\16\5\16\u0291\n\16\3\16\7\16\u0294\n\16\f\16\16\16\u0297"+
		"\13\16\3\16\5\16\u029a\n\16\3\16\7\16\u029d\n\16\f\16\16\16\u02a0\13\16"+
		"\3\16\3\16\7\16\u02a4\n\16\f\16\16\16\u02a7\13\16\3\16\5\16\u02aa\n\16"+
		"\3\17\5\17\u02ad\n\17\3\17\3\17\7\17\u02b1\n\17\f\17\16\17\u02b4\13\17"+
		"\3\17\3\17\7\17\u02b8\n\17\f\17\16\17\u02bb\13\17\3\17\5\17\u02be\n\17"+
		"\3\17\7\17\u02c1\n\17\f\17\16\17\u02c4\13\17\3\17\5\17\u02c7\n\17\3\17"+
		"\7\17\u02ca\n\17\f\17\16\17\u02cd\13\17\3\17\3\17\7\17\u02d1\n\17\f\17"+
		"\16\17\u02d4\13\17\3\17\5\17\u02d7\n\17\3\17\7\17\u02da\n\17\f\17\16\17"+
		"\u02dd\13\17\3\17\5\17\u02e0\n\17\3\17\7\17\u02e3\n\17\f\17\16\17\u02e6"+
		"\13\17\3\17\3\17\7\17\u02ea\n\17\f\17\16\17\u02ed\13\17\3\17\5\17\u02f0"+
		"\n\17\3\20\5\20\u02f3\n\20\3\20\3\20\7\20\u02f7\n\20\f\20\16\20\u02fa"+
		"\13\20\3\20\3\20\7\20\u02fe\n\20\f\20\16\20\u0301\13\20\3\20\5\20\u0304"+
		"\n\20\3\20\7\20\u0307\n\20\f\20\16\20\u030a\13\20\3\20\5\20\u030d\n\20"+
		"\3\20\7\20\u0310\n\20\f\20\16\20\u0313\13\20\3\20\3\20\7\20\u0317\n\20"+
		"\f\20\16\20\u031a\13\20\3\20\5\20\u031d\n\20\3\20\7\20\u0320\n\20\f\20"+
		"\16\20\u0323\13\20\3\20\5\20\u0326\n\20\3\20\7\20\u0329\n\20\f\20\16\20"+
		"\u032c\13\20\3\20\3\20\7\20\u0330\n\20\f\20\16\20\u0333\13\20\3\20\5\20"+
		"\u0336\n\20\3\21\5\21\u0339\n\21\3\21\3\21\7\21\u033d\n\21\f\21\16\21"+
		"\u0340\13\21\5\21\u0342\n\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u034a"+
		"\n\22\f\22\16\22\u034d\13\22\5\22\u034f\n\22\3\22\3\22\3\23\5\23\u0354"+
		"\n\23\3\23\5\23\u0357\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u035e\n\23\3"+
		"\24\7\24\u0361\n\24\f\24\16\24\u0364\13\24\3\24\3\24\7\24\u0368\n\24\f"+
		"\24\16\24\u036b\13\24\3\24\3\24\7\24\u036f\n\24\f\24\16\24\u0372\13\24"+
		"\3\24\7\24\u0375\n\24\f\24\16\24\u0378\13\24\3\25\3\25\3\25\5\25\u037d"+
		"\n\25\3\26\3\26\3\26\3\27\3\27\7\27\u0384\n\27\f\27\16\27\u0387\13\27"+
		"\3\27\3\27\7\27\u038b\n\27\f\27\16\27\u038e\13\27\3\27\3\27\3\30\3\30"+
		"\7\30\u0394\n\30\f\30\16\30\u0397\13\30\3\30\7\30\u039a\n\30\f\30\16\30"+
		"\u039d\13\30\3\30\7\30\u03a0\n\30\f\30\16\30\u03a3\13\30\3\30\3\30\3\31"+
		"\3\31\7\31\u03a9\n\31\f\31\16\31\u03ac\13\31\3\31\7\31\u03af\n\31\f\31"+
		"\16\31\u03b2\13\31\3\31\7\31\u03b5\n\31\f\31\16\31\u03b8\13\31\3\31\3"+
		"\31\3\32\3\32\7\32\u03be\n\32\f\32\16\32\u03c1\13\32\3\32\7\32\u03c4\n"+
		"\32\f\32\16\32\u03c7\13\32\3\32\7\32\u03ca\n\32\f\32\16\32\u03cd\13\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u03d9\n\33\3\33"+
		"\7\33\u03dc\n\33\f\33\16\33\u03df\13\33\3\34\3\34\3\34\5\34\u03e4\n\34"+
		"\3\34\7\34\u03e7\n\34\f\34\16\34\u03ea\13\34\3\35\3\35\3\35\5\35\u03ef"+
		"\n\35\3\35\7\35\u03f2\n\35\f\35\16\35\u03f5\13\35\3\36\3\36\7\36\u03f9"+
		"\n\36\f\36\16\36\u03fc\13\36\3\36\3\36\3\37\5\37\u0401\n\37\3\37\3\37"+
		"\7\37\u0405\n\37\f\37\16\37\u0408\13\37\3\37\3\37\7\37\u040c\n\37\f\37"+
		"\16\37\u040f\13\37\3\37\3\37\7\37\u0413\n\37\f\37\16\37\u0416\13\37\3"+
		"\37\5\37\u0419\n\37\3\37\7\37\u041c\n\37\f\37\16\37\u041f\13\37\3\37\3"+
		"\37\3 \3 \7 \u0425\n \f \16 \u0428\13 \3 \3 \3 \7 \u042d\n \f \16 \u0430"+
		"\13 \3 \5 \u0433\n \3!\3!\7!\u0437\n!\f!\16!\u043a\13!\3!\5!\u043d\n!"+
		"\3!\7!\u0440\n!\f!\16!\u0443\13!\3!\3!\7!\u0447\n!\f!\16!\u044a\13!\3"+
		"!\7!\u044d\n!\f!\16!\u0450\13!\5!\u0452\n!\3!\7!\u0455\n!\f!\16!\u0458"+
		"\13!\3!\3!\3\"\3\"\7\"\u045e\n\"\f\"\16\"\u0461\13\"\6\"\u0463\n\"\r\""+
		"\16\"\u0464\3\"\5\"\u0468\n\"\3#\3#\7#\u046c\n#\f#\16#\u046f\13#\3#\5"+
		"#\u0472\n#\3#\7#\u0475\n#\f#\16#\u0478\13#\3#\5#\u047b\n#\3#\7#\u047e"+
		"\n#\f#\16#\u0481\13#\3#\5#\u0484\n#\3$\5$\u0487\n$\3$\3$\7$\u048b\n$\f"+
		"$\16$\u048e\13$\3$\3$\7$\u0492\n$\f$\16$\u0495\13$\3$\3$\5$\u0499\n$\3"+
		"$\7$\u049c\n$\f$\16$\u049f\13$\3$\5$\u04a2\n$\3$\7$\u04a5\n$\f$\16$\u04a8"+
		"\13$\3$\5$\u04ab\n$\3$\7$\u04ae\n$\f$\16$\u04b1\13$\3$\3$\7$\u04b5\n$"+
		"\f$\16$\u04b8\13$\3$\3$\7$\u04bc\n$\f$\16$\u04bf\13$\3$\5$\u04c2\n$\3"+
		"$\7$\u04c5\n$\f$\16$\u04c8\13$\3$\5$\u04cb\n$\3$\7$\u04ce\n$\f$\16$\u04d1"+
		"\13$\3$\5$\u04d4\n$\3%\3%\3%\3%\7%\u04da\n%\f%\16%\u04dd\13%\5%\u04df"+
		"\n%\3%\3%\3&\5&\u04e4\n&\3&\3&\3&\5&\u04e9\n&\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\7(\u04f2\n(\f(\16(\u04f5\13(\3(\5(\u04f8\n(\3)\3)\7)\u04fc\n)\f)\16"+
		")\u04ff\13)\3)\5)\u0502\n)\3)\7)\u0505\n)\f)\16)\u0508\13)\3)\5)\u050b"+
		"\n)\3*\3*\7*\u050f\n*\f*\16*\u0512\13*\3*\3*\7*\u0516\n*\f*\16*\u0519"+
		"\13*\3*\3*\3*\7*\u051e\n*\f*\16*\u0521\13*\3*\7*\u0524\n*\f*\16*\u0527"+
		"\13*\3*\5*\u052a\n*\3+\5+\u052d\n+\3+\3+\7+\u0531\n+\f+\16+\u0534\13+"+
		"\3+\3+\7+\u0538\n+\f+\16+\u053b\13+\3+\5+\u053e\n+\3+\7+\u0541\n+\f+\16"+
		"+\u0544\13+\3+\3+\7+\u0548\n+\f+\16+\u054b\13+\3+\5+\u054e\n+\3+\7+\u0551"+
		"\n+\f+\16+\u0554\13+\3+\5+\u0557\n+\3,\5,\u055a\n,\3,\3,\7,\u055e\n,\f"+
		",\16,\u0561\13,\3,\5,\u0564\n,\3,\3,\7,\u0568\n,\f,\16,\u056b\13,\3,\5"+
		",\u056e\n,\3,\7,\u0571\n,\f,\16,\u0574\13,\3,\3,\7,\u0578\n,\f,\16,\u057b"+
		"\13,\3,\5,\u057e\n,\3,\7,\u0581\n,\f,\16,\u0584\13,\3,\5,\u0587\n,\3-"+
		"\5-\u058a\n-\3-\3-\7-\u058e\n-\f-\16-\u0591\13-\3-\5-\u0594\n-\3-\7-\u0597"+
		"\n-\f-\16-\u059a\13-\3-\3-\7-\u059e\n-\f-\16-\u05a1\13-\3-\3-\5-\u05a5"+
		"\n-\3-\7-\u05a8\n-\f-\16-\u05ab\13-\3-\3-\5-\u05af\n-\3-\7-\u05b2\n-\f"+
		"-\16-\u05b5\13-\3-\5-\u05b8\n-\3-\7-\u05bb\n-\f-\16-\u05be\13-\3-\3-\7"+
		"-\u05c2\n-\f-\16-\u05c5\13-\3-\5-\u05c8\n-\3-\3-\3-\3-\5-\u05ce\n-\3-"+
		"\3-\3-\3-\5-\u05d4\n-\5-\u05d6\n-\3.\3.\3.\3.\7.\u05dc\n.\f.\16.\u05df"+
		"\13.\3.\3.\3/\3/\3/\5/\u05e6\n/\3\60\5\60\u05e9\n\60\3\60\3\60\5\60\u05ed"+
		"\n\60\3\60\3\60\7\60\u05f1\n\60\f\60\16\60\u05f4\13\60\3\60\3\60\3\60"+
		"\7\60\u05f9\n\60\f\60\16\60\u05fc\13\60\3\60\3\60\7\60\u0600\n\60\f\60"+
		"\16\60\u0603\13\60\3\60\5\60\u0606\n\60\3\60\7\60\u0609\n\60\f\60\16\60"+
		"\u060c\13\60\3\60\3\60\3\60\7\60\u0611\n\60\f\60\16\60\u0614\13\60\3\60"+
		"\5\60\u0617\n\60\5\60\u0619\n\60\3\61\5\61\u061c\n\61\3\61\3\61\5\61\u0620"+
		"\n\61\3\61\3\61\7\61\u0624\n\61\f\61\16\61\u0627\13\61\3\61\3\61\3\61"+
		"\7\61\u062c\n\61\f\61\16\61\u062f\13\61\3\61\3\61\5\61\u0633\n\61\3\61"+
		"\3\61\7\61\u0637\n\61\f\61\16\61\u063a\13\61\3\61\3\61\5\61\u063e\n\61"+
		"\3\62\5\62\u0641\n\62\3\62\3\62\7\62\u0645\n\62\f\62\16\62\u0648\13\62"+
		"\3\62\3\62\7\62\u064c\n\62\f\62\16\62\u064f\13\62\3\62\5\62\u0652\n\62"+
		"\3\62\7\62\u0655\n\62\f\62\16\62\u0658\13\62\3\62\3\62\7\62\u065c\n\62"+
		"\f\62\16\62\u065f\13\62\3\62\3\62\3\63\3\63\7\63\u0665\n\63\f\63\16\63"+
		"\u0668\13\63\3\63\3\63\7\63\u066c\n\63\f\63\16\63\u066f\13\63\3\63\3\63"+
		"\7\63\u0673\n\63\f\63\16\63\u0676\13\63\3\63\7\63\u0679\n\63\f\63\16\63"+
		"\u067c\13\63\3\63\7\63\u067f\n\63\f\63\16\63\u0682\13\63\3\63\3\63\3\64"+
		"\5\64\u0687\n\64\3\64\7\64\u068a\n\64\f\64\16\64\u068d\13\64\3\64\3\64"+
		"\7\64\u0691\n\64\f\64\16\64\u0694\13\64\3\64\3\64\7\64\u0698\n\64\f\64"+
		"\16\64\u069b\13\64\3\64\5\64\u069e\n\64\3\65\5\65\u06a1\n\65\3\65\3\65"+
		"\3\65\3\65\5\65\u06a7\n\65\3\66\3\66\3\66\7\66\u06ac\n\66\f\66\16\66\u06af"+
		"\13\66\6\66\u06b1\n\66\r\66\16\66\u06b2\3\67\3\67\3\67\3\67\38\38\58\u06bb"+
		"\n8\38\78\u06be\n8\f8\168\u06c1\138\38\68\u06c4\n8\r8\168\u06c5\39\39"+
		"\39\39\39\39\59\u06ce\n9\3:\3:\7:\u06d2\n:\f:\16:\u06d5\13:\3:\3:\7:\u06d9"+
		"\n:\f:\16:\u06dc\13:\5:\u06de\n:\3:\3:\7:\u06e2\n:\f:\16:\u06e5\13:\3"+
		":\3:\7:\u06e9\n:\f:\16:\u06ec\13:\3:\3:\3;\3;\3;\5;\u06f3\n;\3<\3<\7<"+
		"\u06f7\n<\f<\16<\u06fa\13<\3<\3<\7<\u06fe\n<\f<\16<\u0701\13<\3<\7<\u0704"+
		"\n<\f<\16<\u0707\13<\3=\3=\7=\u070b\n=\f=\16=\u070e\13=\3=\5=\u0711\n"+
		"=\3>\3>\3>\5>\u0716\n>\3>\3>\3>\5>\u071b\n>\7>\u071d\n>\f>\16>\u0720\13"+
		">\3>\3>\3?\3?\7?\u0726\n?\f?\16?\u0729\13?\3?\3?\7?\u072d\n?\f?\16?\u0730"+
		"\13?\3?\3?\7?\u0734\n?\f?\16?\u0737\13?\3?\7?\u073a\n?\f?\16?\u073d\13"+
		"?\3@\7@\u0740\n@\f@\16@\u0743\13@\3@\3@\7@\u0747\n@\f@\16@\u074a\13@\3"+
		"@\3@\7@\u074e\n@\f@\16@\u0751\13@\3@\3@\3A\3A\3A\3A\3B\7B\u075a\nB\fB"+
		"\16B\u075d\13B\3B\3B\6B\u0761\nB\rB\16B\u0762\3B\5B\u0766\nB\7B\u0768"+
		"\nB\fB\16B\u076b\13B\5B\u076d\nB\3C\3C\5C\u0771\nC\3D\7D\u0774\nD\fD\16"+
		"D\u0777\13D\3D\7D\u077a\nD\fD\16D\u077d\13D\3D\3D\3E\7E\u0782\nE\fE\16"+
		"E\u0785\13E\3E\3E\3E\3E\5E\u078b\nE\3F\3F\3F\3F\7F\u0791\nF\fF\16F\u0794"+
		"\13F\3G\3G\7G\u0798\nG\fG\16G\u079b\13G\3G\3G\7G\u079f\nG\fG\16G\u07a2"+
		"\13G\3G\7G\u07a5\nG\fG\16G\u07a8\13G\3H\3H\7H\u07ac\nH\fH\16H\u07af\13"+
		"H\3H\3H\7H\u07b3\nH\fH\16H\u07b6\13H\3H\7H\u07b9\nH\fH\16H\u07bc\13H\3"+
		"I\3I\3I\7I\u07c1\nI\fI\16I\u07c4\13I\3I\3I\7I\u07c8\nI\fI\16I\u07cb\13"+
		"I\3J\3J\3J\7J\u07d0\nJ\fJ\16J\u07d3\13J\3J\3J\5J\u07d7\nJ\3K\3K\3K\7K"+
		"\u07dc\nK\fK\16K\u07df\13K\3K\3K\6K\u07e3\nK\rK\16K\u07e4\3K\3K\7K\u07e9"+
		"\nK\fK\16K\u07ec\13K\3K\3K\5K\u07f0\nK\3L\3L\7L\u07f4\nL\fL\16L\u07f7"+
		"\13L\3L\3L\7L\u07fb\nL\fL\16L\u07fe\13L\3L\7L\u0801\nL\fL\16L\u0804\13"+
		"L\3M\3M\3M\7M\u0809\nM\fM\16M\u080c\13M\3M\3M\7M\u0810\nM\fM\16M\u0813"+
		"\13M\3N\3N\3N\7N\u0818\nN\fN\16N\u081b\13N\3N\7N\u081e\nN\fN\16N\u0821"+
		"\13N\3O\3O\3O\7O\u0826\nO\fO\16O\u0829\13O\3O\3O\7O\u082d\nO\fO\16O\u0830"+
		"\13O\3P\3P\3P\7P\u0835\nP\fP\16P\u0838\13P\3P\3P\7P\u083c\nP\fP\16P\u083f"+
		"\13P\3Q\3Q\7Q\u0843\nQ\fQ\16Q\u0846\13Q\3Q\3Q\3Q\7Q\u084b\nQ\fQ\16Q\u084e"+
		"\13Q\3R\7R\u0851\nR\fR\16R\u0854\13R\3R\3R\3S\3S\5S\u085a\nS\3S\7S\u085d"+
		"\nS\fS\16S\u0860\13S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u086e\nT\3"+
		"U\3U\3U\3U\3V\3V\5V\u0876\nV\3V\7V\u0879\nV\fV\16V\u087c\13V\3V\3V\7V"+
		"\u0880\nV\fV\16V\u0883\13V\3V\6V\u0886\nV\rV\16V\u0887\5V\u088a\nV\3W"+
		"\7W\u088d\nW\fW\16W\u0890\13W\3W\5W\u0893\nW\3W\7W\u0896\nW\fW\16W\u0899"+
		"\13W\3W\3W\3X\3X\3X\3X\7X\u08a1\nX\fX\16X\u08a4\13X\5X\u08a6\nX\3X\3X"+
		"\3Y\3Y\3Y\3Y\7Y\u08ae\nY\fY\16Y\u08b1\13Y\5Y\u08b3\nY\3Y\3Y\3Z\3Z\7Z\u08b9"+
		"\nZ\fZ\16Z\u08bc\13Z\3Z\3Z\7Z\u08c0\nZ\fZ\16Z\u08c3\13Z\3Z\3Z\7Z\u08c7"+
		"\nZ\fZ\16Z\u08ca\13Z\3Z\7Z\u08cd\nZ\fZ\16Z\u08d0\13Z\3Z\3Z\3[\5[\u08d5"+
		"\n[\3[\3[\5[\u08d9\n[\3\\\6\\\u08dc\n\\\r\\\16\\\u08dd\3]\3]\7]\u08e2"+
		"\n]\f]\16]\u08e5\13]\3]\3]\7]\u08e9\n]\f]\16]\u08ec\13]\5]\u08ee\n]\3"+
		"]\5]\u08f1\n]\3]\7]\u08f4\n]\f]\16]\u08f7\13]\3]\3]\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\5^\u0904\n^\3_\3_\5_\u0908\n_\3`\3`\3`\7`\u090d\n`\f`\16`\u0910"+
		"\13`\3`\3`\3a\3a\3a\3a\3a\7a\u0919\na\fa\16a\u091c\13a\3a\3a\3b\3b\3c"+
		"\3c\3c\3c\3d\3d\3e\3e\3e\3e\3f\7f\u092d\nf\ff\16f\u0930\13f\3f\3f\7f\u0934"+
		"\nf\ff\16f\u0937\13f\3f\3f\7f\u093b\nf\ff\16f\u093e\13f\3f\3f\3f\3f\7"+
		"f\u0944\nf\ff\16f\u0947\13f\3f\3f\7f\u094b\nf\ff\16f\u094e\13f\3f\3f\7"+
		"f\u0952\nf\ff\16f\u0955\13f\3f\3f\7f\u0959\nf\ff\16f\u095c\13f\3f\3f\5"+
		"f\u0960\nf\3g\5g\u0963\ng\3g\7g\u0966\ng\fg\16g\u0969\13g\3g\3g\7g\u096d"+
		"\ng\fg\16g\u0970\13g\3g\7g\u0973\ng\fg\16g\u0976\13g\3h\3h\3h\7h\u097b"+
		"\nh\fh\16h\u097e\13h\3h\3h\7h\u0982\nh\fh\16h\u0985\13h\3h\5h\u0988\n"+
		"h\5h\u098a\nh\3i\3i\7i\u098e\ni\fi\16i\u0991\13i\3i\3i\7i\u0995\ni\fi"+
		"\16i\u0998\13i\3i\5i\u099b\ni\3i\7i\u099e\ni\fi\16i\u09a1\13i\3i\3i\3"+
		"j\3j\5j\u09a7\nj\3j\3j\7j\u09ab\nj\fj\16j\u09ae\13j\3j\3j\3k\3k\5k\u09b4"+
		"\nk\3l\3l\3l\7l\u09b9\nl\fl\16l\u09bc\13l\3l\3l\7l\u09c0\nl\fl\16l\u09c3"+
		"\13l\3l\3l\5l\u09c7\nl\3l\5l\u09ca\nl\3m\3m\5m\u09ce\nm\3n\3n\7n\u09d2"+
		"\nn\fn\16n\u09d5\13n\3n\3n\3n\3n\7n\u09db\nn\fn\16n\u09de\13n\3n\5n\u09e1"+
		"\nn\3n\5n\u09e4\nn\3n\7n\u09e7\nn\fn\16n\u09ea\13n\3n\3n\7n\u09ee\nn\f"+
		"n\16n\u09f1\13n\3n\5n\u09f4\nn\5n\u09f6\nn\3o\3o\5o\u09fa\no\3p\3p\7p"+
		"\u09fe\np\fp\16p\u0a01\13p\3p\3p\3p\3p\5p\u0a07\np\3p\7p\u0a0a\np\fp\16"+
		"p\u0a0d\13p\3p\3p\7p\u0a11\np\fp\16p\u0a14\13p\3p\3p\7p\u0a18\np\fp\16"+
		"p\u0a1b\13p\7p\u0a1d\np\fp\16p\u0a20\13p\3p\7p\u0a23\np\fp\16p\u0a26\13"+
		"p\3p\3p\3q\3q\7q\u0a2c\nq\fq\16q\u0a2f\13q\3q\3q\7q\u0a33\nq\fq\16q\u0a36"+
		"\13q\3q\7q\u0a39\nq\fq\16q\u0a3c\13q\3q\7q\u0a3f\nq\fq\16q\u0a42\13q\3"+
		"q\3q\7q\u0a46\nq\fq\16q\u0a49\13q\3q\3q\5q\u0a4d\nq\3q\3q\7q\u0a51\nq"+
		"\fq\16q\u0a54\13q\3q\3q\7q\u0a58\nq\fq\16q\u0a5b\13q\3q\5q\u0a5e\nq\3"+
		"r\3r\3r\5r\u0a63\nr\3s\3s\7s\u0a67\ns\fs\16s\u0a6a\13s\3s\3s\3t\3t\7t"+
		"\u0a70\nt\ft\16t\u0a73\13t\3t\3t\3u\3u\7u\u0a79\nu\fu\16u\u0a7c\13u\3"+
		"u\3u\7u\u0a80\nu\fu\16u\u0a83\13u\3u\7u\u0a86\nu\fu\16u\u0a89\13u\3u\7"+
		"u\u0a8c\nu\fu\16u\u0a8f\13u\3u\5u\u0a92\nu\3v\3v\7v\u0a96\nv\fv\16v\u0a99"+
		"\13v\3v\3v\7v\u0a9d\nv\fv\16v\u0aa0\13v\3v\3v\3v\3v\3v\7v\u0aa7\nv\fv"+
		"\16v\u0aaa\13v\3v\3v\3w\3w\7w\u0ab0\nw\fw\16w\u0ab3\13w\3w\3w\3x\3x\3"+
		"x\5x\u0aba\nx\3y\3y\7y\u0abe\ny\fy\16y\u0ac1\13y\3y\3y\7y\u0ac5\ny\fy"+
		"\16y\u0ac8\13y\3y\3y\5y\u0acc\ny\3y\3y\3y\3y\7y\u0ad2\ny\fy\16y\u0ad5"+
		"\13y\3y\5y\u0ad8\ny\3z\3z\7z\u0adc\nz\fz\16z\u0adf\13z\3z\3z\3z\3z\7z"+
		"\u0ae5\nz\fz\16z\u0ae8\13z\3z\5z\u0aeb\nz\3{\3{\7{\u0aef\n{\f{\16{\u0af2"+
		"\13{\3{\5{\u0af5\n{\3{\7{\u0af8\n{\f{\16{\u0afb\13{\3{\3{\7{\u0aff\n{"+
		"\f{\16{\u0b02\13{\3{\3{\3{\3{\3|\3|\7|\u0b0a\n|\f|\16|\u0b0d\13|\3|\3"+
		"|\3|\5|\u0b12\n|\3|\3|\3|\3|\5|\u0b18\n|\3}\3}\3}\7}\u0b1d\n}\f}\16}\u0b20"+
		"\13}\7}\u0b22\n}\f}\16}\u0b25\13}\5}\u0b27\n}\3}\7}\u0b2a\n}\f}\16}\u0b2d"+
		"\13}\3}\3}\7}\u0b31\n}\f}\16}\u0b34\13}\3}\3}\5}\u0b38\n}\3~\3~\3\177"+
		"\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u0b51\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\7\u0087\u0b5a\n\u0087\f\u0087\16\u0087\u0b5d"+
		"\13\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0b62\n\u0087\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u0b67\n\u0088\3\u0089\3\u0089\6\u0089\u0b6b\n\u0089\r"+
		"\u0089\16\u0089\u0b6c\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u0b78\n\u008a\3\u008a\7\u008a\u0b7b\n"+
		"\u008a\f\u008a\16\u008a\u0b7e\13\u008a\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094\7\u0094\u0b94"+
		"\n\u0094\f\u0094\16\u0094\u0b97\13\u0094\3\u0095\3\u0095\5\u0095\u0b9b"+
		"\n\u0095\3\u0095\7\u0095\u0b9e\n\u0095\f\u0095\16\u0095\u0ba1\13\u0095"+
		"\3\u0096\3\u0096\7\u0096\u0ba5\n\u0096\f\u0096\16\u0096\u0ba8\13\u0096"+
		"\3\u0096\3\u0096\7\u0096\u0bac\n\u0096\f\u0096\16\u0096\u0baf\13\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u0bb5\n\u0096\f\u0096\16\u0096"+
		"\u0bb8\13\u0096\3\u0096\5\u0096\u0bbb\n\u0096\3\u0096\7\u0096\u0bbe\n"+
		"\u0096\f\u0096\16\u0096\u0bc1\13\u0096\3\u0096\5\u0096\u0bc4\n\u0096\5"+
		"\u0096\u0bc6\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\6\u0097\u0bcc\n\u0097"+
		"\r\u0097\16\u0097\u0bcd\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\6\u0097"+
		"\u0bd5\n\u0097\r\u0097\16\u0097\u0bd6\3\u0097\3\u0097\5\u0097\u0bdb\n"+
		"\u0097\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099\u0be1\n\u0099\3\u0099\5"+
		"\u0099\u0be4\n\u0099\3\u009a\3\u009a\7\u009a\u0be8\n\u009a\f\u009a\16"+
		"\u009a\u0beb\13\u009a\3\u009a\3\u009a\7\u009a\u0bef\n\u009a\f\u009a\16"+
		"\u009a\u0bf2\13\u009a\3\u009b\3\u009b\3\u009c\6\u009c\u0bf7\n\u009c\r"+
		"\u009c\16\u009c\u0bf8\3\u009c\7\u009c\u0bfc\n\u009c\f\u009c\16\u009c\u0bff"+
		"\13\u009c\3\u009c\3\u009c\7\u009c\u0c03\n\u009c\f\u009c\16\u009c\u0c06"+
		"\13\u009c\5\u009c\u0c08\n\u009c\3\u009d\3\u009d\3\u009d\2\2\u009e\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\2\33\3\2=>\3\2AB\4\2\35\35EE\3\2\u00a6\u00a8\3\2\u00ac\u00ae\4"+
		"\2\67\67VV\3\2&\'\3\2\35\"\4\2\61\62\64\65\3\2-\60\4\2[[]]\4\2ZZ\\\\\3"+
		"\2\24\25\3\2\21\23\5\2\33\33\63\63YY\3\2nr\4\2yy~~\3\2jm\4\2[[^^\3\2s"+
		"x\3\2z|\3\2\177\u0081\5\2::_beh\n\2<<DGKKPQ^^cdi\u0082\u0096\u0096\4\2"+
		"\7\7\34\34\2\u0d95\2\u013d\3\2\2\2\4\u015a\3\2\2\2\6\u0160\3\2\2\2\b\u0174"+
		"\3\2\2\2\n\u0180\3\2\2\2\f\u0185\3\2\2\2\16\u0188\3\2\2\2\20\u0192\3\2"+
		"\2\2\22\u019f\3\2\2\2\24\u01a2\3\2\2\2\26\u01e8\3\2\2\2\30\u0227\3\2\2"+
		"\2\32\u0266\3\2\2\2\34\u02ac\3\2\2\2\36\u02f2\3\2\2\2 \u0338\3\2\2\2\""+
		"\u0345\3\2\2\2$\u0353\3\2\2\2&\u0362\3\2\2\2(\u037c\3\2\2\2*\u037e\3\2"+
		"\2\2,\u0381\3\2\2\2.\u0391\3\2\2\2\60\u03a6\3\2\2\2\62\u03bb\3\2\2\2\64"+
		"\u03d8\3\2\2\2\66\u03e3\3\2\2\28\u03ee\3\2\2\2:\u03f6\3\2\2\2<\u0400\3"+
		"\2\2\2>\u0432\3\2\2\2@\u0434\3\2\2\2B\u0462\3\2\2\2D\u0469\3\2\2\2F\u0486"+
		"\3\2\2\2H\u04d5\3\2\2\2J\u04e3\3\2\2\2L\u04ea\3\2\2\2N\u04f7\3\2\2\2P"+
		"\u04f9\3\2\2\2R\u050c\3\2\2\2T\u052c\3\2\2\2V\u0559\3\2\2\2X\u0589\3\2"+
		"\2\2Z\u05d7\3\2\2\2\\\u05e2\3\2\2\2^\u0618\3\2\2\2`\u063d\3\2\2\2b\u0640"+
		"\3\2\2\2d\u0662\3\2\2\2f\u0686\3\2\2\2h\u06a0\3\2\2\2j\u06b0\3\2\2\2l"+
		"\u06b4\3\2\2\2n\u06ba\3\2\2\2p\u06cd\3\2\2\2r\u06dd\3\2\2\2t\u06f2\3\2"+
		"\2\2v\u06f4\3\2\2\2x\u0708\3\2\2\2z\u0712\3\2\2\2|\u0723\3\2\2\2~\u0741"+
		"\3\2\2\2\u0080\u0754\3\2\2\2\u0082\u075b\3\2\2\2\u0084\u0770\3\2\2\2\u0086"+
		"\u0775\3\2\2\2\u0088\u0783\3\2\2\2\u008a\u078c\3\2\2\2\u008c\u0795\3\2"+
		"\2\2\u008e\u07a9\3\2\2\2\u0090\u07bd\3\2\2\2\u0092\u07cc\3\2\2\2\u0094"+
		"\u07d8\3\2\2\2\u0096\u07f1\3\2\2\2\u0098\u0805\3\2\2\2\u009a\u0814\3\2"+
		"\2\2\u009c\u0822\3\2\2\2\u009e\u0831\3\2\2\2\u00a0\u0840\3\2\2\2\u00a2"+
		"\u0852\3\2\2\2\u00a4\u0859\3\2\2\2\u00a6\u086d\3\2\2\2\u00a8\u086f\3\2"+
		"\2\2\u00aa\u0889\3\2\2\2\u00ac\u088e\3\2\2\2\u00ae\u089c\3\2\2\2\u00b0"+
		"\u08a9\3\2\2\2\u00b2\u08b6\3\2\2\2\u00b4\u08d8\3\2\2\2\u00b6\u08db\3\2"+
		"\2\2\u00b8\u08ed\3\2\2\2\u00ba\u0903\3\2\2\2\u00bc\u0907\3\2\2\2\u00be"+
		"\u0909\3\2\2\2\u00c0\u0913\3\2\2\2\u00c2\u091f\3\2\2\2\u00c4\u0921\3\2"+
		"\2\2\u00c6\u0925\3\2\2\2\u00c8\u0927\3\2\2\2\u00ca\u092e\3\2\2\2\u00cc"+
		"\u0962\3\2\2\2\u00ce\u0989\3\2\2\2\u00d0\u098b\3\2\2\2\u00d2\u09a4\3\2"+
		"\2\2\u00d4\u09b1\3\2\2\2\u00d6\u09b5\3\2\2\2\u00d8\u09cd\3\2\2\2\u00da"+
		"\u09cf\3\2\2\2\u00dc\u09f9\3\2\2\2\u00de\u09fb\3\2\2\2\u00e0\u0a5d\3\2"+
		"\2\2\u00e2\u0a62\3\2\2\2\u00e4\u0a64\3\2\2\2\u00e6\u0a6d\3\2\2\2\u00e8"+
		"\u0a76\3\2\2\2\u00ea\u0a93\3\2\2\2\u00ec\u0aad\3\2\2\2\u00ee\u0ab9\3\2"+
		"\2\2\u00f0\u0abb\3\2\2\2\u00f2\u0ad9\3\2\2\2\u00f4\u0aec\3\2\2\2\u00f6"+
		"\u0b17\3\2\2\2\u00f8\u0b26\3\2\2\2\u00fa\u0b39\3\2\2\2\u00fc\u0b3b\3\2"+
		"\2\2\u00fe\u0b3d\3\2\2\2\u0100\u0b3f\3\2\2\2\u0102\u0b41\3\2\2\2\u0104"+
		"\u0b43\3\2\2\2\u0106\u0b45\3\2\2\2\u0108\u0b47\3\2\2\2\u010a\u0b50\3\2"+
		"\2\2\u010c\u0b61\3\2\2\2\u010e\u0b66\3\2\2\2\u0110\u0b6a\3\2\2\2\u0112"+
		"\u0b77\3\2\2\2\u0114\u0b7f\3\2\2\2\u0116\u0b81\3\2\2\2\u0118\u0b83\3\2"+
		"\2\2\u011a\u0b85\3\2\2\2\u011c\u0b87\3\2\2\2\u011e\u0b89\3\2\2\2\u0120"+
		"\u0b8b\3\2\2\2\u0122\u0b8d\3\2\2\2\u0124\u0b8f\3\2\2\2\u0126\u0b91\3\2"+
		"\2\2\u0128\u0b9a\3\2\2\2\u012a\u0bc5\3\2\2\2\u012c\u0bda\3\2\2\2\u012e"+
		"\u0bdc\3\2\2\2\u0130\u0bde\3\2\2\2\u0132\u0be5\3\2\2\2\u0134\u0bf3\3\2"+
		"\2\2\u0136\u0c07\3\2\2\2\u0138\u0c09\3\2\2\2\u013a\u013c\7\7\2\2\u013b"+
		"\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0144\5\4\3\2\u0141"+
		"\u0143\5\u0138\u009d\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0155\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0152\5\22\n\2\u0148\u014a\5\u0138\u009d\2\u0149\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2"+
		"\2\2\u014d\u014f\5\22\n\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u0149\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0147\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7\2"+
		"\2\3\u0158\3\3\2\2\2\u0159\u015b\5\6\4\2\u015a\u0159\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\5\n\6\2\u015d\u015e\5\f\7\2\u015e"+
		"\5\3\2\2\2\u015f\u0161\5\b\5\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2"+
		"\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\7\3\2\2\2\u0164\u0165\7"+
		":\2\2\u0165\u016f\7\33\2\2\u0166\u0168\7\r\2\2\u0167\u0169\5\u0130\u0099"+
		"\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7\16\2\2\u016d\u0170\3\2\2\2"+
		"\u016e\u0170\5\u0130\u0099\2\u016f\u0166\3\2\2\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u0173\5\u0136\u009c\2\u0172\u0171\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0164\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\t\3\2\2\2\u0178\u017a\5\u0110"+
		"\u0089\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017c\7;\2\2\u017c\u017e\5\u0132\u009a\2\u017d\u017f\5\u0136\u009c\2"+
		"\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u0179"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\13\3\2\2\2\u0182\u0184\5\16\b\2\u0183"+
		"\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\r\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7<\2\2\u0189\u018d"+
		"\5\u0132\u009a\2\u018a\u018b\7\t\2\2\u018b\u018e\7\21\2\2\u018c\u018e"+
		"\5\20\t\2\u018d\u018a\3\2\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2"+
		"\u018e\u0190\3\2\2\2\u018f\u0191\5\u0136\u009c\2\u0190\u018f\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\17\3\2\2\2\u0192\u0193\7Y\2\2\u0193\u0194\5\u0134"+
		"\u009b\2\u0194\21\3\2\2\2\u0195\u01a0\5\24\13\2\u0196\u01a0\5T+\2\u0197"+
		"\u01a0\5F$\2\u0198\u01a0\5X-\2\u0199\u01a0\5b\62\2\u019a\u01a0\5\26\f"+
		"\2\u019b\u01a0\5\30\r\2\u019c\u01a0\5\32\16\2\u019d\u01a0\5\34\17\2\u019e"+
		"\u01a0\5\36\20\2\u019f\u0195\3\2\2\2\u019f\u0196\3\2\2\2\u019f\u0197\3"+
		"\2\2\2\u019f\u0198\3\2\2\2\u019f\u0199\3\2\2\2\u019f\u019a\3\2\2\2\u019f"+
		"\u019b\3\2\2\2\u019f\u019c\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2"+
		"\2\2\u01a0\23\3\2\2\2\u01a1\u01a3\5\u0110\u0089\2\u01a2\u01a1\3\2\2\2"+
		"\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a8\t\2\2\2\u01a5\u01a7"+
		"\7\7\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01b3\5\u0134"+
		"\u009b\2\u01ac\u01ae\7\7\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b2\u01b4\5d\63\2\u01b3\u01af\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01bc\3\2\2\2\u01b5\u01b7\7\7\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01bd\5 \21\2\u01bc\u01b8\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01cc\3\2\2\2\u01be\u01c0\7\7\2\2\u01bf\u01be\3\2\2\2\u01c0"+
		"\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2"+
		"\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c8\7\33\2\2\u01c5\u01c7\7\7\2\2\u01c6"+
		"\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cd\5&\24\2\u01cc"+
		"\u01c1\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d5\3\2\2\2\u01ce\u01d0\7\7"+
		"\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d6\5|"+
		"?\2\u01d5\u01d1\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01e5\3\2\2\2\u01d7"+
		"\u01d9\7\7\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd"+
		"\u01e6\5.\30\2\u01de\u01e0\7\7\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2"+
		"\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01e6\5@!\2\u01e5\u01da\3\2\2\2\u01e5\u01e1\3\2\2"+
		"\2\u01e5\u01e6\3\2\2\2\u01e6\25\3\2\2\2\u01e7\u01e9\5\u0110\u0089\2\u01e8"+
		"\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ee\7\u0083"+
		"\2\2\u01eb\u01ed\7\7\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f1\u01f9\5\u0134\u009b\2\u01f2\u01f4\7\7\2\2\u01f3\u01f2\3\2\2"+
		"\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fa\5d\63\2\u01f9\u01f5\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u0202\3\2\2\2\u01fb\u01fd\7\7\2\2\u01fc\u01fb\3\2"+
		"\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0203\5 \21\2\u0202\u01fe\3\2"+
		"\2\2\u0202\u0203\3\2\2\2\u0203\u0212\3\2\2\2\u0204\u0206\7\7\2\2\u0205"+
		"\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020e\7\33\2\2\u020b"+
		"\u020d\7\7\2\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2"+
		"\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0213\5&\24\2\u0212\u0207\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u021b\3\2"+
		"\2\2\u0214\u0216\7\7\2\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217"+
		"\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2"+
		"\2\2\u021a\u021c\5|?\2\u021b\u0217\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u0224"+
		"\3\2\2\2\u021d\u021f\7\7\2\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2"+
		"\2\2\u0223\u0225\5\60\31\2\u0224\u0220\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\27\3\2\2\2\u0226\u0228\5\u0110\u0089\2\u0227\u0226\3\2\2\2\u0227\u0228"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022d\7\u0084\2\2\u022a\u022c\7\7\2"+
		"\2\u022b\u022a\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0238\5\u0134\u009b"+
		"\2\u0231\u0233\7\7\2\2\u0232\u0231\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237"+
		"\u0239\5d\63\2\u0238\u0234\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0241\3\2"+
		"\2\2\u023a\u023c\7\7\2\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\u0240\u0242\5 \21\2\u0241\u023d\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0251\3\2\2\2\u0243\u0245\7\7\2\2\u0244\u0243\3\2\2\2\u0245\u0248\3\2"+
		"\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0249\u024d\7\33\2\2\u024a\u024c\7\7\2\2\u024b\u024a\3"+
		"\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u0250\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0252\5&\24\2\u0251\u0246\3\2"+
		"\2\2\u0251\u0252\3\2\2\2\u0252\u025a\3\2\2\2\u0253\u0255\7\7\2\2\u0254"+
		"\u0253\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2"+
		"\2\2\u0257\u0259\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025b\5|?\2\u025a\u0256"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0263\3\2\2\2\u025c\u025e\7\7\2\2\u025d"+
		"\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2"+
		"\2\2\u0260\u0262\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0264\5\62\32\2\u0263"+
		"\u025f\3\2\2\2\u0263\u0264\3\2\2\2\u0264\31\3\2\2\2\u0265\u0267\5\u0110"+
		"\u0089\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u026c\7\u0085\2\2\u0269\u026b\7\7\2\2\u026a\u0269\3\2\2\2\u026b\u026e"+
		"\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026f\u0277\5\u0134\u009b\2\u0270\u0272\7\7\2\2\u0271\u0270"+
		"\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0276\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0278\5d\63\2\u0277\u0273\3\2"+
		"\2\2\u0277\u0278\3\2\2\2\u0278\u0280\3\2\2\2\u0279\u027b\7\7\2\2\u027a"+
		"\u0279\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2"+
		"\2\2\u027d\u027f\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0281\5 \21\2\u0280"+
		"\u027c\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0290\3\2\2\2\u0282\u0284\7\7"+
		"\2\2\u0283\u0282\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028c\7\33"+
		"\2\2\u0289\u028b\7\7\2\2\u028a\u0289\3\2\2\2\u028b\u028e\3\2\2\2\u028c"+
		"\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u028c\3\2"+
		"\2\2\u028f\u0291\5&\24\2\u0290\u0285\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0299\3\2\2\2\u0292\u0294\7\7\2\2\u0293\u0292\3\2\2\2\u0294\u0297\3\2"+
		"\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2\2\2\u0297"+
		"\u0295\3\2\2\2\u0298\u029a\5|?\2\u0299\u0295\3\2\2\2\u0299\u029a\3\2\2"+
		"\2\u029a\u02a9\3\2\2\2\u029b\u029d\7\7\2\2\u029c\u029b\3\2\2\2\u029d\u02a0"+
		"\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a1\u02aa\5.\30\2\u02a2\u02a4\7\7\2\2\u02a3\u02a2\3\2"+
		"\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02aa\5@!\2\u02a9\u029e\3\2\2"+
		"\2\u02a9\u02a5\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\33\3\2\2\2\u02ab\u02ad"+
		"\5\u0110\u0089\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3"+
		"\2\2\2\u02ae\u02b2\7\u0086\2\2\u02af\u02b1\7\7\2\2\u02b0\u02af\3\2\2\2"+
		"\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5"+
		"\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02bd\5\u0134\u009b\2\u02b6\u02b8\7"+
		"\7\2\2\u02b7\u02b6\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02be\5d"+
		"\63\2\u02bd\u02b9\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c6\3\2\2\2\u02bf"+
		"\u02c1\7\7\2\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2"+
		"\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5"+
		"\u02c7\5 \21\2\u02c6\u02c2\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02d6\3\2"+
		"\2\2\u02c8\u02ca\7\7\2\2\u02c9\u02c8\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb"+
		"\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02cb\3\2"+
		"\2\2\u02ce\u02d2\7\33\2\2\u02cf\u02d1\7\7\2\2\u02d0\u02cf\3\2\2\2\u02d1"+
		"\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2"+
		"\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d7\5&\24\2\u02d6\u02cb\3\2\2\2\u02d6"+
		"\u02d7\3\2\2\2\u02d7\u02df\3\2\2\2\u02d8\u02da\7\7\2\2\u02d9\u02d8\3\2"+
		"\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02de\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02e0\5|?\2\u02df\u02db\3\2\2"+
		"\2\u02df\u02e0\3\2\2\2\u02e0\u02ef\3\2\2\2\u02e1\u02e3\7\7\2\2\u02e2\u02e1"+
		"\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e7\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02f0\5.\30\2\u02e8\u02ea\7\7"+
		"\2\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02f0\5@"+
		"!\2\u02ef\u02e4\3\2\2\2\u02ef\u02eb\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\35\3\2\2\2\u02f1\u02f3\5\u0110\u0089\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f8\7\u0087\2\2\u02f5\u02f7\7\7\2"+
		"\2\u02f6\u02f5\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9"+
		"\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u0303\5\u0134\u009b"+
		"\2\u02fc\u02fe\7\7\2\2\u02fd\u02fc\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u02ff\3\2\2\2\u0302"+
		"\u0304\5d\63\2\u0303\u02ff\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u030c\3\2"+
		"\2\2\u0305\u0307\7\7\2\2\u0306\u0305\3\2\2\2\u0307\u030a\3\2\2\2\u0308"+
		"\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0308\3\2"+
		"\2\2\u030b\u030d\5 \21\2\u030c\u0308\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u031c\3\2\2\2\u030e\u0310\7\7\2\2\u030f\u030e\3\2\2\2\u0310\u0313\3\2"+
		"\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313"+
		"\u0311\3\2\2\2\u0314\u0318\7\33\2\2\u0315\u0317\7\7\2\2\u0316\u0315\3"+
		"\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031b\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u031d\5&\24\2\u031c\u0311\3\2"+
		"\2\2\u031c\u031d\3\2\2\2\u031d\u0325\3\2\2\2\u031e\u0320\7\7\2\2\u031f"+
		"\u031e\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u0324\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0326\5|?\2\u0325\u0321"+
		"\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0335\3\2\2\2\u0327\u0329\7\7\2\2\u0328"+
		"\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2"+
		"\2\2\u032b\u032d\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u0336\5.\30\2\u032e"+
		"\u0330\7\7\2\2\u032f\u032e\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2"+
		"\2\2\u0331\u0332\3\2\2\2\u0332\u0334\3\2\2\2\u0333\u0331\3\2\2\2\u0334"+
		"\u0336\5@!\2\u0335\u032a\3\2\2\2\u0335\u0331\3\2\2\2\u0335\u0336\3\2\2"+
		"\2\u0336\37\3\2\2\2\u0337\u0339\5\u0110\u0089\2\u0338\u0337\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u0341\3\2\2\2\u033a\u033e\7D\2\2\u033b\u033d\7\7"+
		"\2\2\u033c\u033b\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e"+
		"\u033f\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u033a\3\2"+
		"\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\5\"\22\2\u0344"+
		"!\3\2\2\2\u0345\u034e\7\13\2\2\u0346\u034b\5$\23\2\u0347\u0348\7\n\2\2"+
		"\u0348\u034a\5$\23\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349"+
		"\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034e"+
		"\u0346\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\7\f"+
		"\2\2\u0351#\3\2\2\2\u0352\u0354\5\u0110\u0089\2\u0353\u0352\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u0357\t\3\2\2\u0356\u0355\3\2"+
		"\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\5\u0134\u009b"+
		"\2\u0359\u035a\7\33\2\2\u035a\u035d\5h\65\2\u035b\u035c\7\35\2\2\u035c"+
		"\u035e\5\u008aF\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e%\3\2\2"+
		"\2\u035f\u0361\5\u0128\u0095\2\u0360\u035f\3\2\2\2\u0361\u0364\3\2\2\2"+
		"\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365\3\2\2\2\u0364\u0362"+
		"\3\2\2\2\u0365\u0376\5(\25\2\u0366\u0368\7\7\2\2\u0367\u0366\3\2\2\2\u0368"+
		"\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\3\2"+
		"\2\2\u036b\u0369\3\2\2\2\u036c\u0370\7\n\2\2\u036d\u036f\7\7\2\2\u036e"+
		"\u036d\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2"+
		"\2\2\u0371\u0373\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0375\5(\25\2\u0374"+
		"\u0369\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2"+
		"\2\2\u0377\'\3\2\2\2\u0378\u0376\3\2\2\2\u0379\u037d\5*\26\2\u037a\u037d"+
		"\5v<\2\u037b\u037d\5,\27\2\u037c\u0379\3\2\2\2\u037c\u037a\3\2\2\2\u037c"+
		"\u037b\3\2\2\2\u037d)\3\2\2\2\u037e\u037f\5v<\2\u037f\u0380\5\u00aaV\2"+
		"\u0380+\3\2\2\2\u0381\u0385\5v<\2\u0382\u0384\7\7\2\2\u0383\u0382\3\2"+
		"\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0388\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u038c\7E\2\2\u0389\u038b\7\7"+
		"\2\2\u038a\u0389\3\2\2\2\u038b\u038e\3\2\2\2\u038c\u038a\3\2\2\2\u038c"+
		"\u038d\3\2\2\2\u038d\u038f\3\2\2\2\u038e\u038c\3\2\2\2\u038f\u0390\5\u008a"+
		"F\2\u0390-\3\2\2\2\u0391\u0395\7\17\2\2\u0392\u0394\7\7\2\2\u0393\u0392"+
		"\3\2\2\2\u0394\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
		"\u039b\3\2\2\2\u0397\u0395\3\2\2\2\u0398\u039a\5\64\33\2\u0399\u0398\3"+
		"\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u03a1\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u03a0\7\7\2\2\u039f\u039e\3\2"+
		"\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a4\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4\u03a5\7\20\2\2\u03a5/\3\2\2\2"+
		"\u03a6\u03aa\7\17\2\2\u03a7\u03a9\7\7\2\2\u03a8\u03a7\3\2\2\2\u03a9\u03ac"+
		"\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03b0\3\2\2\2\u03ac"+
		"\u03aa\3\2\2\2\u03ad\u03af\5\66\34\2\u03ae\u03ad\3\2\2\2\u03af\u03b2\3"+
		"\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b6\3\2\2\2\u03b2"+
		"\u03b0\3\2\2\2\u03b3\u03b5\7\7\2\2\u03b4\u03b3\3\2\2\2\u03b5\u03b8\3\2"+
		"\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b9\3\2\2\2\u03b8"+
		"\u03b6\3\2\2\2\u03b9\u03ba\7\20\2\2\u03ba\61\3\2\2\2\u03bb\u03bf\7\17"+
		"\2\2\u03bc\u03be\7\7\2\2\u03bd\u03bc\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf"+
		"\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c5\3\2\2\2\u03c1\u03bf\3\2"+
		"\2\2\u03c2\u03c4\58\35\2\u03c3\u03c2\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03cb\3\2\2\2\u03c7\u03c5\3\2"+
		"\2\2\u03c8\u03ca\7\7\2\2\u03c9\u03c8\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb"+
		"\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03cb\3\2"+
		"\2\2\u03ce\u03cf\7\20\2\2\u03cf\63\3\2\2\2\u03d0\u03d9\5\24\13\2\u03d1"+
		"\u03d9\5F$\2\u03d2\u03d9\5T+\2\u03d3\u03d9\5V,\2\u03d4\u03d9\5X-\2\u03d5"+
		"\u03d9\5:\36\2\u03d6\u03d9\5<\37\2\u03d7\u03d9\5b\62\2\u03d8\u03d0\3\2"+
		"\2\2\u03d8\u03d1\3\2\2\2\u03d8\u03d2\3\2\2\2\u03d8\u03d3\3\2\2\2\u03d8"+
		"\u03d4\3\2\2\2\u03d8\u03d5\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d7\3\2"+
		"\2\2\u03d9\u03dd\3\2\2\2\u03da\u03dc\5\u0138\u009d\2\u03db\u03da\3\2\2"+
		"\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\65"+
		"\3\2\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e4\5\64\33\2\u03e1\u03e4\5R*\2\u03e2"+
		"\u03e4\5P)\2\u03e3\u03e0\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e2\3\2\2"+
		"\2\u03e4\u03e8\3\2\2\2\u03e5\u03e7\5\u0138\u009d\2\u03e6\u03e5\3\2\2\2"+
		"\u03e7\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\67"+
		"\3\2\2\2\u03ea\u03e8\3\2\2\2\u03eb\u03ef\5\64\33\2\u03ec\u03ef\5R*\2\u03ed"+
		"\u03ef\5P)\2\u03ee\u03eb\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ed\3\2\2"+
		"\2\u03ef\u03f3\3\2\2\2\u03f0\u03f2\5\u0138\u009d\2\u03f1\u03f0\3\2\2\2"+
		"\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f49\3"+
		"\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03fa\7G\2\2\u03f7\u03f9\7\7\2\2\u03f8"+
		"\u03f7\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2"+
		"\2\2\u03fb\u03fd\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u03fe\5\u0080A\2\u03fe"+
		";\3\2\2\2\u03ff\u0401\5\u0110\u0089\2\u0400\u03ff\3\2\2\2\u0400\u0401"+
		"\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0406\7D\2\2\u0403\u0405\7\7\2\2\u0404"+
		"\u0403\3\2\2\2\u0405\u0408\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2"+
		"\2\2\u0407\u0409\3\2\2\2\u0408\u0406\3\2\2\2\u0409\u0418\5H%\2\u040a\u040c"+
		"\7\7\2\2\u040b\u040a\3\2\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d"+
		"\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0414\7\33"+
		"\2\2\u0411\u0413\7\7\2\2\u0412\u0411\3\2\2\2\u0413\u0416\3\2\2\2\u0414"+
		"\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\3\2\2\2\u0416\u0414\3\2"+
		"\2\2\u0417\u0419\5> \2\u0418\u040d\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041d"+
		"\3\2\2\2\u041a\u041c\7\7\2\2\u041b\u041a\3\2\2\2\u041c\u041f\3\2\2\2\u041d"+
		"\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0420\3\2\2\2\u041f\u041d\3\2"+
		"\2\2\u0420\u0421\5\u0080A\2\u0421=\3\2\2\2\u0422\u0426\7H\2\2\u0423\u0425"+
		"\7\7\2\2\u0424\u0423\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0426"+
		"\u0427\3\2\2\2\u0427\u0429\3\2\2\2\u0428\u0426\3\2\2\2\u0429\u0433\5\u00b0"+
		"Y\2\u042a\u042e\7I\2\2\u042b\u042d\7\7\2\2\u042c\u042b\3\2\2\2\u042d\u0430"+
		"\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0431\3\2\2\2\u0430"+
		"\u042e\3\2\2\2\u0431\u0433\5\u00b0Y\2\u0432\u0422\3\2\2\2\u0432\u042a"+
		"\3\2\2\2\u0433?\3\2\2\2\u0434\u0438\7\17\2\2\u0435\u0437\7\7\2\2\u0436"+
		"\u0435\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2"+
		"\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u043d\5B\"\2\u043c"+
		"\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u0451\3\2\2\2\u043e\u0440\7\7"+
		"\2\2\u043f\u043e\3\2\2\2\u0440\u0443\3\2\2\2\u0441\u043f\3\2\2\2\u0441"+
		"\u0442\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u0441\3\2\2\2\u0444\u0448\7\34"+
		"\2\2\u0445\u0447\7\7\2\2\u0446\u0445\3\2\2\2\u0447\u044a\3\2\2\2\u0448"+
		"\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044e\3\2\2\2\u044a\u0448\3\2"+
		"\2\2\u044b\u044d\5\64\33\2\u044c\u044b\3\2\2\2\u044d\u0450\3\2\2\2\u044e"+
		"\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2"+
		"\2\2\u0451\u0441\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0456\3\2\2\2\u0453"+
		"\u0455\7\7\2\2\u0454\u0453\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0454\3\2"+
		"\2\2\u0456\u0457\3\2\2\2\u0457\u0459\3\2\2\2\u0458\u0456\3\2\2\2\u0459"+
		"\u045a\7\20\2\2\u045aA\3\2\2\2\u045b\u045f\5D#\2\u045c\u045e\7\7\2\2\u045d"+
		"\u045c\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2"+
		"\2\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u045b\3\2\2\2\u0463"+
		"\u0464\3\2\2\2\u0464\u0462\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0467\3\2"+
		"\2\2\u0466\u0468\7\34\2\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468"+
		"C\3\2\2\2\u0469\u0471\5\u0134\u009b\2\u046a\u046c\7\7\2\2\u046b\u046a"+
		"\3\2\2\2\u046c\u046f\3\2\2\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e"+
		"\u0470\3\2\2\2\u046f\u046d\3\2\2\2\u0470\u0472\5\u00b0Y\2\u0471\u046d"+
		"\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u047a\3\2\2\2\u0473\u0475\7\7\2\2\u0474"+
		"\u0473\3\2\2\2\u0475\u0478\3\2\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2"+
		"\2\2\u0477\u0479\3\2\2\2\u0478\u0476\3\2\2\2\u0479\u047b\5.\30\2\u047a"+
		"\u0476\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u0483\3\2\2\2\u047c\u047e\7\7"+
		"\2\2\u047d\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f"+
		"\u0480\3\2\2\2\u0480\u0482\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0484\7\n"+
		"\2\2\u0483\u047f\3\2\2\2\u0483\u0484\3\2\2\2\u0484E\3\2\2\2\u0485\u0487"+
		"\5\u0110\u0089\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\3"+
		"\2\2\2\u0488\u0498\7?\2\2\u0489\u048b\7\7\2\2\u048a\u0489\3\2\2\2\u048b"+
		"\u048e\3\2\2\2\u048c\u048a\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048f\3\2"+
		"\2\2\u048e\u048c\3\2\2\2\u048f\u0493\5h\65\2\u0490\u0492\7\7\2\2\u0491"+
		"\u0490\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2"+
		"\2\2\u0494\u0496\3\2\2\2\u0495\u0493\3\2\2\2\u0496\u0497\7\t\2\2\u0497"+
		"\u0499\3\2\2\2\u0498\u048c\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u04a1\3\2"+
		"\2\2\u049a\u049c\7\7\2\2\u049b\u049a\3\2\2\2\u049c\u049f\3\2\2\2\u049d"+
		"\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0\3\2\2\2\u049f\u049d\3\2"+
		"\2\2\u04a0\u04a2\5d\63\2\u04a1\u049d\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04aa\3\2\2\2\u04a3\u04a5\7\7\2\2\u04a4\u04a3\3\2\2\2\u04a5\u04a8\3\2"+
		"\2\2\u04a6\u04a4\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a9\3\2\2\2\u04a8"+
		"\u04a6\3\2\2\2\u04a9\u04ab\5\u0132\u009a\2\u04aa\u04a6\3\2\2\2\u04aa\u04ab"+
		"\3\2\2\2\u04ab\u04af\3\2\2\2\u04ac\u04ae\7\7\2\2\u04ad\u04ac\3\2\2\2\u04ae"+
		"\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b2\3\2"+
		"\2\2\u04b1\u04af\3\2\2\2\u04b2\u04c1\5H%\2\u04b3\u04b5\7\7\2\2\u04b4\u04b3"+
		"\3\2\2\2\u04b5\u04b8\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7"+
		"\u04b9\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b9\u04bd\7\33\2\2\u04ba\u04bc\7"+
		"\7\2\2\u04bb\u04ba\3\2\2\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd"+
		"\u04be\3\2\2\2\u04be\u04c0\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04c2\5h"+
		"\65\2\u04c1\u04b6\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04ca\3\2\2\2\u04c3"+
		"\u04c5\7\7\2\2\u04c4\u04c3\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2"+
		"\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9"+
		"\u04cb\5|?\2\u04ca\u04c6\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04d3\3\2\2"+
		"\2\u04cc\u04ce\7\7\2\2\u04cd\u04cc\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd"+
		"\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2"+
		"\u04d4\5N(\2\u04d3\u04cf\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4G\3\2\2\2\u04d5"+
		"\u04de\7\13\2\2\u04d6\u04db\5J&\2\u04d7\u04d8\7\n\2\2\u04d8\u04da\5J&"+
		"\2\u04d9\u04d7\3\2\2\2\u04da\u04dd\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04dc"+
		"\3\2\2\2\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04de\u04d6\3\2\2\2\u04de"+
		"\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\7\f\2\2\u04e1I\3\2\2\2"+
		"\u04e2\u04e4\5\u0110\u0089\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4"+
		"\u04e5\3\2\2\2\u04e5\u04e8\5L\'\2\u04e6\u04e7\7\35\2\2\u04e7\u04e9\5\u008a"+
		"F\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9K\3\2\2\2\u04ea\u04eb"+
		"\5\u0134\u009b\2\u04eb\u04ec\7\33\2\2\u04ec\u04ed\5h\65\2\u04edM\3\2\2"+
		"\2\u04ee\u04f8\5\u0080A\2\u04ef\u04f3\7\35\2\2\u04f0\u04f2\7\7\2\2\u04f1"+
		"\u04f0\3\2\2\2\u04f2\u04f5\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f3\u04f4\3\2"+
		"\2\2\u04f4\u04f6\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f6\u04f8\5\u008aF\2\u04f7"+
		"\u04ee\3\2\2\2\u04f7\u04ef\3\2\2\2\u04f8O\3\2\2\2\u04f9\u0501\7\u0089"+
		"\2\2\u04fa\u04fc\7\7\2\2\u04fb\u04fa\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd"+
		"\u04fb\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0500\3\2\2\2\u04ff\u04fd\3\2"+
		"\2\2\u0500\u0502\5p9\2\u0501\u04fd\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u050a"+
		"\3\2\2\2\u0503\u0505\7\7\2\2\u0504\u0503\3\2\2\2\u0505\u0508\3\2\2\2\u0506"+
		"\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0509\3\2\2\2\u0508\u0506\3\2"+
		"\2\2\u0509\u050b\5N(\2\u050a\u0506\3\2\2\2\u050a\u050b\3\2\2\2\u050bQ"+
		"\3\2\2\2\u050c\u0529\7\u008a\2\2\u050d\u050f\7\7\2\2\u050e\u050d\3\2\2"+
		"\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513"+
		"\3\2\2\2\u0512\u0510\3\2\2\2\u0513\u052a\5p9\2\u0514\u0516\7\7\2\2\u0515"+
		"\u0514\3\2\2\2\u0516\u0519\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0518\3\2"+
		"\2\2\u0518\u051a\3\2\2\2\u0519\u0517\3\2\2\2\u051a\u051b\5p9\2\u051b\u051c"+
		"\7\n\2\2\u051c\u051e\3\2\2\2\u051d\u0517\3\2\2\2\u051e\u0521\3\2\2\2\u051f"+
		"\u051d\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0525\3\2\2\2\u0521\u051f\3\2"+
		"\2\2\u0522\u0524\7\7\2\2\u0523\u0522\3\2\2\2\u0524\u0527\3\2\2\2\u0525"+
		"\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0528\3\2\2\2\u0527\u0525\3\2"+
		"\2\2\u0528\u052a\5p9\2\u0529\u0510\3\2\2\2\u0529\u051f\3\2\2\2\u052aS"+
		"\3\2\2\2\u052b\u052d\5\u0110\u0089\2\u052c\u052b\3\2\2\2\u052c\u052d\3"+
		"\2\2\2\u052d\u052e\3\2\2\2\u052e\u0532\7@\2\2\u052f\u0531\7\7\2\2\u0530"+
		"\u052f\3\2\2\2\u0531\u0534\3\2\2\2\u0532\u0530\3\2\2\2\u0532\u0533\3\2"+
		"\2\2\u0533\u0535\3\2\2\2\u0534\u0532\3\2\2\2\u0535\u053d\5\u0134\u009b"+
		"\2\u0536\u0538\7\7\2\2\u0537\u0536\3\2\2\2\u0538\u053b\3\2\2\2\u0539\u0537"+
		"\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053c\3\2\2\2\u053b\u0539\3\2\2\2\u053c"+
		"\u053e\5 \21\2\u053d\u0539\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u054d\3\2"+
		"\2\2\u053f\u0541\7\7\2\2\u0540\u053f\3\2\2\2\u0541\u0544\3\2\2\2\u0542"+
		"\u0540\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0545\3\2\2\2\u0544\u0542\3\2"+
		"\2\2\u0545\u0549\7\33\2\2\u0546\u0548\7\7\2\2\u0547\u0546\3\2\2\2\u0548"+
		"\u054b\3\2\2\2\u0549\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054c\3\2"+
		"\2\2\u054b\u0549\3\2\2\2\u054c\u054e\5&\24\2\u054d\u0542\3\2\2\2\u054d"+
		"\u054e\3\2\2\2\u054e\u0556\3\2\2\2\u054f\u0551\7\7\2\2\u0550\u054f\3\2"+
		"\2\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2\2\2\u0552\u0553\3\2\2\2\u0553"+
		"\u0555\3\2\2\2\u0554\u0552\3\2\2\2\u0555\u0557\5.\30\2\u0556\u0552\3\2"+
		"\2\2\u0556\u0557\3\2\2\2\u0557U\3\2\2\2\u0558\u055a\5\u0110\u0089\2\u0559"+
		"\u0558\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055f\7F"+
		"\2\2\u055c\u055e\7\7\2\2\u055d\u055c\3\2\2\2\u055e\u0561\3\2\2\2\u055f"+
		"\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f\3\2"+
		"\2\2\u0562\u0564\5\u0110\u0089\2\u0563\u0562\3\2\2\2\u0563\u0564\3\2\2"+
		"\2\u0564\u0565\3\2\2\2\u0565\u056d\7@\2\2\u0566\u0568\7\7\2\2\u0567\u0566"+
		"\3\2\2\2\u0568\u056b\3\2\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a"+
		"\u056c\3\2\2\2\u056b\u0569\3\2\2\2\u056c\u056e\5\u0134\u009b\2\u056d\u0569"+
		"\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u057d\3\2\2\2\u056f\u0571\7\7\2\2\u0570"+
		"\u056f\3\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570\3\2\2\2\u0572\u0573\3\2"+
		"\2\2\u0573\u0575\3\2\2\2\u0574\u0572\3\2\2\2\u0575\u0579\7\33\2\2\u0576"+
		"\u0578\7\7\2\2\u0577\u0576\3\2\2\2\u0578\u057b\3\2\2\2\u0579\u0577\3\2"+
		"\2\2\u0579\u057a\3\2\2\2\u057a\u057c\3\2\2\2\u057b\u0579\3\2\2\2\u057c"+
		"\u057e\5&\24\2\u057d\u0572\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0586\3\2"+
		"\2\2\u057f\u0581\7\7\2\2\u0580\u057f\3\2\2\2\u0581\u0584\3\2\2\2\u0582"+
		"\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0585\3\2\2\2\u0584\u0582\3\2"+
		"\2\2\u0585\u0587\5.\30\2\u0586\u0582\3\2\2\2\u0586\u0587\3\2\2\2\u0587"+
		"W\3\2\2\2\u0588\u058a\5\u0110\u0089\2\u0589\u0588\3\2\2\2\u0589\u058a"+
		"\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u0593\t\3\2\2\u058c\u058e\7\7\2\2\u058d"+
		"\u058c\3\2\2\2\u058e\u0591\3\2\2\2\u058f\u058d\3\2\2\2\u058f\u0590\3\2"+
		"\2\2\u0590\u0592\3\2\2\2\u0591\u058f\3\2\2\2\u0592\u0594\5d\63\2\u0593"+
		"\u058f\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u05a4\3\2\2\2\u0595\u0597\7\7"+
		"\2\2\u0596\u0595\3\2\2\2\u0597\u059a\3\2\2\2\u0598\u0596\3\2\2\2\u0598"+
		"\u0599\3\2\2\2\u0599\u059b\3\2\2\2\u059a\u0598\3\2\2\2\u059b\u059f\5h"+
		"\65\2\u059c\u059e\7\7\2\2\u059d\u059c\3\2\2\2\u059e\u05a1\3\2\2\2\u059f"+
		"\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1\u059f\3\2"+
		"\2\2\u05a2\u05a3\7\t\2\2\u05a3\u05a5\3\2\2\2\u05a4\u0598\3\2\2\2\u05a4"+
		"\u05a5\3\2\2\2\u05a5\u05a9\3\2\2\2\u05a6\u05a8\7\7\2\2\u05a7\u05a6\3\2"+
		"\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa"+
		"\u05ae\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05af\5Z.\2\u05ad\u05af\5\\/"+
		"\2\u05ae\u05ac\3\2\2\2\u05ae\u05ad\3\2\2\2\u05af\u05b7\3\2\2\2\u05b0\u05b2"+
		"\7\7\2\2\u05b1\u05b0\3\2\2\2\u05b2\u05b5\3\2\2\2\u05b3\u05b1\3\2\2\2\u05b3"+
		"\u05b4\3\2\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05b3\3\2\2\2\u05b6\u05b8\5|"+
		"?\2\u05b7\u05b3\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05c7\3\2\2\2\u05b9"+
		"\u05bb\7\7\2\2\u05ba\u05b9\3\2\2\2\u05bb\u05be\3\2\2\2\u05bc\u05ba\3\2"+
		"\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2\2\2\u05be\u05bc\3\2\2\2\u05bf"+
		"\u05c3\t\4\2\2\u05c0\u05c2\7\7\2\2\u05c1\u05c0\3\2\2\2\u05c2\u05c5\3\2"+
		"\2\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c6\3\2\2\2\u05c5"+
		"\u05c3\3\2\2\2\u05c6\u05c8\5\u008aF\2\u05c7\u05bc\3\2\2\2\u05c7\u05c8"+
		"\3\2\2\2\u05c8\u05d5\3\2\2\2\u05c9\u05cd\5^\60\2\u05ca\u05cb\5\u0136\u009c"+
		"\2\u05cb\u05cc\5`\61\2\u05cc\u05ce\3\2\2\2\u05cd\u05ca\3\2\2\2\u05cd\u05ce"+
		"\3\2\2\2\u05ce\u05d6\3\2\2\2\u05cf\u05d3\5`\61\2\u05d0\u05d1\5\u0136\u009c"+
		"\2\u05d1\u05d2\5^\60\2\u05d2\u05d4\3\2\2\2\u05d3\u05d0\3\2\2\2\u05d3\u05d4"+
		"\3\2\2\2\u05d4\u05d6\3\2\2\2\u05d5\u05c9\3\2\2\2\u05d5\u05cf\3\2\2\2\u05d5"+
		"\u05d6\3\2\2\2\u05d6Y\3\2\2\2\u05d7\u05d8\7\13\2\2\u05d8\u05dd\5\\/\2"+
		"\u05d9\u05da\7\n\2\2\u05da\u05dc\5\\/\2\u05db\u05d9\3\2\2\2\u05dc\u05df"+
		"\3\2\2\2\u05dd\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05e0\3\2\2\2\u05df"+
		"\u05dd\3\2\2\2\u05e0\u05e1\7\f\2\2\u05e1[\3\2\2\2\u05e2\u05e5\5\u0134"+
		"\u009b\2\u05e3\u05e4\7\33\2\2\u05e4\u05e6\5h\65\2\u05e5\u05e3\3\2\2\2"+
		"\u05e5\u05e6\3\2\2\2\u05e6]\3\2\2\2\u05e7\u05e9\5\u0110\u0089\2\u05e8"+
		"\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u0619\7c"+
		"\2\2\u05eb\u05ed\5\u0110\u0089\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2"+
		"\2\u05ed\u05ee\3\2\2\2\u05ee\u05f2\7c\2\2\u05ef\u05f1\7\7\2\2\u05f0\u05ef"+
		"\3\2\2\2\u05f1\u05f4\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3"+
		"\u05f5\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f5\u05f6\7\13\2\2\u05f6\u0605\7"+
		"\f\2\2\u05f7\u05f9\7\7\2\2\u05f8\u05f7\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa"+
		"\u05f8\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fd\3\2\2\2\u05fc\u05fa\3\2"+
		"\2\2\u05fd\u0601\7\33\2\2\u05fe\u0600\7\7\2\2\u05ff\u05fe\3\2\2\2\u0600"+
		"\u0603\3\2\2\2\u0601\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0604\3\2"+
		"\2\2\u0603\u0601\3\2\2\2\u0604\u0606\5h\65\2\u0605\u05fa\3\2\2\2\u0605"+
		"\u0606\3\2\2\2\u0606\u060a\3\2\2\2\u0607\u0609\7\7\2\2\u0608\u0607\3\2"+
		"\2\2\u0609\u060c\3\2\2\2\u060a\u0608\3\2\2\2\u060a\u060b\3\2\2\2\u060b"+
		"\u0616\3\2\2\2\u060c\u060a\3\2\2\2\u060d\u0617\5\u0080A\2\u060e\u0612"+
		"\7\35\2\2\u060f\u0611\7\7\2\2\u0610\u060f\3\2\2\2\u0611\u0614\3\2\2\2"+
		"\u0612\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615\3\2\2\2\u0614\u0612"+
		"\3\2\2\2\u0615\u0617\5\u008aF\2\u0616\u060d\3\2\2\2\u0616\u060e\3\2\2"+
		"\2\u0617\u0619\3\2\2\2\u0618\u05e8\3\2\2\2\u0618\u05ec\3\2\2\2\u0619_"+
		"\3\2\2\2\u061a\u061c\5\u0110\u0089\2\u061b\u061a\3\2\2\2\u061b\u061c\3"+
		"\2\2\2\u061c\u061d\3\2\2\2\u061d\u063e\7d\2\2\u061e\u0620\5\u0110\u0089"+
		"\2\u061f\u061e\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0625"+
		"\7d\2\2\u0622\u0624\7\7\2\2\u0623\u0622\3\2\2\2\u0624\u0627\3\2\2\2\u0625"+
		"\u0623\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0628\3\2\2\2\u0627\u0625\3\2"+
		"\2\2\u0628\u062d\7\13\2\2\u0629\u062c\5\u0128\u0095\2\u062a\u062c\5\u0122"+
		"\u0092\2\u062b\u0629\3\2\2\2\u062b\u062a\3\2\2\2\u062c\u062f\3\2\2\2\u062d"+
		"\u062b\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u0632\3\2\2\2\u062f\u062d\3\2"+
		"\2\2\u0630\u0633\5\u0134\u009b\2\u0631\u0633\5L\'\2\u0632\u0630\3\2\2"+
		"\2\u0632\u0631\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0638\7\f\2\2\u0635\u0637"+
		"\7\7\2\2\u0636\u0635\3\2\2\2\u0637\u063a\3\2\2\2\u0638\u0636\3\2\2\2\u0638"+
		"\u0639\3\2\2\2\u0639\u063b\3\2\2\2\u063a\u0638\3\2\2\2\u063b\u063c\5N"+
		"(\2\u063c\u063e\3\2\2\2\u063d\u061b\3\2\2\2\u063d\u061f\3\2\2\2\u063e"+
		"a\3\2\2\2\u063f\u0641\5\u0110\u0089\2\u0640\u063f\3\2\2\2\u0640\u0641"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0646\7C\2\2\u0643\u0645\7\7\2\2\u0644"+
		"\u0643\3\2\2\2\u0645\u0648\3\2\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2"+
		"\2\2\u0647\u0649\3\2\2\2\u0648\u0646\3\2\2\2\u0649\u0651\5\u0134\u009b"+
		"\2\u064a\u064c\7\7\2\2\u064b\u064a\3\2\2\2\u064c\u064f\3\2\2\2\u064d\u064b"+
		"\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0650\3\2\2\2\u064f\u064d\3\2\2\2\u0650"+
		"\u0652\5d\63\2\u0651\u064d\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0656\3\2"+
		"\2\2\u0653\u0655\7\7\2\2\u0654\u0653\3\2\2\2\u0655\u0658\3\2\2\2\u0656"+
		"\u0654\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0659\3\2\2\2\u0658\u0656\3\2"+
		"\2\2\u0659\u065d\7\35\2\2\u065a\u065c\7\7\2\2\u065b\u065a\3\2\2\2\u065c"+
		"\u065f\3\2\2\2\u065d\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0660\3\2"+
		"\2\2\u065f\u065d\3\2\2\2\u0660\u0661\5h\65\2\u0661c\3\2\2\2\u0662\u0666"+
		"\7-\2\2\u0663\u0665\7\7\2\2\u0664\u0663\3\2\2\2\u0665\u0668\3\2\2\2\u0666"+
		"\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0669\3\2\2\2\u0668\u0666\3\2"+
		"\2\2\u0669\u067a\5f\64\2\u066a\u066c\7\7\2\2\u066b\u066a\3\2\2\2\u066c"+
		"\u066f\3\2\2\2\u066d\u066b\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u0670\3\2"+
		"\2\2\u066f\u066d\3\2\2\2\u0670\u0674\7\n\2\2\u0671\u0673\7\7\2\2\u0672"+
		"\u0671\3\2\2\2\u0673\u0676\3\2\2\2\u0674\u0672\3\2\2\2\u0674\u0675\3\2"+
		"\2\2\u0675\u0677\3\2\2\2\u0676\u0674\3\2\2\2\u0677\u0679\5f\64\2\u0678"+
		"\u066d\3\2\2\2\u0679\u067c\3\2\2\2\u067a\u0678\3\2\2\2\u067a\u067b\3\2"+
		"\2\2\u067b\u0680\3\2\2\2\u067c\u067a\3\2\2\2\u067d\u067f\7\7\2\2\u067e"+
		"\u067d\3\2\2\2\u067f\u0682\3\2\2\2\u0680\u067e\3\2\2\2\u0680\u0681\3\2"+
		"\2\2\u0681\u0683\3\2\2\2\u0682\u0680\3\2\2\2\u0683\u0684\7.\2\2\u0684"+
		"e\3\2\2\2\u0685\u0687\5\u0110\u0089\2\u0686\u0685\3\2\2\2\u0686\u0687"+
		"\3\2\2\2\u0687\u068b\3\2\2\2\u0688\u068a\7\7\2\2\u0689\u0688\3\2\2\2\u068a"+
		"\u068d\3\2\2\2\u068b\u0689\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068e\3\2"+
		"\2\2\u068d\u068b\3\2\2\2\u068e\u069d\5\u0134\u009b\2\u068f\u0691\7\7\2"+
		"\2\u0690\u068f\3\2\2\2\u0691\u0694\3\2\2\2\u0692\u0690\3\2\2\2\u0692\u0693"+
		"\3\2\2\2\u0693\u0695\3\2\2\2\u0694\u0692\3\2\2\2\u0695\u0699\7\33\2\2"+
		"\u0696\u0698\7\7\2\2\u0697\u0696\3\2\2\2\u0698\u069b\3\2\2\2\u0699\u0697"+
		"\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069c\3\2\2\2\u069b\u0699\3\2\2\2\u069c"+
		"\u069e\5h\65\2\u069d\u0692\3\2\2\2\u069d\u069e\3\2\2\2\u069eg\3\2\2\2"+
		"\u069f\u06a1\5j\66\2\u06a0\u069f\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a6"+
		"\3\2\2\2\u06a2\u06a7\5r:\2\u06a3\u06a7\5l\67\2\u06a4\u06a7\5n8\2\u06a5"+
		"\u06a7\5p9\2\u06a6\u06a2\3\2\2\2\u06a6\u06a3\3\2\2\2\u06a6\u06a4\3\2\2"+
		"\2\u06a6\u06a5\3\2\2\2\u06a7i\3\2\2\2\u06a8\u06b1\5\u0128\u0095\2\u06a9"+
		"\u06ad\7x\2\2\u06aa\u06ac\7\7\2\2\u06ab\u06aa\3\2\2\2\u06ac\u06af\3\2"+
		"\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06b1\3\2\2\2\u06af"+
		"\u06ad\3\2\2\2\u06b0\u06a8\3\2\2\2\u06b0\u06a9\3\2\2\2\u06b1\u06b2\3\2"+
		"\2\2\u06b2\u06b0\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3k\3\2\2\2\u06b4\u06b5"+
		"\7\13\2\2\u06b5\u06b6\5h\65\2\u06b6\u06b7\7\f\2\2\u06b7m\3\2\2\2\u06b8"+
		"\u06bb\5p9\2\u06b9\u06bb\5l\67\2\u06ba\u06b8\3\2\2\2\u06ba\u06b9\3\2\2"+
		"\2\u06bb\u06bf\3\2\2\2\u06bc\u06be\7\7\2\2\u06bd\u06bc\3\2\2\2\u06be\u06c1"+
		"\3\2\2\2\u06bf\u06bd\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c3\3\2\2\2\u06c1"+
		"\u06bf\3\2\2\2\u06c2\u06c4\7+\2\2\u06c3\u06c2\3\2\2\2\u06c4\u06c5\3\2"+
		"\2\2\u06c5\u06c3\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6o\3\2\2\2\u06c7\u06c8"+
		"\7\13\2\2\u06c8\u06c9\5p9\2\u06c9\u06ca\7\f\2\2\u06ca\u06ce\3\2\2\2\u06cb"+
		"\u06ce\5v<\2\u06cc\u06ce\7i\2\2\u06cd\u06c7\3\2\2\2\u06cd\u06cb\3\2\2"+
		"\2\u06cd\u06cc\3\2\2\2\u06ceq\3\2\2\2\u06cf\u06d3\5t;\2\u06d0\u06d2\7"+
		"\7\2\2\u06d1\u06d0\3\2\2\2\u06d2\u06d5\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d3"+
		"\u06d4\3\2\2\2\u06d4\u06d6\3\2\2\2\u06d5\u06d3\3\2\2\2\u06d6\u06da\7\t"+
		"\2\2\u06d7\u06d9\7\7\2\2\u06d8\u06d7\3\2\2\2\u06d9\u06dc\3\2\2\2\u06da"+
		"\u06d8\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06de\3\2\2\2\u06dc\u06da\3\2"+
		"\2\2\u06dd\u06cf\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06df\3\2\2\2\u06df"+
		"\u06e3\5z>\2\u06e0\u06e2\7\7\2\2\u06e1\u06e0\3\2\2\2\u06e2\u06e5\3\2\2"+
		"\2\u06e3\u06e1\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e6\3\2\2\2\u06e5\u06e3"+
		"\3\2\2\2\u06e6\u06ea\7#\2\2\u06e7\u06e9\7\7\2\2\u06e8\u06e7\3\2\2\2\u06e9"+
		"\u06ec\3\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ed\3\2"+
		"\2\2\u06ec\u06ea\3\2\2\2\u06ed\u06ee\5h\65\2\u06ees\3\2\2\2\u06ef\u06f3"+
		"\5l\67\2\u06f0\u06f3\5n8\2\u06f1\u06f3\5p9\2\u06f2\u06ef\3\2\2\2\u06f2"+
		"\u06f0\3\2\2\2\u06f2\u06f1\3\2\2\2\u06f3u\3\2\2\2\u06f4\u0705\5x=\2\u06f5"+
		"\u06f7\7\7\2\2\u06f6\u06f5\3\2\2\2\u06f7\u06fa\3\2\2\2\u06f8\u06f6\3\2"+
		"\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fb\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fb"+
		"\u06ff\7\t\2\2\u06fc\u06fe\7\7\2\2\u06fd\u06fc\3\2\2\2\u06fe\u0701\3\2"+
		"\2\2\u06ff\u06fd\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0702\3\2\2\2\u0701"+
		"\u06ff\3\2\2\2\u0702\u0704\5x=\2\u0703\u06f8\3\2\2\2\u0704\u0707\3\2\2"+
		"\2\u0705\u0703\3\2\2\2\u0705\u0706\3\2\2\2\u0706w\3\2\2\2\u0707\u0705"+
		"\3\2\2\2\u0708\u0710\5\u0134\u009b\2\u0709\u070b\7\7\2\2\u070a\u0709\3"+
		"\2\2\2\u070b\u070e\3\2\2\2\u070c\u070a\3\2\2\2\u070c\u070d\3\2\2\2\u070d"+
		"\u070f\3\2\2\2\u070e\u070c\3\2\2\2\u070f\u0711\5\u00b2Z\2\u0710\u070c"+
		"\3\2\2\2\u0710\u0711\3\2\2\2\u0711y\3\2\2\2\u0712\u0715\7\13\2\2\u0713"+
		"\u0716\5L\'\2\u0714\u0716\5h\65\2\u0715\u0713\3\2\2\2\u0715\u0714\3\2"+
		"\2\2\u0715\u0716\3\2\2\2\u0716\u071e\3\2\2\2\u0717\u071a\7\n\2\2\u0718"+
		"\u071b\5L\'\2\u0719\u071b\5h\65\2\u071a\u0718\3\2\2\2\u071a\u0719\3\2"+
		"\2\2\u071b\u071d\3\2\2\2\u071c\u0717\3\2\2\2\u071d\u0720\3\2\2\2\u071e"+
		"\u071c\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0721\3\2\2\2\u0720\u071e\3\2"+
		"\2\2\u0721\u0722\7\f\2\2\u0722{\3\2\2\2\u0723\u0727\7K\2\2\u0724\u0726"+
		"\7\7\2\2\u0725\u0724\3\2\2\2\u0726\u0729\3\2\2\2\u0727\u0725\3\2\2\2\u0727"+
		"\u0728\3\2\2\2\u0728\u072a\3\2\2\2\u0729\u0727\3\2\2\2\u072a\u073b\5~"+
		"@\2\u072b\u072d\7\7\2\2\u072c\u072b\3\2\2\2\u072d\u0730\3\2\2\2\u072e"+
		"\u072c\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0731\3\2\2\2\u0730\u072e\3\2"+
		"\2\2\u0731\u0735\7\n\2\2\u0732\u0734\7\7\2\2\u0733\u0732\3\2\2\2\u0734"+
		"\u0737\3\2\2\2\u0735\u0733\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0738\3\2"+
		"\2\2\u0737\u0735\3\2\2\2\u0738\u073a\5~@\2\u0739\u072e\3\2\2\2\u073a\u073d"+
		"\3\2\2\2\u073b\u0739\3\2\2\2\u073b\u073c\3\2\2\2\u073c}\3\2\2\2\u073d"+
		"\u073b\3\2\2\2\u073e\u0740\5\u0128\u0095\2\u073f\u073e\3\2\2\2\u0740\u0743"+
		"\3\2\2\2\u0741\u073f\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0744\3\2\2\2\u0743"+
		"\u0741\3\2\2\2\u0744\u0748\5\u0134\u009b\2\u0745\u0747\7\7\2\2\u0746\u0745"+
		"\3\2\2\2\u0747\u074a\3\2\2\2\u0748\u0746\3\2\2\2\u0748\u0749\3\2\2\2\u0749"+
		"\u074b\3\2\2\2\u074a\u0748\3\2\2\2\u074b\u074f\7\33\2\2\u074c\u074e\7"+
		"\7\2\2\u074d\u074c\3\2\2\2\u074e\u0751\3\2\2\2\u074f\u074d\3\2\2\2\u074f"+
		"\u0750\3\2\2\2\u0750\u0752\3\2\2\2\u0751\u074f\3\2\2\2\u0752\u0753\5h"+
		"\65\2\u0753\177\3\2\2\2\u0754\u0755\7\17\2\2\u0755\u0756\5\u0082B\2\u0756"+
		"\u0757\7\20\2\2\u0757\u0081\3\2\2\2\u0758\u075a\5\u0138\u009d\2\u0759"+
		"\u0758\3\2\2\2\u075a\u075d\3\2\2\2\u075b\u0759\3\2\2\2\u075b\u075c\3\2"+
		"\2\2\u075c\u076c\3\2\2\2\u075d\u075b\3\2\2\2\u075e\u0769\5\u0084C\2\u075f"+
		"\u0761\5\u0138\u009d\2\u0760\u075f\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0760"+
		"\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0765\3\2\2\2\u0764\u0766\5\u0084C"+
		"\2\u0765\u0764\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0768\3\2\2\2\u0767\u0760"+
		"\3\2\2\2\u0768\u076b\3\2\2\2\u0769\u0767\3\2\2\2\u0769\u076a\3\2\2\2\u076a"+
		"\u076d\3\2\2\2\u076b\u0769\3\2\2\2\u076c\u075e\3\2\2\2\u076c\u076d\3\2"+
		"\2\2\u076d\u0083\3\2\2\2\u076e\u0771\5\u0088E\2\u076f\u0771\5\u0086D\2"+
		"\u0770\u076e\3\2\2\2\u0770\u076f\3\2\2\2\u0771\u0085\3\2\2\2\u0772\u0774"+
		"\5\u0128\u0095\2\u0773\u0772\3\2\2\2\u0774\u0777\3\2\2\2\u0775\u0773\3"+
		"\2\2\2\u0775\u0776\3\2\2\2\u0776\u077b\3\2\2\2\u0777\u0775\3\2\2\2\u0778"+
		"\u077a\7\7\2\2\u0779\u0778\3\2\2\2\u077a\u077d\3\2\2\2\u077b\u0779\3\2"+
		"\2\2\u077b\u077c\3\2\2\2\u077c\u077e\3\2\2\2\u077d\u077b\3\2\2\2\u077e"+
		"\u077f\5\u008aF\2\u077f\u0087\3\2\2\2\u0780\u0782\5\u0126\u0094\2\u0781"+
		"\u0780\3\2\2\2\u0782\u0785\3\2\2\2\u0783\u0781\3\2\2\2\u0783\u0784\3\2"+
		"\2\2\u0784\u078a\3\2\2\2\u0785\u0783\3\2\2\2\u0786\u078b\5\24\13\2\u0787"+
		"\u078b\5F$\2\u0788\u078b\5X-\2\u0789\u078b\5b\62\2\u078a\u0786\3\2\2\2"+
		"\u078a\u0787\3\2\2\2\u078a\u0788\3\2\2\2\u078a\u0789\3\2\2\2\u078b\u0089"+
		"\3\2\2\2\u078c\u0792\5\u008cG\2\u078d\u078e\5\u00fa~\2\u078e\u078f\5\u008c"+
		"G\2\u078f\u0791\3\2\2\2\u0790\u078d\3\2\2\2\u0791\u0794\3\2\2\2\u0792"+
		"\u0790\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u008b\3\2\2\2\u0794\u0792\3\2"+
		"\2\2\u0795\u07a6\5\u008eH\2\u0796\u0798\7\7\2\2\u0797\u0796\3\2\2\2\u0798"+
		"\u079b\3\2\2\2\u0799\u0797\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079c\3\2"+
		"\2\2\u079b\u0799\3\2\2\2\u079c\u07a0\7\31\2\2\u079d\u079f\7\7\2\2\u079e"+
		"\u079d\3\2\2\2\u079f\u07a2\3\2\2\2\u07a0\u079e\3\2\2\2\u07a0\u07a1\3\2"+
		"\2\2\u07a1\u07a3\3\2\2\2\u07a2\u07a0\3\2\2\2\u07a3\u07a5\5\u008eH\2\u07a4"+
		"\u0799\3\2\2\2\u07a5\u07a8\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a7\3\2"+
		"\2\2\u07a7\u008d\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a9\u07ba\5\u0090I\2\u07aa"+
		"\u07ac\7\7\2\2\u07ab\u07aa\3\2\2\2\u07ac\u07af\3\2\2\2\u07ad\u07ab\3\2"+
		"\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07b0\3\2\2\2\u07af\u07ad\3\2\2\2\u07b0"+
		"\u07b4\7\30\2\2\u07b1\u07b3\7\7\2\2\u07b2\u07b1\3\2\2\2\u07b3\u07b6\3"+
		"\2\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b7\3\2\2\2\u07b6"+
		"\u07b4\3\2\2\2\u07b7\u07b9\5\u0090I\2\u07b8\u07ad\3\2\2\2\u07b9\u07bc"+
		"\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u008f\3\2\2\2\u07bc"+
		"\u07ba\3\2\2\2\u07bd\u07c9\5\u0092J\2\u07be\u07c2\5\u00fc\177\2\u07bf"+
		"\u07c1\7\7\2\2\u07c0\u07bf\3\2\2\2\u07c1\u07c4\3\2\2\2\u07c2\u07c0\3\2"+
		"\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c5\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c5"+
		"\u07c6\5\u0092J\2\u07c6\u07c8\3\2\2\2\u07c7\u07be\3\2\2\2\u07c8\u07cb"+
		"\3\2\2\2\u07c9\u07c7\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u0091\3\2\2\2\u07cb"+
		"\u07c9\3\2\2\2\u07cc\u07d6\5\u0094K\2\u07cd\u07d1\5\u00fe\u0080\2\u07ce"+
		"\u07d0\7\7\2\2\u07cf\u07ce\3\2\2\2\u07d0\u07d3\3\2\2\2\u07d1\u07cf\3\2"+
		"\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d4\3\2\2\2\u07d3\u07d1\3\2\2\2\u07d4"+
		"\u07d5\5\u0094K\2\u07d5\u07d7\3\2\2\2\u07d6\u07cd\3\2\2\2\u07d6\u07d7"+
		"\3\2\2\2\u07d7\u0093\3\2\2\2\u07d8\u07ef\5\u0096L\2\u07d9\u07dd\5\u0100"+
		"\u0081\2\u07da\u07dc\7\7\2\2\u07db\u07da\3\2\2\2\u07dc\u07df\3\2\2\2\u07dd"+
		"\u07db\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07e0\3\2\2\2\u07df\u07dd\3\2"+
		"\2\2\u07e0\u07e1\5\u0096L\2\u07e1\u07e3\3\2\2\2\u07e2\u07d9\3\2\2\2\u07e3"+
		"\u07e4\3\2\2\2\u07e4\u07e2\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07f0\3\2"+
		"\2\2\u07e6\u07ea\5\u0102\u0082\2\u07e7\u07e9\7\7\2\2\u07e8\u07e7\3\2\2"+
		"\2\u07e9\u07ec\3\2\2\2\u07ea\u07e8\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07ed"+
		"\3\2\2\2\u07ec\u07ea\3\2\2\2\u07ed\u07ee\5h\65\2\u07ee\u07f0\3\2\2\2\u07ef"+
		"\u07e2\3\2\2\2\u07ef\u07e6\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u0095\3\2"+
		"\2\2\u07f1\u0802\5\u0098M\2\u07f2\u07f4\7\7\2\2\u07f3\u07f2\3\2\2\2\u07f4"+
		"\u07f7\3\2\2\2\u07f5\u07f3\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u07f8\3\2"+
		"\2\2\u07f7\u07f5\3\2\2\2\u07f8\u07fc\7,\2\2\u07f9\u07fb\7\7\2\2\u07fa"+
		"\u07f9\3\2\2\2\u07fb\u07fe\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fc\u07fd\3\2"+
		"\2\2\u07fd\u07ff\3\2\2\2\u07fe\u07fc\3\2\2\2\u07ff\u0801\5\u0098M\2\u0800"+
		"\u07f5\3\2\2\2\u0801\u0804\3\2\2\2\u0802\u0800\3\2\2\2\u0802\u0803\3\2"+
		"\2\2\u0803\u0097\3\2\2\2\u0804\u0802\3\2\2\2\u0805\u0811\5\u009aN\2\u0806"+
		"\u080a\5\u0134\u009b\2\u0807\u0809\7\7\2\2\u0808\u0807\3\2\2\2\u0809\u080c"+
		"\3\2\2\2\u080a\u0808\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080d\3\2\2\2\u080c"+
		"\u080a\3\2\2\2\u080d\u080e\5\u009aN\2\u080e\u0810\3\2\2\2\u080f\u0806"+
		"\3\2\2\2\u0810\u0813\3\2\2\2\u0811\u080f\3\2\2\2\u0811\u0812\3\2\2\2\u0812"+
		"\u0099\3\2\2\2\u0813\u0811\3\2\2\2\u0814\u081f\5\u009cO\2\u0815\u0819"+
		"\7%\2\2\u0816\u0818\7\7\2\2\u0817\u0816\3\2\2\2\u0818\u081b\3\2\2\2\u0819"+
		"\u0817\3\2\2\2\u0819\u081a\3\2\2\2\u081a\u081c\3\2\2\2\u081b\u0819\3\2"+
		"\2\2\u081c\u081e\5\u009cO\2\u081d\u0815\3\2\2\2\u081e\u0821\3\2\2\2\u081f"+
		"\u081d\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u009b\3\2\2\2\u0821\u081f\3\2"+
		"\2\2\u0822\u082e\5\u009eP\2\u0823\u0827\5\u0104\u0083\2\u0824\u0826\7"+
		"\7\2\2\u0825\u0824\3\2\2\2\u0826\u0829\3\2\2\2\u0827\u0825\3\2\2\2\u0827"+
		"\u0828\3\2\2\2\u0828\u082a\3\2\2\2\u0829\u0827\3\2\2\2\u082a\u082b\5\u009e"+
		"P\2\u082b\u082d\3\2\2\2\u082c\u0823\3\2\2\2\u082d\u0830\3\2\2\2\u082e"+
		"\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u009d\3\2\2\2\u0830\u082e\3\2"+
		"\2\2\u0831\u083d\5\u00a0Q\2\u0832\u0836\5\u0106\u0084\2\u0833\u0835\7"+
		"\7\2\2\u0834\u0833\3\2\2\2\u0835\u0838\3\2\2\2\u0836\u0834\3\2\2\2\u0836"+
		"\u0837\3\2\2\2\u0837\u0839\3\2\2\2\u0838\u0836\3\2\2\2\u0839\u083a\5\u00a0"+
		"Q\2\u083a\u083c\3\2\2\2\u083b\u0832\3\2\2\2\u083c\u083f\3\2\2\2\u083d"+
		"\u083b\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u009f\3\2\2\2\u083f\u083d\3\2"+
		"\2\2\u0840\u084c\5\u00a2R\2\u0841\u0843\7\7\2\2\u0842\u0841\3\2\2\2\u0843"+
		"\u0846\3\2\2\2\u0844\u0842\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0847\3\2"+
		"\2\2\u0846\u0844\3\2\2\2\u0847\u0848\5\u0108\u0085\2\u0848\u0849\5\u00a2"+
		"R\2\u0849\u084b\3\2\2\2\u084a\u0844\3\2\2\2\u084b\u084e\3\2\2\2\u084c"+
		"\u084a\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u00a1\3\2\2\2\u084e\u084c\3\2"+
		"\2\2\u084f\u0851\5\u010a\u0086\2\u0850\u084f\3\2\2\2\u0851\u0854\3\2\2"+
		"\2\u0852\u0850\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0855\3\2\2\2\u0854\u0852"+
		"\3\2\2\2\u0855\u0856\5\u00a4S\2\u0856\u00a3\3\2\2\2\u0857\u085a\5\u00a6"+
		"T\2\u0858\u085a\5\u00f8}\2\u0859\u0857\3\2\2\2\u0859\u0858\3\2\2\2\u085a"+
		"\u085e\3\2\2\2\u085b\u085d\5\u010c\u0087\2\u085c\u085b\3\2\2\2\u085d\u0860"+
		"\3\2\2\2\u085e\u085c\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u00a5\3\2\2\2\u0860"+
		"\u085e\3\2\2\2\u0861\u086e\5\u00a8U\2\u0862\u086e\5\u00ba^\2\u0863\u086e"+
		"\5\u00caf\2\u0864\u086e\5\u00d4k\2\u0865\u086e\5\u00d6l\2\u0866\u086e"+
		"\5\u00d8m\2\u0867\u086e\5\u00e8u\2\u0868\u086e\5\u00d0i\2\u0869\u086e"+
		"\5\u00f6|\2\u086a\u086e\5\u00eex\2\u086b\u086e\5\u00d2j\2\u086c\u086e"+
		"\5\u0134\u009b\2\u086d\u0861\3\2\2\2\u086d\u0862\3\2\2\2\u086d\u0863\3"+
		"\2\2\2\u086d\u0864\3\2\2\2\u086d\u0865\3\2\2\2\u086d\u0866\3\2\2\2\u086d"+
		"\u0867\3\2\2\2\u086d\u0868\3\2\2\2\u086d\u0869\3\2\2\2\u086d\u086a\3\2"+
		"\2\2\u086d\u086b\3\2\2\2\u086d\u086c\3\2\2\2\u086e\u00a7\3\2\2\2\u086f"+
		"\u0870\7\13\2\2\u0870\u0871\5\u008aF\2\u0871\u0872\7\f\2\2\u0872\u00a9"+
		"\3\2\2\2\u0873\u0875\5\u00b2Z\2\u0874\u0876\5\u00b0Y\2\u0875\u0874\3\2"+
		"\2\2\u0875\u0876\3\2\2\2\u0876\u087a\3\2\2\2\u0877\u0879\5\u00acW\2\u0878"+
		"\u0877\3\2\2\2\u0879\u087c\3\2\2\2\u087a\u0878\3\2\2\2\u087a\u087b\3\2"+
		"\2\2\u087b\u088a\3\2\2\2\u087c\u087a\3\2\2\2\u087d\u0881\5\u00b0Y\2\u087e"+
		"\u0880\5\u00acW\2\u087f\u087e\3\2\2\2\u0880\u0883\3\2\2\2\u0881\u087f"+
		"\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u088a\3\2\2\2\u0883\u0881\3\2\2\2\u0884"+
		"\u0886\5\u00acW\2\u0885\u0884\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0885"+
		"\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u088a\3\2\2\2\u0889\u0873\3\2\2\2\u0889"+
		"\u087d\3\2\2\2\u0889\u0885\3\2\2\2\u088a\u00ab\3\2\2\2\u088b\u088d\5\u0130"+
		"\u0099\2\u088c\u088b\3\2\2\2\u088d\u0890\3\2\2\2\u088e\u088c\3\2\2\2\u088e"+
		"\u088f\3\2\2\2\u088f\u0892\3\2\2\2\u0890\u088e\3\2\2\2\u0891\u0893\7\u0098"+
		"\2\2\u0892\u0891\3\2\2\2\u0892\u0893\3\2\2\2\u0893\u0897\3\2\2\2\u0894"+
		"\u0896\7\7\2\2\u0895\u0894\3\2\2\2\u0896\u0899\3\2\2\2\u0897\u0895\3\2"+
		"\2\2\u0897\u0898\3\2\2\2\u0898\u089a\3\2\2\2\u0899\u0897\3\2\2\2\u089a"+
		"\u089b\5\u00caf\2\u089b\u00ad\3\2\2\2\u089c\u08a5\7\r\2\2\u089d\u08a2"+
		"\5\u008aF\2\u089e\u089f\7\n\2\2\u089f\u08a1\5\u008aF\2\u08a0\u089e\3\2"+
		"\2\2\u08a1\u08a4\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a2";
	private static final String _serializedATNSegment1 =
		"\u08a3\3\2\2\2\u08a3\u08a6\3\2\2\2\u08a4\u08a2\3\2\2\2\u08a5\u089d\3\2"+
		"\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08a8\7\16\2\2\u08a8"+
		"\u00af\3\2\2\2\u08a9\u08b2\7\13\2\2\u08aa\u08af\5\u00b8]\2\u08ab\u08ac"+
		"\7\n\2\2\u08ac\u08ae\5\u00b8]\2\u08ad\u08ab\3\2\2\2\u08ae\u08b1\3\2\2"+
		"\2\u08af\u08ad\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b3\3\2\2\2\u08b1\u08af"+
		"\3\2\2\2\u08b2\u08aa\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4"+
		"\u08b5\7\f\2\2\u08b5\u00b1\3\2\2\2\u08b6\u08ba\7-\2\2\u08b7\u08b9\7\7"+
		"\2\2\u08b8\u08b7\3\2\2\2\u08b9\u08bc\3\2\2\2\u08ba\u08b8\3\2\2\2\u08ba"+
		"\u08bb\3\2\2\2\u08bb\u08bd\3\2\2\2\u08bc\u08ba\3\2\2\2\u08bd\u08c8\5\u00b4"+
		"[\2\u08be\u08c0\7\7\2\2\u08bf\u08be\3\2\2\2\u08c0\u08c3\3\2\2\2\u08c1"+
		"\u08bf\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c4\3\2\2\2\u08c3\u08c1\3\2"+
		"\2\2\u08c4\u08c5\7\n\2\2\u08c5\u08c7\5\u00b4[\2\u08c6\u08c1\3\2\2\2\u08c7"+
		"\u08ca\3\2\2\2\u08c8\u08c6\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ce\3\2"+
		"\2\2\u08ca\u08c8\3\2\2\2\u08cb\u08cd\7\7\2\2\u08cc\u08cb\3\2\2\2\u08cd"+
		"\u08d0\3\2\2\2\u08ce\u08cc\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d1\3\2"+
		"\2\2\u08d0\u08ce\3\2\2\2\u08d1\u08d2\7.\2\2\u08d2\u00b3\3\2\2\2\u08d3"+
		"\u08d5\5\u00b6\\\2\u08d4\u08d3\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d6"+
		"\3\2\2\2\u08d6\u08d9\5h\65\2\u08d7\u08d9\7\21\2\2\u08d8\u08d4\3\2\2\2"+
		"\u08d8\u08d7\3\2\2\2\u08d9\u00b5\3\2\2\2\u08da\u08dc\5\u011a\u008e\2\u08db"+
		"\u08da\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08db\3\2\2\2\u08dd\u08de\3\2"+
		"\2\2\u08de\u00b7\3\2\2\2\u08df\u08e3\5\u0134\u009b\2\u08e0\u08e2\7\7\2"+
		"\2\u08e1\u08e0\3\2\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e3\u08e4"+
		"\3\2\2\2\u08e4\u08e6\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6\u08ea\7\35\2\2"+
		"\u08e7\u08e9\7\7\2\2\u08e8\u08e7\3\2\2\2\u08e9\u08ec\3\2\2\2\u08ea\u08e8"+
		"\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08ee\3\2\2\2\u08ec\u08ea\3\2\2\2\u08ed"+
		"\u08df\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u08f0\3\2\2\2\u08ef\u08f1\7\21"+
		"\2\2\u08f0\u08ef\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f5\3\2\2\2\u08f2"+
		"\u08f4\7\7\2\2\u08f3\u08f2\3\2\2\2\u08f4\u08f7\3\2\2\2\u08f5\u08f3\3\2"+
		"\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08f8\3\2\2\2\u08f7\u08f5\3\2\2\2\u08f8"+
		"\u08f9\5\u008aF\2\u08f9\u00b9\3\2\2\2\u08fa\u0904\7\u0094\2\2\u08fb\u0904"+
		"\7\u0091\2\2\u08fc\u0904\5\u00bc_\2\u08fd\u0904\7\u0092\2\2\u08fe\u0904"+
		"\7\u0093\2\2\u08ff\u0904\7\u009a\2\2\u0900\u0904\7\u008d\2\2\u0901\u0904"+
		"\7\u0095\2\2\u0902\u0904\7\u0090\2\2\u0903\u08fa\3\2\2\2\u0903\u08fb\3"+
		"\2\2\2\u0903\u08fc\3\2\2\2\u0903\u08fd\3\2\2\2\u0903\u08fe\3\2\2\2\u0903"+
		"\u08ff\3\2\2\2\u0903\u0900\3\2\2\2\u0903\u0901\3\2\2\2\u0903\u0902\3\2"+
		"\2\2\u0904\u00bb\3\2\2\2\u0905\u0908\5\u00be`\2\u0906\u0908\5\u00c0a\2"+
		"\u0907\u0905\3\2\2\2\u0907\u0906\3\2\2\2\u0908\u00bd\3\2\2\2\u0909\u090e"+
		"\7\u008b\2\2\u090a\u090d\5\u00c2b\2\u090b\u090d\5\u00c4c\2\u090c\u090a"+
		"\3\2\2\2\u090c\u090b\3\2\2\2\u090d\u0910\3\2\2\2\u090e\u090c\3\2\2\2\u090e"+
		"\u090f\3\2\2\2\u090f\u0911\3\2\2\2\u0910\u090e\3\2\2\2\u0911\u0912\7\u00a5"+
		"\2\2\u0912\u00bf\3\2\2\2\u0913\u091a\7\u008c\2\2\u0914\u0919\5\u00c6d"+
		"\2\u0915\u0919\5\u00c8e\2\u0916\u0919\5\u00be`\2\u0917\u0919\7\u00ab\2"+
		"\2\u0918\u0914\3\2\2\2\u0918\u0915\3\2\2\2\u0918\u0916\3\2\2\2\u0918\u0917"+
		"\3\2\2\2\u0919\u091c\3\2\2\2\u091a\u0918\3\2\2\2\u091a\u091b\3\2\2\2\u091b"+
		"\u091d\3\2\2\2\u091c\u091a\3\2\2\2\u091d\u091e\7\u00aa\2\2\u091e\u00c1"+
		"\3\2\2\2\u091f\u0920\t\5\2\2\u0920\u00c3\3\2\2\2\u0921\u0922\7\u00a9\2"+
		"\2\u0922\u0923\5\u008aF\2\u0923\u0924\7\20\2\2\u0924\u00c5\3\2\2\2\u0925"+
		"\u0926\t\6\2\2\u0926\u00c7\3\2\2\2\u0927\u0928\7\u00af\2\2\u0928\u0929"+
		"\5\u008aF\2\u0929\u092a\7\20\2\2\u092a\u00c9\3\2\2\2\u092b\u092d\5\u0128"+
		"\u0095\2\u092c\u092b\3\2\2\2\u092d\u0930\3\2\2\2\u092e\u092c\3\2\2\2\u092e"+
		"\u092f\3\2\2\2\u092f\u095f\3\2\2\2\u0930\u092e\3\2\2\2\u0931\u0935\7\17"+
		"\2\2\u0932\u0934\7\7\2\2\u0933\u0932\3\2\2\2\u0934\u0937\3\2\2\2\u0935"+
		"\u0933\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0938\3\2\2\2\u0937\u0935\3\2"+
		"\2\2\u0938\u093c\5\u0082B\2\u0939\u093b\7\7\2\2\u093a\u0939\3\2\2\2\u093b"+
		"\u093e\3\2\2\2\u093c\u093a\3\2\2\2\u093c\u093d\3\2\2\2\u093d\u093f\3\2"+
		"\2\2\u093e\u093c\3\2\2\2\u093f\u0940\7\20\2\2\u0940\u0960\3\2\2\2\u0941"+
		"\u0945\7\17\2\2\u0942\u0944\7\7\2\2\u0943\u0942\3\2\2\2\u0944\u0947\3"+
		"\2\2\2\u0945\u0943\3\2\2\2\u0945\u0946\3\2\2\2\u0946\u0948\3\2\2\2\u0947"+
		"\u0945\3\2\2\2\u0948\u094c\5\u00ccg\2\u0949\u094b\7\7\2\2\u094a\u0949"+
		"\3\2\2\2\u094b\u094e\3\2\2\2\u094c\u094a\3\2\2\2\u094c\u094d\3\2\2\2\u094d"+
		"\u094f\3\2\2\2\u094e\u094c\3\2\2\2\u094f\u0953\7#\2\2\u0950\u0952\7\7"+
		"\2\2\u0951\u0950\3\2\2\2\u0952\u0955\3\2\2\2\u0953\u0951\3\2\2\2\u0953"+
		"\u0954\3\2\2\2\u0954\u0956\3\2\2\2\u0955\u0953\3\2\2\2\u0956\u095a\5\u0082"+
		"B\2\u0957\u0959\7\7\2\2\u0958\u0957\3\2\2\2\u0959\u095c\3\2\2\2\u095a"+
		"\u0958\3\2\2\2\u095a\u095b\3\2\2\2\u095b\u095d\3\2\2\2\u095c\u095a\3\2"+
		"\2\2\u095d\u095e\7\20\2\2\u095e\u0960\3\2\2\2\u095f\u0931\3\2\2\2\u095f"+
		"\u0941\3\2\2\2\u0960\u00cb\3\2\2\2\u0961\u0963\5\u00ceh\2\u0962\u0961"+
		"\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u0974\3\2\2\2\u0964\u0966\7\7\2\2\u0965"+
		"\u0964\3\2\2\2\u0966\u0969\3\2\2\2\u0967\u0965\3\2\2\2\u0967\u0968\3\2"+
		"\2\2\u0968\u096a\3\2\2\2\u0969\u0967\3\2\2\2\u096a\u096e\7\n\2\2\u096b"+
		"\u096d\7\7\2\2\u096c\u096b\3\2\2\2\u096d\u0970\3\2\2\2\u096e\u096c\3\2"+
		"\2\2\u096e\u096f\3\2\2\2\u096f\u0971\3\2\2\2\u0970\u096e\3\2\2\2\u0971"+
		"\u0973\5\u00ceh\2\u0972\u0967\3\2\2\2\u0973\u0976\3\2\2\2\u0974\u0972"+
		"\3\2\2\2\u0974\u0975\3\2\2\2\u0975\u00cd\3\2\2\2\u0976\u0974\3\2\2\2\u0977"+
		"\u098a\5\\/\2\u0978\u0987\5Z.\2\u0979\u097b\7\7\2\2\u097a\u0979\3\2\2"+
		"\2\u097b\u097e\3\2\2\2\u097c\u097a\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u097f"+
		"\3\2\2\2\u097e\u097c\3\2\2\2\u097f\u0983\7\33\2\2\u0980\u0982\7\7\2\2"+
		"\u0981\u0980\3\2\2\2\u0982\u0985\3\2\2\2\u0983\u0981\3\2\2\2\u0983\u0984"+
		"\3\2\2\2\u0984\u0986\3\2\2\2\u0985\u0983\3\2\2\2\u0986\u0988\5h\65\2\u0987"+
		"\u097c\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u098a\3\2\2\2\u0989\u0977\3\2"+
		"\2\2\u0989\u0978\3\2\2\2\u098a\u00cf\3\2\2\2\u098b\u099a\7@\2\2\u098c"+
		"\u098e\7\7\2\2\u098d\u098c\3\2\2\2\u098e\u0991\3\2\2\2\u098f\u098d\3\2"+
		"\2\2\u098f\u0990\3\2\2\2\u0990\u0992\3\2\2\2\u0991\u098f\3\2\2\2\u0992"+
		"\u0996\7\33\2\2\u0993\u0995\7\7\2\2\u0994\u0993\3\2\2\2\u0995\u0998\3"+
		"\2\2\2\u0996\u0994\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u0999\3\2\2\2\u0998"+
		"\u0996\3\2\2\2\u0999\u099b\5&\24\2\u099a\u098f\3\2\2\2\u099a\u099b\3\2"+
		"\2\2\u099b\u099f\3\2\2\2\u099c\u099e\7\7\2\2\u099d\u099c\3\2\2\2\u099e"+
		"\u09a1\3\2\2\2\u099f\u099d\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u09a2\3\2"+
		"\2\2\u09a1\u099f\3\2\2\2\u09a2\u09a3\5.\30\2\u09a3\u00d1\3\2\2\2\u09a4"+
		"\u09a6\7\r\2\2\u09a5\u09a7\5\u008aF\2\u09a6\u09a5\3\2\2\2\u09a6\u09a7"+
		"\3\2\2\2\u09a7\u09ac\3\2\2\2\u09a8\u09a9\7\n\2\2\u09a9\u09ab\5\u008aF"+
		"\2\u09aa\u09a8\3\2\2\2\u09ab\u09ae\3\2\2\2\u09ac\u09aa\3\2\2\2\u09ac\u09ad"+
		"\3\2\2\2\u09ad\u09af\3\2\2\2\u09ae\u09ac\3\2\2\2\u09af\u09b0\7\16\2\2"+
		"\u09b0\u00d3\3\2\2\2\u09b1\u09b3\7H\2\2\u09b2\u09b4\7\u0097\2\2\u09b3"+
		"\u09b2\3\2\2\2\u09b3\u09b4\3\2\2\2\u09b4\u00d5\3\2\2\2\u09b5\u09c6\7I"+
		"\2\2\u09b6\u09ba\7-\2\2\u09b7\u09b9\7\7\2\2\u09b8\u09b7\3\2\2\2\u09b9"+
		"\u09bc\3\2\2\2\u09ba\u09b8\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bd\3\2"+
		"\2\2\u09bc\u09ba\3\2\2\2\u09bd\u09c1\5h\65\2\u09be\u09c0\7\7\2\2\u09bf"+
		"\u09be\3\2\2\2\u09c0\u09c3\3\2\2\2\u09c1\u09bf\3\2\2\2\u09c1\u09c2\3\2"+
		"\2\2\u09c2\u09c4\3\2\2\2\u09c3\u09c1\3\2\2\2\u09c4\u09c5\7.\2\2\u09c5"+
		"\u09c7\3\2\2\2\u09c6\u09b6\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7\u09c9\3\2"+
		"\2\2\u09c8\u09ca\7\u0097\2\2\u09c9\u09c8\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca"+
		"\u00d7\3\2\2\2\u09cb\u09ce\5\u00dan\2\u09cc\u09ce\5\u00dep\2\u09cd\u09cb"+
		"\3\2\2\2\u09cd\u09cc\3\2\2\2\u09ce\u00d9\3\2\2\2\u09cf\u09d3\7L\2\2\u09d0"+
		"\u09d2\7\7\2\2\u09d1\u09d0\3\2\2\2\u09d2\u09d5\3\2\2\2\u09d3\u09d1\3\2"+
		"\2\2\u09d3\u09d4\3\2\2\2\u09d4\u09d6\3\2\2\2\u09d5\u09d3\3\2\2\2\u09d6"+
		"\u09d7\7\13\2\2\u09d7\u09d8\5\u008aF\2\u09d8\u09dc\7\f\2\2\u09d9\u09db"+
		"\7\7\2\2\u09da\u09d9\3\2\2\2\u09db\u09de\3\2\2\2\u09dc\u09da\3\2\2\2\u09dc"+
		"\u09dd\3\2\2\2\u09dd\u09e0\3\2\2\2\u09de\u09dc\3\2\2\2\u09df\u09e1\5\u00dc"+
		"o\2\u09e0\u09df\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e3\3\2\2\2\u09e2"+
		"\u09e4\7\34\2\2\u09e3\u09e2\3\2\2\2\u09e3\u09e4\3\2\2\2\u09e4\u09f5\3"+
		"\2\2\2\u09e5\u09e7\7\7\2\2\u09e6\u09e5\3\2\2\2\u09e7\u09ea\3\2\2\2\u09e8"+
		"\u09e6\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09eb\3\2\2\2\u09ea\u09e8\3\2"+
		"\2\2\u09eb\u09ef\7M\2\2\u09ec\u09ee\7\7\2\2\u09ed\u09ec\3\2\2\2\u09ee"+
		"\u09f1\3\2\2\2\u09ef\u09ed\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u09f3\3\2"+
		"\2\2\u09f1\u09ef\3\2\2\2\u09f2\u09f4\5\u00dco\2\u09f3\u09f2\3\2\2\2\u09f3"+
		"\u09f4\3\2\2\2\u09f4\u09f6\3\2\2\2\u09f5\u09e8\3\2\2\2\u09f5\u09f6\3\2"+
		"\2\2\u09f6\u00db\3\2\2\2\u09f7\u09fa\5\u0080A\2\u09f8\u09fa\5\u008aF\2"+
		"\u09f9\u09f7\3\2\2\2\u09f9\u09f8\3\2\2\2\u09fa\u00dd\3\2\2\2\u09fb\u09ff"+
		"\7N\2\2\u09fc\u09fe\7\7\2\2\u09fd\u09fc\3\2\2\2\u09fe\u0a01\3\2\2\2\u09ff"+
		"\u09fd\3\2\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a06\3\2\2\2\u0a01\u09ff\3\2"+
		"\2\2\u0a02\u0a03\7\13\2\2\u0a03\u0a04\5\u008aF\2\u0a04\u0a05\7\f\2\2\u0a05"+
		"\u0a07\3\2\2\2\u0a06\u0a02\3\2\2\2\u0a06\u0a07\3\2\2\2\u0a07\u0a0b\3\2"+
		"\2\2\u0a08\u0a0a\7\7\2\2\u0a09\u0a08\3\2\2\2\u0a0a\u0a0d\3\2\2\2\u0a0b"+
		"\u0a09\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0e\3\2\2\2\u0a0d\u0a0b\3\2"+
		"\2\2\u0a0e\u0a12\7\17\2\2\u0a0f\u0a11\7\7\2\2\u0a10\u0a0f\3\2\2\2\u0a11"+
		"\u0a14\3\2\2\2\u0a12\u0a10\3\2\2\2\u0a12\u0a13\3\2\2\2\u0a13\u0a1e\3\2"+
		"\2\2\u0a14\u0a12\3\2\2\2\u0a15\u0a19\5\u00e0q\2\u0a16\u0a18\7\7\2\2\u0a17"+
		"\u0a16\3\2\2\2\u0a18\u0a1b\3\2\2\2\u0a19\u0a17\3\2\2\2\u0a19\u0a1a\3\2"+
		"\2\2\u0a1a\u0a1d\3\2\2\2\u0a1b\u0a19\3\2\2\2\u0a1c\u0a15\3\2\2\2\u0a1d"+
		"\u0a20\3\2\2\2\u0a1e\u0a1c\3\2\2\2\u0a1e\u0a1f\3\2\2\2\u0a1f\u0a24\3\2"+
		"\2\2\u0a20\u0a1e\3\2\2\2\u0a21\u0a23\7\7\2\2\u0a22\u0a21\3\2\2\2\u0a23"+
		"\u0a26\3\2\2\2\u0a24\u0a22\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25\u0a27\3\2"+
		"\2\2\u0a26\u0a24\3\2\2\2\u0a27\u0a28\7\20\2\2\u0a28\u00df\3\2\2\2\u0a29"+
		"\u0a3a\5\u00e2r\2\u0a2a\u0a2c\7\7\2\2\u0a2b\u0a2a\3\2\2\2\u0a2c\u0a2f"+
		"\3\2\2\2\u0a2d\u0a2b\3\2\2\2\u0a2d\u0a2e\3\2\2\2\u0a2e\u0a30\3\2\2\2\u0a2f"+
		"\u0a2d\3\2\2\2\u0a30\u0a34\7\n\2\2\u0a31\u0a33\7\7\2\2\u0a32\u0a31\3\2"+
		"\2\2\u0a33\u0a36\3\2\2\2\u0a34\u0a32\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35"+
		"\u0a37\3\2\2\2\u0a36\u0a34\3\2\2\2\u0a37\u0a39\5\u00e2r\2\u0a38\u0a2d"+
		"\3\2\2\2\u0a39\u0a3c\3\2\2\2\u0a3a\u0a38\3\2\2\2\u0a3a\u0a3b\3\2\2\2\u0a3b"+
		"\u0a40\3\2\2\2\u0a3c\u0a3a\3\2\2\2\u0a3d\u0a3f\7\7\2\2\u0a3e\u0a3d\3\2"+
		"\2\2\u0a3f\u0a42\3\2\2\2\u0a40\u0a3e\3\2\2\2\u0a40\u0a41\3\2\2\2\u0a41"+
		"\u0a43\3\2\2\2\u0a42\u0a40\3\2\2\2\u0a43\u0a47\7#\2\2\u0a44\u0a46\7\7"+
		"\2\2\u0a45\u0a44\3\2\2\2\u0a46\u0a49\3\2\2\2\u0a47\u0a45\3\2\2\2\u0a47"+
		"\u0a48\3\2\2\2\u0a48\u0a4a\3\2\2\2\u0a49\u0a47\3\2\2\2\u0a4a\u0a4c\5\u00dc"+
		"o\2\u0a4b\u0a4d\5\u0136\u009c\2\u0a4c\u0a4b\3\2\2\2\u0a4c\u0a4d\3\2\2"+
		"\2\u0a4d\u0a5e\3\2\2\2\u0a4e\u0a52\7M\2\2\u0a4f\u0a51\7\7\2\2\u0a50\u0a4f"+
		"\3\2\2\2\u0a51\u0a54\3\2\2\2\u0a52\u0a50\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53"+
		"\u0a55\3\2\2\2\u0a54\u0a52\3\2\2\2\u0a55\u0a59\7#\2\2\u0a56\u0a58\7\7"+
		"\2\2\u0a57\u0a56\3\2\2\2\u0a58\u0a5b\3\2\2\2\u0a59\u0a57\3\2\2\2\u0a59"+
		"\u0a5a\3\2\2\2\u0a5a\u0a5c\3\2\2\2\u0a5b\u0a59\3\2\2\2\u0a5c\u0a5e\5\u00dc"+
		"o\2\u0a5d\u0a29\3\2\2\2\u0a5d\u0a4e\3\2\2\2\u0a5e\u00e1\3\2\2\2\u0a5f"+
		"\u0a63\5\u008aF\2\u0a60\u0a63\5\u00e4s\2\u0a61\u0a63\5\u00e6t\2\u0a62"+
		"\u0a5f\3\2\2\2\u0a62\u0a60\3\2\2\2\u0a62\u0a61\3\2\2\2\u0a63\u00e3\3\2"+
		"\2\2\u0a64\u0a68\5\u0100\u0081\2\u0a65\u0a67\7\7\2\2\u0a66\u0a65\3\2\2"+
		"\2\u0a67\u0a6a\3\2\2\2\u0a68\u0a66\3\2\2\2\u0a68\u0a69\3\2\2\2\u0a69\u0a6b"+
		"\3\2\2\2\u0a6a\u0a68\3\2\2\2\u0a6b\u0a6c\5\u008aF\2\u0a6c\u00e5\3\2\2"+
		"\2\u0a6d\u0a71\5\u0102\u0082\2\u0a6e\u0a70\7\7\2\2\u0a6f\u0a6e\3\2\2\2"+
		"\u0a70\u0a73\3\2\2\2\u0a71\u0a6f\3\2\2\2\u0a71\u0a72\3\2\2\2\u0a72\u0a74"+
		"\3\2\2\2\u0a73\u0a71\3\2\2\2\u0a74\u0a75\5h\65\2\u0a75\u00e7\3\2\2\2\u0a76"+
		"\u0a7a\7O\2\2\u0a77\u0a79\7\7\2\2\u0a78\u0a77\3\2\2\2\u0a79\u0a7c\3\2"+
		"\2\2\u0a7a\u0a78\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a7d\3\2\2\2\u0a7c"+
		"\u0a7a\3\2\2\2\u0a7d\u0a87\5\u0080A\2\u0a7e\u0a80\7\7\2\2\u0a7f\u0a7e"+
		"\3\2\2\2\u0a80\u0a83\3\2\2\2\u0a81\u0a7f\3\2\2\2\u0a81\u0a82\3\2\2\2\u0a82"+
		"\u0a84\3\2\2\2\u0a83\u0a81\3\2\2\2\u0a84\u0a86\5\u00eav\2\u0a85\u0a81"+
		"\3\2\2\2\u0a86\u0a89\3\2\2\2\u0a87\u0a85\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88"+
		"\u0a91\3\2\2\2\u0a89\u0a87\3\2\2\2\u0a8a\u0a8c\7\7\2\2\u0a8b\u0a8a\3\2"+
		"\2\2\u0a8c\u0a8f\3\2\2\2\u0a8d\u0a8b\3\2\2\2\u0a8d\u0a8e\3\2\2\2\u0a8e"+
		"\u0a90\3\2\2\2\u0a8f\u0a8d\3\2\2\2\u0a90\u0a92\5\u00ecw\2\u0a91\u0a8d"+
		"\3\2\2\2\u0a91\u0a92\3\2\2\2\u0a92\u00e9\3\2\2\2\u0a93\u0a97\7P\2\2\u0a94"+
		"\u0a96\7\7\2\2\u0a95\u0a94\3\2\2\2\u0a96\u0a99\3\2\2\2\u0a97\u0a95\3\2"+
		"\2\2\u0a97\u0a98\3\2\2\2\u0a98\u0a9a\3\2\2\2\u0a99\u0a97\3\2\2\2\u0a9a"+
		"\u0a9e\7\13\2\2\u0a9b\u0a9d\5\u0128\u0095\2\u0a9c\u0a9b\3\2\2\2\u0a9d"+
		"\u0aa0\3\2\2\2\u0a9e\u0a9c\3\2\2\2\u0a9e\u0a9f\3\2\2\2\u0a9f\u0aa1\3\2"+
		"\2\2\u0aa0\u0a9e\3\2\2\2\u0aa1\u0aa2\5\u0134\u009b\2\u0aa2\u0aa3\7\33"+
		"\2\2\u0aa3\u0aa4\5v<\2\u0aa4\u0aa8\7\f\2\2\u0aa5\u0aa7\7\7\2\2\u0aa6\u0aa5"+
		"\3\2\2\2\u0aa7\u0aaa\3\2\2\2\u0aa8\u0aa6\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9"+
		"\u0aab\3\2\2\2\u0aaa\u0aa8\3\2\2\2\u0aab\u0aac\5\u0080A\2\u0aac\u00eb"+
		"\3\2\2\2\u0aad\u0ab1\7Q\2\2\u0aae\u0ab0\7\7\2\2\u0aaf\u0aae\3\2\2\2\u0ab0"+
		"\u0ab3\3\2\2\2\u0ab1\u0aaf\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0ab4\3\2"+
		"\2\2\u0ab3\u0ab1\3\2\2\2\u0ab4\u0ab5\5\u0080A\2\u0ab5\u00ed\3\2\2\2\u0ab6"+
		"\u0aba\5\u00f0y\2\u0ab7\u0aba\5\u00f2z\2\u0ab8\u0aba\5\u00f4{\2\u0ab9"+
		"\u0ab6\3\2\2\2\u0ab9\u0ab7\3\2\2\2\u0ab9\u0ab8\3\2\2\2\u0aba\u00ef\3\2"+
		"\2\2\u0abb\u0abf\7R\2\2\u0abc\u0abe\7\7\2\2\u0abd\u0abc\3\2\2\2\u0abe"+
		"\u0ac1\3\2\2\2\u0abf\u0abd\3\2\2\2\u0abf\u0ac0\3\2\2\2\u0ac0\u0ac2\3\2"+
		"\2\2\u0ac1\u0abf\3\2\2\2\u0ac2\u0ac6\7\13\2\2\u0ac3\u0ac5\5\u0128\u0095"+
		"\2\u0ac4\u0ac3\3\2\2\2\u0ac5\u0ac8\3\2\2\2\u0ac6\u0ac4\3\2\2\2\u0ac6\u0ac7"+
		"\3\2\2\2\u0ac7\u0acb\3\2\2\2\u0ac8\u0ac6\3\2\2\2\u0ac9\u0acc\5\\/\2\u0aca"+
		"\u0acc\5Z.\2\u0acb\u0ac9\3\2\2\2\u0acb\u0aca\3\2\2\2\u0acc\u0acd\3\2\2"+
		"\2\u0acd\u0ace\7[\2\2\u0ace\u0acf\5\u008aF\2\u0acf\u0ad3\7\f\2\2\u0ad0"+
		"\u0ad2\7\7\2\2\u0ad1\u0ad0\3\2\2\2\u0ad2\u0ad5\3\2\2\2\u0ad3\u0ad1\3\2"+
		"\2\2\u0ad3\u0ad4\3\2\2\2\u0ad4\u0ad7\3\2\2\2\u0ad5\u0ad3\3\2\2\2\u0ad6"+
		"\u0ad8\5\u00dco\2\u0ad7\u0ad6\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8\u00f1"+
		"\3\2\2\2\u0ad9\u0add\7T\2\2\u0ada\u0adc\7\7\2\2\u0adb\u0ada\3\2\2\2\u0adc"+
		"\u0adf\3\2\2\2\u0add\u0adb\3\2\2\2\u0add\u0ade\3\2\2\2\u0ade\u0ae0\3\2"+
		"\2\2\u0adf\u0add\3\2\2\2\u0ae0\u0ae1\7\13\2\2\u0ae1\u0ae2\5\u008aF\2\u0ae2"+
		"\u0ae6\7\f\2\2\u0ae3\u0ae5\7\7\2\2\u0ae4\u0ae3\3\2\2\2\u0ae5\u0ae8\3\2"+
		"\2\2\u0ae6\u0ae4\3\2\2\2\u0ae6\u0ae7\3\2\2\2\u0ae7\u0aea\3\2\2\2\u0ae8"+
		"\u0ae6\3\2\2\2\u0ae9\u0aeb\5\u00dco\2\u0aea\u0ae9\3\2\2\2\u0aea\u0aeb"+
		"\3\2\2\2\u0aeb\u00f3\3\2\2\2\u0aec\u0af0\7S\2\2\u0aed\u0aef\7\7\2\2\u0aee"+
		"\u0aed\3\2\2\2\u0aef\u0af2\3\2\2\2\u0af0\u0aee\3\2\2\2\u0af0\u0af1\3\2"+
		"\2\2\u0af1\u0af4\3\2\2\2\u0af2\u0af0\3\2\2\2\u0af3\u0af5\5\u00dco\2\u0af4"+
		"\u0af3\3\2\2\2\u0af4\u0af5\3\2\2\2\u0af5\u0af9\3\2\2\2\u0af6\u0af8\7\7"+
		"\2\2\u0af7\u0af6\3\2\2\2\u0af8\u0afb\3\2\2\2\u0af9\u0af7\3\2\2\2\u0af9"+
		"\u0afa\3\2\2\2\u0afa\u0afc\3\2\2\2\u0afb\u0af9\3\2\2\2\u0afc\u0b00\7T"+
		"\2\2\u0afd\u0aff\7\7\2\2\u0afe\u0afd\3\2\2\2\u0aff\u0b02\3\2\2\2\u0b00"+
		"\u0afe\3\2\2\2\u0b00\u0b01\3\2\2\2\u0b01\u0b03\3\2\2\2\u0b02\u0b00\3\2"+
		"\2\2\u0b03\u0b04\7\13\2\2\u0b04\u0b05\5\u008aF\2\u0b05\u0b06\7\f\2\2\u0b06"+
		"\u00f5\3\2\2\2\u0b07\u0b0b\7U\2\2\u0b08\u0b0a\7\7\2\2\u0b09\u0b08\3\2"+
		"\2\2\u0b0a\u0b0d\3\2\2\2\u0b0b\u0b09\3\2\2\2\u0b0b\u0b0c\3\2\2\2\u0b0c"+
		"\u0b0e\3\2\2\2\u0b0d\u0b0b\3\2\2\2\u0b0e\u0b18\5\u008aF\2\u0b0f\u0b11"+
		"\t\7\2\2\u0b10\u0b12\5\u008aF\2\u0b11\u0b10\3\2\2\2\u0b11\u0b12\3\2\2"+
		"\2\u0b12\u0b18\3\2\2\2\u0b13\u0b18\7W\2\2\u0b14\u0b18\78\2\2\u0b15\u0b18"+
		"\7X\2\2\u0b16\u0b18\79\2\2\u0b17\u0b07\3\2\2\2\u0b17\u0b0f\3\2\2\2\u0b17"+
		"\u0b13\3\2\2\2\u0b17\u0b14\3\2\2\2\u0b17\u0b15\3\2\2\2\u0b17\u0b16\3\2"+
		"\2\2\u0b18\u00f7\3\2\2\2\u0b19\u0b23\5v<\2\u0b1a\u0b1e\7+\2\2\u0b1b\u0b1d"+
		"\7\7\2\2\u0b1c\u0b1b\3\2\2\2\u0b1d\u0b20\3\2\2\2\u0b1e\u0b1c\3\2\2\2\u0b1e"+
		"\u0b1f\3\2\2\2\u0b1f\u0b22\3\2\2\2\u0b20\u0b1e\3\2\2\2\u0b21\u0b1a\3\2"+
		"\2\2\u0b22\u0b25\3\2\2\2\u0b23\u0b21\3\2\2\2\u0b23\u0b24\3\2\2\2\u0b24"+
		"\u0b27\3\2\2\2\u0b25\u0b23\3\2\2\2\u0b26\u0b19\3\2\2\2\u0b26\u0b27\3\2"+
		"\2\2\u0b27\u0b2b\3\2\2\2\u0b28\u0b2a\7\7\2\2\u0b29\u0b28\3\2\2\2\u0b2a"+
		"\u0b2d\3\2\2\2\u0b2b\u0b29\3\2\2\2\u0b2b\u0b2c\3\2\2\2\u0b2c\u0b2e\3\2"+
		"\2\2\u0b2d\u0b2b\3\2\2\2\u0b2e\u0b32\t\b\2\2\u0b2f\u0b31\7\7\2\2\u0b30"+
		"\u0b2f\3\2\2\2\u0b31\u0b34\3\2\2\2\u0b32\u0b30\3\2\2\2\u0b32\u0b33\3\2"+
		"\2\2\u0b33\u0b37\3\2\2\2\u0b34\u0b32\3\2\2\2\u0b35\u0b38\5\u0132\u009a"+
		"\2\u0b36\u0b38\7=\2\2\u0b37\u0b35\3\2\2\2\u0b37\u0b36\3\2\2\2\u0b38\u00f9"+
		"\3\2\2\2\u0b39\u0b3a\t\t\2\2\u0b3a\u00fb\3\2\2\2\u0b3b\u0b3c\t\n\2\2\u0b3c"+
		"\u00fd\3\2\2\2\u0b3d\u0b3e\t\13\2\2\u0b3e\u00ff\3\2\2\2\u0b3f\u0b40\t"+
		"\f\2\2\u0b40\u0101\3\2\2\2\u0b41\u0b42\t\r\2\2\u0b42\u0103\3\2\2\2\u0b43"+
		"\u0b44\t\16\2\2\u0b44\u0105\3\2\2\2\u0b45\u0b46\t\17\2\2\u0b46\u0107\3"+
		"\2\2\2\u0b47\u0b48\t\20\2\2\u0b48\u0109\3\2\2\2\u0b49\u0b51\7\26\2\2\u0b4a"+
		"\u0b51\7\27\2\2\u0b4b\u0b51\7\24\2\2\u0b4c\u0b51\7\25\2\2\u0b4d\u0b51"+
		"\7\32\2\2\u0b4e\u0b51\5\u0128\u0095\2\u0b4f\u0b51\5\u0126\u0094\2\u0b50"+
		"\u0b49\3\2\2\2\u0b50\u0b4a\3\2\2\2\u0b50\u0b4b\3\2\2\2\u0b50\u0b4c\3\2"+
		"\2\2\u0b50\u0b4d\3\2\2\2\u0b50\u0b4e\3\2\2\2\u0b50\u0b4f\3\2\2\2\u0b51"+
		"\u010b\3\2\2\2\u0b52\u0b62\7\26\2\2\u0b53\u0b62\7\27\2\2\u0b54\u0b55\7"+
		"\32\2\2\u0b55\u0b62\7\32\2\2\u0b56\u0b62\5\u00aaV\2\u0b57\u0b62\5\u00ae"+
		"X\2\u0b58\u0b5a\7\7\2\2\u0b59\u0b58\3\2\2\2\u0b5a\u0b5d\3\2\2\2\u0b5b"+
		"\u0b59\3\2\2\2\u0b5b\u0b5c\3\2\2\2\u0b5c\u0b5e\3\2\2\2\u0b5d\u0b5b\3\2"+
		"\2\2\u0b5e\u0b5f\5\u010e\u0088\2\u0b5f\u0b60\5\u00a4S\2\u0b60\u0b62\3"+
		"\2\2\2\u0b61\u0b52\3\2\2\2\u0b61\u0b53\3\2\2\2\u0b61\u0b54\3\2\2\2\u0b61"+
		"\u0b56\3\2\2\2\u0b61\u0b57\3\2\2\2\u0b61\u0b5b\3\2\2\2\u0b62\u010d\3\2"+
		"\2\2\u0b63\u0b67\7\t\2\2\u0b64\u0b65\7+\2\2\u0b65\u0b67\7\t\2\2\u0b66"+
		"\u0b63\3\2\2\2\u0b66\u0b64\3\2\2\2\u0b67\u010f\3\2\2\2\u0b68\u0b6b\5\u0128"+
		"\u0095\2\u0b69\u0b6b\5\u0112\u008a\2\u0b6a\u0b68\3\2\2\2\u0b6a\u0b69\3"+
		"\2\2\2\u0b6b\u0b6c\3\2\2\2\u0b6c\u0b6a\3\2\2\2\u0b6c\u0b6d\3\2\2\2\u0b6d"+
		"\u0111\3\2\2\2\u0b6e\u0b78\5\u0114\u008b\2\u0b6f\u0b78\5\u0116\u008c\2"+
		"\u0b70\u0b78\5\u0118\u008d\2\u0b71\u0b78\5\u011a\u008e\2\u0b72\u0b78\5"+
		"\u011c\u008f\2\u0b73\u0b78\5\u011e\u0090\2\u0b74\u0b78\5\u0120\u0091\2"+
		"\u0b75\u0b78\5\u0122\u0092\2\u0b76\u0b78\5\u0124\u0093\2\u0b77\u0b6e\3"+
		"\2\2\2\u0b77\u0b6f\3\2\2\2\u0b77\u0b70\3\2\2\2\u0b77\u0b71\3\2\2\2\u0b77"+
		"\u0b72\3\2\2\2\u0b77\u0b73\3\2\2\2\u0b77\u0b74\3\2\2\2\u0b77\u0b75\3\2"+
		"\2\2\u0b77\u0b76\3\2\2\2\u0b78\u0b7c\3\2\2\2\u0b79\u0b7b\7\7\2\2\u0b7a"+
		"\u0b79\3\2\2\2\u0b7b\u0b7e\3\2\2\2\u0b7c\u0b7a\3\2\2\2\u0b7c\u0b7d\3\2"+
		"\2\2\u0b7d\u0113\3\2\2\2\u0b7e\u0b7c\3\2\2\2\u0b7f\u0b80\t\21\2\2\u0b80"+
		"\u0115\3\2\2\2\u0b81\u0b82\t\22\2\2\u0b82\u0117\3\2\2\2\u0b83\u0b84\t"+
		"\23\2\2\u0b84\u0119\3\2\2\2\u0b85\u0b86\t\24\2\2\u0b86\u011b\3\2\2\2\u0b87"+
		"\u0b88\t\25\2\2\u0b88\u011d\3\2\2\2\u0b89\u0b8a\7}\2\2\u0b8a\u011f\3\2"+
		"\2\2\u0b8b\u0b8c\t\26\2\2\u0b8c\u0121\3\2\2\2\u0b8d\u0b8e\t\27\2\2\u0b8e"+
		"\u0123\3\2\2\2\u0b8f\u0b90\7\u0082\2\2\u0b90\u0125\3\2\2\2\u0b91\u0b95"+
		"\7\u0098\2\2\u0b92\u0b94\7\7\2\2\u0b93\u0b92\3\2\2\2\u0b94\u0b97\3\2\2"+
		"\2\u0b95\u0b93\3\2\2\2\u0b95\u0b96\3\2\2\2\u0b96\u0127\3\2\2\2\u0b97\u0b95"+
		"\3\2\2\2\u0b98\u0b9b\5\u012a\u0096\2\u0b99\u0b9b\5\u012c\u0097\2\u0b9a"+
		"\u0b98\3\2\2\2\u0b9a\u0b99\3\2\2\2\u0b9b\u0b9f\3\2\2\2\u0b9c\u0b9e\7\7"+
		"\2\2\u0b9d\u0b9c\3\2\2\2\u0b9e\u0ba1\3\2\2\2\u0b9f\u0b9d\3\2\2\2\u0b9f"+
		"\u0ba0\3\2\2\2\u0ba0\u0129\3\2\2\2\u0ba1\u0b9f\3\2\2\2\u0ba2\u0ba6\5\u012e"+
		"\u0098\2\u0ba3\u0ba5\7\7\2\2\u0ba4\u0ba3\3\2\2\2\u0ba5\u0ba8\3\2\2\2\u0ba6"+
		"\u0ba4\3\2\2\2\u0ba6\u0ba7\3\2\2\2\u0ba7\u0ba9\3\2\2\2\u0ba8\u0ba6\3\2"+
		"\2\2\u0ba9\u0bad\7\33\2\2\u0baa\u0bac\7\7\2\2\u0bab\u0baa\3\2\2\2\u0bac"+
		"\u0baf\3\2\2\2\u0bad\u0bab\3\2\2\2\u0bad\u0bae\3\2\2\2\u0bae\u0bb0\3\2"+
		"\2\2\u0baf\u0bad\3\2\2\2\u0bb0\u0bb1\5\u0130\u0099\2\u0bb1\u0bc6\3\2\2"+
		"\2\u0bb2\u0bba\7\u0097\2\2\u0bb3\u0bb5\7\7\2\2\u0bb4\u0bb3\3\2\2\2\u0bb5"+
		"\u0bb8\3\2\2\2\u0bb6\u0bb4\3\2\2\2\u0bb6\u0bb7\3\2\2\2\u0bb7\u0bb9\3\2"+
		"\2\2\u0bb8\u0bb6\3\2\2\2\u0bb9\u0bbb\5\u00b2Z\2\u0bba\u0bb6\3\2\2\2\u0bba"+
		"\u0bbb\3\2\2\2\u0bbb\u0bc3\3\2\2\2\u0bbc\u0bbe\7\7\2\2\u0bbd\u0bbc\3\2"+
		"\2\2\u0bbe\u0bc1\3\2\2\2\u0bbf\u0bbd\3\2\2\2\u0bbf\u0bc0\3\2\2\2\u0bc0"+
		"\u0bc2\3\2\2\2\u0bc1\u0bbf\3\2\2\2\u0bc2\u0bc4\5\u00b0Y\2\u0bc3\u0bbf"+
		"\3\2\2\2\u0bc3\u0bc4\3\2\2\2\u0bc4\u0bc6\3\2\2\2\u0bc5\u0ba2\3\2\2\2\u0bc5"+
		"\u0bb2\3\2\2\2\u0bc6\u012b\3\2\2\2\u0bc7\u0bc8\5\u012e\u0098\2\u0bc8\u0bc9"+
		"\7\33\2\2\u0bc9\u0bcb\7\r\2\2\u0bca\u0bcc\5\u0130\u0099\2\u0bcb\u0bca"+
		"\3\2\2\2\u0bcc\u0bcd\3\2\2\2\u0bcd\u0bcb\3\2\2\2\u0bcd\u0bce\3\2\2\2\u0bce"+
		"\u0bcf\3\2\2\2\u0bcf\u0bd0\7\16\2\2\u0bd0\u0bdb\3\2\2\2\u0bd1\u0bd2\7"+
		"*\2\2\u0bd2\u0bd4\7\r\2\2\u0bd3\u0bd5\5\u0130\u0099\2\u0bd4\u0bd3\3\2"+
		"\2\2\u0bd5\u0bd6\3\2\2\2\u0bd6\u0bd4\3\2\2\2\u0bd6\u0bd7\3\2\2\2\u0bd7"+
		"\u0bd8\3\2\2\2\u0bd8\u0bd9\7\16\2\2\u0bd9\u0bdb\3\2\2\2\u0bda\u0bc7\3"+
		"\2\2\2\u0bda\u0bd1\3\2\2\2\u0bdb\u012d\3\2\2\2\u0bdc\u0bdd\t\30\2\2\u0bdd"+
		"\u012f\3\2\2\2\u0bde\u0be0\5\u0132\u009a\2\u0bdf\u0be1\5\u00b2Z\2\u0be0"+
		"\u0bdf\3\2\2\2\u0be0\u0be1\3\2\2\2\u0be1\u0be3\3\2\2\2\u0be2\u0be4\5\u00b0"+
		"Y\2\u0be3\u0be2\3\2\2\2\u0be3\u0be4\3\2\2\2\u0be4\u0131\3\2\2\2\u0be5"+
		"\u0bf0\5\u0134\u009b\2\u0be6\u0be8\7\7\2\2\u0be7\u0be6\3\2\2\2\u0be8\u0beb"+
		"\3\2\2\2\u0be9\u0be7\3\2\2\2\u0be9\u0bea\3\2\2\2\u0bea\u0bec\3\2\2\2\u0beb"+
		"\u0be9\3\2\2\2\u0bec\u0bed\7\t\2\2\u0bed\u0bef\5\u0134\u009b\2\u0bee\u0be9"+
		"\3\2\2\2\u0bef\u0bf2\3\2\2\2\u0bf0\u0bee\3\2\2\2\u0bf0\u0bf1\3\2\2\2\u0bf1"+
		"\u0133\3\2\2\2\u0bf2\u0bf0\3\2\2\2\u0bf3\u0bf4\t\31\2\2\u0bf4\u0135\3"+
		"\2\2\2\u0bf5\u0bf7\7\7\2\2\u0bf6\u0bf5\3\2\2\2\u0bf7\u0bf8\3\2\2\2\u0bf8"+
		"\u0bf6\3\2\2\2\u0bf8\u0bf9\3\2\2\2\u0bf9\u0c08\3\2\2\2\u0bfa\u0bfc\7\7"+
		"\2\2\u0bfb\u0bfa\3\2\2\2\u0bfc\u0bff\3\2\2\2\u0bfd\u0bfb\3\2\2\2\u0bfd"+
		"\u0bfe\3\2\2\2\u0bfe\u0c00\3\2\2\2\u0bff\u0bfd\3\2\2\2\u0c00\u0c04\7\34"+
		"\2\2\u0c01\u0c03\7\7\2\2\u0c02\u0c01\3\2\2\2\u0c03\u0c06\3\2\2\2\u0c04"+
		"\u0c02\3\2\2\2\u0c04\u0c05\3\2\2\2\u0c05\u0c08\3\2\2\2\u0c06\u0c04\3\2"+
		"\2\2\u0c07\u0bf6\3\2\2\2\u0c07\u0bfd\3\2\2\2\u0c08\u0137\3\2\2\2\u0c09"+
		"\u0c0a\t\32\2\2\u0c0a\u0139\3\2\2\2\u01df\u013d\u0144\u014b\u014e\u0152"+
		"\u0155\u015a\u0162\u016a\u016f\u0172\u0176\u0179\u017e\u0180\u0185\u018d"+
		"\u0190\u019f\u01a2\u01a8\u01af\u01b3\u01b8\u01bc\u01c1\u01c8\u01cc\u01d1"+
		"\u01d5\u01da\u01e1\u01e5\u01e8\u01ee\u01f5\u01f9\u01fe\u0202\u0207\u020e"+
		"\u0212\u0217\u021b\u0220\u0224\u0227\u022d\u0234\u0238\u023d\u0241\u0246"+
		"\u024d\u0251\u0256\u025a\u025f\u0263\u0266\u026c\u0273\u0277\u027c\u0280"+
		"\u0285\u028c\u0290\u0295\u0299\u029e\u02a5\u02a9\u02ac\u02b2\u02b9\u02bd"+
		"\u02c2\u02c6\u02cb\u02d2\u02d6\u02db\u02df\u02e4\u02eb\u02ef\u02f2\u02f8"+
		"\u02ff\u0303\u0308\u030c\u0311\u0318\u031c\u0321\u0325\u032a\u0331\u0335"+
		"\u0338\u033e\u0341\u034b\u034e\u0353\u0356\u035d\u0362\u0369\u0370\u0376"+
		"\u037c\u0385\u038c\u0395\u039b\u03a1\u03aa\u03b0\u03b6\u03bf\u03c5\u03cb"+
		"\u03d8\u03dd\u03e3\u03e8\u03ee\u03f3\u03fa\u0400\u0406\u040d\u0414\u0418"+
		"\u041d\u0426\u042e\u0432\u0438\u043c\u0441\u0448\u044e\u0451\u0456\u045f"+
		"\u0464\u0467\u046d\u0471\u0476\u047a\u047f\u0483\u0486\u048c\u0493\u0498"+
		"\u049d\u04a1\u04a6\u04aa\u04af\u04b6\u04bd\u04c1\u04c6\u04ca\u04cf\u04d3"+
		"\u04db\u04de\u04e3\u04e8\u04f3\u04f7\u04fd\u0501\u0506\u050a\u0510\u0517"+
		"\u051f\u0525\u0529\u052c\u0532\u0539\u053d\u0542\u0549\u054d\u0552\u0556"+
		"\u0559\u055f\u0563\u0569\u056d\u0572\u0579\u057d\u0582\u0586\u0589\u058f"+
		"\u0593\u0598\u059f\u05a4\u05a9\u05ae\u05b3\u05b7\u05bc\u05c3\u05c7\u05cd"+
		"\u05d3\u05d5\u05dd\u05e5\u05e8\u05ec\u05f2\u05fa\u0601\u0605\u060a\u0612"+
		"\u0616\u0618\u061b\u061f\u0625\u062b\u062d\u0632\u0638\u063d\u0640\u0646"+
		"\u064d\u0651\u0656\u065d\u0666\u066d\u0674\u067a\u0680\u0686\u068b\u0692"+
		"\u0699\u069d\u06a0\u06a6\u06ad\u06b0\u06b2\u06ba\u06bf\u06c5\u06cd\u06d3"+
		"\u06da\u06dd\u06e3\u06ea\u06f2\u06f8\u06ff\u0705\u070c\u0710\u0715\u071a"+
		"\u071e\u0727\u072e\u0735\u073b\u0741\u0748\u074f\u075b\u0762\u0765\u0769"+
		"\u076c\u0770\u0775\u077b\u0783\u078a\u0792\u0799\u07a0\u07a6\u07ad\u07b4"+
		"\u07ba\u07c2\u07c9\u07d1\u07d6\u07dd\u07e4\u07ea\u07ef\u07f5\u07fc\u0802"+
		"\u080a\u0811\u0819\u081f\u0827\u082e\u0836\u083d\u0844\u084c\u0852\u0859"+
		"\u085e\u086d\u0875\u087a\u0881\u0887\u0889\u088e\u0892\u0897\u08a2\u08a5"+
		"\u08af\u08b2\u08ba\u08c1\u08c8\u08ce\u08d4\u08d8\u08dd\u08e3\u08ea\u08ed"+
		"\u08f0\u08f5\u0903\u0907\u090c\u090e\u0918\u091a\u092e\u0935\u093c\u0945"+
		"\u094c\u0953\u095a\u095f\u0962\u0967\u096e\u0974\u097c\u0983\u0987\u0989"+
		"\u098f\u0996\u099a\u099f\u09a6\u09ac\u09b3\u09ba\u09c1\u09c6\u09c9\u09cd"+
		"\u09d3\u09dc\u09e0\u09e3\u09e8\u09ef\u09f3\u09f5\u09f9\u09ff\u0a06\u0a0b"+
		"\u0a12\u0a19\u0a1e\u0a24\u0a2d\u0a34\u0a3a\u0a40\u0a47\u0a4c\u0a52\u0a59"+
		"\u0a5d\u0a62\u0a68\u0a71\u0a7a\u0a81\u0a87\u0a8d\u0a91\u0a97\u0a9e\u0aa8"+
		"\u0ab1\u0ab9\u0abf\u0ac6\u0acb\u0ad3\u0ad7\u0add\u0ae6\u0aea\u0af0\u0af4"+
		"\u0af9\u0b00\u0b0b\u0b11\u0b17\u0b1e\u0b23\u0b26\u0b2b\u0b32\u0b37\u0b50"+
		"\u0b5b\u0b61\u0b66\u0b6a\u0b6c\u0b77\u0b7c\u0b95\u0b9a\u0b9f\u0ba6\u0bad"+
		"\u0bb6\u0bba\u0bbf\u0bc3\u0bc5\u0bcd\u0bd6\u0bda\u0be0\u0be3\u0be9\u0bf0"+
		"\u0bf8\u0bfd\u0c04\u0c07";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}