package projectMyStore;
import static org.testng.Assert.assertTrue;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScript extends CartPage {
	
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://www.mystoredemo.io/#/"); 
		driver.navigate().refresh();
	}
	
	@Test(priority = 3)
	public void verifyTitleOnTheSecondPageOfItem() {
		loginPage.switchToChildWindow(2);
		driver.close();
		loginPage.switchToParentWindow();
		loginPage.waitExpectedNumberWindows(1);
	}
	
	@Test(priority = 2)
	public void verifyPriceOnTheSecondPageOfItem() {
		loginPage.switchToChildWindowPrice(2);
		driver.close();
		loginPage.switchToParentWindow();
		loginPage.waitExpectedNumberWindows(1);
	}
	@Test(priority = 1)
	public void verifyIframeOnTheSecondPage() {
		loginPage.switchToChildWindow1(2);
		assertTrue(loginPage.verifyVisibilityofiframe());
		loginPage.switchToIframe();
		driver.close();
		loginPage.switchToParentWindow();
		loginPage.waitExpectedNumberWindows(1);
	}



	
	
}