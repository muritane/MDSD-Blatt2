/*
 * generated by Xtext 2.17.0
 */
package blatt2.formatting2

import Allocation.AllocationContext
import Assembly.AssemblyContext
import Repository.Component
import Repository.Interface
import Repository.Signature
import Repository.Service
import Repository.BehaviorDescription //TODO behavioUr ?
import Repository.CompositeComponent
import blatt2.services.Blatt2GrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class Blatt2Formatter extends AbstractFormatter2 {
	
	@Inject extension Blatt2GrammarAccess

	def dispatch void format(AllocationContext allocationContext, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (container : allocationContext.targetContainer) {
			container.format
		}
	}

	def dispatch void format(AssemblyContext assemblyContext, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (role : assemblyContext.providedRole) {
			role.format
		}
		for (component : assemblyContext.component) {
			component.format
		}
	}
	
	// DONE: implement for Component(done), Interface(done), Service(done), BehaviorDescription(done), CompositeComponent(done)
	
	def dispatch void format(Component component, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (requiredInterface : component.requiredInterface) {
			requiredInterface.format
		}
		for (providedInterface : component.providedInterface) {
			providedInterface.format
		}
		for (requiredService : component.requiredService) {
			requiredService.format
		}
		for (providedService : component.providedService) {
			providedService.format
		}
		{
			component.behaviourDescription.format
		}
	}
	
	def dispatch void format(Interface interface_, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (signature : interface_.signature) {
			signature.format
		}
	}
	
	def dispatch void format(Service service, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (signature : service.correspondingSignature) {
			signature.format
		}
	}
	
	def dispatch void format(BehaviorDescription behaviorDescription, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		/*for (internalActions : behaviorDescription.internalActions)*/ {
			behaviorDescription.internalActions.format //TODO sollten mehrere sein können?
		}
		/*for (loops : behaviorDescription.loops)*/ {
			behaviorDescription.loops.format //TODO sollten mehrere sein können?
		}
		/*for (branches : behaviorDescription.branches)*/ {
			behaviorDescription.branches.format //TODO sollten mehrere sein können?
		}
	}
	
	def dispatch void format(CompositeComponent compositeComponent, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		{
			compositeComponent.encapsulatedAssemblyContext.format
		}
	}
}