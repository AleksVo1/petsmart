package ca.petsmart.webPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static ca.petsmart.configuration.ConfigProvider.BASE_URL;

@Slf4j
public class BasePageTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        log.info("Initializing web driver.");
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
    }

    public void open(String path){
        driver.get(BASE_URL + path);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                File source = screenshot.getScreenshotAs(OutputType.FILE);

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
                String timesTamp = dateFormat.format(new Date());

                File destination = new File("/Users/user/IdeaProjects/petsmart/src/main/java/ca/petsmart/files/"
                        + result.getName() + timesTamp + ".png");
                FileUtils.copyFile(source, destination);
                System.out.println("Screenshot of the failed test is saved to " + destination.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        log.info("Initialise driver quit.");
        driver.quit();
    }
}
