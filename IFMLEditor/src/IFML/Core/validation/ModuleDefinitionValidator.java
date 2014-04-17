/**
 *
 * $Id$
 */
package IFML.Core.validation;

import IFML.Core.ActivityConcept;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link IFML.Core.ModuleDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModuleDefinitionValidator {
	boolean validate();

	boolean validateInputPorts(EList value);
	boolean validateOutputPorts(EList value);
	boolean validateInteractionFlowModelElement(EList value);
	boolean validateModules(EList value);
	boolean validateActivityConcept(ActivityConcept value);
}