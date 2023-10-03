package ca.petsmart.webPages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static ca.petsmart.configuration.ConfigProvider.BASE_URL;

public abstract class BasePage {

        protected WebDriver driver;
        protected WebDriverWait wait;

        protected final Logger logger = LoggerFactory.getLogger(getClass());

        public BasePage(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            PageFactory.initElements(driver, this);
        }

        public void open(String path) {
            driver.get(BASE_URL + path);
        }

        public void scrollToElement(WebElement element) {
            Actions actions = new Actions(driver);
            actions.scrollToElement(element);
        }

        public void dropDownSelector(WebElement element, String visibleText){
            waitForVisibility(element);
            Select select = new Select(element);
            select.selectByVisibleText(visibleText);
        }

        public void waitForVisibility(WebElement element){
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(element));
        }

        public boolean isElementPresent(WebElement element) {
            try {
                element.isDisplayed();
                return true;
            } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
                return false;
            }
        }

        public void enterText(WebElement element, String text) {
            Actions actions = new Actions(driver);
            actions.click(element)
                    .sendKeys(Keys.chord(Keys.CONTROL, ""), Keys.DELETE)
                    .sendKeys(text)
                    .perform();

        }


}
