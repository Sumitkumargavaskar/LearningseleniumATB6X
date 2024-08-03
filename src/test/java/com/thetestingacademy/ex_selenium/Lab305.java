package com.thetestingacademy.ex_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Lab305 {
    @Test
    public void testVWOLoginTitle(){
        FirefoxDriver driver = new FirefoxDriver();
        //driver.get("app.vwo.com"); // http mandatory
        driver.get("https://app.vwo.com");
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}


