package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WCTest {

    @Test
    public void testWordCountBaseCase() {
        WC testFile = new WC("/Users/kaitrinahigh/Dev/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/someTextFile.txt");
        String actual = testFile.toString();
        String expected = "you = 3\n" +
                "what = 2\n" +
                "a = 1\n" +
                "are = 1\n" +
                "beginner = 1\n" +
                "can = 1\n" +
                "do = 1\n" +
                "everything = 1\n" +
                "expert = 1\n" +
                "for = 1\n" +
                "have = 1\n" +
                "in = 1\n" +
                "not = 1\n" +
                "once = 1\n" +
                "perfection = 1\n" +
                "progress = 1\n" +
                "start = 1\n" +
                "strive = 1\n" +
                "the = 1\n" +
                "use = 1\n" +
                "was = 1\n" +
                "where = 1\n";
        Assert.assertEquals(expected, actual);
    }
}

