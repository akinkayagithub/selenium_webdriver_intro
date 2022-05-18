package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _03_Selenium_Locators_ID {
    /*
    -Locators are Selenium methods that are used to locate certain web elements
    -Selenium locators are set of methods coming from Selenium jar files/library
    -There are 8 different locators coming from By class
    -There are mainly 2 methods helps us to findElements
    -findElement() method returns a single web element, and it can be stored in a WebElement variable
    -findElements() method returns a list of web elements, and they can be stored in a List<WebElement>

    -id as a locator is one of the most common ways of identifying elements on a web page
    -An id for a web element always needs to be unique
    -It is also the fastest way of locating web elements and is considered as one of the most reliable methods for determining an element
    -Due to all benefits above, it is highly recommended to use id locator to locate any web element if it is present

    TEST CASE:
    1. Go to https://www.wikipedia.org/
    2. Validate the Wiki search input box is displayed in the middle of the page

    NOTE: The search input box has an id attribute as "searchInput"
    NOTE: isDisplayed() method is used to verify the presence of a particular web element, and it will return true if element is found, and false otherwise
     */

    public static void main(String[] args) {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to "https://www.google.com/" using get() method
        driver.get("https://www.wikipedia.org/");

        // 3. Locate the search input element and make sure that it is displayed
        WebElement searchInputBox = driver.findElement(By.id("searchInput"));

        if(searchInputBox.isDisplayed()) System.out.println("The search input box validation PASSED");
        else System.out.println("The search input box  validation FAILED");

        // 4. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
