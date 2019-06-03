/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Presentacion;
import PhotosMetaModel.SegmentoPresentacion;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.PresentacionImpl#getSegmentopresentacion <em>Segmentopresentacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentacionImpl extends CapaImpl implements Presentacion {
	/**
	 * The cached value of the '{@link #getSegmentopresentacion() <em>Segmentopresentacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentopresentacion()
	 * @generated
	 * @ordered
	 */
	protected EList<SegmentoPresentacion> segmentopresentacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.PRESENTACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SegmentoPresentacion> getSegmentopresentacion() {
		if (segmentopresentacion == null) {
			segmentopresentacion = new EObjectContainmentEList<SegmentoPresentacion>(SegmentoPresentacion.class, this, PhotosMetaModelPackage.PRESENTACION__SEGMENTOPRESENTACION);
		}
		return segmentopresentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.PRESENTACION__SEGMENTOPRESENTACION:
				return ((InternalEList<?>)getSegmentopresentacion()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.PRESENTACION__SEGMENTOPRESENTACION:
				return getSegmentopresentacion();
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
			case PhotosMetaModelPackage.PRESENTACION__SEGMENTOPRESENTACION:
				getSegmentopresentacion().clear();
				getSegmentopresentacion().addAll((Collection<? extends SegmentoPresentacion>)newValue);
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
			case PhotosMetaModelPackage.PRESENTACION__SEGMENTOPRESENTACION:
				getSegmentopresentacion().clear();
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
			case PhotosMetaModelPackage.PRESENTACION__SEGMENTOPRESENTACION:
				return segmentopresentacion != null && !segmentopresentacion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PresentacionImpl
