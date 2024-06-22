package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class A_Mouse {
    public static void main(String[] args) throws InterruptedException {
        // Note:: Starting with ChromeDriver version 114,
        // there is no need to download or specify the chromedriver location
        // Creating a new instance for Chrome driver
        WebDriver driver = new ChromeDriver();

        // Directing to the URL
        driver.get("https://www.selenium.dev");

        // Timer for page to get downloaded
        TimeUnit.SECONDS.sleep(5);

        // Locating Sign in button
        WebElement login_button = driver.findElement(By.linkText("Downloads"));

        // Clicking on the 'login' button
        login_button.click();

        TimeUnit.SECONDS.sleep(5);
        driver.quit();
    }
}
