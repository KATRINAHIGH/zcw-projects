import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void testGetRollMax() {
        Dice testDice = new Dice(2);
        int expected = 12;
        int actual = testDice.getRollMax();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetRollMin() {
        Dice testDice = new Dice(2);
        int expected = 2;
        int actual = testDice.getRollMin();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTossAndSum() {
        Dice testDice = new Dice(2);
        int actual = testDice.tossAndSum();
        Assert.assertTrue(actual >= 2 && actual <= 24);
    }
}
