package projectMyStore;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {
	WebDriver driver;
	WebDriverWait wait;
	String parentWindowID;
	@FindBy (css  = "a[href='#/product/01']")  //a[href='#/product/01']   //body > div > main > section > ul > li:nth-child(1) > a
	WebElement poloShirtLinkElement;
	@FindBy(xpath =  "//iframe[@id='jsx-iframe-97e3262d1e']")
	WebElement iframElement;
	@FindBy (css = "body > div > main > section > ul > li:nth-child(1) > a > p.products__list__list-item__item__title")
	WebElement titleFirstPagElement;
	@FindBy(css = "body > div.mystore > main > section > ul > li:nth-child(1) > a > p.products__list__list-item__item__price")
	WebElement priceFirstPageElement;
	@FindBy(css = "div.product-detail__container > h1")
	WebElement titleOnTheSecondPagElement;
	@FindBy(xpath = "/html/body/div[1]/main/section/div[1]/ul/li/p[1]")
	WebElement titleOnTheThirdPageElement;
	@FindBy(css = "body > div.mystore > main > div > section.product-detail > div.product-detail__container > p.product-detail__price")
	WebElement priceSecondPagElement;
	@FindBy(css = "body > div.mystore > main > div > section.product-detail > div.product-detail__container > button")
	WebElement addCardElement;
	@FindBy(css  = "body > div.mystore > header > div > div > a")
	WebElement iconKorpaElement;
	@FindBy(css  = "body > div.mystore > main > section > div.cart__price > span.cart__price-amount")
	WebElement priceOnTheThirdPagElement;
	@FindBy(css = "body > div.mystore > main > section > div.order-summary > ul > li > button > img")
	WebElement binIconElement;
	@FindBy(css ="body > div > main > section > a")
	WebElement returnButtonElement;
	@FindBy(css = ".products__list li")
	List<WebElement> listIconsElements;
	@FindBy(css = "body > div.mystore")
	WebElement clickElement;
	@FindBy(css= "body > div.mystore > main > div > section.product-detail > div.product-detail__container > p.product-detail__price")
	WebElement price24;
	
	@FindBy(css = "p.order-summary__list__list-item__title")
    WebElement productTitle;
	@FindBy(css= "[aria-label=\"country\"]")
	WebElement meniLanguagesElement;
	@FindBy(css= "body > div.mystore > main > footer > div > select > option:nth-child(3)")
	WebElement belgiumLanguagElement;
		Actions action;
	
	public MainPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		parentWindowID = driver.getWindowHandle(); 
		action = new Actions(driver);
	}
	public void chooseLanguage() {
		 wait.until(ExpectedConditions.elementToBeClickable(meniLanguagesElement)).click();
		 wait.until(ExpectedConditions.elementToBeClickable(belgiumLanguagElement)).click();


	}
	
	public void switchToChildWindow1() {
		 {
			//String productName = poloShirtLinkElement.findElement(By.cssSelector("body > div > main > section > ul > li:nth-child(1) > a > p.products__list__list-item__item__title")).getText();
			//((JavascriptExecutor) driver).executeScript("window.open()");
			 wait.until(ExpectedConditions.elementToBeClickable(poloShirtLinkElement)).click();
			 wait.until(ExpectedConditions.elementToBeClickable(addCardElement)).click();

				String href = iconKorpaElement.getAttribute("href");

				((JavascriptExecutor) driver).executeScript("window.open('" + href + "', '_blank');");
			//listIconsElements.get(0).click();
		//	wait.until(ExpectedConditions.numberOfWindowsToBe(expected));

		//	Set<String> allWindowSet = driver.getWindowHandles();
		//	for (String childWindow : allWindowSet) {
		//		if (!childWindow.equalsIgnoreCase(parentWindowID)) {
		//			driver.switchTo().window(childWindow);
		//		/	wait.until(ExpectedConditions.textToBe(By.cssSelector("body > div.mystore > main > div > section.product-detail > div.product-detail__container > h1"), productName));
//
			//	}
				
		//	}
		 }
			
		 }
	
	public void verifyTheReturnButtonAndBin() {
		wait.until(ExpectedConditions.elementToBeClickable(poloShirtLinkElement)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addCardElement)).click();
		String href = iconKorpaElement.getAttribute("href");
		((JavascriptExecutor) driver).executeScript("window.open('" + href + "', '_blank');");
		
		wait.until(ExpectedConditions.elementToBeClickable(iconKorpaElement)).click();
		
		 Set<String> allWindowSet = driver.getWindowHandles();
			for (String childWindow : allWindowSet) {
				if (!childWindow.equalsIgnoreCase(parentWindowID)) {
					driver.switchTo().window(childWindow);
					wait.until(ExpectedConditions.elementToBeClickable(binIconElement)).click();

					wait.until(ExpectedConditions.elementToBeClickable(returnButtonElement)).click();

				}	
			}
		
	}
	public void clicOnTheButtonBin() {
		wait.until(ExpectedConditions.elementToBeClickable(binIconElement)).click();
	}
	public void clickOnTheReturnHome() {
		wait.until(ExpectedConditions.elementToBeClickable(returnButtonElement)).click();

	}
	public void verifyTitlesHeadphones() {
		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ul.products__list li"), 9));
		String productName = listIconsElements.get(1).findElement(By.cssSelector("body > div.mystore > main > section > ul > li:nth-child(2) > a > p.products__list__list-item__item__title")).getText();
		listIconsElements.get(1).click();
		wait.until(ExpectedConditions.textToBe(By.cssSelector("body > div.mystore > main > div > section.product-detail > div.product-detail__container > h1"), productName));
		
		}

	public void verifyTitles() {
	wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ul.products__list li"), 9));
	String productName = listIconsElements.get(0).findElement(By.cssSelector("body > div > main > section > ul > li:nth-child(1) > a > p.products__list__list-item__item__title")).getText();
	listIconsElements.get(0).click();
	wait.until(ExpectedConditions.textToBe(By.cssSelector("body > div.mystore > main > div > section.product-detail > div.product-detail__container > h1"), productName));
	
	}
	public void verifyTitles3() {
	wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ul.products__list li"), 9));
	String productName = listIconsElements.get(0).findElement(By.cssSelector("body > div > main > section > ul > li:nth-child(1) > a > p.products__list__list-item__item__title")).getText();
	listIconsElements.get(0).click();
	wait.until(ExpectedConditions.elementToBeClickable(addCardElement)).click();
   String script = "window.open(arguments[0], '_blank');";
    ((JavascriptExecutor) driver).executeScript(script, iconKorpaElement.getAttribute("href"));
   // ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", iconKorpaElement);

  action.moveToElement(iconKorpaElement).contextClick().build().perform();
	action.moveToElement(iconKorpaElement).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
 // wait.until(ExpectedConditions.elementToBeClickable(iconKorpaElement)).click();

   Set<String> allWindowSet = driver.getWindowHandles();
	for (String childWindow : allWindowSet) {
		if (!childWindow.equalsIgnoreCase(parentWindowID)) {
			driver.switchTo().window(childWindow);
			wait.until(ExpectedConditions.textToBe(By.cssSelector("body > div.mystore > main > section > div.order-summary > ul > li > p.order-summary__list__list-item__title"), productName));
	
		}
 			
	}
	}
	public void verifyPrice() {
		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ul.products__list li"), 9));
		String productPrice = listIconsElements.get(0).findElement(By.cssSelector("body > div.mystore > main > section > ul > li:nth-child(1) > a > p.products__list__list-item__item__price")).getText();
		listIconsElements.get(0).click();
		wait.until(ExpectedConditions.textToBe(By.cssSelector("body > div.mystore > main > div > section.product-detail > div.product-detail__container > p.product-detail__price"), productPrice));
		}

	
	public void clickOnTheLink() {
      String script = "window.open(arguments[0], '_blank');";
        ((JavascriptExecutor) driver).executeScript(script, poloShirtLinkElement.getAttribute("href"));
	}
	public void clickOnTheLink1() {
		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ul.products__list li"), 9));
		String productName = listIconsElements.get(0).findElement(By.cssSelector("body > div > main > section > ul > li:nth-child(1) > a > p.products__list__list-item__item__title")).getText();
		//((JavascriptExecutor) driver).executeScript("window.open()");
		((JavascriptExecutor) driver).executeScript("window.open('" + "https://www.mystoredemo.io/#/product/01" + "', '_blank');");
		//listIconsElements.get(0).click();
		wait.until(ExpectedConditions.textToBe(By.cssSelector("body > div.mystore > main > div > section.product-detail > div.product-detail__container > h1"), productName));
	
	}
	public void clickOnTheLinkItemPolo() {
		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ul.products__list li"), 9));
		String productName = listIconsElements.get(0).findElement(By.cssSelector("body > div > main > section > ul > li:nth-child(1) > a > p.products__list__list-item__item__title")).getText();
		((JavascriptExecutor) driver).executeScript("window.open()");
		listIconsElements.get(0).click();
		wait.until(ExpectedConditions.textToBe(By.cssSelector("body > div.mystore > main > div > section.product-detail > div.product-detail__container > h1"), productName));


	}
	public void waitExpectedNumberWindows(int expected) {
		wait.until(ExpectedConditions.numberOfWindowsToBe(expected));
	}
	 public void switchToParentWindow() {
		 driver.switchTo().window(parentWindowID);
	 }
	 public void switchToIframe() {
	  ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", iframElement);

	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframElement));

	}
	 public void verifyPriceOnTheThirdPage() {
			wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ul.products__list li"), 9));
			String productPrice = listIconsElements.get(0).findElement(By.cssSelector("body > div.mystore > main > section > ul > li:nth-child(1) > a > p.products__list__list-item__item__price")).getText();
			listIconsElements.get(0).click();
			wait.until(ExpectedConditions.elementToBeClickable(addCardElement)).click();
		 //   String script = "window.open(arguments[0], '_blank');";
		  //  ((JavascriptExecutor) driver).executeScript(script, iconKorpaElement.getAttribute("href"));
	       // ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", iconKorpaElement);

			action.moveToElement(iconKorpaElement).contextClick().build().perform();
			action.moveToElement(iconKorpaElement).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
			//wait.until(ExpectedConditions.elementToBeClickable(iconKorpaElement)).click();

		   Set<String> allWindowSet = driver.getWindowHandles();
			for (String childWindow : allWindowSet) {
				if (!childWindow.equalsIgnoreCase(parentWindowID)) {
					driver.switchTo().window(childWindow);
					wait.until(ExpectedConditions.textToBe(By.cssSelector("body > div.mystore > main > section > div.cart__price > span.cart__price-amount"), productPrice));

				}

			}
		}
	 public boolean verifyVisibilityofiframe() {
		 return iframElement.isDisplayed();
	 }
	public void switchToChildWindow(int expected) {
			String productName = poloShirtLinkElement.findElement(By.cssSelector("body > div > main > section > ul > li:nth-child(1) > a > p.products__list__list-item__item__title")).getText();

				String href = poloShirtLinkElement.getAttribute("href");

			//((JavascriptExecutor) driver).executeScript("window.open()");

			((JavascriptExecutor) driver).executeScript("window.open('" + href + "', '_blank');");
			wait.until(ExpectedConditions.elementToBeClickable(poloShirtLinkElement)).click();

		//	((JavascriptExecutor) driver).executeScript("window.open('" + "https://www.mystoredemo.io/#/product/01" + "', '_blank');");
			//listIconsElements.get(0).click();
			wait.until(ExpectedConditions.numberOfWindowsToBe(expected));

			Set<String> allWindowSet = driver.getWindowHandles();
			for (String childWindow : allWindowSet) {
				if (!childWindow.equalsIgnoreCase(parentWindowID)) {
					driver.switchTo().window(childWindow);
					wait.until(ExpectedConditions.textToBe(By.cssSelector("body > div.mystore > main > div > section.product-detail > div.product-detail__container > h1"), productName));

				}
				
	}
			
		 }
		
		 
		 
	
	
	public void clickPoloShirt() {
		wait.until(ExpectedConditions.elementToBeClickable(poloShirtLinkElement)).click();

	}
	public void clickAddCart() {
		wait.until(ExpectedConditions.elementToBeClickable(addCardElement)).click();

	}
	public void clickShopImg() {
		String href = iconKorpaElement.getAttribute("href");
		((JavascriptExecutor) driver).executeScript("window.open('" + href + "', '_blank');");
	}
	public boolean verifyProductName(String expectedName) {
        wait.until(ExpectedConditions.visibilityOf(productTitle));
        String actualName = productTitle.getText();
        return actualName.equals(expectedName );
    }

	
	public void switchToChildWindowThirdPage() {	
		 {
		
		Set<String> allWindowSet1 = driver.getWindowHandles();
		for (String childWindow1 : allWindowSet1) {
		if (!childWindow1.equalsIgnoreCase(parentWindowID)) {
		driver.switchTo().window(childWindow1);
		
					}

		

		} 
		 }
	}
		
	
	public void switchToChildWindowPrice(int expected) {
		 {			
			String productName = poloShirtLinkElement.findElement(By.cssSelector("body > div > main > section > ul > li:nth-child(1) > a > p.products__list__list-item__item__price")).getText();

				String href = poloShirtLinkElement.getAttribute("href");

			//((JavascriptExecutor) driver).executeScript("window.open()");

			((JavascriptExecutor) driver).executeScript("window.open('" + href + "', '_blank');");
		//	((JavascriptExecutor) driver).executeScript("window.open('" + "https://www.mystoredemo.io/#/product/01" + "', '_blank');");
			//listIconsElements.get(0).click();
			wait.until(ExpectedConditions.elementToBeClickable(poloShirtLinkElement)).click();

			wait.until(ExpectedConditions.numberOfWindowsToBe(expected));

			Set<String> allWindowSet = driver.getWindowHandles();
			for (String childWindow : allWindowSet) {
				if (!childWindow.equalsIgnoreCase(parentWindowID)) {
					driver.switchTo().window(childWindow);
					wait.until(ExpectedConditions.textToBe(By.cssSelector("body > div.mystore > main > div > section.product-detail > div.product-detail__container > p.product-detail__price"), productName));

				}
				
	}
			
		 }

	}

public void switchToChildWindow1(int expected) {
	 {			

			String href = poloShirtLinkElement.getAttribute("href");

		//((JavascriptExecutor) driver).executeScript("window.open()");

		((JavascriptExecutor) driver).executeScript("window.open('" + href + "', '_blank');");
	//	((JavascriptExecutor) driver).executeScript("window.open('" + "https://www.mystoredemo.io/#/product/01" + "', '_blank');");
		//listIconsElements.get(0).click();
		wait.until(ExpectedConditions.elementToBeClickable(poloShirtLinkElement)).click();

		wait.until(ExpectedConditions.numberOfWindowsToBe(expected));

		Set<String> allWindowSet = driver.getWindowHandles();
		for (String childWindow : allWindowSet) {
			if (!childWindow.equalsIgnoreCase(parentWindowID)) {
				driver.switchTo().window(childWindow);

			}
			
}
		
	 }

}
}
