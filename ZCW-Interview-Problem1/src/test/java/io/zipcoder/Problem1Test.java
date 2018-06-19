package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class Problem1Test {

    private static Problem1 testProb;

    private Map<String, String> testMap;
    private String inputString;

    @Before
    public void setUp() {
        testMap = new HashMap<String, String>();
        testMap.put("f", "7");
        testMap.put("s", "$");
        testMap.put("1", "!");
        testMap.put("a", "@");
        testProb = new Problem1();
        inputString = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
    }

    @Test
    public void testWithIteration() {
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = testProb.withIteration(inputString, testMap);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWithRecursion() {
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = testProb.withRecursion(inputString, testMap);
        Assert.assertEquals(expected, actual);
    }

}


