/**
 */
package PhotosMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photo Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.PhotoActions#getAlbummanagement <em>Albummanagement</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getPhotoActions()
 * @model
 * @generated
 */
public interface PhotoActions extends Functionalities {
	/**
	 * Returns the value of the '<em><b>Albummanagement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Albummanagement</em>' reference.
	 * @see #setAlbummanagement(AlbumManagement)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getPhotoActions_Albummanagement()
	 * @model
	 * @generated
	 */
	AlbumManagement getAlbummanagement();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.PhotoActions#getAlbummanagement <em>Albummanagement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Albummanagement</em>' reference.
	 * @see #getAlbummanagement()
	 * @generated
	 */
	void setAlbummanagement(AlbumManagement value);

} // PhotoActions
