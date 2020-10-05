package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //make browser fullscreen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput= driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");


        // task
        // put some email and click sign up button

   //1     //proper way
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@smith.com");

 //2       //lazy way
       // driver.findElement(By.name("email")).sendKeys("mike@smith.com");

        //##############################
        Thread.sleep(6000);  // i did it
        //proper way
        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();



        //lazy way
       // driver.findElement(By.name("wooden_spoon")).click();



    }

}
