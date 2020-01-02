package com.cbt.tests.Homework01Sign_upFor;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


                    // Go to https://practice-cybertekschool.herokuapp.comStep
                    // 2. Verify that number of listed examples is equals to 48.
                    // Hint: use findElemnts() and size() methods.
                        public class TestCase02 {
                        public static void main(String[] args) {
                            WebDriver driver = BrowserFactory.getDriver("chrome");
                            driver.get("https://practice-cybertekschool.herokuapp.com");
                            int expectedResult = 48;

                            int actualResult = driver.findElements(By.className("list-group-item")).size();
                            System.out.println("Expected Result " + expectedResult);
                            System.out.println("Actual Result " + actualResult);
                            StringUtility.verifyEquals(expectedResult, actualResult);

                            driver.close();

                        }
}
