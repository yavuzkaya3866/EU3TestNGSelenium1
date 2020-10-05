package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNmaeInput= driver.findElement(By.tagName("input"));
        fullNmaeInput.sendKeys("Mike Smith With TagName");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@smith.com");

        //lazy way to click button
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(5000);

        driver.quit();
    }
}
