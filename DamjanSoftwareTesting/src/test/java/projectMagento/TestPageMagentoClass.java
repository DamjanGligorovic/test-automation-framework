package projectMagento;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestPageMagentoClass extends BasePageMagentoClass {
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		driver.navigate().refresh();
	}
	@AfterMethod
	public void deleteCookie() {
		driver.manage().deleteAllCookies();
	}
	@Test(dataProvider  = "firstName", dataProviderClass = TestDataFirstNameClass.class)
	public void testCase1(String input) {
	loginPage.clickOnTheCreateAccount();
	loginPage.typeIntoTheFieldFirstName(input);
	loginPage.typeIntoTheFieldLastName("Gligorovic");
	loginPage.typeIntoTheFieldEmail("damjangligorovic@hotmail.com");
	loginPage.typeIntoThePassword("Felina10");
	loginPage.typeIntoTheFieldConfirmPassword("Felina10");
	loginPage.clickOnTheButtonCreateAccount();
	}
	@Test(dataProvider  = "firstNameIncorrectInputs", dataProviderClass = TestDataFirstNameIncorrectClass.class) 
	public void testCase2(String input) {
		loginPage.clickOnTheCreateAccount();
		loginPage.typeIntoTheFieldFirstName(input);
		loginPage.typeIntoTheFieldLastName("Gligorovic");
		loginPage.typeIntoTheFieldEmail("damjangligorovic@hotmail.com");
		loginPage.typeIntoThePassword("Felina10");
		loginPage.typeIntoTheFieldConfirmPassword("Felina10");
		loginPage.clickOnTheButtonCreateAccount();
	}
	@Test(dataProvider  = "lastNameIncorrectInputs", dataProviderClass = TestDataLastNameIncorrectClass.class) 
	public void testCase3(String input) {
		loginPage.clickOnTheCreateAccount();
		loginPage.typeIntoTheFieldFirstName("John");
		loginPage.typeIntoTheFieldLastName(input);
		loginPage.typeIntoTheFieldEmail("damjangligorovic@hotmail.com");
		loginPage.typeIntoThePassword("Felina10");
		loginPage.typeIntoTheFieldConfirmPassword("Felina10");
		loginPage.clickOnTheButtonCreateAccount();
	}
	@Test(dataProvider  = "passwordIncorrectInputs", dataProviderClass = TestDataPasswordClass.class) 
	public void testCase4(String input) {
		loginPage.clickOnTheCreateAccount();
		loginPage.typeIntoTheFieldFirstName("John");
		loginPage.typeIntoTheFieldLastName("Smith");
		loginPage.typeIntoTheFieldEmail("dfdf434343@gmail.com");
		loginPage.typeIntoThePassword(input);
		loginPage.typeIntoTheFieldConfirmPassword(input);
		loginPage.clickOnTheButtonCreateAccount();
	}
	@Test(priority = 1)
	  @Parameters("testParam")
	  public void testCase5(@Optional("defaultValue") String testParam) {
	    System.out.println("Test parameter: " + testParam);
	    loginPage.clickOnTheCreateAccount();
	    loginPage.typeIntoTheFieldFirstName("John");
	    loginPage.typeIntoTheFieldLastName("Smith");
	    loginPage.typeIntoTheFieldEmail("dfdf434343@gmail.com");
	    loginPage.typeIntoThePassword("Synchronization1");
	    loginPage.typeIntoTheFieldConfirmPassword("Synchronization@");
	    loginPage.clickOnTheButtonCreateAccount();
	  }
	}