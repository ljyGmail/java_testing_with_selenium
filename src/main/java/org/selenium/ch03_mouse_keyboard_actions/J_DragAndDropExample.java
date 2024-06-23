package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class J_DragAndDropExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        TimeUnit.SECONDS.sleep(2);

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);

        WebElement srcElement = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

        Actions actions = new Actions(driver);
        TimeUnit.SECONDS.sleep(2);

        actions.dragAndDrop(srcElement, targetElement).perform();

        TimeUnit.SECONDS.sleep(2);
        driver.quit();
    }
}
