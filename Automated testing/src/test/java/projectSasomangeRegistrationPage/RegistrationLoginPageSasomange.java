package projectSasomangeRegistrationPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationLoginPageSasomange {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy (css = ".form-group.gigya-composite-control.gigya-composite-control-textbox.gigya-composite-control-active input[id='resident-email']")
	WebElement emailFieldElement;
	@FindBy (css = "input[id='resident-password']")
	WebElement passwordFieldElement;
	@FindBy(css = "#register-resident-user-screen-default > form > div.form-group.consent-group > div > label")
	WebElement buttonCheckboxElement;
	@FindBy(css = "#register-resident-user-screen-default > form > div.form-group.submit > button")
	WebElement buttonRegijstrujSeElement;
	@FindBy(linkText = "Pravila i uslove korišćenja")
	WebElement linkPravilaIUslovElement;
	@FindBy(linkText =  "Politiku privatnosti")
	WebElement linkPolitikuPrivatnostiElement;
	@FindBy (linkText = "Prijavi se")
	WebElement linkPrijaviSeElement;
	@FindBy (css = "[role=\"alert\"]")
	WebElement greskaElement;
	@FindBy (css = "#displayRegisterForm span.field-info.js-password-info")
	WebElement indicatorElement;
public RegistrationLoginPageSasomange (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
	}
public  void typeEmail(String email) {
	wait.until(ExpectedConditions.visibilityOf(emailFieldElement)).clear();
	emailFieldElement.sendKeys(email);
	
}
public  void typePassword(String password) {
	wait.until(ExpectedConditions.visibilityOf(passwordFieldElement)).clear();
	passwordFieldElement.sendKeys(password);
	
}
public void clickOnTheCheckbox() {
	wait.until(ExpectedConditions.elementToBeClickable(buttonCheckboxElement)).click();
}
public void clickOnTheButtonRegistrujse() {
	wait.until(ExpectedConditions.elementToBeClickable(buttonRegijstrujSeElement)).click();
}
public void clickOnTheLinkPravila() {
	wait.until(ExpectedConditions.elementToBeClickable(linkPravilaIUslovElement)).click();

}
public void clickOnTheLinkPolitiku() {
	wait.until(ExpectedConditions.elementToBeClickable(linkPolitikuPrivatnostiElement)).click();

}
public void clickOnTheLinkPrijaviSe() {
	wait.until(ExpectedConditions.elementToBeClickable(linkPrijaviSeElement)).click();

}

}



