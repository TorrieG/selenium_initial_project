package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Contact_Us_Page;
import utilities.Driver;

public class TestCase5 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        Contact_Us_Page.navigateToContactUsPage();

        WebElement signUp = driver.findElement(By.xpath("(//div[@data-ux='Element'])[2]"));
        WebElement signUpInput = driver.findElement(By.cssSelector("input[data-aid='CONTACT_FORM_EMAIL_OPT_IN']"));

        signUp.click();
        System.out.println(signUpInput.isSelected() ? "Sign up is selected passed validation: PASSED" : "Sign up is selected passed validation: FAILED");

        signUp.click();
        System.out.println(!signUpInput.isSelected() ? "Sign up is NOT selected passed validation: PASSED" : "Sign up is NOT selected passed validation: FAILED");


        Driver.quitDriver();


    }
}
