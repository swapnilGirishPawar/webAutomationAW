package Pages;

import StepDefinations.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends Base {
    // this driver

    // locators
    By img_Admin_Home = By.xpath("//img[@class='oxd-userdropdown-img']");
    By tab_Admin_Home = By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
    By btn_about_Home = By.xpath("//ul[@class='oxd-dropdown-menu']//a[text()='About']");
    By btn_Support_Home = By.xpath("//ul[@class='oxd-dropdown-menu']//a[text()='Support']");
    By btn_password_Home = By.xpath("//ul[@class='oxd-dropdown-menu']//a[text()='Change Password']");
    By btn_logout_Home = By.xpath("//a[contains(text(),'Logout')]");
    // constructor
    public HomePage(WebDriver driver){
        Base.driver = driver;
    }
    // page Methods
    public void HomePageElementPresentAssertions() {
        WebElement element = driver.findElement(img_Admin_Home);
        Assert.assertTrue(element.isDisplayed());
    }

    public void clickAdminImageSection(){
        System.out.println(tab_Admin_Home+" txt");
        WebElement element  =  driver.findElement(tab_Admin_Home);
        System.out.println(element);
        element.click();
    }
    public void clickLogoutButton(){
        driver.findElement(btn_logout_Home).sendKeys(Keys.ENTER);
    }
    public void clickAboutButton(){
        driver.findElement(btn_about_Home).sendKeys(Keys.ENTER);
    }
    public void clickSupportButton(){
        driver.findElement(btn_Support_Home).sendKeys(Keys.ENTER);
    }
    public void clickPasswordButton(){
        driver.findElement(btn_password_Home).sendKeys(Keys.ENTER);
    }
}
