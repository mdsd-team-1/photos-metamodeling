/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User p</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.User_p#getExecute <em>Execute</em>}</li>
 *   <li>{@link PhotosMetaModel.User_p#getPrivilege <em>Privilege</em>}</li>
 *   <li>{@link PhotosMetaModel.User_p#getUsername <em>Username</em>}</li>
 *   <li>{@link PhotosMetaModel.User_p#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_p()
 * @model
 * @generated
 */
public interface User_p extends EObject {
	/**
	 * Returns the value of the '<em><b>Execute</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_p_Execute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Query> getExecute();

	/**
	 * Returns the value of the '<em><b>Privilege</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Privilege}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privilege</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_p_Privilege()
	 * @model containment="true"
	 * @generated
	 */
	EList<Privilege> getPrivilege();

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_p_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.User_p#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_p_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.User_p#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // User_p
