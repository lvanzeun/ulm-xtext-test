/*
 * generated by Xtext 2.14.0
 */
package org.ulm.metaulm.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UlmDsl2AntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/ulm/metaulm/xtext/parser/antlr/internal/InternalUlmDsl2.tokens");
	}
}
