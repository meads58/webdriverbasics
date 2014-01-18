package com.seleniumsimplified.junit;


import org.junit.*;

import static java.lang.System.out;

public class JUnitBeforeAndAfterTest {

    int additionSUm=4;

    @BeforeClass
    public static void beforeClass(){
        out.println("Before class");
    }

    @Before
    public void beforeTest(){
        out.println("Before test");
    }

    @Test
    public void this1TEst(){
        out.println("This is 1 test");
    }

    @Test
    public void this2Test(){
        out.println("This is 2 test");
    }

    @Test
    public void this3TEst(){
       out. println("This is 3 test");
    }

    @After
    public void afterTest(){
        out.println("After test");
    }

    @AfterClass
    public static void afterClassTest(){
        out.println("After class test");
    }

}

