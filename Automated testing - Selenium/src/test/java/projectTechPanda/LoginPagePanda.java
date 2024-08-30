/* Decompiler 363ms, total 540ms, lines 120 */
package projectTechPanda;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePanda {
   private WebDriver driver;
   Actions actions;
   private WebDriverWait wait;
   Select select;
   JavascriptExecutor js;
   @FindBy(
      css = "#nav > ol > li.level0.nav-1.first > a"
   )
   WebElement mobileLink;
   @FindBy(
      css = "body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > button"
   )
   WebElement addToCart;
   @FindBy(
      css = "body > div > div > div.main-container.col1-layout > div > div > div > ul > li > ul > li > span"
   )
   WebElement confirmationMessageAdding;
   @FindBy(
      id = "coupon_code"
   )
   WebElement couponCode;
   @FindBy(
      css = "#discount-coupon-form > div > div > div > div > button"
   )
   WebElement buttonApply;
   @FindBy(
      css = "body > div > div > div.main-container.col1-layout > div > div > div > ul > li > ul > li > span"
   )
   WebElement verifyingConfirmationCouponMessage;
   @FindBy(
      css = "#shopping-cart-totals-table > tbody > tr:nth-child(1) > td:nth-child(2) > span"
   )
   WebElement subtotalPrice;
   @FindBy(
      css = "#shopping-cart-totals-table > tbody > tr:nth-child(2) > td:nth-child(2) > span"
   )
   WebElement discountPrice;
   @FindBy(
      css = "#shopping-cart-totals-table > tfoot > tr > td:nth-child(2) > strong > span"
   )
   WebElement totalPrice;

   public LoginPagePanda(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver, this);
      this.actions = new Actions(driver);
      this.wait = new WebDriverWait(driver, Duration.ofSeconds(15L));
      this.js = (JavascriptExecutor)driver;
   }

   public void clickOnTheMobile() {
      ((WebElement)this.wait.until(ExpectedConditions.elementToBeClickable(this.mobileLink))).click();
      ((WebElement)this.wait.until(ExpectedConditions.elementToBeClickable(this.addToCart))).click();
   }

   public boolean convertPrices() {
      String subtotalPriceText = this.subtotalPrice.getText().replaceAll("[^\\d.]", "");
      String discountPriceText = this.discountPrice.getText().replaceAll("[^\\d.]", "");
      String totalPriceText = this.totalPrice.getText().replaceAll("[^\\d.]", "");
      Double subtotalPriceValue = Double.valueOf(subtotalPriceText);
      Double discountPriceValue = Double.valueOf(discountPriceText);
      double difference = subtotalPriceValue - discountPriceValue;
      System.out.println("Difference between prices: " + difference);
      String converted475 = String.valueOf(difference);
      boolean isEqual = converted475.equals(totalPriceText);
      return isEqual;
   }

   private boolean assertTrue(boolean isEqual) {
      return false;
   }

   private String ToString(double difference) {
      return null;
   }

   private Double DoublevalueOf(String subtotalPrice1) {
      return null;
   }

   public boolean verifyAddingMessage() {
      return this.confirmationMessageAdding.isDisplayed();
   }

   public void typeCode(String text) {
      this.wait.until(ExpectedConditions.visibilityOf(this.couponCode));
      this.couponCode.sendKeys(new CharSequence[]{text});
   }

   public void clickButtonApply() {
      ((WebElement)this.wait.until(ExpectedConditions.elementToBeClickable(this.buttonApply))).click();
   }

   public boolean verifyCouponMessage() {
      return this.verifyingConfirmationCouponMessage.isDisplayed();
   }

   public String verifySubotalPrice() {
      return this.subtotalPrice.getText();
   }

   public String verifySDiscountPrice() {
      return this.discountPrice.getText();
   }
}
