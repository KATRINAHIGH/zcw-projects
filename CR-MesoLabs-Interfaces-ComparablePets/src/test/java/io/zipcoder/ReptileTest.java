package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReptileTest {

    @Test
    public void testSpeak() {
        Reptile myReptile = new Reptile("Alfred");
        String expected = "Hiss!";
        String actual = myReptile.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        Reptile myReptile = new Reptile("Alfred");
        String expected = "Alfred";
        String actual = myReptile.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetName() {
        String expected = "Sneaky Snake";
        Cat myReptile = new Cat(expected);
        myReptile.setName(expected);
        String actual = myReptile.getName();
        Assert.assertEquals(expected, actual);
    }
}



