package ca.petsmart.webPages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class GroomingBookingPage extends BasePage{

    @FindBy(xpath = "//body/div[@id='app']/div/div[contains(@class,'booking__booking-singlepage')]/div[contains(@class,'booking__booking-singlepage-body')]/div[contains(@class,'booking__flow-step')]/div[contains(@class,'Collapsible')]/div[@id='collapsible-content-1693259386726']/div[contains(@class,'Collapsible__contentInner')]/div[contains(@class,'booking__step-body-wrapper')]/div[contains(@class,'pamper-package-selection__pamperingPackage-selection-wrapper')]/div[contains(@class,'pamper-package-selection__pamperingPackage-deck-container')]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]/span[1]/div[1]")
    protected WebElement pamperingSummerSelectBtn;

    @FindBy(xpath = "//body/div[@id='app']/div/div[contains(@class,'booking__booking-singlepage')]/div[contains(@class,'booking__booking-singlepage-body')]/div[contains(@class,'booking__flow-step')]/div[contains(@class,'Collapsible')]/div[@id='collapsible-content-1693259386726']/div[contains(@class,'Collapsible__contentInner')]/div[contains(@class,'booking__step-body-wrapper')]/div[contains(@class,'pamper-package-selection__pamperingPackage-selection-wrapper')]/div[contains(@class,'pamper-package-selection__pamperingPackage-deck-container')]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]/span[1]/div[1]")
    protected WebElement pamperingCHISummerSelectBtn;

    @FindBy(xpath = "//body/div[@id='app']/div/div[contains(@class,'booking__booking-singlepage')]/div[contains(@class,'booking__booking-singlepage-body')]/div[contains(@class,'booking__flow-step')]/div[contains(@class,'Collapsible')]/div[@id='collapsible-content-1693259386726']/div[contains(@class,'Collapsible__contentInner')]/div[contains(@class,'booking__step-body-wrapper')]/div[contains(@class,'pamper-package-selection__pamperingPackage-selection-wrapper')]/div[contains(@class,'pamper-package-selection__pamperingPackage-deck-container')]/div[2]/div[1]/div[1]/div[3]/div[2]/button[1]/span[1]/div[1]")
    protected WebElement pamperingLuxurySelectBtn;

    @FindBy(xpath = "//div[@id='collapsible-content-1693259390105']//div[contains(@class,'pamper-package-selection__packageAddOn-selection-wrapper')]//div[1]//div[2]//div[2]//button[1]//span[1]//div[1]")
    protected WebElement pamperingCHILuxurySelectBtn;

    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[3]//div[2]//button[1]//span[1]//div[1]")
    protected WebElement pamperingDeluxeSelectBtn;

    @FindBy(xpath = "//div[4]//div[1]//div[1]//div[3]//div[2]//button[1]//span[1]//div[1]")
    protected WebElement pamperingEssentialSelectBtn;

    @FindBy(css = ".pamper-package-selection__pamperingPackage-selection-wrapper .pamper-package-selection__continue-container>div")
    protected WebElement pamperingNoThanksBtn;

    @FindBy(css = ".date-selection__forward-button")
    protected WebElement chooseDateNext5Days;

    @FindBy(xpath = "//button[@class='styleguide__primary-cta styleguide__secondary-cta date-selection__select-desktop']")
    protected WebElement timeSelectButton;

    @FindBy(xpath = "//button[@id='date-selection-continue-button']//div[contains(text(),'continue')]")
    protected WebElement timeContinueBtn;

    @FindBy(xpath = "//span[normalize-space()='I will bring proof of vaccination']")
    protected WebElement iWillBringBtn;

    @FindBy(xpath = "//div[contains(@class,'styleguide__full-screen-mobile')]")
    protected WebElement vaccinationDialog;

    @FindBy(xpath = "//*[@id=\"addon-tile-2763\"]/div[3]/div/div[2]/button")
    protected WebElement nailGrinding;

    @FindBy(xpath = "//div[@id='addon-tile-3671']//div[@class='addon-selection__addon-tile-cta']//div//div[contains(text(),'select')]")
    protected WebElement teethBrushing;

    @FindBy(xpath = "//div[@id='addon-tile-3626']//div[@class='addon-selection__addon-tile-cta']//div//div[contains(text(),'select')]")
    protected WebElement deepCoatConditioner;

    @FindBy(xpath = "//div[@id='addon-tile-3679']//div[@class='addon-selection__addon-tile-cta']//div//div[contains(text(),'select')]")
    protected WebElement premiumShampoo;

    @FindBy(xpath = "//button[@class='styleguide__primary-cta addon-selection__continue-cta']//span[@class='styleguide__button-content'][normalize-space()='no thanks']")
    protected WebElement addonNoThanksBtn;

    @FindBy(xpath = "//button[@class='styleguide__primary-cta addon-selection__continue-cta']//span[@class='styleguide__button-content'][normalize-space()='continue']")
    protected WebElement addonContinueBtn;

    @FindBy(xpath = "//span[normalize-space()='complete booking']")
    protected WebElement completeBookingBtn;




    public GroomingBookingPage(WebDriver driver) {
        super(driver);
    }

    public void clickToPamperingSummerSelectBtn(){
        waitForVisibility(pamperingSummerSelectBtn);
        pamperingSummerSelectBtn.click();
    }

    public void clickToPamperingCHISummerSelectBtn(){
        waitForVisibility(pamperingCHISummerSelectBtn);
        pamperingCHISummerSelectBtn.click();
    }

    public void clickToPamperingLuxurySelectBtn(){
        waitForVisibility(pamperingLuxurySelectBtn);
        pamperingLuxurySelectBtn.click();
    }

    public void clickToPamperingCHILuxurySelectBtn(){
        waitForVisibility(pamperingCHILuxurySelectBtn);
        pamperingCHILuxurySelectBtn.click();
    }

    public void clickToPamperingDeluxeSelectBtn(){
        waitForVisibility(pamperingDeluxeSelectBtn);
        pamperingDeluxeSelectBtn.click();
    }

    public void clickToPamperingEssentialSelectBtn(){
        waitForVisibility(pamperingEssentialSelectBtn);
        pamperingEssentialSelectBtn.click();
    }

    public void clickToPamperingNoThanksBtn(){
        waitForVisibility(pamperingNoThanksBtn);
        pamperingNoThanksBtn.click();
    }

    public void selectTimeAndDate() {

        if(!isElementPresent(timeSelectButton)){
            chooseDateNext5Days.click();
        }
        waitForVisibility(timeSelectButton);
        timeSelectButton.click();

    }

    public void clickToTimeContinueBtn(){
        scrollToElement(timeContinueBtn);
        waitForVisibility(timeContinueBtn);
        timeContinueBtn.click();
    }

    public void clickToIWillBringBtn(){
        waitForVisibility(vaccinationDialog);
        scrollToElement(vaccinationDialog);
        iWillBringBtn.click();
    }

    public void selectNailGrinding(){
        waitForVisibility(nailGrinding);
        nailGrinding.click();
    }

    public void selectTeethBrushing(){
        waitForVisibility(teethBrushing);
        teethBrushing.click();
    }

    public void selectDeepCoatConditioner(){
        waitForVisibility(deepCoatConditioner);
        deepCoatConditioner.click();
    }

    public void selectPremiumShampoo(){
        waitForVisibility(premiumShampoo);
        premiumShampoo.click();
    }

    public void clickToAddonNoThanksBtn(){
        waitForVisibility(addonNoThanksBtn);
        addonNoThanksBtn.click();
    }

    public void clickToAddonContinueBtn(){
        waitForVisibility(addonContinueBtn);
        addonContinueBtn.click();
    }

    public void clickToCompleteBookingBtn(){
        waitForVisibility(completeBookingBtn);
        completeBookingBtn.click();
    }
}
