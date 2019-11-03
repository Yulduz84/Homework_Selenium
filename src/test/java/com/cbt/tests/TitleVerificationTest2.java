package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerificationTest2 {
    public static WebDriver driver;
    public static void main(String[] args) {
     List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
             "https://wayfair.com/", "https://walmart.com ");
     driver= BrowserFactory.getDriver("chrome");
     driver.manage().window().maximize();
     driver.get(urls.get(0));
     String titleOne=driver.getTitle();
     String newTitle=titleOne.toLowerCase().replace(" ", "").trim();
     String urlOne=driver.getCurrentUrl();
     if(urlOne.contains(newTitle)){
         System.out.println("pass");
     }else{
         System.out.println("fail");
     }
     driver.close();
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(urls.get(1));
        String titleTwo=driver.getTitle();
        String newTitleTwo=titleTwo.toLowerCase().replace(" ", "").trim();
        String urlTwo=driver.getCurrentUrl();
        System.out.println("newTitle: "+newTitleTwo);
        System.out.println("url: "+ urlTwo);
        if(urlTwo.contains(newTitleTwo)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
driver.close();
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(urls.get(2));
        String titleThree=driver.getTitle();
        String newTitleThree=titleThree.toLowerCase().replace(" ", "").trim();
        String urlThree=driver.getCurrentUrl();
        System.out.println("newTitle: "+newTitleThree);
        System.out.println("url: "+ urlThree);
        if(urlThree.contains(newTitleThree)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        driver.close();
    }

}

