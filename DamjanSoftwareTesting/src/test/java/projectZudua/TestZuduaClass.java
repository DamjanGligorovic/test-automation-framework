package projectZudua;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestZuduaClass extends BaseZuduaClass {
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://zudua.co.tz/");
	}
	@AfterMethod
	public void deleteCookie() {
		driver.manage().deleteAllCookies();
	}
	//1. Element
	@Test
	public void testCase1() throws InterruptedException {
		Thread.sleep(500);
		bookPage.verifyFirstItemName();
		
	}
	//2.Element
	@Test
	public void testCase2() throws InterruptedException {
		Thread.sleep(500);

		bookPage.verifyFirstItemName1();
	}	
	//3. Element
	@Test
	public void testCase3() throws InterruptedException {
		Thread.sleep(500);

		bookPage.verifyFirstItemName2();
	}
	//4. Element
	@Test
	public void testCase4() throws InterruptedException {
		Thread.sleep(1000);

		bookPage.verifyFirstItemName3();
	}
	//5. Element
		@Test
		public void testCase5() throws InterruptedException {
			Thread.sleep(500);

			bookPage.verifyFirstItemName4();
		}
		//6. Element
		@Test
		public void testCase6() throws InterruptedException {
		Thread.sleep(500);

		bookPage.verifyFirstItemName5();
				}
		//7. Element
		@Test
		public void testCase7() throws InterruptedException {
		Thread.sleep(500);

		bookPage.verifyFirstItemName6();
						}
		//8. Element
		@Test
		public void testCase8() throws InterruptedException {
		Thread.sleep(500);

		bookPage.verifyFirstItemName7();
						}
		//9. Element
		@Test
		public void testCase9() throws InterruptedException {
		Thread.sleep(500);

		bookPage.verifyFirstItemName8();
								}
		//10. Element
		@Test
		public void testCase10() throws InterruptedException {
			Thread.sleep(500);

		bookPage.verifyFirstItemName9();
										}
		//11. Element
				@Test
				public void testCase11() throws InterruptedException {
					Thread.sleep(500);

				bookPage.verifyFirstItemName10();
												}
				//12. Element
				@Test
				public void testCase12() throws InterruptedException {
					Thread.sleep(500);

				bookPage.verifyFirstItemName11();
												}
				//13. Element
				@Test
				public void testCase13() throws InterruptedException {
				Thread.sleep(500);

				bookPage.verifyFirstItemName12();
				}
				//14. Element
				@Test
				public void testCase14() throws InterruptedException {
					Thread.sleep(500);

				bookPage.verifyFirstItemName13();
												}
				//15. Element
				@Test
				public void testCase15() throws InterruptedException {
					Thread.sleep(500);

				bookPage.verifyFirstItemName14();
												}
}