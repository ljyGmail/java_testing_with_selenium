package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class E_MoveMouseCursorExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");
        Actions actions = new Actions(driver);

        WebElement link = driver.findElement(By.cssSelector("div h1"));
        TimeUnit.SECONDS.sleep(2);

        actions.moveToElement(link).perform();
        TimeUnit.SECONDS.sleep(5);

        driver.quit();
    }
}
