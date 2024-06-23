package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

import java.util.concurrent.TimeUnit;

public class O_ScrollFromElementExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://link.springer.com/");

        WebElement originationElement = driver.findElement(By.linkText("Statistics"));

        // Define the scroll origin at the center of the element
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(originationElement, 0, 10);
        TimeUnit.SECONDS.sleep(2);

        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 0)
                .perform();

        TimeUnit.SECONDS.sleep(2);
        driver.quit();
    }
}
