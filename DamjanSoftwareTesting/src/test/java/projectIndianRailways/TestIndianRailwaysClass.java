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
	public void verifyRegistrationForm() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(bookTicket.verifyListOfCategories1());
		softAssert.assertTrue(bookTicket.verifyWholeFirstPage());
		String username = bookTicket.generateUsername();
	    System.out.println("Generated username: " + username);
		bookTicket.typeInputFieldUserName(username);
		bookTicket.typeInputFieldPassword("THC213F4iE");
		bookTicket.typeInputFieldConfirmPassword("THC213F4iE");
		bookTicket.clickOnListMenus("Cegar");
		bookTicket.clickOnTheContinue();
		softAssert.assertTrue(bookTicket.verifyListOfCategories2());
		softAssert.assertTrue(bookTicket.verifyWholeSecondPage());
		bookTicket.typeInputFieldFirstName("Damjan");
		bookTicket.typeInputFieldMiddleName("Goran");
		bookTicket.typeInputFieldLastName("Gligorovic");
		bookTicket.verifyListOccupation1();
		bookTicket.verifyListDateOfBirt1("01-04-1993");
		bookTicket.clickOnTheLastNameField();
		bookTicket.verifyListRadioButtons();
		bookTicket.verifyListCountries1();
		 String randomEmail = null;
			try {
				randomEmail = EmailGenerator.generateRandomEmail();
			} catch (Exception e) {
				e.printStackTrace();
			}
		bookTicket.typeIntoTheFieldEmail(randomEmail);
		bookTicket.verifyListGenders();
		bookTicket.typeInputFieldISD("381");
		bookTicket.generateNineDigitMobileNumber();
        bookTicket.insertMobileNumber();
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
	     //  String captchaSolution = solveCaptcha(captchaQuestion);
	     // bookTicket.getCaptchaQuestion();
	     //  bookTicket.fillCaptcha(captchaSolution);
	     // bookTicket.pressEnter();
		bookTicket.verifyListYes();				
		bookTicket.solveCaptchaManually1();
	    bookTicket.clickOnTheTermsAndCondition();
	    bookTicket.clickOnTheButtonRegister();
	    bookTicket.clickOnTheButtonAlertOk();
	    softAssert.assertTrue(bookTicket.verifyConfirmationMessage());
	    softAssert.assertAll(); 
	    }
	    private String solveCaptcha(String question) {
	    return "12345";
	    }
	@Test
	public void verifyDriver() {
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    String title = driver.getTitle();
	    System.out.println("Page Title: " + title);
	    assertTrue(title.contains("IRCTC Next Generation eTicketing System"));
	}
	
}

