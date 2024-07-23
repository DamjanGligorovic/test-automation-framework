package projectSasomangeRegistrationPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestRegistrationSasomangeClass extends BaseTestSasomangeRegistration{
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://sasomange.rs/registracija");
		driver.navigate().refresh();
	}
	@AfterMethod
	public void deleteCookie() {
		driver.manage().deleteAllCookies();
	}
	@Test
	public void testCase1() {
		loginPage.typeEmail("dotanil508@comsb.com");
		loginPage.typePassword("Abrakad1");
		loginPage.clickOnTheCheckbox();
		loginPage.clickOnTheButtonRegistrujse();
	}
	@Test
	public void testCase2() {
		loginPage.typeEmail("pekalo2893@bizatop.com");
		loginPage.typePassword("Ab @#$%^2");
		loginPage.clickOnTheCheckbox();
		loginPage.clickOnTheButtonRegistrujse();
	}
	@Test
	public void testCase3() {
		loginPage.clickOnTheLinkPravila();
	}
	@Test
	public void testCase4() {
		loginPage.clickOnTheLinkPolitiku();
	}
	@Test
	public void testCase5() {
		loginPage.clickOnTheLinkPrijaviSe();
	}
	@Test(dataProvider = "incorrectSasomangeEmail", dataProviderClass = TestSasomangeEmailData.class)
	public void testCase6(String email) {
		loginPage.typeEmail(email);	
		loginPage.typePassword("Felina10");
		loginPage.clickOnTheCheckbox();
		loginPage.clickOnTheButtonRegistrujse();

	}
	@Test(dataProvider = "incorrectSasomangePassword", dataProviderClass = TestSasomangeData.class)
	public void testCase7(String password) {
		loginPage.typeEmail("pekalo2893@bizatop.com");	
		loginPage.typePassword(password);
		loginPage.clickOnTheCheckbox();
		loginPage.clickOnTheButtonRegistrujse();

	}
	@Test
	public void testCase9() {
		loginPage.typeEmail("pepadek918@comsb.com");
		loginPage.typePassword("Katjusa1");
		loginPage.clickOnTheButtonRegistrujse();
	}
	@Test
	public void testCase10() {
		loginPage.clickOnTheButtonRegistrujse();
	}
}
