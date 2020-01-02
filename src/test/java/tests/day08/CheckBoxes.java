package tests.day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;

import java.util.List;

public class CheckBoxes {
    //control+shift+L-->to organize code
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        //        <a href="/checkboxes">Checkboxes</a>
        driver.findElement(By.linkText("Checkboxes")).click();
    }
    @Test
    public void test1() {
        List<WebElement>checkBoxes=driver.findElements(By.cssSelector("[type='checkbox'"));
        int index=1;
        for(WebElement checkbox:checkBoxes){
            if(checkbox.isEnabled() && !checkbox.isSelected()){
                checkbox.click();
                System.out.println("Checkbox clicked: #"+index);
            }else{
                System.out.println("Checkbox was not clicked: #"+index);
            }
            index++;
        }
    }

    @AfterMethod
    public void teardown(){
        driver.close();
    }
    }

