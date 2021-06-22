package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class workbook1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        // Thread.sleep(2000);
        driver.quit();
    }

    @Test

    public void test1() throws InterruptedException {

       
        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();;

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        Thread.sleep(2000);
        checkbox2.click();
        Thread.sleep(2000);
        checkbox1.click();
        Thread.sleep(2000);
        checkbox2.click();
        Thread.sleep(2000);
        checkbox1.click();
        Thread.sleep(2000);

        Assert.assertFalse(checkbox1.isSelected());
        Assert.assertTrue(checkbox2.isSelected());
    }
    @Test
    public void test2() throws InterruptedException {

        WebDriver driver =WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        WebElement button_blue= driver.findElement(By.xpath("//input[@id='blue']"));
        WebElement button_red= driver.findElement(By.xpath("//input[@id='red']"));

        Thread.sleep(4000);
        Assert.assertTrue(button_blue.isSelected(),"verify that blue_Button is selected");
        Assert.assertFalse(button_red.isSelected(),"verify that red button is ot sellected");
        Thread.sleep(4000);
       button_red.click();
        Thread.sleep(4000);
       Assert.assertTrue(button_red.isSelected());

        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));

        for (WebElement radio: radioButtons){

            System.out.println(radio.getAttribute("id"));



        }

    }
    @Test
    public void test3() throws InterruptedException {

        // DISPLAY DEMO

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement startBtn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        startBtn.click();

        Thread.sleep(8000);

        WebElement username = driver.findElement(By.xpath("//input[@type='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));

        username.sendKeys("AbraCadabra");
        Thread.sleep(3000);
        password.sendKeys("1234512345");
        Thread.sleep(3000);
        submit.click();
        WebElement Error = driver.findElement(By.xpath("//div[@class='flash error']"));
        System.out.println("Error message:  "+Error.getText());
        Thread.sleep(3000);

        driver.quit();
    }

  @Test
    public  void test_Dropdown(){

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");




  }

}
