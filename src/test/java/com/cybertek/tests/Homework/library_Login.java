package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class library_Login {


    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://library2.cybertekschool.com/login.html");

        driver.findElement(By.id("inputEmail")).sendKeys("librarian15@library");
        driver.findElement(By.id("inputPassword")).sendKeys("S5Ejblg1");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://library2.cybertekschool.com/login.html");

        driver.findElement(By.id("inputEmail")).sendKeys("student98@library");
        driver.findElement(By.id("inputPassword")).sendKeys("A15Oposz");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
