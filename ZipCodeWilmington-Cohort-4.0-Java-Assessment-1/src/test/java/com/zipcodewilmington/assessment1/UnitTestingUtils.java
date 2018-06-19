package com.zipcodewilmington.assessment1;

import org.junit.Assert;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying this class.
 */
public class UnitTestingUtils {
    public synchronized static <T, E> void assertArrayEquality(T[] expected, E[] actual) {
        Arrays.sort(expected);
        Arrays.sort(actual);
        String expectedString = Arrays.toString(expected);
        String actualString = Arrays.toString(actual);
        boolean equality = expectedString.equals(actualString);

        System.out.println("\n\nExpected:\n\t" + expectedString);
        System.out.println("\nActual:\n\t" + actualString);
        System.out.println("\nEquivalence:\n\t" + equality);

        Assert.assertEquals(expectedString, actualString);
        Assert.assertEquals(expected, actual);
    }
}