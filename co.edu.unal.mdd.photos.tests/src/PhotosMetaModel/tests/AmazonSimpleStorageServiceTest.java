/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.AmazonSimpleStorageService;
import PhotosMetaModel.PhotosMetaModelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Amazon Simple Storage Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmazonSimpleStorageServiceTest extends TestCase {

	/**
	 * The fixture for this Amazon Simple Storage Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmazonSimpleStorageService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AmazonSimpleStorageServiceTest.class);
	}

	/**
	 * Constructs a new Amazon Simple Storage Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonSimpleStorageServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Amazon Simple Storage Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AmazonSimpleStorageService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Amazon Simple Storage Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmazonSimpleStorageService getFixture() {
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
		setFixture(PhotosMetaModelFactory.eINSTANCE.createAmazonSimpleStorageService());
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

} //AmazonSimpleStorageServiceTest
