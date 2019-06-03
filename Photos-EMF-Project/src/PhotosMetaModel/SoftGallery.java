/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soft Gallery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.SoftGallery#getDomain <em>Domain</em>}</li>
 *   <li>{@link PhotosMetaModel.SoftGallery#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link PhotosMetaModel.SoftGallery#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getSoftGallery()
 * @model
 * @generated
 */
public interface SoftGallery extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSoftGallery_Domain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Domain> getDomain();

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Architecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSoftGallery_Architecture()
	 * @model containment="true"
	 * @generated
	 */
	EList<Architecture> getArchitecture();

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Technology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSoftGallery_Technology()
	 * @model containment="true"
	 * @generated
	 */
	EList<Technology> getTechnology();

} // SoftGallery
