package tests.day07;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest {
    // runs only once before beforemethod, and before all tests
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class!");
    }
    //runs automatically before every test
    @BeforeMethod
    public void setup(){
        //some code that will be running before every test, like; test1, test2, test3...
        //we can use method with @beforeMethod annotation
        System.out.println("Before method!");
    }
    //runs automatically before everytest
    @AfterMethod
    public void teardown(){
        System.out.println("After Method!");
    }

    @Test
    public void test1(){
        System.out.println("Test1!");
        Assert.assertTrue(5==5);
    }
    @Test
    public void test2() {
        System.out.println("Test2!");
    }
    @Test
    public void test3() {
        System.out.println("Test3!");
    }
    }
