package projectIndianRailways;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class BaseIndianRailwaysClass {
	WebDriver driver;
	LoginIndianRailwaysClass bookTicket;
	
	@BeforeTest
	public void initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		bookTicket = new LoginIndianRailwaysClass (driver);

	}
//	@AfterTest
	//public void closeDriver() {
	//	driver.quit();
	//}
	 
 
	
}
