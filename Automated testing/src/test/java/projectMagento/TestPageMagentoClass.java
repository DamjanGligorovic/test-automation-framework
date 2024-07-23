package projectMagento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import projectMagento.LoginPageMagentoClass.EmailGenerator;



public class TestPageMagentoClass extends BasePageMagentoClass {
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://magento.softwaretestingboard.com/customer/account/create/");
		driver.navigate().refresh();
	}
	@AfterMethod
	public void deleteCookie() {
		driver.manage().deleteAllCookies();
	}
	@Test(dataProvider  = "firstName", dataProviderClass = TestDataFirstNameClass.class)
	public void testCase1(String input) {
	SoftAssert softAssert = new SoftAssert();
	//loginPage.clickOnTheCreateAccount();
	loginPage.typeIntoTheFieldFirstName(input);
	loginPage.typeIntoTheFieldLastName("Gligorovic");
	 String randomEmail = null;
	try {
		randomEmail = EmailGenerator.generateRandomEmail();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     loginPage.typeIntoTheFieldEmail(randomEmail);
	//loginPage.typeIntoTheFieldEmail("dsfdsf323asd2@gmail.com");
	loginPage.typeIntoThePassword("Felina10");
	loginPage.typeIntoTheFieldConfirmPassword("Felina10");
	loginPage.clickOnTheButtonCreateAccount();
	softAssert.assertTrue(loginPage.verifyConfirmationMessage());
	softAssert.assertAll();
	}
	@Test(dataProvider  = "firstNameIncorrectInputs", dataProviderClass = TestDataFirstNameIncorrectClass.class) 
	public void testCase2(String input) {
		SoftAssert softAssert = new SoftAssert();
		//loginPage.clickOnTheCreateAccount();
		loginPage.typeIntoTheFieldFirstName(input);
		loginPage.typeIntoTheFieldLastName("Gligorovic");
		 String randomEmail = null;
			try {
				randomEmail = EmailGenerator.generateRandomEmail();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		loginPage.typeIntoTheFieldEmail(randomEmail);
		loginPage.typeIntoThePassword("Felina10");
		loginPage.typeIntoTheFieldConfirmPassword("Felina10");
		loginPage.clickOnTheButtonCreateAccount();
		softAssert.assertFalse(loginPage.verifyConfirmationMessage());
		//softAssert.assertTrue(loginPage.verifyErrorMessage());
		//softAssert.assertTrue(loginPage.verifyInvalidMessage());
		softAssert.assertAll();
	
	}
	@Test(dataProvider  = "lastNameIncorrectInputs", dataProviderClass = TestDataLastNameIncorrectClass.class) 
	public void testCase3(String input) {
		SoftAssert softAssert = new SoftAssert();

		//loginPage.clickOnTheCreateAccount();
		loginPage.typeIntoTheFieldFirstName("John");
		loginPage.typeIntoTheFieldLastName(input);
		String randomEmail = null;
		try {
			randomEmail = EmailGenerator.generateRandomEmail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginPage.typeIntoTheFieldEmail(randomEmail);
		loginPage.typeIntoThePassword("Felina10");
		loginPage.typeIntoTheFieldConfirmPassword("Felina10");
		loginPage.clickOnTheButtonCreateAccount();
		softAssert.assertFalse(loginPage.verifyConfirmationMessage());
		softAssert.assertAll();

	}
	@Test(dataProvider  = "passwordIncorrectInputs", dataProviderClass = TestDataPasswordClass.class) 
	public void testCase4(String input) {

	//	loginPage.clickOnTheCreateAccount();
		loginPage.typeIntoTheFieldFirstName("John");
		loginPage.typeIntoTheFieldLastName("Smith");
		String randomEmail = null;
		try {
			randomEmail = EmailGenerator.generateRandomEmail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginPage.typeIntoTheFieldEmail(randomEmail);
		loginPage.typeIntoThePassword(input);
		loginPage.typeIntoTheFieldConfirmPassword(input);
		loginPage.clickOnTheButtonCreateAccount();
		
		
	}
	@Test(dataProvider  = "emailIncorrectInputs", dataProviderClass = TestDataEmailClass.class) 
	  @Parameters("testParam")
	  public void testCase5(@Optional("defaultValue") String testParam) {
	    System.out.println("Test parameter: " + testParam);
	   // loginPage.clickOnTheCreateAccount();
		SoftAssert softAssert = new SoftAssert();

	    loginPage.typeIntoTheFieldFirstName("John");
	    loginPage.typeIntoTheFieldLastName("Smith");
	    loginPage.typeIntoTheFieldEmail(testParam);
	    loginPage.typeIntoThePassword("Felina10");
	    loginPage.typeIntoTheFieldConfirmPassword("Felina10");
	    loginPage.clickOnTheButtonCreateAccount();
	    softAssert.assertTrue(loginPage.verifyErrorMessage2());
		softAssert.assertAll();
	  }
	@Test(priority = 2)
	public void testCase6() {
		SoftAssert softAssert = new SoftAssert();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
		loginPage.clickOnTheLinkSignIn();
		loginPage.typeCredentialsEmail("damjangligorovic@hotmail.com");
		loginPage.typeCredentialsPassword("Felina10");
		loginPage.clickOnTheButtonSignIn();
		 softAssert.assertTrue(loginPage.verifyTheConfirmationEditAccount());
		 softAssert.assertAll();
	}
	@Test(priority = 3)
	public void testCase7() {
		SoftAssert softAssert = new SoftAssert();

		loginPage.clickOnTheLinkSignIn();
		loginPage.clickOnTheForgotPassword();
		loginPage.typeIntoTheFieldEmail("damjangligorovic@hotmail.com");
		loginPage.clickOnTheButtonResetMyPassword();
		 softAssert.assertTrue(loginPage.verifyConfirmationMessage55());
		 softAssert.assertAll();
	}
	@Test
	public void testCase8() {
		SoftAssert softAssert = new SoftAssert();
		//loginPage.clickOnTheCreateAccount();
		loginPage.typeIntoTheFieldLastName("Gligorovic");
		String randomEmail = null;
		try {
			randomEmail = EmailGenerator.generateRandomEmail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginPage.typeIntoTheFieldEmail(randomEmail);
		loginPage.typeIntoThePassword("Felina10");
		loginPage.typeIntoTheFieldConfirmPassword("Felina10");
		loginPage.clickOnTheButtonCreateAccount();
		softAssert.assertTrue(loginPage.verifyErrorMessage());
		softAssert.assertAll();

	}
	@Test
	public void testCase9() {
		SoftAssert softAssert = new SoftAssert();
		//loginPage.clickOnTheCreateAccount();
		loginPage.typeIntoTheFieldFirstName("John");
		String randomEmail = null;
		try {
			randomEmail = EmailGenerator.generateRandomEmail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginPage.typeIntoTheFieldEmail(randomEmail);
		loginPage.typeIntoThePassword("Felina10");
		loginPage.typeIntoTheFieldConfirmPassword("Felina10");
		loginPage.clickOnTheButtonCreateAccount();
		softAssert.assertTrue(loginPage.verifyErrorMessage1());
		softAssert.assertAll();

	}
	
}