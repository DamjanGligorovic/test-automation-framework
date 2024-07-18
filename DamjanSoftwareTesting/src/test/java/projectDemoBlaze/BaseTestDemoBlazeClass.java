package projectDemoBlaze;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	}
	@AfterTest
public void closeDriver() {
	driver.quit();
	}

}