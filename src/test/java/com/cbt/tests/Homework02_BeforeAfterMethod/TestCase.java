package com.cbt.tests.Homework02_BeforeAfterMethod;

import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.BrowserFactory;
import utils.BrowserUtils;

import java.util.List;

public class TestCase {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
    }

    @Test
    public void Case1() {
        String expectedResult = "The date of birth is not valid";
        WebElement dob = driver.findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']"));
        dob.sendKeys("wrong_dob");
        String actualResult = driver.findElement(By.xpath("//small[@data-bv-result='INVALID']")).getText();
        Assert.assertEquals(actualResult, expectedResult, "Result is wrong!");
        BrowserUtils.wait(2);


    }
    @Test
    public void Case2() {
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='registrationForm']/div[11]/div"));
        for (WebElement webElement : elements) {
            System.out.println(webElement.getText());
            BrowserUtils.wait(2);

        }
    }
    @Test
    public void Case3 () {
        String expectedResult = "first name must be more than 2 and less than 64 characters long";
        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("U");
        String actualResult = driver.findElement(By.xpath("//small[@data-bv-result='INVALID']")).getText();
        Assert.assertEquals(actualResult, expectedResult, "Result is wrong!");
        BrowserUtils.wait(2);

        }
    @Test
    public void Case4(){
        String expectedResult = "The last name must be more than 2 and less than 64 characters long";
        WebElement name = driver.findElement(By.name("lastname"));
        name.sendKeys("A");
        String actualResult = driver.findElement(By.xpath("//small[@data-bv-result='INVALID']")).getText();
        Assert.assertEquals(actualResult, expectedResult, "Result is wrong!");
        BrowserUtils.wait(2);

        }
    @Test
    public void Case5() {
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Nozi");
        WebElement Lastname = driver.findElement(By.name("lastname"));
        Lastname.sendKeys("Azam");
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Bek2007");
        WebElement eName = driver.findElement(By.name("email"));
        eName.sendKeys("cyberburger@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secretservice");
        WebElement phoneNum = driver.findElement(By.name("phone"));
        phoneNum.sendKeys("281-333-4444");
        driver.findElement(By.cssSelector("input[value='female']")).click();
        WebElement dob = driver.findElement(By.name("birthday"));
        dob.sendKeys("01/02/2013");
        WebElement department = driver.findElement(By.name("department"));
        Select select = new Select(department);
        select.selectByValue("MO");
        BrowserUtils.wait(2);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Mayor's Office");

        WebElement jobTitle = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[10]/div/select/option[3]"));
        jobTitle.click();
        WebElement language=driver.findElement(By.id("inlineCheckbox2"));
        language.click();
        driver.findElement(By.id("wooden_spoon")).click();
        String actualResult=driver.findElement(By.xpath("//*[@id='content']/div/div/p")).getText();
        BrowserUtils.wait(2);
        Assert.assertEquals(actualResult,"You've successfully completed registration!");

    }
    @AfterMethod
    public void teardown(){
     driver.close();
    }
}

