/**
 */
package _12;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TArtifact Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.TArtifactType#getMetaType <em>Meta Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getTArtifactType()
 * @model extendedMetaData="name='tArtifactType' kind='elementOnly'"
 * @generated
 */
public interface TArtifactType extends TEntityType {
	/**
	 * Returns the value of the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Type</em>' attribute.
	 * @see #setMetaType(String)
	 * @see _12._12Package#getTArtifactType_MetaType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getMetaType();

	/**
	 * Sets the value of the '{@link _12.TArtifactType#getMetaType <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Type</em>' attribute.
	 * @see #getMetaType()
	 * @generated
	 */
	void setMetaType(String value);

} // TArtifactType
