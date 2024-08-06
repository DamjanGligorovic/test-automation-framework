package projectMagento;

import java.time.Duration;
import java.util.UUID;

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
	@FindBy (css ="body > div.page-wrapper > header > div.panel.wrapper > div > ul > li:nth-child(3) > a")
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
	@FindBy(xpath ="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	WebElement linkSigninElement;
	@FindBy(id = "email")
	WebElement inputField_Email;
	@FindBy(id = "pass")
	WebElement inputField_PassElement;
	@FindBy (id  = "send2")
	WebElement inputField_SignInButtonElement;
	@FindBy(css = ".action.remind")
	WebElement linkForgotPasswordElement;
	@FindBy(css = "button[class='action submit primary']")
	WebElement resetMyPasswordElement;
	@FindBy(xpath = "//div[normalize-space(text()) = \"Thank you for registering with Main Website Store.\"]")
	WebElement confirmationMessagElement;
	@FindBy(css = "div#firstname-error.mage-error")
	WebElement errorMessageFirstNamElement;
	@FindBy (xpath   = "/html/body/div[2]/main/div[2]/div[2]/div/div/div/text()")
	WebElement invalidElement;
	@FindBy (css = "div#lastname-error.mage-error")
	WebElement errorMessagElement1;
	@FindBy(css = "div#email_address-error.mage-error")
	WebElement errorMessage2;
	@FindBy(css = "div#password-error.mage-error")
	WebElement errorMessage3;
	@FindBy(css = "#maincontent > div.columns > div.column.main > div.page-title-wrapper > h1 > span")
	WebElement editAccoutnElement;
	@FindBy(xpath   = "//div[normalize-space(text()) = \"If there is an account associated with damjangligorovic@hotmail.com you will receive an email with a link to reset your password.\"]")
			
	WebElement confirmationElement55;
	
	public LoginPageMagentoClass (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	public static class EmailGenerator {
	    public static String generateRandomEmail() {
	        return "user" + UUID.randomUUID().toString() + "@example.com";
	    }
	}
	public boolean verifyInvalidMessage() {
		return invalidElement.isDisplayed();
	}
	public boolean verifyErrorMessage3() {
		return errorMessage3.isDisplayed();
	}
	public boolean verifyErrorMessage1() {
		return errorMessagElement1.isDisplayed();
	}
	public boolean verifyErrorMessage2() {
		return errorMessage2.isDisplayed();
	}
	 
	public boolean verifyConfirmationMessage() {
		//wait.until(ExpectedConditions.visibilityOf(confirmationMessagElement));
		return confirmationMessagElement.isDisplayed();
	}
	public boolean verifyConfirmationMessage55() {
		//wait.until(ExpectedConditions.visibilityOf(confirmationMessagElement));
		return confirmationElement55.isDisplayed();
	}
	public boolean verifyErrorMessage() {
		return errorMessageFirstNamElement.isDisplayed();
	}
	public void clickOnTheCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(linkCreateAccountElement)).click();
	}
	public void clickOnTheLinkSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSigninElement)).click();
	}
	public void clickOnTheForgotPassword() {
		wait.until(ExpectedConditions.elementToBeClickable(linkForgotPasswordElement)).click();
	}
	public boolean verifyTheConfirmationEditAccount() {
return editAccoutnElement.isDisplayed();
}
	public void clickOnTheButtonSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(inputField_SignInButtonElement)).click();
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
	public void typeCredentialsEmail(String input) {
		if (input != null && !input.isEmpty()) {
			wait.until(ExpectedConditions.visibilityOf(inputField_Email));
			inputField_Email.sendKeys(input);
	}
}
	public void typeCredentialsPassword(String input) {
		if (input != null && !input.isEmpty()) {
			wait.until(ExpectedConditions.visibilityOf(inputField_PassElement));
			inputField_PassElement.sendKeys(input);
	}
}
	public void clickOnTheButtonResetMyPassword() {
		wait.until(ExpectedConditions.elementToBeClickable(resetMyPasswordElement)).click();
	}
	public void setEmail(String randomEmail) {
		// TODO Auto-generated method stub
		
	}
	}

