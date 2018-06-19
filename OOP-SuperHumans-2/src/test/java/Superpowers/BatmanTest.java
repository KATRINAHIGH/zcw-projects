package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BatmanTest {

    @Test
    public void testAttack() {
        Batman darkKnight = new Batman();
        String expected = "Pow";
        String actual = darkKnight.attack();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMove() {
        Batman darkKnight = new Batman();
        String expected = "Batmobile";
        String actual = darkKnight.move();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Batman darkKnight = new Batman();
        String expected = "Name: Batman\n" +
                "Age: 30\n" +
                "Gender: NonBinary\n" +
                "Occupation: Rich\n" +
                "Address: Batcave\n" +
                "Email: DCcomics.com\n" +
                "PhoneNumber: 7173245673\n" +
                "HeroName: Bruce Wayne\n" +
                "isGood: true\n" +
                "superAbility: Super Detective";
        String actual = darkKnight.toString();
        Assert.assertEquals(expected, actual);
    }

}