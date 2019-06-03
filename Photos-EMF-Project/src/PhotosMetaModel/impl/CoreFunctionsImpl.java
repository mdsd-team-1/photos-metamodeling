/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.CoreFunctions;
import PhotosMetaModel.PhotosMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Functions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.CoreFunctionsImpl#getCorefunctions <em>Corefunctions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreFunctionsImpl extends ReactFunctionsImpl implements CoreFunctions {
	/**
	 * The cached value of the '{@link #getCorefunctions() <em>Corefunctions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorefunctions()
	 * @generated
	 * @ordered
	 */
	protected CoreFunctions corefunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreFunctionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.CORE_FUNCTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoreFunctions getCorefunctions() {
		if (corefunctions != null && corefunctions.eIsProxy()) {
			InternalEObject oldCorefunctions = (InternalEObject)corefunctions;
			corefunctions = (CoreFunctions)eResolveProxy(oldCorefunctions);
			if (corefunctions != oldCorefunctions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.CORE_FUNCTIONS__COREFUNCTIONS, oldCorefunctions, corefunctions));
			}
		}
		return corefunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFunctions basicGetCorefunctions() {
		return corefunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorefunctions(CoreFunctions newCorefunctions) {
		CoreFunctions oldCorefunctions = corefunctions;
		corefunctions = newCorefunctions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CORE_FUNCTIONS__COREFUNCTIONS, oldCorefunctions, corefunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.CORE_FUNCTIONS__COREFUNCTIONS:
				if (resolve) return getCorefunctions();
				return basicGetCorefunctions();
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
			case PhotosMetaModelPackage.CORE_FUNCTIONS__COREFUNCTIONS:
				setCorefunctions((CoreFunctions)newValue);
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
			case PhotosMetaModelPackage.CORE_FUNCTIONS__COREFUNCTIONS:
				setCorefunctions((CoreFunctions)null);
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
			case PhotosMetaModelPackage.CORE_FUNCTIONS__COREFUNCTIONS:
				return corefunctions != null;
		}
		return super.eIsSet(featureID);
	}

} //CoreFunctionsImpl
