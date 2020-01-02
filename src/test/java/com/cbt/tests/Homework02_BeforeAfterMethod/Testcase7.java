package com.cbt.tests.Homework02_BeforeAfterMethod;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.BrowserUtils;

/*Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
Step 2. And click on “File Upload".
Step 3. Upload any file with .txt extension from your computer.
Step 4. Click “Upload” button.
Step 5. Verify that subject is: “File Uploaded!”
Step 6. Verify that uploaded file name is displayed.
Note: use element.sendKeys(“/file/path”) with specifying path to the file for uploading.
Run this method against “Choose File” button.
 */
    public class Testcase7 {
        public static void main(String[] args) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
           driver.get("https://practice-cybertekschool.herokuapp.com");
           driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[18]/a")).click();
           driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\ulugb\\Desktop\\images (1).jpeg");
           driver.findElement(By.id("file-submit")).click();
           BrowserUtils.wait(2);
            String expectedFileName = "File Uploaded!";
            String actualFileName = driver.findElement(By.cssSelector("#content > div > h3")).getText();
            Assert.assertEquals(actualFileName,expectedFileName, "Success Message is not correct");
            String expectedFile = "images (1).jpeg";
            String actualFile = driver.findElement(By.id("uploaded-files")).getText();
            Assert.assertEquals(actualFile,expectedFile, "Success Message is not correct");

            driver.close();
        }


}
