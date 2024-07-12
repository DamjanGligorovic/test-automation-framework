package projectSauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSauceDemoClass extends BaseSauceDemoClass {
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://www.saucedemo.com/");
		driver.navigate().refresh();
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
	public void testCase1() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(0);
		loginPage.clickOnTheListItems0();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheRemoveButtonIconShopping();
		loginPage.clickOnTheButtonContinueShopping();
		loginPage.clickOnTheListButtonsToCarts(0);
		loginPage.clickOnTheListPrice0();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheRemoveButtonIconShopping();
		loginPage.clickOnTheButtonContinueShopping();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImage() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(0);
		String firstPageImageSrc = loginPage.getImageSrc1(); 
	    loginPage.clickOnTheFirstImage();
	    String secondPageImageSrc = loginPage.getImageSrc2();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase2() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(1);
		loginPage.clickOnTheListItems1();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonRemoveSauce();
		loginPage.clickOnTheButtonContinueShopping();
		loginPage.clickOnTheListPrice1();
		loginPage.clickOnTheBackToLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImage1() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(1);
		String firstPageImageSrc = loginPage.getImageSrc3(); 
	    loginPage.clickOnTheSecondImage();
	    String secondPageImageSrc = loginPage.getImageSrc4();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase3() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(2);
		loginPage.clickOnTheListItems2();
		loginPage.clickOnTheButtonRemove();
		driver.navigate().back();
		loginPage.clickOnTheListPrice2();
		loginPage.clickOnTheBackToLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImage2() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(2);
		String firstPageImageSrc = loginPage.getImageSrc5(); 
	    loginPage.clickOnTheThirdImage();
	    String secondPageImageSrc = loginPage.getImageSrc6();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase4() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(3);
		loginPage.clickOnTheListItems3();
		loginPage.clickOnTheButtonRemove();
		driver.navigate().back();
		loginPage.clickOnTheListPrice3();
		loginPage.clickOnTheBackToLink();
		//loginPage.clickOnTheButtonRemoveSauce();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImage3() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(3);
		String firstPageImageSrc = loginPage.getImageSrc7(); 
	    loginPage.clickOnTheFourthImage();
	    String secondPageImageSrc = loginPage.getImageSrc8();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase5() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(4);
		loginPage.clickOnTheListItems4();
		loginPage.clickOnTheButtonRemove();
		driver.navigate().back();
		loginPage.clickOnTheListPrice4();
		loginPage.clickOnTheBackToLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImage4() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(4);
		String firstPageImageSrc = loginPage.getImageSrc9(); 
	    loginPage.clickOnTheFifthImage();
	    String secondPageImageSrc = loginPage.getImageSrc10();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase6() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(5);
		loginPage.clickOnTheListItems5();
		loginPage.clickOnTheButtonRemove();
		driver.navigate().back();
		loginPage.clickOnTheListPrice5();
		loginPage.clickOnTheBackToLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImage5() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(5);
		String firstPageImageSrc = loginPage.getImageSrc11(); 
	    loginPage.clickOnTheSixthImage();
	    String secondPageImageSrc = loginPage.getImageSrc12();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase7() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.verifySettings();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCase10() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("locked_out_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		softAssert.assertTrue(loginPage.verifyTheErrorMessage());
		softAssert.assertAll();
	}
	@Test
	public void testCase11() {

		loginPage.typeUsername("problem_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(0);
		loginPage.clickOnTheListPrice6();
		
    }	
	@Test
	public void testCaseDodatakImageProblemUser0() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("problem_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(0);
		String firstPageImageSrc = loginPage.getImageSrc1(); 
	    loginPage.clickOnTheFirstImage();
	    String secondPageImageSrc = loginPage.getImageSrc2();
	    softAssert.assertNotEquals(firstPageImageSrc, secondPageImageSrc, "The images are the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase12() {
		
		SoftAssert softAssert = new SoftAssert();

	loginPage.typeUsername("problem_user");
	loginPage.typePassword("secret_sauce");
	loginPage.clickOnTheButtonLogin();
	loginPage.clickOnTheListButtonsToCarts(0);
	loginPage.clickOnTheListItems6();
	String actualUrl = driver.getCurrentUrl();
	String expectedUrl = "https://www.saucedemo.com/inventory-item.html?id=4";
	softAssert.assertEquals(actualUrl, expectedUrl);
	}
	@Test
	public void testCaseDodatakImageProblemUser1() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("problem_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(1);
		String firstPageImageSrc = loginPage.getImageSrc3(); 
	    loginPage.clickOnTheSecondImage();
	    String secondPageImageSrc = loginPage.getImageSrc4();
	    softAssert.assertNotEquals(firstPageImageSrc, secondPageImageSrc, "The images are the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase13() {

		loginPage.typeUsername("problem_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(1);
		loginPage.clickOnTheListItems7();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonRemoveSauce();
		loginPage.clickOnTheButtonContinueShopping();
    }	
	@Test
	public void testCase14() {

		loginPage.typeUsername("problem_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(2);
		loginPage.clickOnTheListItems8();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonRemoveSauce();
		loginPage.clickOnTheButtonContinueShopping();
    }	
	@Test
	public void testCaseDodatakImageProblemUser2() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("problem_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(2);
		String firstPageImageSrc = loginPage.getImageSrc5(); 
	    loginPage.clickOnTheThirdImage();
	    String secondPageImageSrc = loginPage.getImageSrc6();
	    softAssert.assertNotEquals(firstPageImageSrc, secondPageImageSrc, "The images are the same!");
		softAssert.assertAll();
	}
	
	@Test
	public void testCase15() {

		loginPage.typeUsername("problem_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(3);
		loginPage.clickOnTheListItems9();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonRemoveSauce();
		loginPage.clickOnTheButtonContinueShopping();
    }	
	@Test
	public void testCaseDodatakImageProblemUser3() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("problem_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(3);
		String firstPageImageSrc = loginPage.getImageSrc7(); 
	    loginPage.clickOnTheFourthImage();
	    String secondPageImageSrc = loginPage.getImageSrc8();
	    softAssert.assertNotEquals(firstPageImageSrc, secondPageImageSrc, "The images are the same!");
		softAssert.assertAll();
	}
	
	@Test
	public void testCase16() {

		loginPage.typeUsername("problem_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(4);
		loginPage.clickOnTheListItems10();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonRemoveSauce();
		loginPage.clickOnTheButtonContinueShopping();
    }	
	@Test
	public void testCaseDodatakImageProblemUser4() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("problem_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(4);
		String firstPageImageSrc = loginPage.getImageSrc9(); 
	    loginPage.clickOnTheFifthImage();
	    String secondPageImageSrc = loginPage.getImageSrc10();
	    softAssert.assertNotEquals(firstPageImageSrc, secondPageImageSrc, "The images are the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase17() {

		loginPage.typeUsername("problem_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(5);
		loginPage.clickOnTheListItems11();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonRemoveSauce();
		loginPage.clickOnTheButtonContinueShopping();
    }	
	@Test
	public void testCaseDodatakImageProblemUser5() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("problem_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(5);
		String firstPageImageSrc = loginPage.getImageSrc11(); 
	    loginPage.clickOnTheSixthImage();
	    String secondPageImageSrc = loginPage.getImageSrc12();
	    softAssert.assertNotEquals(firstPageImageSrc, secondPageImageSrc, "The images are the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase18() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();	
		loginPage.clickOnTheListButtonsToCarts(0);
		loginPage.clickOnTheListItems0();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheRemoveButtonIconShopping();
		loginPage.clickOnTheButtonContinueShopping();
		loginPage.clickOnTheListButtonsToCarts(0);
		loginPage.clickOnTheListPrice0();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheRemoveButtonIconShopping();
		loginPage.clickOnTheButtonContinueShopping();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImagePerformance0() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(0);
		String firstPageImageSrc = loginPage.getImageSrc1(); 
	    loginPage.clickOnTheFirstImage();
	    String secondPageImageSrc = loginPage.getImageSrc2();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase19() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(1);
		loginPage.clickOnTheListItems1();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonRemoveSauce();
		loginPage.clickOnTheButtonContinueShopping();
		loginPage.clickOnTheListPrice1();
		loginPage.clickOnTheBackToLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImagePerformance1() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(1);
		String firstPageImageSrc = loginPage.getImageSrc3(); 
	    loginPage.clickOnTheSecondImage();
	    String secondPageImageSrc = loginPage.getImageSrc4();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase20() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(2);
		loginPage.clickOnTheListItems2();
		loginPage.clickOnTheButtonRemove();
		driver.navigate().back();
		loginPage.clickOnTheListPrice2();
		loginPage.clickOnTheBackToLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImagePerformance2() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(2);
		String firstPageImageSrc = loginPage.getImageSrc5(); 
	    loginPage.clickOnTheThirdImage();
	    String secondPageImageSrc = loginPage.getImageSrc6();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase21() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(3);
		loginPage.clickOnTheListItems3();
		loginPage.clickOnTheButtonRemove();
		driver.navigate().back();
		loginPage.clickOnTheListPrice3();
		loginPage.clickOnTheBackToLink();
		//loginPage.clickOnTheButtonRemoveSauce();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();

	}
	@Test
	public void testCaseDodatakImagePerformance3() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(3);
		String firstPageImageSrc = loginPage.getImageSrc7(); 
	    loginPage.clickOnTheFourthImage();
	    String secondPageImageSrc = loginPage.getImageSrc8();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	
	public void testCase22() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(4);
		loginPage.clickOnTheListItems4();
		loginPage.clickOnTheButtonRemove();
		driver.navigate().back();
		loginPage.clickOnTheListPrice4();
		loginPage.clickOnTheBackToLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();

	}
	@Test
	public void testCaseDodatakImagePerformance4() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(4);
		String firstPageImageSrc = loginPage.getImageSrc9(); 
	    loginPage.clickOnTheFifthImage();
	    String secondPageImageSrc = loginPage.getImageSrc10();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase23() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(5);
		loginPage.clickOnTheListItems5();
		loginPage.clickOnTheButtonRemove();
		driver.navigate().back();
		loginPage.clickOnTheListPrice5();
		loginPage.clickOnTheBackToLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImagePerformance5() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(5);
		String firstPageImageSrc = loginPage.getImageSrc11(); 
	    loginPage.clickOnTheSixthImage();
	    String secondPageImageSrc = loginPage.getImageSrc12();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	
	@Test
	public void testCase24() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();	
		loginPage.clickOnTheListButtonsToCarts(0);
		loginPage.clickOnTheListItems0();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheRemoveButtonIconShopping();
		loginPage.clickOnTheButtonContinueShopping();
		loginPage.clickOnTheListButtonsToCarts(0);
		loginPage.clickOnTheListPrice0();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheRemoveButtonIconShopping();
		loginPage.clickOnTheButtonContinueShopping();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImageErrorUser0() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(0);
		String firstPageImageSrc = loginPage.getImageSrc1(); 
	    loginPage.clickOnTheFirstImage();
	    String secondPageImageSrc = loginPage.getImageSrc2();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase25() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(1);
		loginPage.clickOnTheListItems1();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonRemoveSauce();
		loginPage.clickOnTheButtonContinueShopping();
		loginPage.clickOnTheListPrice1();
		loginPage.clickOnTheBackToLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImageErrorUser1() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(1);
		String firstPageImageSrc = loginPage.getImageSrc3(); 
	    loginPage.clickOnTheSecondImage();
	    String secondPageImageSrc = loginPage.getImageSrc4();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase26() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(2);
		loginPage.clickOnTheListItems2();
		loginPage.clickOnTheButtonRemove();
		driver.navigate().back();
		loginPage.clickOnTheListPrice2();
		loginPage.clickOnTheBackToLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImageErrorUser2() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(2);
		String firstPageImageSrc = loginPage.getImageSrc5(); 
	    loginPage.clickOnTheThirdImage();
	    String secondPageImageSrc = loginPage.getImageSrc6();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase27() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(3);
		loginPage.clickOnTheListItems3();
		loginPage.clickOnTheButtonRemove();
		driver.navigate().back();
		loginPage.clickOnTheListPrice3();
		loginPage.clickOnTheBackToLink();
		//loginPage.clickOnTheButtonRemoveSauce();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();

	}
	@Test
	public void testCaseDodatakImageErrorUser3() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(3);
		String firstPageImageSrc = loginPage.getImageSrc7(); 
	    loginPage.clickOnTheFourthImage();
	    String secondPageImageSrc = loginPage.getImageSrc8();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	
	public void testCase28() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(4);
		loginPage.clickOnTheListItems4();
		loginPage.clickOnTheButtonRemove();
		driver.navigate().back();
		loginPage.clickOnTheListPrice4();
		loginPage.clickOnTheBackToLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();

	}
	@Test
	public void testCaseDodatakImageErrorUser4() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(4);
		String firstPageImageSrc = loginPage.getImageSrc9(); 
	    loginPage.clickOnTheFifthImage();
	    String secondPageImageSrc = loginPage.getImageSrc10();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase29() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(5);
		loginPage.clickOnTheListItems5();
		loginPage.clickOnTheButtonRemove();
		driver.navigate().back();
		loginPage.clickOnTheListPrice5();
		loginPage.clickOnTheBackToLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	@Test
	public void testCaseDodatakImageErrorUser5() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(5);
		String firstPageImageSrc = loginPage.getImageSrc11(); 
	    loginPage.clickOnTheSixthImage();
	    String secondPageImageSrc = loginPage.getImageSrc12();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase30() {
		loginPage.typeUsername("error_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.verifySettings1();

	}
	@Test
	public void testCase31() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.verifySettings();
	}
	@Test
	public void testCase32() {
		loginPage.typeUsername("performance_glitch_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.verifySettings();

	}
	@Test
	public void testCase33() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(0);
		loginPage.clickOnTheListItems12();
		
	}
	@Test
	public void testCaseDodatakImage0() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(0);
		String firstPageImageSrc = loginPage.getImageSrc1(); 
	    loginPage.clickOnTheFirstImage();
	    String secondPageImageSrc = loginPage.getImageSrc2();
	    softAssert.assertNotEquals(firstPageImageSrc, secondPageImageSrc, "The images are the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase34() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(0);
		loginPage.verifyThePriceVisualUser();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonRemoveHomePage();
		loginPage.clickOnTheButtonContinueShopping();
		
	}
	@Test
	public void testCase35() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(1);
		loginPage.clickOnTheListItems13();
		
	}
	@Test
	public void testCaseDodatakVisualImage1() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(1);
		String firstPageImageSrc = loginPage.getImageSrc3(); 
	    loginPage.clickOnTheSecondImage();
	    String secondPageImageSrc = loginPage.getImageSrc4();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase36() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(1);
		loginPage.verifyThePriceVisualUser1();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonRemoveSauce();
		loginPage.clickOnTheButtonContinueShopping();
		
	}
	@Test
	public void testCase37() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(2);
		loginPage.clickOnTheListItems14();
		
	}
	@Test
	public void testCaseDodatakVisualImage2() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(2);
		String firstPageImageSrc = loginPage.getImageSrc5(); 
	    loginPage.clickOnTheThirdImage();
	    String secondPageImageSrc = loginPage.getImageSrc6();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase38() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(2);
		loginPage.verifyThePriceVisualUser2();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonRemoveTshirt();
		loginPage.clickOnTheButtonContinueShopping();
		
	}
	@Test
	public void testCaseDodatakVisualImage3() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(3);
		String firstPageImageSrc = loginPage.getImageSrc7(); 
	    loginPage.clickOnTheFourthImage();
	    String secondPageImageSrc = loginPage.getImageSrc8();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase39() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(3);
		loginPage.clickOnTheListItems15();
		
	}
	@Test
	public void testCase40() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(3);
		loginPage.verifyThePriceVisualUser3();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonFleeceJacket();
		loginPage.clickOnTheButtonContinueShopping();
		
	}
	@Test
	public void testCase41() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(4);
		loginPage.clickOnTheListItems16();
		
	}
	@Test
	public void testCaseDodatakVisualImage4() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(4);
		String firstPageImageSrc = loginPage.getImageSrc9(); 
	    loginPage.clickOnTheFifthImage();
	    String secondPageImageSrc = loginPage.getImageSrc10();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase42() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(4);
		loginPage.verifyThePriceVisualUser4();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonRemoveOnesie();
		loginPage.clickOnTheButtonContinueShopping();
	}
	@Test
	public void testCase43() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(5);
		loginPage.clickOnTheListItems17();
		loginPage.verifyThePriceVisualUser5();
		
		
	}
	@Test
	public void testCaseDodatakVisualImage5() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(5);
		String firstPageImageSrc = loginPage.getImageSrc11(); 
	    loginPage.clickOnTheSixthImage();
	    String secondPageImageSrc = loginPage.getImageSrc12();
	    softAssert.assertEquals(firstPageImageSrc, secondPageImageSrc, "The images are not the same!");
		softAssert.assertAll();
	}
	@Test
	public void testCase44() {
		loginPage.typeUsername("visual_user");
		loginPage.typePassword("secret_sauce");
		loginPage.clickOnTheButtonLogin();
		loginPage.clickOnTheListButtonsToCarts(5);
		loginPage.verifyThePriceVisualUser5();
		loginPage.clickOnTheIconShoppingCart();
		loginPage.clickOnTheButtonAllthings();
		loginPage.clickOnTheButtonContinueShopping();
	}
}
