/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Scheme#getTable_postgresql <em>Table postgresql</em>}</li>
 *   <li>{@link PhotosMetaModel.Scheme#getView_postgresql <em>View postgresql</em>}</li>
 *   <li>{@link PhotosMetaModel.Scheme#getIndex <em>Index</em>}</li>
 *   <li>{@link PhotosMetaModel.Scheme#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link PhotosMetaModel.Scheme#getStoredprocedure <em>Storedprocedure</em>}</li>
 *   <li>{@link PhotosMetaModel.Scheme#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getScheme()
 * @model
 * @generated
 */
public interface Scheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Table postgresql</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Table_p}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table postgresql</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getScheme_Table_postgresql()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table_p> getTable_postgresql();

	/**
	 * Returns the value of the '<em><b>View postgresql</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View postgresql</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getScheme_View_postgresql()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getView_postgresql();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Index_p}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getScheme_Index()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index_p> getIndex();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getScheme_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>Storedprocedure</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Function_p}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storedprocedure</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getScheme_Storedprocedure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function_p> getStoredprocedure();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getScheme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Scheme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Scheme
