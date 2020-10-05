package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {


    public static void main(String[] args) throws InterruptedException {

 /*Verify URL changed
        open browser
        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        enter any email
        click on Retrieve password
        verify that url changed to http://practice.cybertekschool.com/email_sent
    */
//open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("cHromE");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));

        //sendKeys()--> send keyboard action to the webelement
        emailInputBox.sendKeys("mike@smith.com");

        //click retrieve password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        Thread.sleep(5000);

        //verify that url changed to http://practice.cybertekschool.com/email_sent

        String expectedUrl= "http://practice.cybertekschool.com/email_sent";

        //saving actual url from browser after we enter
        String actualUrl= driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.quit();
    }




}
