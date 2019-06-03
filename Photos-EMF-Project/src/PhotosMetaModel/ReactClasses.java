/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.ReactClasses#getReactfunctions <em>Reactfunctions</em>}</li>
 *   <li>{@link PhotosMetaModel.ReactClasses#getProps <em>Props</em>}</li>
 *   <li>{@link PhotosMetaModel.ReactClasses#getState <em>State</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getReactClasses()
 * @model
 * @generated
 */
public interface ReactClasses extends EObject {
	/**
	 * Returns the value of the '<em><b>Reactfunctions</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.ReactFunctions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactfunctions</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getReactClasses_Reactfunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReactFunctions> getReactfunctions();

	/**
	 * Returns the value of the '<em><b>Props</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Props}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getReactClasses_Props()
	 * @model containment="true"
	 * @generated
	 */
	EList<Props> getProps();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getReactClasses_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getState();

} // ReactClasses
