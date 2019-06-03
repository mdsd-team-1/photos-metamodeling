/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Connection;
import PhotosMetaModel.Layer;
import PhotosMetaModel.PhotosMetaModelPackage;

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
 *   <li>{@link PhotosMetaModel.impl.ConnectionImpl#getSourceLayer <em>Source Layer</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ConnectionImpl#getTargetLayer <em>Target Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getSourceLayer() <em>Source Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLayer()
	 * @generated
	 * @ordered
	 */
	protected Layer sourceLayer;

	/**
	 * The cached value of the '{@link #getTargetLayer() <em>Target Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLayer()
	 * @generated
	 * @ordered
	 */
	protected Layer targetLayer;

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
		return PhotosMetaModelPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layer getSourceLayer() {
		if (sourceLayer != null && sourceLayer.eIsProxy()) {
			InternalEObject oldSourceLayer = (InternalEObject)sourceLayer;
			sourceLayer = (Layer)eResolveProxy(oldSourceLayer);
			if (sourceLayer != oldSourceLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.CONNECTION__SOURCE_LAYER, oldSourceLayer, sourceLayer));
			}
		}
		return sourceLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer basicGetSourceLayer() {
		return sourceLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceLayer(Layer newSourceLayer) {
		Layer oldSourceLayer = sourceLayer;
		sourceLayer = newSourceLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONNECTION__SOURCE_LAYER, oldSourceLayer, sourceLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layer getTargetLayer() {
		if (targetLayer != null && targetLayer.eIsProxy()) {
			InternalEObject oldTargetLayer = (InternalEObject)targetLayer;
			targetLayer = (Layer)eResolveProxy(oldTargetLayer);
			if (targetLayer != oldTargetLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.CONNECTION__TARGET_LAYER, oldTargetLayer, targetLayer));
			}
		}
		return targetLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer basicGetTargetLayer() {
		return targetLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetLayer(Layer newTargetLayer) {
		Layer oldTargetLayer = targetLayer;
		targetLayer = newTargetLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONNECTION__TARGET_LAYER, oldTargetLayer, targetLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.CONNECTION__SOURCE_LAYER:
				if (resolve) return getSourceLayer();
				return basicGetSourceLayer();
			case PhotosMetaModelPackage.CONNECTION__TARGET_LAYER:
				if (resolve) return getTargetLayer();
				return basicGetTargetLayer();
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
			case PhotosMetaModelPackage.CONNECTION__SOURCE_LAYER:
				setSourceLayer((Layer)newValue);
				return;
			case PhotosMetaModelPackage.CONNECTION__TARGET_LAYER:
				setTargetLayer((Layer)newValue);
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
			case PhotosMetaModelPackage.CONNECTION__SOURCE_LAYER:
				setSourceLayer((Layer)null);
				return;
			case PhotosMetaModelPackage.CONNECTION__TARGET_LAYER:
				setTargetLayer((Layer)null);
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
			case PhotosMetaModelPackage.CONNECTION__SOURCE_LAYER:
				return sourceLayer != null;
			case PhotosMetaModelPackage.CONNECTION__TARGET_LAYER:
				return targetLayer != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
