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
	 * The cached value of the '{@link #getEnablewebsecurity() <em>Enablewebsecurity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablewebsecurity()
	 * @generated
	 * @ordered
	 */
	protected EnableWebSecurity enablewebsecurity;

	/**
	 * The cached value of the '{@link #getEnableresourceserver() <em>Enableresourceserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableresourceserver()
	 * @generated
	 * @ordered
	 */
	protected EnableResourceServer enableresourceserver;

	/**
	 * The cached value of the '{@link #getEnableauthorizationserver() <em>Enableauthorizationserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableauthorizationserver()
	 * @generated
	 * @ordered
	 */
	protected EnableAuthorizationServer enableauthorizationserver;

	/**
	 * The cached value of the '{@link #getEnableglobalmethodsecurity() <em>Enableglobalmethodsecurity</em>}' reference.
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
	public EnableWebSecurity getEnablewebsecurity() {
		if (enablewebsecurity != null && enablewebsecurity.eIsProxy()) {
			InternalEObject oldEnablewebsecurity = (InternalEObject)enablewebsecurity;
			enablewebsecurity = (EnableWebSecurity)eResolveProxy(oldEnablewebsecurity);
			if (enablewebsecurity != oldEnablewebsecurity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.CONFIGURATION__ENABLEWEBSECURITY, oldEnablewebsecurity, enablewebsecurity));
			}
		}
		return enablewebsecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableWebSecurity basicGetEnablewebsecurity() {
		return enablewebsecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnablewebsecurity(EnableWebSecurity newEnablewebsecurity) {
		EnableWebSecurity oldEnablewebsecurity = enablewebsecurity;
		enablewebsecurity = newEnablewebsecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__ENABLEWEBSECURITY, oldEnablewebsecurity, enablewebsecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableResourceServer getEnableresourceserver() {
		if (enableresourceserver != null && enableresourceserver.eIsProxy()) {
			InternalEObject oldEnableresourceserver = (InternalEObject)enableresourceserver;
			enableresourceserver = (EnableResourceServer)eResolveProxy(oldEnableresourceserver);
			if (enableresourceserver != oldEnableresourceserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.CONFIGURATION__ENABLERESOURCESERVER, oldEnableresourceserver, enableresourceserver));
			}
		}
		return enableresourceserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableResourceServer basicGetEnableresourceserver() {
		return enableresourceserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableresourceserver(EnableResourceServer newEnableresourceserver) {
		EnableResourceServer oldEnableresourceserver = enableresourceserver;
		enableresourceserver = newEnableresourceserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__ENABLERESOURCESERVER, oldEnableresourceserver, enableresourceserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableAuthorizationServer getEnableauthorizationserver() {
		if (enableauthorizationserver != null && enableauthorizationserver.eIsProxy()) {
			InternalEObject oldEnableauthorizationserver = (InternalEObject)enableauthorizationserver;
			enableauthorizationserver = (EnableAuthorizationServer)eResolveProxy(oldEnableauthorizationserver);
			if (enableauthorizationserver != oldEnableauthorizationserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.CONFIGURATION__ENABLEAUTHORIZATIONSERVER, oldEnableauthorizationserver, enableauthorizationserver));
			}
		}
		return enableauthorizationserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableAuthorizationServer basicGetEnableauthorizationserver() {
		return enableauthorizationserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableauthorizationserver(EnableAuthorizationServer newEnableauthorizationserver) {
		EnableAuthorizationServer oldEnableauthorizationserver = enableauthorizationserver;
		enableauthorizationserver = newEnableauthorizationserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__ENABLEAUTHORIZATIONSERVER, oldEnableauthorizationserver, enableauthorizationserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableGlobalMethodSecurity getEnableglobalmethodsecurity() {
		if (enableglobalmethodsecurity != null && enableglobalmethodsecurity.eIsProxy()) {
			InternalEObject oldEnableglobalmethodsecurity = (InternalEObject)enableglobalmethodsecurity;
			enableglobalmethodsecurity = (EnableGlobalMethodSecurity)eResolveProxy(oldEnableglobalmethodsecurity);
			if (enableglobalmethodsecurity != oldEnableglobalmethodsecurity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.CONFIGURATION__ENABLEGLOBALMETHODSECURITY, oldEnableglobalmethodsecurity, enableglobalmethodsecurity));
			}
		}
		return enableglobalmethodsecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableGlobalMethodSecurity basicGetEnableglobalmethodsecurity() {
		return enableglobalmethodsecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableglobalmethodsecurity(EnableGlobalMethodSecurity newEnableglobalmethodsecurity) {
		EnableGlobalMethodSecurity oldEnableglobalmethodsecurity = enableglobalmethodsecurity;
		enableglobalmethodsecurity = newEnableglobalmethodsecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONFIGURATION__ENABLEGLOBALMETHODSECURITY, oldEnableglobalmethodsecurity, enableglobalmethodsecurity));
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
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEWEBSECURITY:
				if (resolve) return getEnablewebsecurity();
				return basicGetEnablewebsecurity();
			case PhotosMetaModelPackage.CONFIGURATION__ENABLERESOURCESERVER:
				if (resolve) return getEnableresourceserver();
				return basicGetEnableresourceserver();
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEAUTHORIZATIONSERVER:
				if (resolve) return getEnableauthorizationserver();
				return basicGetEnableauthorizationserver();
			case PhotosMetaModelPackage.CONFIGURATION__ENABLEGLOBALMETHODSECURITY:
				if (resolve) return getEnableglobalmethodsecurity();
				return basicGetEnableglobalmethodsecurity();
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

} //ConfigurationImpl
