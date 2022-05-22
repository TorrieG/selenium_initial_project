package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact_Us_Page {

    public static void navigateToContactUsPage(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUs.click();
        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ?
                "User navigated to \"Contact Us\" page validation: PASSED" : "User navigated to \"Contact Us\" page validation: FAILED");
    }
}
