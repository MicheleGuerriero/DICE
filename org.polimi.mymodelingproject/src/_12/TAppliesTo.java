/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TApplies To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.TAppliesTo#getNodeTypeReference <em>Node Type Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getTAppliesTo()
 * @model extendedMetaData="name='tAppliesTo' kind='elementOnly'"
 * @generated
 */
public interface TAppliesTo extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Type Reference</b></em>' containment reference list.
	 * The list contents are of type {@link _12.NodeTypeReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type Reference</em>' containment reference list.
	 * @see _12._12Package#getTAppliesTo_NodeTypeReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NodeTypeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeTypeReferenceType> getNodeTypeReference();

} // TAppliesTo
