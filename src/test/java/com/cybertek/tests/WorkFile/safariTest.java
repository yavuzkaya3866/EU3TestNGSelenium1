package com.cybertek.tests.WorkFile;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class safariTest {

 @Test
    public void test1(){

     WebDriver driver= new SafariDriver();

     driver.get("https://www.apple.com");

     driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[7]/a")).click();


 }
}
