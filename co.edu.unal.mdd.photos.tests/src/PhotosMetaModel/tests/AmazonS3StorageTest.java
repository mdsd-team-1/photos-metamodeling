/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.AmazonS3Storage;
import PhotosMetaModel.PhotosMetaModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Amazon S3 Storage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmazonS3StorageTest extends SegmentoDatosTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AmazonS3StorageTest.class);
	}

	/**
	 * Constructs a new Amazon S3 Storage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonS3StorageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Amazon S3 Storage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AmazonS3Storage getFixture() {
		return (AmazonS3Storage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createAmazonS3Storage());
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

} //AmazonS3StorageTest
