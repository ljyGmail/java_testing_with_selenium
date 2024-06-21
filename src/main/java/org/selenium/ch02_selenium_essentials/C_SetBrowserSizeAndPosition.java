package org.selenium.ch02_selenium_essentials;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_SetBrowserSizeAndPosition {
    public static void main(String[] args) throws InterruptedException {
        // Initialize the WebDriver with Chrome
        WebDriver driver = new ChromeDriver();

        // Navigate to the Apress web page
        driver.get("https://apress.com");

        // Set Window Size and Position using coordinates
        driver.manage().window().setPosition(new Point(30, 30));

        driver.manage().window().setSize(new Dimension(450, 500));

        // Getting the Browser Position
        Point position = driver.manage().window().getPosition();
        System.out.println("Browser Position -X : " + position.getX() + ", Y: " + position.getY());

        Thread.sleep(2000);

        // Getting the Window Size
        Dimension size = driver.manage().window().getSize();
        System.out.println("Window Size - Width: " + size.getWidth() + ", Height: " + size.getHeight());

        System.out.println("Set Browser Size with coordinates");

        // Close the browser and end the session
        driver.quit();
    }
}
