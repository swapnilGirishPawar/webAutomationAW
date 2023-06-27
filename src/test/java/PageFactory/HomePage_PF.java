package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
    WebDriver driver;
    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    WebElement txt_admin_section_home;

    public void elementPresent(WebElement element){
        System.out.println("here");
        if(element.isDisplayed())
            System.out.println("Element is present on the screen.");
    }
    public HomePage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, HomePage_PF.class);
    }
}
