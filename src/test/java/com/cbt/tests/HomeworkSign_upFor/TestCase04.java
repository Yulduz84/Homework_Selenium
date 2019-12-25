package com.cbt.tests.HomeworkSign_upFor;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase04 {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("firstname")).sendKeys("123");
        WebElement result=driver.findElement(By.xpath("//*[.='first name can only consist of alphabetical letters']"));

        String actualResult=result.getText();
        String expectedResult=("first name can only consist of alphabetical letters");
        StringUtility.verifyEquals(actualResult, expectedResult);

    }
}
