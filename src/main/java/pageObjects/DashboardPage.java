package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        
    }
    // Create a WebDriver Object
    private WebDriver driver;

    //using By to locate dashboard page elements
    private By welcome = By.className("topbar__avatar-name");
    private By logoutButton = By.className("topbar__link-title");
    private By friendSuggestion = By.xpath("//*[@id=\"feeds\"]/div/div/div/div[2]/div/div/h5");
    private By submitButton = By.className("submit-post");
    private By companyBrand = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[1]/a");

    public void verifyCompanyBrand (){
        //find the company logo element and verify
        driver.findElement(companyBrand).isDisplayed();
    }

    public void clickUsername (){
        //find the element and click on the username button
        driver.findElement(welcome).click();
    }
    public LoginPage clickLogout (){
        //find the element and click on the username button
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }
    public void clickSubmitButton(){
        //find the element and get the text of the button
        driver.findElement(submitButton).getText();
    }
    public void showFriendSuggestion(){
        //find the element and ensure the element is displayed
        driver.findElement(friendSuggestion).isDisplayed();
    }


}
