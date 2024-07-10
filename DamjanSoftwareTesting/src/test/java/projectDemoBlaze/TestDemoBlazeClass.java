package projectDemoBlaze;


import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import javax.annotation.processing.Generated;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

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
	public void testCase1() throws IOException {
	//Fill the Sign up form
	loginPage.signUpClickLink();
	loginPage.fillSignUpForm("htrh", "rerg3t54544g");
	loginPage.clickTheButtonSubmit();
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f, new File("C:\\Users\\Damja\\OneDrive\\Desktop\\Sample\\demoBlaze.jpg"));
	String actualUrlString = driver.getCurrentUrl();
	String expectedUrlString = "https://www.demoblaze.com/index.html#";
	assertEquals(actualUrlString, expectedUrlString);
	

	}
	@Test(priority = 4)
	public void testCase2() throws IOException {
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
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\Damja\\OneDrive\\Desktop\\Sample\\demoBlaze.jpg"));
		String actualUrlString = driver.getCurrentUrl();
		String expectedUrlString = "https://www.demoblaze.com/cart.html";
		assertEquals(actualUrlString, expectedUrlString);
		
	}
	@Test(priority = 3)
	public void testCase3() throws IOException {
		loginPage.fillLogInForm("htrh", "rerg3t54544g");
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\Damja\\OneDrive\\Desktop\\Sample\\demoBlaze.jpg"));
		String actualUrlString = driver.getCurrentUrl();
		String expectedUrlString = "https://www.demoblaze.com/index.html#";
		assertEquals(actualUrlString, expectedUrlString);
	}
	@Test(priority = 2)
	public void testCase4() throws IOException {
		loginPage.fillTheContactForm("damjangligorovic@hotmail.com", "Damjan Gligorovic", "Hello, I am writing to you to get details about new product. Can you tell more about XHVKRI Samsung phone?");
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\Damja\\OneDrive\\Desktop\\Sample\\demoBlaze.jpg"));
		String actualUrlString = driver.getCurrentUrl();
		String expectedUrlString = "https://www.demoblaze.com/index.html#";
		assertEquals(actualUrlString, expectedUrlString);
	}
	@Test
	public void testCase5() throws IOException {
		loginPage.clickOnTheFirstItem();
		loginPage.verifyThePriceAndButtonBin();
		loginPage.clickOnTheButtonBin();
		loginPage.clickOnTheLogo();
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\Damja\\OneDrive\\Desktop\\Sample\\demoBlaze.jpg"));
		String actualUrlString = driver.getCurrentUrl();
		String expectedUrlString = "https://www.demoblaze.com/index.html";
		assertEquals(actualUrlString, expectedUrlString);
	}
	
	
}