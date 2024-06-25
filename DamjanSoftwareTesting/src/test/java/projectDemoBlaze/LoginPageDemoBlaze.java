package projectDemoBlaze;



import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;
import java.util.List;

import javax.security.auth.callback.PasswordCallback;
import javax.swing.text.PasswordView;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageDemoBlaze {
	private WebDriver driver;
	Actions actions;
	private WebDriverWait wait;
	Select select;
	
	@FindBy (css   = "[data-target=\"#exampleModal\"]")
	WebElement linkContactUs;
	@FindBy(linkText = "Home")
    WebElement homeLink;

    @FindBy(linkText = "Contact")
    WebElement contactLink;

    @FindBy(linkText = "About us")
    WebElement aboutUsLink;

    @FindBy(linkText = "Cart")
    WebElement cartLink;

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(linkText = "Sign up")
    WebElement signUpLink;

    @FindBy(css  = ".navbar-nav.ml-auto > li > a")
    List<WebElement> allLinks;
    @FindBy (css = "#exampleModal > div button:nth-child(1)")
    WebElement closElement;
    @FindBy (css = "#videoModal > div > div > div.modal-footer > button")
    WebElement closeButtonAboutUsElement;
    @FindBy(css = "#logInModal > div > div > div.modal-footer > button.btn.btn-secondary")
    WebElement closeButtonLogInElement;
    @FindBy(id = "signin2")
    WebElement linkSignUpElement;
    @FindBy(id = "sign-username")
    WebElement usernamElement;
    @FindBy(id = "sign-password")
    WebElement passwordElement;
    @FindBy (css = "[onclick=\"register()\"]")
    WebElement submitButtonElement;
    @FindBy(css ="#signInModal > div > div > div.modal-footer > button.btn.btn-secondary")
    WebElement closeSignUpElement;
    @FindBy(id = "login2")
    WebElement loginLinkElement;
    @FindBy(id = "loginusername")
    WebElement inputField_LoginElement;
    @FindBy (id = "loginpassword")
    WebElement inputField_PasswordElement;
    @FindBy(css = "[onclick=\"logIn()\"]")
    WebElement submitElementLoginElement;
    @FindBy (css = "data-target=\"#exampleModal\"")
    WebElement contacUsElement;
    @FindBy(id = "recipient-email")
    WebElement inputField_ContactUsernamElement;
    @FindBy(id = "recipient-name")
    WebElement inputField_ContactPasswordElement;
    @FindBy(id = "message-text")
    WebElement inputField_ContactMessageElement;
    @FindBy(css ="[onclick=\"send()\"]")
    WebElement buttonSendMessagElement;
	public LoginPageDemoBlaze (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
		public void clickLinkByIndex(int index) {
			 int count = 1;
		        if (index >= 0 && index < allLinks.size()) {
		            allLinks.get(index).click();
		        System.out.println("Invalid link" + index + count);
		    }
count--;
		 }
		 public void clickClose() {
			wait.until(ExpectedConditions.elementToBeClickable(closElement)).click();
		}
		 public void clickCloseAboutUs() {
				wait.until(ExpectedConditions.elementToBeClickable(closeButtonAboutUsElement)).click();

		}
		 public void clickCloseLoginIn() {
				wait.until(ExpectedConditions.elementToBeClickable(closeButtonLogInElement)).click();
		}
		 public void signUpClickLink() {
				wait.until(ExpectedConditions.elementToBeClickable(signUpLink)).click();
		 }
		 public void fillSignUpForm(String username, String password) {
			 	
				wait.until(ExpectedConditions.visibilityOf(usernamElement)).clear();
				usernamElement.sendKeys(username);
				wait.until(ExpectedConditions.visibilityOf(passwordElement)).clear();
				passwordElement.sendKeys(password);
				wait.until(ExpectedConditions.elementToBeClickable(submitButtonElement)).click();
				wait.until(ExpectedConditions.alertIsPresent());
				driver.switchTo().alert().accept();
				wait.until(ExpectedConditions.elementToBeClickable(closeSignUpElement)).click();

		 }
		 public void fillLogInForm(String username, String password) {
				wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
				wait.until(ExpectedConditions.visibilityOf(inputField_LoginElement)).clear();
				inputField_LoginElement.sendKeys(username);
				wait.until(ExpectedConditions.visibilityOf(inputField_PasswordElement)).clear();
				inputField_PasswordElement.sendKeys(password);
				wait.until(ExpectedConditions.elementToBeClickable(submitElementLoginElement)).click();
				
		}
		 public void typePassword(String password) {
				wait.until(ExpectedConditions.visibilityOf(passwordElement)).clear();
				passwordElement.sendKeys(password);
		 }
		 public void clickTheButtonSubmit() {
				wait.until(ExpectedConditions.elementToBeClickable(submitButtonElement)).click();
				wait.until(ExpectedConditions.alertIsPresent());
				driver.switchTo().alert().accept();
		 }
		 public  void fillTheContactForm(String username, String password, String message) {
				wait.until(ExpectedConditions.elementToBeClickable(contactLink)).click();
				wait.until(ExpectedConditions.visibilityOf(inputField_ContactUsernamElement)).clear();
				inputField_ContactUsernamElement.sendKeys(username);
				wait.until(ExpectedConditions.visibilityOf(inputField_ContactPasswordElement)).clear();
				inputField_ContactPasswordElement.sendKeys(password);
				wait.until(ExpectedConditions.visibilityOf(inputField_ContactMessageElement)).clear();
				inputField_ContactMessageElement.sendKeys(message);
				wait.until(ExpectedConditions.elementToBeClickable(buttonSendMessagElement)).click();
				wait.until(ExpectedConditions.alertIsPresent());
				driver.switchTo().alert().accept();
		}
		 
}