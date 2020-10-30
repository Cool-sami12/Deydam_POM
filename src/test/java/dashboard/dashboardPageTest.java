package dashboard;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import setUp.setUps;

public class dashboardPageTest extends setUps{


    // Create a WebDriver Object
    private WebDriver driver;


    @Test(priority = 4)
    public void testVerifyCompanyBrand(){
        dashboardPage.verifyCompanyBrand();
    }

    @Test(priority = 5)
    public void testVerifyClickUsername(){
        dashboardPage.clickUsername();
    }
    @Test(priority = 6)
    public void testVerifyClickLogout(){
        dashboardPage.clickLogout();
    }
    @Test (priority = 7)
    public void testVerifyClickSubmitButton(){
        dashboardPage.clickSubmitButton();
    }
    @Test(priority = 8)
    public void testVerifyShowFriendSuggestion(){
        dashboardPage.showFriendSuggestion();
    }

}
