/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.GeneratedValue;
import PhotosMetaModel.Id;
import PhotosMetaModel.PhotosMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.IdImpl#getGeneratedvalue <em>Generatedvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdImpl extends MinimalEObjectImpl.Container implements Id {
	/**
	 * The cached value of the '{@link #getGeneratedvalue() <em>Generatedvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedvalue()
	 * @generated
	 * @ordered
	 */
	protected GeneratedValue generatedvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneratedValue getGeneratedvalue() {
		if (generatedvalue != null && generatedvalue.eIsProxy()) {
			InternalEObject oldGeneratedvalue = (InternalEObject)generatedvalue;
			generatedvalue = (GeneratedValue)eResolveProxy(oldGeneratedvalue);
			if (generatedvalue != oldGeneratedvalue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.ID__GENERATEDVALUE, oldGeneratedvalue, generatedvalue));
			}
		}
		return generatedvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedValue basicGetGeneratedvalue() {
		return generatedvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneratedvalue(GeneratedValue newGeneratedvalue) {
		GeneratedValue oldGeneratedvalue = generatedvalue;
		generatedvalue = newGeneratedvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.ID__GENERATEDVALUE, oldGeneratedvalue, generatedvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.ID__GENERATEDVALUE:
				if (resolve) return getGeneratedvalue();
				return basicGetGeneratedvalue();
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
			case PhotosMetaModelPackage.ID__GENERATEDVALUE:
				setGeneratedvalue((GeneratedValue)newValue);
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
			case PhotosMetaModelPackage.ID__GENERATEDVALUE:
				setGeneratedvalue((GeneratedValue)null);
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
			case PhotosMetaModelPackage.ID__GENERATEDVALUE:
				return generatedvalue != null;
		}
		return super.eIsSet(featureID);
	}

} //IdImpl
