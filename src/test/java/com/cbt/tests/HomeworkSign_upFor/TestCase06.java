package com.cbt.tests.HomeworkSign_upFor;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase06 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("username")).sendKeys("user");
        WebElement result=driver.findElement(By.xpath("//*[.='The username must be more than 6 and less than 30 characters long']"));
        String actualResult=result.getText();
        String expextedResult=("The username must be more than 6 and less than 30 characters long");
        StringUtility.verifyEquals(actualResult,expextedResult);
    }
}
