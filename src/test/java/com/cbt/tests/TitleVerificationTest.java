package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;

import java.util.Arrays;
import java.util.List;

public class TitleVerificationTest {
    public static WebDriver driver;
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
            driver= BrowserFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get(urls.get(0));
            String titleOne = driver.getTitle();
            String urlOne=driver.getCurrentUrl();

        BrowserUtils.wait(2);
            driver.navigate().to(urls.get(1));
            String titleTwo=driver.getTitle();
            String urlTwo=driver.getCurrentUrl();
        BrowserUtils.wait(2);
            driver.navigate().to(urls.get(2));
            String titleThree=driver.getTitle();
            String urlThree=driver.getCurrentUrl();
        BrowserUtils.wait(2);
        StringUtility.verifyTitles(titleOne,titleTwo,titleThree);
        String checkUrl="http://practice.cybertekschool.com";
        StringUtility.verifyUrls(urlOne,urlTwo,urlThree,checkUrl);
        driver.close();
        }
}
