/**
 */
package PhotosMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Photo#getName <em>Name</em>}</li>
 *   <li>{@link PhotosMetaModel.Photo#getPhotoactions <em>Photoactions</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getPhoto()
 * @model
 * @generated
 */
public interface Photo extends Entities {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getPhoto_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Photo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Photoactions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photoactions</em>' reference.
	 * @see #setPhotoactions(PhotoActions)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getPhoto_Photoactions()
	 * @model
	 * @generated
	 */
	PhotoActions getPhotoactions();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Photo#getPhotoactions <em>Photoactions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photoactions</em>' reference.
	 * @see #getPhotoactions()
	 * @generated
	 */
	void setPhotoactions(PhotoActions value);

} // Photo
