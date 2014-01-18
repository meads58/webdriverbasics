package com.seleniumsimplified.webdriver;


import com.thoughtworks.selenium.Selenium;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static junit.framework.Assert.assertTrue;


public class FirstTest

{
    @Test
    public void driverIsKing()
    {

        WebDriver driver = new HtmlUnitDriver(); //headless driver, no browser is displayed. There are firefox, chrome etc.. drivers
        //a good quick test for html that won't run a browser.

        driver.get("http://www.compendiumdev.co.uk/selenium");

        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
    }

    @Test
    public void firefoxIsSupportByWebdriver()
    {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.compendiumdev.co.uk/selenium");

        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();//close the current window. exit() will close all windows ctrl + j


    }
}

