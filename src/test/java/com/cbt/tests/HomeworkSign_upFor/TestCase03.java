package com.cbt.tests.HomeworkSign_upFor;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Go to https://practicecybertekschool.herokuapp.com
// Click on “Multiple Buttons”
// Click on “Button 1”
// Verify that result message is displayed: “Clicked on button one!”
public class TestCase03 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Multiple Buttons")).click();
        WebElement button1 = driver.findElement(By.tagName("button"));
        button1.click();
        String actualResult =driver.findElement(By.id("result")).getText();
        String expectedResult = "Clicked on button one!";
        StringUtility.verifyEquals(actualResult,expectedResult);
    }
}