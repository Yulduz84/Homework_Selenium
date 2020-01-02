package com.cbt.tests.Homework04_VytrackCalendarEventsPage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;
import java.util.concurrent.TimeUnit;

public class TestCase1 {
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

        WebElement loaderMask = null;

        if (driver.findElements(By.cssSelector("div[class='loader-mask shown']")).size() > 0) {
            loaderMask = driver.findElement(By.cssSelector("div[class='loader-mask shown']"));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        }

        WebElement activitiesElement = driver.findElement(By.linkText("Activities"));
        wait.until(ExpectedConditions.visibilityOf(activitiesElement));
        wait.until(ExpectedConditions.elementToBeClickable(activitiesElement));
        activitiesElement.click();

        WebElement calendarEventsElement = driver.findElement(By.linkText("Calendar Events"));
        wait.until(ExpectedConditions.visibilityOf(calendarEventsElement));
        wait.until(ExpectedConditions.elementToBeClickable(calendarEventsElement));
        calendarEventsElement.click();

        wait.until(ExpectedConditions.invisibilityOf(loaderMask));
    }

    @Test(description = "Hover on three dots “...” for “Testers meeting”")
    public void test1() {

        WebElement threeDots = driver.findElement(By.cssSelector("* tr:nth-child(7) > td.action-cell.grid-cell.grid-body-cell > div > div > a"));
        Actions builder = new Actions(driver);
        builder.moveToElement(threeDots).build().perform();

        String[] testData = {"a[href='#']", "a[href='/calendar/event/update/222']", "a[href='/calendar/event/view/222']"};
        WebElement option;

        for (String each : testData) {
            option = driver.findElement(By.cssSelector(each));
            Assert.assertTrue(option.isDisplayed());
        }
    }
        @Test(description = "Verify that “Title” column still displayed")
                public void test2() {
            WebElement grid = driver.findElement(By.xpath("//a[@title='Grid Settings']"));
            grid.click();
            String[] value = {"336", "337", "338", "339", "340", "341", "342"};
            for (String each : value) {
                if (each != "336") {
                    WebElement uncheck = driver.findElement(By.id("column-c" + each + ""));
                    System.out.println(uncheck.isSelected());
                    uncheck.click();
                } else if (each == "336") {
                    WebElement title = driver.findElement(By.id("column-c" + each + ""));
                    System.out.println(title.isSelected());
                }
            }
        }
            @Test(description = "Expand “Save And Close” menu")
            public void test3()  throws Exception{

                WebElement calendarEvents = driver.findElement(By.cssSelector("div.pull-right.title-buttons-container > div > a"));
                calendarEvents.click();
                WebElement expand=driver.findElement(By.cssSelector("div.pull-right.pinned-dropdown > div > a"));
                Thread.sleep(1000);
                expand.click();
                String[] testData = {"li:nth-child(1) > button", "li:nth-child(2) > button", "li:nth-child(3) > button"};
                WebElement option;

                for (String each : testData) {
                    option = driver.findElement(By.cssSelector(each));
                    Assert.assertTrue(option.isDisplayed());
                }
        }

    @Test(description = "Verify that “All Calendar Events” page subtitle is displayed")
    public void test4() throws InterruptedException {
        WebElement calendarEvents = driver.findElement(By.cssSelector("div.pull-right.title-buttons-container > div > a"));
        calendarEvents.click();
        WebElement cancelButton=driver.findElement(By.partialLinkText("Cancel"));
        Thread.sleep(1000);
        cancelButton.click();
        WebElement events=driver.findElement(By.cssSelector("div > div.btn-group.views-group"));
        Assert.assertTrue(events.isDisplayed());

    }
    @Test(description = "Verify that difference between end and start time is exactly 1 hour")
    public void test5(){
        WebElement calendarEvents = driver.findElement(By.cssSelector("div.pull-right.title-buttons-container > div > a"));
        calendarEvents.click();
        String startDate = "// Set start date";
        String endDate   =" // Set end date";

       // long duration  = endDate.getTime - startDate.getTime();

//        long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
//        long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
//        long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
//        long diffInHoursfInDays = TimeUnit.MILLISECONDS.toDays(duration);
    }
}
