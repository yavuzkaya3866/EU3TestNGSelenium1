package com.cybertek.tests.day2_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        Thread.sleep(2000);

        //navigate to another website with different selenium method
        driver.navigate().to("https://www.facebook.com");

        Thread.sleep(3000);

        driver.navigate().to("https://www.etsy.com/");

        //wait 5 seconds here then move on
        Thread.sleep(5000);

        // goes back to previous page
        driver.navigate().back();

        Thread.sleep(5000);

        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(5000);
        driver.navigate().refresh();

        Thread.sleep(3000);

        driver.close();


    }
}