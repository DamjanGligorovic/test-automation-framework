package projectSasomangeLoginPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTestLoginPageClass {
	WebDriver driver;
	LoginPageSasomangeClass loginPage;
	@BeforeTest
	public void initialization() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		loginPage = new LoginPageSasomangeClass(driver);
	}
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}

}