package com.zipcodewilmington.arrayutility;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 3/1/18.
 * The purpose of this class is to thoroughly test the method countDuplicatesInMerge()
 */
public class CountDuplicatesInMergeTest {
    @Test
    public void integerTest() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 5;
        Integer[] inputArray = {1, 2, valueToEvaluate, 8, 4, 5, valueToEvaluate, 0, 9, 8, valueToEvaluate};
        Integer[] arrayToMerge = {1, 2, valueToEvaluate, 8, 4, 5, valueToEvaluate, 0, 9, 8};
        ArrayUtility<Integer> arrayUtility = new ArrayUtility<Integer>(inputArray);

        // When
        Integer actual = arrayUtility.countDuplicatesInMerge(arrayToMerge, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longTest() {
        // Given
        Long valueToEvaluate = 7L;
        Integer expected = 6;
        Long[] inputArray = {1L, 2L, valueToEvaluate, 8L, 4L, 5L, valueToEvaluate, 0L, 9L, 8L, valueToEvaluate};
        Long[] arrayToMerge = {1L, 2L, valueToEvaluate, 8L, 4L, 5L, valueToEvaluate, 0L, 9L, 8L, valueToEvaluate};
        ArrayUtility<Long> arrayUtility = new ArrayUtility<Long>(inputArray);

        // When
        Integer actual = arrayUtility.countDuplicatesInMerge(arrayToMerge, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringTest() {
        // Given
        String valueToEvaluate = "a";
        Integer expected = 7;
        String[] inputArray = {"1", "2", valueToEvaluate, "8", "4", "5", valueToEvaluate, "0", "9", "8", valueToEvaluate};
        String[] arrayToMerge = {"1", "2", valueToEvaluate, "8", "4", "5", valueToEvaluate, "0", "9", "8", valueToEvaluate, valueToEvaluate};

        ArrayUtility<String> arrayUtility = new ArrayUtility<String>(inputArray);

        // When
        Integer actual = arrayUtility.countDuplicatesInMerge(arrayToMerge, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void objectTest() {
        // Given
        Object valueToEvaluate = "a";
        Integer expected = 8;
        Object[] inputArray = {"1", "2", valueToEvaluate, "8", "4", "5", valueToEvaluate, "0", "9", "8", valueToEvaluate};
        Object[] arrayToMerge = {"1", "2", valueToEvaluate, "8", "4", "5", valueToEvaluate, "0", "9", "8", valueToEvaluate, valueToEvaluate, valueToEvaluate};

        ArrayUtility<Object> arrayUtility = new ArrayUtility<Object>(inputArray);

        // When
        Integer actual = arrayUtility.countDuplicatesInMerge(arrayToMerge, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
