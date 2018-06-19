import org.junit.Assert;
import org.junit.Test;

public class TestMyArrayList {
    //---------------Test Constructor
    @Test
    public void testConstructorDefaultSize() {
        int expectedElementCount = 0;
        MyArrayList<Integer> genericUtility = new MyArrayList<>();

        int actualLength = genericUtility.size();

        Assert.assertEquals(expectedElementCount, actualLength);
    }

    @Test
    public void testConstructorSizeIncrease() {
        int expectedSize = 3;
        MyArrayList<String> genericUtility = new MyArrayList<>();
        genericUtility.add("this");
        genericUtility.add("that");
        genericUtility.add("andTheOtherThing");

        int actualLength = genericUtility.size();

        Assert.assertEquals(expectedSize, actualLength);
    }

    //---------------Test isEmpty
    @Test
    public void testIsSizeEmptyReturnsFalse() {
        MyArrayList<String> genericUtility = new MyArrayList<>();
        genericUtility.add("this");
        genericUtility.add("that");
        genericUtility.add("andTheOtherThing");

        Boolean actualElements = genericUtility.isEmpty();

        Assert.assertEquals(false, actualElements);
    }

    @Test
    public void testIsSizeEmptyReturnsTrue() {
        MyArrayList<String> genericUtility = new MyArrayList<>();

        Boolean actualElements = genericUtility.isEmpty();

        Assert.assertEquals(true, actualElements);
    }


    //---------------Test add append
    @Test
    public void testAddIntegerExpectTrue() {
        Integer addMe = 25;
        MyArrayList<Integer> genericUtility = new MyArrayList<>();

        Boolean actual = genericUtility.add(addMe);

        Assert.assertTrue(actual);
    }

    @Test
    public void testAddLongExpectTrue() {
        Long addMe = 25L;
        MyArrayList<Long> genericUtility = new MyArrayList<>();

        Boolean actual = genericUtility.add(addMe);

        Assert.assertTrue(actual);
    }

    @Test
    public void testAddStringExpectTrue() {
        String addMe = "last";
        MyArrayList<String> genericUtility = new MyArrayList<>();

        Boolean actual = genericUtility.add(addMe);

        Assert.assertTrue(actual);
    }

    @Test
    public void testAddObjectExpectTrue() {
        Object addMe = "last";
        MyArrayList<Object> genericUtility = new MyArrayList<>();

        Boolean actual = genericUtility.add(addMe);

        Assert.assertTrue(actual);
    }

    @Test
    public void testAddAppendsAtEndOfList() {
        MyArrayList<String> genericUtility = new MyArrayList<>();
        String expected = "andTheOtherThing";
        genericUtility.add("this");
        genericUtility.add("that");
        genericUtility.add(expected);

        String actual = genericUtility.get(2);

        Assert.assertEquals(expected, actual);
    }

    //---------------Test addInsert
    @Test
    public void testAddInsertsAtIndex() {
        MyArrayList<Integer> genericUtility = new MyArrayList<>();
        Integer expected = 1000;
        genericUtility.add(25);
        genericUtility.add(10);
        genericUtility.add(1);
        genericUtility.add(1, expected);

        Integer actual = genericUtility.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddShiftsIndexToRightByOne() {
        MyArrayList<Integer> genericUtility = new MyArrayList<>();
        Integer expected = 10;
        genericUtility.add(25);
        genericUtility.add(10);
        genericUtility.add(1);
        genericUtility.add(1, 50);

        Integer actual = genericUtility.get(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddInsertLongAtIndexReturnTrue() {
        Long addMe = 5L;
        MyArrayList<Long> genericUtility = new MyArrayList<>();
        genericUtility.add(25L);
        genericUtility.add(10L);
        genericUtility.add(1L);

        Boolean actual = genericUtility.add(2, addMe);

        Assert.assertTrue(actual);
    }

    @Test
    public void testAddInsertStringAtIndexReturnTrue() {
        String addMe = "last";
        MyArrayList<String> genericUtility = new MyArrayList<>();
        genericUtility.add("this");
        genericUtility.add("that");
        genericUtility.add("AndtheOtherThing");

        Boolean actual = genericUtility.add(1, addMe);

        Assert.assertTrue(actual);
    }

    @Test
    public void testAddInsertObjectAtIndexReturnTrue() {
        Object addMe = "last";
        MyArrayList<Object> genericUtility = new MyArrayList<>();
        genericUtility.add("this");
        genericUtility.add("that");
        genericUtility.add("AndtheOtherThing");

        Boolean actual = genericUtility.add(2, addMe);

        Assert.assertTrue(actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddInsertAtIndexUpperBound() {
        MyArrayList<Integer> genericUtility = new MyArrayList<>();
        genericUtility.add(0, 1);
        genericUtility.add(1, 3);
        genericUtility.add(2, 5);
        genericUtility.add(3, 6);
        genericUtility.add(4, 10);

        genericUtility.add(10, 100);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddInsertAtIndexLowerBound() {
        MyArrayList<Integer> genericUtility = new MyArrayList<>();
        genericUtility.add(0, 1);
        genericUtility.add(1, 3);
        genericUtility.add(2, 5);
        genericUtility.add(3, 6);
        genericUtility.add(4, 10);

        genericUtility.add(-1, 100);
    }

    //---------------Test remove
    @Test
    public void testRemoveReturnsElementRemoved() {
        Object expected = "that";
        MyArrayList<Object> genericUtility = new MyArrayList<>();
        genericUtility.add("this");
        genericUtility.add(expected);
        genericUtility.add("stuff");

        Object actual = genericUtility.remove(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveNoLongerContainsElement() {
        MyArrayList<Object> genericUtility = new MyArrayList<>();
        genericUtility.add("this");
        genericUtility.add("that");
        genericUtility.add("AndtheOtherThing");

        genericUtility.remove(2);
        Boolean actual = genericUtility.contains("AndtheOtherThing");

        Assert.assertEquals(false, actual);
    }

    @Test
    public void testRemoveShiftsIndexByOneToLeft() {
        MyArrayList<Object> genericUtility = new MyArrayList<>();
        Object expected = "AndtheOtherThing";
        genericUtility.add("this");
        genericUtility.add("that");
        genericUtility.add("AndtheOtherThing");

        genericUtility.remove(1);
        Object actual = genericUtility.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveNullAtLastIndex() {
        MyArrayList<Object> genericUtility = new MyArrayList<>();
        genericUtility.add("this");
        genericUtility.add("that");
        genericUtility.add("AndtheOtherThing");

        genericUtility.remove(2);
        Boolean actual = genericUtility.contains("AndtheOtherThing");

        Assert.assertEquals(false, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAtIndexUpperBound() {
        MyArrayList<Integer> genericUtility = new MyArrayList<>();
        genericUtility.add(0, 1);
        genericUtility.add(1, 3);
        genericUtility.add(2, 5);
        genericUtility.add(3, 6);
        genericUtility.add(4, 10);

        genericUtility.remove(10);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAtIndexLowerBound() {
        MyArrayList<Integer> genericUtility = new MyArrayList<>();
        genericUtility.add(0, 1);
        genericUtility.add(1, 3);
        genericUtility.add(2, 5);
        genericUtility.add(3, 6);
        genericUtility.add(4, 10);

        genericUtility.remove(-1);
    }


    //---------------Test get
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetThrowsExceptionWhenEmpty() {
        MyArrayList<Integer> genericUtility = new MyArrayList<>();
        genericUtility.add(1);
        genericUtility.add(2);
        genericUtility.add(3);
        genericUtility.add(3);
        genericUtility.add(4);

        genericUtility.clear();
        int actual = genericUtility.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetThrowsExceptionLowerBound() {
        MyArrayList<Integer> genericUtility = new MyArrayList<>();
        genericUtility.add(1);
        genericUtility.add(2);
        genericUtility.add(3);
        genericUtility.add(3);
        genericUtility.add(4);

        int actual = genericUtility.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetThrowsExceptionUpperBound() {
        MyArrayList<Integer> genericUtility = new MyArrayList<>();
        genericUtility.add(1);
        genericUtility.add(2);
        genericUtility.add(3);
        genericUtility.add(3);
        genericUtility.add(4);

        int actual = genericUtility.get(5);
    }

    //---------------Test clear
    @Test
    public void testClearSetsSizeToZero() {
        MyArrayList<Integer> genericUtility = new MyArrayList<>();
        genericUtility.add(1);
        genericUtility.add(2);
        genericUtility.add(3);
        genericUtility.add(3);
        genericUtility.add(4);

        genericUtility.clear();
        int actual = genericUtility.size();

        Assert.assertEquals(0, actual);
    }


    //---------------Test set
    @Test
    public void testSetOverwritesPreviousElement() {
        MyArrayList<String> genericUtility = new MyArrayList<>();
        String expected = "stuff";
        genericUtility.add("thisThing");
        genericUtility.add("thatThing");
        genericUtility.add("theOtherThing");
        genericUtility.add("everyThing");
        genericUtility.add("allTheThings");

        genericUtility.set(1, "stuff");
        String actual = genericUtility.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetReturnsPreviousElement() {
        MyArrayList<String> genericUtility = new MyArrayList<>();
        String expected = "thatThing";
        genericUtility.add("thisThing");
        genericUtility.add(expected);
        genericUtility.add("theOtherThing");
        genericUtility.add("everyThing");
        genericUtility.add("allTheThings");

        String actual = genericUtility.set(1, "stuff");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetArraySizeUnchanged() {
        MyArrayList<String> genericUtility = new MyArrayList<>();
        genericUtility.add("thisThing");
        genericUtility.add("thatThing");
        genericUtility.add("theOtherThing");
        genericUtility.add("everyThing");
        genericUtility.add("allTheThings");
        int expected = 5;

        genericUtility.set(1, "stuff");
        int actual = genericUtility.size();

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetThrowsExceptionWhenEmpty() {
        MyArrayList<String> genericUtility = new MyArrayList<>();
        genericUtility.add("thisThing");
        genericUtility.add("thatThing");
        genericUtility.add("theOtherThing");
        genericUtility.add("everyThing");
        genericUtility.add("allTheThings");

        genericUtility.clear();

        String actual = genericUtility.set(0, "stuff");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetThrowsExceptionLowerBound() {
        MyArrayList<String> genericUtility = new MyArrayList<>();
        genericUtility.add("thisThing");
        genericUtility.add("thatThing");
        genericUtility.add("theOtherThing");
        genericUtility.add("everyThing");
        genericUtility.add("allTheThings");

        genericUtility.set(-1, "stuff");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetThrowsExceptionUpperBound() {
        MyArrayList<String> genericUtility = new MyArrayList<>();
        genericUtility.add("thisThing");
        genericUtility.add("thatThing");
        genericUtility.add("theOtherThing");
        genericUtility.add("everyThing");
        genericUtility.add("allTheThings");

        genericUtility.set(5, "stuff");
    }
    //---------------Test contains

    @Test
    public void testContainsTrue() {
        MyArrayList<String> genericUtility = new MyArrayList<>();
        genericUtility.add("thisThing");
        genericUtility.add("thatThing");
        genericUtility.add("theOtherThing");
        genericUtility.add("everyThing");
        genericUtility.add("allTheThings");

        Boolean actual = genericUtility.contains("theOtherThing");

        Assert.assertEquals(true, actual);

    }

    @Test
    public void testContainsFalse() {
        MyArrayList<String> genericUtility = new MyArrayList<>();
        genericUtility.add("thisThing");
        genericUtility.add("thatThing");
        genericUtility.add("theOtherThing");
        genericUtility.add("everyThing");
        genericUtility.add("allTheThings");

        Boolean actual = genericUtility.contains("SoManyThings");

        Assert.assertEquals(false, actual);

    }

}

