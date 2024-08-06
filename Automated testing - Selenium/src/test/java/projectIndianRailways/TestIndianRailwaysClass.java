package projectIndianRailways;


import static org.testng.Assert.assertEquals;
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
		bookTicket.verifyListNationality1();
		bookTicket.clickOnTheContinue();
		softAssert.assertTrue(bookTicket.verifyListOfCategories3());
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
//Booking Ticket and Login Page------------------------------------------------------------------------------
	@Test
	public void fillOutLoginFormPageAndBookTicket() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		//bookTicket.clickOnTheLinkSignInLoginPage();

	    driver.get("https://www.irctc.co.in/nget/train-search?a=1-2,570-690");
	    bookTicket.typeInputFieldFromMenu("MUMBAI CENTRAL - MMCT (MUMBAI)");
	    bookTicket.typeInputFieldToMenu("NEW DELHI - NDLS (NEW DELHI)");
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickOnTheDDMMYY();
		bookTicket.clickOnTheChosenDate();
	    bookTicket.clickOnTheButtonSearchSubmit();
	    bookTicket.clickOnTheOptionA1();
	    bookTicket.clickOnTheOptionThursdayAvailable();
	    bookTicket.clickOnTheButtonBookTicket();
	    bookTicket.clickOnTheButtonYes();
	    bookTicket.typeInputFieldUserNameLoginpage("ereeRewre34RE");
	    bookTicket.typeInputFieldPasswordLoginpage("Felina1010");
	    bookTicket.solveCaptchaManually1();
	    bookTicket.clickOnTheButtonSignIn();
	    softAssert.assertTrue(bookTicket.verifyConfirmationInfoMessage());
	    }
	@Test
	public void fillOutLoginFormPageAndBookTicket1() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
	    driver.get("https://www.irctc.co.in/nget/train-search?a=1-2,570-690");
	    bookTicket.typeInputFieldFromMenu("HYDERABAD DECAN - HYB (SECUNDERABAD)");
	    bookTicket.typeInputFieldToMenu("AHMEDABAD JN - ADI (AHMEDABAD)");
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickOnTheDDMMYY();
	   bookTicket.clickOnTheChosenDate();
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickListAllClasses();
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickListGeneralClasses();
	  //  bookTicket.clickOnTheOptionNo();

	   bookTicket.clickOnTheOptionOK();
	    String actualUrlString = driver.getCurrentUrl();
	    String expectedUrlString = "https://www.irctc.co.in/nget/train-search?a=1-2,570-690";
	    softAssert.assertEquals(actualUrlString, expectedUrlString);
			
		
	    }
	@Test
	public void fillOutLoginFormPageAndBookTicket2() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		//bookTicket.clickOnTheLinkSignInLoginPage();

	    driver.get("https://www.irctc.co.in/nget/train-search?a=1-2,570-690");
	    bookTicket.typeInputFieldFromMenu("CHENNAI EGMORE - MS (CHENNAI)");
	    bookTicket.typeInputFieldToMenu("KOLKATA - KOAA (Howrah / Kolkata)");
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickOnTheDDMMYY();
	    bookTicket.clickOnTheChosenDate1();
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickListAllClasses1();
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickListGeneralClasses();
	    bookTicket.clickOnTheButtonOK();
	    bookTicket.clickOnTheButtonSearchSubmit();
	    softAssert.assertTrue(bookTicket.verifyNegativeConfirmationMessage());
	    }
	@Test
	public void fillOutLoginFormPageAndBookTicket3() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		//bookTicket.clickOnTheLinkSignInLoginPage();

	    driver.get("https://www.irctc.co.in/nget/train-search?a=1-2,570-690");
	    bookTicket.typeInputFieldFromMenu("SURAT - ST ");
	    bookTicket.typeInputFieldToMenu("PUNE JN - PUNE (PUNE)");
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickOnTheDDMMYY();
	    bookTicket.clickOnTheChosenDate2();
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickListAllClasses2();
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickListGeneralClasses3();
	   // bookTicket.clickOnTheButtonOK();
	    bookTicket.clickOnTheButtonSearchSubmit();
	    softAssert.assertTrue(bookTicket.verifyNegativeConfirmationMessage());
	    }
	@Test
	public void fillOutLoginFormPageAndBookTicket4() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		//bookTicket.clickOnTheLinkSignInLoginPage();

	    driver.get("https://www.irctc.co.in/nget/train-search?a=1-2,570-690");
	    bookTicket.typeInputFieldFromMenu("JAIPUR - JP (JAIPUR)");
	    bookTicket.typeInputFieldToMenu("LUCKNOW NR - LKO (LUCKNOW)");
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickOnTheDDMMYY();
	    bookTicket.clickOnTheChosenDate3();
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickListAllClasses3();
	    bookTicket.clickOnTheRandomClick();
	    bookTicket.clickListGeneralClasses4();
	    bookTicket.clickOnTheButtonOK();
	    bookTicket.clickOnTheButtonSearchSubmit();
	    //bookTicket.clickOnTheOptionSL();
	   // bookTicket.clickOnTheOptionMonday();
	   // bookTicket.clickOnTheButtonBookTicket();
	   // bookTicket.clickOnTheButtonYes();
	    //bookTicket.typeInputFieldUserNameLoginpage("ereeRewre34RE");
	   // bookTicket.typeInputFieldPasswordLoginpage("Felina1010");
	   // bookTicket.solveCaptchaManually1();
	   // bookTicket.clickOnTheButtonSignIn();
	    softAssert.assertTrue(bookTicket.verifyNegativeConfirmationMessage());

	    }
	@Test
	public void verifyChartTrainBookingSystem() {
	    driver.get("https://www.irctc.co.in/nget/train-search?a=1-2,570-690");
		bookTicket.clickOnTheCharts("MUMBAI");
		bookTicket.typeInputTrainName("MUMBAI");
		bookTicket.verifyInputTrainName1();
        bookTicket.typeIntoTheFieldBoardingStation("HARDA");
		bookTicket.clickOnTheGetTrainChart();
		assertTrue(bookTicket.verifyReservation());
		//End test
	}
	
	public void verifyDriver() {
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    String title = driver.getTitle();
	    System.out.println("Page Title: " + title);
	    assertTrue(title.contains("IRCTC Next Generation eTicketing System"));
	}
	
}

