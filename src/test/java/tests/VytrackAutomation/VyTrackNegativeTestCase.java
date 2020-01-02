package tests.VytrackAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class VyTrackNegativeTestCase {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://google.com");
        driver.get("https://qa2.vytrack.com/user/login");

        BrowserUtils.wait(2);
        WebElement username=driver.findElement(By.id("prependedInput"));
        username.sendKeys("yulduz2019");
        WebElement password = driver.findElement(By.name("_password"));
        password.sendKeys("UserUser123");
        WebElement LogIn = driver.findElement(By.name("_submit"));
        LogIn.click();
        BrowserUtils.wait(2);

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-error']"));

        String actualText = errorMessage.getText();
        String expectedText = "Invalid user name or password.";
        if (actualText.equalsIgnoreCase(expectedText)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");

       }
        BrowserUtils.wait(2);
        driver.close();

    }
}
