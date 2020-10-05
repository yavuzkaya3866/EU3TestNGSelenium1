package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1_5 {

    WebDriver driver;

    @BeforeMethod
    public void setUP() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        Thread.sleep(1000);
        driver.get("https://practice-cybertekschool.herokuapp.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Registration Form']")).click();
        Thread.sleep(1000);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);

    }
    @Test
    public void test1() throws InterruptedException {

        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("35/17/2002");
        Thread.sleep(1000);

        String expectedText ="The date of birth is not valid";
        String actualText =driver.findElement(By.xpath("//small[text()='The date of birth is not valid']")).getText();

        System.out.println("actualText = " + actualText);

        Assert.assertTrue(expectedText.equals(actualText));


        System.out.println("expectedText = " + expectedText);

    }

    @Test
    public void test2() throws InterruptedException {

        WebElement actualC = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[11]/div"));
        String a = actualC.getText();
        System.out.println("a = " + a);

        Assert.assertTrue(actualC.isDisplayed());

    }

    @Test
    public void test3() throws InterruptedException {

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("a");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/small[2]")).isDisplayed());

        String Message = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/small[2]")).getText();

        System.out.println("Message = " + Message);

    }
    @Test
    public void test4(){

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("a");
        WebElement invalidMessage = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/small[2]"));
        String b = invalidMessage.getText();
        System.out.println("b = " + b);
        Assert.assertTrue(invalidMessage.isDisplayed());

    }
    @Test
    public void test5(){
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Ismail");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Duzel");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("iduzel");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("id4567@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("iduzel49");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("176-222-5555");
        driver.findElement(By.cssSelector("input[value='male']")).click();
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("09/19/1977");
        driver.findElement(By.cssSelector("option[value='AO']")).click();
        driver.findElement(By.xpath("//option[text()='QA']")).click();
        driver.findElement(By.cssSelector("input#inlineCheckbox2")).click();
        driver.findElement(By.cssSelector("button#wooden_spoon")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p")).isDisplayed());
    }



}
