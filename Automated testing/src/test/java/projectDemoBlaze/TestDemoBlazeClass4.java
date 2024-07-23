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

public class TestDemoBlazeClass4 extends BaseTestDemoBlazeClass {
	
	
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
		softAssert.assertNotEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertNotEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
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
		softAssert.assertNotEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertNotEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
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
		softAssert.assertNotEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertNotEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
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
		loginPage.acceptAlertIfPresent();
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
		softAssert.assertNotEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertNotEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
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
		softAssert.assertNotEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertNotEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
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
		softAssert.assertNotEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertNotEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
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
		softAssert.assertNotEquals(productPrice3, product360PurchaseForm, "The result of the automation tool is not compatible with the graphical user interface experience.");
		softAssert.assertNotEquals(productPrice3, productPrice4, "The result of the automation tool is not compatible with the graphical user interface experience");
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are the not same!");
		softAssert.assertEquals(actualUrlString, expectedUrlString);
	    softAssert.assertAll();
	}
	
}