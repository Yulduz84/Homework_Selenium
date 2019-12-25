package com.cbt.tests.Homework02_BeforeAfterMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestCases9_12 {
    /*Optional: If you want to to be a real selenium hero, use @DataProvider for for tests cases from 9 through 12.
     Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
     Step 2. And click on “Status Codes”.
     Step 3. Then click on “200”.
     Step 4. Verify that following message is displayed: “This page returned a 200 status code”
     Test case #10
     Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
     Step 2. And click on “Status Codes”.
     Step 3. Then click on “301”.
     Step 4. Verify that following message is displayed: “This page returned a 301 status code”
     Test case #11
     Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
     Step 2. And click on “Status Codes”.
     Step 3. Then click on “404”.
     Step 4. Verify that following message is displayed: “This page returned a 404 status code”
     Test case #12
     Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
     Step 2. And click on “Status Codes”.
     Step 3. Then click on “500”.
     Step 4. Verify that following message is displayed: “This page returned a 500 status code”
     */
    private WebDriver driver;
    private WebElement message;
    @BeforeMethod
    public void setUp(){
        driver = BrowserFactory.getDriver("chrome") ;
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
    }
    @DataProvider(name="testData")
    public static Object[][] testData(){
        return new Object[][]{{"200"},{"301"},{"404"},{"500"}};
    }
    @Test(dataProvider = "testData")
    public void Test9_12(String code) {
        driver.findElement(By.xpath("//a[text()='Status Codes']")).click();
        BrowserUtils.wait(1);
        WebElement statusCode= driver.findElement(By.xpath("//a[text()='"+code+"']"));
        statusCode.click();
        WebElement message = driver.findElement(By.xpath("//p[contains(text(), " + code + ")]"));
        String messageActual = message.getText().trim();
        String[] messageAct = messageActual.split("\\n");
        messageActual = messageAct[0];
        String messageExpected = "This page returned a " + code + " status code.";
        Assert.assertEquals(messageActual, messageExpected, " Incorrect message");

    }
    @AfterMethod
    public void teardown() {
      driver.close();
    }
}
