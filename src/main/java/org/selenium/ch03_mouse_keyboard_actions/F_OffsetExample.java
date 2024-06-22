package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class F_OffsetExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        Actions actions = new Actions(driver);

        actions.moveByOffset(500, 100).perform();

        driver.quit();
    }
}
