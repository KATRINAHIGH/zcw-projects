package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testSpeak() {
        Dog myDog = new Dog("Fido");
        String expected = "Woof";
        String actual = myDog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        String expected = "Fido";
        Dog myDog = new Dog("Fido");
        String actual = myDog.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetName() {
        Dog myDog = new Dog("Fido");
        String expected = "Fido";
        myDog.setName(expected);
        String actual = myDog.getName();
        Assert.assertEquals(expected, actual);
    }
}

