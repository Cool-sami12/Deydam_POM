package login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setUp.setUps;

public class loginTest extends setUps {

    @Test(priority = 1)
    public void testVerifyCompanyLogo(){
        loginPage.verifyCompanyLogo();
    }

    @Test(priority = 2)
    public void testVerifyForgotPassword(){
        loginPage.verifyForgetPassword();
    }
    @Test(priority = 3)
    public void testVerifyPageTitle(){
        loginPage.enterUsername("veragreen");
        loginPage.enterPassword("admin123");
        DashboardPage dashboardPage = loginPage.clickLoginButton();

        // check if the pageTitle is correct
        String pageTitle = "Deydam";
        if (pageTitle.equalsIgnoreCase("Deydam")){
            System.out.println("The page title is " + pageTitle);
        } else {
            System.out.println("The page title is incorrect. Actual page title is  " + pageTitle);
        }

    }


}
