package org.selenium.ch02_selenium_essentials;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_OpenBrowserExample {
    public static void main(String[] args) throws InterruptedException {
        // For Google Chrome:
        System.setProperty("webdriver.chrome.driver", "/Users/ljy/Desktop/Playground/chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        System.out.println("Google Chrome launched successfully.");

        // Maximizing the Browser Window
        // driver.manage().window().maximize();

        // Minimizing the Browser Window
        // driver.manage().window().minimize();

        // Setting a Specific Browser Window Size
        driver.manage().window().setSize(new Dimension(1024, 768));

        // Using Full-screen Mode
        // driver.manage().window().fullscreen();

        // Setting the Browser Position with Selenium WebDriver
        driver.manage().window().setPosition(new Point(0, 0));

        Thread.sleep(2000);
        driver.quit(); // Close the browser
    }
}
