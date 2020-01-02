package com.cbt.tests.Homework02_BeforeAfterMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;

/*Step 1. Go to "https://www.tempmailaddress.com/"
Step 2. Copy and save email as a string.
Step 3. Then go to “https://practice-cybertekschool.herokuapp.com”
Step 4. And click on “Sign Up For Mailing List".
Step 5. Enter any valid name.
Step 6. Enter email from the Step 2.
Step 7. Click Sign Up
Step 8. Verify that following message is displayed: “Thank you for signing up. Click the button below to return to the home page.”
Step 9. Navigate back to the “https://www.tempmailaddress.com/”
Step 10. Verify that you’ve received an email from “do-not-reply@practice.cybertekschool.com”
Step 11. Click on that email to open it.
Step 12. Verify that email is from: “do-not-reply@practice.cybertekschool.com”
Step 13. Verify that subject is: “Thanks for subscribing to practice.cybertekschool.com!”
 */
public class TestCase6 {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");

    }
        @Test(description = "Verify that subject is: “Thanks for subscribing to practice.cybertekschool.com!")
        public void test6(){

        driver.get("https://www.tempmailaddress.com/");
        String email=driver.findElement(By.xpath("//span[@class='animace']")).getText();
        System.out.println(email);
        driver.navigate().to("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        driver.findElement(By.name("full_name")).sendKeys("Trump");
        driver.findElement(By.name(("email"))).sendKeys(email);
        driver.findElement(By.name("wooden_spoon")).click();
        String actualResult=driver.findElement(By.className("subheader")).getText();
        String expectedResult="Thank you for signing up. Click the button below to return to the home page.";
            Assert.assertEquals(actualResult,expectedResult);
        driver.navigate().to("https://www.tempmailaddress.com/");
        WebElement actualEmail=driver.findElement(By.cssSelector("tr > td.col-xs-9.mobileFrom"));
            Assert.assertTrue(actualEmail.isDisplayed(), "do-not-reply@practice.cybertekschool.com");
            actualEmail.click();
        WebElement verifyEmail=driver.findElement(By.id("odesilatel"));
        Assert.assertTrue(verifyEmail.isDisplayed(), "do-not-reply@practice.cybertekschool.com");
            WebElement subject=driver.findElement(By.id("predmet"));
            Assert.assertTrue(subject.isDisplayed(), "Thanks for subscribing to practice.cybertekschool.com!");


}


    @AfterMethod
    public void teardown(){
        driver.close();
    }












}