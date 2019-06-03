/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Logic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.BusinessLogic#getBusinessLogicSegment <em>Business Logic Segment</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getBusinessLogic()
 * @model
 * @generated
 */
public interface BusinessLogic extends Layer {
	/**
	 * Returns the value of the '<em><b>Business Logic Segment</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.BusinessLogicSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Logic Segment</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getBusinessLogic_BusinessLogicSegment()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessLogicSegment> getBusinessLogicSegment();

} // BusinessLogic
