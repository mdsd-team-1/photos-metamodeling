/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.ProfileManagement#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getProfileManagement()
 * @model
 * @generated
 */
public interface ProfileManagement extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getProfileManagement_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

} // ProfileManagement
