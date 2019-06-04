/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Spring;
import PhotosMetaModel.SpringBootApplication;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * The cached value of the '{@link #getSpringbootapplication() <em>Springbootapplication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpringbootapplication()
	 * @generated
	 * @ordered
	 */
	protected EList<SpringBootApplication> springbootapplication;

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
	public EList<SpringBootApplication> getSpringbootapplication() {
		if (springbootapplication == null) {
			springbootapplication = new EObjectContainmentEList<SpringBootApplication>(SpringBootApplication.class, this, PhotosMetaModelPackage.SPRING__SPRINGBOOTAPPLICATION);
		}
		return springbootapplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.SPRING__SPRINGBOOTAPPLICATION:
				return ((InternalEList<?>)getSpringbootapplication()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.SPRING__SPRINGBOOTAPPLICATION:
				return getSpringbootapplication();
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
			case PhotosMetaModelPackage.SPRING__SPRINGBOOTAPPLICATION:
				getSpringbootapplication().clear();
				getSpringbootapplication().addAll((Collection<? extends SpringBootApplication>)newValue);
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
				getSpringbootapplication().clear();
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
				return springbootapplication != null && !springbootapplication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpringImpl
