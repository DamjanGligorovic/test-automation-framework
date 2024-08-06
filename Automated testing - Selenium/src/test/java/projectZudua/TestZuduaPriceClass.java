package projectZudua;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestZuduaPriceClass extends BaseZuduaClass {
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://zudua.co.tz/");
	}
	
	@Test
	public void testCase1() {
		bookPage.verifyFirstItemPrice();
	}
	@Test
	public void testCase2() {
		bookPage.verifyFirstItemPrice1();
	}
	@Test
	public void testCase3() {
		bookPage.verifyFirstItemPrice2();
	}
	@Test
	public void testCase4() {
		bookPage.verifyFirstItemPrice3();
	}
	@Test
	public void testCase5() {
		bookPage.verifyFirstItemPrice4();
	}
	@Test
	public void testCase6() {
		bookPage.verifyFirstItemPrice5();
	}
	@Test
	public void testCase7() {
		bookPage.verifyFirstItemPrice6();
	}
	@Test
	public void testCase8() {
		bookPage.verifyFirstItemPrice7();
	}
	@Test
	public void testCase9() {
		bookPage.verifyFirstItemPrice8();
	}
	@Test
	public void testCase10() {
		bookPage.verifyFirstItemPrice9();
	}
	@Test
	public void testCase11() {
		bookPage.verifyFirstItemPrice10();
	}
	@Test
	public void testCase12() {
		bookPage.verifyFirstItemPrice11();
	}
	@Test
	public void testCase13() {
		bookPage.verifyFirstItemPrice12();
	}
	@Test
	public void testCase14() {
		bookPage.verifyFirstItemPrice13();
	}
	@Test
	public void testCase15() {
		bookPage.verifyFirstItemPrice14();
	}
}