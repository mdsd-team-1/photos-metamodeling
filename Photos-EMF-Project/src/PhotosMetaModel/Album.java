/**
 */
package PhotosMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Album#getUrl <em>Url</em>}</li>
 *   <li>{@link PhotosMetaModel.Album#getName <em>Name</em>}</li>
 *   <li>{@link PhotosMetaModel.Album#getAlbummanagement <em>Albummanagement</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getAlbum()
 * @model
 * @generated
 */
public interface Album extends Entities {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAlbum_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Album#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAlbum_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Album#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Albummanagement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Albummanagement</em>' reference.
	 * @see #setAlbummanagement(AlbumManagement)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAlbum_Albummanagement()
	 * @model
	 * @generated
	 */
	AlbumManagement getAlbummanagement();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Album#getAlbummanagement <em>Albummanagement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Albummanagement</em>' reference.
	 * @see #getAlbummanagement()
	 * @generated
	 */
	void setAlbummanagement(AlbumManagement value);

} // Album
