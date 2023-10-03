package ca.petsmart.webPages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class ServicesPage extends BasePage{

    @FindBy(css = "a.home__service-card-icon-wrapper:nth-child(1)")
    protected WebElement grooming;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div[6]/div/a[3]")
    protected WebElement petshotel;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div[6]/div/a[4]")
    protected WebElement doggieDayCamp;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div[6]/div/a[5]")
    protected WebElement training;

    @FindBy(css = ".login__login .login__sign-in")
    protected WebElement loginLink;

    @FindBy(css = ".header__logged-in")
    protected WebElement headerLogged;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    protected WebElement acceptCookies;

    public ServicesPage(WebDriver driver) {
        super(driver);
    }

    public void clickToGrooming(){
        waitForVisibility(grooming);
        grooming.click();
    }

    public void clickToPetshotel(){
        waitForVisibility(petshotel);
        petshotel.click();
    }

    public void clickToDoggieDayCamp(){
        waitForVisibility(doggieDayCamp);
        doggieDayCamp.click();
    }

    public void clickToTraining(){
        waitForVisibility(training);
        training.click();
    }

    public void clickToAcceptCookies(){
        waitForVisibility(grooming);
        acceptCookies.click();
    }

    public void clickToLoginLink(){
        waitForVisibility(loginLink);
            loginLink.click();
    }

    public boolean isHeaderLoggedIsDisplayed(){
        waitForVisibility(headerLogged);
            return headerLogged.isDisplayed();
    }


}
