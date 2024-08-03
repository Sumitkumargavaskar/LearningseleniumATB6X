package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Lab304 {
    public static void main(String[] args) throws MalformedURLException {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://bing.com");
        driver.navigate().to("https://app.vwo.com");

        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
