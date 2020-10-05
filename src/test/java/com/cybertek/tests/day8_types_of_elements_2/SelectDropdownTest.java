package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1(){

        driver.get("http://practice.cybertekschool.com/dropdown");
        //1- locate your dropdown just like any other webelement with uniq
        WebElement dropdownElement= driver.findElement(By.id("state"));
        //2.create Slect object by passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);

        List<WebElement> options = stateDropdown.getOptions();

        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());

        }

    }

    @Test
    public void test2() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dropdown");
        //1- locate your dropdown just like any other webelement with uniq
        WebElement dropdownElement= driver.findElement(By.id("state"));

        //2.create Slect object by passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);

        // verify that first selection is Select a state

        String expectedOption= "Select a State";
        String actualOptin = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptin,expectedOption,"verify first selection");

        //HOW TO SELECT OPTIONS FROM DROPDOWN
        //1. SELECT USING VISIBLE TEXT
        Thread.sleep(3000);
        stateDropdown.selectByVisibleText("Virginia");

        expectedOption = "Virginia";
        actualOptin=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptin,expectedOption,"verify first selection");

        //2.SELECT USING INDEX
        Thread.sleep(2000);
        stateDropdown.selectByIndex(51);

        expectedOption= "Wyoming";
        actualOptin= stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptin,expectedOption,"verify first selection");

        // 3.SELECT BY VALUE
        Thread.sleep(2000);
        stateDropdown.selectByValue("IL");

        expectedOption="Illinois";
        actualOptin= stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptin,expectedOption,"verify first selection");

    }

}
