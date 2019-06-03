/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Spring;
import PhotosMetaModel.SpringBootApplication;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.SpringImpl#getSpringbootapplication <em>Springbootapplication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpringImpl extends MinimalEObjectImpl.Container implements Spring {
	/**
	 * The cached value of the '{@link #getSpringbootapplication() <em>Springbootapplication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpringbootapplication()
	 * @generated
	 * @ordered
	 */
	protected SpringBootApplication springbootapplication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.SPRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpringBootApplication getSpringbootapplication() {
		if (springbootapplication != null && springbootapplication.eIsProxy()) {
			InternalEObject oldSpringbootapplication = (InternalEObject)springbootapplication;
			springbootapplication = (SpringBootApplication)eResolveProxy(oldSpringbootapplication);
			if (springbootapplication != oldSpringbootapplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.SPRING__SPRINGBOOTAPPLICATION, oldSpringbootapplication, springbootapplication));
			}
		}
		return springbootapplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringBootApplication basicGetSpringbootapplication() {
		return springbootapplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpringbootapplication(SpringBootApplication newSpringbootapplication) {
		SpringBootApplication oldSpringbootapplication = springbootapplication;
		springbootapplication = newSpringbootapplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SPRING__SPRINGBOOTAPPLICATION, oldSpringbootapplication, springbootapplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.SPRING__SPRINGBOOTAPPLICATION:
				if (resolve) return getSpringbootapplication();
				return basicGetSpringbootapplication();
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
			case PhotosMetaModelPackage.SPRING__SPRINGBOOTAPPLICATION:
				setSpringbootapplication((SpringBootApplication)newValue);
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
			case PhotosMetaModelPackage.SPRING__SPRINGBOOTAPPLICATION:
				setSpringbootapplication((SpringBootApplication)null);
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
			case PhotosMetaModelPackage.SPRING__SPRINGBOOTAPPLICATION:
				return springbootapplication != null;
		}
		return super.eIsSet(featureID);
	}

} //SpringImpl
