package intern.demo;

//import org.junit.AfterClass;
import org.junit.Assert;
//import org.junit.BeforeClass;
import org.junit.Test;

import intern.demo.Address;
import intern.demo.ApplicationBook;

class AddressJunitTest {

	Address ad = new Address("Pune", "mundhwa", 24);
	ApplicationBook abook = new ApplicationBook();
	ApplicationBook book = null;

//	@BeforeClass
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	static void tearDownAfterClass() throws Exception {
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}

	@Test
	public void test() {
		Assert.assertTrue(ad.getStreet() == "Pune");
		Assert.assertTrue(ad.getCity() == "mundhwa");
		Assert.assertTrue(ad.getPinCode() == 24);
	}

	@Test
	public void testIsMatch() {
		Assert.assertTrue(ad.isMatchCity("mundhwa"));
		Assert.assertTrue(ad.isMatchStreet("Pune"));
		Assert.assertTrue(ad.isMatchPincode(24));
	}

	@Test
	public void isObjectNotNull() {
		Assert.assertNotNull(ad);
	}

	@Test
	public void isObjectNull() {
		Assert.assertNull(book);
	}

	@Test
	public void isObjectSame() {
		Assert.assertSame(ad, ad);
	
	}

}
