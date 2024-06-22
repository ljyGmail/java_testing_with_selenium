package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class C_ContextClickExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        WebElement elementToRightClick = driver.findElement(By.cssSelector("p a"));

        Actions actions = new Actions(driver);
        actions.contextClick(elementToRightClick).perform();
        TimeUnit.SECONDS.sleep(3);

        driver.quit();
    }
}
