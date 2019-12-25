package com.cbt.tests.Homework02_BeforeAfterMethod;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCase8 {
   // Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
    // Step 2. And click on “Autocomplete”.
    // Step 3. Enter “United States of America” into country input box.
    // Step 4. Verify that following message is displayed: “You selected: United States of America”
   public static void main(String[] args) {
       WebDriver driver = BrowserFactory.getDriver("chrome");
       driver.get("https://practice-cybertekschool.herokuapp.com");
       driver.findElement(By.linkText("Autocomplete")).click();
       driver.findElement(By.id("myCountry")).sendKeys("United States of America");
       driver.findElement(By.xpath("//input[@value='Submit']")).click();
       String expectedResult = "You selected: United States of America";
       String actualResult = driver.findElement(By.id("result")).getText();
       Assert.assertEquals(actualResult,expectedResult, "Success Message is not correct");

       driver.close();
   }





}
