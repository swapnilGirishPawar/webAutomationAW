package Pages;
import StepDefinations.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import static org.bouncycastle.cms.RecipientId.password;

public class LoginPage extends Base {
    private final By txt_username_login = By.name("username");
    private final By txt_password_login = By.name("password");
    private final By btn_login = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver){
        Base.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(txt_username_login).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(txt_password_login).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btn_login).sendKeys(Keys.ENTER);
    }

    public void navigateToHomeScreen(String username, String password){
        driver.findElement(txt_username_login).sendKeys(username);
        driver.findElement(txt_password_login).sendKeys(password);
        driver.findElement(btn_login).sendKeys(Keys.ENTER);
    }

    @BeforeMethod
    public void beforeMethod(String username, String password){
        driver.findElement(txt_username_login).sendKeys(username);
        driver.findElement(txt_password_login).sendKeys(username);
        driver.findElement(btn_login).sendKeys(Keys.ENTER);
    }
    public void loginPageAssertions() {
        WebElement passField =  driver.findElement(txt_password_login);
        WebElement usrnmField = driver.findElement(txt_username_login);
        Assert.assertTrue(passField.isDisplayed());
        Assert.assertTrue(usrnmField.isDisplayed());
    }
}
