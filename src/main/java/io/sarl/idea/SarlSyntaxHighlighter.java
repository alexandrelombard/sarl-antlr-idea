package io.sarl.idea;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import io.sarl.antlr.SarlLexer;
import io.sarl.antlr.SarlParser;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/** A highlighter is really just a mapping from token type to
 *  some text attributes using {@link #getTokenHighlights(IElementType)}.
 *  The reason that it returns an array, TextAttributesKey[], is
 *  that you might want to mix the attributes of a few known highlighters.
 *  A {@link TextAttributesKey} is just a name for that a theme
 *  or IDE skin can set. For example, {@link DefaultLanguageHighlighterColors#KEYWORD}
 *  is the key that maps to what identifiers look like in the editor.
 *  To change it, see dialog: Editor > Colors & Fonts > Language Defaults.
 *
 *  From <a href="http://www.jetbrains.org/intellij/sdk/docs/reference_guide/custom_language_support/syntax_highlighting_and_error_highlighting.html">doc</a>:
 *  "The mapping of the TextAttributesKey to specific attributes used
 *  in an editor is defined by the EditorColorsScheme class, and can
 *  be configured by the user if the plugin provides an appropriate
 *  configuration interface.
 *  ...
 *  The syntax highlighter returns the {@link TextAttributesKey}
 * instances for each token type which needs special highlighting.
 * For highlighting lexer errors, the standard TextAttributesKey
 * for bad characters HighlighterColors.BAD_CHARACTER can be used."
 */
public class SarlSyntaxHighlighter extends SyntaxHighlighterBase {
	private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
	public static final TextAttributesKey ID =
		createTextAttributesKey("SARL_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
	public static final TextAttributesKey KEYWORD =
		createTextAttributesKey("SARL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
	public static final TextAttributesKey STRING =
		createTextAttributesKey("SARL_STRING", DefaultLanguageHighlighterColors.STRING);
	public static final TextAttributesKey LINE_COMMENT =
		createTextAttributesKey("SARL_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
	public static final TextAttributesKey BLOCK_COMMENT =
		createTextAttributesKey("SARL_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
	public static final TextAttributesKey CAPACITY_USAGE =
			createTextAttributesKey("SARL_CAPACITY_USAGE", DefaultLanguageHighlighterColors.STATIC_METHOD);
	public static final TextAttributesKey NUMBER =
			createTextAttributesKey("SARL_NUMBER", DefaultLanguageHighlighterColors.NUMBER);

	static {
		PSIElementTypeFactory.defineLanguageIElementTypes(
				SarlLanguage.INSTANCE,
				SarlParser.tokenNames,
				SarlParser.ruleNames);
	}

	@NotNull
	@Override
	public Lexer getHighlightingLexer() {
		SarlLexer lexer = new SarlLexer(null);
		return new ANTLRLexerAdaptor(SarlLanguage.INSTANCE, lexer);
	}

	@NotNull
	@Override
	public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
		if ( !(tokenType instanceof TokenIElementType) ) return EMPTY_KEYS;
		TokenIElementType myType = (TokenIElementType)tokenType;
		int ttype = myType.getANTLRTokenType();
		TextAttributesKey attrKey;
		switch ( ttype ) {
			case SarlLexer.Identifier :
				attrKey = ID;
				break;
			case SarlLexer.LineStrText :
			case SarlLexer.MultiLineStrText :
			case SarlLexer.StrExpr_IN :
				attrKey = STRING;
				break;
			case SarlLexer.ABSTRACT :
			case SarlLexer.AGENT :
			case SarlLexer.BEHAVIOR :
			case SarlLexer.CAPACITY :
			case SarlLexer.CLASS :
			case SarlLexer.EVENT :
			case SarlLexer.FUN :
			case SarlLexer.VAR :
			case SarlLexer.VAL:
			case SarlLexer.SKILL :
			case SarlLexer.WHILE :
			case SarlLexer.IF :
			case SarlLexer.ELSE :
			case SarlLexer.RETURN :
			case SarlLexer.PUBLIC :
			case SarlLexer.PRIVATE :
			case SarlLexer.PACKAGE :
			case SarlLexer.IMPORT :
			case SarlLexer.ON :
			case SarlLexer.THIS :
			case SarlLexer.WHEN :
			case SarlLexer.USES :
			case SarlLexer.NullLiteral:
				attrKey = KEYWORD;
				break;
			case SarlLexer.DelimitedComment :
				attrKey = BLOCK_COMMENT;
				break;
			case SarlLexer.LineComment :
				attrKey = LINE_COMMENT;
				break;
			case SarlLexer.DoubleLiteral:
			case SarlLexer.FloatLiteral:
			case SarlLexer.IntegerLiteral:
			case SarlLexer.LongLiteral:
			case SarlLexer.RealLiteral:
				attrKey = NUMBER;
				break;
			default :
				return EMPTY_KEYS;
		}
		return new TextAttributesKey[] {attrKey};
	}
}
