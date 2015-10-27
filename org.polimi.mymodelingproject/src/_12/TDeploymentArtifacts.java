/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDeployment Artifacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.TDeploymentArtifacts#getDeploymentArtifact <em>Deployment Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getTDeploymentArtifacts()
 * @model extendedMetaData="name='tDeploymentArtifacts' kind='elementOnly'"
 * @generated
 */
public interface TDeploymentArtifacts extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployment Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TDeploymentArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Artifact</em>' containment reference list.
	 * @see _12._12Package#getTDeploymentArtifacts_DeploymentArtifact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeploymentArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDeploymentArtifact> getDeploymentArtifact();

} // TDeploymentArtifacts
