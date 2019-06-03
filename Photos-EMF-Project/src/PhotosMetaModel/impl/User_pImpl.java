/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Privilege;
import PhotosMetaModel.Query;
import PhotosMetaModel.User_p;

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
 * An implementation of the model object '<em><b>User p</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.User_pImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_pImpl#getPrivilege <em>Privilege</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_pImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.User_pImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class User_pImpl extends MinimalEObjectImpl.Container implements User_p {
	/**
	 * The cached value of the '{@link #getExecute() <em>Execute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> execute;

	/**
	 * The cached value of the '{@link #getPrivilege() <em>Privilege</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilege()
	 * @generated
	 * @ordered
	 */
	protected EList<Privilege> privilege;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected User_pImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.USER_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Query> getExecute() {
		if (execute == null) {
			execute = new EObjectContainmentEList<Query>(Query.class, this, PhotosMetaModelPackage.USER_P__EXECUTE);
		}
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Privilege> getPrivilege() {
		if (privilege == null) {
			privilege = new EObjectContainmentEList<Privilege>(Privilege.class, this, PhotosMetaModelPackage.USER_P__PRIVILEGE);
		}
		return privilege;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USER_P__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.USER_P__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.USER_P__EXECUTE:
				return ((InternalEList<?>)getExecute()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.USER_P__PRIVILEGE:
				return ((InternalEList<?>)getPrivilege()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.USER_P__EXECUTE:
				return getExecute();
			case PhotosMetaModelPackage.USER_P__PRIVILEGE:
				return getPrivilege();
			case PhotosMetaModelPackage.USER_P__USERNAME:
				return getUsername();
			case PhotosMetaModelPackage.USER_P__PASSWORD:
				return getPassword();
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
			case PhotosMetaModelPackage.USER_P__EXECUTE:
				getExecute().clear();
				getExecute().addAll((Collection<? extends Query>)newValue);
				return;
			case PhotosMetaModelPackage.USER_P__PRIVILEGE:
				getPrivilege().clear();
				getPrivilege().addAll((Collection<? extends Privilege>)newValue);
				return;
			case PhotosMetaModelPackage.USER_P__USERNAME:
				setUsername((String)newValue);
				return;
			case PhotosMetaModelPackage.USER_P__PASSWORD:
				setPassword((String)newValue);
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
			case PhotosMetaModelPackage.USER_P__EXECUTE:
				getExecute().clear();
				return;
			case PhotosMetaModelPackage.USER_P__PRIVILEGE:
				getPrivilege().clear();
				return;
			case PhotosMetaModelPackage.USER_P__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case PhotosMetaModelPackage.USER_P__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
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
			case PhotosMetaModelPackage.USER_P__EXECUTE:
				return execute != null && !execute.isEmpty();
			case PhotosMetaModelPackage.USER_P__PRIVILEGE:
				return privilege != null && !privilege.isEmpty();
			case PhotosMetaModelPackage.USER_P__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case PhotosMetaModelPackage.USER_P__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
		result.append(" (username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //User_pImpl
