package projectMagento;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageMagentoClass {
	WebDriver driver;
	Actions actions;
	WebDriverWait wait;
	Select select;
	@FindBy (css ="header[class='page-header'] li:nth-child(3) a:nth-child(1)")
	WebElement linkCreateAccountElement;
	@FindBy (id= "firstname")
	WebElement inputField_FirstNameElement;
	@FindBy (id= "lastname")
	WebElement inputField_LastNameElement;
	@FindBy (id= "email_address")
	WebElement inputField_EmailElement;
	@FindBy (id= "password")
	WebElement inputField_PasswordElement;
	@FindBy (id ="password-confirmation")
	WebElement inputField_ConfirmPasswordElement;
	@FindBy(css = "button[title='Create an Account'] span")
	WebElement button_CreateAccountElement;
	public LoginPageMagentoClass (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	public void clickOnTheCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(linkCreateAccountElement)).click();
	}
	public void typeIntoTheFieldFirstName(String input) {
		 if (input != null && !input.isEmpty()) {
		wait.until(ExpectedConditions.visibilityOf(inputField_FirstNameElement));
		inputField_FirstNameElement.sendKeys(input);
	}
	}
	
	public void typeIntoTheFieldLastName(String input) {
		 if (input != null && !input.isEmpty()) {
		wait.until(ExpectedConditions.visibilityOf(inputField_LastNameElement));
		inputField_LastNameElement.sendKeys(input);
	}
	}
	public void typeIntoTheFieldEmail(String input) {
		 if (input != null && !input.isEmpty()) {
		wait.until(ExpectedConditions.visibilityOf(inputField_EmailElement));
		inputField_EmailElement.sendKeys(input);
	}
	}
	public void typeIntoThePassword(String input) {
		 if (input != null && !input.isEmpty()) {
		wait.until(ExpectedConditions.visibilityOf(inputField_PasswordElement));
		inputField_PasswordElement.sendKeys(input);
	}
	}
	public void typeIntoTheFieldConfirmPassword(String input) {
		 if (input != null && !input.isEmpty()) {
		wait.until(ExpectedConditions.visibilityOf(inputField_ConfirmPasswordElement));
		inputField_ConfirmPasswordElement.sendKeys(input);
	}
	}
	public void clickOnTheButtonCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(button_CreateAccountElement)).click();
	}
}
