package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringsAndThingsTest {

    private StringsAndThings stringsAndThings;

    @Before
    public void setup(){
        stringsAndThings = new StringsAndThings();
    }

    @Test
    public void countYZTest1(){
        String input = "fez day";
        Integer expected = 2;
        Integer actual = stringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countYZTest2(){
        String input = "day fez";
        Integer expected = 2;
        Integer actual = stringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void countYZTest3 (){
        String input = "day fyyyz";
        Integer expected = 2;
        Integer actual = stringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withoutStringTest1(){
        String expected = "He there";
        String actual = stringsAndThings.withoutString("Hello there", "llo");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withoutStringTest2(){
        String expected = "Hllo thr";
        String actual = stringsAndThings.withoutString("Hello there", "e");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withoutStringTest3(){
        String expected = "Hello there";
        String actual = stringsAndThings.withoutString("Hello there", "x");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void equalIsNotTest1(){
        Boolean actual = stringsAndThings.equalIsNot("This is not");
        Assert.assertFalse(actual);
    }

    @Test
    public void equalIsNotTest2(){
        Boolean actual = stringsAndThings.equalIsNot("This is notnot");
        Assert.assertTrue(actual);
    }

    @Test
    public void equalIsNotTest3(){
        Boolean actual = stringsAndThings.equalIsNot("noisxxnotyynotxisi");
        Assert.assertTrue(actual);
    }

    @Test
    public void gIsHappyTest1(){
        Boolean actual = stringsAndThings.gIsHappy("xxggxx");
        Assert.assertTrue(actual);
    }

    @Test
    public void gIsHappyTest2(){
        Boolean actual = stringsAndThings.gIsHappy("xxgxx");
        Assert.assertFalse(actual);
    }

    @Test
    public void gIsHappyTest3(){
        Boolean actual = stringsAndThings.gIsHappy("xxggyygxx");
        Assert.assertTrue(actual);
    }

    @Test
    public void countTripleTest1(){
        Integer expected = 1;
        Integer actual = stringsAndThings.countTriple("abcXXXabc");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countTripleTest2(){
        Integer expected = 3;
        Integer actual = stringsAndThings.countTriple("xxxabyyyycd");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countTripleTest3(){
        Integer expected = 0;
        Integer actual = stringsAndThings.countTriple("a");
        Assert.assertEquals(expected, actual);
    }


}
