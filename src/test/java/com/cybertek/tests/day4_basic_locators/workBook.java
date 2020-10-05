package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class workBook {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        // WebElement link1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        // link1.click();

        Thread.sleep(5000);

        WebElement link4= driver.findElement(By.partialLinkText("Example 4:"));
        link4.click();

        Thread.sleep(10000);

        WebElement HomeLink= driver.findElement(By.className("nav-link"));
        HomeLink.click();

        driver.get("http://practice.cybertekschool.com/add_remove_elements/");





    }
}
