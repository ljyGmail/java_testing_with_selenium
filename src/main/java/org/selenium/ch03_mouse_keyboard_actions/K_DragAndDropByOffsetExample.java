package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class K_DragAndDropByOffsetExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);

        WebElement srcElement = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement targetElement = driver.findElement(By.xpath("//*[@id='droppable']"));

        Point srcLocation = srcElement.getLocation();
        Point targetLocation = targetElement.getLocation();

        int xOffset = targetLocation.getX() - srcLocation.getX();
        int yOffset = targetLocation.getY() - srcLocation.getY();

        Actions actions = new Actions(driver);
        TimeUnit.SECONDS.sleep(3);

        actions.dragAndDropBy(srcElement, xOffset + 10, yOffset + 20).perform();

        TimeUnit.SECONDS.sleep(3);
        driver.quit();
    }
}
