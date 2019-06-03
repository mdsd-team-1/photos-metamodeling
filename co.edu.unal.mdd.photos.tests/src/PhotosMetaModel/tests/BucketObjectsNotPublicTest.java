/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.BucketObjectsNotPublic;
import PhotosMetaModel.PhotosMetaModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bucket Objects Not Public</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BucketObjectsNotPublicTest extends AccessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BucketObjectsNotPublicTest.class);
	}

	/**
	 * Constructs a new Bucket Objects Not Public test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BucketObjectsNotPublicTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bucket Objects Not Public test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BucketObjectsNotPublic getFixture() {
		return (BucketObjectsNotPublic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createBucketObjectsNotPublic());
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

} //BucketObjectsNotPublicTest
