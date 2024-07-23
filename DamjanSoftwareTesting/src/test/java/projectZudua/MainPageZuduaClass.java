package projectZudua;

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
import org.testng.asserts.SoftAssert;

public class MainPageZuduaClass {
	WebDriver driver;
	Actions actions;
	WebDriverWait wait;
	//1. element --------    1. page
	//LDNIO LC112
	@FindBy(css="[data-id=\"16c4856\"]")
	List<WebElement> list_ItemsElements;
	@FindBy(css="[data-id=\"d740229\"]")
	List<WebElement> list_ImgElements;
	@FindBy(css="div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")
	List<WebElement> list_NameElements;
	@FindBy(css=".jet-woo-product-price")
	List<WebElement> list_PriceElements;
	@FindBy(css="[data-id=\"98027a4\"]")
	List<WebElement>list_AddToCartElements;
	@FindBy(css =".attachment-woocommerce_thumbnail.size-woocommerce_thumbnail.wp-image-113201.entered.litespeed-loaded")
	WebElement image_First_Element;
	@FindBy(css="[src=\"https://zudua.co.tz/zud-cont/uploads/WhatsApp-Image-2023-03-30-at-5.14.28-PM-247x247.jpeg\"]")
	WebElement image_First_Element1;
	@FindBy(css=".attachment-woocommerce_thumbnail.size-woocommerce_thumbnail.wp-image-179716.entered.litespeed-loaded")
	WebElement item12_ClickElement;
	
	//1. element ------2. Page
	@FindBy(css=".product_title.entry-title")
	WebElement name_TitleElement;
	@FindBy(css="[data-thumb=\"https://zudua.co.tz/zud-cont/uploads/fast-100x100.png\"]")
	WebElement list_ImgElements2;
	@FindBy(css  = "[src=\"https://zudua.co.tz/zud-cont/uploads/HF942GEES.png\"]")
	WebElement image_Second_Element;
	@FindBy(css = "img.wp-post-image")
	List<WebElement> second_ItemImagElements;
	public MainPageZuduaClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));	
	}
	//First Item Name, Price and Image
	
	public void verifyFirstItemName() {
	 SoftAssert softAssert = new SoftAssert();
	 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

	 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
	 String actual_Name = list_ItemsElements.get(0).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
	// String actual_Price = list_ItemsElements.get(0).findElement(By.cssSelector(".jet-woo-product-price")).getText();
	 list_NameElements.get(0).click();
	// String expected_Price = "Sh30,000.Sh20,000";
	 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
	 //softAssert.assertEquals(actual_Price, expected_Price, "GUI DOESN'T CONSIST THE FOLLOWING INFORMATION AS HTML CODE DOES");
	 softAssert.assertEquals(actual_Name, expected_Name, "BLOCK LETTERS ERROR");
	 softAssert.assertAll();
	}
	public void verifyFirstItemName1() {
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(1).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(1).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName2() {
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(2).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(2).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Block letters error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName3() {
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(3).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(3).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName4() {

		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(4).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(4).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName5() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(5).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(5).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Block letters error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName6() {
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(6).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(6).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Block letters error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName7() {
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(7).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(7).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Block letters error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName8() {
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(8).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(8).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Block letters error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName9() {
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(9).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(9).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Block letters error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName10() {
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(10).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(10).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Block letters error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName11() {
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(11).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(11).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Block letters error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName12() {
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(12).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(12).click();		
		String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Block letters error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName13() {
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(13).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(13).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Block letters error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemName14() {
		 SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		 String actual_Name = list_ItemsElements.get(14).findElement(By.cssSelector(".elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link")).getText();
		 list_NameElements.get(14).click();
		 String expected_Name = driver.findElement(By.cssSelector(".product_title.entry-title")).getText();
		 softAssert.assertEquals(actual_Name, expected_Name, "Block letters error");

		 softAssert.assertAll();
		}
	public void verifyFirstItemPrice() {
	SoftAssert softAssert = new SoftAssert();
	 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

	wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
	String actual_Price = list_ItemsElements.get(0).findElement(By.cssSelector(".jet-woo-product-price")).getText();
	list_NameElements.get(0).click();
	String expected_Price = "Sh30,000.Sh20,000";
	softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
	softAssert.assertAll();

	}
	public void verifyFirstItemPrice1() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(1).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(1).click();
		String expected_Price = "Sh100,000.Sh90,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice2() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(2).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(2).click();
		String expected_Price = "Sh425,000.Sh395,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice3() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(3).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(3).click();
		String expected_Price = "Sh45,000.Sh35,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice4() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(4).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(4).click();
		String expected_Price = "Sh37,000.Sh22,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice5() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(5).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(5).click();
		String expected_Price = "Sh110,000.Sh100,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice6() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(6).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(6).click();
		String expected_Price = "Sh2,670,000.Sh2,440,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice7() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(7).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(7).click();
		String expected_Price = "Sh200,000.Sh180,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice8() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(8).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(8).click();
		String expected_Price = "Sh1,800,000.Sh1,650,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice9() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(9).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(9).click();
		String expected_Price = "Sh85,000,000.Sh80,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice10() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(10).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(10).click();
		String expected_Price = "Sh80,000,000.Sh60,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice11() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(11).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(11).click();
		String expected_Price = "Sh50,000,000.Sh25,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice12() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(12).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(12).click();
		String expected_Price = "Sh70,000,000.Sh66,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice13() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(13).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(13).click();
		String expected_Price = "Sh4,185,000.Sh3,386,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	public void verifyFirstItemPrice14() {
		SoftAssert softAssert = new SoftAssert();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.elementor-element.elementor-element-2895555.elementor-widget.elementor-widget-jet-listing-dynamic-link"), 15));

		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-id=\"16c4856\"]"), 15));
		String actual_Price = list_ItemsElements.get(14).findElement(By.cssSelector(".jet-woo-product-price")).getText();
		list_NameElements.get(14).click();
		String expected_Price = "Sh32,400.Sh27,000";
		softAssert.assertEquals(actual_Price, expected_Price, "The GUI does not contain the following information as HTML code does.");
		softAssert.assertAll();

		}
	

	}