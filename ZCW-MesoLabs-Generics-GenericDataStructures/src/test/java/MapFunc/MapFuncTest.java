package MapFunc;

import MapFunc.MapFunc;
import org.junit.Test;

import java.util.ArrayList;
import org.junit.Assert;

public class MapFuncTest {
    @Test
    public void testSingleTypeMap() throws Exception {
        // Given an integer array list
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        // When it's mapped with a function to double the value
        ArrayList<Integer> mappedList = MapFunc.map(intList, num -> num*2);
        // Then all the values are doubled
        Assert.assertEquals(new Integer(2), mappedList.get(0));
        Assert.assertEquals(new Integer(4), mappedList.get(1));
    }

    @Test
    public void testMultipleTypeMap() throws Exception {
        // Given an integer array list
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        // When it's mapped with to string
        ArrayList<String> mappedList = MapFunc.map(intList, num -> num.toString());
        // Then all the values are doubled
        Assert.assertEquals("1", mappedList.get(0));
        Assert.assertEquals("2", mappedList.get(1));
    }

}