/**
 */
package PhotosMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.EditProfile#getPhoto <em>Photo</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getEditProfile()
 * @model
 * @generated
 */
public interface EditProfile extends Action {
	/**
	 * Returns the value of the '<em><b>Photo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo</em>' reference.
	 * @see #setPhoto(Photo)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getEditProfile_Photo()
	 * @model
	 * @generated
	 */
	Photo getPhoto();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.EditProfile#getPhoto <em>Photo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photo</em>' reference.
	 * @see #getPhoto()
	 * @generated
	 */
	void setPhoto(Photo value);

} // EditProfile
