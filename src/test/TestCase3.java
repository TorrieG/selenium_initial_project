package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Contact_Us_Page;
import utilities.Driver;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        Contact_Us_Page.navigateToContactUsPage();

        WebElement heading2 = driver.findElement(By.xpath("(//span[@data-ux='Element'])[16]"));
        WebElement heading4 = driver.findElement(By.xpath("//div[@data-ux='Content']//h4"));

        System.out.println(heading2.getText().equals("Contact Us") ? "\"Contact Us\" validation: PASSED" :"\"Connect With Us\" validation: FAILED");
        System.out.println(heading4.getText().equals("SEND US A MESSAGE") ? "\"SEND US A MESSAGE\" validation: PASSED" :"\"Connect With Us\" validation: FAILED");

        Driver.quitDriver();
    }
}
