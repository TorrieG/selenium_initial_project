package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Contact_Us_Page;
import utilities.Driver;

public class TestCase6 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        Contact_Us_Page.navigateToContactUsPage();

        WebElement send = driver.findElement(By.xpath("//div[@data-ux='Block']/button"));
        System.out.println(send.isDisplayed() ? "Send button is displayed: PASSED" : "Send button is displayed: FAILED");
        System.out.println(send.isEnabled() ? "Send button is enabled: PASSED" : "Send button is enabled: FAILED");
        System.out.println(send.getText().equals("SEND") ? "Send button text is displayed: PASSED" : "Send button text is displayed: FAILED");


        Driver.quitDriver();
    }
}
