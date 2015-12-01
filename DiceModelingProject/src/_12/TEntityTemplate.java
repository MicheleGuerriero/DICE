/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEntity Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.TEntityTemplate#getProperties <em>Properties</em>}</li>
 *   <li>{@link _12.TEntityTemplate#getPropertyConstraints <em>Property Constraints</em>}</li>
 *   <li>{@link _12.TEntityTemplate#getId <em>Id</em>}</li>
 *   <li>{@link _12.TEntityTemplate#getType <em>Type</em>}</li>
 *   <li>{@link _12.TEntityTemplate#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link _12.TEntityTemplate#getNodeHasInterface <em>Node Has Interface</em>}</li>
 *   <li>{@link _12.TEntityTemplate#getNodeHasRelations <em>Node Has Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getTEntityTemplate()
 * @model abstract="true"
 *        extendedMetaData="name='tEntityTemplate' kind='elementOnly'"
 * @generated
 */
public interface TEntityTemplate extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see _12._12Package#getTEntityTemplate_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link _12.TEntityTemplate#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

	/**
	 * Returns the value of the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Constraints</em>' containment reference.
	 * @see #setPropertyConstraints(PropertyConstraintsType)
	 * @see _12._12Package#getTEntityTemplate_PropertyConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyConstraintsType getPropertyConstraints();

	/**
	 * Sets the value of the '{@link _12.TEntityTemplate#getPropertyConstraints <em>Property Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Constraints</em>' containment reference.
	 * @see #getPropertyConstraints()
	 * @generated
	 */
	void setPropertyConstraints(PropertyConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see _12._12Package#getTEntityTemplate_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link _12.TEntityTemplate#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see _12._12Package#getTEntityTemplate_Type()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link _12.TEntityTemplate#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(AttributesType)
	 * @see _12._12Package#getTEntityTemplate_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	AttributesType getAttributes();

	/**
	 * Sets the value of the '{@link _12.TEntityTemplate#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(AttributesType value);

	/**
	 * Returns the value of the '<em><b>Node Has Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Has Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Has Interface</em>' containment reference.
	 * @see #setNodeHasInterface(TInterface)
	 * @see _12._12Package#getTEntityTemplate_NodeHasInterface()
	 * @model containment="true"
	 * @generated
	 */
	TInterface getNodeHasInterface();

	/**
	 * Sets the value of the '{@link _12.TEntityTemplate#getNodeHasInterface <em>Node Has Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Has Interface</em>' containment reference.
	 * @see #getNodeHasInterface()
	 * @generated
	 */
	void setNodeHasInterface(TInterface value);

	/**
	 * Returns the value of the '<em><b>Node Has Relations</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TRelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Has Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Has Relations</em>' containment reference list.
	 * @see _12._12Package#getTEntityTemplate_NodeHasRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TRelationshipType> getNodeHasRelations();

} // TEntityTemplate
