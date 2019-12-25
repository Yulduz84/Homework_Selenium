package tests.day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

import java.util.List;

public class WarmUp {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://cybertekschool.com/");
        //how to find all links
        //every link as a tag name<a>
        List<WebElement> elements=driver.findElements(By.xpath("//a"));
        //size of the list =number of links
        System.out.println("Number of links: "+elements.size());
        for(WebElement webElement:elements){
            System.out.println(webElement.getText());

        }
        driver.close();
    }
}
