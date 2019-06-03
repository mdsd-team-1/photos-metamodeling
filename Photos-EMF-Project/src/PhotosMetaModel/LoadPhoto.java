/**
 */
package PhotosMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Photo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.LoadPhoto#getPicture <em>Picture</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getLoadPhoto()
 * @model
 * @generated
 */
public interface LoadPhoto extends Action {
	/**
	 * Returns the value of the '<em><b>Picture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture</em>' reference.
	 * @see #setPicture(Picture)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getLoadPhoto_Picture()
	 * @model
	 * @generated
	 */
	Picture getPicture();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.LoadPhoto#getPicture <em>Picture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picture</em>' reference.
	 * @see #getPicture()
	 * @generated
	 */
	void setPicture(Picture value);

} // LoadPhoto
