/* Decompiler 461ms, total 844ms, lines 26 */
package projectTechPanda;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasePanda {
   WebDriver driver;
   LoginPagePanda loginPage;

   @BeforeTest
   public void initialization() {
      this.driver = new ChromeDriver();
      this.driver.manage().window().maximize();
      this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20L));
      this.loginPage = new LoginPagePanda(this.driver);
   }

   @AfterTest
   public void closeDriver() {
      this.driver.quit();
   }
}
