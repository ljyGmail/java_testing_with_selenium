package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class G_OffsetFromElementExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        WebElement h1Element = driver.findElement(By.xpath("/html/body/div[1]/h1"));

        Actions actions = new Actions(driver);

        actions.moveToElement(h1Element)
                .moveByOffset(200, 200)
                .contextClick()
                .perform();

        TimeUnit.SECONDS.sleep(5);
        driver.quit();
    }
}
