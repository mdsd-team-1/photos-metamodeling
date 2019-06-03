/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class r</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Class_r#getFunction_r <em>Function r</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getClass_r()
 * @model
 * @generated
 */
public interface Class_r extends Component_r {
	/**
	 * Returns the value of the '<em><b>Function r</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Function_r}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function r</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getClass_r_Function_r()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function_r> getFunction_r();

} // Class_r
