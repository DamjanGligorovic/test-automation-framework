package projectDemoBlaze;


import javax.annotation.processing.Generated;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemoBlazeClass extends BaseTestDemoBlazeClass {
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://www.demoblaze.com/index.html#");
	}
	@AfterMethod
	public void deleteCookie() {
		driver.manage().deleteAllCookies();
	}
	@BeforeClass
    public void setUp() {
        System.setProperty("path/to/chromedriver", "webdriver.chrome.driver");
	}
	@Test(priority = 1)
	public void testCase1() {
	//Fill the Sign up form
	loginPage.signUpClickLink();
	loginPage.fillSignUpForm("htrh", "rerg3t54544g");
	//loginPage.typePassword("rerg3t54544g");
	loginPage.clickTheButtonSubmit();

	}
	@Test(priority = 4)
	public void testCase2() {
		//Click on all links on the top of the page except the link Sign up
		driver.navigate().refresh();
		loginPage.clickLinkByIndex(0);
		loginPage.clickLinkByIndex(1);
		loginPage.clickClose();
		loginPage.clickLinkByIndex(2);
		loginPage.clickCloseAboutUs();
		loginPage.clickLinkByIndex(3);
		loginPage.clickLinkByIndex(4);
		loginPage.clickCloseLoginIn();
		
	}
	@Test(priority = 3)
	public void testCase3() {
		loginPage.fillLogInForm("htrh", "rerg3t54544g");
	}
	@Test(priority = 2)
	public void testCase4() {
		loginPage.fillTheContactForm("damjangligorovic@hotmail.com", "Damjan Gligorovic", "Hello, I am writing to you to get details about new product. Can you tell more about XHVKRI Samsung phone?");
	}
	
	
}