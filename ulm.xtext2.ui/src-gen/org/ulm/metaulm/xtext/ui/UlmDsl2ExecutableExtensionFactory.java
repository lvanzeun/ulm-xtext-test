/*
 * generated by Xtext 2.12.0
 */
package org.ulm.metaulm.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.ulm.xtext2.ui.internal.Xtext2Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UlmDsl2ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Xtext2Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Xtext2Activator.getInstance().getInjector(Xtext2Activator.ORG_ULM_METAULM_XTEXT_ULMDSL2);
	}
	
}