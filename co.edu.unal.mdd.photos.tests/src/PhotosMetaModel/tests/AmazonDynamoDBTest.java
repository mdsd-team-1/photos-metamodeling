/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.AmazonDynamoDB;
import PhotosMetaModel.PhotosMetaModelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Amazon Dynamo DB</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmazonDynamoDBTest extends TestCase {

	/**
	 * The fixture for this Amazon Dynamo DB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmazonDynamoDB fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AmazonDynamoDBTest.class);
	}

	/**
	 * Constructs a new Amazon Dynamo DB test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonDynamoDBTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Amazon Dynamo DB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AmazonDynamoDB fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Amazon Dynamo DB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmazonDynamoDB getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createAmazonDynamoDB());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AmazonDynamoDBTest
