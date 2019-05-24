/**
 */
package SystemMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Association#getTarget <em>Target</em>}</li>
 *   <li>{@link SystemMetamodel.Association#getSource <em>Source</em>}</li>
 *   <li>{@link SystemMetamodel.Association#isIsComposition <em>Is Composition</em>}</li>
 *   <li>{@link SystemMetamodel.Association#isIsAggregation <em>Is Aggregation</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SystemMetamodel.Class)
	 * @see SystemMetamodel.SystemMetamodelPackage#getAssociation_Target()
	 * @model
	 * @generated
	 */
	SystemMetamodel.Class getTarget();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Association#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SystemMetamodel.Class value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SystemMetamodel.Class)
	 * @see SystemMetamodel.SystemMetamodelPackage#getAssociation_Source()
	 * @model
	 * @generated
	 */
	SystemMetamodel.Class getSource();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Association#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SystemMetamodel.Class value);

	/**
	 * Returns the value of the '<em><b>Is Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composition</em>' attribute.
	 * @see #setIsComposition(boolean)
	 * @see SystemMetamodel.SystemMetamodelPackage#getAssociation_IsComposition()
	 * @model
	 * @generated
	 */
	boolean isIsComposition();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Association#isIsComposition <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composition</em>' attribute.
	 * @see #isIsComposition()
	 * @generated
	 */
	void setIsComposition(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Aggregation</em>' attribute.
	 * @see #setIsAggregation(boolean)
	 * @see SystemMetamodel.SystemMetamodelPackage#getAssociation_IsAggregation()
	 * @model
	 * @generated
	 */
	boolean isIsAggregation();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Association#isIsAggregation <em>Is Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Aggregation</em>' attribute.
	 * @see #isIsAggregation()
	 * @generated
	 */
	void setIsAggregation(boolean value);

} // Association
