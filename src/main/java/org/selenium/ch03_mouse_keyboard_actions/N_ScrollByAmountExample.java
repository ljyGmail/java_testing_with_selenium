package org.selenium.ch03_mouse_keyboard_actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class N_ScrollByAmountExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev/");
        TimeUnit.SECONDS.sleep(2);

        int deltaX = 50;
        int deltaY = 100;

        new Actions(driver).scrollByAmount(deltaX,deltaY).perform();

        TimeUnit.SECONDS.sleep(2);
        driver.quit();
    }
}
