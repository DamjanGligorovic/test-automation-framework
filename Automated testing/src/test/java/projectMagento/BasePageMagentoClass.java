package projectMagento;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BasePageMagentoClass {
	WebDriver driver;
	LoginPageMagentoClass loginPage;
	@BeforeTest
	public void initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		loginPage = new LoginPageMagentoClass (driver);
	}
	@AfterTest
public void closeDriver() {
	driver.quit();
	}

}