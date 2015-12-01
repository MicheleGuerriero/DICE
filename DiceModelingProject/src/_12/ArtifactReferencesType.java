/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact References Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.ArtifactReferencesType#getArtifactReference <em>Artifact Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getArtifactReferencesType()
 * @model extendedMetaData="name='ArtifactReferences_._type' kind='elementOnly'"
 * @generated
 */
public interface ArtifactReferencesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact Reference</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TArtifactReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Reference</em>' containment reference list.
	 * @see _12._12Package#getArtifactReferencesType_ArtifactReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ArtifactReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TArtifactReference> getArtifactReference();

} // ArtifactReferencesType
