/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timport Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.TimportTemplate#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getTimportTemplate()
 * @model
 * @generated
 */
public interface TimportTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see _12._12Package#getTimportTemplate_Value()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValue();

} // TimportTemplate
