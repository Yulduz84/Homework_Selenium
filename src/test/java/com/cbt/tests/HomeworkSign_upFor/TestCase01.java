package com.cbt.tests.HomeworkSign_upFor;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserUtils;
//Test case #1 Step 1. Go to https://practicecybertekschool.herokuapp.com
//        Step 2. Click on “Sign Up For Mailing List”
//        Step 3. Enter any valid name
//        Step 4. Enter any valid email
//        Step 5. Click on “Sign Up” button
//        Expected result: Following message should be displayed:
//        “Thank you for signing up. Click the button below to return to the home page.”
//        Home button should be displayed.


public class TestCase01 {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        WebElement signUpLink=driver.findElement(By.xpath("//a[@href='/sign_up']"));
        System.out.println(signUpLink.getText());
        signUpLink.click();
        driver.findElement(By.cssSelector("input[name='full_name']")).sendKeys("Yulduz Agzamova");
        BrowserUtils.wait(2);
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("yulduz.kamalova@gmail.com");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        BrowserUtils.wait(2);
        WebElement confirmMessage = driver.findElement(By.xpath("//h3[@class='subheader']"));
        String actualResult = confirmMessage.getText();
        WebElement HomeButton=driver.findElement(By.id("wooden_spoon"));
        String actualResultTwo=HomeButton.getText();
        //WebElement homeButton=driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']"));
        String expectedResultOne = "Thank you for signing up. Click the button below to return to the home page.";
        String expectedResultTwo= "Home";
        System.out.println("First Verification");
        System.out.println("Expected Result "+actualResult);
        StringUtility.verifyEquals(expectedResultOne,actualResult);
        System.out.println("Second Verification");
        System.out.println("Expexted Result "+actualResultTwo);
        StringUtility.verifyEquals(expectedResultTwo, actualResultTwo);

        BrowserUtils.wait(2);
        driver.close();

          }
}
