/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Presentation#getPresentationLayer <em>Presentation Layer</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getPresentation()
 * @model
 * @generated
 */
public interface Presentation extends Layer {
	/**
	 * Returns the value of the '<em><b>Presentation Layer</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.PresentationSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Layer</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getPresentation_PresentationLayer()
	 * @model containment="true"
	 * @generated
	 */
	EList<PresentationSegment> getPresentationLayer();

} // Presentation
