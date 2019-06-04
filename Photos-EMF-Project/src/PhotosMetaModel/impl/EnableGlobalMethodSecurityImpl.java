/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.EnableGlobalMethodSecurity;
import PhotosMetaModel.PhotosMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enable Global Method Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.EnableGlobalMethodSecurityImpl#isPrePostEnabled <em>Pre Post Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnableGlobalMethodSecurityImpl extends MinimalEObjectImpl.Container implements EnableGlobalMethodSecurity {
	/**
	 * The default value of the '{@link #isPrePostEnabled() <em>Pre Post Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrePostEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRE_POST_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrePostEnabled() <em>Pre Post Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrePostEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean prePostEnabled = PRE_POST_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnableGlobalMethodSecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.ENABLE_GLOBAL_METHOD_SECURITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrePostEnabled() {
		return prePostEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrePostEnabled(boolean newPrePostEnabled) {
		boolean oldPrePostEnabled = prePostEnabled;
		prePostEnabled = newPrePostEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.ENABLE_GLOBAL_METHOD_SECURITY__PRE_POST_ENABLED, oldPrePostEnabled, prePostEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.ENABLE_GLOBAL_METHOD_SECURITY__PRE_POST_ENABLED:
				return isPrePostEnabled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhotosMetaModelPackage.ENABLE_GLOBAL_METHOD_SECURITY__PRE_POST_ENABLED:
				setPrePostEnabled((Boolean)newValue);
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
			case PhotosMetaModelPackage.ENABLE_GLOBAL_METHOD_SECURITY__PRE_POST_ENABLED:
				setPrePostEnabled(PRE_POST_ENABLED_EDEFAULT);
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
			case PhotosMetaModelPackage.ENABLE_GLOBAL_METHOD_SECURITY__PRE_POST_ENABLED:
				return prePostEnabled != PRE_POST_ENABLED_EDEFAULT;
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
		result.append(" (prePostEnabled: ");
		result.append(prePostEnabled);
		result.append(')');
		return result.toString();
	}

} //EnableGlobalMethodSecurityImpl
