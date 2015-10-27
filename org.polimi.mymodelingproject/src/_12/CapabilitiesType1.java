/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capabilities Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.CapabilitiesType1#getCapability <em>Capability</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getCapabilitiesType1()
 * @model extendedMetaData="name='Capabilities_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface CapabilitiesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TCapabilityRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see _12._12Package#getCapabilitiesType1_Capability()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Capability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCapabilityRef> getCapability();

} // CapabilitiesType1
