/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>test Ddefinition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.testDdefinition#getTestrelation <em>Testrelation</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#gettestDdefinition()
 * @model
 * @generated
 */
public interface testDdefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Testrelation</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TServiceTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testrelation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testrelation</em>' containment reference list.
	 * @see _12._12Package#gettestDdefinition_Testrelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<TServiceTemplate> getTestrelation();

} // testDdefinition
