package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Contact_Us_Page;
import utilities.Driver;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        Contact_Us_Page.navigateToContactUsPage();

        WebElement firstName = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
        WebElement email = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));
        WebElement firstNameText = driver.findElement(By.xpath("(//label[@data-ux='InputFloatLabelLabel'])[1]"));
        WebElement lastNameText = driver.findElement(By.xpath("(//label[@data-ux='InputFloatLabelLabel'])[2]"));
        WebElement emailText = driver.findElement(By.xpath("(//label[@data-ux='InputFloatLabelLabel'])[3]"));

        WebElement message = driver.findElement(By.tagName("textarea"));

        firstName.sendKeys("Torrie");
        lastName.sendKeys("Green");
        email.sendKeys("abc@123.com");
        message.sendKeys("This is a test");

        System.out.println(firstName.isDisplayed() ? "First name input box is displayed: PASSED" : "First Name input box is displayed: FAILED");
        System.out.println(lastName.isDisplayed() ? "Last name input box is displayed: PASSED" : "Last Name input box is displayed: FAILED");
        System.out.println(email.isDisplayed() ? "Email input box is displayed: PASSED" : "Email input box is displayed: FAILED");
        System.out.println(message.isDisplayed() ? "Message input box is displayed: PASSED" : "Message input box is displayed: FAILED");

        System.out.println(firstName.getAttribute("value").equals("Torrie") ? "User first name send keys: PASSED" : "User first name send keys: FAILED");
        System.out.println(lastName.getAttribute("value").equals("Green") ? "User last name send keys: PASSED" : "User last name send keys: FAILED");
        System.out.println(email.getAttribute("value").equals("abc@123.com") ? "User email send keys: PASSED" : "User email send keys: FAILED");
        System.out.println(message.getText().equals("This is a test") ? "User message send keys: PASSED" : "User message send keys: FAILED");

        System.out.println(firstNameText.getText().equals("First Name*") ? "First Name label: PASSED" : "First Name label: FAILED");
        System.out.println(lastNameText.getText().equals("Last Name*") ? "Last Name label: PASSED" : "Last Name label: FAILED");
        System.out.println(emailText.getText().equals("Email*") ? "Email label: PASSED" : "Email label: FAILED");
        System.out.println(message.getAttribute("placeholder").equals("Message*") ? "Message label: PASSED" : "Message label: FAILED");

        Driver.quitDriver();
    }
}
