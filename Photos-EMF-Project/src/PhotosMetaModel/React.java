/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.React#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getReact()
 * @model
 * @generated
 */
public interface React extends EObject {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference.
	 * @see #setModules(Modules)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getReact_Modules()
	 * @model
	 * @generated
	 */
	Modules getModules();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.React#getModules <em>Modules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modules</em>' reference.
	 * @see #getModules()
	 * @generated
	 */
	void setModules(Modules value);

} // React
