/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.LifeCycle;
import PhotosMetaModel.PhotosMetaModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Life Cycle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LifeCycleTest extends ReactFunctionsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LifeCycleTest.class);
	}

	/**
	 * Constructs a new Life Cycle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Life Cycle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LifeCycle getFixture() {
		return (LifeCycle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createLifeCycle());
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

} //LifeCycleTest
