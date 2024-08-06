package projectMyStore;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScript extends CartPage {
	
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://www.mystoredemo.io/#/"); 
		driver.navigate().refresh();
	}
	
	@Test(priority = 2)
	public void verifyTitleOnTheSecondPageOfItem() {
		loginPage.switchToChildWindow(2);
		driver.close();
		loginPage.switchToParentWindow();
		loginPage.waitExpectedNumberWindows(1);
		String actualString = driver.getCurrentUrl();
		String urlExpectedString = "https://www.mystoredemo.io/#/product/01";
		assertEquals(actualString, urlExpectedString);

	}
	
	@Test(priority = 1)
	public void verifyPriceOnTheSecondPageOfItem() {
		loginPage.switchToChildWindowPrice(2);
		driver.close();
		loginPage.switchToParentWindow();
		loginPage.waitExpectedNumberWindows(1);
		String actualString = driver.getCurrentUrl();
		String urlExpectedString = "https://www.mystoredemo.io/#/product/01";
		assertEquals(actualString, urlExpectedString);
	}




	
	
}