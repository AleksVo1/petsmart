package ca.petsmart.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileWriter;
import java.io.IOException;

public class ConfirmationPage extends BasePage{

    @FindBy(css = "#confirmation-appointment-id")
    protected WebElement orderNumber;

    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public void writeOrderNumberToFile(){
        String filePath = "/Users/user/IdeaProjects/petsmart/src/main/java/ca/petsmart/files/orders.txt";
        waitForVisibility(orderNumber);

        String getOrderNumber = orderNumber.getText();

        try(FileWriter writer = new FileWriter(filePath);) {
            writer.write("Order number: " + getOrderNumber);

            System.out.println("Order number: " + filePath);
        } catch (IOException e) {
            System.err.println("Failed to write order number to file: " + e.getMessage());
        }
    }

}
