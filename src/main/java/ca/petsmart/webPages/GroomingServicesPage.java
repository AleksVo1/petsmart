package ca.petsmart.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GroomingServicesPage extends BasePage{

    @FindBy(xpath = "//img[contains(@alt,'WEB-1762750-Apr23_4CRD3_GRM-Services_DT')]")
    protected WebElement bathAndBrush;

    @FindBy(xpath = "//button[@id='vznwt']//span[@class='styleguide__button-content'][normalize-space()='Select']")
    protected WebElement bathAndBrushWithFURminator;

    @FindBy(xpath = "//button[@id='bijhd']//span[@class='styleguide__button-content'][normalize-space()='Select']")
    protected WebElement bathAndFullHaircut;

    @FindBy(xpath = "//button[@id='lrwoy']//span[@class='styleguide__button-content'][normalize-space()='Select']")
    protected WebElement bathAndFullHaircutWithFURminator;
    public GroomingServicesPage(WebDriver driver) {
        super(driver);
    }

    public void clickToBathAndBrush(){
        waitForVisibility(bathAndBrush);
        bathAndBrush.click();
    }

    public void clickToBathAndBrushWithFURminator(){
        waitForVisibility(bathAndBrushWithFURminator);
        bathAndBrushWithFURminator.click();
    }

    public void clickToBathAndFullHaircut(){
        waitForVisibility(bathAndFullHaircut);
        bathAndFullHaircut.click();
    }

    public void clickToBathAndFullHaircutWithFURminator(){
        waitForVisibility(bathAndFullHaircutWithFURminator);
        bathAndFullHaircutWithFURminator.click();
    }

}
