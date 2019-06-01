/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.Arquitectura;
import SystemMetamodel.Dominio;
import SystemMetamodel.SoftGallery;
import SystemMetamodel.SystemMetamodelPackage;
import SystemMetamodel.Tecnología;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soft Gallery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.impl.SoftGalleryImpl#getArquitectura <em>Arquitectura</em>}</li>
 *   <li>{@link SystemMetamodel.impl.SoftGalleryImpl#getDominio <em>Dominio</em>}</li>
 *   <li>{@link SystemMetamodel.impl.SoftGalleryImpl#getTecnologia <em>Tecnologia</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftGalleryImpl extends MinimalEObjectImpl.Container implements SoftGallery {
	/**
	 * The cached value of the '{@link #getArquitectura() <em>Arquitectura</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArquitectura()
	 * @generated
	 * @ordered
	 */
	protected Arquitectura arquitectura;

	/**
	 * The cached value of the '{@link #getDominio() <em>Dominio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDominio()
	 * @generated
	 * @ordered
	 */
	protected Dominio dominio;

	/**
	 * The cached value of the '{@link #getTecnologia() <em>Tecnologia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTecnologia()
	 * @generated
	 * @ordered
	 */
	protected Tecnología tecnologia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftGalleryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.SOFT_GALLERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Arquitectura getArquitectura() {
		return arquitectura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArquitectura(Arquitectura newArquitectura, NotificationChain msgs) {
		Arquitectura oldArquitectura = arquitectura;
		arquitectura = newArquitectura;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.SOFT_GALLERY__ARQUITECTURA, oldArquitectura, newArquitectura);
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
	public void setArquitectura(Arquitectura newArquitectura) {
		if (newArquitectura != arquitectura) {
			NotificationChain msgs = null;
			if (arquitectura != null)
				msgs = ((InternalEObject)arquitectura).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemMetamodelPackage.SOFT_GALLERY__ARQUITECTURA, null, msgs);
			if (newArquitectura != null)
				msgs = ((InternalEObject)newArquitectura).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemMetamodelPackage.SOFT_GALLERY__ARQUITECTURA, null, msgs);
			msgs = basicSetArquitectura(newArquitectura, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.SOFT_GALLERY__ARQUITECTURA, newArquitectura, newArquitectura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dominio getDominio() {
		return dominio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDominio(Dominio newDominio, NotificationChain msgs) {
		Dominio oldDominio = dominio;
		dominio = newDominio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.SOFT_GALLERY__DOMINIO, oldDominio, newDominio);
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
	public void setDominio(Dominio newDominio) {
		if (newDominio != dominio) {
			NotificationChain msgs = null;
			if (dominio != null)
				msgs = ((InternalEObject)dominio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemMetamodelPackage.SOFT_GALLERY__DOMINIO, null, msgs);
			if (newDominio != null)
				msgs = ((InternalEObject)newDominio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemMetamodelPackage.SOFT_GALLERY__DOMINIO, null, msgs);
			msgs = basicSetDominio(newDominio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.SOFT_GALLERY__DOMINIO, newDominio, newDominio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tecnología getTecnologia() {
		return tecnologia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTecnologia(Tecnología newTecnologia, NotificationChain msgs) {
		Tecnología oldTecnologia = tecnologia;
		tecnologia = newTecnologia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.SOFT_GALLERY__TECNOLOGIA, oldTecnologia, newTecnologia);
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
	public void setTecnologia(Tecnología newTecnologia) {
		if (newTecnologia != tecnologia) {
			NotificationChain msgs = null;
			if (tecnologia != null)
				msgs = ((InternalEObject)tecnologia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemMetamodelPackage.SOFT_GALLERY__TECNOLOGIA, null, msgs);
			if (newTecnologia != null)
				msgs = ((InternalEObject)newTecnologia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemMetamodelPackage.SOFT_GALLERY__TECNOLOGIA, null, msgs);
			msgs = basicSetTecnologia(newTecnologia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.SOFT_GALLERY__TECNOLOGIA, newTecnologia, newTecnologia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemMetamodelPackage.SOFT_GALLERY__ARQUITECTURA:
				return basicSetArquitectura(null, msgs);
			case SystemMetamodelPackage.SOFT_GALLERY__DOMINIO:
				return basicSetDominio(null, msgs);
			case SystemMetamodelPackage.SOFT_GALLERY__TECNOLOGIA:
				return basicSetTecnologia(null, msgs);
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
			case SystemMetamodelPackage.SOFT_GALLERY__ARQUITECTURA:
				return getArquitectura();
			case SystemMetamodelPackage.SOFT_GALLERY__DOMINIO:
				return getDominio();
			case SystemMetamodelPackage.SOFT_GALLERY__TECNOLOGIA:
				return getTecnologia();
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
			case SystemMetamodelPackage.SOFT_GALLERY__ARQUITECTURA:
				setArquitectura((Arquitectura)newValue);
				return;
			case SystemMetamodelPackage.SOFT_GALLERY__DOMINIO:
				setDominio((Dominio)newValue);
				return;
			case SystemMetamodelPackage.SOFT_GALLERY__TECNOLOGIA:
				setTecnologia((Tecnología)newValue);
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
			case SystemMetamodelPackage.SOFT_GALLERY__ARQUITECTURA:
				setArquitectura((Arquitectura)null);
				return;
			case SystemMetamodelPackage.SOFT_GALLERY__DOMINIO:
				setDominio((Dominio)null);
				return;
			case SystemMetamodelPackage.SOFT_GALLERY__TECNOLOGIA:
				setTecnologia((Tecnología)null);
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
			case SystemMetamodelPackage.SOFT_GALLERY__ARQUITECTURA:
				return arquitectura != null;
			case SystemMetamodelPackage.SOFT_GALLERY__DOMINIO:
				return dominio != null;
			case SystemMetamodelPackage.SOFT_GALLERY__TECNOLOGIA:
				return tecnologia != null;
		}
		return super.eIsSet(featureID);
	}

} //SoftGalleryImpl
