package projectSasomangeRegistrationPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTestSasomangeRegistration {
	WebDriver driver;
	RegistrationLoginPageSasomange loginPage;
	@BeforeTest
	public void initialization() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		loginPage = new RegistrationLoginPageSasomange(driver);
	}
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}

}