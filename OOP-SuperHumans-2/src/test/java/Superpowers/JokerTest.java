package Superpowers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JokerTest {

    @Test
    public void testAttack() {
        Joker evilClown = new Joker();
        String expected = "Airborne Agent";
        String actual = evilClown.attack();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMove() {
        Joker evilClown = new Joker();
        String expected = "lamborghini vaydor";
        String actual = evilClown.move();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Joker evilClown = new Joker();
        String expected = "Name: Joker\n" +
                "Age: 25\n" +
                "Gender: NonBinary\n" +
                "Occupation: Terrorist\n" +
                "Address: Gotham\n" +
                "Email: EvilDCcomics.com\n" +
                "PhoneNumber: 7173244444\n" +
                "HeroName: The Clown Prince of Crime\n" +
                "isGood: false\n" +
                "superAbility: Poison Immunity";
        String actual = evilClown.toString();
        Assert.assertEquals(expected, actual);
    }
}

