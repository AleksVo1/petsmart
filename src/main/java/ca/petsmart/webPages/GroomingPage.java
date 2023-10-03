package ca.petsmart.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GroomingPage extends BasePage {

    @FindBy(xpath = "//a[normalize-space()='Select a store']")
    protected WebElement selectStore;

    @FindBy(xpath = "//a[normalize-space()='Kingston']")
    protected WebElement kingstonStore;

    @FindBy(xpath = "//div[@id='grooming-landing-pet-select']//div[@class='react-select__value-container css-1hwfws3']")
    protected WebElement selectPet;

    @FindBy(xpath = "//div[text()='Dog2']")
    protected WebElement dog;

    @FindBy(xpath = "//div[text()='Cat2']")
    protected WebElement cat;

    @FindBy(xpath = "//div[text()='Add pet']")
    protected WebElement addPet;

    @FindBy(xpath = "//div[text()='New appointment']")
    protected WebElement newAppointment;

    @FindBy(xpath = "//div[@id='grooming-landing-service-select']//div[@class='react-select__value-container css-1hwfws3']")
    protected WebElement selectType;

    @FindBy(xpath = "//span[@class='styleguide__button-content']")
    protected WebElement bookNowBtn;

    @FindBy(xpath = "//input[@id='search-stores-input']")
    protected WebElement inputField;

    @FindBy(xpath = "//button[@class='styleguide__primary-cta styleguide__new-design interfaces__search-button']")
    protected WebElement searchBtn;

    @FindBy(xpath = "//button[@id='select-store-Kingston']")
    protected WebElement selectStoreKingston;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/section[2]/section/div/div[1]/div[2]/div")
    protected WebElement storeDialog;


    public GroomingPage(WebDriver driver) {
        super(driver);
    }

    public void searchStore(String store){
        if (wait.until(ExpectedConditions.visibilityOf(kingstonStore)).isDisplayed()){
            System.out.println("Store is displayed");
        }
        else {
            waitForVisibility(selectStore);
            selectStore.click();

            scrollToElement(storeDialog);

            inputField.sendKeys(store);
            searchBtn.click();
            waitForVisibility(selectStoreKingston);
            selectStoreKingston.click();
        }

    }

    public void clickToAddPet(){

        selectPet.click();
        addPet.click();

    }

    public void clickToSelectDog(){
        selectPet.click();
        dog.click();

    }

    public void clickToSelectCat(){

        selectPet.click();
        cat.click();

    }

    public void clickToSelectNewAppointment(){
        selectType.click();
        waitForVisibility(newAppointment);
        newAppointment.click();

    }

    public void clickToBokNowBtn(){
        waitForVisibility(bookNowBtn);
        bookNowBtn.click();

    }
}
