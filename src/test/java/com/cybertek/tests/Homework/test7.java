package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test7 {

    @Test
    public void test7() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[18]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#file-upload")).sendKeys( "/Users/x/Desktop/file.txt");
        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
        WebElement verify = driver.findElement(By.cssSelector("div#uploaded-files"));
        System.out.println(verify.getText());
        Assert.assertTrue(verify.isDisplayed());

    }
}
