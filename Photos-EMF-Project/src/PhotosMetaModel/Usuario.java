/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Usuario#getAutenticacion <em>Autenticacion</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getManejoperfil <em>Manejoperfil</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getFoto <em>Foto</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getId <em>Id</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getFirst_name <em>First name</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getLast_name <em>Last name</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getProfile_description <em>Profile description</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getUsername <em>Username</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getPassword <em>Password</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getEmail <em>Email</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getRegistro <em>Registro</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends EObject {
	/**
	 * Returns the value of the '<em><b>Autenticacion</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Autenticacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autenticacion</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUsuario_Autenticacion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Autenticacion> getAutenticacion();

	/**
	 * Returns the value of the '<em><b>Manejoperfil</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.ManejoPerfil}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manejoperfil</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUsuario_Manejoperfil()
	 * @model containment="true"
	 * @generated
	 */
	EList<ManejoPerfil> getManejoperfil();

	/**
	 * Returns the value of the '<em><b>Foto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foto</em>' reference.
	 * @see #setFoto(Foto)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUsuario_Foto()
	 * @model
	 * @generated
	 */
	Foto getFoto();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Usuario#getFoto <em>Foto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foto</em>' reference.
	 * @see #getFoto()
	 * @generated
	 */
	void setFoto(Foto value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUsuario_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Usuario#getId <em>Id</em>}' attribute.
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
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUsuario_First_name()
	 * @model
	 * @generated
	 */
	String getFirst_name();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Usuario#getFirst_name <em>First name</em>}' attribute.
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
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUsuario_Last_name()
	 * @model
	 * @generated
	 */
	String getLast_name();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Usuario#getLast_name <em>Last name</em>}' attribute.
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
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUsuario_Profile_description()
	 * @model
	 * @generated
	 */
	String getProfile_description();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Usuario#getProfile_description <em>Profile description</em>}' attribute.
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
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUsuario_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Usuario#getUsername <em>Username</em>}' attribute.
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
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUsuario_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Usuario#getPassword <em>Password</em>}' attribute.
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
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUsuario_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Usuario#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Registro</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Registro}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registro</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getUsuario_Registro()
	 * @model containment="true"
	 * @generated
	 */
	EList<Registro> getRegistro();

} // Usuario
