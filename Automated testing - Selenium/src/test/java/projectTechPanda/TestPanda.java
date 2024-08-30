/* Decompiler 81ms, total 450ms, lines 29 */
package projectTechPanda;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPanda extends BasePanda {
   @BeforeMethod
   public void navigation() {
      this.driver.navigate().to("http://live.techpanda.org/index.php/checkout/cart/");
   }

   @AfterMethod
   public void deleteCookie() {
      this.driver.manage().deleteAllCookies();
   }

   @Test
   public void testCase1() {
      this.loginPage.clickOnTheMobile();
      this.loginPage.verifyAddingMessage();
      this.loginPage.typeCode("GURU50");
      this.loginPage.clickButtonApply();
      this.loginPage.verifyCouponMessage();
      Assert.assertTrue(this.loginPage.convertPrices(), "The difference between the subtotal and discount prices does not match the total price");
   }
}
