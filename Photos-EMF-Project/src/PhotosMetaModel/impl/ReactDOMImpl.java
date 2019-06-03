/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.ReactDOM;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>React DOM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.ReactDOMImpl#getIsRoute <em>Is Route</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ReactDOMImpl#getIsConstant <em>Is Constant</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ReactDOMImpl#getIsStruct <em>Is Struct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactDOMImpl extends ReactConfigurationImpl implements ReactDOM {
	/**
	 * The default value of the '{@link #getIsRoute() <em>Is Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRoute()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ROUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsRoute() <em>Is Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRoute()
	 * @generated
	 * @ordered
	 */
	protected Boolean isRoute = IS_ROUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsConstant() <em>Is Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConstant()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONSTANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsConstant() <em>Is Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConstant()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConstant = IS_CONSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsStruct() <em>Is Struct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStruct()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_STRUCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsStruct() <em>Is Struct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStruct()
	 * @generated
	 * @ordered
	 */
	protected String isStruct = IS_STRUCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactDOMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.REACT_DOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsRoute() {
		return isRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRoute(Boolean newIsRoute) {
		Boolean oldIsRoute = isRoute;
		isRoute = newIsRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.REACT_DOM__IS_ROUTE, oldIsRoute, isRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsConstant() {
		return isConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConstant(Boolean newIsConstant) {
		Boolean oldIsConstant = isConstant;
		isConstant = newIsConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.REACT_DOM__IS_CONSTANT, oldIsConstant, isConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIsStruct() {
		return isStruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsStruct(String newIsStruct) {
		String oldIsStruct = isStruct;
		isStruct = newIsStruct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.REACT_DOM__IS_STRUCT, oldIsStruct, isStruct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.REACT_DOM__IS_ROUTE:
				return getIsRoute();
			case PhotosMetaModelPackage.REACT_DOM__IS_CONSTANT:
				return getIsConstant();
			case PhotosMetaModelPackage.REACT_DOM__IS_STRUCT:
				return getIsStruct();
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
			case PhotosMetaModelPackage.REACT_DOM__IS_ROUTE:
				setIsRoute((Boolean)newValue);
				return;
			case PhotosMetaModelPackage.REACT_DOM__IS_CONSTANT:
				setIsConstant((Boolean)newValue);
				return;
			case PhotosMetaModelPackage.REACT_DOM__IS_STRUCT:
				setIsStruct((String)newValue);
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
			case PhotosMetaModelPackage.REACT_DOM__IS_ROUTE:
				setIsRoute(IS_ROUTE_EDEFAULT);
				return;
			case PhotosMetaModelPackage.REACT_DOM__IS_CONSTANT:
				setIsConstant(IS_CONSTANT_EDEFAULT);
				return;
			case PhotosMetaModelPackage.REACT_DOM__IS_STRUCT:
				setIsStruct(IS_STRUCT_EDEFAULT);
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
			case PhotosMetaModelPackage.REACT_DOM__IS_ROUTE:
				return IS_ROUTE_EDEFAULT == null ? isRoute != null : !IS_ROUTE_EDEFAULT.equals(isRoute);
			case PhotosMetaModelPackage.REACT_DOM__IS_CONSTANT:
				return IS_CONSTANT_EDEFAULT == null ? isConstant != null : !IS_CONSTANT_EDEFAULT.equals(isConstant);
			case PhotosMetaModelPackage.REACT_DOM__IS_STRUCT:
				return IS_STRUCT_EDEFAULT == null ? isStruct != null : !IS_STRUCT_EDEFAULT.equals(isStruct);
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
		result.append(" (isRoute: ");
		result.append(isRoute);
		result.append(", isConstant: ");
		result.append(isConstant);
		result.append(", isStruct: ");
		result.append(isStruct);
		result.append(')');
		return result.toString();
	}

} //ReactDOMImpl
