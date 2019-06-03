/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User d</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.User_d#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getProfileManagement <em>Profile Management</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getPhoto <em>Photo</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getId <em>Id</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getFirst_name <em>First name</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getLast_name <em>Last name</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getProfile_description <em>Profile description</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getUsername <em>Username</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getPassword <em>Password</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getEmail <em>Email</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getRegistration <em>Registration</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d()
 * @model
 * @generated
 */
public interface User_d extends EObject {
	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Authentication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d_Authentication()
	 * @model containment="true"
	 * @generated
	 */
	EList<Authentication> getAuthentication();

	/**
	 * Returns the value of the '<em><b>Profile Management</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.ProfileManagement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Management</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d_ProfileManagement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProfileManagement> getProfileManagement();

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo</em>' reference.
	 * @see #setPhoto(Photo)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d_Photo()
	 * @model
	 * @generated
	 */
	Photo getPhoto();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.User_d#getPhoto <em>Photo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photo</em>' reference.
	 * @see #getPhoto()
	 * @generated
	 */
	void setPhoto(Photo value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.User_d#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>First name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First name</em>' attribute.
	 * @see #setFirst_name(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d_First_name()
	 * @model
	 * @generated
	 */
	String getFirst_name();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.User_d#getFirst_name <em>First name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First name</em>' attribute.
	 * @see #getFirst_name()
	 * @generated
	 */
	void setFirst_name(String value);

	/**
	 * Returns the value of the '<em><b>Last name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last name</em>' attribute.
	 * @see #setLast_name(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d_Last_name()
	 * @model
	 * @generated
	 */
	String getLast_name();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.User_d#getLast_name <em>Last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last name</em>' attribute.
	 * @see #getLast_name()
	 * @generated
	 */
	void setLast_name(String value);

	/**
	 * Returns the value of the '<em><b>Profile description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile description</em>' attribute.
	 * @see #setProfile_description(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d_Profile_description()
	 * @model
	 * @generated
	 */
	String getProfile_description();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.User_d#getProfile_description <em>Profile description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile description</em>' attribute.
	 * @see #getProfile_description()
	 * @generated
	 */
	void setProfile_description(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.User_d#getUsername <em>Username</em>}' attribute.
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
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.User_d#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.User_d#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Registration</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Registration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d_Registration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Registration> getRegistration();

} // User_d
