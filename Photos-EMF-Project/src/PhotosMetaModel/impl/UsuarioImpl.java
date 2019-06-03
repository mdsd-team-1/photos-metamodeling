/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Autenticacion;
import PhotosMetaModel.Foto;
import PhotosMetaModel.ManejoPerfil;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Registro;
import PhotosMetaModel.Usuario;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getAutenticacion <em>Autenticacion</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getManejoperfil <em>Manejoperfil</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getFoto <em>Foto</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getId <em>Id</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getFirst_name <em>First name</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getLast_name <em>Last name</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getProfile_description <em>Profile description</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getRegistro <em>Registro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsuarioImpl extends MinimalEObjectImpl.Container implements Usuario {
	/**
	 * The cached value of the '{@link #getAutenticacion() <em>Autenticacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutenticacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Autenticacion> autenticacion;

	/**
	 * The cached value of the '{@link #getManejoperfil() <em>Manejoperfil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManejoperfil()
	 * @generated
	 * @ordered
	 */
	protected EList<ManejoPerfil> manejoperfil;

	/**
	 * The cached value of the '{@link #getFoto() <em>Foto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoto()
	 * @generated
	 * @ordered
	 */
	protected Foto foto;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirst_name() <em>First name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_name()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirst_name() <em>First name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_name()
	 * @generated
	 * @ordered
	 */
	protected String first_name = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLast_name() <em>Last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_name()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLast_name() <em>Last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_name()
	 * @generated
	 * @ordered
	 */
	protected String last_name = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfile_description() <em>Profile description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile_description()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfile_description() <em>Profile description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile_description()
	 * @generated
	 * @ordered
	 */
	protected String profile_description = PROFILE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegistro() <em>Registro</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistro()
	 * @generated
	 * @ordered
	 */
	protected EList<Registro> registro;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Autenticacion> getAutenticacion() {
		if (autenticacion == null) {
			autenticacion = new EObjectContainmentEList<Autenticacion>(Autenticacion.class, this, PhotosMetaModelPackage.USUARIO__AUTENTICACION);
		}
		return autenticacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManejoPerfil> getManejoperfil() {
		if (manejoperfil == null) {
			manejoperfil = new EObjectContainmentEList<ManejoPerfil>(ManejoPerfil.class, this, PhotosMetaModelPackage.USUARIO__MANEJOPERFIL);
		}
		return manejoperfil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Foto getFoto() {
		if (foto != null && foto.eIsProxy()) {
			InternalEObject oldFoto = (InternalEObject)foto;
			foto = (Foto)eResolveProxy(oldFoto);
			if (foto != oldFoto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.USUARIO__FOTO, oldFoto, foto));
			}
		}
		return foto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foto basicGetFoto() {
		return foto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFoto(Foto newFoto) {
		Foto oldFoto = foto;
		foto = newFoto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USUARIO__FOTO, oldFoto, foto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USUARIO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirst_name(String newFirst_name) {
		String oldFirst_name = first_name;
		first_name = newFirst_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USUARIO__FIRST_NAME, oldFirst_name, first_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLast_name() {
		return last_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLast_name(String newLast_name) {
		String oldLast_name = last_name;
		last_name = newLast_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USUARIO__LAST_NAME, oldLast_name, last_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProfile_description() {
		return profile_description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfile_description(String newProfile_description) {
		String oldProfile_description = profile_description;
		profile_description = newProfile_description;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USUARIO__PROFILE_DESCRIPTION, oldProfile_description, profile_description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USUARIO__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USUARIO__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USUARIO__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Registro> getRegistro() {
		if (registro == null) {
			registro = new EObjectContainmentEList<Registro>(Registro.class, this, PhotosMetaModelPackage.USUARIO__REGISTRO);
		}
		return registro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.USUARIO__AUTENTICACION:
				return ((InternalEList<?>)getAutenticacion()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.USUARIO__MANEJOPERFIL:
				return ((InternalEList<?>)getManejoperfil()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.USUARIO__REGISTRO:
				return ((InternalEList<?>)getRegistro()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.USUARIO__AUTENTICACION:
				return getAutenticacion();
			case PhotosMetaModelPackage.USUARIO__MANEJOPERFIL:
				return getManejoperfil();
			case PhotosMetaModelPackage.USUARIO__FOTO:
				if (resolve) return getFoto();
				return basicGetFoto();
			case PhotosMetaModelPackage.USUARIO__ID:
				return getId();
			case PhotosMetaModelPackage.USUARIO__FIRST_NAME:
				return getFirst_name();
			case PhotosMetaModelPackage.USUARIO__LAST_NAME:
				return getLast_name();
			case PhotosMetaModelPackage.USUARIO__PROFILE_DESCRIPTION:
				return getProfile_description();
			case PhotosMetaModelPackage.USUARIO__USERNAME:
				return getUsername();
			case PhotosMetaModelPackage.USUARIO__PASSWORD:
				return getPassword();
			case PhotosMetaModelPackage.USUARIO__EMAIL:
				return getEmail();
			case PhotosMetaModelPackage.USUARIO__REGISTRO:
				return getRegistro();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhotosMetaModelPackage.USUARIO__AUTENTICACION:
				getAutenticacion().clear();
				getAutenticacion().addAll((Collection<? extends Autenticacion>)newValue);
				return;
			case PhotosMetaModelPackage.USUARIO__MANEJOPERFIL:
				getManejoperfil().clear();
				getManejoperfil().addAll((Collection<? extends ManejoPerfil>)newValue);
				return;
			case PhotosMetaModelPackage.USUARIO__FOTO:
				setFoto((Foto)newValue);
				return;
			case PhotosMetaModelPackage.USUARIO__ID:
				setId((String)newValue);
				return;
			case PhotosMetaModelPackage.USUARIO__FIRST_NAME:
				setFirst_name((String)newValue);
				return;
			case PhotosMetaModelPackage.USUARIO__LAST_NAME:
				setLast_name((String)newValue);
				return;
			case PhotosMetaModelPackage.USUARIO__PROFILE_DESCRIPTION:
				setProfile_description((String)newValue);
				return;
			case PhotosMetaModelPackage.USUARIO__USERNAME:
				setUsername((String)newValue);
				return;
			case PhotosMetaModelPackage.USUARIO__PASSWORD:
				setPassword((String)newValue);
				return;
			case PhotosMetaModelPackage.USUARIO__EMAIL:
				setEmail((String)newValue);
				return;
			case PhotosMetaModelPackage.USUARIO__REGISTRO:
				getRegistro().clear();
				getRegistro().addAll((Collection<? extends Registro>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PhotosMetaModelPackage.USUARIO__AUTENTICACION:
				getAutenticacion().clear();
				return;
			case PhotosMetaModelPackage.USUARIO__MANEJOPERFIL:
				getManejoperfil().clear();
				return;
			case PhotosMetaModelPackage.USUARIO__FOTO:
				setFoto((Foto)null);
				return;
			case PhotosMetaModelPackage.USUARIO__ID:
				setId(ID_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USUARIO__FIRST_NAME:
				setFirst_name(FIRST_NAME_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USUARIO__LAST_NAME:
				setLast_name(LAST_NAME_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USUARIO__PROFILE_DESCRIPTION:
				setProfile_description(PROFILE_DESCRIPTION_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USUARIO__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USUARIO__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USUARIO__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USUARIO__REGISTRO:
				getRegistro().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PhotosMetaModelPackage.USUARIO__AUTENTICACION:
				return autenticacion != null && !autenticacion.isEmpty();
			case PhotosMetaModelPackage.USUARIO__MANEJOPERFIL:
				return manejoperfil != null && !manejoperfil.isEmpty();
			case PhotosMetaModelPackage.USUARIO__FOTO:
				return foto != null;
			case PhotosMetaModelPackage.USUARIO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PhotosMetaModelPackage.USUARIO__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? first_name != null : !FIRST_NAME_EDEFAULT.equals(first_name);
			case PhotosMetaModelPackage.USUARIO__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? last_name != null : !LAST_NAME_EDEFAULT.equals(last_name);
			case PhotosMetaModelPackage.USUARIO__PROFILE_DESCRIPTION:
				return PROFILE_DESCRIPTION_EDEFAULT == null ? profile_description != null : !PROFILE_DESCRIPTION_EDEFAULT.equals(profile_description);
			case PhotosMetaModelPackage.USUARIO__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case PhotosMetaModelPackage.USUARIO__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case PhotosMetaModelPackage.USUARIO__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case PhotosMetaModelPackage.USUARIO__REGISTRO:
				return registro != null && !registro.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", first_name: ");
		result.append(first_name);
		result.append(", last_name: ");
		result.append(last_name);
		result.append(", profile_description: ");
		result.append(profile_description);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //UsuarioImpl
