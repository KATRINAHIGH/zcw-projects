package com.zipcodewilmington.looplabs;


import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying this class.
 */
public class StringDuplicateDeleterTest {
    private static String[] stringArray;
    private static volatile DuplicateDeleter<String> deleter;

    @Before
    public void setup() {
        this.stringArray = new String[]{"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        this.deleter = new StringDuplicateDeleter(stringArray);
    }


    @Test
    public void testRemoveDuplicatesExactly1() {
        String[] expected = new String[]{"aba", "aba", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        String[] actual = deleter.removeDuplicatesExactly(1);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicatesExactly2() {
        String[] expected = new String[]{"baa", "bab", "bba", "bba", "bba", "bba"};
        String[] actual = deleter.removeDuplicatesExactly(2);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicatesExactly3() {
        String[] expected = new String[]{"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        String[] actual = deleter.removeDuplicatesExactly(3);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicatesExactly4() {
        String[] expected = new String[]{"aba", "aba", "baa", "bab", "bbb", "bbb"};
        String[] actual = deleter.removeDuplicatesExactly(4);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicatesExactly5() {
        String[] input = new String[]{"aa", "aa", "aa", "aa", "aa", "ab", "ba", "ba", "ba", "ba", "bb", "bb", "bb", "bb", "bb"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(input);
        String[] expected = new String[]{"ab", "ba", "ba", "ba", "ba"};
        String[] actual = deleter.removeDuplicatesExactly(5);
        TestUtils.assertArrayEquality(expected, actual);
    }














    @Test
    public void testRemoveDuplicates0() {
        String[] input = new String[]{"aa", "aa", "aa", "aa", "aa", "ab", "ba", "ba", "ba", "ba", "bb", "bb", "bb", "bb", "bb"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(input);
        String[] expected = new String[]{};
        String[] actual = deleter.removeDuplicates(0);
        TestUtils.assertArrayEquality(expected, actual);
    }



    @Test
    public void testRemoveDuplicates1() {
        String[] input = new String[]{"aa", "aa", "aa", "aa", "aa", "ab", "ba", "ba", "ba", "ba", "bb", "bb", "bb", "bb", "bb"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(input);
        String[] expected = new String[]{};
        String[] actual = deleter.removeDuplicates(1);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicates2() {
        String[] input = new String[]{"aa", "aa", "aa", "aa", "aa", "ab", "ba", "ba", "ba", "ba", "bb", "bb", "bb", "bb", "bb"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(input);
        String[] expected = new String[]{"ab"};
        String[] actual = deleter.removeDuplicates(2);
        TestUtils.assertArrayEquality(expected, actual);
    }

    @Test
    public void testRemoveDuplicates3() {
        String[] input = new String[]{"aa", "aa", "aa", "aa", "aa", "ab", "ba", "ba", "ba", "ba", "bb", "bb", "bb", "bb", "bb"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(input);
        String[] expected = new String[]{"ab"};
        String[] actual = deleter.removeDuplicates(3);
        TestUtils.assertArrayEquality(expected, actual);
    }




















    @Test
    public void testRemoveDuplicatesExactlyIdempotence() {
        String[] input = RandomNumberFactory.createStrings('a', 'c', 2, 15);
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(input);
        String[] expected = deleter.removeDuplicatesExactly(5);

        for (int i = 0; i < input.length; i++) {
            deleter.removeDuplicatesExactly(i);
        }

        String[] actual = deleter.removeDuplicatesExactly(5);

        Arrays.sort(input);
        System.out.println("Input:\n\t" + Arrays.toString(input));
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicatesIdempotence() {
        String[] input = RandomNumberFactory.createStrings('a', 'c', 2, 15);
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(input);
        String[] expected = deleter.removeDuplicates(5);

        for (int i = 0; i < input.length; i++) {
            deleter.removeDuplicates(i);
        }

        String[] actual = deleter.removeDuplicates(5);

        Arrays.sort(input);
        System.out.println("Input:\n\t" + Arrays.toString(input));
        TestUtils.assertArrayEquality(expected, actual);
    }

}
