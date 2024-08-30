package projectTechPanda;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPanda extends BasePanda {
   @BeforeMethod
   public void navigation() {
      driver.navigate().to("http://live.techpanda.org/index.php/checkout/cart/");
   }

   @AfterMethod
   public void deleteCookie() {
      driver.manage().deleteAllCookies();
   }

   @Test
   public void testCase1() {
      loginPage.clickOnTheMobile();
      loginPage.verifyAddingMessage();
      loginPage.typeCode("GURU50");
      loginPage.clickButtonApply();
      loginPage.verifyCouponMessage();
      Assert.assertTrue(loginPage.convertPrices(), "The difference between the subtotal and discount prices does not match the total price");
   }
}
