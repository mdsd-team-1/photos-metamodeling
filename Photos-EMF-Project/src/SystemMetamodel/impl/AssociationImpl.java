/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.Association;
import SystemMetamodel.SystemMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.impl.AssociationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link SystemMetamodel.impl.AssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link SystemMetamodel.impl.AssociationImpl#isIsComposition <em>Is Composition</em>}</li>
 *   <li>{@link SystemMetamodel.impl.AssociationImpl#isIsAggregation <em>Is Aggregation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends MinimalEObjectImpl.Container implements Association {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected SystemMetamodel.Class target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SystemMetamodel.Class source;

	/**
	 * The default value of the '{@link #isIsComposition() <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposition() <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposition()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposition = IS_COMPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAggregation() <em>Is Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AGGREGATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAggregation() <em>Is Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAggregation()
	 * @generated
	 * @ordered
	 */
	protected boolean isAggregation = IS_AGGREGATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemMetamodel.Class getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (SystemMetamodel.Class)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemMetamodelPackage.ASSOCIATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMetamodel.Class basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(SystemMetamodel.Class newTarget) {
		SystemMetamodel.Class oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.ASSOCIATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemMetamodel.Class getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (SystemMetamodel.Class)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemMetamodelPackage.ASSOCIATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMetamodel.Class basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(SystemMetamodel.Class newSource) {
		SystemMetamodel.Class oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.ASSOCIATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsComposition() {
		return isComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsComposition(boolean newIsComposition) {
		boolean oldIsComposition = isComposition;
		isComposition = newIsComposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.ASSOCIATION__IS_COMPOSITION, oldIsComposition, isComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAggregation() {
		return isAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAggregation(boolean newIsAggregation) {
		boolean oldIsAggregation = isAggregation;
		isAggregation = newIsAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.ASSOCIATION__IS_AGGREGATION, oldIsAggregation, isAggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemMetamodelPackage.ASSOCIATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SystemMetamodelPackage.ASSOCIATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SystemMetamodelPackage.ASSOCIATION__IS_COMPOSITION:
				return isIsComposition();
			case SystemMetamodelPackage.ASSOCIATION__IS_AGGREGATION:
				return isIsAggregation();
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
			case SystemMetamodelPackage.ASSOCIATION__TARGET:
				setTarget((SystemMetamodel.Class)newValue);
				return;
			case SystemMetamodelPackage.ASSOCIATION__SOURCE:
				setSource((SystemMetamodel.Class)newValue);
				return;
			case SystemMetamodelPackage.ASSOCIATION__IS_COMPOSITION:
				setIsComposition((Boolean)newValue);
				return;
			case SystemMetamodelPackage.ASSOCIATION__IS_AGGREGATION:
				setIsAggregation((Boolean)newValue);
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
			case SystemMetamodelPackage.ASSOCIATION__TARGET:
				setTarget((SystemMetamodel.Class)null);
				return;
			case SystemMetamodelPackage.ASSOCIATION__SOURCE:
				setSource((SystemMetamodel.Class)null);
				return;
			case SystemMetamodelPackage.ASSOCIATION__IS_COMPOSITION:
				setIsComposition(IS_COMPOSITION_EDEFAULT);
				return;
			case SystemMetamodelPackage.ASSOCIATION__IS_AGGREGATION:
				setIsAggregation(IS_AGGREGATION_EDEFAULT);
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
			case SystemMetamodelPackage.ASSOCIATION__TARGET:
				return target != null;
			case SystemMetamodelPackage.ASSOCIATION__SOURCE:
				return source != null;
			case SystemMetamodelPackage.ASSOCIATION__IS_COMPOSITION:
				return isComposition != IS_COMPOSITION_EDEFAULT;
			case SystemMetamodelPackage.ASSOCIATION__IS_AGGREGATION:
				return isAggregation != IS_AGGREGATION_EDEFAULT;
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
		result.append(" (isComposition: ");
		result.append(isComposition);
		result.append(", isAggregation: ");
		result.append(isAggregation);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
