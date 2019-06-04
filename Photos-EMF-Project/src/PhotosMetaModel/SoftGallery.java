/**
 */
package PhotosMetaModel;

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
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(Domain)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSoftGallery_Domain()
	 * @model containment="true"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.SoftGallery#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' containment reference.
	 * @see #setArchitecture(Architecture)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSoftGallery_Architecture()
	 * @model containment="true"
	 * @generated
	 */
	Architecture getArchitecture();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.SoftGallery#getArchitecture <em>Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' containment reference.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(Architecture value);

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' containment reference.
	 * @see #setTechnology(Technology)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSoftGallery_Technology()
	 * @model containment="true"
	 * @generated
	 */
	Technology getTechnology();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.SoftGallery#getTechnology <em>Technology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' containment reference.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(Technology value);

} // SoftGallery
