package tests.VytrackAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.TestBase;
import utils.Driver;

//we write extends TestBase to inherit @before and @after methods
//this class will be dedicated to tests related to Login page only
//we don't have to find elements here
//we should find elements in page classes only
public class LoginTests extends TestBase {
    @Test(description = "Verify that page title is a 'DASHBOARD'")
    public void test1(){
        //create page object
        LoginPage loginPage=new LoginPage();
        // call login method
        //provide username and password
        loginPage.login("storemanager85","UserUser123");
        //verification stage
        Assert.assertEquals(Driver.get().getTitle(), "Dashboard");
    }

}
