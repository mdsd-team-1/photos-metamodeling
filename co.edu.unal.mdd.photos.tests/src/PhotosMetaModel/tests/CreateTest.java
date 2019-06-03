/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.Create;
import PhotosMetaModel.PhotosMetaModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateTest extends ClauseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreateTest.class);
	}

	/**
	 * Constructs a new Create test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Create test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Create getFixture() {
		return (Create)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createCreate());
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

} //CreateTest
