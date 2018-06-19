package Superpowers;


import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test
    public void testDefaultConstructor() {
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        Human testHuman = new Human();

        String actualName = testHuman.getName();
        Integer actualAge = testHuman.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        String expected = "";
        Human testHuman = new Human();
        String actual = testHuman.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        Batman darkKnight = new Batman();
        String expected = "Batman";
        String actual = darkKnight.getName();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getAge() {
        Batman darkKnight = new Batman();
        int expected = 30;
        int actual = darkKnight.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGender() {
        Batman darkKnight = new Batman();
        String expected = "NonBinary";
        String actual = darkKnight.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOccupation() {
    }

    @Test
    public void getAddress() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void setAge() {
    }

    @Test
    public void setGender() {
    }

    @Test
    public void setOccupation() {
    }

    @Test
    public void setAddress() {
    }
}
