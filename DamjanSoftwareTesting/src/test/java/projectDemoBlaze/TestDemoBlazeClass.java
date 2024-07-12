package projectDemoBlaze;


import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import javax.annotation.processing.Generated;

import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;

import io.opentelemetry.sdk.trace.samplers.ParentBasedSamplerBuilder;
import projectPCPress.TestPCPressData;

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
	//-----------------------------------------P O S I T I V E   T E S T S-----------------------------------------------------------------------

	@Test(priority = 41)
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
	@Test(priority = 34)
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
	@Test(priority = 23)
	public void testCase3() throws IOException {
		loginPage.fillLogInForm("htrh", "rerg3t54544g");
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\Damja\\OneDrive\\Desktop\\Sample\\demoBlaze.jpg"));
		String actualUrlString = driver.getCurrentUrl();
		String expectedUrlString = "https://www.demoblaze.com/index.html#";
		assertEquals(actualUrlString, expectedUrlString);
	}
	@Test(priority = 12)
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
	@Test
	public void testCase6() {
		loginPage.clickLinkByIndex(2);
		loginPage.clickOnTheButtonPlayVideo();
		loginPage.clickOnTheButtonFullScreen();
		loginPage.clickOnTheMediumScreen();
		loginPage.clickOnTheButtonVolume();
		loginPage.clickOnTheButtonLinearVideo();
		loginPage.clickCloseAboutUs();
	}
	@Test(priority = 1)
	public void testCase7() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.verifyImagesPricesAndTitlesUrls();
		String actualUrlString = driver.getCurrentUrl();
		String productDescription = driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(3)")).getText();
	    String firstPageImageSrc = loginPage.getImageSrc1(); 
	    loginPage.clickTheFirstItem();
	    String secondPageImageSrc = loginPage.getImageSrc2();
		String expectedUrlString = "https://www.demoblaze.com/index.html#";
		String productDescription1 = driver.findElement(By.xpath("//*[@id=\"more-information\"]/p")).getText();
		loginPage.clickButtonAddToCart();
		String productPrice3 = driver.findElement(By.cssSelector("#tbodyid > h3")).getText();
		loginPage.clickLinkByIndex(3);
		loginPage.clickTheButtonPlaceOrder();
		loginPage.clickTheButtonPurchase();
		loginPage.acceptAlertIfPresent();
		loginPage.typeName("Katarina Krunovic");
		loginPage.typeCreditCard("4930943050239203");
		loginPage.clickTheButtonPurchase();
		softAssert.assertTrue(loginPage.verifyConfirmation());
		softAssert.assertTrue(loginPage.verifyConfirmationDescription());
		String product360PurchaseForm = driver.findElement(By.id("totalm")).getText();
		String productPrice4 = "360";
		softAssert.assertEquals(productDescription, productDescription1);
		softAssert.assertEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are the not same!");
		softAssert.assertEquals(actualUrlString, expectedUrlString);
	    softAssert.assertAll();
	}
	@Test(priority = 2)
	public void testCase8() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.verifyImagesPricesAndTitlesUrls1();
		String actualUrlString = driver.getCurrentUrl();
		String productDescription = driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > p:nth-child(3)")).getText();
	    String firstPageImageSrc = loginPage.getImageSrc3(); 
	    loginPage.clickTheSecondItem();
	    String secondPageImageSrc = loginPage.getImageSrc4();
		String expectedUrlString = "https://www.demoblaze.com/index.html#";
		String productDescription1 = driver.findElement(By.cssSelector("#more-information > p")).getText();
		loginPage.clickTheButtonAddToCartNokia();
		String productPrice3 = driver.findElement(By.cssSelector("#tbodyid > h3")).getText(); 
		loginPage.clickLinkByIndex(3);
		loginPage.clickTheButtonPlaceOrder();
		loginPage.clickTheButtonPurchase();
		loginPage.acceptAlertIfPresent();
		loginPage.typeName("Ana Milanovic");
		loginPage.typeCreditCard("4930943050239203");
		loginPage.clickTheButtonPurchase();
		softAssert.assertTrue(loginPage.verifyConfirmation());
		softAssert.assertTrue(loginPage.verifyConfirmationDescription());
		String product360PurchaseForm = driver.findElement(By.id("totalm")).getText();
		String productPrice4 = "820";
		softAssert.assertEquals(productDescription, productDescription1);
		softAssert.assertEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are the not same!");
		softAssert.assertEquals(actualUrlString, expectedUrlString);
	    softAssert.assertAll();
	}
	@Test(priority = 3)
	public void testCase9() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.verifyImagesPricesAndTitlesUrls2();
		String actualUrlString = driver.getCurrentUrl();
		String productDescription = driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > p:nth-child(3)")).getText();
	    String firstPageImageSrc = loginPage.getImageSrc5(); 
	    loginPage.clickTheThirdItem();
	    String secondPageImageSrc = loginPage.getImageSrc6();
		String expectedUrlString = "https://www.demoblaze.com/index.html#";
		String productDescription1 = driver.findElement(By.cssSelector("#more-information > p")).getText();
		loginPage.clickTheButtonAddToCartNokia();
		String productPrice3 = driver.findElement(By.cssSelector("#tbodyid > h3")).getText(); 
		loginPage.clickLinkByIndex(3);
		loginPage.clickTheButtonPlaceOrder();
		loginPage.clickTheButtonPurchase();
		loginPage.acceptAlertIfPresent();
		loginPage.typeName("Lona Petrovic");
		loginPage.typeCreditCard("4930943050239203");
		loginPage.clickTheButtonPurchase();
		softAssert.assertTrue(loginPage.verifyConfirmation());
		softAssert.assertTrue(loginPage.verifyConfirmationDescription());
		String product360PurchaseForm = driver.findElement(By.id("totalm")).getText();
		String productPrice4 = "650";
		softAssert.assertEquals(productDescription, productDescription1);
		softAssert.assertEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are the not same!");
		softAssert.assertEquals(actualUrlString, expectedUrlString);
	    softAssert.assertAll();
	}
	@Test(priority = 4)
	public void testCase10() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.verifyImagesPricesAndTitlesUrls3();
		String actualUrlString = driver.getCurrentUrl();
		String productDescription = driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > p:nth-child(3)")).getText();
	    String firstPageImageSrc = loginPage.getImageSrc7(); 
	    loginPage.clickTheFourthItem();
	    String secondPageImageSrc = loginPage.getImageSrc8();
		String expectedUrlString = "https://www.demoblaze.com/index.html#";
		String productDescription1 = driver.findElement(By.cssSelector("#more-information > p")).getText();
		loginPage.clickTheButtonAddToCart4();
		String productPrice3 = driver.findElement(By.cssSelector("#tbodyid > h3")).getText(); 
		loginPage.clickLinkByIndex(3);
		loginPage.clickTheButtonPlaceOrder();
		loginPage.clickTheButtonPurchase();
		loginPage.acceptAlertIfPresent();
		loginPage.typeName("Mia Dimitrijevic");
		loginPage.typeCreditCard("4930943050239203");
		loginPage.clickTheButtonPurchase();
		softAssert.assertTrue(loginPage.verifyConfirmation());
		softAssert.assertTrue(loginPage.verifyConfirmationDescription());
		String product360PurchaseForm = driver.findElement(By.id("totalm")).getText();
		String productPrice4 = "800";
		softAssert.assertEquals(productDescription, productDescription1);
		softAssert.assertEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are the not same!");
		softAssert.assertEquals(actualUrlString, expectedUrlString);
	    softAssert.assertAll();
	}
	@Test(priority = 5)
	public void testCase11() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.verifyImagesPricesAndTitlesUrls4();
		String actualUrlString = driver.getCurrentUrl();
		String productDescription = driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > p:nth-child(3)")).getText();
	    String firstPageImageSrc = loginPage.getImageSrc9(); 
	    loginPage.clickTheFifthItem();
	    String secondPageImageSrc = loginPage.getImageSrc10();
		String expectedUrlString = "https://www.demoblaze.com/index.html#";
		String productDescription1 = driver.findElement(By.cssSelector("#more-information > p")).getText();
		loginPage.clickTheButtonAddToCart5();
		String productPrice3 = driver.findElement(By.cssSelector("#tbodyid > h3")).getText(); 
		loginPage.clickLinkByIndex(3);
		loginPage.clickTheButtonPlaceOrder();
		loginPage.clickTheButtonPurchase();
		loginPage.acceptAlertIfPresent();
		loginPage.typeName("Milica Stepanovic");
		loginPage.typeCreditCard("4930943050239203");
		loginPage.clickTheButtonPurchase();
		softAssert.assertTrue(loginPage.verifyConfirmation());
		softAssert.assertTrue(loginPage.verifyConfirmationDescription());
		String product360PurchaseForm = driver.findElement(By.id("totalm")).getText();
		String productPrice4 = "790";
		softAssert.assertEquals(productDescription, productDescription1);
		softAssert.assertEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are the not same!");
		softAssert.assertEquals(actualUrlString, expectedUrlString);
	    softAssert.assertAll();
	}
	@Test(priority = 232)
	public void testCase12() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.verifyImagesPricesAndTitlesUrls5();
		String actualUrlString = driver.getCurrentUrl();
		String productDescription = driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > p:nth-child(3)")).getText();
	    String firstPageImageSrc = loginPage.getImageSrc11(); 
	    loginPage.clickTheSixthItem();
	    String secondPageImageSrc = loginPage.getImageSrc12();
		String expectedUrlString = "https://www.demoblaze.com/index.html#";
		String productDescription1 = driver.findElement(By.cssSelector("#more-information > p")).getText();
		loginPage.clickTheButtonAddToCart6();
		String productPrice3 = driver.findElement(By.cssSelector("#tbodyid > h3")).getText(); 
		loginPage.clickLinkByIndex(3);
		loginPage.clickTheButtonPlaceOrder();
		loginPage.clickTheButtonPurchase();
		loginPage.acceptAlertIfPresent();
		loginPage.typeName("Lana Mitrovic Aleksadrovic");
		loginPage.typeCreditCard("4930943050239203");
		loginPage.clickTheButtonPurchase();
		softAssert.assertTrue(loginPage.verifyConfirmation());
		softAssert.assertTrue(loginPage.verifyConfirmationDescription());
		String product360PurchaseForm = driver.findElement(By.id("totalm")).getText();
		String productPrice4 = "320";
		softAssert.assertEquals(productDescription, productDescription1);
		softAssert.assertEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are the not same!");
		softAssert.assertEquals(actualUrlString, expectedUrlString);
	    softAssert.assertAll();
	}
	@Test(priority = 347)
	public void testCase13() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.verifyImagesPricesAndTitlesUrls6();
		String actualUrlString = driver.getCurrentUrl();
		String productDescription = driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(2) > p:nth-child(3)")).getText();
	    String firstPageImageSrc = loginPage.getImageSrc13(); 
	    loginPage.clickTheSeventhItem();
	    String secondPageImageSrc = loginPage.getImageSrc14();
		String expectedUrlString = "https://www.demoblaze.com/index.html#";
		String productDescription1 = driver.findElement(By.cssSelector("#more-information > p")).getText();
		loginPage.clickTheButtonAddToCart7();
		String productPrice3 = driver.findElement(By.cssSelector("#tbodyid > h3")).getText(); 
		loginPage.clickLinkByIndex(3);
		loginPage.clickTheButtonPlaceOrder();
		loginPage.clickTheButtonPurchase();
		loginPage.acceptAlertIfPresent();
		loginPage.typeName("Petar Markovic Roksandic");
		loginPage.typeCreditCard("4930943050239203");
		loginPage.clickTheButtonPurchase();
		softAssert.assertTrue(loginPage.verifyConfirmation());
		softAssert.assertTrue(loginPage.verifyConfirmationDescription());
		String product360PurchaseForm = driver.findElement(By.id("totalm")).getText();
		String productPrice4 = "700";
		softAssert.assertEquals(productDescription, productDescription1);
		softAssert.assertEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are the not same!");
		softAssert.assertEquals(actualUrlString, expectedUrlString);
	    softAssert.assertAll();
	}
	
	@Test
	public void testCase16() {
		loginPage.verifyCategoriesAndNextAndPreviousButtons();
	}
	@Test(priority = 102)
	public void testCase17() {
		SoftAssert softAssert = new SoftAssert();
		
		loginPage.clickOnTheFirstItem();
		loginPage.clickButtonAddToCart();
		loginPage.clickLinkByIndex(3);
		loginPage.clickTheButtonDelete();
		loginPage.clickOnTheLogo();
		String actualUrlString= driver.getCurrentUrl();
		String expectedUrlString = "https://www.demoblaze.com/index.html";
		softAssert.assertEquals(actualUrlString, expectedUrlString);
	    softAssert.assertAll();	
	}
	//-----------------------------------------N E G A T I V E    T E S T S-----------------------------------------------------------------------
	@Test(dataProvider  = "incorrectName", dataProviderClass = TestDataNameField.class) 
	public void negativeTestCase1(String input) {
		SoftAssert softAssert = new SoftAssert();

		loginPage.clickOnTheFirstItem();
		loginPage.clickButtonAddToCart();
		loginPage.clickLinkByIndex(3);
		loginPage.clickTheButtonPlaceOrder();
		loginPage.typeName(input);
		loginPage.typeCreditCard("43849358989434");
		loginPage.clickTheButtonPurchase();
		String actualUrlString= driver.getCurrentUrl();
		String expectedUrlString = "https://www.demoblaze.com/cart.html";
		softAssert.assertEquals(actualUrlString, expectedUrlString);
	    softAssert.assertAll();	
	}
	
	@Test(dataProvider  = "incorrectCreditCard", dataProviderClass = TestDataCreditCardField.class) 
	public void negativeTestCase2(String input) {
		SoftAssert softAssert = new SoftAssert();

		loginPage.clickOnTheFirstItem();
		loginPage.clickButtonAddToCart();
		loginPage.clickLinkByIndex(3);
		loginPage.clickTheButtonPlaceOrder();
		loginPage.typeName("Damjan");
		loginPage.typeCreditCard(input);
		loginPage.clickTheButtonPurchase();
		String actualUrlString= driver.getCurrentUrl();
		String expectedUrlString = "https://www.demoblaze.com/cart.html";
		softAssert.assertEquals(actualUrlString, expectedUrlString);
	    softAssert.assertAll();	
	}
	
}