/*
 * generated by Xtext 2.26.0
 */
package org.xtext.classifier.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PClassifierAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/classifier/dsl/parser/antlr/internal/InternalPClassifier.tokens");
	}
}
