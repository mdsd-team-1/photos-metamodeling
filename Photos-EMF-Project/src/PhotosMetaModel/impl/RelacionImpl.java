/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Capa;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Relacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.RelacionImpl#getRelacionSource <em>Relacion Source</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.RelacionImpl#getRelacionTarget <em>Relacion Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionImpl extends MinimalEObjectImpl.Container implements Relacion {
	/**
	 * The cached value of the '{@link #getRelacionSource() <em>Relacion Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionSource()
	 * @generated
	 * @ordered
	 */
	protected Capa relacionSource;

	/**
	 * The cached value of the '{@link #getRelacionTarget() <em>Relacion Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionTarget()
	 * @generated
	 * @ordered
	 */
	protected Capa relacionTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.RELACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capa getRelacionSource() {
		if (relacionSource != null && relacionSource.eIsProxy()) {
			InternalEObject oldRelacionSource = (InternalEObject)relacionSource;
			relacionSource = (Capa)eResolveProxy(oldRelacionSource);
			if (relacionSource != oldRelacionSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.RELACION__RELACION_SOURCE, oldRelacionSource, relacionSource));
			}
		}
		return relacionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capa basicGetRelacionSource() {
		return relacionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelacionSource(Capa newRelacionSource) {
		Capa oldRelacionSource = relacionSource;
		relacionSource = newRelacionSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.RELACION__RELACION_SOURCE, oldRelacionSource, relacionSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capa getRelacionTarget() {
		if (relacionTarget != null && relacionTarget.eIsProxy()) {
			InternalEObject oldRelacionTarget = (InternalEObject)relacionTarget;
			relacionTarget = (Capa)eResolveProxy(oldRelacionTarget);
			if (relacionTarget != oldRelacionTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.RELACION__RELACION_TARGET, oldRelacionTarget, relacionTarget));
			}
		}
		return relacionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capa basicGetRelacionTarget() {
		return relacionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelacionTarget(Capa newRelacionTarget) {
		Capa oldRelacionTarget = relacionTarget;
		relacionTarget = newRelacionTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.RELACION__RELACION_TARGET, oldRelacionTarget, relacionTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.RELACION__RELACION_SOURCE:
				if (resolve) return getRelacionSource();
				return basicGetRelacionSource();
			case PhotosMetaModelPackage.RELACION__RELACION_TARGET:
				if (resolve) return getRelacionTarget();
				return basicGetRelacionTarget();
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
			case PhotosMetaModelPackage.RELACION__RELACION_SOURCE:
				setRelacionSource((Capa)newValue);
				return;
			case PhotosMetaModelPackage.RELACION__RELACION_TARGET:
				setRelacionTarget((Capa)newValue);
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
			case PhotosMetaModelPackage.RELACION__RELACION_SOURCE:
				setRelacionSource((Capa)null);
				return;
			case PhotosMetaModelPackage.RELACION__RELACION_TARGET:
				setRelacionTarget((Capa)null);
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
			case PhotosMetaModelPackage.RELACION__RELACION_SOURCE:
				return relacionSource != null;
			case PhotosMetaModelPackage.RELACION__RELACION_TARGET:
				return relacionTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //RelacionImpl
