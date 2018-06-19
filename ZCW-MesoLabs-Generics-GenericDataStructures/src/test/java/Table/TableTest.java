package Table;

import org.junit.Assert;
import org.junit.Test;

public class TableTest {
    @Test
    public void testGetWithoutAnItemReturnsNull() throws Exception {
        // Given an empty table
        Table<String, Integer> table = new Table<String, Integer>();
        // When we try and get an item then it returns null
        Assert.assertEquals(table.get("foo"), null);
    }

    @Test
    public void testPutAnItemReturnsAndDoesNotDelete() throws Exception {
        //Given an empty table
        Table<String, Integer> table = new Table<String, Integer>();
        // When we put an item in it
        table.put("foo", 1);
        // Then we should be able to get it's value
        Assert.assertEquals(table.get("foo"), new Integer(1));
        // And then we should be able to get it again as it wasn't removed
        Assert.assertEquals(table.get("foo"), new Integer(1));
    }

    @Test
    public void testOverwritingAnItem() throws Exception {
        //Given an empty table
        Table<String, Integer> table = new Table<String, Integer>();
        // When we put an item in it
        table.put("foo", 1);
        // And we put a new value with the same key
        table.put("foo", 2);
        // Then we should get back the new value
        Assert.assertEquals(table.get("foo"), new Integer(2));
    }

    @Test
    public void testRemoveAnItem() throws Exception {
        //Given an empty table
        Table<String, Integer> table = new Table<String, Integer>();
        // When we put an item in it
        table.put("foo", 1);
        // And we remove that item
        table.remove("foo");
        // Then we should get back null for that balue
        Assert.assertEquals(table.get("foo"), null);
    }
}