/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Presentation;
import PhotosMetaModel.PresentationSegment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.PresentationImpl#getPresentationLayer <em>Presentation Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentationImpl extends LayerImpl implements Presentation {
	/**
	 * The cached value of the '{@link #getPresentationLayer() <em>Presentation Layer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationLayer()
	 * @generated
	 * @ordered
	 */
	protected EList<PresentationSegment> presentationLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PresentationSegment> getPresentationLayer() {
		if (presentationLayer == null) {
			presentationLayer = new EObjectContainmentEList<PresentationSegment>(PresentationSegment.class, this, PhotosMetaModelPackage.PRESENTATION__PRESENTATION_LAYER);
		}
		return presentationLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.PRESENTATION__PRESENTATION_LAYER:
				return ((InternalEList<?>)getPresentationLayer()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.PRESENTATION__PRESENTATION_LAYER:
				return getPresentationLayer();
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
			case PhotosMetaModelPackage.PRESENTATION__PRESENTATION_LAYER:
				getPresentationLayer().clear();
				getPresentationLayer().addAll((Collection<? extends PresentationSegment>)newValue);
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
			case PhotosMetaModelPackage.PRESENTATION__PRESENTATION_LAYER:
				getPresentationLayer().clear();
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
			case PhotosMetaModelPackage.PRESENTATION__PRESENTATION_LAYER:
				return presentationLayer != null && !presentationLayer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PresentationImpl
