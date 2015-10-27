/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TExported Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.TExportedInterface#getOperation <em>Operation</em>}</li>
 *   <li>{@link _12.TExportedInterface#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getTExportedInterface()
 * @model extendedMetaData="name='tExportedInterface' kind='elementOnly'"
 * @generated
 */
public interface TExportedInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TExportedOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see _12._12Package#getTExportedInterface_Operation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Operation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TExportedOperation> getOperation();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see _12._12Package#getTExportedInterface_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link _12.TExportedInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TExportedInterface
