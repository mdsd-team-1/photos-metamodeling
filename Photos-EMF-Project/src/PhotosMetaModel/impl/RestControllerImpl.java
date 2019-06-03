/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Autowired;
import PhotosMetaModel.ExceptionHandler;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.RequestMapping;
import PhotosMetaModel.RestController;
import PhotosMetaModel.Specification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.RestControllerImpl#getRequestmapping <em>Requestmapping</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.RestControllerImpl#getExceptionhandler <em>Exceptionhandler</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.RestControllerImpl#getAutowired <em>Autowired</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.RestControllerImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.RestControllerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestControllerImpl extends MinimalEObjectImpl.Container implements RestController {
	/**
	 * The cached value of the '{@link #getRequestmapping() <em>Requestmapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestmapping()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestMapping> requestmapping;

	/**
	 * The cached value of the '{@link #getExceptionhandler() <em>Exceptionhandler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionhandler()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionHandler> exceptionhandler;

	/**
	 * The cached value of the '{@link #getAutowired() <em>Autowired</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutowired()
	 * @generated
	 * @ordered
	 */
	protected EList<Autowired> autowired;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<Specification> specification;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.REST_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequestMapping> getRequestmapping() {
		if (requestmapping == null) {
			requestmapping = new EObjectContainmentEList<RequestMapping>(RequestMapping.class, this, PhotosMetaModelPackage.REST_CONTROLLER__REQUESTMAPPING);
		}
		return requestmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExceptionHandler> getExceptionhandler() {
		if (exceptionhandler == null) {
			exceptionhandler = new EObjectContainmentEList<ExceptionHandler>(ExceptionHandler.class, this, PhotosMetaModelPackage.REST_CONTROLLER__EXCEPTIONHANDLER);
		}
		return exceptionhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Autowired> getAutowired() {
		if (autowired == null) {
			autowired = new EObjectContainmentEList<Autowired>(Autowired.class, this, PhotosMetaModelPackage.REST_CONTROLLER__AUTOWIRED);
		}
		return autowired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specification> getSpecification() {
		if (specification == null) {
			specification = new EObjectContainmentEList<Specification>(Specification.class, this, PhotosMetaModelPackage.REST_CONTROLLER__SPECIFICATION);
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.REST_CONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.REST_CONTROLLER__REQUESTMAPPING:
				return ((InternalEList<?>)getRequestmapping()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.REST_CONTROLLER__EXCEPTIONHANDLER:
				return ((InternalEList<?>)getExceptionhandler()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.REST_CONTROLLER__AUTOWIRED:
				return ((InternalEList<?>)getAutowired()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.REST_CONTROLLER__SPECIFICATION:
				return ((InternalEList<?>)getSpecification()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.REST_CONTROLLER__REQUESTMAPPING:
				return getRequestmapping();
			case PhotosMetaModelPackage.REST_CONTROLLER__EXCEPTIONHANDLER:
				return getExceptionhandler();
			case PhotosMetaModelPackage.REST_CONTROLLER__AUTOWIRED:
				return getAutowired();
			case PhotosMetaModelPackage.REST_CONTROLLER__SPECIFICATION:
				return getSpecification();
			case PhotosMetaModelPackage.REST_CONTROLLER__NAME:
				return getName();
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
			case PhotosMetaModelPackage.REST_CONTROLLER__REQUESTMAPPING:
				getRequestmapping().clear();
				getRequestmapping().addAll((Collection<? extends RequestMapping>)newValue);
				return;
			case PhotosMetaModelPackage.REST_CONTROLLER__EXCEPTIONHANDLER:
				getExceptionhandler().clear();
				getExceptionhandler().addAll((Collection<? extends ExceptionHandler>)newValue);
				return;
			case PhotosMetaModelPackage.REST_CONTROLLER__AUTOWIRED:
				getAutowired().clear();
				getAutowired().addAll((Collection<? extends Autowired>)newValue);
				return;
			case PhotosMetaModelPackage.REST_CONTROLLER__SPECIFICATION:
				getSpecification().clear();
				getSpecification().addAll((Collection<? extends Specification>)newValue);
				return;
			case PhotosMetaModelPackage.REST_CONTROLLER__NAME:
				setName((String)newValue);
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
			case PhotosMetaModelPackage.REST_CONTROLLER__REQUESTMAPPING:
				getRequestmapping().clear();
				return;
			case PhotosMetaModelPackage.REST_CONTROLLER__EXCEPTIONHANDLER:
				getExceptionhandler().clear();
				return;
			case PhotosMetaModelPackage.REST_CONTROLLER__AUTOWIRED:
				getAutowired().clear();
				return;
			case PhotosMetaModelPackage.REST_CONTROLLER__SPECIFICATION:
				getSpecification().clear();
				return;
			case PhotosMetaModelPackage.REST_CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
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
			case PhotosMetaModelPackage.REST_CONTROLLER__REQUESTMAPPING:
				return requestmapping != null && !requestmapping.isEmpty();
			case PhotosMetaModelPackage.REST_CONTROLLER__EXCEPTIONHANDLER:
				return exceptionhandler != null && !exceptionhandler.isEmpty();
			case PhotosMetaModelPackage.REST_CONTROLLER__AUTOWIRED:
				return autowired != null && !autowired.isEmpty();
			case PhotosMetaModelPackage.REST_CONTROLLER__SPECIFICATION:
				return specification != null && !specification.isEmpty();
			case PhotosMetaModelPackage.REST_CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RestControllerImpl
