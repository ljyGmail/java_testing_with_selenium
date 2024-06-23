package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class H_OffsetExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        Actions actions = new Actions(driver);

        // offset from viewport
        actions.moveByOffset(200,100)
                .contextClick()
                .perform();

        TimeUnit.SECONDS.sleep(5);
        driver.quit();
    }
}
