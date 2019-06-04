/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Components#getReactclasses <em>Reactclasses</em>}</li>
 *   <li>{@link PhotosMetaModel.Components#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getComponents()
 * @model
 * @generated
 */
public interface Components extends EObject {
	/**
	 * Returns the value of the '<em><b>Reactclasses</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.ReactClasses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactclasses</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getComponents_Reactclasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReactClasses> getReactclasses();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference.
	 * @see #setModules(Modules)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getComponents_Modules()
	 * @model
	 * @generated
	 */
	Modules getModules();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Components#getModules <em>Modules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modules</em>' reference.
	 * @see #getModules()
	 * @generated
	 */
	void setModules(Modules value);

} // Components
