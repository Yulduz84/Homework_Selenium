package tests.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestsForNameLocator {
    public static void main(String [] args){

        WebDriver driver= BrowserFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.findElement(By.name("full_name")).sendKeys("Test User");
        BrowserUtils.wait(3);
        driver.findElement(By.name("email")).sendKeys("test_email@gmail.com");
        BrowserUtils.wait(3);
        driver.findElement(By.name("wooden_spoon")).click();
        BrowserUtils.wait(3);
        driver.quit();

    }
}
