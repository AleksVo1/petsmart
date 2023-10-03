package ca.petsmart.webPages;

import ca.petsmart.settings.RandomUserGenerator;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class GroomingWithAddonTest extends BasePageTest{

    @Test
    public void testGroomingWithAddon(){

        ServicesPage servicesPage = new ServicesPage(driver);

        open("");
        log.info("Services page is opened.");

        servicesPage.clickToAcceptCookies();
        log.info("Clicked accept cookies.");

        servicesPage.clickToLoginLink();
        log.info("Login modal is opened.");


        RandomUserGenerator userGenerator = new RandomUserGenerator();
        LoginDialog loginDialog = new LoginDialog(driver, userGenerator);
//        loginDialog.loginFlow("inrixtest1st+321@gmail.com", "Qwerty123");
        log.info("User is logged in.");

        Assert.assertTrue(servicesPage.isHeaderLoggedIsDisplayed(), "Failed to login.");

        servicesPage.clickToGrooming();
        log.info("Clicked grooming link");

        GroomingPage groomingPage = new GroomingPage(driver);

        groomingPage.searchStore("Kingston, ON");
        log.info("Clicked on the select store link");

        groomingPage.clickToSelectDog();
        log.info("Selected dog");
        groomingPage.clickToSelectNewAppointment();
        log.info("Selected new appointment");
        groomingPage.clickToBokNowBtn();

        GroomingServicesPage groomingServicesPage = new GroomingServicesPage(driver);
        groomingServicesPage.clickToBathAndBrush();
        log.info("Selected BathAndBrush service");

        GroomingBookingPage groomingBookingPage = new GroomingBookingPage(driver);
        groomingBookingPage.clickToPamperingNoThanksBtn();
        log.info("Clicked no thanks button on pampering tab");

        groomingBookingPage.selectTimeAndDate();
        log.info("Selected date and time.");

        groomingBookingPage.clickToTimeContinueBtn();
        log.info("Clicked continue button on the choose date tab.");

        groomingBookingPage.clickToIWillBringBtn();
        log.info("Clicked I will bring button.");

        groomingBookingPage.selectNailGrinding();
        log.info("Selected NailGrinding add-on");
        groomingBookingPage.clickToAddonContinueBtn();
        log.info("Clicked continue button.");
        groomingBookingPage.clickToCompleteBookingBtn();
        log.info("Clicked complete booking button.");

        ConfirmationPage confirmationPage = new ConfirmationPage(driver);
        confirmationPage.writeOrderNumberToFile();
        log.info("Order number is saved to file.");

    }

}
