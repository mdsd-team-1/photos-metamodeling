/**
 */
package PhotosMetaModel.tests;

import PhotosMetaModel.Album;
import PhotosMetaModel.PhotosMetaModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlbumTest extends EntitiesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlbumTest.class);
	}

	/**
	 * Constructs a new Album test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlbumTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Album test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Album getFixture() {
		return (Album)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhotosMetaModelFactory.eINSTANCE.createAlbum());
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

} //AlbumTest
