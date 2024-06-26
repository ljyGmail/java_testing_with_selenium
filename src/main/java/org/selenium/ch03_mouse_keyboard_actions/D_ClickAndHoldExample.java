package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class D_ClickAndHoldExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        WebElement elementToClickAndHold = driver.findElement(By.cssSelector("div h1"));

        TimeUnit.SECONDS.sleep(2);

        Actions actions = new Actions(driver);
        actions.clickAndHold(elementToClickAndHold).moveByOffset(150, 60).perform();

        // Additional actions like moving the element can be performed here
        TimeUnit.SECONDS.sleep(2);

        actions.release().perform(); // Don't forget to release the click

        driver.quit();
    }
}
