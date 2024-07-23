package projectPCPress;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PCPress_LoginClass {
	WebDriver driver;
	Actions actions;
	WebDriverWait wait;
	@FindBy(id = "arselektor1")
	WebElement checkbox1;
	@FindBy (id = "arselektor0")
	WebElement checkbox2;
	@FindBy (id= "arselektor15")
	WebElement checkbox3;
	@FindBy (id = "arselektor4")
	WebElement checkbox4;
	@FindBy (css = "input[value='9']")
	WebElement checkbox5;
	@FindBy (css = "input[value='7']")
	WebElement checkbox6;
	@FindBy (id = "arselektor9")
	WebElement checkbox7;
	@FindBy (id = "arselektor10")
	WebElement checkbox8;
	@FindBy (id = "arselektor12")
	WebElement checkbox9;
	@FindBy(css = "input[value='6']")
	WebElement checkbox10;
	@FindBy(id = "arselektor4")
	WebElement checkbox11;
	@FindBy (css = "option[value='ar_6_310']")
	WebElement option310;
	@FindBy (css = "option[value='ar_9_37']")
	WebElement optionValue37;
	@FindBy (css = "img[alt='PC Online']")
	WebElement footerElement;
	@FindBy (css = "#pratiteNas > a:nth-child(4)")
	WebElement newsletterElement;
	@FindBy (css = "#pratiteNas > a:nth-child(2)")
	WebElement facebookElement;
	@FindBy (css = "#pratiteNas > a:nth-child(1)")
	WebElement twitterElement;
	@FindBy (css = "a[href='https://pcpress.rs/pravila-koriscenja-sajta/")
	WebElement pravilaKoriscenjaElement;
	@FindBy (css = "option[value='ar_7_267']")
	WebElement optionValue267;
	@FindBy (id = "kolselektor4")
	WebElement kolicinaField4;
	@FindBy (css = "#doubleprovera > a")
	WebElement pCProdavnicaElement;
	@FindBy (id = "kolselektor15")
	WebElement kolicina15FieldElement;
	@FindBy(css= "[alt=\"Submit\"]")
	WebElement kupujemButton;
	@FindBy (id = "kolselektor0")
	WebElement inputField_Kolicina;
	@FindBy(id= "kolselektor1")
	WebElement inputField_KolicinaElement1;
	@FindBy (css = "textarea[name='napomena']")
	WebElement napomenaField;
	@FindBy(css ="input[name='ime']")
	WebElement input_FieldIme;
	@FindBy(css = "textarea[name='adresa']")
	WebElement input_FieldUlicaIBroj;
	@FindBy(css = "input[name='postbroj']")
	WebElement input_FieldPostBroj;
	@FindBy(css = "input[name='grad']")
	WebElement input_FieldGrad;
	@FindBy(css= "input[name='telefon']")
	WebElement input_FieldTelefon;
	@FindBy(css = "input[name='email']")
	WebElement input_FieldEmail;
	@FindBy(css = "#korisnik > tbody > tr:nth-child(7) > td > input[type=submit]:nth-child(2)")
	WebElement buttonNarucujem;
	@FindBy (css = "td.zauplatu u")
	WebElement actualElement;
	@FindBy (css = "#doubleprovera span:nth-child(1)")
	WebElement greskaElement;
	@FindBy (css = "#proverainside > p > span ")
	WebElement greska1Element;
	@FindBy (css = ".zauplatu u")
	WebElement podaciZaUplatu;
	@FindBy (id = "logo")
	WebElement logoIcon;
	@FindBy (css = "#pratiteNas > a:nth-child(3)")
	WebElement feedIconElement;
	@FindBy (css = " td:nth-child(1) > a")
	WebElement linkProdavnicaElement;
	@FindBy (css = " td:nth-child(2) > a")
	WebElement emailFormLinkProdajaElement;
	@FindBy (css = "#doubleprovera > a")
	WebElement povratakLinkProdavnicaElement;
	@FindBy(css= "input[value='Odustajem']")
	WebElement odustajemElement;
	@FindBy (css = "img[onclick='skloniPorudzbenicu()']")
	WebElement xElement;
	
	public PCPress_LoginClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));	
	}
	public void clickOnTheButtonCheckbox() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox1)).click();
	}
	public void clickOnTheButtonCheckbox2() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox2)).click();
	}
	public void clickOnTheButtonCheckbox3() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox3)).click();
}
	public void clickOnTheButtonCheckbox4() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox4)).click();
	}
	public void clickOnTheButtonCheckbox5() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox5)).click();
	}
	public void clickOnTheButtonCheckbox6() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox6)).click();
	}
	public void clickOnTheButtonCheckbox7() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox7)).click();
	}
	public void clickOnTheButtonCheckbox8() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox8)).click();
	}
	public void clickOnTheButtonCheckbox9() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox9)).click();
	}
	public void clickOnTheButtonCheckbox10() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox10)).click();
	}
	public void clickOnTheButtonCheckbox11() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox11)).click();
	}
	
	public void clickOnTheOption310() {
		wait.until(ExpectedConditions.elementToBeClickable(option310)).click();
	}
	
	public void clickOnThePCProdavnica() {
		wait.until(ExpectedConditions.elementToBeClickable(pCProdavnicaElement)).click();
	}
	public void clickOnThProdaja() {
		wait.until(ExpectedConditions.elementToBeClickable(emailFormLinkProdajaElement)).click();
	}
	public void clickOnTheLinkProdavnica() {
		wait.until(ExpectedConditions.elementToBeClickable(linkProdavnicaElement)).click();
	}
	public void clickOnTheIconLogo() {
		wait.until(ExpectedConditions.elementToBeClickable(logoIcon)).click();
	}
	public void clickOnTheIconFeed() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", feedIconElement);

		wait.until(ExpectedConditions.elementToBeClickable(feedIconElement)).click();
	}
	public void clickOnTheIconFooter() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", footerElement);

		wait.until(ExpectedConditions.elementToBeClickable(footerElement)).click();
	}
	public void clickOnTheIconNewsletter() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", newsletterElement);

		wait.until(ExpectedConditions.elementToBeClickable(newsletterElement)).click();
	}
	public void clickOnTheIconFacebook() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", facebookElement);

		wait.until(ExpectedConditions.elementToBeClickable(facebookElement)).click();
	}
	public void clickOnTheIconTwitter() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", twitterElement);

		wait.until(ExpectedConditions.elementToBeClickable(twitterElement)).click();
	}
	public void clickOnTheLinkPravilaKoriscenja() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", pravilaKoriscenjaElement);

		wait.until(ExpectedConditions.elementToBeClickable(pravilaKoriscenjaElement)).click();
	}
	public void clickOnTheOption37() {
		wait.until(ExpectedConditions.elementToBeClickable(optionValue37)).click();
	}
	public void clickOnTheOption267() {
		wait.until(ExpectedConditions.elementToBeClickable(optionValue267)).click();
	}
	
	public void typeIntoTheFieldKolicina4(String amount) {
		
		wait.until(ExpectedConditions.visibilityOf(kolicinaField4)).clear();
		kolicinaField4.sendKeys(amount);
		wait.until(ExpectedConditions.textToBePresentInElementValue(kolicinaField4, amount));

	}
	public void clickOnTheButtonKupujem() {
		wait.until(ExpectedConditions.elementToBeClickable(kupujemButton)).click();
	}
	public void typeIntoTheFieldKolicina(String amount) {
		wait.until(ExpectedConditions.visibilityOf(inputField_Kolicina)).clear();
		inputField_Kolicina.sendKeys(amount);
		wait.until(ExpectedConditions.textToBePresentInElementValue(inputField_Kolicina, amount));
	}
	public void typeIntoTheFieldNapomena(String text) {
		wait.until(ExpectedConditions.visibilityOf(napomenaField)).clear();
		napomenaField.sendKeys(text);
		wait.until(ExpectedConditions.textToBePresentInElementValue(napomenaField, text));

	}
	
	public void typeIntoTheFieldImeIPrezime(String name) {
		wait.until(ExpectedConditions.visibilityOf(input_FieldIme)).clear();
		input_FieldIme.sendKeys(name);
		wait.until(ExpectedConditions.textToBePresentInElementValue(input_FieldIme, name));
	}
	public void typeIntoTheFieldUlicaIBroj(String input) {
		wait.until(ExpectedConditions.visibilityOf(input_FieldUlicaIBroj)).clear();
		input_FieldUlicaIBroj.sendKeys(input);
		wait.until(ExpectedConditions.textToBePresentInElementValue(input_FieldUlicaIBroj, input));
	}
	public void typeIntoTheFieldPostanskiBroj(String number) {
		wait.until(ExpectedConditions.visibilityOf(input_FieldPostBroj)).clear();
		input_FieldPostBroj.sendKeys(number);
		wait.until(ExpectedConditions.textToBePresentInElementValue(input_FieldPostBroj, number));
	}
	public void typeIntoTheFieldGrad(String city) {
		wait.until(ExpectedConditions.visibilityOf(input_FieldGrad)).clear();
		input_FieldGrad.sendKeys(city);
		wait.until(ExpectedConditions.textToBePresentInElementValue(input_FieldGrad, city));
	}
	public void typeIntoTheFieldTelefon(String telefon) {
		wait.until(ExpectedConditions.visibilityOf(input_FieldTelefon)).clear();
		input_FieldTelefon.sendKeys(telefon);
		wait.until(ExpectedConditions.textToBePresentInElementValue(input_FieldTelefon, telefon));
	}
	public void typeIntoTheFieldEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(input_FieldEmail)).clear();
		input_FieldEmail.sendKeys(email);
		wait.until(ExpectedConditions.textToBePresentInElementValue(input_FieldEmail, email));
	}
	public void clickOnTheButtonNarucujem() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonNarucujem)).click();
	}
	public boolean verifyGreskaElement() {
		return greskaElement.getText().contains("Greška!");
	}
	public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
	public boolean verifyActualElement() {
		return actualElement.getText().contains("Podaci potrebni za uplatu");
	}
	public void typeIntoToTheFieldKolicina15(String amount4) {
		wait.until(ExpectedConditions.visibilityOf(kolicina15FieldElement)).clear();
		kolicina15FieldElement.sendKeys(amount4);
	}
	public void typeIntoToTheFieldKolicina4(String amount4) {
		wait.until(ExpectedConditions.visibilityOf(kolicinaField4)).clear();
		kolicinaField4.sendKeys(amount4);
	}
	public void clickOnTheLinkPovratak() {
		wait.until(ExpectedConditions.elementToBeClickable(povratakLinkProdavnicaElement)).click();
	}
	public void clickOnTheLinkOdustajem() {
		wait.until(ExpectedConditions.elementToBeClickable(odustajemElement)).click();
	}
	public void clickOnTheXButton() {
		wait.until(ExpectedConditions.elementToBeClickable(xElement)).click();
	}
	public void typeIntoToTheFieldKolicina1(String amount1) {
		wait.until(ExpectedConditions.visibilityOf(inputField_KolicinaElement1)).clear();
		inputField_KolicinaElement1.sendKeys(amount1);
	}
	public void alertAppearance() {
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
	}
	public boolean verifyGreska() {
		return greska1Element.getText().contains("Greška!");
	}
	
}