package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.setUps;

public class LoginPage extends setUps {

    protected DashboardPage dashboardPage;

       public LoginPage (WebDriver driver){
        this.driver = driver;

    }
    // Create a WebDriver Object
    private WebDriver driver;

       //Using By as a location to identify the login fields
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button");
    private By companyLogo = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/nav/a/img");
    private By forgotPassword = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/div[2]/div[2]/a");
    private By pageTitle = By.linkText("Deydam") ;

    // create a constructor for each elements
    public void verifyCompanyLogo (){
        //find the company logo element and verify
        driver.findElement(companyLogo).isDisplayed();
    }
    public void verifyPageTitle (){
        //find the page title  element and verify
        driver.findElement(pageTitle).isDisplayed();
    }

    public void verifyForgetPassword (){
        //find the forgotPassword element and verify
        driver.findElement(forgotPassword).isDisplayed();
    }

    public void enterUsername (String uName  ){
    //find the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }
    
    public void enterPassword (String pwd  ){
        //find the password element and enter the password
        driver.findElement(password).sendKeys(pwd);
    }
    public DashboardPage clickLoginButton(){
        //find the login Button and cick it
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);

    }






}
