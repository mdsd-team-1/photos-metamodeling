/**
 */
package PhotosMetaModel;

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
 *   <li>{@link PhotosMetaModel.Technology#getReact <em>React</em>}</li>
 *   <li>{@link PhotosMetaModel.Technology#getPostgresql <em>Postgresql</em>}</li>
 *   <li>{@link PhotosMetaModel.Technology#getAmazons3 <em>Amazons3</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology()
 * @model
 * @generated
 */
public interface Technology extends EObject {
	/**
	 * Returns the value of the '<em><b>Spring</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spring</em>' reference.
	 * @see #setSpring(Spring)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology_Spring()
	 * @model
	 * @generated
	 */
	Spring getSpring();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Technology#getSpring <em>Spring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spring</em>' reference.
	 * @see #getSpring()
	 * @generated
	 */
	void setSpring(Spring value);

	/**
	 * Returns the value of the '<em><b>React</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>React</em>' reference.
	 * @see #setReact(React)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology_React()
	 * @model
	 * @generated
	 */
	React getReact();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Technology#getReact <em>React</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>React</em>' reference.
	 * @see #getReact()
	 * @generated
	 */
	void setReact(React value);

	/**
	 * Returns the value of the '<em><b>Postgresql</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postgresql</em>' reference.
	 * @see #setPostgresql(PostgreSQL)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology_Postgresql()
	 * @model
	 * @generated
	 */
	PostgreSQL getPostgresql();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Technology#getPostgresql <em>Postgresql</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postgresql</em>' reference.
	 * @see #getPostgresql()
	 * @generated
	 */
	void setPostgresql(PostgreSQL value);

	/**
	 * Returns the value of the '<em><b>Amazons3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amazons3</em>' reference.
	 * @see #setAmazons3(AmazonWebServices)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getTechnology_Amazons3()
	 * @model
	 * @generated
	 */
	AmazonWebServices getAmazons3();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Technology#getAmazons3 <em>Amazons3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amazons3</em>' reference.
	 * @see #getAmazons3()
	 * @generated
	 */
	void setAmazons3(AmazonWebServices value);

} // Technology
