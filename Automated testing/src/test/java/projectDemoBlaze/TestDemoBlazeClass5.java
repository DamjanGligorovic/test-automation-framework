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

public class TestDemoBlazeClass5 extends BaseTestDemoBlazeClass {
	
	
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

	
	
	@Test
	public void testCase16() {
		loginPage.verifyCategoriesAndNextAndPreviousButtons();
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