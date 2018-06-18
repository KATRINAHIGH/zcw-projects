package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayDrillsTest {
    private ArrayDrills arrayDrills;

    @Before
    public void setup(){
        this.arrayDrills = new ArrayDrills();
    }

    @Test
    public void firstLastTest1(){
        Integer inputValue = 6;
        Integer[] inputArray = {6,1,2,3};
        Boolean actual = arrayDrills.firstLast(inputValue, inputArray);
        Assert.assertTrue(actual);
    }

    @Test
    public void firstLastTest2(){
        Integer inputValue = 6;
        Integer[] inputArray = {1,2,6};
        Boolean actual = arrayDrills.firstLast(inputValue, inputArray);
        Assert.assertTrue(actual);
    }

    @Test
    public void firstLastTest3(){
        Integer inputValue = 8;
        Integer[] inputArray = {6,1,2,2};
        Boolean actual = arrayDrills.firstLast(inputValue, inputArray);
        Assert.assertFalse(actual);
    }

    @Test
    public void sameFirstLastTest1(){
        Integer[] inputArray = {6,1,2,2};
        Boolean actual = arrayDrills.sameFirstLast(inputArray);
        Assert.assertFalse(actual);
    }

    @Test
    public void sameFirstLastTest2(){
        Integer[] inputArray = {6,1,2,6};
        Boolean actual = arrayDrills.sameFirstLast(inputArray);
        Assert.assertTrue(actual);
    }

    @Test
    public void sameFirstLastTest3(){
        Integer[] inputArray = {1,1};
        Boolean actual = arrayDrills.sameFirstLast(inputArray);
        Assert.assertTrue(actual);
    }

    @Test
    public void commonEndTest1(){
        Integer[] inputArray1 = {1,2,3};
        Integer[] inputArray2 = {7,3};
        Boolean actual = arrayDrills.commonEnd(inputArray1, inputArray2);
        Assert.assertTrue(actual);
    }

    @Test
    public void commonEndTest2(){
        Integer[] inputArray1 = {1,2,3};
        Integer[] inputArray2 = {7,3,2};
        Boolean actual = arrayDrills.commonEnd(inputArray1, inputArray2);
        Assert.assertFalse(actual);
    }

    @Test
    public void commonEndTest3(){
        Integer[] inputArray1 = {1,2,3};
        Integer[] inputArray2 = {1,3};
        Boolean actual = arrayDrills.commonEnd(inputArray1, inputArray2);
        Assert.assertTrue(actual);
    }

    @Test
    public void rotateLeftTest1(){
        Integer[] inputArray = {1,2,3};
        Integer[] expected = {2,3,1};
        Integer[] actual = arrayDrills.rotateLeft(inputArray);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateLeftTest2(){
        Integer[] inputArray = {5,11,9};
        Integer[] expected = {11,9,5};
        Integer[] actual = arrayDrills.rotateLeft(inputArray);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateLeftTest3(){
        Integer[] inputArray = {7,0,0};
        Integer[] expected = {0,0,7};
        Integer[] actual = arrayDrills.rotateLeft(inputArray);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxValueTest1(){
        Integer[] inputArray = {1,2,3};
        Integer[] expected = {3,3,3};
        Integer[] actual = arrayDrills.maxValue(inputArray);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxValueTest2(){
        Integer[] inputArray = {5,11,9,34,2};
        Integer[] expected = {34,34,34,34,34};
        Integer[] actual = arrayDrills.maxValue(inputArray);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxValueTest3(){
        Integer[] inputArray = {2,11,3};
        Integer[] expected = {11,11,11};
        Integer[] actual = arrayDrills.maxValue(inputArray);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void middleWayTest1(){
        Integer[] inputArray1 = {1,2,3};
        Integer[] inputArray2 = {4,5,6,2};
        Integer[] expected = {2,11};
        Integer[] actual = arrayDrills.middleWay(inputArray1, inputArray2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void middleWayTest2(){
        Integer[] inputArray1 = {5,1,2,9};
        Integer[] inputArray2 = {3,4,5,5};
        Integer[] expected = {3,9};
        Integer[] actual = arrayDrills.middleWay(inputArray1, inputArray2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void middleWayTest3(){
        Integer[] inputArray1 = {5,6,7,4,5};
        Integer[] inputArray2 = {2,33,4,5,5};
        Integer[] expected = {7,4};
        Integer[] actual = arrayDrills.middleWay(inputArray1, inputArray2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void biggerTwo1(){
        Integer[] inputArray1 = {5,6};
        Integer[] inputArray2 = {2,33};
        Integer[] expected = {2,33};
        Integer[] actual = arrayDrills.biggerTwo(inputArray1, inputArray2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void biggerTwo2(){
        Integer[] inputArray1 = {12, 12};
        Integer[] inputArray2 = {12,12};
        Integer[] expected = {12,12};
        Integer[] actual = arrayDrills.biggerTwo(inputArray1, inputArray2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test  //Test expected missing negative sign
    public void biggerTwo3(){
        Integer[] inputArray1 = {-1 ,20};
        Integer[] inputArray2 = {2, 15};
        Integer[] expected = {-1,20};
        Integer[] actual = arrayDrills.biggerTwo(inputArray1, inputArray2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void midThree1(){
        Integer[] inputArray = {1, 2, 3};
        Integer[] expected = {1, 2, 3};
        Integer[] actual = arrayDrills.midThree(inputArray);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void midThree2(){
        Integer[] inputArray = {1, 2, 3, 4, 5};
        Integer[] expected = {2, 3, 4};
        Integer[] actual = arrayDrills.midThree(inputArray);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void midThree3(){
        Integer[] inputArray = {8, 6, 7, 5, 3, 0, 9};
        Integer[] expected = {7, 5,3};
        Integer[] actual = arrayDrills.midThree(inputArray);
        Assert.assertArrayEquals(expected, actual);
    }
}
