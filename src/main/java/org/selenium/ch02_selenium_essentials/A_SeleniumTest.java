package org.selenium.ch02_selenium_essentials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_SeleniumTest {
    public static void main(String[] args) {
        // Set the path of the Chrome driver executable
        System.setProperty("webdriver.chrome.driver","/Users/ljy/Desktop/Playground/chromedriver-mac-x64/chromedriver");
        // System.setProperty("webdriver.chrome.driver","/Users/ljy/Downloads/chromedriver-mac-arm64/chromedriver");

        // Initialize a Chrome driver instance
        WebDriver driver=new ChromeDriver();

        // Open Google in the browser
        driver.get("https://www.google.com");

        // Close the browser
        driver.quit();
    }
}
