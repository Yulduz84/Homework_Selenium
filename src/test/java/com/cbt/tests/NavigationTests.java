package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.BrowserUtils;

public class NavigationTests {
    public static void main(String[] args) {
        ChromeTest();
        FirefoxTest();
        EdgeTest();
    }

    public static void ChromeTest()  {
        WebDriver driver = BrowserFactory.getDriver("chrome"); // open chrome browser
        driver.manage().window().maximize();
        driver.get("https://www.google.com/"); // go to the specified website
        String googletitleOne = driver.getTitle(); // returns title of a webpage (google)
        driver.navigate().to("https://www.etsy.com/");
        String etsyTitleOne = driver.getTitle();
        driver.navigate().back(); //navigate back to previuos page
        String googleTitleTwo = driver.getTitle(); //(google)
        System.out.println("Google Site : ");
        StringUtility.verifyEquals(googletitleOne, googleTitleTwo); // verify that title is the same is in step3
        driver.navigate().forward(); //Navigate forward to previous page
        String etsyTitleTwo = driver.getTitle();
        System.out.println("Etsy Site : ");
        StringUtility.verifyEquals(etsyTitleOne, etsyTitleTwo);
        BrowserUtils.wait(3);
        driver.close();
    }

    public static void FirefoxTest() {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://www.google.com/"); // go to the specified website
        String googletitleOne = driver.getTitle(); // returns title of a webpage (google)
        driver.navigate().to("https://www.etsy.com/");
        String etsyTitleOne = driver.getTitle();
        driver.navigate().back(); //navigate back to previuos page
        String googleTitleTwo = driver.getTitle(); //(google)
        System.out.println("Google Site : ");
        StringUtility.verifyEquals(googletitleOne, googleTitleTwo); // verify that title is the same is in step3
        driver.navigate().forward(); //Navigate forward to previous page
        String etsyTitleTwo = driver.getTitle();
        System.out.println("Etsy Site : ");
        StringUtility.verifyEquals(etsyTitleOne, etsyTitleTwo);
        BrowserUtils.wait(3);
        driver.close();

    }

    public static void EdgeTest(){
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://www.google.com/"); // go to the specified website
        String googletitleOne = driver.getTitle(); // returns title of a webpage (google)
        driver.navigate().to("https://www.etsy.com/");
        String etsyTitleOne = driver.getTitle();
        driver.navigate().back(); //navigate back to previuos page
        String googleTitleTwo = driver.getTitle(); //(google)
        System.out.println("Google Site : ");
        StringUtility.verifyEquals(googletitleOne, googleTitleTwo); // verify that title is the same is in step3
        driver.navigate().forward(); //Navigate forward to previous page
        String etsyTitleTwo = driver.getTitle();
        System.out.println("Etsy Site : ");
        StringUtility.verifyEquals(etsyTitleOne, etsyTitleTwo);
        BrowserUtils.wait(3);
        driver.close();
    }
}
