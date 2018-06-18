package com.zipcodewilmington.looplabs;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying this class.
 */
public class IntegerDuplicateDeleterTest {

    private static Integer[] intArray;
    private static DuplicateDeleter<Integer> deleter;

    @Before
    public void setup() {
        this.intArray = new Integer[]{0, 0, 0, 1, 2, 2, 4, 4, 5, 5, 5, 6, 9, 9, 9};
        this.deleter = new IntegerDuplicateDeleter(intArray);
    }


    @Test
    public void testRemoveDuplicatesExactlyExactly() {
        Integer[] expected = new Integer[]{1, 2, 2, 4, 4, 6};
        Integer[] actual = deleter.removeDuplicatesExactly(3);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicatesExactly1() {
        Integer[] expected = new Integer[]{0, 0, 0, 1, 5, 5, 5, 6, 9, 9, 9};
        Integer[] actual = deleter.removeDuplicatesExactly(2);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicatesExactly2() {
        Integer[] expected = new Integer[]{0, 0, 0, 2, 2, 4, 4, 5, 5, 5, 9, 9, 9};
        Integer[] actual = deleter.removeDuplicatesExactly(1);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicatesExactly3() {
        Integer[] expected = new Integer[]{1, 2, 2, 4, 4, 6};
        deleter.removeDuplicates(3);
        deleter.removeDuplicatesExactly(2);
        deleter.removeDuplicatesExactly(1);

        Integer[] actual = deleter.removeDuplicatesExactly(3);
        TestUtils.assertArrayEquality(expected, actual);
    }



























    @Test
    public void testRemoveDuplicates0() {
        Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);
        Integer[] expected = new Integer[]{};
        Integer[] actual = deleter.removeDuplicates(0);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicates1() {
        Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);
        Integer[] expected = new Integer[]{};
        Integer[] actual = deleter.removeDuplicates(1);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicates2() {
        Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);
        Integer[] expected = new Integer[]{2};
        Integer[] actual = deleter.removeDuplicates(2);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicates3() {
        Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);
        Integer[] expected = new Integer[]{1,1,2,4,4};
        Integer[] actual = deleter.removeDuplicates(3);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicates4() {
        Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);
        Integer[] expected = new Integer[]{0,0,0,1,1,2,3,3,3,4,4};
        Integer[] actual = deleter.removeDuplicates(4);
        TestUtils.assertArrayEquality(expected, actual);
    }















    @Test
    public void testRemoveDuplicatesExactlyIdempotence() {
        Integer[] input = RandomNumberFactory.createIntegers(0,50,150);
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(input);
        Integer[] expected = deleter.removeDuplicatesExactly(5);

        for (int i = 0; i < input.length; i++) {
            deleter.removeDuplicatesExactly(i);
        }

        Integer[] actual = deleter.removeDuplicatesExactly(5);

        Arrays.sort(input);
        System.out.println("Input:\n\t" + Arrays.toString(input));
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicatesIdempotence() {
        Integer[] input = RandomNumberFactory.createIntegers(0,50,150);
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(input);
        Integer[] expected = deleter.removeDuplicates(5);

        for (int i = 0; i < input.length; i++) {
            deleter.removeDuplicates(i);
        }

        Integer[] actual = deleter.removeDuplicates(5);

        Arrays.sort(input);
        System.out.println("Input:\n\t" + Arrays.toString(input));
        TestUtils.assertArrayEquality(expected, actual);
    }
}
