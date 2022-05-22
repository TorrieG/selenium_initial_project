package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Contact_Us_Page;
import utilities.Driver;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        Contact_Us_Page.navigateToContactUsPage();

        WebElement heading1 = driver.findElement(By.xpath("//span[text()='Connect With Us']"));
        WebElement facebookLink = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']"));
        WebElement facebookIcon = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']/*/*"));
        WebElement instagramLink = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']"));
        WebElement instagramIcon = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']/*"));

        System.out.println(heading1.getText().equals("Connect With Us") ? "\"Connect With Us\" validation: PASSED" :"\"Connect With Us\" validation: FAILED");
        System.out.println(facebookIcon.isDisplayed() ? "Facebook icon validation: PASSED" :"Facebook icon validation: FAILED" );
        System.out.println(facebookLink.getAttribute("href").equals("https://www.facebook.com/103179127717601") ? "Facebook hyperlink validation: PASSED" : "Facebook hyperlink validation: FAILED");
        System.out.println(instagramIcon.isDisplayed() ? "Instagram icon validation: PASSED" :"Instagram icon validation: FAILED");
        System.out.println(instagramLink.getAttribute("href").equals("https://www.instagram.com/comfyelite") ? "Instagram logo validation: PASSED" : "Instagram logo validation: FAILED");

        Driver.quitDriver();
    }
}
