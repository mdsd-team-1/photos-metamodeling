/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Photo#getAlbum <em>Album</em>}</li>
 *   <li>{@link PhotosMetaModel.Photo#getPhoto <em>Photo</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getPhoto()
 * @model
 * @generated
 */
public interface Photo extends EObject {
	/**
	 * Returns the value of the '<em><b>Album</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Album}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Album</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getPhoto_Album()
	 * @model containment="true"
	 * @generated
	 */
	EList<Album> getAlbum();

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Picture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getPhoto_Photo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Picture> getPhoto();

} // Photo
