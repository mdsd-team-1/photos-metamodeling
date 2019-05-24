/**
 */
package SystemMetamodel.tests;

import SystemMetamodel.AllowedToUse;
import SystemMetamodel.SystemMetamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Allowed To Use</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllowedToUseTest extends RelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllowedToUseTest.class);
	}

	/**
	 * Constructs a new Allowed To Use test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedToUseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Allowed To Use test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AllowedToUse getFixture() {
		return (AllowedToUse)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemMetamodelFactory.eINSTANCE.createAllowedToUse());
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

} //AllowedToUseTest
