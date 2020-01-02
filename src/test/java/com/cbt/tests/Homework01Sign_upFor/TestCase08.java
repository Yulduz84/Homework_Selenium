package com.cbt.tests.Homework01Sign_upFor;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase08 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("phone")).sendKeys("5711234354");
        WebElement result=driver.findElement(By.xpath("//*[.='Phone format is not correct']"));
        String actualResult=result.getText();
        String expectedResult=("Phone format is not correct");
        StringUtility.verifyEquals(actualResult,expectedResult);
    }
}
