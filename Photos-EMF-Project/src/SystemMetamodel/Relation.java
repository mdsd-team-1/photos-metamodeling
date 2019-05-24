/**
 */
package SystemMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Relation#getSourceLayer <em>Source Layer</em>}</li>
 *   <li>{@link SystemMetamodel.Relation#getTargetLayer <em>Target Layer</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Layer</em>' reference.
	 * @see #setSourceLayer(Layer)
	 * @see SystemMetamodel.SystemMetamodelPackage#getRelation_SourceLayer()
	 * @model
	 * @generated
	 */
	Layer getSourceLayer();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Relation#getSourceLayer <em>Source Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Layer</em>' reference.
	 * @see #getSourceLayer()
	 * @generated
	 */
	void setSourceLayer(Layer value);

	/**
	 * Returns the value of the '<em><b>Target Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Layer</em>' reference.
	 * @see #setTargetLayer(Layer)
	 * @see SystemMetamodel.SystemMetamodelPackage#getRelation_TargetLayer()
	 * @model
	 * @generated
	 */
	Layer getTargetLayer();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Relation#getTargetLayer <em>Target Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Layer</em>' reference.
	 * @see #getTargetLayer()
	 * @generated
	 */
	void setTargetLayer(Layer value);

} // Relation
