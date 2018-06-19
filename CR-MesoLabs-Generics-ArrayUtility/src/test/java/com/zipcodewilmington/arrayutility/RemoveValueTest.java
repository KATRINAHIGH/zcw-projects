package com.zipcodewilmington.arrayutility;

//import com.zipcodewilmington.UnitTestingUtils;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by leon on 3/1/18.
 * The purpose of this class is to thoroughly test the method removeValue()
 */
public class RemoveValueTest {
    @Test
    public void integerTest() {
        // Given
        Integer valueToRemove = 7;
        Integer[] expected = {11, 2, 8, 4, 5, 0, 9, 8};
        Integer[] inputArray = {11, 2, valueToRemove, 8, 4, 5, valueToRemove, 0, 9, 8, valueToRemove};
        ArrayUtility<Integer> arrayUtility = new ArrayUtility<Integer>(inputArray);


        // When
        Integer[] actual = arrayUtility.removeValue(valueToRemove);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }

    @Test
    public void longTest() {
        // Given
        Long valueToRemove = 7L;
        Long[] expected = {12L, 2L, 8L, 4L, 5L, 0L, 9L, 8L};
        Long[] inputArray = {12L, 2L, valueToRemove, 8L, 4L, 5L, valueToRemove, 0L, 9L, 8L, valueToRemove};
        ArrayUtility<Long> arrayUtility = new ArrayUtility<Long>(inputArray);


        // When
        Long[] actual = arrayUtility.removeValue(valueToRemove);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void stringTest() {
        // Given
        String valueToRemove = "7";
        String[] expected = {"13", "2", "8", "4", "5", "0", "9", "8"};
        String[] inputArray = {"13", "2", valueToRemove, "8", "4", "5", valueToRemove, "0", "9", "8", valueToRemove};
        ArrayUtility<String> arrayUtility = new ArrayUtility<String>(inputArray);


        // When
        String[] actual = arrayUtility.removeValue(valueToRemove);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }



    @Test
    public void objectTest() {
        // Given
        Object valueToRemove = "7";
        Object[] expected = {"41", "2", "8", "4", "5", "0", "9", "8"};
        Object[] inputArray = {"41", "2", valueToRemove, "8", "4", "5", valueToRemove, "0", "9", "8", valueToRemove};
        ArrayUtility<Object> arrayUtility = new ArrayUtility<Object>(inputArray);


        // When
        Object[] actual = arrayUtility.removeValue(valueToRemove);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }

}
