package com.zipcodewilmington.arrayutility;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 3/1/18.
 * The purpose of this class is to thoroughly test the method getNumberOfOccurrences()
 */
public class GetNumberOfOccurrencesTest {
    @Test
    public void integerTest() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 3;
        Integer[] inputArray = {1, 2, valueToEvaluate, 8, 4, 5, valueToEvaluate, 0, 9, 8, valueToEvaluate};
        ArrayUtility<Integer> arrayUtility = new ArrayUtility<Integer>(inputArray);

        // When
        Integer actual = arrayUtility.getNumberOfOccurrences(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longTest() {
        // Given
        Long valueToEvaluate = 7L;
        Integer expected = 4;
        Long[] inputArray = {1L, 2L, valueToEvaluate, 8L, 4L, 5L, valueToEvaluate, 0L, 9L, 8L, valueToEvaluate, valueToEvaluate};
        ArrayUtility<Long> arrayUtility = new ArrayUtility<Long>(inputArray);

        // When
        Integer actual = arrayUtility.getNumberOfOccurrences(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringTest() {
        // Given
        String valueToEvaluate = "a";
        Integer expected = 2;
        String[] inputArray = {"1", "2", valueToEvaluate, "8", "4", "5", valueToEvaluate, "0", "9", "8"};
        ArrayUtility<String> arrayUtility = new ArrayUtility<String>(inputArray);

        // When
        Integer actual = arrayUtility.getNumberOfOccurrences(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void objectTest() {
        // Given
        Object valueToEvaluate = new Object();
        Integer expected = 1;
        Object[] inputArray = {"1", "2", "8", "4", "5", "0", "9", "8", valueToEvaluate};
        ArrayUtility<Object> arrayUtility = new ArrayUtility<Object>(inputArray);

        // When
        Integer actual = arrayUtility.getNumberOfOccurrences(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
