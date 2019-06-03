/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.DataSegment;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.SegmentStructure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.DataSegmentImpl#getSegmentstructure <em>Segmentstructure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSegmentImpl extends MinimalEObjectImpl.Container implements DataSegment {
	/**
	 * The cached value of the '{@link #getSegmentstructure() <em>Segmentstructure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentstructure()
	 * @generated
	 * @ordered
	 */
	protected SegmentStructure segmentstructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.DATA_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentStructure getSegmentstructure() {
		if (segmentstructure != null && segmentstructure.eIsProxy()) {
			InternalEObject oldSegmentstructure = (InternalEObject)segmentstructure;
			segmentstructure = (SegmentStructure)eResolveProxy(oldSegmentstructure);
			if (segmentstructure != oldSegmentstructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.DATA_SEGMENT__SEGMENTSTRUCTURE, oldSegmentstructure, segmentstructure));
			}
		}
		return segmentstructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentStructure basicGetSegmentstructure() {
		return segmentstructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSegmentstructure(SegmentStructure newSegmentstructure) {
		SegmentStructure oldSegmentstructure = segmentstructure;
		segmentstructure = newSegmentstructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.DATA_SEGMENT__SEGMENTSTRUCTURE, oldSegmentstructure, segmentstructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.DATA_SEGMENT__SEGMENTSTRUCTURE:
				if (resolve) return getSegmentstructure();
				return basicGetSegmentstructure();
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
			case PhotosMetaModelPackage.DATA_SEGMENT__SEGMENTSTRUCTURE:
				setSegmentstructure((SegmentStructure)newValue);
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
			case PhotosMetaModelPackage.DATA_SEGMENT__SEGMENTSTRUCTURE:
				setSegmentstructure((SegmentStructure)null);
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
			case PhotosMetaModelPackage.DATA_SEGMENT__SEGMENTSTRUCTURE:
				return segmentstructure != null;
		}
		return super.eIsSet(featureID);
	}

} //DataSegmentImpl
