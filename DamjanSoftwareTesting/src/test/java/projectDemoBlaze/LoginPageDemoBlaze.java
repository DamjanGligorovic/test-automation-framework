package projectDemoBlaze;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.security.PublicKey;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;
import java.util.Iterator;
import java.util.List;

import javax.security.auth.callback.PasswordCallback;
import javax.swing.text.PasswordView;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


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
    @FindBy (css =  "div#tbodyid div:nth-child(1)")
    List<WebElement> subtitleElements;
    @FindBy(css="[onclick=\"addToCart(1)\"]")
    WebElement buttonAddToCartElement;
    @FindBy(css="#tbodyid > div.row > div > a")
    WebElement buttonAddToCartElementNokiaElement;
    @FindBy(css = "#tbodyid a")
    WebElement binRemoveElement;
    @FindBy(css = "h3#totalp.panel-title")
    WebElement element360;
    @FindBy(xpath = "//a[@id='nava']")
    WebElement logoElement;
    @FindBy(css=".vjs-poster")
    WebElement buttonPlayVideoElement;
    @FindBy(css="[title=\"Fullscreen\"]")
    WebElement buttonFullScreenElement;
    @FindBy(css="[title=\"Picture-in-Picture\"]")
	WebElement buttonMediumScreenElement;
    @FindBy(css="#example-video > div.vjs-control-bar > div.vjs-volume-panel.vjs-control.vjs-volume-panel-horizontal")
    WebElement buttonVolumeButtonElement;
    @FindBy(css="#example-video > div.vjs-control-bar > button.vjs-play-control.vjs-control.vjs-button.vjs-playing > span.vjs-icon-placeholder")
    WebElement buttonPausElement;
    @FindBy(css="#example-video > div.vjs-control-bar > div.vjs-progress-control.vjs-control")
    WebElement linearVideoElement;
    @FindBy(css="#example-video_html5_api")
    WebElement screenExamplElement;
    @FindBy(css=".card-block")
    List<WebElement> listItems;
    @FindBy(css=".card-img-top.img-fluid")
    List<WebElement> listItemsLaptopoviElements;
    @FindBy(css="#tbodyid > div:nth-child(1) > div > div > h5")
    WebElement priceFirstElement;
    @FindBy(css="#tbodyid > div:nth-child(2) > div > a > img")//
    WebElement itemSecondElement;
    @FindBy(css="#tbodyid > div:nth-child(1) > div > a > img")
    WebElement firstItemElement;
    @FindBy(css = "#tbodyid > div:nth-child(3) > div > a > img")
    WebElement thirdElement;
    @FindBy(css="#tbodyid > div:nth-child(4) > div > a > img")
    WebElement fourthElement;
    @FindBy(css="#tbodyid > div:nth-child(5) > div > a > img") 
    WebElement fifthElement;
    @FindBy(css="#tbodyid > div:nth-child(6) > div > a > img")
    WebElement sixthElement;
    @FindBy(css="#tbodyid > div:nth-child(7) > div > a > img")
    WebElement seventhElement;
    //L A P T O P O V I - I T E M I
    @FindBy(css ="#tbodyid > div:nth-child(1) > div > a > img")
    WebElement prviElementLaptopElement;
    @FindBy(css ="#tbodyid > div:nth-child(2) > div > a > img")
    WebElement drugiElementLaptopElement;
    @FindBy(css ="#tbodyid > div:nth-child(3) > div > a > img")
    WebElement treciElementLaptopElement;
    @FindBy(css ="#tbodyid > div:nth-child(4) > div > a > img")
    WebElement cetvrtiElementLaptopElement;
    @FindBy(css ="#tbodyid > div:nth-child(5) > div > a > img")
    WebElement petiElementLaptopElement;
    @FindBy(css ="#tbodyid > div:nth-child(6) > div > a > img")
    WebElement sestiElementLaptopElement;
    // ADD TO CART
    @FindBy(css="a.btn.btn-success.btn-lg")
    WebElement prviLaptopAddToCart;
    @FindBy(css="[onclick=\"addToCart(2\"]")
    WebElement drugiLaptopAddToCart;
    @FindBy(css="[onclick=\"addToCart(3\"]")
    WebElement treciLaptopAddToCart;
    @FindBy(css="[onclick=\"addToCart(4\"]")
    WebElement cetvrtiLaptopAddToCart;
    @FindBy(css="[onclick=\"addToCart(5\"]")
    WebElement petiLaptopAddToCart;
    @FindBy(css="[onclick=\"addToCart(6\"]")
    WebElement sestiLaptopAddToCart;
    //IMAGES
    @FindBy(css="#tbodyid > div:nth-child(1) > div > a > img")
    WebElement imagePrviElement;
    @FindBy(css="#imgp > div > img")
    WebElement imagePrviElement2;
    
    @FindBy(css="#tbodyid > div:nth-child(2) > div > a > img")
    WebElement imageDrugiElement;
    @FindBy(css="#imgp > div > img")
    WebElement imageDrugiElement2;
    
    @FindBy(css="#tbodyid > div:nth-child(3) > div > a > img")
    WebElement imageTreciElement;
    @FindBy(css="#imgp > div > img")
    WebElement imageTreciElement2;
    
    @FindBy(css="#tbodyid > div:nth-child(4) > div > a > img")
    WebElement imageCetrvtiElement;
    @FindBy(css="#imgp > div > img")
    WebElement imageCetvrtiElement2;
    
    @FindBy(css="#tbodyid > div:nth-child(5) > div > a > img")
    WebElement imagePetiElement;
    @FindBy(css="#imgp > div > img")
    WebElement imagePetiElement2;
    
    @FindBy(css="#tbodyid > div:nth-child(6) > div > a > img")
    WebElement imageSestiElement;
    @FindBy(css="#imgp > div > img")
    WebElement imageSestiElement2;
    @FindBy(css="#tbodyid > div:nth-child(1) > div > a > img")
    WebElement imageElement1;
    @FindBy(css="#imgp > div > img")
    WebElement imageElement2;
    @FindBy(css="#tbodyid > div:nth-child(2) > div > a > img")
    WebElement imageElement3;
    @FindBy(css="#imgp > div > img")
    WebElement imageElement4;
    @FindBy(css="#tbodyid > div:nth-child(3) > div > a > img")
    WebElement imageElement5;
    @FindBy(css="#imgp > div > img")
    WebElement imageElement6;
    @FindBy(css="#tbodyid > div:nth-child(4) > div > a > img")
    WebElement imageElement7;
    @FindBy(css="#imgp > div > img")
    WebElement imageElement8;
    @FindBy(css="#tbodyid > div:nth-child(5) > div > a > img")
    WebElement imageElement9;
    @FindBy(css="#imgp > div > img")
    WebElement imageElement10;
    @FindBy(css="#tbodyid > div:nth-child(6) > div > a > img")
    WebElement imageElement11;
    @FindBy(css="#imgp > div > img")
    WebElement imageElement12;
    @FindBy(css="#tbodyid > div:nth-child(7) > div > a > img")
    WebElement imageElement13;
    
    @FindBy(css="#imgp > div > img")
    WebElement imageElement14;
    @FindBy(css="[onclick=\"addToCart(1)\"]")
    WebElement buttonAddToCartElement2;
    @FindBy(css="[onclick=\"addToCart(4)\"]")
    WebElement buttonAddToCartElement4;
    @FindBy(css="[onclick=\"addToCart(5)\"]")
    WebElement buttonAddToCartElement5;
    @FindBy(css="[onclick=\"addToCart(6)\"]")
    WebElement buttonAddToCartElement6;
    @FindBy(css="[onclick=\"addToCart(7)\"]")
    WebElement buttonAddToCartElement7;
    @FindBy(css="#tbodyid > tr > td:nth-child(4) > a")
    WebElement buttonDeletElement;
    @FindBy(css="button.btn.btn-success")
    WebElement placeOrderElement;
    @FindBy(css="[onclick=\"purchaseOrder()\"]")
    WebElement buttonPurchasElement;
    @FindBy(css="#name.form-control")
    WebElement inputField_NameElement;
    @FindBy(css="#country.form-control")
    WebElement inputField_CountryElement;
    @FindBy(css="#city.form-control")
    WebElement inputField_CityElement;
    @FindBy(css="#card.form-control")
    WebElement inputField_CreditCardElement;
    @FindBy(css="#month.form-control")
    WebElement inputField_MonthElement;
    @FindBy(css="#year.form-control")
    WebElement inputField_YearElement;
    @FindBy(css="#totalm.form-control-label")
    WebElement nameOfProduct360;
    @FindBy(css="#orderModal > div > div > div.modal-footer > button.btn.btn-secondary")
    WebElement closeButtonElement;
    @FindBy(css="body > div.sweet-alert.showSweetAlert.visible > h2")
    WebElement confirmationMessagElement;
    @FindBy(css="body > div.sweet-alert.showSweetAlert.visible > p")
    WebElement passageConfirmationElement;
    @FindBy(css="button.confirm.btn.btn-lg.btn-primary")
    WebElement buttonOKElement;
    @FindBy(css ="#totalm")
    WebElement label360PurchaseForm;
    @FindBy(css=".list-group a")
    List<WebElement> categoriesOptionsElements;
    @FindBy(xpath ="//*[@id=\"next2\"]")
    WebElement buttonNextElement;
    @FindBy(xpath ="//*[@id=\"prev2\"]")
    WebElement buttonPreviousElement;
    @FindBy(id="cartur")
    WebElement cartLinkElement;
    @FindBy(css="body > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(3)")
    WebElement laptopsOptionElement;
    @FindBy(css="#tbodyid > div.row > div > a")
    WebElement firstItemElement2;
    @FindBy(css="#tbodyid > div.row > div > a")
    WebElement sony7addToCartElement;
    @FindBy(css= "#tbodyid.row div:nth-child(1)")
    List<WebElement> listOfSonysElements;
    public LoginPageDemoBlaze (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	}
    public void verifyCategoriesAndNextAndPreviousButtons() {
		wait.until(ExpectedConditions.visibilityOfAllElements(categoriesOptionsElements));
		categoriesOptionsElements.get(0).click();
		categoriesOptionsElements.get(1).click();
		categoriesOptionsElements.get(2).click();
		categoriesOptionsElements.get(3).click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonNextElement)).click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonPreviousElement)).click();

	}
    public void clickTheAddToCartSony7() {
		wait.until(ExpectedConditions.elementToBeClickable(sony7addToCartElement)).click();
	}
    public void clickTheSonys() {
		wait.until(ExpectedConditions.visibilityOfAllElements(listOfSonysElements));
		
	}
    public void clickTheLaptops() {
		wait.until(ExpectedConditions.elementToBeClickable(laptopsOptionElement)).click();
	}
    public void clickTheButtonAddToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAddToCartElement2)).click();
	}
    public void clickIItem() {
		wait.until(ExpectedConditions.elementToBeClickable(firstItemElement2)).click();
	}
    public void clickTheButtonCart() {
		wait.until(ExpectedConditions.elementToBeClickable(cartLinkElement)).click();
	}
    public void clickTheListLapotovi() {
		wait.until(ExpectedConditions.visibilityOfAllElements(listItemsLaptopoviElements));
		
	}
    public void clickTheButtonAddToCartLaptop() {
		wait.until(ExpectedConditions.elementToBeClickable(prviLaptopAddToCart)).click();
	}
    public void clickTheButtonAddToCart1() {
		wait.until(ExpectedConditions.elementToBeClickable(prviLaptopAddToCart)).click();
	}
    public void clickTheButtonAddToCartNokia() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAddToCartElementNokiaElement)).click();
	}
    public void clickTheButtonPurchase() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonPurchasElement)).click();
	}
    public void clickTheButtonDelete() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonDeletElement)).click();
	}
    public void clickTheButtonPlaceOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(placeOrderElement)).click();
	}
    public void clickTheButtonAddToCart4() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAddToCartElement4)).click();
	}
    public void clickTheButtonAddToCart5() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAddToCartElement5)).click();
	}
    public void clickTheButtonAddToCart6() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAddToCartElement6)).click();
	}
    public void clickTheButtonAddToCart7() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAddToCartElement7)).click();
	}
    public void clickTheSecondItem() {
		wait.until(ExpectedConditions.elementToBeClickable(itemSecondElement)).click();
	}
    public void clickTheThirdItem() {
		wait.until(ExpectedConditions.elementToBeClickable(thirdElement)).click();
	}
    public void clickTheFourthItem() {
  		wait.until(ExpectedConditions.elementToBeClickable(fourthElement)).click();
  	}
    public void clickTheFifthItem() {
  		wait.until(ExpectedConditions.elementToBeClickable(fifthElement)).click();
  	}
    public void clickTheSixthItem() {
  		wait.until(ExpectedConditions.elementToBeClickable(sixthElement)).click();
  	}
    public void clickTheSeventhItem() {
  		wait.until(ExpectedConditions.elementToBeClickable(seventhElement)).click();
  	}
    public void acceptAlertIfPresent() {
        try {
            // Increase the wait time if necessary
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the time as needed
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
        } catch (NoAlertPresentException e) {
            // Handle the exception if no alert is present
            System.out.println("No alert was present to accept.");
        }
    }

    // Other page object methods...

    public void clickTheFirstItem() {
		wait.until(ExpectedConditions.elementToBeClickable(firstItemElement)).click();
	}
    public void verifyImagesPricesAndTitlesUrls() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h4 > a")).getText();
		String productPrice = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h5")).getText();
		String actualTitleString = driver.getTitle();
		listItems.get(0).click();
		String productNameAfterClick = "Samsung galaxy s6";
		String productNameAfterClickItemString= "$360";
		String expectedTitleString = "STORE";
		//String productDescription1 = driver.findElement(By.cssSelector("#more-information > p")).getText();

		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertEquals(productPrice, productNameAfterClickItemString);
		softAssert.assertEquals(actualTitleString, expectedTitleString);
		softAssert.assertAll();
	}
    public void clickOnTheLaptops() {
		wait.until(ExpectedConditions.visibilityOfAllElements(categoriesOptionsElements));
		categoriesOptionsElements.get(2).click();
		
	}
    public void verifyImagesPricesAndTitlesUrls1() {
  		SoftAssert softAssert = new SoftAssert();
  		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
  		String productName = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(2) > div > div > h4 > a")).getText();
  		String productPrice = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(2) > div > div > h5")).getText();
  		String actualTitleString = driver.getTitle();
  		listItems.get(1).click();
  		String productNameAfterClick = "Nokia lumia 1520";
  		String productNameAfterClickItemString= "$820";
  		String expectedTitleString = "STORE";
  		softAssert.assertEquals(productName, productNameAfterClick);
  		softAssert.assertEquals(productPrice, productNameAfterClickItemString);
  		softAssert.assertEquals(actualTitleString, expectedTitleString);
  		softAssert.assertAll();
  	}
    public void verifyImagesPricesAndTitlesUrls2() {
  		SoftAssert softAssert = new SoftAssert();
  		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
  		String productName = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(3) > div > div > h4 > a")).getText();
  		String productPrice = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(3) > div > div > h5")).getText();
  		String actualTitleString = driver.getTitle();
  		listItems.get(2).click();
  		String productNameAfterClick = "Nexus 6";
  		String productNameAfterClickItemString= "$650";
  		String expectedTitleString = "STORE";
  		softAssert.assertEquals(productName, productNameAfterClick);
  		softAssert.assertEquals(productPrice, productNameAfterClickItemString);
  		softAssert.assertEquals(actualTitleString, expectedTitleString);
  		softAssert.assertAll();
  	}
    public void verifyImagesPricesAndTitlesUrls3() {
  		SoftAssert softAssert = new SoftAssert();
  		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
  		String productName = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(4) > div > div > h4 > a")).getText();
  		String productPrice = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(4) > div > div > h5")).getText();
  		String actualTitleString = driver.getTitle();
  		listItems.get(3).click();
  		String productNameAfterClick = "Samsung galaxy s7";
  		String productNameAfterClickItemString= "$800";
  		String expectedTitleString = "STORE";
  		softAssert.assertEquals(productName, productNameAfterClick);
  		softAssert.assertEquals(productPrice, productNameAfterClickItemString);
  		softAssert.assertEquals(actualTitleString, expectedTitleString);
  		softAssert.assertAll();
  	}
    public void verifyImagesPricesAndTitlesUrls4() {
  		SoftAssert softAssert = new SoftAssert();
  		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
  		String productName = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(5) > div > div > h4 > a")).getText();
  		String productPrice = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(5) > div > div > h5")).getText();
  		String actualTitleString = driver.getTitle();
  		listItems.get(4).click();
  		String productNameAfterClick = "Iphone 6 32gb";
  		String productNameAfterClickItemString= "$790";
  		String expectedTitleString = "STORE";
  		softAssert.assertEquals(productName, productNameAfterClick);
  		softAssert.assertEquals(productPrice, productNameAfterClickItemString);
  		softAssert.assertEquals(actualTitleString, expectedTitleString);
  		softAssert.assertAll();
  	}
    public void verifyImagesPricesAndTitlesUrls5() {
  		SoftAssert softAssert = new SoftAssert();
  		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
  		String productName = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(6) > div > div > h4 > a")).getText();
  		String productPrice = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(6) > div > div > h5")).getText();
  		String actualTitleString = driver.getTitle();
  		listItems.get(5).click();
  		String productNameAfterClick = "Sony xperia z5";
  		String productNameAfterClickItemString= "$320";
  		String expectedTitleString = "STORE";
  		softAssert.assertEquals(productName, productNameAfterClick);
  		softAssert.assertEquals(productPrice, productNameAfterClickItemString);
  		softAssert.assertEquals(actualTitleString, expectedTitleString);
  		softAssert.assertAll();
  	}
    public void verifyImagesPricesAndTitlesUrls6() {
  		SoftAssert softAssert = new SoftAssert();
  		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
  		String productName = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(7) > div > div > h4 > a")).getText();
  		String productPrice = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(7) > div > div > h5")).getText();
  		String actualTitleString = driver.getTitle();
  		listItems.get(6).click();
  		String productNameAfterClick = "HTC One M9";
  		String productNameAfterClickItemString= "$700";
  		String expectedTitleString = "STORE";
  		softAssert.assertEquals(productName, productNameAfterClick);
  		softAssert.assertEquals(productPrice, productNameAfterClickItemString);
  		softAssert.assertEquals(actualTitleString, expectedTitleString);
  		softAssert.assertAll();
  	}
    public void verifyImagesPricesAndTitlesUrls8() {
  		SoftAssert softAssert = new SoftAssert();
  		wait.until(ExpectedConditions.visibilityOfAllElements(listOfSonysElements));
  		String productName = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h4")).getText();
  		String productPrice = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h5")).getText();
  		String actualTitleString = driver.getTitle();
  		listOfSonysElements.get(9).click();
  		//String productNameAfterClick = "Sony vaio i5";
  		//String productNameAfterClickItemString= "$790";
  		String productNameAfterClick = driver.findElement(By.cssSelector("#tbodyid > h2")).getText();
  		String productNameAfterClickItemString = driver.findElement(By.cssSelector("#tbodyid > h3")).getText();
  		String expectedTitleString = "STORE";
  		softAssert.assertEquals(productName, productNameAfterClick);
  		softAssert.assertEquals(productPrice, productNameAfterClickItemString);
  		softAssert.assertEquals(actualTitleString, expectedTitleString);
  		softAssert.assertAll();
  	}
    public void verifyImagesPricesAndTitlesUrls9() {
  		SoftAssert softAssert = new SoftAssert();
  		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
  		String productName = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(2) > div > div > h4 > a")).getText();
  		String productPrice = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(2) > div > div > h5")).getText();
  		String actualTitleString = driver.getTitle();
  		listItems.get(1).click();
  		String productNameAfterClick = "Sony vaio i7";
  		String productNameAfterClickItemString= "$790";
  		String expectedTitleString = "STORE";
  		softAssert.assertEquals(productName, productNameAfterClick);
  		softAssert.assertEquals(productPrice, productNameAfterClickItemString);
  		softAssert.assertEquals(actualTitleString, expectedTitleString);
  		softAssert.assertAll();
  	}
    public String getImageSrc1() {
        return imageElement1.getAttribute("src");
    }
 public String getImageSrc2() {
        return imageElement2.getAttribute("src");
    }
 public String getImageSrc3() {
     return imageElement3.getAttribute("src");
 }
public String getImageSrc4() {
     return imageElement4.getAttribute("src");
 }
public String getImageSrc5() {
    return imageElement5.getAttribute("src");
}
public String getImageSrc6() {
    return imageElement6.getAttribute("src");
}
public String getImageSrc7() {
    return imageElement7.getAttribute("src");
}
public String getImageSrc8() {
    return imageElement8.getAttribute("src");
}
public String getImageSrc9() {
    return imageElement9.getAttribute("src");
}
public String getImageSrc10() {
    return imageElement10.getAttribute("src");
}
public String getImageSrc11() {
    return imageElement11.getAttribute("src");
}
public String getImageSrc12() {
    return imageElement12.getAttribute("src");
}
public String getImageSrc13() {
    return imageElement13.getAttribute("src");
}
public String getImageSrc14() {
    return imageElement14.getAttribute("src");
}
    public boolean verifyConfirmation() {
    	return confirmationMessagElement.isDisplayed();
    }
    public boolean verifyConfirmationDescription() {
    	return passageConfirmationElement.isDisplayed();
    }
    public void typeName(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_NameElement));
		inputField_NameElement.clear();
		inputField_NameElement.sendKeys(input);
	}
    public void typeCreditCard(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_CreditCardElement));
		inputField_CreditCardElement.clear();
		inputField_CreditCardElement.sendKeys(input);
	}
    
    
	public boolean verifyTextOfItems() {
		wait.until(ExpectedConditions.visibilityOfAllElements(subtitleElements));
		return subtitleElements.get(0).isDisplayed();
	}
	public void clickOnTheButtonPlayVideo() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonPlayVideoElement)).click();
	}
	
	public void clickOnTheButtonLinearVideo() {
		wait.until(ExpectedConditions.elementToBeClickable(linearVideoElement)).click();
		actions.moveToElement(linearVideoElement).scrollByAmount(33, 21);
	}
	public void clickOnTheButtonPause() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonPausElement)).click();
	}
	public void closeTheFullScreen() {
		actions.moveToElement(screenExamplElement).doubleClick();
	}
	
	public void clickOnTheButtonVolume() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonVolumeButtonElement)).click();
	}
	public void clickOnTheButtonFullScreen() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonFullScreenElement)).click();
	}
	
	public void clickOnTheMediumScreen() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonMediumScreenElement)).click();
	}
	public void clickOnTheButtonBin() {
		wait.until(ExpectedConditions.elementToBeClickable(binRemoveElement)).click();
	}
	public void clickOnTheLogo() {
		wait.until(ExpectedConditions.elementToBeClickable(logoElement)).click();
	}
	public void clickButtonAddToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAddToCartElement)).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	public void verifyThePriceAndButtonBin() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAddToCartElement)).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		//wait.until(ExpectedConditions.visibilityOfAllElements(allLinks));
		String productName = driver.findElement(By.cssSelector("h3.price-container")).getText();
		//Klik na 1. proizvod
		allLinks.get(3).click();
		String productName2 = driver.findElement(By.cssSelector("h3#totalp.panel-title")).getText();
		assertNotEquals(productName, productName2);
	}
	public void clickOnTheFirstItem() {
		wait.until(ExpectedConditions.visibilityOfAllElements(subtitleElements));
		String productName = subtitleElements.get(0).findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h4 > a")).getText();
		//Klik na 1. proizvod
		subtitleElements.get(0).click();
		wait.until(ExpectedConditions.textToBe(By.tagName("h2"), productName));	
	
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

		public void saveScreenshot(byte[] s) {
			// TODO Auto-generated method stub
			
		}
		 
}