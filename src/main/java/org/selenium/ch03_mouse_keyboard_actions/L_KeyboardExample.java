package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class L_KeyboardExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:////Users/ljy/Desktop/Workspace/JavaWorkspace/java_testing_with_selenium/keyboard_test.html");

        Actions actions = new Actions(driver);
        TimeUnit.SECONDS.sleep(3);

        actions.moveToElement(driver.findElement(By.id("name")))
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("java selenium book")
                .keyUp(Keys.SHIFT)
                .perform();

        TimeUnit.SECONDS.sleep(3);
        driver.quit();
    }
}
