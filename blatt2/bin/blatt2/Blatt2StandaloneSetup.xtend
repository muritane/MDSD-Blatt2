/*
 * generated by Xtext 2.17.0
 */
package blatt2


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class Blatt2StandaloneSetup extends Blatt2StandaloneSetupGenerated {

	def static void doSetup() {
		new Blatt2StandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}