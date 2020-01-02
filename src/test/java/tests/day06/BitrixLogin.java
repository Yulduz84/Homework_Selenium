package tests.day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class BitrixLogin {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        // go to bitrix
        driver.get("https://login1.nextbasecrm.com/?login=yes");
        // enter email
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("helpdesk37@cybertekschool.com");
        //enter password
        driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("UserUser");
       driver.findElement(By.xpath("//input[@class='login-btn']")).click();
       driver.findElement(By.xpath("//a[@title='Activity Stream']")).click();
        BrowserUtils.wait(2);
        driver.close();
    }
}
