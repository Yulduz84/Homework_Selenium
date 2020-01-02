package tests.day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserFactory;

public class TestNGPractice {
    @Test
     public void test(){
        // to verify that expected and actual result is the same
        //if no-it will throw exception and stop the program
        //also, you will see in the console what was expected
        //and what wa actually
        Assert.assertEquals("apple", "apple", "Word is correct");
         }
         @Test
    public void verifyTitle(){
             WebDriver driver= BrowserFactory.getDriver("chrome" );
            driver.get(("http://practice.cybertekschool.com/"));
            String expectedTitle="Practice";
            String actualTitle=driver.getTitle();
            Assert.assertEquals(actualTitle,expectedTitle, "Title is wrong");
            driver.close();
    }
    //let's verify that TEST AUTOMATION PRACTICE heading is displayed
    @Test (description = "Verify that heading is displayed")
    public void verifyHeadingIsDisplayed(){
        WebDriver driver=BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        WebElement heading=driver.findElement(By.xpath("//span[text()='Test Automation Practice']"));
        Assert.assertTrue(heading.isDisplayed(), "Element is not visible");
        driver.close();

    }
}
