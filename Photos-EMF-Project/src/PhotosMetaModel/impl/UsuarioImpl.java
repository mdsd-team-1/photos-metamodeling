/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Autenticacion;
import PhotosMetaModel.Fotos;
import PhotosMetaModel.Registro;
import PhotosMetaModel.SystemMetamodelPackage;
import PhotosMetaModel.Usuario;
import PhotosMetaModel.manejoPerfil;

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
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getTieneManejoPerfil <em>Tiene Manejo Perfil</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getPuedeTener <em>Puede Tener</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getPuedeAutenticarse <em>Puede Autenticarse</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getPoseeUnaGaleria <em>Posee Una Galeria</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getFirst_name <em>First name</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getLast_name <em>Last name</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getId <em>Id</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getProfile_description <em>Profile description</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.UsuarioImpl#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsuarioImpl extends MinimalEObjectImpl.Container implements Usuario {
	/**
	 * The cached value of the '{@link #getTieneManejoPerfil() <em>Tiene Manejo Perfil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieneManejoPerfil()
	 * @generated
	 * @ordered
	 */
	protected EList<manejoPerfil> tieneManejoPerfil;

	/**
	 * The cached value of the '{@link #getPuedeTener() <em>Puede Tener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuedeTener()
	 * @generated
	 * @ordered
	 */
	protected Registro puedeTener;

	/**
	 * The cached value of the '{@link #getPuedeAutenticarse() <em>Puede Autenticarse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuedeAutenticarse()
	 * @generated
	 * @ordered
	 */
	protected EList<Autenticacion> puedeAutenticarse;

	/**
	 * The cached value of the '{@link #getPoseeUnaGaleria() <em>Posee Una Galeria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseeUnaGaleria()
	 * @generated
	 * @ordered
	 */
	protected Fotos poseeUnaGaleria;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
		return SystemMetamodelPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<manejoPerfil> getTieneManejoPerfil() {
		if (tieneManejoPerfil == null) {
			tieneManejoPerfil = new EObjectContainmentEList<manejoPerfil>(manejoPerfil.class, this, SystemMetamodelPackage.USUARIO__TIENE_MANEJO_PERFIL);
		}
		return tieneManejoPerfil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Registro getPuedeTener() {
		return puedeTener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPuedeTener(Registro newPuedeTener, NotificationChain msgs) {
		Registro oldPuedeTener = puedeTener;
		puedeTener = newPuedeTener;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.USUARIO__PUEDE_TENER, oldPuedeTener, newPuedeTener);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPuedeTener(Registro newPuedeTener) {
		if (newPuedeTener != puedeTener) {
			NotificationChain msgs = null;
			if (puedeTener != null)
				msgs = ((InternalEObject)puedeTener).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemMetamodelPackage.USUARIO__PUEDE_TENER, null, msgs);
			if (newPuedeTener != null)
				msgs = ((InternalEObject)newPuedeTener).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemMetamodelPackage.USUARIO__PUEDE_TENER, null, msgs);
			msgs = basicSetPuedeTener(newPuedeTener, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.USUARIO__PUEDE_TENER, newPuedeTener, newPuedeTener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Autenticacion> getPuedeAutenticarse() {
		if (puedeAutenticarse == null) {
			puedeAutenticarse = new EObjectContainmentEList<Autenticacion>(Autenticacion.class, this, SystemMetamodelPackage.USUARIO__PUEDE_AUTENTICARSE);
		}
		return puedeAutenticarse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fotos getPoseeUnaGaleria() {
		if (poseeUnaGaleria != null && poseeUnaGaleria.eIsProxy()) {
			InternalEObject oldPoseeUnaGaleria = (InternalEObject)poseeUnaGaleria;
			poseeUnaGaleria = (Fotos)eResolveProxy(oldPoseeUnaGaleria);
			if (poseeUnaGaleria != oldPoseeUnaGaleria) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemMetamodelPackage.USUARIO__POSEE_UNA_GALERIA, oldPoseeUnaGaleria, poseeUnaGaleria));
			}
		}
		return poseeUnaGaleria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fotos basicGetPoseeUnaGaleria() {
		return poseeUnaGaleria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoseeUnaGaleria(Fotos newPoseeUnaGaleria) {
		Fotos oldPoseeUnaGaleria = poseeUnaGaleria;
		poseeUnaGaleria = newPoseeUnaGaleria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.USUARIO__POSEE_UNA_GALERIA, oldPoseeUnaGaleria, poseeUnaGaleria));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.USUARIO__FIRST_NAME, oldFirst_name, first_name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.USUARIO__LAST_NAME, oldLast_name, last_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.USUARIO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.USUARIO__PROFILE_DESCRIPTION, oldProfile_description, profile_description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.USUARIO__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.USUARIO__PASSWORD, oldPassword, password));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.USUARIO__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemMetamodelPackage.USUARIO__TIENE_MANEJO_PERFIL:
				return ((InternalEList<?>)getTieneManejoPerfil()).basicRemove(otherEnd, msgs);
			case SystemMetamodelPackage.USUARIO__PUEDE_TENER:
				return basicSetPuedeTener(null, msgs);
			case SystemMetamodelPackage.USUARIO__PUEDE_AUTENTICARSE:
				return ((InternalEList<?>)getPuedeAutenticarse()).basicRemove(otherEnd, msgs);
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
			case SystemMetamodelPackage.USUARIO__TIENE_MANEJO_PERFIL:
				return getTieneManejoPerfil();
			case SystemMetamodelPackage.USUARIO__PUEDE_TENER:
				return getPuedeTener();
			case SystemMetamodelPackage.USUARIO__PUEDE_AUTENTICARSE:
				return getPuedeAutenticarse();
			case SystemMetamodelPackage.USUARIO__POSEE_UNA_GALERIA:
				if (resolve) return getPoseeUnaGaleria();
				return basicGetPoseeUnaGaleria();
			case SystemMetamodelPackage.USUARIO__FIRST_NAME:
				return getFirst_name();
			case SystemMetamodelPackage.USUARIO__LAST_NAME:
				return getLast_name();
			case SystemMetamodelPackage.USUARIO__ID:
				return getId();
			case SystemMetamodelPackage.USUARIO__PROFILE_DESCRIPTION:
				return getProfile_description();
			case SystemMetamodelPackage.USUARIO__USERNAME:
				return getUsername();
			case SystemMetamodelPackage.USUARIO__PASSWORD:
				return getPassword();
			case SystemMetamodelPackage.USUARIO__EMAIL:
				return getEmail();
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
			case SystemMetamodelPackage.USUARIO__TIENE_MANEJO_PERFIL:
				getTieneManejoPerfil().clear();
				getTieneManejoPerfil().addAll((Collection<? extends manejoPerfil>)newValue);
				return;
			case SystemMetamodelPackage.USUARIO__PUEDE_TENER:
				setPuedeTener((Registro)newValue);
				return;
			case SystemMetamodelPackage.USUARIO__PUEDE_AUTENTICARSE:
				getPuedeAutenticarse().clear();
				getPuedeAutenticarse().addAll((Collection<? extends Autenticacion>)newValue);
				return;
			case SystemMetamodelPackage.USUARIO__POSEE_UNA_GALERIA:
				setPoseeUnaGaleria((Fotos)newValue);
				return;
			case SystemMetamodelPackage.USUARIO__FIRST_NAME:
				setFirst_name((String)newValue);
				return;
			case SystemMetamodelPackage.USUARIO__LAST_NAME:
				setLast_name((String)newValue);
				return;
			case SystemMetamodelPackage.USUARIO__ID:
				setId((Integer)newValue);
				return;
			case SystemMetamodelPackage.USUARIO__PROFILE_DESCRIPTION:
				setProfile_description((String)newValue);
				return;
			case SystemMetamodelPackage.USUARIO__USERNAME:
				setUsername((String)newValue);
				return;
			case SystemMetamodelPackage.USUARIO__PASSWORD:
				setPassword((String)newValue);
				return;
			case SystemMetamodelPackage.USUARIO__EMAIL:
				setEmail((String)newValue);
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
			case SystemMetamodelPackage.USUARIO__TIENE_MANEJO_PERFIL:
				getTieneManejoPerfil().clear();
				return;
			case SystemMetamodelPackage.USUARIO__PUEDE_TENER:
				setPuedeTener((Registro)null);
				return;
			case SystemMetamodelPackage.USUARIO__PUEDE_AUTENTICARSE:
				getPuedeAutenticarse().clear();
				return;
			case SystemMetamodelPackage.USUARIO__POSEE_UNA_GALERIA:
				setPoseeUnaGaleria((Fotos)null);
				return;
			case SystemMetamodelPackage.USUARIO__FIRST_NAME:
				setFirst_name(FIRST_NAME_EDEFAULT);
				return;
			case SystemMetamodelPackage.USUARIO__LAST_NAME:
				setLast_name(LAST_NAME_EDEFAULT);
				return;
			case SystemMetamodelPackage.USUARIO__ID:
				setId(ID_EDEFAULT);
				return;
			case SystemMetamodelPackage.USUARIO__PROFILE_DESCRIPTION:
				setProfile_description(PROFILE_DESCRIPTION_EDEFAULT);
				return;
			case SystemMetamodelPackage.USUARIO__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case SystemMetamodelPackage.USUARIO__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case SystemMetamodelPackage.USUARIO__EMAIL:
				setEmail(EMAIL_EDEFAULT);
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
			case SystemMetamodelPackage.USUARIO__TIENE_MANEJO_PERFIL:
				return tieneManejoPerfil != null && !tieneManejoPerfil.isEmpty();
			case SystemMetamodelPackage.USUARIO__PUEDE_TENER:
				return puedeTener != null;
			case SystemMetamodelPackage.USUARIO__PUEDE_AUTENTICARSE:
				return puedeAutenticarse != null && !puedeAutenticarse.isEmpty();
			case SystemMetamodelPackage.USUARIO__POSEE_UNA_GALERIA:
				return poseeUnaGaleria != null;
			case SystemMetamodelPackage.USUARIO__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? first_name != null : !FIRST_NAME_EDEFAULT.equals(first_name);
			case SystemMetamodelPackage.USUARIO__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? last_name != null : !LAST_NAME_EDEFAULT.equals(last_name);
			case SystemMetamodelPackage.USUARIO__ID:
				return id != ID_EDEFAULT;
			case SystemMetamodelPackage.USUARIO__PROFILE_DESCRIPTION:
				return PROFILE_DESCRIPTION_EDEFAULT == null ? profile_description != null : !PROFILE_DESCRIPTION_EDEFAULT.equals(profile_description);
			case SystemMetamodelPackage.USUARIO__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case SystemMetamodelPackage.USUARIO__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case SystemMetamodelPackage.USUARIO__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
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
		result.append(" (first_name: ");
		result.append(first_name);
		result.append(", last_name: ");
		result.append(last_name);
		result.append(", id: ");
		result.append(id);
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
