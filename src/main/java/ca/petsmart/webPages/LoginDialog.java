package ca.petsmart.webPages;

import ca.petsmart.settings.RandomUserGenerator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LoginDialog extends BasePage{

    @FindBy(id = "loginEmail")
    protected WebElement loginEmail;

    @FindBy(id = "loginPassword")
    protected WebElement loginPassword;

    @FindBy(xpath = "//button[@class = 'styleguide__primary-cta login__login-cta']")
    protected WebElement loginBtn;

    @FindBy(css = ".styleguide__primary-cta-fill")
    protected WebElement createAccountBtn;

    @FindBy(id = "create-account-first-name")
    protected WebElement signUpFirstName;

    @FindBy(id = "create-account-last-name")
    protected WebElement signUpLastName;

    @FindBy(id = "create-account-initial-email")
    protected WebElement signUpEmail;

    @FindBy(id = "create-account-confirmation-email")
    protected WebElement signUpConfirmEmail;

    @FindBy(id = "create-account-initial-password")
    protected WebElement signUpPassword;

    @FindBy(id = "create-account-confirmation-password")
    protected WebElement signUpConfirmPassword;

    @FindBy(id = "create-account-phone")
    protected WebElement signUpPhoneNumber;

    @FindBy(xpath = "//i[@aria-label='Phone Type Mobile']")
    protected WebElement signUpMobileRadio;

    @FindBy(xpath = "//span[normalize-space()='NO, I do not want emails at this time.']")
    protected WebElement signUpNoEmail;

    @FindBy(xpath = "//span[normalize-space()='NO, I do not want texts at this time.']")
    protected WebElement signUpNoText;

    @FindBy(xpath = "//button[@class= 'styleguide__primary-cta login__create-account-cta']")
    protected WebElement signUpJoinBtn;

    @FindBy(xpath = "//a[contains(text(), 'Notice of Financial Incentive')]")
    protected WebElement noticeLink;

    @FindBy(css = ".styleguide__dialog")
    protected WebElement dialog;

    private RandomUserGenerator userGenerator;

    public LoginDialog(WebDriver driver, RandomUserGenerator userGenerator) {
        super(driver);
        this.userGenerator = userGenerator;
    }

    public void loginFlow(LoginDialog loginPage, String email, String password){
        scrollToElement(dialog);

        enterText(loginPage.loginEmail, email);
        enterText(loginPage.loginPassword, password);

        loginBtn.click();
    }

    public void signUpFlow(String firstName, String lastName, String password, String phoneNumber){
        String email = userGenerator.generateRandomEmail();

        scrollToElement(dialog);

        createAccountBtn.click();
        signUpFirstName.sendKeys(firstName);
        signUpLastName.sendKeys(lastName);
        signUpEmail.sendKeys(email);
        signUpConfirmEmail.sendKeys(email);
        signUpPassword.sendKeys(password);
        signUpConfirmPassword.sendKeys(password);
        signUpMobileRadio.click();
        signUpPhoneNumber.sendKeys(phoneNumber);

        scrollToElement(signUpNoEmail);
        signUpNoEmail.click();

        scrollToElement(signUpNoText);
        signUpNoText.click();

        scrollToElement(signUpJoinBtn);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", signUpJoinBtn);

    }

    public void writeCredentialsToFile(String password) {
        String email = userGenerator.generateRandomEmail();
        String filePath = "/Users/user/IdeaProjects/petsmart/src/main/java/ca/petsmart/files/credentials.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("Email: " + email + " - " + "Password: " + password + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
