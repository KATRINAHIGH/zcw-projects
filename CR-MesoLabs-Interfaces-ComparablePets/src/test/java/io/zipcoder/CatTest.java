package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void testSpeak() {
        //ARRANGE: create an instance of the object to act on
        Cat myCat = new Cat("Snowball");
        String expected = "Meow";
        //ACT: call method on our object
        String actual = myCat.speak();
        //Assert: check outcome is what we expect
        Assert.assertEquals(expected, actual);
    }

    //This is where we are testing the constructor of the parent class
    @Test
    public void testGetName() {
        String expected = "Snowball";
        Cat myCat = new Cat(expected);
        String actual = myCat.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetName() {
        String expected = "Whiskers";
        Cat myCat = new Cat(expected);
        myCat.setName(expected);
        String actual = myCat.getName();
        Assert.assertEquals(expected, actual);
    }

}

