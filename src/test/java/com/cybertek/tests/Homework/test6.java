package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test6 {

    @Test
    public void test6() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.tempmailaddress.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='wpcc-btn']")).click();
        String email = driver.findElement(By.xpath("//div/span[@id='email']")).getText();
        System.out.println("email = " + email);

        driver.get("https://practice-cybertekschool.herokuapp.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Sign Up For Mailing List']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name=full_name]")).sendKeys("Ismail Duzel");
        driver.findElement(By.cssSelector("input[name=email]")).sendKeys(email);
        driver.findElement(By.cssSelector("button[name=wooden_spoon]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("h3.subheader")).isDisplayed());
        Thread.sleep(2000);


        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);


        WebElement emailFrom = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span"));
        String a = emailFrom.getText();
        System.out.println("a = " + a);
        Assert.assertTrue(emailFrom.isDisplayed());


        driver.findElement(By.xpath("//*[@id=\"schranka\"]/tr[3]/td[1]/span[1]")).click();
        //Step 10 ?
        //driver.findElement(By.xpath("//tbody/tr[3]")).click();


    }



    }
