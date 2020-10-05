package com.cybertek.tests.WorkFile;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class forLoop {

    WebDriver driver;

    @BeforeMethod

    public void setUp(){
        driver=WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void TearDown(){

        driver.quit();

    }
    @Test
    public  void test1(){
        

    }






    }

