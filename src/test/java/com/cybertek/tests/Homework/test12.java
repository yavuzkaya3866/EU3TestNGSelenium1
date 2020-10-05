package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test12 {

   // String url = "https://practice-cybertekschool.herokuapp.com/status_codes";

//    String[] expected = {"This page returned a 200 status code.",
//            "This page returned a 301 status code.",
//            "This page returned a 404 status code.",
//            "This page returned a 500 status code."};


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test12a(){

        driver.get("https://practice-cybertekschool.herokuapp.com/status_codes");

        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[4]/a")).click();

        driver.findElement(By.linkText("500")).click();

        String message = driver.findElement(By.tagName("p")).getText();

        System.out.println(message);


    }

}