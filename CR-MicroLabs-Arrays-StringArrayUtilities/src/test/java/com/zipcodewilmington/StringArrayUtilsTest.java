package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtilsTest {

    @Test
    public void testGetFirstElement1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "the";
        String actual = StringArrayUtils.getFirstElement(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFirstElement2() {
        String[] array = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "quick";
        String actual = StringArrayUtils.getFirstElement(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetFirstElement3() {
        String[] array = {"brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "brown";
        String actual = StringArrayUtils.getFirstElement(array);
        Assert.assertEquals(expected, actual);
    }














    @Test
    public void testGetSecondElement1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "quick";
        String actual = StringArrayUtils.getSecondElement(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSecondElement2() {
        String[] array = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "brown";
        String actual = StringArrayUtils.getSecondElement(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetSecondElement3() {
        String[] array = {"brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "fox";
        String actual = StringArrayUtils.getSecondElement(array);
        Assert.assertEquals(expected, actual);
    }











    @Test
    public void testGetLastElement1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "dog";
        String actual = StringArrayUtils.getLastElement(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastElement2() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy"};
        String expected = "lazy";
        String actual = StringArrayUtils.getLastElement(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetLastElement3() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over"};
        String expected = "over";
        String actual = StringArrayUtils.getLastElement(array);
        Assert.assertEquals(expected, actual);
    }





















    @Test
    public void testGetSecondToLastElement1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "lazy";
        String actual = StringArrayUtils.getSecondToLastElement(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSecondToLastElement2() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "lazy"};
        String expected = "over";
        String actual = StringArrayUtils.getSecondToLastElement(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetSecondToLastElement3() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over"};
        String expected = "jumps";
        String actual = StringArrayUtils.getSecondToLastElement(array);
        Assert.assertEquals(expected, actual);
    }

















    @Test
    public void testContains() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        for (String s : array) {
            boolean outcome = StringArrayUtils.contains(array, s);
            Assert.assertTrue(outcome);
        }
    }













    @Test
    public void testReverse1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"dog", "lazy", "the", "over", "jumps", "fox", "brown", "quick", "the"};
        String[] actual = StringArrayUtils.reverse(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testReverse2() {
        String[] array  = {"dog", "lazy", "the", "over", "jumps", "fox", "brown", "quick", "the"};
        String[] expected = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.reverse(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testReverse3() {
        String[] expected = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.reverse(StringArrayUtils.reverse(expected));
        Assert.assertEquals(expected, actual);
    }










    @Test
    public void testIsPalindromic1() {
        String[] array = {"a", "b", "c", "b", "a"};
        boolean outcome = StringArrayUtils.isPalindromic(array);
        Assert.assertTrue(outcome);
    }



    @Test
    public void testIsPalindromic2() {
        String[] array = {"Is this a palindrome?", "This is a palindrome", "Is this a palindrome?"};
        boolean outcome = StringArrayUtils.isPalindromic(array);
        Assert.assertTrue(outcome);
    }


    @Test
    public void testIsPalindromic3() {
        String[] array = {"Is this a palindrome", "This is not a palindrome", "Is this a palindrome", "This is not a palindrome"};
        boolean outcome = StringArrayUtils.isPalindromic(array);
        Assert.assertFalse(outcome);
    }









    @Test
    public void testIsPangramic1() {
        String[] array = {"The quick brown", "Fox jumps over", "The lazy dog"};
        boolean outcome = StringArrayUtils.isPangramic(array);
        Assert.assertTrue(outcome);
    }

    @Test
    public void testIsPangramic2() {
        String[] array = {"The", "quick", "onyx", "goblin", "jumps", "over", "the", "lazy", "dwarf"};
        boolean outcome = StringArrayUtils.isPangramic(array);
        Assert.assertTrue(outcome);
    }

    @Test
    public void testIsPangramic3() {
        String[] array = {"Five quacking", "zephyrs", "jolt my", "wax bed"};
        boolean outcome = StringArrayUtils.isPangramic(array);
        Assert.assertTrue(outcome);
    }


    @Test
    public void testIsPangramic4() {
        String[] array = {"a", "b", "c", "d"};
        boolean outcome = StringArrayUtils.isPangramic(array);
        Assert.assertFalse(outcome);
    }













    @Test
    public void testGetNumberOfOccurrences1() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        int expected = 4;
        int actual = StringArrayUtils.getNumberOfOccurrences(array, "bba");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetNumberOfOccurrences2() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        int expected = 2;
        int actual = StringArrayUtils.getNumberOfOccurrences(array, "bbb");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetNumberOfOccurrences3() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        int expected = 4;
        int actual = StringArrayUtils.getNumberOfOccurrences(array, "bba");
        Assert.assertEquals(actual, expected);
    }













    @Test
    public void testRemoveConsecutiveDuplicates11() {
        String[] array = {"aba", "aba"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba"};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemoveConsecutiveDuplicates1() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba", "baa", "bab", "bba", "bbb"};
        Assert.assertEquals(actual, expected);
    }



    @Test
    public void testRemoveConsecutiveDuplicates2() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "zzz", "bba", "bba", "bba", "bbb", "bbb"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba", "baa", "bab", "bba", "zzz", "bba", "bbb"};
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testRemoveConsecutiveDuplicates3() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "zzz", "bba", "bba", "bba", "aba", "bbb"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba", "baa", "bab", "bba", "zzz", "bba", "bbb", "aba", "bbb"};
        Assert.assertEquals(actual, expected);
    }











    @Test
    public void testRemovePackDuplicates1() {
        String[] array = {"a", "a", "a", "b", "c", "c", "a", "a", "d"};
        String[] expected = {"aaa", "b", "cc", "aa", "d"};
        String[] actual = StringArrayUtils.packConsecutiveDuplicates(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemovePackDuplicates2() {
        String[] array = {"t", "t", "q", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e"};
        String[] expected = {"tt", "q", "aaa", "b", "cc", "aa", "d", "eee"};
        String[] actual = StringArrayUtils.packConsecutiveDuplicates(array);
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testRemovePackDuplicates3() {
        String[] array = {"m", "o", "o", "n", "m", "a", "n"};
        String[] expected = {"m", "oo", "n", "m", "a", "n"};
        String[] actual = StringArrayUtils.packConsecutiveDuplicates(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemovePackDuplicates4() {
        String[] array = {"a", "c", "b", "b"};
        String[] expected = {"a","c", "bb"};
        String[] actual = StringArrayUtils.packConsecutiveDuplicates(array);
        Assert.assertEquals(expected, actual);

    }







    @Test
    public void testRemoveValue() {
        String[] array = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(array, "The");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveValue1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"the", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(array, "quick");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveValue2() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"the", "quick", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(array, "brown");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveValue3() {
        String[] array = {"the", "brown", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"the", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(array, "brown");
        Assert.assertEquals(expected, actual);
    }












}