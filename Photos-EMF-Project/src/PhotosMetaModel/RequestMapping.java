/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.RequestMapping#getRequestpart <em>Requestpart</em>}</li>
 *   <li>{@link PhotosMetaModel.RequestMapping#getValue <em>Value</em>}</li>
 *   <li>{@link PhotosMetaModel.RequestMapping#getMethod <em>Method</em>}</li>
 *   <li>{@link PhotosMetaModel.RequestMapping#getProduces <em>Produces</em>}</li>
 *   <li>{@link PhotosMetaModel.RequestMapping#getPathVariable <em>Path Variable</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getRequestMapping()
 * @model
 * @generated
 */
public interface RequestMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Requestpart</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.RequestPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requestpart</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRequestMapping_Requestpart()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestPart> getRequestpart();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRequestMapping_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.RequestMapping#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRequestMapping_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.RequestMapping#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' attribute.
	 * @see #setProduces(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRequestMapping_Produces()
	 * @model
	 * @generated
	 */
	String getProduces();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.RequestMapping#getProduces <em>Produces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produces</em>' attribute.
	 * @see #getProduces()
	 * @generated
	 */
	void setProduces(String value);

	/**
	 * Returns the value of the '<em><b>Path Variable</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.PathVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Variable</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRequestMapping_PathVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathVariable> getPathVariable();

} // RequestMapping
