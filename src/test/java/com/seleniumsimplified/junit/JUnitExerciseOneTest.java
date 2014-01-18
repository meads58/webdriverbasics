package com.seleniumsimplified.junit;


import com.google.common.collect.Range;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.CoreMatchers.*;

public class JUnitExerciseOneTest {

    int someNumber = 3;
    static int someOtherNumber = 5;

    @BeforeClass
    public static void setSomeOtherNumber(){
        someOtherNumber = 4;
    }

    @Before
    public void setSomeNumber(){
        someNumber = 2;
    }


    @Test
    public void assertTrueExample(){
        assertTrue("check that 2 is less than 4", someNumber < someOtherNumber);

        assertTrue("true is true", true);
    }

    @Test
    public void assertFalseExample(){
        assertFalse("check that 2 doesn't equal 4", someNumber == someOtherNumber);
        assertFalse("false is false", false);
    }

    @Test
    public void assertEqualExample(){
        assertEquals("check that 8 equals 2*4", 8, someNumber * someOtherNumber);
    }

    @Test
    public void assertThatExample(){
        assertThat(someNumber, equalTo(2));
        assertThat(someNumber, greaterThan(1));



    }
}
