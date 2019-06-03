/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Authentication;
import PhotosMetaModel.Photo;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.ProfileManagement;
import PhotosMetaModel.Registration;
import PhotosMetaModel.User_d;

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
 * An implementation of the model object '<em><b>User d</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.User_dImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_dImpl#getProfileManagement <em>Profile Management</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_dImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_dImpl#getId <em>Id</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_dImpl#getFirst_name <em>First name</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_dImpl#getLast_name <em>Last name</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_dImpl#getProfile_description <em>Profile description</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_dImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_dImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_dImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_dImpl#getRegistration <em>Registration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class User_dImpl extends MinimalEObjectImpl.Container implements User_d {
	/**
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected EList<Authentication> authentication;

	/**
	 * The cached value of the '{@link #getProfileManagement() <em>Profile Management</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileManagement()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileManagement> profileManagement;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected Photo photo;

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
	 * The cached value of the '{@link #getRegistration() <em>Registration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistration()
	 * @generated
	 * @ordered
	 */
	protected EList<Registration> registration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected User_dImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.USER_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Authentication> getAuthentication() {
		if (authentication == null) {
			authentication = new EObjectContainmentEList<Authentication>(Authentication.class, this, PhotosMetaModelPackage.USER_D__AUTHENTICATION);
		}
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProfileManagement> getProfileManagement() {
		if (profileManagement == null) {
			profileManagement = new EObjectContainmentEList<ProfileManagement>(ProfileManagement.class, this, PhotosMetaModelPackage.USER_D__PROFILE_MANAGEMENT);
		}
		return profileManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Photo getPhoto() {
		if (photo != null && photo.eIsProxy()) {
			InternalEObject oldPhoto = (InternalEObject)photo;
			photo = (Photo)eResolveProxy(oldPhoto);
			if (photo != oldPhoto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.USER_D__PHOTO, oldPhoto, photo));
			}
		}
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Photo basicGetPhoto() {
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhoto(Photo newPhoto) {
		Photo oldPhoto = photo;
		photo = newPhoto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USER_D__PHOTO, oldPhoto, photo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USER_D__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USER_D__FIRST_NAME, oldFirst_name, first_name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USER_D__LAST_NAME, oldLast_name, last_name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USER_D__PROFILE_DESCRIPTION, oldProfile_description, profile_description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USER_D__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USER_D__PASSWORD, oldPassword, password));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USER_D__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Registration> getRegistration() {
		if (registration == null) {
			registration = new EObjectContainmentEList<Registration>(Registration.class, this, PhotosMetaModelPackage.USER_D__REGISTRATION);
		}
		return registration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.USER_D__AUTHENTICATION:
				return ((InternalEList<?>)getAuthentication()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.USER_D__PROFILE_MANAGEMENT:
				return ((InternalEList<?>)getProfileManagement()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.USER_D__REGISTRATION:
				return ((InternalEList<?>)getRegistration()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.USER_D__AUTHENTICATION:
				return getAuthentication();
			case PhotosMetaModelPackage.USER_D__PROFILE_MANAGEMENT:
				return getProfileManagement();
			case PhotosMetaModelPackage.USER_D__PHOTO:
				if (resolve) return getPhoto();
				return basicGetPhoto();
			case PhotosMetaModelPackage.USER_D__ID:
				return getId();
			case PhotosMetaModelPackage.USER_D__FIRST_NAME:
				return getFirst_name();
			case PhotosMetaModelPackage.USER_D__LAST_NAME:
				return getLast_name();
			case PhotosMetaModelPackage.USER_D__PROFILE_DESCRIPTION:
				return getProfile_description();
			case PhotosMetaModelPackage.USER_D__USERNAME:
				return getUsername();
			case PhotosMetaModelPackage.USER_D__PASSWORD:
				return getPassword();
			case PhotosMetaModelPackage.USER_D__EMAIL:
				return getEmail();
			case PhotosMetaModelPackage.USER_D__REGISTRATION:
				return getRegistration();
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
			case PhotosMetaModelPackage.USER_D__AUTHENTICATION:
				getAuthentication().clear();
				getAuthentication().addAll((Collection<? extends Authentication>)newValue);
				return;
			case PhotosMetaModelPackage.USER_D__PROFILE_MANAGEMENT:
				getProfileManagement().clear();
				getProfileManagement().addAll((Collection<? extends ProfileManagement>)newValue);
				return;
			case PhotosMetaModelPackage.USER_D__PHOTO:
				setPhoto((Photo)newValue);
				return;
			case PhotosMetaModelPackage.USER_D__ID:
				setId((String)newValue);
				return;
			case PhotosMetaModelPackage.USER_D__FIRST_NAME:
				setFirst_name((String)newValue);
				return;
			case PhotosMetaModelPackage.USER_D__LAST_NAME:
				setLast_name((String)newValue);
				return;
			case PhotosMetaModelPackage.USER_D__PROFILE_DESCRIPTION:
				setProfile_description((String)newValue);
				return;
			case PhotosMetaModelPackage.USER_D__USERNAME:
				setUsername((String)newValue);
				return;
			case PhotosMetaModelPackage.USER_D__PASSWORD:
				setPassword((String)newValue);
				return;
			case PhotosMetaModelPackage.USER_D__EMAIL:
				setEmail((String)newValue);
				return;
			case PhotosMetaModelPackage.USER_D__REGISTRATION:
				getRegistration().clear();
				getRegistration().addAll((Collection<? extends Registration>)newValue);
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
			case PhotosMetaModelPackage.USER_D__AUTHENTICATION:
				getAuthentication().clear();
				return;
			case PhotosMetaModelPackage.USER_D__PROFILE_MANAGEMENT:
				getProfileManagement().clear();
				return;
			case PhotosMetaModelPackage.USER_D__PHOTO:
				setPhoto((Photo)null);
				return;
			case PhotosMetaModelPackage.USER_D__ID:
				setId(ID_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USER_D__FIRST_NAME:
				setFirst_name(FIRST_NAME_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USER_D__LAST_NAME:
				setLast_name(LAST_NAME_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USER_D__PROFILE_DESCRIPTION:
				setProfile_description(PROFILE_DESCRIPTION_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USER_D__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USER_D__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USER_D__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USER_D__REGISTRATION:
				getRegistration().clear();
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
			case PhotosMetaModelPackage.USER_D__AUTHENTICATION:
				return authentication != null && !authentication.isEmpty();
			case PhotosMetaModelPackage.USER_D__PROFILE_MANAGEMENT:
				return profileManagement != null && !profileManagement.isEmpty();
			case PhotosMetaModelPackage.USER_D__PHOTO:
				return photo != null;
			case PhotosMetaModelPackage.USER_D__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PhotosMetaModelPackage.USER_D__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? first_name != null : !FIRST_NAME_EDEFAULT.equals(first_name);
			case PhotosMetaModelPackage.USER_D__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? last_name != null : !LAST_NAME_EDEFAULT.equals(last_name);
			case PhotosMetaModelPackage.USER_D__PROFILE_DESCRIPTION:
				return PROFILE_DESCRIPTION_EDEFAULT == null ? profile_description != null : !PROFILE_DESCRIPTION_EDEFAULT.equals(profile_description);
			case PhotosMetaModelPackage.USER_D__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case PhotosMetaModelPackage.USER_D__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case PhotosMetaModelPackage.USER_D__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case PhotosMetaModelPackage.USER_D__REGISTRATION:
				return registration != null && !registration.isEmpty();
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

} //User_dImpl