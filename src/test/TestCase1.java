package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Contact_Us_Page;
import utilities.Driver;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        Contact_Us_Page.navigateToContactUsPage();

        WebElement logo = driver.findElement(By.cssSelector("#n-48560"));
        WebElement heading2 = driver.findElement(By.id("dynamic-tagline-48605"));

        System.out.println(logo.isDisplayed() ? "ComfyElite logo is displayed: PASSED" : "ComfyElite logo is displayed: FAILED");
        System.out.println(heading2.getText().equals("High quality comfy pillows and accessories for travel, office and home.")
                ? "Heading 2 validation: PASSED" : "Heading 2 validation: FAILED");




        Driver.quitDriver();

    }
}
