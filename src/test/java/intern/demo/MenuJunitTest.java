package intern.demo;
import org.junit.Assert;
import org.junit.Test;




import intern.demo.ApplicationBook;
import intern.demo.Menu;

class MenuJunitTest {

	Menu menu = new Menu("Address Book Application");
	ApplicationBook abook = new ApplicationBook();
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//		
//	}
//
//	@AfterAll
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
	public void testDisplayText() {
		Assert.assertTrue(menu.getDisplayText() ==  "Address Book Application");

	}
}
	
    








