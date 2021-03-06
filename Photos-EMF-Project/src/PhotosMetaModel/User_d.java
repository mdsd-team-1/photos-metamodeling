/**
 */
package PhotosMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User d</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.User_d#getFirst_name <em>First name</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getLast_name <em>Last name</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getProfile_description <em>Profile description</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getUsername <em>Username</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getPassword <em>Password</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getEmail <em>Email</em>}</li>
 *   <li>{@link PhotosMetaModel.User_d#getFunctionalities <em>Functionalities</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d()
 * @model
 * @generated
 */
public interface User_d extends Entities {
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
	 * Returns the value of the '<em><b>Functionalities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionalities</em>' reference.
	 * @see #setFunctionalities(Functionalities)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUser_d_Functionalities()
	 * @model
	 * @generated
	 */
	Functionalities getFunctionalities();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.User_d#getFunctionalities <em>Functionalities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functionalities</em>' reference.
	 * @see #getFunctionalities()
	 * @generated
	 */
	void setFunctionalities(Functionalities value);

} // User_d
