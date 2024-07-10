package projectDemoBlaze;

import java.time.Duration;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class BaseTestDemoBlazeClass {
	WebDriver driver;
	LoginPageDemoBlaze loginPage;
	@BeforeTest
	public void initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		loginPage = new LoginPageDemoBlaze (driver);
	}
	@AfterTest
public void closeDriver() {
	driver.quit();
	}

}