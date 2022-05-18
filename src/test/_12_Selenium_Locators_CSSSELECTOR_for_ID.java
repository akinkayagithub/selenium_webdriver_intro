package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _12_Selenium_Locators_CSSSELECTOR_for_ID {
    /*
    TEST CASE:
    1. Go to "https://www.google.com/"
    2. Validate the "I'm Feeling Lucky" button is displayed under search input box

    NOTE: for the test case above we will use cssSelector
    NOTE: The "I'm Feeling Lucky" button has an id attribute as "gbqfbb"
     */

    public static void main(String[] args) throws InterruptedException {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to "https://www.google.com/" using get() method
        driver.get("https://www.google.com/");

        // 3. Locate the button using cssSelector and validate it is displayed
        WebElement feelingLuckyButton = driver.findElement(By.cssSelector("#gbqfbb"));

        System.out.println(feelingLuckyButton.isDisplayed()); // true

        // 6. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
