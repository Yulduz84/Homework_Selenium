package tests.VytrackAutomation;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class Vytracklaunchlogin {
    public static void main(String [] args){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //go to vytrack login page
        driver.get("http://google.com");
        driver.get("https://qa2.vytrack.com/user/login");

        BrowserUtils.wait(2);
        WebElement username=driver.findElement(By.name("_username"));
        username.sendKeys("user42");
        WebElement password=driver.findElement(By.name("_password"));
        password.sendKeys("UserUser123");
        WebElement LogIn=driver.findElement(By.name("_submit"));
        LogIn.click();
        BrowserUtils.wait(2);

        String expectedUrl = "https://qa2.vytrack.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        //driver.close();




    }
}
