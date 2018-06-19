package Pair;

import org.junit.Test;
import org.junit.Assert;

public class PairTest {

    @Test
    public void testGetters() throws Exception {
        // Given a pair with "Foo" and "Bar"
        Pair<String> p = new Pair<String>("Foo", "Bar");
        // When getFirst and getSecond are called, they should be returned.
        Assert.assertEquals("Foo", p.getFirst());
        Assert.assertEquals("Bar",  p.getSecond());
    }

    @Test
    public void testMin() throws Exception {
        // Given a pair with two values
        Pair<Double> p = new Pair<Double>(1.23, 2.34);
        // When p.min() is called, the smallest should be returned.
        Assert.assertEquals(new Double(1.23), p.min());
    }

    @Test
    public void testMax() throws Exception {
        // Given a pair with two values
        Pair<Double> p = new Pair<Double>(1.23, 2.34);
        // When p.max() is called, the largest should be returned.
        Assert.assertEquals(new Double(2.34), p.max());
    }
}