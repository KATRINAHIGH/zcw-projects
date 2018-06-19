package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem2Test {

    Problem2 testProb;

    @Before
    public void setup(){
        testProb = new Problem2();
    }

    @Test
    public void testFibonacciIteration(){
        int n = 150;
        String expectedOutput = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        testProb.fibonacciIteration(n);
        String actualOutput = testProb.toString();
        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void testFibonacciRecursion(){
        int n = 150;
        String expectedOutput = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        testProb.fibonacciRecursion(n);
        String actualOutput = testProb.toString();
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}




