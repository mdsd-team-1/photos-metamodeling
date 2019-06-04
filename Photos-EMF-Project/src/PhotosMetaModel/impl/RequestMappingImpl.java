/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.PathVariable;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.RequestMapping;
import PhotosMetaModel.RequestPart;

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
 * An implementation of the model object '<em><b>Request Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.RequestMappingImpl#getRequestpart <em>Requestpart</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.RequestMappingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.RequestMappingImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.RequestMappingImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.RequestMappingImpl#getPathVariable <em>Path Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestMappingImpl extends MinimalEObjectImpl.Container implements RequestMapping {
	/**
	 * The cached value of the '{@link #getRequestpart() <em>Requestpart</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestpart()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestPart> requestpart;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduces() <em>Produces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected String produces = PRODUCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPathVariable() <em>Path Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<PathVariable> pathVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.REQUEST_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequestPart> getRequestpart() {
		if (requestpart == null) {
			requestpart = new EObjectContainmentEList<RequestPart>(RequestPart.class, this, PhotosMetaModelPackage.REQUEST_MAPPING__REQUESTPART);
		}
		return requestpart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.REQUEST_MAPPING__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.REQUEST_MAPPING__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProduces() {
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduces(String newProduces) {
		String oldProduces = produces;
		produces = newProduces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.REQUEST_MAPPING__PRODUCES, oldProduces, produces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PathVariable> getPathVariable() {
		if (pathVariable == null) {
			pathVariable = new EObjectContainmentEList<PathVariable>(PathVariable.class, this, PhotosMetaModelPackage.REQUEST_MAPPING__PATH_VARIABLE);
		}
		return pathVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.REQUEST_MAPPING__REQUESTPART:
				return ((InternalEList<?>)getRequestpart()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.REQUEST_MAPPING__PATH_VARIABLE:
				return ((InternalEList<?>)getPathVariable()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.REQUEST_MAPPING__REQUESTPART:
				return getRequestpart();
			case PhotosMetaModelPackage.REQUEST_MAPPING__VALUE:
				return getValue();
			case PhotosMetaModelPackage.REQUEST_MAPPING__METHOD:
				return getMethod();
			case PhotosMetaModelPackage.REQUEST_MAPPING__PRODUCES:
				return getProduces();
			case PhotosMetaModelPackage.REQUEST_MAPPING__PATH_VARIABLE:
				return getPathVariable();
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
			case PhotosMetaModelPackage.REQUEST_MAPPING__REQUESTPART:
				getRequestpart().clear();
				getRequestpart().addAll((Collection<? extends RequestPart>)newValue);
				return;
			case PhotosMetaModelPackage.REQUEST_MAPPING__VALUE:
				setValue((String)newValue);
				return;
			case PhotosMetaModelPackage.REQUEST_MAPPING__METHOD:
				setMethod((String)newValue);
				return;
			case PhotosMetaModelPackage.REQUEST_MAPPING__PRODUCES:
				setProduces((String)newValue);
				return;
			case PhotosMetaModelPackage.REQUEST_MAPPING__PATH_VARIABLE:
				getPathVariable().clear();
				getPathVariable().addAll((Collection<? extends PathVariable>)newValue);
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
			case PhotosMetaModelPackage.REQUEST_MAPPING__REQUESTPART:
				getRequestpart().clear();
				return;
			case PhotosMetaModelPackage.REQUEST_MAPPING__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PhotosMetaModelPackage.REQUEST_MAPPING__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case PhotosMetaModelPackage.REQUEST_MAPPING__PRODUCES:
				setProduces(PRODUCES_EDEFAULT);
				return;
			case PhotosMetaModelPackage.REQUEST_MAPPING__PATH_VARIABLE:
				getPathVariable().clear();
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
			case PhotosMetaModelPackage.REQUEST_MAPPING__REQUESTPART:
				return requestpart != null && !requestpart.isEmpty();
			case PhotosMetaModelPackage.REQUEST_MAPPING__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case PhotosMetaModelPackage.REQUEST_MAPPING__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case PhotosMetaModelPackage.REQUEST_MAPPING__PRODUCES:
				return PRODUCES_EDEFAULT == null ? produces != null : !PRODUCES_EDEFAULT.equals(produces);
			case PhotosMetaModelPackage.REQUEST_MAPPING__PATH_VARIABLE:
				return pathVariable != null && !pathVariable.isEmpty();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", method: ");
		result.append(method);
		result.append(", produces: ");
		result.append(produces);
		result.append(')');
		return result.toString();
	}

} //RequestMappingImpl
