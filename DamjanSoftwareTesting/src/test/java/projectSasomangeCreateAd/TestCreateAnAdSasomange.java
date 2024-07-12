package projectSasomangeCreateAd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCreateAnAdSasomange extends BaseCreateAnAdSasomange {
	WebDriverWait wait;
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://sasomange.rs/uloguj-se");
		loginPage.setUpLoginPasswordUsername("damjanserbia123@gmail.com", "Felina10@");
	    wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	}
	@AfterMethod
	public void deleteCookie() {
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void testCase1() {
		SoftAssert softAssert = new SoftAssert();

		loginPage.clickOnTheButtons();
		softAssert.assertTrue(loginPage.getElementsList());
		softAssert.assertTrue(loginPage.getElementsList());
		loginPage.clickOnTheButtonVozila();
		loginPage.clickOnTheButtonAutomobili();
		loginPage.clickOnTheButtonPolovniAutomobili();
		loginPage.clickOnTheButtonNastavi();
        softAssert.assertAll();

	}
	@Test
	
	public void testCase2() {
		SoftAssert softAssert = new SoftAssert();

		loginPage.clickOnTheButtons();
		softAssert.assertTrue(loginPage.getElementsList());
		softAssert.assertTrue(loginPage.getElementsList());
		loginPage.clickOnTheButtonVozila();
		loginPage.clickOnTheButtonAutomobili();
		loginPage.clickOnTheButtonPolovniAutomobili();
		loginPage.clickOnTheButtonNastavi();
		loginPage.testYoutubeFunction("https://www.youtube.com/watch?v=7Fl8T1w2kcA&list=RDUye00xO9ZQo&index=4");
		loginPage.buttonYoutubeElement();
        softAssert.assertAll();

	}
	@Test
	public void testCase3() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.clickOnTheButtons();
		softAssert.assertTrue(loginPage.getElementsList());
		softAssert.assertTrue(loginPage.getElementsList());
		loginPage.clickOnTheButtonVozila();
		loginPage.clickOnTheButtonAutomobili();
		loginPage.clickOnTheButtonPolovniAutomobili();
		loginPage.clickOnTheButtonNastavi();
		softAssert.assertTrue(loginPage.getElementsList1());
		softAssert.assertFalse(loginPage.getElementsList2());
		String filePath = "C:\\Users\\Damja\\Downloads\\photo Damjan 2.jpg";
		String filePath1 = "C:\\Users\\Damja\\Downloads\\1.jpg";
		String filePath2 = "C:\\Users\\Damja\\Downloads\\2.png";
		String filePath3 = "C:\\Users\\Damja\\Downloads\\photoThree.jpg";
		String filePath4 = "C:\\Users\\Damja\\Downloads\\photoFour.jpg";
		String filePath5 = "C:\\Users\\Damja\\Downloads\\photoFive.jpg";
		String filePath6 = "C:\\Users\\Damja\\Downloads\\photoSix.jpg";
		String filePath7 = "C:\\Users\\Damja\\Downloads\\photoSeven.jpg";
		String filePath8 = "C:\\Users\\Damja\\Downloads\\photoEight.jpg";		
		loginPage.uploadPhoto(filePath);
		loginPage.uploadPhoto2(filePath1);
		loginPage.uploadPhoto2(filePath2);
		loginPage.uploadPhoto2(filePath3);
		loginPage.uploadPhoto2(filePath4);
		loginPage.uploadPhoto2(filePath5);
		loginPage.uploadPhoto2(filePath6);
		loginPage.uploadPhoto2(filePath7);
		loginPage.uploadPhoto4(filePath8);
		softAssert.assertTrue(loginPage.verifyErrorMessages(), "The error message is not displayed.");
	}
	
		//softAssert.assertTrue(loginPage.verifyModelMenu());
		//loginPage.clickOnModelOption();
		//softAssert.assertTrue(loginPage.verifyModelGorivo());
		
		}
	




