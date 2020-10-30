package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class setUps {
    //Create a Login Object
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
     // Create a WebDriver Object
    private WebDriver driver;
    
 @BeforeTest

    public void setUp(){

        //Importation of ChromeDriver
        System.setProperty("webdriver.chrome.driver","resources/chromeDriver.exe");

        //Instantiate a webDriver Object
        driver = new ChromeDriver();

        //Maximize window size
        driver.manage().window().maximize();

        //launch the application
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Instantiate the login page after launching the browser - Handle
        loginPage = new LoginPage(driver);





    }
   /* @AfterTest
    public void cleanUp(){
        driver.manage().deleteAllCookies();
    }

    */
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }


}
