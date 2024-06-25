package projectPCPress;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestPCPressClass extends BaseTestPCPressClass {
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://pcpress.rs/prodavnica/index.php");
		driver.navigate().refresh();
	}
	@AfterMethod
	public void deleteCookie() {
		driver.manage().deleteAllCookies();
	}
	@Test
	public void testCase1() {
		SoftAssert softAssert = new SoftAssert();
		bookPage.clickOnTheButtonCheckbox();
		bookPage.clickOnTheButtonKupujem();
		bookPage.typeIntoTheFieldImeIPrezime("D g");
		bookPage.typeIntoTheFieldUlicaIBroj("K 10");
		bookPage.typeIntoTheFieldPostanskiBroj("18000");
		bookPage.typeIntoTheFieldGrad("Nis");
		bookPage.typeIntoTheFieldTelefon("060168335");
		bookPage.typeIntoTheFieldEmail("damjangligorovic@hotmail.com");
		bookPage.clickOnTheButtonNarucujem();
		String actualUrlString = bookPage.getCurrentUrl();
		String expectedUrlString = "https://pcpress.rs/prodavnica/naruceno.php";
		softAssert.assertEquals(actualUrlString, expectedUrlString);
		softAssert.assertFalse(bookPage.verifyGreskaElement());
		softAssert.assertAll();
	}

@Test
public void testCase2() {
	SoftAssert softAssert = new SoftAssert();
	bookPage.clickOnTheButtonCheckbox2();
	bookPage.typeIntoTheFieldKolicina("00");
	bookPage.clickOnTheButtonKupujem();
	bookPage.typeIntoTheFieldImeIPrezime("Nikola Markovic timotijevic Jovanovic Rankovic");
	bookPage.typeIntoTheFieldUlicaIBroj("Djordja Andrejevica Kuna 22 sprat 18/3! kuca gornji");
	bookPage.typeIntoTheFieldPostanskiBroj("11000");
	bookPage.typeIntoTheFieldGrad("Beograd");
	bookPage.typeIntoTheFieldTelefon("0635867412");
	bookPage.typeIntoTheFieldEmail("Tt10bbahoo@gmail.com");
	bookPage.typeIntoTheFieldNapomena("Notice for purchasing. Purchases will not be taken from your account until you confirm your order. $$$$ requires a ready cash deposit. View details. Valid for 36 hours, all sales are final! Q-Cup Air Vaporizer $175.00 Add to cart. Disclosure: Alpha Organics was generous enough to provide me with product for an honest review. All opinions are 100% my own. And this product also qualifies for the blogger discount :D In the few hours I had it, I was able to give it a very brief test drive. It seemed fairly easy to accept.");
	bookPage.clickOnTheButtonNarucujem();
	String actualUrlString = bookPage.getCurrentUrl();
	String expectedUrlString = "https://pcpress.rs/prodavnica/naruceno.php";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
	softAssert.assertFalse(bookPage.verifyGreskaElement());
	softAssert.assertAll();
}
@Test
public void testCase3() {
	SoftAssert softAssert = new SoftAssert();
	bookPage.clickOnTheButtonCheckbox3();
	bookPage.typeIntoToTheFieldKolicina15("2");
	bookPage.clickOnTheButtonKupujem();
	bookPage.typeIntoTheFieldImeIPrezime("Milica Timotijevic Rankovic");
	bookPage.typeIntoTheFieldUlicaIBroj("12. Aprila Savica Marka");
	bookPage.typeIntoTheFieldPostanskiBroj("21000");
	bookPage.typeIntoTheFieldGrad("Novi Sad");
	bookPage.typeIntoTheFieldTelefon("3256985479");
	bookPage.typeIntoTheFieldEmail("vj507aws3c@hotmail.com ");
	bookPage.clickOnTheButtonNarucujem();
	String actualUrlString = bookPage.getCurrentUrl();
	String expectedUrlString = "https://pcpress.rs/prodavnica/naruceno.php";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
	softAssert.assertTrue(bookPage.verifyActualElement());
	softAssert.assertAll();
}
@Test
public void testCase4() {
	SoftAssert softAssert = new SoftAssert();

	bookPage.clickOnTheButtonCheckbox4();
	bookPage.typeIntoTheFieldKolicina4("99");
	bookPage.clickOnTheButtonKupujem();
	bookPage.typeIntoTheFieldImeIPrezime("Lavra Kovac Timic");
	bookPage.typeIntoTheFieldUlicaIBroj("Obrenoviceva 19a sedmi sprat");
	bookPage.typeIntoTheFieldPostanskiBroj("34000");
	bookPage.typeIntoTheFieldGrad("Kragujevac");
	bookPage.typeIntoTheFieldTelefon("9854748714");
	bookPage.typeIntoTheFieldEmail("gqd0$#$#$#$usn3hb@secretmail.net");
	bookPage.clickOnTheButtonNarucujem();
	String actualUrlString = bookPage.getCurrentUrl();
	String expectedUrlString = "https://pcpress.rs/prodavnica/naruceno.php";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
	softAssert.assertTrue(bookPage.verifyActualElement());
	softAssert.assertAll();
}
@Test
public void testCase5() {
	SoftAssert softAssert = new SoftAssert();
	bookPage.clickOnTheButtonCheckbox5();
	bookPage.clickOnTheOption37();
	bookPage.clickOnTheButtonKupujem();
	bookPage.typeIntoTheFieldImeIPrezime("Nikola Stojicic Avramovic Nedic");
	bookPage.typeIntoTheFieldUlicaIBroj("Lazar Savkovic 230aa");
	bookPage.typeIntoTheFieldPostanskiBroj("24000");
	bookPage.typeIntoTheFieldGrad("Subotica");
	bookPage.typeIntoTheFieldTelefon("8574145425");
	bookPage.typeIntoTheFieldEmail("lovrenkrsmanovic@yahoo.com");
	bookPage.clickOnTheButtonNarucujem();
	String actualUrlString = bookPage.getCurrentUrl();
	String expectedUrlString = "https://pcpress.rs/prodavnica/naruceno.php";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
	softAssert.assertTrue(bookPage.verifyActualElement());
	softAssert.assertAll();
}
@Test
public void testCase6() {
	SoftAssert softAssert = new SoftAssert();
	bookPage.clickOnTheButtonCheckbox();
	bookPage.clickOnTheButtonCheckbox6();
	bookPage.clickOnTheOption267();
	bookPage.clickOnTheButtonKupujem();
	bookPage.typeIntoTheFieldImeIPrezime("Tatjana Stancic Lazarovic");
	bookPage.typeIntoTheFieldUlicaIBroj("Grcko Prijateljstvo 212bb treci sprat");
	bookPage.typeIntoTheFieldPostanskiBroj("26300");
	bookPage.typeIntoTheFieldGrad("Vrsac");
	bookPage.typeIntoTheFieldTelefon("6567471282");
	bookPage.typeIntoTheFieldEmail("printcompany22@gmail.com");
	bookPage.clickOnTheButtonNarucujem();
	String actualUrlString = bookPage.getCurrentUrl();
	String expectedUrlString = "https://pcpress.rs/prodavnica/naruceno.php";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
	softAssert.assertTrue(bookPage.verifyActualElement());
	softAssert.assertAll();
}
@Test
public void testCase7() {
	SoftAssert softAssert = new SoftAssert();
	bookPage.clickOnTheIconLogo();
	String actualUrlString = bookPage.getCurrentUrl();
	String expectedUrlString = "https://pcpress.rs/";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
	softAssert.assertAll();
}
@Test
public void testCase8() {
	SoftAssert softAssert = new SoftAssert();
	bookPage.clickOnTheIconFeed();
	String actualUrlString = bookPage.getCurrentUrl();
	String expectedUrlString = "https://pcpress.rs/feed/";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
	softAssert.assertAll();
}
@Test(priority = 9)
public void testCase9() {
	SoftAssert softAssert = new SoftAssert();
	WebElement pcFooterElement = driver.findElement(By.cssSelector("img[alt='PC Online']"));
    pcFooterElement.click();
    String actualUrlString = driver.getCurrentUrl();
	String expectedUrlString = "https://pcpress.rs/";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
	String actualTitleString = driver.getTitle();
	 String expectedTitleString = "PC Press - Business & ICT News";
	 softAssert.assertEquals(actualTitleString, expectedTitleString);
	driver.navigate().refresh();
	 softAssert.assertAll();
}
@Test(priority = 10)
public void testCase10() {
SoftAssert softAssert = new SoftAssert();
bookPage.clickOnTheIconNewsletter();
String actualUrlString= driver.getCurrentUrl();
String expectedUrlString = "https://pcpress.rs/newsletter/";
softAssert.assertEquals(actualUrlString, expectedUrlString, "The URL of the new tab does not match the expected URL.");
String actualTitle = driver.getTitle();
String expectedTitle = "403 Forbidden";
softAssert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
WebElement actualElement1 = driver.findElement(By.cssSelector("body > h1"));
String  actualmessageString1 = actualElement1.getText();
String expectedMessage1 = "Forbidden";
softAssert.assertEquals(actualmessageString1, expectedMessage1, "Error message appears");
WebElement actualElement = driver.findElement(By.cssSelector("body > p"));
String  actualmessageString = actualElement.getText();
String expectedMessage = "You don't have permission to access /newsletter/ on this server.";
softAssert.assertEquals(actualmessageString, expectedMessage, "Error message appears");

}
@Test(priority = 11)
public void testCase11() {
	SoftAssert softAssert = new SoftAssert();
bookPage.clickOnTheIconFacebook();
    String actualUrlString = driver.getCurrentUrl();
	String expectedUrlString = "https://www.facebook.com/PCPress.rs/";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
	
	softAssert.assertAll();
}
@Test(priority = 13)
public void testCase13() {
	SoftAssert softAssert = new SoftAssert();
	bookPage.clickOnTheLinkPravilaKoriscenja();
	String actualUrlString = driver.getCurrentUrl();
	String expectedUrlString = "https://pcpress.rs/pravila-koriscenja-sajta/";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
	String actualTitle = driver.getTitle();
	String expectedTitle = "Pravila korišćenja sajta | PC Press";
	softAssert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
	WebElement actualElement = driver.findElement(By.cssSelector(".entry-content.clearfix > h2:nth-child(1)"));
	String  actualmessageString = actualElement.getText();
	String expectedMessage = "Uslovi korišćenja";
	softAssert.assertEquals(actualmessageString, expectedMessage);
    softAssert.assertAll();

}
@Test(priority = 14)
public void testCase14() {
	SoftAssert softAssert = new SoftAssert();
	bookPage.clickOnTheButtonCheckbox7();
    bookPage.clickOnTheButtonKupujem();
    bookPage.typeIntoTheFieldImeIPrezime("Stojan Nikolic Andrejic");
	bookPage.typeIntoTheFieldUlicaIBroj("Niska 22");
	bookPage.typeIntoTheFieldPostanskiBroj("24300");
	bookPage.typeIntoTheFieldGrad("Backa Topola");
	bookPage.typeIntoTheFieldTelefon("433903430");
	bookPage.typeIntoTheFieldEmail("tatjanah21ero@gmail.com");
	bookPage.clickOnTheButtonNarucujem();
	bookPage.clickOnTheLinkProdavnica();
    String actualUrlString = driver.getCurrentUrl();
	String expectedUrlString = "https://prodavnica.pcpress.rs/";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
   
    softAssert.assertAll();
}
@Test(priority = 15)
public void testCase15() {
	SoftAssert softAssert = new SoftAssert();
	bookPage.clickOnTheButtonCheckbox8();
    bookPage.clickOnTheButtonKupujem();
    bookPage.typeIntoTheFieldImeIPrezime("Milenko Hranic Panic");
	bookPage.typeIntoTheFieldUlicaIBroj("Backa 32");
	bookPage.typeIntoTheFieldPostanskiBroj("11431");
	bookPage.typeIntoTheFieldGrad("Bac");
	bookPage.typeIntoTheFieldTelefon("9454594023");
	bookPage.typeIntoTheFieldEmail("lanahranislavicskdfhsk@yahoo.com");
	bookPage.clickOnTheButtonNarucujem();
	bookPage.clickOnThProdaja();
    String actualUrlString = driver.getCurrentUrl();
	String expectedUrlString = "https://pcpress.rs/prodavnica/naruceno.php";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
   
    softAssert.assertAll();
}
@Test(priority = 16)
public void testCase16() {
	SoftAssert softAssert = new SoftAssert();
	bookPage.clickOnTheButtonCheckbox9();
    bookPage.clickOnTheButtonKupujem();
    bookPage.typeIntoTheFieldImeIPrezime("Andjelka Lankovic Svetislavic");
	bookPage.typeIntoTheFieldUlicaIBroj("Backa 32");
	bookPage.typeIntoTheFieldPostanskiBroj("36601");
	bookPage.typeIntoTheFieldGrad("Vrbas");
	bookPage.typeIntoTheFieldTelefon("9403303584");
	bookPage.typeIntoTheFieldEmail("daliborlankovic545@yahoo.com");
	bookPage.clickOnTheButtonNarucujem();
	bookPage.clickOnThePCProdavnica();
    String actualUrlString = driver.getCurrentUrl();
	String expectedUrlString = "https://pcpress.rs/prodavnica/index.php";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
   
    softAssert.assertAll();
}
@Test(priority = 17)
public void testCase17() {
	SoftAssert softAssert = new SoftAssert();
	bookPage.clickOnTheButtonCheckbox();
    bookPage.clickOnTheButtonKupujem();
    bookPage.typeIntoTheFieldImeIPrezime("Svetlana Krivokapic Aleksic");
	bookPage.typeIntoTheFieldPostanskiBroj("11512");
	bookPage.typeIntoTheFieldGrad("Backi Petrovac");
	bookPage.typeIntoTheFieldTelefon("493043493");
	bookPage.typeIntoTheFieldEmail("monakovics2323@yahoo.com");
	bookPage.clickOnTheButtonNarucujem();
	bookPage.clickOnTheLinkPovratak();
    String actualUrlString = driver.getCurrentUrl();
	String expectedUrlString = "https://pcpress.rs/prodavnica/index.php";
	softAssert.assertEquals(actualUrlString, expectedUrlString);
   
    softAssert.assertAll();
}
@Test(priority = 18)
public void testCase18() {
bookPage.clickOnTheButtonCheckbox();
bookPage.clickOnTheButtonKupujem();
bookPage.clickOnTheLinkOdustajem();
}
@Test(priority = 19)
public void testCase19() {
bookPage.clickOnTheButtonCheckbox();
bookPage.clickOnTheButtonKupujem();
bookPage.clickOnTheXButton();
}
@Test(dataProvider  = "incorrectKolicinaData", dataProviderClass = TestPCPressData.class)
public void testCase20(String amount1) {
bookPage.clickOnTheButtonCheckbox();
bookPage.typeIntoToTheFieldKolicina1(amount1);

bookPage.clickOnTheButtonKupujem();
bookPage.typeIntoTheFieldImeIPrezime("Marinko Matic Roksandovic");
	bookPage.typeIntoTheFieldUlicaIBroj("Kuna 32");
	bookPage.typeIntoTheFieldPostanskiBroj("11000");
	bookPage.typeIntoTheFieldGrad("Beograd");
	bookPage.typeIntoTheFieldTelefon("4930405405");
	bookPage.typeIntoTheFieldEmail("rgerjgleovics2323@yahoo.com");
	bookPage.clickOnTheButtonNarucujem();
}
@Test(priority = 21)
public void testCase21() {
bookPage.clickOnTheButtonCheckbox10();
bookPage.clickOnTheOption310();
bookPage.clickOnTheButtonKupujem();
bookPage.typeIntoTheFieldImeIPrezime("Darko Aleksandrovic Marinkovic");
bookPage.typeIntoTheFieldUlicaIBroj("Karla Marksa 21");
bookPage.typeIntoTheFieldPostanskiBroj("18000");
bookPage.typeIntoTheFieldGrad("Nis");
bookPage.typeIntoTheFieldTelefon("43403940343");
bookPage.typeIntoTheFieldEmail("fjrlejelgewf@yahoo.com");
bookPage.clickOnTheButtonNarucujem();
assertTrue(bookPage.verifyActualElement());
}
@Test(priority = 22)
public void testCase22() {

bookPage.clickOnTheButtonKupujem();

assertTrue(bookPage.verifyGreska());
}
@Test(dataProvider  = "incorrectName", dataProviderClass = TestPCPressSubData.class)
public void testCase23(String name) {
bookPage.clickOnTheButtonCheckbox();
bookPage.clickOnTheButtonKupujem();
bookPage.typeIntoTheFieldImeIPrezime(name);
bookPage.typeIntoTheFieldUlicaIBroj("Cegarska 332");
bookPage.typeIntoTheFieldPostanskiBroj("11000");
bookPage.typeIntoTheFieldGrad("Beograd");
bookPage.typeIntoTheFieldTelefon("43043832938");
bookPage.typeIntoTheFieldEmail("fjelsfjl4930s2323@yahoo.com");
bookPage.clickOnTheButtonNarucujem();

}
@Test(dataProvider  = "incorrectUlicaIBroj", dataProviderClass = TestPCPressUlicaIBrojData.class)
public void testCase24(String ulicaibroj) {
bookPage.clickOnTheButtonCheckbox();
bookPage.clickOnTheButtonKupujem();
bookPage.typeIntoTheFieldImeIPrezime("Damjan Gligorovic");

bookPage.typeIntoTheFieldUlicaIBroj(ulicaibroj);
bookPage.typeIntoTheFieldPostanskiBroj("18000");
bookPage.typeIntoTheFieldGrad("Nis");
bookPage.typeIntoTheFieldTelefon("32483948394");
bookPage.typeIntoTheFieldEmail("fdksfshfkff3@yahoo.com");
bookPage.clickOnTheButtonNarucujem();

}
@Test(dataProvider  = "incorrectEmail", dataProviderClass = TestPCPressEmailData.class)
public void testCase25(String email) {
bookPage.clickOnTheButtonCheckbox();
bookPage.clickOnTheButtonKupujem();
bookPage.typeIntoTheFieldImeIPrezime("Damjan Gligorovic");

bookPage.typeIntoTheFieldUlicaIBroj("Cvijiceva 43");
bookPage.typeIntoTheFieldPostanskiBroj("18000");
bookPage.typeIntoTheFieldGrad("Nis");
bookPage.typeIntoTheFieldTelefon("490359232");
bookPage.typeIntoTheFieldEmail(email);
bookPage.clickOnTheButtonNarucujem();

}
@Test(priority = 26)
public void testCase26() {
bookPage.clickOnTheButtonCheckbox();
bookPage.clickOnTheButtonKupujem();
bookPage.clickOnTheButtonNarucujem();
bookPage.verifyGreskaElement();
}

@Test (dataProvider  = "incorrectTelefon", dataProviderClass = TestPCPressTelefonData.class)

public void testCase27(String telefon) {
bookPage.clickOnTheButtonCheckbox11();

bookPage.clickOnTheButtonKupujem();
bookPage.typeIntoTheFieldImeIPrezime("Stefan Rancic Kozomaric");
bookPage.typeIntoTheFieldUlicaIBroj("Grcka 45");
bookPage.typeIntoTheFieldPostanskiBroj("18000");
bookPage.typeIntoTheFieldGrad("Nis");
bookPage.typeIntoTheFieldTelefon(telefon);
bookPage.typeIntoTheFieldEmail("damjanko32@yahoo.com");
bookPage.clickOnTheButtonNarucujem();

}
}