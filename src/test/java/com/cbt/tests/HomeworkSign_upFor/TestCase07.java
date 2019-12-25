package com.cbt.tests.HomeworkSign_upFor;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class TestCase07 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("email")).sendKeys("testers@email");
        String expectedResult1 = "email address is not a valid";
        String expectedResult2 = "Email format is not correct";
        if (driver.findElement(By.xpath("//small[@data-bv-validator='emailAddress']")).getText().equalsIgnoreCase(expectedResult1)) {
            if (driver.findElement(By.xpath("//*[@id='registrationForm']/div[4]/div/small[3]")).getText().equalsIgnoreCase(expectedResult2)) {
                System.out.println("Passed");
                System.out.println("Message is: " + driver.findElement(By.xpath("//small[@data-bv-validator='emailAddress']")).getText());
                System.out.println("Message is: " + driver.findElement(By.xpath("//*[@id='registrationForm']/div[4]/div/small[3]")).getText());
            } else {
                System.out.println("Test is failed");
            }
            //driver.close();
        }
    }
}