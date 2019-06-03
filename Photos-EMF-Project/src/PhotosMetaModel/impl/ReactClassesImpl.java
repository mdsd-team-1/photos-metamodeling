/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Props;
import PhotosMetaModel.ReactClasses;
import PhotosMetaModel.ReactFunctions;
import PhotosMetaModel.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>React Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.ReactClassesImpl#getReactfunctions <em>Reactfunctions</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ReactClassesImpl#getProps <em>Props</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ReactClassesImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactClassesImpl extends MinimalEObjectImpl.Container implements ReactClasses {
	/**
	 * The cached value of the '{@link #getReactfunctions() <em>Reactfunctions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactfunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReactFunctions> reactfunctions;

	/**
	 * The cached value of the '{@link #getProps() <em>Props</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected EList<Props> props;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactClassesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.REACT_CLASSES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReactFunctions> getReactfunctions() {
		if (reactfunctions == null) {
			reactfunctions = new EObjectContainmentEList<ReactFunctions>(ReactFunctions.class, this, PhotosMetaModelPackage.REACT_CLASSES__REACTFUNCTIONS);
		}
		return reactfunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Props> getProps() {
		if (props == null) {
			props = new EObjectContainmentEList<Props>(Props.class, this, PhotosMetaModelPackage.REACT_CLASSES__PROPS);
		}
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, PhotosMetaModelPackage.REACT_CLASSES__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.REACT_CLASSES__REACTFUNCTIONS:
				return ((InternalEList<?>)getReactfunctions()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.REACT_CLASSES__PROPS:
				return ((InternalEList<?>)getProps()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.REACT_CLASSES__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.REACT_CLASSES__REACTFUNCTIONS:
				return getReactfunctions();
			case PhotosMetaModelPackage.REACT_CLASSES__PROPS:
				return getProps();
			case PhotosMetaModelPackage.REACT_CLASSES__STATE:
				return getState();
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
			case PhotosMetaModelPackage.REACT_CLASSES__REACTFUNCTIONS:
				getReactfunctions().clear();
				getReactfunctions().addAll((Collection<? extends ReactFunctions>)newValue);
				return;
			case PhotosMetaModelPackage.REACT_CLASSES__PROPS:
				getProps().clear();
				getProps().addAll((Collection<? extends Props>)newValue);
				return;
			case PhotosMetaModelPackage.REACT_CLASSES__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
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
			case PhotosMetaModelPackage.REACT_CLASSES__REACTFUNCTIONS:
				getReactfunctions().clear();
				return;
			case PhotosMetaModelPackage.REACT_CLASSES__PROPS:
				getProps().clear();
				return;
			case PhotosMetaModelPackage.REACT_CLASSES__STATE:
				getState().clear();
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
			case PhotosMetaModelPackage.REACT_CLASSES__REACTFUNCTIONS:
				return reactfunctions != null && !reactfunctions.isEmpty();
			case PhotosMetaModelPackage.REACT_CLASSES__PROPS:
				return props != null && !props.isEmpty();
			case PhotosMetaModelPackage.REACT_CLASSES__STATE:
				return state != null && !state.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReactClassesImpl
