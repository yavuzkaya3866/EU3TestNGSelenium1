package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test8 {

    @Test
    public void test8() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
        driver.findElement(By.xpath("//input[@id='myCountry']")).sendKeys("United States of America");
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        WebElement verify = driver.findElement(By.xpath("//*[@id='result']"));
        Assert.assertTrue(verify.isDisplayed());
    }
}
