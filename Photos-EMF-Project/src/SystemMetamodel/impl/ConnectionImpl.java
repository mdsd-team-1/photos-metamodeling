/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.Connection;
import SystemMetamodel.LayerSegment;
import SystemMetamodel.SystemMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.impl.ConnectionImpl#getSourceSegment <em>Source Segment</em>}</li>
 *   <li>{@link SystemMetamodel.impl.ConnectionImpl#getTargetSegment <em>Target Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getSourceSegment() <em>Source Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSegment()
	 * @generated
	 * @ordered
	 */
	protected LayerSegment sourceSegment;

	/**
	 * The cached value of the '{@link #getTargetSegment() <em>Target Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSegment()
	 * @generated
	 * @ordered
	 */
	protected LayerSegment targetSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerSegment getSourceSegment() {
		if (sourceSegment != null && sourceSegment.eIsProxy()) {
			InternalEObject oldSourceSegment = (InternalEObject)sourceSegment;
			sourceSegment = (LayerSegment)eResolveProxy(oldSourceSegment);
			if (sourceSegment != oldSourceSegment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemMetamodelPackage.CONNECTION__SOURCE_SEGMENT, oldSourceSegment, sourceSegment));
			}
		}
		return sourceSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerSegment basicGetSourceSegment() {
		return sourceSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceSegment(LayerSegment newSourceSegment) {
		LayerSegment oldSourceSegment = sourceSegment;
		sourceSegment = newSourceSegment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.CONNECTION__SOURCE_SEGMENT, oldSourceSegment, sourceSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerSegment getTargetSegment() {
		if (targetSegment != null && targetSegment.eIsProxy()) {
			InternalEObject oldTargetSegment = (InternalEObject)targetSegment;
			targetSegment = (LayerSegment)eResolveProxy(oldTargetSegment);
			if (targetSegment != oldTargetSegment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemMetamodelPackage.CONNECTION__TARGET_SEGMENT, oldTargetSegment, targetSegment));
			}
		}
		return targetSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerSegment basicGetTargetSegment() {
		return targetSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetSegment(LayerSegment newTargetSegment) {
		LayerSegment oldTargetSegment = targetSegment;
		targetSegment = newTargetSegment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.CONNECTION__TARGET_SEGMENT, oldTargetSegment, targetSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemMetamodelPackage.CONNECTION__SOURCE_SEGMENT:
				if (resolve) return getSourceSegment();
				return basicGetSourceSegment();
			case SystemMetamodelPackage.CONNECTION__TARGET_SEGMENT:
				if (resolve) return getTargetSegment();
				return basicGetTargetSegment();
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
			case SystemMetamodelPackage.CONNECTION__SOURCE_SEGMENT:
				setSourceSegment((LayerSegment)newValue);
				return;
			case SystemMetamodelPackage.CONNECTION__TARGET_SEGMENT:
				setTargetSegment((LayerSegment)newValue);
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
			case SystemMetamodelPackage.CONNECTION__SOURCE_SEGMENT:
				setSourceSegment((LayerSegment)null);
				return;
			case SystemMetamodelPackage.CONNECTION__TARGET_SEGMENT:
				setTargetSegment((LayerSegment)null);
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
			case SystemMetamodelPackage.CONNECTION__SOURCE_SEGMENT:
				return sourceSegment != null;
			case SystemMetamodelPackage.CONNECTION__TARGET_SEGMENT:
				return targetSegment != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
