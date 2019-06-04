/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.GeneratedValue;
import PhotosMetaModel.Id;
import PhotosMetaModel.PhotosMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * The cached value of the '{@link #getGeneratedvalue() <em>Generatedvalue</em>}' containment reference.
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
		return generatedvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratedvalue(GeneratedValue newGeneratedvalue, NotificationChain msgs) {
		GeneratedValue oldGeneratedvalue = generatedvalue;
		generatedvalue = newGeneratedvalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.ID__GENERATEDVALUE, oldGeneratedvalue, newGeneratedvalue);
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
	public void setGeneratedvalue(GeneratedValue newGeneratedvalue) {
		if (newGeneratedvalue != generatedvalue) {
			NotificationChain msgs = null;
			if (generatedvalue != null)
				msgs = ((InternalEObject)generatedvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.ID__GENERATEDVALUE, null, msgs);
			if (newGeneratedvalue != null)
				msgs = ((InternalEObject)newGeneratedvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.ID__GENERATEDVALUE, null, msgs);
			msgs = basicSetGeneratedvalue(newGeneratedvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.ID__GENERATEDVALUE, newGeneratedvalue, newGeneratedvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.ID__GENERATEDVALUE:
				return basicSetGeneratedvalue(null, msgs);
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
			case PhotosMetaModelPackage.ID__GENERATEDVALUE:
				return getGeneratedvalue();
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
