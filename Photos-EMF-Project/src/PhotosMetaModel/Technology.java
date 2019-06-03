/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Technology#getSpring <em>Spring</em>}</li>
 *   <li>{@link PhotosMetaModel.Technology#getPostgresql <em>Postgresql</em>}</li>
 *   <li>{@link PhotosMetaModel.Technology#getReact <em>React</em>}</li>
 *   <li>{@link PhotosMetaModel.Technology#getAmazonwebservices <em>Amazonwebservices</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology()
 * @model
 * @generated
 */
public interface Technology extends EObject {
	/**
	 * Returns the value of the '<em><b>Spring</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Spring}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spring</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology_Spring()
	 * @model containment="true"
	 * @generated
	 */
	EList<Spring> getSpring();

	/**
	 * Returns the value of the '<em><b>Postgresql</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.PostgreSQL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postgresql</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology_Postgresql()
	 * @model containment="true"
	 * @generated
	 */
	EList<PostgreSQL> getPostgresql();

	/**
	 * Returns the value of the '<em><b>React</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.React}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>React</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology_React()
	 * @model containment="true"
	 * @generated
	 */
	EList<React> getReact();

	/**
	 * Returns the value of the '<em><b>Amazonwebservices</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.AmazonWebServices}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amazonwebservices</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology_Amazonwebservices()
	 * @model containment="true"
	 * @generated
	 */
	EList<AmazonWebServices> getAmazonwebservices();

} // Technology
