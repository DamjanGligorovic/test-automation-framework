package projectDemoBlaze;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

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

public class TestDemoBlazeClass8 extends BaseTestDemoBlazeClass {
	
	
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

	  @Test

	  public void verifyNames() {
	  loginPage.clickOnTheMonitors1();
	  loginPage.verifyMonitors();
	  }
	  @Test

	  public void verifyPrices1() {
	  loginPage.clickOnTheMonitors1();
	  loginPage.verifyMonitors1();
	  }
	  @Test

	  public void verifyDescriptions2() {
	  loginPage.clickOnTheMonitors1();
	  loginPage.verifyMonitors2();
	  }
	  @Test

	  public void verifyPricesOnTheThirdPage() {
	  loginPage.clickOnTheMonitors1();
	  loginPage.clickFirstMonitor();
	  String actualName = driver.findElement(By.cssSelector("#tbodyid > h3")).getText();
	  loginPage.verifyMonitors3();
	  String expectedName = "400";
	  loginPage.clickLinkByIndex(3);
	  loginPage.clickTheButtonPlaceOrder();
	  loginPage.clickTheButtonPurchase();
	  loginPage.acceptAlertIfPresent();
	  loginPage.typeName("Tatjana");
	  loginPage.typeCreditCard("32043948398293823");
	  loginPage.clickTheButtonPurchase();
	  assertNotEquals(actualName, expectedName, "It contradicts the user interface experience.");
	  }
	  @Test
	  public void verifyNames2() {
		  loginPage.clickOnTheMonitors1();
		  loginPage.verifyMonitors4();
	  }
	  @Test
	  public void verifyPrices2() {
		  loginPage.clickOnTheMonitors1();
		  loginPage.verifyMonitors5();
	  }
	  @Test
	  public void verifyDescription() {
		  loginPage.clickOnTheMonitors1();
		  loginPage.verifyMonitors6();
	  }
	  @Test
	  public void verifyPricesFromSecondToThirdPage() {
		  
		  loginPage.clickOnTheMonitors1();
		  loginPage.clickSecondMonitor();
		  String actualName = driver.findElement(By.cssSelector("#tbodyid > h3")).getText();
		  loginPage.verifyMonitor5();
		  String expectedName = "230";
		  loginPage.clickLinkByIndex(3);
		  loginPage.clickTheButtonPlaceOrder();
		  loginPage.clickTheButtonPurchase();
		  loginPage.acceptAlertIfPresent();
		  loginPage.typeName("Milovan");
		  loginPage.typeCreditCard("2343545232324354");
		  loginPage.clickTheButtonPurchase();
		  assertNotEquals(actualName, expectedName, "It contradicts the user interface experience.");
		  }
	  }

