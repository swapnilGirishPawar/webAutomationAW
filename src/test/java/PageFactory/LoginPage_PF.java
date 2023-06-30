package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

    @FindBy(name = "username")
       WebElement txt_username;
    WebDriver driver;
    @FindBy(name = "password")
    WebElement txt_password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btn_login;

    public void enterUsername(String username){
        txt_username.sendKeys(username);
    }
    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }
    public void clickLoginButton(){
        btn_login.sendKeys(Keys.ENTER);
    }

    public LoginPage_PF(WebDriver driver1){
        this.driver = driver1;
        PageFactory.initElements(driver1, this);
    }

}