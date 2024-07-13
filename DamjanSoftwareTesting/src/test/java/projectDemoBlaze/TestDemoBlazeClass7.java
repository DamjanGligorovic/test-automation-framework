package projectDemoBlaze;




import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestDemoBlazeClass7 extends BaseTestDemoBlazeClass {
	
	
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
		    public void verifyNameSony() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptops1();
		        
		    }
		  @Test
		    public void verifyPriceSony() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptops2();
		        
		    }
		  @Test
		    public void verifyDescriptionSony() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptops3();
		        
		    }
		  @Test
		  public void verifyPricesFromSecondToThirdPage() {
			  
			  loginPage.clickOnTheLaptops2();
			  loginPage.clickFirstLaptop();
			  String actualName = driver.findElement(By.cssSelector("#tbodyid > h3")).getText();
			  loginPage.verifyMonitor8();
			  loginPage.acceptAlertIfPresent();
			  String expectedName = "790";
			  loginPage.clickLinkByIndex(3);
			  loginPage.clickTheButtonPlaceOrder();
			  loginPage.clickTheButtonPurchase();
			  loginPage.acceptAlertIfPresent();
			  loginPage.typeName("Dragutin");
			  loginPage.typeCreditCard("84847484847484784");
			  loginPage.clickTheButtonPurchase();
			  assertNotEquals(actualName, expectedName, "It contradicts the user interface experience.");
			  }
// Drugi laptop -----------------------------------------------------------------------------------------
		  @Test
		    public void verifyNameSonySecond() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptopsSecond();
		        
		    }
		  @Test
		    public void verifyPriceSonySecond() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyPricesLaptopsSecond();
		        
		    }
		  @Test
		    public void verifyDescriptionSonySecond() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptopsSecondDescription();
		        
		    }
		  @Test
		  public void verifyPricesFromSecondToThirdPageSecond() {
			  
			  loginPage.clickOnTheLaptops2();
			  loginPage.clickSecondLaptop();
			  String actualName = driver.findElement(By.cssSelector("#tbodyid > h3")).getText();
			  loginPage.verifyMonitor9();
			  loginPage.acceptAlertIfPresent();

			  String expectedName = "790";
			  loginPage.clickLinkByIndex(3);
			  loginPage.clickTheButtonPlaceOrder();
			  loginPage.clickTheButtonPurchase();
			  loginPage.acceptAlertIfPresent();
			  loginPage.typeName("Dragutin");
			  loginPage.typeCreditCard("84847484847484784");
			  loginPage.clickTheButtonPurchase();
			  assertNotEquals(actualName, expectedName, "It contradicts the user interface experience.");
			  }	  
// Treci laptop -----------------------------------------------------------------------------------------
		  @Test
		    public void verifyNameSonyThird() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptopsThird();
		        
		    }
		  @Test
		    public void verifyPriceSonyThird() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyPricesLaptopsThird();
		        
		    }
		  @Test
		    public void verifyDescriptionSonyThird() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptopsThirdDescription();
		        
		    }
		  @Test
		  public void verifyPricesFromSecondToThirdPageThird() {
			  
			  loginPage.clickOnTheLaptops2();
			  loginPage.clickThirdLaptop();
			  String actualName = driver.findElement(By.cssSelector("#tbodyid > h3")).getText();
			  loginPage.verifyMonitor11();
			  loginPage.acceptAlertIfPresent();

			  String expectedName = "700";
			  loginPage.clickLinkByIndex(3);
			  loginPage.clickTheButtonPlaceOrder();
			  loginPage.clickTheButtonPurchase();
			  loginPage.acceptAlertIfPresent();
			  loginPage.typeName("Milena");
			  loginPage.typeCreditCard("2039203920434");
			  loginPage.clickTheButtonPurchase();
			  assertNotEquals(actualName, expectedName, "It contradicts the user interface experience.");
			  }	
// Cetvrti laptop -----------------------------------------------------------------------------------------
		  @Test
		    public void verifyNameSonyFourth() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptopsFourth();
		        
		    }
		  @Test
		    public void verifyPriceSonyFourth() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyPricesLaptopsFourth();
		        
		    }
		  @Test
		    public void verifyDescriptionSonyFourth() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptopsFourthDescription();
		        
		    }
		  @Test
		  public void verifyPricesFromSecondToThirdPageFourth() {
			  
			  loginPage.clickOnTheLaptops2();
			  loginPage.clickFourthLaptop();
			  String actualName = driver.findElement(By.cssSelector("#tbodyid > h3")).getText();
			  loginPage.verifyMonitor12();
			  loginPage.acceptAlertIfPresent();

			  String expectedName = "700";
			  loginPage.clickLinkByIndex(3);
			  loginPage.clickTheButtonPlaceOrder();
			  loginPage.clickTheButtonPurchase();
			  loginPage.acceptAlertIfPresent();
			  loginPage.typeName("Brankica");
			  loginPage.typeCreditCard("2324350385034");
			  loginPage.clickTheButtonPurchase();
			  assertNotEquals(actualName, expectedName, "It contradicts the user interface experience.");
			  }	
// Peti laptop -----------------------------------------------------------------------------------------
		  @Test
		    public void verifyNameSonyFifth() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptopsFifth();
		        
		    }
		  @Test
		    public void verifyPriceSonyFifth() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyPricesLaptopsFifth();
		        
		    }
		  @Test
		    public void verifyDescriptionSonyFifth() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptopsFifthDescription();
		        
		    }
		  @Test
		  public void verifyPricesFromSecondToThirdPageFifth() {
			  
			  loginPage.clickOnTheLaptops2();
			  loginPage.clickFifthLaptop();
			  String actualName = driver.findElement(By.cssSelector("#tbodyid > h3")).getText();
			  loginPage.verifyMonitor13();
			  loginPage.acceptAlertIfPresent();

			  String expectedName = "700";
			  loginPage.clickLinkByIndex(3);
			  loginPage.clickTheButtonPlaceOrder();
			  loginPage.clickTheButtonPurchase();
			  loginPage.acceptAlertIfPresent();
			  loginPage.typeName("Brankica");
			  loginPage.typeCreditCard("2324350385034");
			  loginPage.clickTheButtonPurchase();
			  assertNotEquals(actualName, expectedName, "It contradicts the user interface experience.");
			  }	
// Sesti laptop -----------------------------------------------------------------------------------------
		  @Test
		    public void verifyNameSonySixth() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptopsSixth();
		        
		    }
		  @Test
		    public void verifyPriceSonySixth() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyPricesLaptopsSixth();
		        
		    }
		  @Test
		    public void verifyDescriptionSonySixth() {
		     loginPage.clickOnTheLaptops2();
		     loginPage.verifyLaptopsSixthDescription();
		        
		    }
		  @Test
		  public void verifyPricesFromSecondToThirdPageSixth() {
			  
			  loginPage.clickOnTheLaptops2();
			  loginPage.clickSixthLaptop();
			  String actualName = driver.findElement(By.cssSelector("#tbodyid > h3")).getText();
			  loginPage.verifyMonitor14();
			  loginPage.acceptAlertIfPresent();

			  String expectedName = "1100";
			  loginPage.clickLinkByIndex(3);
			  loginPage.clickTheButtonPlaceOrder();
			  loginPage.clickTheButtonPurchase();
			  loginPage.acceptAlertIfPresent();
			  loginPage.typeName("Aleksandar");
			  loginPage.typeCreditCard("434342324350382324435034");
			  loginPage.clickTheButtonPurchase();
			  assertNotEquals(actualName, expectedName, "It contradicts the user interface experience.");
			  }	
}