package projectIndianRailways;


import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import projectMagento.LoginPageMagentoClass.EmailGenerator;


public class TestIndianRailwaysClass extends BaseIndianRailwaysClass {
	
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://www.irctc.co.in/nget/profile/user-registration");
	}

	@AfterMethod
	public void deleteCookie() {
		driver.manage().deleteAllCookies();
	}
	@Test
	public void verifyBookTicket() {

	    bookTicket.typeInputFieldFromMenu("MUMBAI CENTRAL - MMCT (MUMBAI)");
	    bookTicket.typeInputFieldToMenu("NEW DELHI - NDLS (NEW DELHI)");
	    bookTicket.clickOnTheButtonSearch();
	}
	@Test
	public void verifyRegistrationForm() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(bookTicket.verifyListOfCategories1());
		softAssert.assertTrue(bookTicket.verifyWholeFirstPage());

	        // Generate and use the username
		   String username = bookTicket.generateUsername();
	        System.out.println("Generated username: " + username);

	        // Perform actions with the username as required by your test case
	    

	        // Perform actions with the username as required by your test case
	    
		bookTicket.typeInputFieldUserName(username);
		bookTicket.typeInputFieldPassword("THC213F4iE");
		bookTicket.typeInputFieldConfirmPassword("THC213F4iE");
		bookTicket.clickOnListMenus("Cegar");
		bookTicket.clickOnTheContinue();
		softAssert.assertTrue(bookTicket.verifyListOfCategories2());
		softAssert.assertTrue(bookTicket.verifyWholeSecondPage());
		//Personal Details
		bookTicket.typeInputFieldFirstName("Damjan");
		bookTicket.typeInputFieldMiddleName("Goran");
		bookTicket.typeInputFieldLastName("Gligorovic");
		bookTicket.verifyListOccupation1();
		bookTicket.verifyListDateOfBirt1("01-04-1993");
		bookTicket.clickOnTheLastNameField();
		//bookTicket.verifyListYears();
		//bookTicket.verifyListMonths();

		//bookTicket.verifyListDays();
		bookTicket.verifyListRadioButtons();
		bookTicket.verifyListCountries1();
		 String randomEmail = null;
			try {
				randomEmail = EmailGenerator.generateRandomEmail();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		bookTicket.typeIntoTheFieldEmail(randomEmail);
		bookTicket.verifyListGenders();
		bookTicket.typeInputFieldISD("381");
		bookTicket.generateNineDigitMobileNumber();
        // Insert the generated mobile number into the field
        bookTicket.insertMobileNumber();

        // Perform any additional actions or assertions as needed
 
    

	//	bookTicket.typeInputFieldMobile("");
		bookTicket.verifyListNationality1();
		bookTicket.clickOnTheContinue();
		softAssert.assertTrue(bookTicket.verifyListOfCategories3());
		//Address
		bookTicket.typeInputFieldFlat("Second Floor Kuna 22");
		bookTicket.typeInputFieldPinCode("18000");
		bookTicket.typeInputFieldCity("Nis");
		bookTicket.typeInputFieldState1("Serbia");
		bookTicket.typeInputFieldPostOffice("Pantelej");
		bookTicket.typeInputFieldResPhone("601683355");
		 //  String captchaQuestion = bookTicket.getCaptchaQuestion();

	        // Implement logic to solve the CAPTCHA (this part is highly dependent on the CAPTCHA itself)
	        // For demonstration purposes, let's assume the solution is "12345"
	     //  String captchaSolution = solveCaptcha(captchaQuestion);
	      // bookTicket.getCaptchaQuestion();

	        // Fill the CAPTCHA input field with the solution
	     //  bookTicket.fillCaptcha(captchaSolution);
	       // bookTicket.pressEnter();
			bookTicket.verifyListYes();				
			bookTicket.solveCaptchaManually1();

	        //bookTicket.clickOnTheLinkTerms();
	       bookTicket.clickOnTheTermsAndCondition();
	        bookTicket.clickOnTheButtonRegister();
	        bookTicket.clickOnTheButtonAlertOk();

	        softAssert.assertTrue(bookTicket.verifyConfirmationMessage());
	       softAssert.assertAll(); // Additional assertions or actions after filling the CAPTCHA
	    }

	    // Placeholder method for solving the CAPTCHA (to be implemented based on actual CAPTCHA logic)
	    private String solveCaptcha(String question) {
	        // Logic to solve the CAPTCHA based on the question
	        // For example purposes, return a hardcoded solution
	        return "12345";
	    }
	    @Test
		public void verifyRegistrationForm1() throws InterruptedException {
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(bookTicket.verifyListOfCategories1());
			softAssert.assertTrue(bookTicket.verifyWholeFirstPage());

			bookTicket.typeInputFieldUserName("ereeRewre34RE");
			bookTicket.typeInputFieldPassword("fdFfgdgasdfs44");
			bookTicket.typeInputFieldConfirmPassword("fdFfgdgasdfs44");
			bookTicket.clickOnListMenus("Cegar");
			bookTicket.clickOnTheContinue();
			softAssert.assertTrue(bookTicket.verifyListOfCategories2());
			softAssert.assertTrue(bookTicket.verifyWholeSecondPage());
			//Personal Details
			bookTicket.typeInputFieldFirstName("Damjan");
			bookTicket.typeInputFieldMiddleName("Goran");
			bookTicket.typeInputFieldLastName("Gligorovic");
			bookTicket.verifyListOccupation1();
			bookTicket.verifyListDateOfBirt1("01-04-1993");
			bookTicket.clickOnTheLastNameField();
			//bookTicket.verifyListYears();
			//bookTicket.verifyListMonths();

			//bookTicket.verifyListDays();
			bookTicket.verifyListRadioButtons();
			bookTicket.verifyListCountries1();
			
			bookTicket.typeIntoTheFieldEmail("damjangligorovic@hotmail.com");
			bookTicket.verifyListGenders();
			bookTicket.typeInputFieldISD("381");
			//bookTicket.generateNineDigitMobileNumber();
			//bookTicket.insertMobileNumber();
			bookTicket.typeInputFieldMobile("601683355");
			bookTicket.verifyListNationality1();
			bookTicket.clickOnTheContinue();
			softAssert.assertTrue(bookTicket.verifyListOfCategories3());
			//softAssert.assertTrue(bookTicket.verifyWholeThirdPage());
			//Address
			bookTicket.typeInputFieldFlat("Second Floor Kuna 22");
			bookTicket.typeInputFieldPinCode("18000");
			bookTicket.typeInputFieldCity("Nis");
			bookTicket.typeInputFieldState1("Serbia");
			bookTicket.typeInputFieldPostOffice("Pantelej");
			bookTicket.typeInputFieldResPhone("601683355");
			bookTicket.verifyListYes();				

			//String captchaQuestion = bookTicket.getCaptchaQuestion();
		   // String captchaSolution = solveCaptcha(captchaQuestion);
		    
		     //   bookTicket.fillCaptcha(captchaSolution);
		     //   bookTicket.pressEnter();

			///bookTicket.solveRecaptchaManually();
		        bookTicket.clickOnTheTermsAndCondition();
		        
		        bookTicket.verifyButtonRegister();
		        bookTicket.clickOnTheButtonAlertOk();
		      //  String actualUrlString = driver.getCurrentUrl();
		      //  String expectedUrlString = "https://www.irctc.co.in/nget/profile/user-registration";
		      //  softAssert.assertEquals(actualUrlString, expectedUrlString);
		       softAssert.assertAll(); // Additional assertions or actions after filling the CAPTCHA
		    }

		    // Placeholder method for solving the CAPTCHA (to be implemented based on actual CAPTCHA logic)
		  

	@Test
	public void verifyDriver() {
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    String title = driver.getTitle();
	    System.out.println("Page Title: " + title);
	    assertTrue(title.contains("IRCTC Next Generation eTicketing System"));
	}
	
}

