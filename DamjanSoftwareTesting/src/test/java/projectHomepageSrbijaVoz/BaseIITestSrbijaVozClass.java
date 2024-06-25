package projectHomepageSrbijaVoz;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;




public class BaseIITestSrbijaVozClass {
	WebDriver driver;
	WebDriverWait wait;
	LoginPageSrbijaIIVozClass homePage;
	@BeforeTest
	public void initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		homePage = new LoginPageSrbijaIIVozClass(driver);
	}
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}