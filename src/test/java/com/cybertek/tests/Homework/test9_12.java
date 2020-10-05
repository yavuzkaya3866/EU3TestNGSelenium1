package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

//Test case #9
//        Step 1. Go to https://practice-cybertekschool.herokuapp.com
//        Step 2. And click on “Status Codes”.
//        Step 3. Then click on “200".
//        Step 4. Verify that following message is displayed: “This page returned a 200 status code”
//
//        Test case #10
//        Step 1. Go to https://practice-cybertekschool.herokuapp.com
//        Step 2. And click on “Status Codes”.
//        Step 3. Then click on “301”.
//        Step 4. Verify that following message is displayed: “This page returned a 301 status code”
//
//
//        Test case #11
//        Step 1. Go to https://practice-cybertekschool.herokuapp.com
//        Step 3. And click on “Status Codes”.
//        Step 4. Then click on “404".
//        Step 5. Verify that following message is displayed: “This page returned a 404 status code”
//
//        Test case #12
//        Step 1. Go to https://practice-cybertekschool.herokuapp.com
//        Step 3. And click on “Status Codes”.
//        Step 4. Then click on “500”.
//        Step 5. Verify that following message is displayed: “This page returned a 500 status code”

public class test9_12 {


    String url = "https://practice-cybertekschool.herokuapp.com/status_codes";
    String [] expected = {"This page returned a 200 status code.",
            "This page returned a 301 status code.",
            "This page returned a 404 status code.",
            "This page returned a 500 status code."};


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
    public void test9_12() throws InterruptedException {

        driver.get(url);
        Thread.sleep(2000);
        List<WebElement> numberOfElements = driver.findElements(By.xpath("//*[@id=\"content\"]//li"));
        int number = numberOfElements.size();

        System.out.println("number = " + number);


        for (int i = 1; i <= numberOfElements.size(); i++) {
            WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[" + i + "]/a"));
            element.click();
            WebElement element1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p"));
            String str = element1.getText();
            System.out.println(i + ".s1 = " + str);

            Assert.assertTrue(element1.isDisplayed());
            //Assert.assertTrue(str.contains(expected[i-1]));
//            String actual= str.substring(0,str.indexOf("\n"));
//            Assert.assertEquals(actual,expected[i-1]);

            driver.navigate().back();
            Thread.sleep(2000);


        }

    }

    @Test
    public void test9(){

        driver.findElement(By.linkText("500")).click();
        String message = driver.findElement(By.tagName("p")).getText();
        Assert.assertTrue(message.contains("This page returned a 500 status code"), "verify message");
    }

}