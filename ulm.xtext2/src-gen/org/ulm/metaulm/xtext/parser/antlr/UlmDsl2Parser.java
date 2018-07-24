/*
 * generated by Xtext 2.12.0
 */
package org.ulm.metaulm.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.ulm.metaulm.xtext.parser.antlr.internal.InternalUlmDsl2Parser;
import org.ulm.metaulm.xtext.services.UlmDsl2GrammarAccess;

public class UlmDsl2Parser extends AbstractAntlrParser {

	@Inject
	private UlmDsl2GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalUlmDsl2Parser createParser(XtextTokenStream stream) {
		return new InternalUlmDsl2Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public UlmDsl2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UlmDsl2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
