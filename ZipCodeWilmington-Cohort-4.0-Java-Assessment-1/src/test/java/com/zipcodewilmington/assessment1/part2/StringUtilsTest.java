package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.UnitTestingUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtilsTest {
    @Test
    public void getWordsTest() {
        // Given
        String inputString = "The quick brown fox jumps";
        String[] expected = {"The", "quick", "brown", "fox", "jumps"};

        // When
        String[] actual = StringUtils.getWords(inputString);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void getFirstWordTest() {
        // Given
        String inputString = "Quick Brown Fox";
        String expected = "Quick";

        // When
        String actual = StringUtils.getFirstWord(inputString);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void reverseFirstWordTest() {
        // Given
        String inputString = "Noel Hunter";
        String expected = "leoN";

        // When
        String actual = StringUtils.reverseFirstWord(inputString);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseFirstWordThenCamelCaseTest() {
        // Given
        String inputString = "noel Hunter";
        String expected = "Leon";

        // When
        String actual = StringUtils.reverseFirstWordThenCamelCase(inputString);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeCharacterAtIndexTest() {
        // Given
        String inputString = "Jumping";
        Integer characterIndex = 2;
        String expected = "Juping";

        // When
        String actual = StringUtils.removeCharacterAtIndex(inputString, characterIndex);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
