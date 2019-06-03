/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Domain#getUser_d <em>User d</em>}</li>
 *   <li>{@link PhotosMetaModel.Domain#getPhoto <em>Photo</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>User d</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.User_d}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User d</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getDomain_User_d()
	 * @model containment="true"
	 * @generated
	 */
	EList<User_d> getUser_d();

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Photo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getDomain_Photo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Photo> getPhoto();

} // Domain
