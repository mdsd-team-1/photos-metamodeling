/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Architecture#getNtier <em>Ntier</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Ntier</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.NTier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ntier</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getArchitecture_Ntier()
	 * @model containment="true"
	 * @generated
	 */
	EList<NTier> getNtier();

} // Architecture
