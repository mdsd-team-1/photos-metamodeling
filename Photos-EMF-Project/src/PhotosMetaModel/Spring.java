/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Spring#getSpringbootapplication <em>Springbootapplication</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getSpring()
 * @model
 * @generated
 */
public interface Spring extends EObject {
	/**
	 * Returns the value of the '<em><b>Springbootapplication</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.SpringBootApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Springbootapplication</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getSpring_Springbootapplication()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpringBootApplication> getSpringbootapplication();

} // Spring
