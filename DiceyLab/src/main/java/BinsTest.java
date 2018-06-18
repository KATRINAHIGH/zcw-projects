import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {


    @Test
    public void test_minDiceRangeKey_outOfRange() {
        Bins testBin = new Bins(2, 12);
        Integer actual = testBin.getBin(1);
        Assert.assertNull(actual);
    }

    @Test
    public void test_maxDiceRangeKey_outOfRange() {
        Bins testBin = new Bins(2, 12);
        Integer actual = testBin.getBin(13);
        Assert.assertNull(actual);
    }

    @Test
    public void test_minDiceRangeKey_Created() {
        Bins testBin = new Bins(2, 12);
        Integer expected = 0;
        Integer actual = testBin.getBin(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_maxDiceRangeKey_Created() {
        Bins testBin = new Bins(2, 12);
        Integer expected = 0;
        Integer actual = testBin.getBin(12);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testincrementByOneInUniqueBin() {
        Bins testBin = new Bins(2, 12);
        testBin.incrementBin(2);
        Integer expected = 1;
        Integer actual = testBin.getBin(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testincrementByManyInUniqueBin() {
        Bins testBin = new Bins(2, 12);
        testBin.incrementBin(2);
        testBin.incrementBin(2);
        testBin.incrementBin(2);
        testBin.incrementBin(2);
        Integer expected = 4;
        Integer actual = testBin.getBin(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testincrementByOneMultipleBins() {
        Bins testBin = new Bins(2, 12);
        testBin.incrementBin(2);
        testBin.incrementBin(12);
        Integer expected = 1;
        Integer actual = testBin.getBin(2);
        Integer expected2 = 1;
        Integer actual2 = testBin.getBin(12);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testincrementByManyMultipleBins() {
        Bins testBin = new Bins(2, 12);
        testBin.incrementBin(2);
        testBin.incrementBin(12);
        testBin.incrementBin(2);
        testBin.incrementBin(12);
        testBin.incrementBin(2);
        Integer expected = 3;
        Integer actual = testBin.getBin(2);
        Integer expected2 = 2;
        Integer actual2 = testBin.getBin(12);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }
}




