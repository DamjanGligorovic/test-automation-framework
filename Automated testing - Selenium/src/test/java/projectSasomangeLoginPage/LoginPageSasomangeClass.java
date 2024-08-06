package projectSasomangeLoginPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageSasomangeClass {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(id = "gigya-textbox-loginID") 
	WebElement inputField_username;
	
	@FindBy(id = "gigya-textbox-password") 
	WebElement inputField_password;
	
	@FindBy(xpath  = "//*[@id=\"gigya-textbox-password\"]")
	WebElement toggleEyeIcon;
	
	@FindBy(css = "#login-screen > form > div.form-group.submit > button")
	WebElement loginButton;
	@FindBy (id = "notification_1")
	WebElement greenElement;
	@FindBy (css = "#login-screen > form > footer > p > a")
	WebElement linkRegistrujSeElement;
	@FindBy (css = "#login-screen > form > div.form-group.action-link > a")
	WebElement linkNeseCasSElement;
	@FindBy (css = "#forgot-password-screen > form > div.form-group.submit > button")
	WebElement buttonPosaljiOpetElement;
	@FindBy(css = "#forgot-password-success-screen > p")
	WebElement actualMessagElement;
	@FindBy (css = "#gigya-textbox-email-loginID")
	WebElement imejlElement;
	@FindBy(css="#login-screen > form > div.form-group.gigya-composite-control.gigya-composite-control-textbox.email-wrapper > span")
	WebElement ovoJePoljeObaveznoElement;

public LoginPageSasomangeClass (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	
}
public void typeEmail(String email) {
	wait.until(ExpectedConditions.visibilityOf(inputField_username)).clear();
	inputField_username.sendKeys(email);
}
public void typeImejl(String email) {
	wait.until(ExpectedConditions.visibilityOf(imejlElement)).clear();
	imejlElement.sendKeys(email);
}
public void typePassword(String password) {
	wait.until(ExpectedConditions.visibilityOf(inputField_password)).clear();
	inputField_password.sendKeys(password);
}
public void checkToggleButton() {
	wait.until(ExpectedConditions.elementToBeClickable(toggleEyeIcon)).click();
	
}
public void clickOnTheButtonPrijaviSe() {
	wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	
}
public void clickOnTheButtonNesecasSe() {
	wait.until(ExpectedConditions.elementToBeClickable(linkNeseCasSElement)).click();
	
}public void clickOnTheButtonPosaljiOpet() {
	wait.until(ExpectedConditions.elementToBeClickable(buttonPosaljiOpetElement)).click();
	
}
public void clickOnTheLinkRegistrujSe() {
	wait.until(ExpectedConditions.elementToBeClickable(linkRegistrujSeElement)).click();
	
}
public String getCurrentUrl() {
    return driver.getCurrentUrl();
}
public String getCurrentTitle() {
    return driver.getTitle();
}
public String colorGreen() {
	wait.until(ExpectedConditions.visibilityOf(greenElement));
	return greenElement.getCssValue("background-color");
}
public boolean message() {
	return greenElement.isDisplayed();
}
public boolean confirmationMessage() {
	return actualMessagElement.getText().contains("Poslali smo ti uputstva za resetovanje lozinke. Proveri svoju poštu!");
}

public boolean ovoJePoljeObavezno() {
	return ovoJePoljeObaveznoElement.isDisplayed();
}
}