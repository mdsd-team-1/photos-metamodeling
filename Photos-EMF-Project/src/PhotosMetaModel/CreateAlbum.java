/**
 */
package PhotosMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.CreateAlbum#getAlbum <em>Album</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getCreateAlbum()
 * @model
 * @generated
 */
public interface CreateAlbum extends Action {
	/**
	 * Returns the value of the '<em><b>Album</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Album</em>' reference.
	 * @see #setAlbum(Album)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getCreateAlbum_Album()
	 * @model
	 * @generated
	 */
	Album getAlbum();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.CreateAlbum#getAlbum <em>Album</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Album</em>' reference.
	 * @see #getAlbum()
	 * @generated
	 */
	void setAlbum(Album value);

} // CreateAlbum
