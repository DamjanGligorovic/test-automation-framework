package projectSrbijaVoz;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTestClass extends BaseIITestSrbijaVozClass {
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://webapi1.srbvoz.rs/ekarta/app/#!/home");
		driver.navigate().refresh();
	}
	@AfterMethod
	public void deleteCookie() {
		driver.manage().deleteAllCookies();
	}
	@Test
	public void testCase1() {
		homePage.typeTextInTheFieldStanicaOD("be");
		homePage.chooseBeogradProkop();
		homePage.typeTextInTheFieldStanicaDO("no");
		homePage.chooseNoviSad();
		homePage.clickOnTheCalendarIcon();
		homePage.clickOnTheRightDart();
		homePage.clickOnTheFirstDay();
		homePage.clickOnTheButtonTrazi();
		homePage.clickOnTheButtonIzaberi();
		String expectedColorString ="rgba(14, 136, 12, 1)";
		String actualColor = homePage.verifyBackgroundColor();
		assertEquals(expectedColorString, actualColor);
		homePage.clickOnTheButtonDalje();
		assertTrue(homePage.verifySubtitlePrijava(), "The subtitle contains the text Prijavi se on the next page");
	}
}