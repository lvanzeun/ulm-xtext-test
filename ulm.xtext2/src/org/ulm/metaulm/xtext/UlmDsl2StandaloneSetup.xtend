/*
 * generated by Xtext 2.12.0
 */
package org.ulm.metaulm.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class UlmDsl2StandaloneSetup extends UlmDsl2StandaloneSetupGenerated {

	def static void doSetup() {
		new UlmDsl2StandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}