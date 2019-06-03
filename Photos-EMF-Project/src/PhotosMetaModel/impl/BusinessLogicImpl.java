/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.BusinessLogic;
import PhotosMetaModel.BusinessLogicSegment;
import PhotosMetaModel.PhotosMetaModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Logic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.BusinessLogicImpl#getBusinessLogicSegment <em>Business Logic Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessLogicImpl extends LayerImpl implements BusinessLogic {
	/**
	 * The cached value of the '{@link #getBusinessLogicSegment() <em>Business Logic Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessLogicSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessLogicSegment> businessLogicSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessLogicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.BUSINESS_LOGIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusinessLogicSegment> getBusinessLogicSegment() {
		if (businessLogicSegment == null) {
			businessLogicSegment = new EObjectContainmentEList<BusinessLogicSegment>(BusinessLogicSegment.class, this, PhotosMetaModelPackage.BUSINESS_LOGIC__BUSINESS_LOGIC_SEGMENT);
		}
		return businessLogicSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.BUSINESS_LOGIC__BUSINESS_LOGIC_SEGMENT:
				return ((InternalEList<?>)getBusinessLogicSegment()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.BUSINESS_LOGIC__BUSINESS_LOGIC_SEGMENT:
				return getBusinessLogicSegment();
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
			case PhotosMetaModelPackage.BUSINESS_LOGIC__BUSINESS_LOGIC_SEGMENT:
				getBusinessLogicSegment().clear();
				getBusinessLogicSegment().addAll((Collection<? extends BusinessLogicSegment>)newValue);
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
			case PhotosMetaModelPackage.BUSINESS_LOGIC__BUSINESS_LOGIC_SEGMENT:
				getBusinessLogicSegment().clear();
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
			case PhotosMetaModelPackage.BUSINESS_LOGIC__BUSINESS_LOGIC_SEGMENT:
				return businessLogicSegment != null && !businessLogicSegment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessLogicImpl
