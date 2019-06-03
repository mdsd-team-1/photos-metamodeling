/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React DOM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.ReactDOM#getElement_r <em>Element r</em>}</li>
 *   <li>{@link PhotosMetaModel.ReactDOM#getComponet_r <em>Componet r</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getReactDOM()
 * @model
 * @generated
 */
public interface ReactDOM extends EObject {
	/**
	 * Returns the value of the '<em><b>Element r</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Element_r}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element r</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getReactDOM_Element_r()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element_r> getElement_r();

	/**
	 * Returns the value of the '<em><b>Componet r</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Component_r}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componet r</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getReactDOM_Componet_r()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component_r> getComponet_r();

} // ReactDOM
