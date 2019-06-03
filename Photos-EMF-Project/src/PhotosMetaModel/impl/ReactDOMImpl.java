/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Component_r;
import PhotosMetaModel.Element_r;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.ReactDOM;

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
 * An implementation of the model object '<em><b>React DOM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.ReactDOMImpl#getElement_r <em>Element r</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ReactDOMImpl#getComponet_r <em>Componet r</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactDOMImpl extends MinimalEObjectImpl.Container implements ReactDOM {
	/**
	 * The cached value of the '{@link #getElement_r() <em>Element r</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement_r()
	 * @generated
	 * @ordered
	 */
	protected EList<Element_r> element_r;

	/**
	 * The cached value of the '{@link #getComponet_r() <em>Componet r</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponet_r()
	 * @generated
	 * @ordered
	 */
	protected EList<Component_r> componet_r;

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
	public EList<Element_r> getElement_r() {
		if (element_r == null) {
			element_r = new EObjectContainmentEList<Element_r>(Element_r.class, this, PhotosMetaModelPackage.REACT_DOM__ELEMENT_R);
		}
		return element_r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component_r> getComponet_r() {
		if (componet_r == null) {
			componet_r = new EObjectContainmentEList<Component_r>(Component_r.class, this, PhotosMetaModelPackage.REACT_DOM__COMPONET_R);
		}
		return componet_r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.REACT_DOM__ELEMENT_R:
				return ((InternalEList<?>)getElement_r()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.REACT_DOM__COMPONET_R:
				return ((InternalEList<?>)getComponet_r()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.REACT_DOM__ELEMENT_R:
				return getElement_r();
			case PhotosMetaModelPackage.REACT_DOM__COMPONET_R:
				return getComponet_r();
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
			case PhotosMetaModelPackage.REACT_DOM__ELEMENT_R:
				getElement_r().clear();
				getElement_r().addAll((Collection<? extends Element_r>)newValue);
				return;
			case PhotosMetaModelPackage.REACT_DOM__COMPONET_R:
				getComponet_r().clear();
				getComponet_r().addAll((Collection<? extends Component_r>)newValue);
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
			case PhotosMetaModelPackage.REACT_DOM__ELEMENT_R:
				getElement_r().clear();
				return;
			case PhotosMetaModelPackage.REACT_DOM__COMPONET_R:
				getComponet_r().clear();
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
			case PhotosMetaModelPackage.REACT_DOM__ELEMENT_R:
				return element_r != null && !element_r.isEmpty();
			case PhotosMetaModelPackage.REACT_DOM__COMPONET_R:
				return componet_r != null && !componet_r.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReactDOMImpl
