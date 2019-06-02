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
 *   <li>{@link PhotosMetaModel.Usuario#getTieneManejoPerfil <em>Tiene Manejo Perfil</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getPuedeTener <em>Puede Tener</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getPuedeAutenticarse <em>Puede Autenticarse</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getPoseeUnaGaleria <em>Posee Una Galeria</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getFirst_name <em>First name</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getLast_name <em>Last name</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getId <em>Id</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getProfile_description <em>Profile description</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getUsername <em>Username</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getPassword <em>Password</em>}</li>
 *   <li>{@link PhotosMetaModel.Usuario#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.SystemMetamodelPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends EObject {
	/**
	 * Returns the value of the '<em><b>Tiene Manejo Perfil</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.manejoPerfil}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene Manejo Perfil</em>' containment reference list.
	 * @see PhotosMetaModel.SystemMetamodelPackage#getUsuario_TieneManejoPerfil()
	 * @model containment="true"
	 * @generated
	 */
	EList<manejoPerfil> getTieneManejoPerfil();

	/**
	 * Returns the value of the '<em><b>Puede Tener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puede Tener</em>' containment reference.
	 * @see #setPuedeTener(Registro)
	 * @see PhotosMetaModel.SystemMetamodelPackage#getUsuario_PuedeTener()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Registro getPuedeTener();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Usuario#getPuedeTener <em>Puede Tener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puede Tener</em>' containment reference.
	 * @see #getPuedeTener()
	 * @generated
	 */
	void setPuedeTener(Registro value);

	/**
	 * Returns the value of the '<em><b>Puede Autenticarse</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Autenticacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puede Autenticarse</em>' containment reference list.
	 * @see PhotosMetaModel.SystemMetamodelPackage#getUsuario_PuedeAutenticarse()
	 * @model containment="true"
	 * @generated
	 */
	EList<Autenticacion> getPuedeAutenticarse();

	/**
	 * Returns the value of the '<em><b>Posee Una Galeria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posee Una Galeria</em>' reference.
	 * @see #setPoseeUnaGaleria(Fotos)
	 * @see PhotosMetaModel.SystemMetamodelPackage#getUsuario_PoseeUnaGaleria()
	 * @model required="true"
	 * @generated
	 */
	Fotos getPoseeUnaGaleria();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Usuario#getPoseeUnaGaleria <em>Posee Una Galeria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posee Una Galeria</em>' reference.
	 * @see #getPoseeUnaGaleria()
	 * @generated
	 */
	void setPoseeUnaGaleria(Fotos value);

	/**
	 * Returns the value of the '<em><b>First name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First name</em>' attribute.
	 * @see #setFirst_name(String)
	 * @see PhotosMetaModel.SystemMetamodelPackage#getUsuario_First_name()
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
	 * @see PhotosMetaModel.SystemMetamodelPackage#getUsuario_Last_name()
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see PhotosMetaModel.SystemMetamodelPackage#getUsuario_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Usuario#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Profile description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile description</em>' attribute.
	 * @see #setProfile_description(String)
	 * @see PhotosMetaModel.SystemMetamodelPackage#getUsuario_Profile_description()
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
	 * @see PhotosMetaModel.SystemMetamodelPackage#getUsuario_Username()
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
	 * @see PhotosMetaModel.SystemMetamodelPackage#getUsuario_Password()
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
	 * @see PhotosMetaModel.SystemMetamodelPackage#getUsuario_Email()
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

} // Usuario
