package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    By txt_admin_section_home = By.xpath("//a[@class='oxd-main-menu-item']");

    public void elementPresent(WebElement element){
        Boolean status = element.isDisplayed();
        if(status)
            System.out.println("Element is present on the screen.");
    }
    public HomePage(){

    }
}
