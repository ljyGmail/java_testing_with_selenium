package org.selenium.ch02_selenium_essentials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E_ForwardClickExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        WebElement link = driver.findElement(By.cssSelector("p a"));
        link.click();
        Thread.sleep(1000);
        // Navigate back
        driver.navigate().back();
        Thread.sleep(1000);
        // Navigate forward
        driver.navigate().forward();
        Thread.sleep(3000);

        // Perform some actions, the refresh the page
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.quit();
    }
}
