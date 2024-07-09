package projectHomepageSrbijaVoz;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageSrbijaIIVozClass {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (id = "jedanSmer")
	WebElement buttonJedanSmer;
	@FindBy (id = "povratna")
	WebElement buttonPovratna;
	@FindBy(id = "stanicaod") 
	WebElement inputField_StanicaOd;
	@FindBy(id = "stanicado")
	WebElement inputField_StanicaDo;
	@FindBy (css = "[title=\"Beograd Centar-Prokop\"]")
	WebElement optionBeogradProkop;
	@FindBy (css ="[title=\"Novi Sad\"]")
	WebElement optionNoviSad;
	@FindBy(css = "[ng-click=\"open()\"] i")
	WebElement leviKalendar;
	@FindBy(css = "button.btn.btn-default.btn-sm.pull-right.uib-right")
	WebElement desnaStrelica;
	@FindBy (css = "button.btn.btn-default.btn-sm.active")
	WebElement prviDan;
	@FindBy (id = "btntrazi")
	WebElement buttonTrazi;
	@FindBy (css = " tr:nth-child(4) > td:nth-child(6) > div.btn.btn-sv.btn-izaberip")
	WebElement buttonIzaberi;
	@FindBy (css = "div:nth-child(4) > div.row > div > div")
	WebElement buttonDalje;
	@FindBy (css = ".col-md-5 h5:nth-child(2)")
	WebElement subtitle;
	@FindBy(css = "tr:nth-child(4) > td:nth-child(6) > div.btn.btn-izabrano")
	WebElement greenIzabranoElement;
	
	public LoginPageSrbijaIIVozClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	public void clickOnRadioButtonJedanSmer() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonJedanSmer)).click();
	}
	public void clickOnRadioButtonPovratna() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonPovratna)).click();
	}
	public void typeTextInTheFieldStanicaOD(String keyword) {
		wait.until(ExpectedConditions.visibilityOf(inputField_StanicaOd)).clear();
		inputField_StanicaOd.sendKeys(keyword);
		wait.until(ExpectedConditions.textToBePresentInElementValue(inputField_StanicaOd, keyword));	
	}
	public void typeTextInTheFieldStanicaDO(String keyword) {
		wait.until(ExpectedConditions.visibilityOf(inputField_StanicaDo)).clear();
		inputField_StanicaDo.sendKeys(keyword);
		wait.until(ExpectedConditions.textToBePresentInElementValue(inputField_StanicaDo, keyword));	
	}
	public void chooseBeogradProkop() {
		wait.until(ExpectedConditions.elementToBeClickable(optionBeogradProkop)).click();
		
	}
	public void chooseNoviSad() {
		wait.until(ExpectedConditions.elementToBeClickable(optionNoviSad)).click();
	}
	public void clickOnTheCalendarIcon() {
		wait.until(ExpectedConditions.elementToBeClickable(leviKalendar)).click();
		
	}
	public void clickOnTheRightDart() {
		wait.until(ExpectedConditions.elementToBeClickable(desnaStrelica)).click();
		
	}
	public void clickOnTheFirstDay() {
		wait.until(ExpectedConditions.elementToBeClickable(prviDan)).click();
	}
	public void clickOnTheButtonTrazi() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonTrazi)).click();
	}
	public void clickOnTheButtonIzaberi() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonIzaberi)).click();
	}
	public void clickOnTheButtonDalje() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonDalje)).click();
	}
	public boolean verifySubtitlePrijava() {
		return subtitle.getText().contains("Prijava");
	}
	public String verifyBackgroundColor() {
		 return greenIzabranoElement.getCssValue("background-color");
	}
	
	
	
}