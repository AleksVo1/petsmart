package ca.petsmart.webPages;

import ca.petsmart.settings.RandomUserGenerator;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class LoginTest extends BasePageTest{

  @Test
  public void testLogin() {
      ServicesPage servicesPage = new ServicesPage(driver);

      open("");
        log.info("Services page is opened.");

      servicesPage.clickToAcceptCookies();
      log.info("Clicked accept cookies.");

      servicesPage.clickToLoginLink();
        log.info("Login modal is opened.");

      RandomUserGenerator userGenerator = new RandomUserGenerator();
      LoginDialog loginDialog = new LoginDialog(driver, userGenerator);
        loginDialog.loginFlow(loginDialog,"inrixtest1st+330@gmail.com", "Qwerty123");
            log.info("User is logged in.");

      Assert.assertTrue(servicesPage.isHeaderLoggedIsDisplayed(), "Failed to login.");
  }

}
