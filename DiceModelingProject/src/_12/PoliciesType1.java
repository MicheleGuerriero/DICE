/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policies Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.PoliciesType1#getPolicy <em>Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getPoliciesType1()
 * @model extendedMetaData="name='Policies_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface PoliciesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see _12._12Package#getPoliciesType1_Policy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Policy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TPolicy> getPolicy();

} // PoliciesType1
