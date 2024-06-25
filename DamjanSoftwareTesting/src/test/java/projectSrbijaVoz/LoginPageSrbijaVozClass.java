package projectSrbijaVoz;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageSrbijaVozClass {
	WebDriver driver;
	Actions actions;
	WebDriverWait wait;
	//.sv-form-header
	@FindBy (tagName = "h4")
	WebElement subtitleLoginPage;
	@FindBy(name = "firstName")
	WebElement inputField_Name;
	@FindBy (name = "lastName")
	WebElement inputField_LastName;
	@FindBy(css = ".form-inline select:nth-child(1)")
	WebElement checkbox1;
	@FindBy(css = "option[label=\"5\"]")
	WebElement option5Day;
	@FindBy (css = "option[label=\"May\"]")
	WebElement optionMayMonth;
	@FindBy (css = ".form-inline select:nth-child(2)")
	WebElement checkbox2;
	@FindBy (css=".form-inline select:nth-child(3)")
	WebElement checkbox3;
	@FindBy(css = "option[label=\"1985\"]")
	WebElement option1985Year;
	@FindBy (name = "telefon")
	WebElement inputField_Telefon;
	@FindBy (name = "email")
	WebElement inputField_Email;
	@FindBy (id = "passwordr")
	WebElement inputField_Lozinka;
	@FindBy (css ="select[ng-model=\"registration.sifra_povlastice\"]")	
	WebElement dropdownMenuBezPovlastica;
	@FindBy (name = "promo")
	WebElement promoCheckbox;
	@FindBy(name = "info")
	WebElement infoCheckbox;
	@FindBy(css = "div[ng-click=\"register()\"]")
	WebElement buttonRegistration;
	@FindBy(css = "div.bg-danger")
	WebElement messageMolimoVasSacekajte;
	@FindBy(css = "[type=\"checkbox\"]")
	List<WebElement> chechboxes;
	public LoginPageSrbijaVozClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));	
	}
	public String verifySubtitle() {
	
		return subtitleLoginPage.getText();
 }
	public void typeFirstName(String firstname) {
		wait.until(ExpectedConditions.visibilityOf(inputField_Name)).clear();
		inputField_Name.sendKeys(firstname);
		wait.until(ExpectedConditions.textToBePresentInElementValue(inputField_Name, firstname));
	}
	public void typeLastName(String lastname) {
		wait.until(ExpectedConditions.visibilityOf(inputField_LastName)).clear();
		inputField_LastName.sendKeys(lastname);
		wait.until(ExpectedConditions.textToBePresentInElementValue(inputField_LastName, lastname));
	}
	public void clickCheckboxDay() {		
		wait.until(ExpectedConditions.elementToBeClickable(checkbox1)).click();
		wait.until(ExpectedConditions.elementToBeClickable(option5Day)).click();
	}
	public void clickCheckboxMonth() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox2)).click();
		wait.until(ExpectedConditions.elementToBeClickable(optionMayMonth)).click();
		}
	public void clickCheckboxYear() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox3)).click();
		wait.until(ExpectedConditions.elementToBeClickable(option1985Year)).click();
	}
	public void typePhoneNumber(String phonenumber) {
		wait.until(ExpectedConditions.visibilityOf(inputField_Telefon)).clear();
		inputField_Telefon.sendKeys(phonenumber);
	}
	public void typeInvalidEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(inputField_Email)).clear();
		inputField_Email.sendKeys(email);
	}
	public void typePassword(String password)
	{
		wait.until(ExpectedConditions.visibilityOf(inputField_Lozinka)).clear();
		inputField_Lozinka.sendKeys("Felina10@");
		wait.until(ExpectedConditions.textToBePresentInElementValue(inputField_Lozinka, password));
	}
	public void clickPromoCheckbox() {
		wait.until(ExpectedConditions.elementToBeClickable(promoCheckbox)).click();
	}
	public void clickInfoCheckbox() {
		wait.until(ExpectedConditions.elementToBeClickable(infoCheckbox)).click();
	}
	public void clickButtonRegistration() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonRegistration)).click();
	}
	public boolean verifyMessageMolimoVasSacekajte() {
		return messageMolimoVasSacekajte.isDisplayed();		
		}
	
	public boolean verifyPromoCheckbox() {
		return promoCheckbox.isSelected();
	}	
	public boolean verifyInfoCheckbox() {
		return infoCheckbox.isSelected();
	}


	
}