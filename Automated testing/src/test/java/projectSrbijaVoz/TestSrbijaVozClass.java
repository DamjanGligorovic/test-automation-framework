package projectSrbijaVoz;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSrbijaVozClass extends BaseSrbijaVozClass {
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://webapi1.srbvoz.rs/ekarta/app/#!/login");
		driver.navigate().refresh();
	}
	@AfterMethod
	public void deleteCookie() {
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void testCase1() {
		String actualMessage = loginPage.verifySubtitle();
		String expectedMessage = "PRIJAVA NA SISTEM ILI REGISTRACIJA";
		assertEquals(actualMessage, expectedMessage);
	}
	@Test
	
	public void testCase2() {
		loginPage.typeFirstName("Petar");
		loginPage.typeLastName("Radanovic");
		loginPage.clickCheckboxDay();
		loginPage.clickCheckboxMonth();
		loginPage.clickCheckboxYear();
		loginPage.typePhoneNumber("0659874585");
		loginPage.typeInvalidEmail(testData.incorrectEmailInput());
		loginPage.typePassword("Felina10@");
		loginPage.clickPromoCheckbox();
		loginPage.clickInfoCheckbox();
		loginPage.clickButtonRegistration();
		assertTrue(loginPage.verifyMessageMolimoVasSacekajte(), "It is displayed message:  Molim Vas Sacekajte");
	}
	@Test
	public void testCase3() {
		SoftAssert softAssert = new SoftAssert();
		
		loginPage.clickPromoCheckbox();
		softAssert.assertTrue(loginPage.verifyPromoCheckbox(), "Promo checkbox should be ticked");
		softAssert.assertFalse(loginPage.verifyInfoCheckbox(), "Info checkbox should not be ticked");
		
		loginPage.clickInfoCheckbox();
		softAssert.assertTrue(loginPage.verifyInfoCheckbox(), "Info checkbox should be ticked");
		softAssert.assertAll();
	}
	@Test(dataProvider = "incorrectEmailData", dataProviderClass = TestSrbijaVozData.class)
	public void invalidEmailTests(String email) {
		 loginPage.typeFirstName("Petar");
		 loginPage.typeLastName("Radanovic");
		 loginPage.clickCheckboxDay();
		 loginPage.clickCheckboxMonth();
		 loginPage.clickCheckboxYear();
		 loginPage.typePhoneNumber("0659874585");
		 loginPage.typeInvalidEmail(email);
		 loginPage.typePassword("Felina10@");
		 loginPage.clickPromoCheckbox();
		 loginPage.clickInfoCheckbox();	 
		 loginPage.clickButtonRegistration();
		 assertTrue(loginPage.verifyMessageMolimoVasSacekajte(), "It is displayed message:  Molim Vas Sacekajte");
	}
}
