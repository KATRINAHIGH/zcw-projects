package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.UnitTestingUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtilsTest {
    @Test
    public void getNumberOfOccurrencesTest1() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 3;
        Integer[] inputArray = {1, 2, 7, 8, 4, 5, 7, 0, 9, 8, 7};

        // When
        Integer actual = ArrayUtils.getNumberOfOccurrences(inputArray, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeValueTest1() {
        // Given
        Integer valueToRemove = 7;
        Integer[] expected = {1, 2, 8, 4, 5, 0, 9, 8};
        Integer[] inputArray = {1, 2, 7, 8, 4, 5, 7, 0, 9, 8, 7};

        // When
        Integer[] actual = (Integer[]) ArrayUtils.removeValue(inputArray, valueToRemove);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void getMostCommonTest() {
        // Given
        Integer expected = 7;
        Integer[] inputArray = {1, 2, 7, 8, 4, 5, 7, 0, 9, 8, 7};

        // When
        Integer actual = (Integer) ArrayUtils.getMostCommon(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLeastCommonTest() {
        // Given
        Integer expected = 2;
        Integer[] inputArray = {1,1,2,3,3,3,4,4,4,4};

        // When
        Integer actual = (Integer) ArrayUtils.getLeastCommon(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mergeArraysTest() {
        // Given
        Integer[] array1 = {1,1,1,2,2,2};
        Integer[] array2 = {3,3,3,4,4,4};
        Integer[] expected = {1,1,1,2,2,2,3,3,3,4,4,4};

        // When
        Integer[] actual = (Integer[]) ArrayUtils.mergeArrays(array1, array2);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }
}
