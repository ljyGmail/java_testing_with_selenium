package org.selenium.ch02_selenium_essentials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_BackClickExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // Perform a click action
        WebElement link = driver.findElement(By.cssSelector("p a"));
        link.click();

        // Navigate back
        driver.navigate().back();

        Thread.sleep(2000);
        driver.quit();
    }
}
