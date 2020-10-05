package com.cybertek.tests.WorkFile;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class work1_BeforeAfter {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void TearDown() throws InterruptedException {

        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com");

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[7]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
        driver.navigate().back();
        Thread.sleep(3000);


    }


}
