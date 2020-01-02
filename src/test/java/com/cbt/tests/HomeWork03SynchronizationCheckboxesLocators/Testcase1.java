package com.cbt.tests.HomeWork03SynchronizationCheckboxesLocators;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
    public class Testcase1 {
        private WebDriver driver;
        private WebDriverWait wait;

        @BeforeMethod
        public void setup() {
            driver = BrowserFactory.getDriver("chrome");
            //explicit wait
            wait = new WebDriverWait(driver, 10);
            //implicit wait
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //maximize browser
            driver.manage().window().maximize();
            driver.get("https://qa1.vytrack.com/");
            driver.findElement(By.id("prependedInput")).sendKeys("storemanager85");
            driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
            WebElement activitiesElement = driver.findElement(By.linkText("Activities"));
            wait.until(ExpectedConditions.visibilityOf(activitiesElement));
            wait.until(ExpectedConditions.elementToBeClickable(activitiesElement));
            BrowserUtils.wait(4);
            activitiesElement.click();
            WebElement calendarEventsElement = driver.findElement(By.linkText("Calendar Events"));
            wait.until(ExpectedConditions.visibilityOf(calendarEventsElement));
            wait.until(ExpectedConditions.elementToBeClickable(calendarEventsElement));
            calendarEventsElement.click();
            WebElement loaderMask = driver.findElement(By.cssSelector("div[class='loader-mask shown']"));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        }

        @Test(description = "Verify that page subtitle 'Options' is displayed")
        public void test1() {
            Assert.assertTrue(driver.findElement(By.xpath("//div[@href='#']")).isDisplayed());
        }

        @Test(description = "Verify that page number is equals to '1'")
        public void test2() {
            WebElement pageNumber = driver.findElement(By.className("input-widget"));
            System.out.println(pageNumber.getAttribute("value"));
            Assert.assertTrue(pageNumber.getAttribute("value").equals("1"));

        }

        @Test(description = "Verify that view per page number is equals to '25'")
        public void test3() {
            WebElement perPageNum01 = driver.findElement(By.cssSelector("button[class='btn dropdown-toggle ']"));
            String perPageNum = perPageNum01.getText();
            Assert.assertEquals(perPageNum, "25", "wrong per page number");
        }

        @Test(description = "Verify that number of calendar events (rows in the table) is equals to number of records")
        public void test4() {

            String numberOfRecords = driver.findElement(By.xpath("//label[text()='Total of 18 records']")).getText();
            int actualNumOfRecords = driver.findElements(By.cssSelector("tr[class='grid-row row-click-action']")).size();
            System.out.println(numberOfRecords);
            System.out.println("Total number of rows: " + actualNumOfRecords);
            Assert.assertTrue(numberOfRecords.contains("" + actualNumOfRecords + ""));
        }

        @Test(description = "Verify that all calendar events were selected")
        public void test5() {

            int actualNumOfTitles = driver.findElements(By.cssSelector("tr[class='grid-row row-click-action']")).size();
            WebElement checkbox = driver.findElement(By.xpath("//button[@class='btn btn-default btn-small dropdown-toggle']"));
            checkbox.click();
            int numOfSelectedRows = driver.findElements(By.xpath("//input[@tabindex='-1']")).size();
            Assert.assertEquals(numOfSelectedRows, actualNumOfTitles);
            System.out.println(numOfSelectedRows + " " + actualNumOfTitles);
        }

        @Test(description = "Verify that data is displayed")
        public void test6() {

            WebElement testersMeetings = driver.findElement(By.cssSelector("[class='grid-row row-click-action']:nth-of-type(7)"));
            testersMeetings.click();

            List<String> list = new ArrayList<>(Arrays.asList(
                    "Testers meeting",
                    "This is a a weekly testers meeting",
                    "Dec 8, 2019, 11:20 AM",
                    "Dec 8, 2019, 12:20 PM",
                    "No",
                    "Stephan Haley",
                    "Tom Smith - Required"));

            for (int i = 0; i < list.size(); i++) {

                String actualResult = driver.findElements(By.cssSelector("[class='responsive-block']>div>div>div")).get(i).getText();

                    Assert.assertEquals(actualResult, list.get(i));
                    System.out.println(actualResult);
                }
            }
        @AfterMethod
        public void teardown(){
            driver.quit();
        }
                   }