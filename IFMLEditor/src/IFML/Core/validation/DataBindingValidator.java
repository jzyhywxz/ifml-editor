/**
 *
 * $Id$
 */
package IFML.Core.validation;

import IFML.Core.DomainConcept;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link IFML.Core.DataBinding}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DataBindingValidator {
	boolean validate();

	boolean validateConditionalExpression(EList value);
	boolean validateVisualizationAttribute(EList value);
	boolean validateDataContextVariables(EList value);
	boolean validateDomainConcept(DomainConcept value);
}
