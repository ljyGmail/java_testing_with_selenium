package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class M_ScrollExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:////Users/ljy/Desktop/Workspace/JavaWorkspace/java_testing_with_selenium/scroll_test.html");

        WebElement elementToScrollTo = driver.findElement(By.id("end"));

        Actions actions = new Actions(driver);
        TimeUnit.SECONDS.sleep(2);

        actions.moveToElement(elementToScrollTo).perform();

        // Using JavascriptExecutor
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", elementToScrollTo);

        TimeUnit.SECONDS.sleep(3);
        driver.quit();
    }
}
