package com.seleniumsimplified.junit;


import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class NavigateTest {

    public static WebDriver driver;
    public String home = "http://compendiumdev.co.uk";

    @BeforeClass
    public static void beforeClass(){
        driver = new FirefoxDriver();
    }

    @Before
    public void gotToHome(){

        driver.navigate().to(home);
    }


    @Test
    public void checkTitleSelenium(){
        String seleniumHome = home + "/selenium";
        driver.navigate().to(seleniumHome);

        assertThat(driver.getTitle(), startsWith("Selenium Simplified"));
    }

    @Test
    public void navBackCheck(){
        String seleniumSearch = home + "/selenium/search.php";
        driver.navigate().to(home + "/selenium");
        driver.navigate().to(seleniumSearch);

        assertTrue("Not on correct page", driver.getTitle().startsWith("Selenium Simplified Search Engine"));

        driver.navigate().back();

        assertTrue("Navigation did not go back correctly", driver.getTitle().startsWith("Selenium Simplified"));
    }


    @Test
    public void navForward(){
          
    }



    @After
    public void goBackHome(){

        driver.navigate().to(home);
    }


    @AfterClass
    public static void afterClass(){
      driver.close();
    }
}
