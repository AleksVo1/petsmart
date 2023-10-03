package ca.petsmart.webPages;

import ca.petsmart.settings.RandomUserGenerator;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class SignUpTest extends BasePageTest{

    @Test
    public void testSignUp(){
        ServicesPage servicesPage = new ServicesPage(driver);

        open("");

        servicesPage.clickToAcceptCookies();
            log.info("Cookies accepted.");

        servicesPage.clickToLoginLink();
            log.info("Login link clicked.");

        RandomUserGenerator userGenerator = new RandomUserGenerator();
        LoginDialog loginDialog = new LoginDialog(driver, userGenerator);

        loginDialog.signUpFlow("Adam", "Joke", "Qwerty123", "2045152345");
            log.info("New account created.");

        Assert.assertTrue(servicesPage.isHeaderLoggedIsDisplayed(), "Failed to create an account.");

        loginDialog.writeCredentialsToFile("Qwerty123");
        log.info("Credentials saved to file.");
    }
}
