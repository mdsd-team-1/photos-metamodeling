/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layered Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.LayeredStyle#getRelations <em>Relations</em>}</li>
 *   <li>{@link SystemMetamodel.LayeredStyle#getLayer <em>Layer</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getLayeredStyle()
 * @model
 * @generated
 */
public interface LayeredStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getLayeredStyle_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getLayeredStyle_Layer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayer();

} // LayeredStyle
