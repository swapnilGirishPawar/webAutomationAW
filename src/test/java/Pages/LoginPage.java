package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;
    private final By txt_username_login = By.name("username");
    private final By txt_password_login = By.name("password");
    private final By btn_login = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver){
        this.driver  = driver;
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

}