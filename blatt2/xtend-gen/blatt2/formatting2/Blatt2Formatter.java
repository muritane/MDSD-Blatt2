/**
 * generated by Xtext 2.17.0
 */
package blatt2.formatting2;

import blatt2.services.Blatt2GrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class Blatt2Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private Blatt2GrammarAccess _blatt2GrammarAccess;
  
  protected void _format(final /* AllocationContext */Object allocationContext, @Extension final IFormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\ntargetContainer cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final /* AssemblyContext */Object assemblyContext, @Extension final IFormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nprovidedRole cannot be resolved"
      + "\nformat cannot be resolved"
      + "\ncomponent cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  public void format(final Object allocationContext, final IFormattableDocument document) {
    if (allocationContext instanceof XtextResource) {
      _format((XtextResource)allocationContext, document);
      return;
    } else if (allocationContext instanceof EObject) {
      _format((EObject)allocationContext, document);
      return;
    } else if (allocationContext == null) {
      _format((Void)null, document);
      return;
    } else if (allocationContext != null) {
      _format(allocationContext, document);
      return;
    } else if (allocationContext != null) {
      _format(allocationContext, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(allocationContext, document).toString());
    }
  }
}
