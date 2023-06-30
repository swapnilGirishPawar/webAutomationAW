package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
    // this driver
    protected WebDriver driver;
    // locators
    By img_Admin_Home = By.xpath("//img[@class='oxd-userdropdown-img']");
    // constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // page Methods
    public void HomePageElementPresentAssertions() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(img_Admin_Home);
        Assert.assertTrue(element.isDisplayed());
    }
}
