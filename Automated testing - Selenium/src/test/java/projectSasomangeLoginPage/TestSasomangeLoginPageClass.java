package projectSasomangeLoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestSasomangeLoginPageClass extends BaseTestLoginPageClass {
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://sasomange.rs/uloguj-se");
		driver.navigate().refresh();
	}

	@Test(priority = 2)
	public void testCase1() {
		SoftAssert softAssert = new SoftAssert();
		loginPage.typeEmail("damjanserbia123@gmail.com");
		loginPage.typePassword("Felina10@");
		loginPage.checkToggleButton();
		loginPage.clickOnTheButtonPrijaviSe();
		softAssert.assertTrue(loginPage.message());
		String actualString =	loginPage.getCurrentUrl();
		String expectedUrlString = "https://sasomange.rs/";
		softAssert.assertEquals(actualString, expectedUrlString);
		String actualString2 = loginPage.getCurrentTitle();
		String expectedTitleString = "Oglasi | Nekretnine, Market, Auto-moto";
		softAssert.assertEquals(actualString2, expectedTitleString);
		String actualColorString = loginPage.colorGreen();
		String expectedString = "oklch(0.753771 0.169516 137.027)";
		softAssert.assertEquals(actualColorString, expectedString);
		softAssert.assertAll();
	}
	@Test(priority = 1)
	public void testCase2() {
		loginPage.clickOnTheButtonNesecasSe();
		loginPage.typeImejl("damjanserbia123@gmail.com");
		loginPage.clickOnTheButtonPosaljiOpet();
		assertTrue(loginPage.confirmationMessage());
	}
	
	@Test(dataProvider = "incorrectSasomangePassword", dataProviderClass = TestSasomangeData.class)
	public void invalidSasomangePassword(String password) {
		loginPage.typeEmail("damjanserbia123@gmail.com");
		loginPage.typePassword(password);
	}
	@Test
	public void forgetPassword() {
		loginPage.clickOnTheButtonNesecasSe();
		loginPage.typeImejl("xawim32532@aersm.com");
		loginPage.clickOnTheButtonPosaljiOpet();
	}
	@Test
	public void leaveAllAndClick() {
		loginPage.clickOnTheButtonPrijaviSe();
		assertTrue(loginPage.ovoJePoljeObavezno());
	}
	
}