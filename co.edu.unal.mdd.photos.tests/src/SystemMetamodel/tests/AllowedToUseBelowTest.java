/**
 */
package SystemMetamodel.tests;

import SystemMetamodel.AllowedToUseBelow;
import SystemMetamodel.SystemMetamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Allowed To Use Below</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllowedToUseBelowTest extends RelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllowedToUseBelowTest.class);
	}

	/**
	 * Constructs a new Allowed To Use Below test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedToUseBelowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Allowed To Use Below test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AllowedToUseBelow getFixture() {
		return (AllowedToUseBelow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemMetamodelFactory.eINSTANCE.createAllowedToUseBelow());
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

} //AllowedToUseBelowTest
