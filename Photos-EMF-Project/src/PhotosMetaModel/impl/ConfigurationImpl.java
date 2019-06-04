/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Bean;
import PhotosMetaModel.Configuration;
import PhotosMetaModel.EnableAuthorizationServer;
import PhotosMetaModel.EnableGlobalMethodSecurity;
import PhotosMetaModel.EnableResourceServer;
import PhotosMetaModel.EnableWebSecurity;
import PhotosMetaModel.PhotosMetaModelPackage;

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
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.ConfigurationImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ConfigurationImpl#getEnablewebsecurity <em>Enablewebsecurity</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ConfigurationImpl#getEnableresourceserver <em>Enableresourceserver</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ConfigurationImpl#getEnableauthorizationserver <em>Enableauthorizationserver</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ConfigurationImpl#getEnableglobalmethodsecurity <em>Enableglobalmethodsecurity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The cached value of the '{@link #getBean() <em>Bean</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBean()
	 * @generated
	 * @ordered
	 */
	protected EList<Bean> bean;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnablewebsecurity() <em>Enablewebsecurity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablewebsecurity()
	 * @generated
	 * @ordered
	 */
	protected EnableWebSecurity enablewebsecurity;

	/**
	 * The cached value of the '{@link #getEnableresourceserver() <em>Enableresourceserver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableresourceserver()
	 * @generated
	 * @ordered
	 */
	protected EnableResourceServer enableresourceserver;

	/**
	 * The cached value of the '{@link #getEnableauthorizationserver() <em>Enableauthorizationserver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableauthorizationserver()
	 * @generated
	 * @ordered
	 */
	protected EnableAuthorizationServer enableauthorizationserver;

	/**
	 * The cached value of the '{@link #getEnableglobalmethodsecurity() <em>Enableglobalmethodsecurity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableglobalmethodsecurity()
	 * @generated
	 * @ordered
	 */
	protected EnableGlobalMethodSecurity enableglobalmethodsecurity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bean> getBean() {
		if (bean == null) {
			bean = new EObjectContainmentEList<Bean>(Bean.class, this, PhotosMetaModelPackage.CONFIGURATION__BEAN);
		}
		return bean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableWebSecurity getEnablewebsecurity() {
		return enablewebsecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnablewebsecurity(EnableWebSecurity newEnablewebsecurity, NotificationChain msgs) {
		EnableWebSecurity oldEnablewebsecurity = enablewebsecurity;
		enablewebsecurity = newEnablewebsecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__ENABLEWEBSECURITY, oldEnablewebsecurity, newEnablewebsecurity);
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
	public void setEnablewebsecurity(EnableWebSecurity newEnablewebsecurity) {
		if (newEnablewebsecurity != enablewebsecurity) {
			NotificationChain msgs = null;
			if (enablewebsecurity != null)
				msgs = ((InternalEObject)enablewebsecurity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.CONFIGURATION__ENABLEWEBSECURITY, null, msgs);
			if (newEnablewebsecurity != null)
				msgs = ((InternalEObject)newEnablewebsecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.CONFIGURATION__ENABLEWEBSECURITY, null, msgs);
			msgs = basicSetEnablewebsecurity(newEnablewebsecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__ENABLEWEBSECURITY, newEnablewebsecurity, newEnablewebsecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableResourceServer getEnableresourceserver() {
		return enableresourceserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableresourceserver(EnableResourceServer newEnableresourceserver, NotificationChain msgs) {
		EnableResourceServer oldEnableresourceserver = enableresourceserver;
		enableresourceserver = newEnableresourceserver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__ENABLERESOURCESERVER, oldEnableresourceserver, newEnableresourceserver);
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
	public void setEnableresourceserver(EnableResourceServer newEnableresourceserver) {
		if (newEnableresourceserver != enableresourceserver) {
			NotificationChain msgs = null;
			if (enableresourceserver != null)
				msgs = ((InternalEObject)enableresourceserver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.CONFIGURATION__ENABLERESOURCESERVER, null, msgs);
			if (newEnableresourceserver != null)
				msgs = ((InternalEObject)newEnableresourceserver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.CONFIGURATION__ENABLERESOURCESERVER, null, msgs);
			msgs = basicSetEnableresourceserver(newEnableresourceserver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__ENABLERESOURCESERVER, newEnableresourceserver, newEnableresourceserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableAuthorizationServer getEnableauthorizationserver() {
		return enableauthorizationserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableauthorizationserver(EnableAuthorizationServer newEnableauthorizationserver, NotificationChain msgs) {
		EnableAuthorizationServer oldEnableauthorizationserver = enableauthorizationserver;
		enableauthorizationserver = newEnableauthorizationserver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__ENABLEAUTHORIZATIONSERVER, oldEnableauthorizationserver, newEnableauthorizationserver);
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
	public void setEnableauthorizationserver(EnableAuthorizationServer newEnableauthorizationserver) {
		if (newEnableauthorizationserver != enableauthorizationserver) {
			NotificationChain msgs = null;
			if (enableauthorizationserver != null)
				msgs = ((InternalEObject)enableauthorizationserver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.CONFIGURATION__ENABLEAUTHORIZATIONSERVER, null, msgs);
			if (newEnableauthorizationserver != null)
				msgs = ((InternalEObject)newEnableauthorizationserver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.CONFIGURATION__ENABLEAUTHORIZATIONSERVER, null, msgs);
			msgs = basicSetEnableauthorizationserver(newEnableauthorizationserver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__ENABLEAUTHORIZATIONSERVER, newEnableauthorizationserver, newEnableauthorizationserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableGlobalMethodSecurity getEnableglobalmethodsecurity() {
		return enableglobalmethodsecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableglobalmethodsecurity(EnableGlobalMethodSecurity newEnableglobalmethodsecurity, NotificationChain msgs) {
		EnableGlobalMethodSecurity oldEnableglobalmethodsecurity = enableglobalmethodsecurity;
		enableglobalmethodsecurity = newEnableglobalmethodsecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__ENABLEGLOBALMETHODSECURITY, oldEnableglobalmethodsecurity, newEnableglobalmethodsecurity);
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
	public void setEnableglobalmethodsecurity(EnableGlobalMethodSecurity newEnableglobalmethodsecurity) {
		if (newEnableglobalmethodsecurity != enableglobalmethodsecurity) {
			NotificationChain msgs = null;
			if (enableglobalmethodsecurity != null)
				msgs = ((InternalEObject)enableglobalmethodsecurity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.CONFIGURATION__ENABLEGLOBALMETHODSECURITY, null, msgs);
			if (newEnableglobalmethodsecurity != null)
				msgs = ((InternalEObject)newEnableglobalmethodsecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.CONFIGURATION__ENABLEGLOBALMETHODSECURITY, null, msgs);
			msgs = basicSetEnableglobalmethodsecurity(newEnableglobalmethodsecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__ENABLEGLOBALMETHODSECURITY, newEnableglobalmethodsecurity, newEnableglobalmethodsecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.CONFIGURATION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEWEBSECURITY:
				return basicSetEnablewebsecurity(null, msgs);
			case PhotosMetaModelPackage.CONFIGURATION__ENABLERESOURCESERVER:
				return basicSetEnableresourceserver(null, msgs);
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEAUTHORIZATIONSERVER:
				return basicSetEnableauthorizationserver(null, msgs);
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEGLOBALMETHODSECURITY:
				return basicSetEnableglobalmethodsecurity(null, msgs);
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
			case PhotosMetaModelPackage.CONFIGURATION__BEAN:
				return getBean();
			case PhotosMetaModelPackage.CONFIGURATION__NAME:
				return getName();
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEWEBSECURITY:
				return getEnablewebsecurity();
			case PhotosMetaModelPackage.CONFIGURATION__ENABLERESOURCESERVER:
				return getEnableresourceserver();
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEAUTHORIZATIONSERVER:
				return getEnableauthorizationserver();
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEGLOBALMETHODSECURITY:
				return getEnableglobalmethodsecurity();
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
			case PhotosMetaModelPackage.CONFIGURATION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends Bean>)newValue);
				return;
			case PhotosMetaModelPackage.CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEWEBSECURITY:
				setEnablewebsecurity((EnableWebSecurity)newValue);
				return;
			case PhotosMetaModelPackage.CONFIGURATION__ENABLERESOURCESERVER:
				setEnableresourceserver((EnableResourceServer)newValue);
				return;
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEAUTHORIZATIONSERVER:
				setEnableauthorizationserver((EnableAuthorizationServer)newValue);
				return;
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEGLOBALMETHODSECURITY:
				setEnableglobalmethodsecurity((EnableGlobalMethodSecurity)newValue);
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
			case PhotosMetaModelPackage.CONFIGURATION__BEAN:
				getBean().clear();
				return;
			case PhotosMetaModelPackage.CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEWEBSECURITY:
				setEnablewebsecurity((EnableWebSecurity)null);
				return;
			case PhotosMetaModelPackage.CONFIGURATION__ENABLERESOURCESERVER:
				setEnableresourceserver((EnableResourceServer)null);
				return;
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEAUTHORIZATIONSERVER:
				setEnableauthorizationserver((EnableAuthorizationServer)null);
				return;
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEGLOBALMETHODSECURITY:
				setEnableglobalmethodsecurity((EnableGlobalMethodSecurity)null);
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
			case PhotosMetaModelPackage.CONFIGURATION__BEAN:
				return bean != null && !bean.isEmpty();
			case PhotosMetaModelPackage.CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEWEBSECURITY:
				return enablewebsecurity != null;
			case PhotosMetaModelPackage.CONFIGURATION__ENABLERESOURCESERVER:
				return enableresourceserver != null;
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEAUTHORIZATIONSERVER:
				return enableauthorizationserver != null;
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEGLOBALMETHODSECURITY:
				return enableglobalmethodsecurity != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
