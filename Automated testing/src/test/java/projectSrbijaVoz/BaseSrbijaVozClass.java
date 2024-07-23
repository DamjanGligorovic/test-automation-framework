package projectSrbijaVoz;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class BaseSrbijaVozClass {
	WebDriver driver;
	LoginPageSrbijaVozClass loginPage;
	TestSrbijaVozData testData;
	@BeforeTest
	public void initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		loginPage = new LoginPageSrbijaVozClass(driver);
		testData = new TestSrbijaVozData();
	}
	@AfterTest
	public void closeDriver() {
	driver.quit();
	}

}