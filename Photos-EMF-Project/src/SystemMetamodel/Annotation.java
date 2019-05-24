/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Annotation#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getAnnotation_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

} // Annotation
