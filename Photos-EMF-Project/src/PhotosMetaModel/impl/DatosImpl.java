/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Datos;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.SegmentoDatos;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.DatosImpl#getSegmentodatos <em>Segmentodatos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatosImpl extends CapaImpl implements Datos {
	/**
	 * The cached value of the '{@link #getSegmentodatos() <em>Segmentodatos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentodatos()
	 * @generated
	 * @ordered
	 */
	protected EList<SegmentoDatos> segmentodatos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.DATOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SegmentoDatos> getSegmentodatos() {
		if (segmentodatos == null) {
			segmentodatos = new EObjectContainmentEList<SegmentoDatos>(SegmentoDatos.class, this, PhotosMetaModelPackage.DATOS__SEGMENTODATOS);
		}
		return segmentodatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.DATOS__SEGMENTODATOS:
				return ((InternalEList<?>)getSegmentodatos()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.DATOS__SEGMENTODATOS:
				return getSegmentodatos();
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
			case PhotosMetaModelPackage.DATOS__SEGMENTODATOS:
				getSegmentodatos().clear();
				getSegmentodatos().addAll((Collection<? extends SegmentoDatos>)newValue);
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
			case PhotosMetaModelPackage.DATOS__SEGMENTODATOS:
				getSegmentodatos().clear();
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
			case PhotosMetaModelPackage.DATOS__SEGMENTODATOS:
				return segmentodatos != null && !segmentodatos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatosImpl
