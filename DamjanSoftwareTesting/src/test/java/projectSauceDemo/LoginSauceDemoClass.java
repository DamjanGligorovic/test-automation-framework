package projectSauceDemo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class LoginSauceDemoClass {
	private WebDriver driver;
	Actions actions;
	private WebDriverWait wait;
	Select select;
	@FindBy (id = "user-name")
	WebElement inputField_Username;
	@FindBy(id = "password")
	WebElement inputField_Password;
	@FindBy(id = "login-button")
	WebElement buttonLogin;
	@FindBy(css  = "#inventory_container button")
	List<WebElement> listButtonsAddToCarts;
	@FindBy(css = "div.inventory_list div.inventory_item_img")
	List<WebElement> listItems;
	@FindBy(css="div.pricebar div.inventory_item_price")
	List<WebElement> listItemsPrice;
	@FindBy(id="back-to-products")
	WebElement linkBackToProducts;
	@FindBy(id="remove")
	WebElement buttonRemove;
	@FindBy(id="remove-sauce-labs-backpack")
	WebElement buttonRemoveHomePage;
	@FindBy(id="remove-sauce-labs-bike-light")
	WebElement buttonRemoveSauceLabsBikeLight;
	@FindBy(id ="remove-sauce-labs-backpack")
	WebElement iconShoppingRemoveButtonElement;
	@FindBy(css="button#react-burger-menu-btn")
	WebElement buttonMenuSettings;
	@FindBy(css="a#about_sidebar_link.bm-item.menu-item")
	WebElement buttonLinkAboutUs;
	@FindBy(css="a#logout_sidebar_link.bm-item.menu-item")
	WebElement buttonLinkLogOut;
	@FindBy(id="react-burger-cross-btn")
	WebElement buttonClose;
	@FindBy(css="select.product_sort_container")
	WebElement menuListOfFilters;
	@FindBy(css="select.product_sort_container option")
	List<WebElement> listFilters;
	@FindBy(css="[href=\"https://twitter.com/saucelabs\"]")
	WebElement iconTwitter;
	@FindBy(css="[href=\"https://www.facebook.com/saucelabs\"]")
	WebElement iconFacebook;
	@FindBy(css="[href=\"https://www.linkedin.com/company/sauce-labs/\"]")
	WebElement iconLinkedln;
	@FindBy(css="h3[data-test=\"error\"]")
	WebElement errorMessage1;
	@FindBy (css="data-test=\"inventory-item-price\"")
	List<WebElement>listPrices;
	@FindBy (css=".shopping_cart_link")
	WebElement iconShoppingCart;
	@FindBy(id="continue-shopping")
	WebElement buttonContinueShoppingElement;
	@FindBy(css="[alt=\"Sauce Labs Backpack\"]")
	WebElement imageSauceLabsBackpack;
	@FindBy(id="remove-test.allthethings()-t-shirt-(red)")
	WebElement allThingsRemoveElement;
	@FindBy(id="remove-sauce-labs-onesie")
	WebElement removeSauceLabsOnesiElement;
	@FindBy(id="remove-sauce-labs-fleece-jacket")
	WebElement removeFleeceJacketElement;
	@FindBy(id="remove-sauce-labs-bolt-t-shirt")
	WebElement removeTShirtElement;
	@FindBy(css="#item_4_img_link > img")
	WebElement imageElement1;
	@FindBy(css=" div.inventory_details_img_container > img")
	WebElement imageElement2;
	@FindBy(css="#item_4_img_link > img")
	WebElement imageFirstElement;
	@FindBy(css="#item_0_img_link > img")
	WebElement imageElement3;
	@FindBy(css=" div > div.inventory_details_img_container > img")
	WebElement imageElement4;
	@FindBy(css="#item_0_img_link > img")
	WebElement imageSecondElement;
	@FindBy(css="#item_1_img_link > img")
	WebElement imageElement5;
	@FindBy(css=" div > div.inventory_details_img_container > img")
	WebElement imageElement6;
	@FindBy(css="#item_1_img_link > img")
	WebElement imageThirdElement;
	@FindBy(css="#item_5_img_link > img")
	WebElement imageElement7;
	@FindBy(css="div.inventory_details_img_container > img")
	WebElement imageElement8;
	@FindBy(css="#item_5_img_link > img")
	WebElement imageFourthElement;
	@FindBy(css="#item_2_img_link > img")
	WebElement imageElement9;
	@FindBy(css="div.inventory_details_img_container > img")
	WebElement imageElement10;
	@FindBy(css="#item_2_img_link > img")
	WebElement imageFifthElement;
	@FindBy(css="#item_3_img_link > img")
	WebElement imageElement11;
	@FindBy(css=" div.inventory_details_img_container > img")
	WebElement imageElement12;
	@FindBy(css="#item_3_img_link > img")
	WebElement imageSixthElement;
	@FindBy(css="div.inventory_details_desc_container > div.inventory_details_name.large_size")
	WebElement imageSecondImageElementImagElement;
	
	public LoginSauceDemoClass (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	public void typeUsername(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_Username));
		inputField_Username.clear();
		inputField_Username.sendKeys(input);
	}
	public void typePassword(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_Password));
		inputField_Password.clear();
		inputField_Password.sendKeys(input);
	}
	public boolean verifyTheErrorMessage() {
		return errorMessage1.isDisplayed();
	}
	public void clickOnTheButtonRemoveSauce() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonRemoveSauceLabsBikeLight)).click();
	}
	public void clickOnTheButtonRemoveOnesie() {
		wait.until(ExpectedConditions.elementToBeClickable(removeSauceLabsOnesiElement)).click();
	}
	public void clickOnTheButtonRemoveTshirt() {
		wait.until(ExpectedConditions.elementToBeClickable(removeTShirtElement)).click();
	}


	public void clickOnTheButtonAllthings() {
		wait.until(ExpectedConditions.elementToBeClickable(allThingsRemoveElement)).click();
	}
	public void clickOnTheButtonFleeceJacket() {
		wait.until(ExpectedConditions.elementToBeClickable(removeFleeceJacketElement)).click();
	}
	public void clickOnTheIconShoppingCart() {
		wait.until(ExpectedConditions.elementToBeClickable(iconShoppingCart)).click();
	}
	public void clickOnTheButtonContinueShopping() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonContinueShoppingElement)).click();
	}
	public void clickOnTheRemoveButtonIconShopping() {
		wait.until(ExpectedConditions.elementToBeClickable(iconShoppingRemoveButtonElement)).click();
	}
	public void clickOnTheMenuFilters() {
		wait.until(ExpectedConditions.elementToBeClickable(menuListOfFilters)).click();
	}
	public void clickOnTheButtonRemove() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonRemove)).click();
	}
	public void clickOnTheButtonRemoveHomePage() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonRemoveHomePage)).click();
	}
	public void clickOnTheButtonLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonLogin)).click();
	}
	public void clickOnTheBackToLink() {
		wait.until(ExpectedConditions.elementToBeClickable(linkBackToProducts)).click();
	}
	public void clickOnTheFirstImage() {
		wait.until(ExpectedConditions.elementToBeClickable(imageFirstElement)).click();
	}
	public void clickOnTheSecondImage() {
		wait.until(ExpectedConditions.elementToBeClickable(imageSecondElement)).click();
	}
	public void clickOnTheThirdImage() {
		wait.until(ExpectedConditions.elementToBeClickable(imageThirdElement)).click();
	}
	public void clickOnTheFourthImage() {
		wait.until(ExpectedConditions.elementToBeClickable(imageFourthElement)).click();
	}
	public void clickOnTheFifthImage() {
		wait.until(ExpectedConditions.elementToBeClickable(imageFifthElement)).click();
	}
	public void clickOnTheSixthImage() {
		wait.until(ExpectedConditions.elementToBeClickable(imageSixthElement)).click();
	}
	public void clickOnTheSecondImage1() {
		wait.until(ExpectedConditions.elementToBeClickable(imageSecondImageElementImagElement)).click();
		
	}
	
	public void verifyAlertMessage() {
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	public void verifySettings(){
		wait.until(ExpectedConditions.visibilityOfAllElements(listFilters));
		listFilters.get(0).click();
		listFilters.get(1).click();
		listFilters.get(2).click();
		listFilters.get(3).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", iconTwitter);
		wait.until(ExpectedConditions.elementToBeClickable(iconTwitter)).click();
		driver.navigate().back();
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", iconFacebook);
		wait.until(ExpectedConditions.elementToBeClickable(iconFacebook)).click();
		driver.navigate().back();
       ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", iconLinkedln);
		wait.until(ExpectedConditions.elementToBeClickable(iconLinkedln)).click();
		driver.navigate().back();
		wait.until(ExpectedConditions.elementToBeClickable(buttonMenuSettings)).click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonLinkAboutUs)).click();
		driver.navigate().back();
		wait.until(ExpectedConditions.elementToBeClickable(buttonMenuSettings)).click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonLinkLogOut)).click();
	}
	public void verifySettings1(){
		wait.until(ExpectedConditions.visibilityOfAllElements(listFilters));
		listFilters.get(1).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		listFilters.get(2).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		listFilters.get(3).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", iconTwitter);
		wait.until(ExpectedConditions.elementToBeClickable(iconTwitter)).click();
		driver.navigate().back();
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", iconFacebook);
		wait.until(ExpectedConditions.elementToBeClickable(iconFacebook)).click();
		driver.navigate().back();
       ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", iconLinkedln);
		wait.until(ExpectedConditions.elementToBeClickable(iconLinkedln)).click();
		driver.navigate().back();
		wait.until(ExpectedConditions.elementToBeClickable(buttonMenuSettings)).click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonLinkAboutUs)).click();
		driver.navigate().back();
		wait.until(ExpectedConditions.elementToBeClickable(buttonMenuSettings)).click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonLinkLogOut)).click();
	}

	public void clickOnTheListButtonsToCarts(int index) {
		wait.until(ExpectedConditions.visibilityOfAllElements(listButtonsAddToCarts));
		listButtonsAddToCarts.get(index).click();
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
	 
	public void clickOnTheListItems0() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("#item_4_title_link div")).getText();
		listItems.get(0).click();
		String productNameAfterClick = "Sauce Labs Backpack";
		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListItems1() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("#item_0_title_link > div")).getText();
		listItems.get(1).click();
		String productNameAfterClick = "Sauce Labs Bike Light";
		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListItems2() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("#item_1_title_link > div")).getText();
		listItems.get(2).click();
		String productNameAfterClick = "Sauce Labs Bolt T-Shirt";
		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListItems3() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("#item_5_title_link > div")).getText();
		listItems.get(3).click();
		String productNameAfterClick = "Sauce Labs Fleece Jacket";
		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListItems4() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("#item_2_title_link > div")).getText();
		listItems.get(4).click();
		String productNameAfterClick = "Sauce Labs Onesie";
		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListItems5() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("#item_3_title_link > div")).getText();
		listItems.get(5).click();
		//wait.until(ExpectedConditions.textToBe(By.tagName("h1"), productName));
		String productNameAfterClick = "Test.allTheThings() T-Shirt (Red)";
		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListItems6() {
		SoftAssert softAssert = new SoftAssert();
		//wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.inventory_list div.inventory_item_img"), 6));
		String productName = driver.findElement(By.cssSelector("#item_4_title_link > div")).getText();
		listItems.get(0).click();
		String productName1 = driver.findElement(By.cssSelector("div.inventory_details_desc_container > div.inventory_details_name.large_size")).getText();
		//String productName1 = "Sauce Labs Backpack";
		String actualTitle = "Swag Labs";
		String expectedTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory-item.html?id=4";
		softAssert.assertEquals(productName, productName1, "The names are not different");
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	
	
		public void clickOnTheListItems7() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName = driver.findElement(By.cssSelector("#item_0_title_link > div")).getText();
			String productName1 = driver.findElement(By.cssSelector(" div:nth-child(2) > div.inventory_item_description > div.pricebar > div")).getText();
			listItems.get(1).click();
			String productNameAfterClick = "Sauce Labs Bike Light";
			String productNameAfterClick1 = "$9.99";
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			softAssert.assertNotEquals(productName, productNameAfterClick);
			softAssert.assertNotEquals(productName1, productNameAfterClick1);
			softAssert.assertEquals(actualUrl, expectedUrl);
			softAssert.assertAll();
	}
		public void clickOnTheListItems8() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName = driver.findElement(By.cssSelector("#item_1_title_link > div")).getText();
			String productName1 = driver.findElement(By.cssSelector(" div:nth-child(3) > div.inventory_item_description > div.pricebar > div")).getText();
			listItems.get(2).click();
			String productNameAfterClick = "Sauce Labs Bolt T-Shirt";
			String productNameAfterClick1 = "$15.99";
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			softAssert.assertNotEquals(productName, productNameAfterClick);
			softAssert.assertNotEquals(productName1, productNameAfterClick1);
			softAssert.assertEquals(actualUrl, expectedUrl);
			softAssert.assertAll();
	}
		public void clickOnTheListItems9() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName = driver.findElement(By.cssSelector("#item_5_title_link > div")).getText();
			String productName1 = driver.findElement(By.cssSelector("div:nth-child(4) > div.inventory_item_description > div.pricebar > div")).getText();
			listItems.get(3).click();
			String productNameAfterClick = "Sauce Labs Fleece Jacket";
			String productNameAfterClick1 = "$49.99";
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			softAssert.assertNotEquals(productName, productNameAfterClick);
			softAssert.assertNotEquals(productName1, productNameAfterClick1);
			softAssert.assertEquals(actualUrl, expectedUrl);
			softAssert.assertAll();
	}
		public void clickOnTheListItems10() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName = driver.findElement(By.cssSelector("#item_2_title_link > div")).getText();
			String productName1 = driver.findElement(By.cssSelector("div:nth-child(5) > div.inventory_item_description > div.pricebar > div")).getText();
			listItems.get(4).click();
			String productNameAfterClick = "Sauce Labs Onesie";
			String productNameAfterClick1 = "$7.99";
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			softAssert.assertNotEquals(productName, productNameAfterClick);
			softAssert.assertNotEquals(productName1, productNameAfterClick1);
			softAssert.assertEquals(actualUrl, expectedUrl);
			softAssert.assertAll();
	}
		public void clickOnTheListItems11() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName = driver.findElement(By.cssSelector("#item_3_title_link > div")).getText();
			String productName1 = driver.findElement(By.cssSelector(" div:nth-child(6) > div.inventory_item_description > div.pricebar > div")).getText();
			listItems.get(5).click();
			String productNameAfterClick = "Test.allTheThings() T-Shirt (Red)";
			String productNameAfterClick1 = "$15.99";
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			softAssert.assertNotEquals(productName, productNameAfterClick);
			softAssert.assertNotEquals(productName1, productNameAfterClick1);
			softAssert.assertEquals(actualUrl, expectedUrl);
			softAssert.assertAll();
	}
		public void clickOnTheListItems12() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName = driver.findElement(By.cssSelector("#item_4_title_link > div")).getText();
			listItems.get(0).click();
			String productNameAfterClick = "Sauce Labs Backpack";
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			softAssert.assertNotEquals(productName, productNameAfterClick);
			softAssert.assertEquals(actualUrl, expectedUrl);
			softAssert.assertAll();
	}
		public void clickOnTheListItems13() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName = driver.findElement(By.cssSelector("#item_0_title_link > div")).getText();
			WebElement productName2 = driver.findElement(By.cssSelector("[alt=\"Sauce Labs Bike Light\"]"));
			listItems.get(1).click();
			String productNameAfterClick = "Sauce Labs Bike Light";
			WebElement productName3 = driver.findElement(By.cssSelector("[alt=\"Sauce Labs Bike Light\"]"));
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			softAssert.assertNotEquals(productName, productNameAfterClick);
			softAssert.assertNotEquals(productName2, productName3);
			softAssert.assertEquals(actualUrl, expectedUrl);
			softAssert.assertAll();
	}
		public void clickOnTheListItems14() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName = driver.findElement(By.cssSelector("#item_1_title_link > div")).getText();
			WebElement productName2 = driver.findElement(By.cssSelector("[alt=\"Sauce Labs Bolt T-Shirt\"]"));
			listItems.get(2).click();
			String productNameAfterClick = "Sauce Labs Bolt T-Shirt";
			WebElement productName3 = driver.findElement(By.cssSelector("[alt=\"Sauce Labs Bolt T-Shirt\"]"));
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			softAssert.assertNotEquals(productName, productNameAfterClick);
			softAssert.assertNotEquals(productName2, productName3);
			softAssert.assertEquals(actualUrl, expectedUrl);
			softAssert.assertAll();
	}
		public void clickOnTheListItems15() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName = driver.findElement(By.cssSelector("#item_5_title_link > div")).getText();
			WebElement productName2 = driver.findElement(By.cssSelector("[alt=\"Sauce Labs Fleece Jacket\"]"));
			listItems.get(3).click();
			String productNameAfterClick = "Sauce Labs Fleece Jacket";
			WebElement productName3 = driver.findElement(By.cssSelector("[alt=\"Sauce Labs Fleece Jacket\"]"));
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			softAssert.assertNotEquals(productName, productNameAfterClick);
			softAssert.assertNotEquals(productName2, productName3);
			softAssert.assertEquals(actualUrl, expectedUrl);
			softAssert.assertAll();
	}
		public void clickOnTheListItems16() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName = driver.findElement(By.cssSelector("#item_2_title_link > div")).getText();
			WebElement productName2 = driver.findElement(By.cssSelector("[alt=\"Sauce Labs Onesie\"]"));
			listItems.get(4).click();
			String productNameAfterClick = "Sauce Labs Onesie";
			WebElement productName3 = driver.findElement(By.cssSelector("[alt=\"Sauce Labs Onesie\"]"));
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			softAssert.assertNotEquals(productName, productNameAfterClick);
			softAssert.assertNotEquals(productName2, productName3);
			softAssert.assertEquals(actualUrl, expectedUrl);
			softAssert.assertAll();
	}
		public void clickOnTheListItems17() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName = driver.findElement(By.cssSelector("#item_3_title_link > div")).getText();
			WebElement productName2 = driver.findElement(By.cssSelector("[alt=\"Test.allTheThings() T-Shirt (Red)\"]"));
			listItems.get(5).click();
			String productNameAfterClick = "Test.allTheThings() T-Shirt (Red)";
			WebElement productName3 = driver.findElement(By.cssSelector("[alt=\"Test.allTheThings() T-Shirt (Red)\"]"));
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			softAssert.assertNotEquals(productName, productNameAfterClick);
			softAssert.assertNotEquals(productName2, productName3);
			softAssert.assertEquals(actualUrl, expectedUrl);
			softAssert.assertAll();
	}
		public void verifyThePriceVisualUser() {
			SoftAssert softAssert = new SoftAssert();

			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName1 = driver.findElement(By.cssSelector("  div:nth-child(1) > div.inventory_item_description > div.pricebar > div")).getText();
			WebElement productName3 = driver.findElement(By.cssSelector("[alt=\"Sauce Labs Backpack\"]"));

			listItems.get(0).click();
			String productName2 = driver.findElement(By.cssSelector(" div.inventory_details_desc_container > div.inventory_details_price")).getText();
			WebElement productName4 = driver.findElement(By.cssSelector("[alt=\"Sauce Labs Backpack\"]"));

			softAssert.assertNotEquals(productName1, productName2);
			softAssert.assertNotEquals(productName3, productName4);

			softAssert.assertAll();


		}
		public void verifyThePriceVisualUser1() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName1 = driver.findElement(By.cssSelector("div:nth-child(2) > div.inventory_item_description > div.pricebar > div")).getText();
			WebElement productName3 = driver.findElement(By.cssSelector("[alt=\"Sauce Labs Bike Light\"]"));
			listItems.get(1).click();
			String productName2 = driver.findElement(By.cssSelector(" div.inventory_details_desc_container > div.inventory_details_price")).getText();
			WebElement productName4 = driver.findElement(By.cssSelector("[alt=\"Sauce Labs Bike Light\"]"));
			softAssert.assertNotEquals(productName1, productName2);
			softAssert.assertNotEquals(productName3, productName4);
			softAssert.assertAll();
		}
		public void verifyThePriceVisualUser2() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName1 = driver.findElement(By.cssSelector("div:nth-child(3) > div.inventory_item_description > div.pricebar > div")).getText();
			listItems.get(2).click();
			String productName2 = driver.findElement(By.cssSelector("  div.inventory_details_desc_container > div.inventory_details_price")).getText();
			softAssert.assertNotEquals(productName1, productName2);
			softAssert.assertAll();
		}
		public void verifyThePriceVisualUser3() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName1 = driver.findElement(By.cssSelector("div:nth-child(4) > div.inventory_item_description > div.pricebar > div")).getText();
			listItems.get(3).click();
			String productName2 = driver.findElement(By.cssSelector(" div.inventory_details_desc_container > div.inventory_details_price")).getText();
			softAssert.assertNotEquals(productName1, productName2);
			softAssert.assertAll();
		}
		public void verifyThePriceVisualUser4() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName1 = driver.findElement(By.cssSelector("div:nth-child(5) > div.inventory_item_description > div.pricebar > div")).getText();
			listItems.get(4).click();
			String productName2 = driver.findElement(By.cssSelector("div.inventory_details_desc_container > div.inventory_details_price")).getText();
			softAssert.assertNotEquals(productName1, productName2);
			softAssert.assertAll();
		}
		public void verifyThePriceVisualUser5() {
			SoftAssert softAssert = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
			String productName1 = driver.findElement(By.cssSelector("div:nth-child(6) > div.inventory_item_description > div.pricebar > div")).getText();
			listItems.get(5).click();
			String productName2 = driver.findElement(By.cssSelector(" div.inventory_details_desc_container > div.inventory_details_price")).getText();
			softAssert.assertNotEquals(productName1, productName2);
			softAssert.assertAll();
		}
	public void clickOnTheListPrice0() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("div > div:nth-child(1) > div.inventory_item_description > div.pricebar > div")).getText();
		listItems.get(0).click();
		String productNameAfterClick = "$29.99";
		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListPrice1() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("div > div:nth-child(2) > div.inventory_item_description > div.pricebar > div")).getText();
		listItems.get(1).click();
		String productNameAfterClick = "$9.99";
		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListPrice2() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("div > div:nth-child(3) > div.inventory_item_description > div.pricebar > div")).getText();
		listItems.get(2).click();
		String productNameAfterClick = "$15.99";
		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListPrice3() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("div > div:nth-child(4) > div.inventory_item_description > div.pricebar > div")).getText();
		listItems.get(3).click();
		String productNameAfterClick = "$49.99";
		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListPrice4() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector(" div > div:nth-child(5) > div.inventory_item_description > div.pricebar > div")).getText();
		listItems.get(4).click();
		String productNameAfterClick = "$7.99";
		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListPrice5() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("div > div:nth-child(6) > div.inventory_item_description > div.pricebar > div")).getText();
		listItems.get(5).click();
		String productNameAfterClick = "$15.99";
		softAssert.assertEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListPrice6() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector("div > div:nth-child(1) > div.inventory_item_description > div.pricebar > div")).getText();
		listItems.get(0).click();
		String productNameAfterClick = "$29.99";
		softAssert.assertNotEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	public void clickOnTheListPrice7() {
		SoftAssert softAssert = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfAllElements(listItems));
		String productName = driver.findElement(By.cssSelector(" div:nth-child(2) > div.inventory_item_description > div.pricebar > div")).getText();
		listItems.get(1).click();
		String productNameAfterClick = "$9.99";
		softAssert.assertNotEquals(productName, productNameAfterClick);
		softAssert.assertAll();
	}
	
	}

