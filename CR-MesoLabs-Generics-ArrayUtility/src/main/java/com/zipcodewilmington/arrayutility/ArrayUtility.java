package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    private T[] inputArray;

    public ArrayUtility(T[] input) {
        this.inputArray = input;
    }

    private T[] concatenate(T[] arrayToMerge) {
        T[] result = Arrays.copyOf(this.inputArray, this.inputArray.length + arrayToMerge.length);
        System.arraycopy(arrayToMerge, 0, result, this.inputArray.length, arrayToMerge.length);
        return result;
    }

    private Integer getNumberOfOccurrences(T[] array, T valueToEvaluate) {
        Integer count = 0;
        for (T item : array) {
            if (item == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
         return getNumberOfOccurrences(this.inputArray, valueToEvaluate);
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        T[] result = concatenate(arrayToMerge);
        return getNumberOfOccurrences(result, valueToEvaluate);
    }


    public T getMostCommonFromMerge(T[] arrayToMerge) {
        T[] mergedArray = concatenate(arrayToMerge);
        Integer count = 0;
        T result = null;
        for(T item : mergedArray){
            int n = getNumberOfOccurrences(mergedArray, item);
            if(n > count){
                count = n;
                result = item;
            }
        }
        return result;
    }


    public T[] removeValue(T valueToRemove) {
        int newSize = inputArray.length - getNumberOfOccurrences(valueToRemove);
        T[] outPutArray = Arrays.copyOf(this.inputArray, newSize);
        int outPutIndex = 0;
        for (T item : this.inputArray) {
            if (!item.equals(valueToRemove)) {
                outPutArray[outPutIndex] = item;
                outPutIndex++;
            }
        }
        return outPutArray;
    }

}

/** My orginal solutions to these problems involved converting an array to an arraylist and back to an array.
 * This posed an issue when attempting to solve the problems with generics. Generics are covariant. Meaning
 * at compile time an array requires a known type value. Whereas generics do not. Therefore, it is not
 * possible to instantiate a generic array. As a result, I went down a rabbit hole  attempting to instantiate a
 * generic array inside .toArray(). Uugh, reflection and yada yada. In the end the solution involved declaring a
 * property of type T[] and then setting that value in the constructor. So now the generic array is instantiated
 * outside of the class. When you use arrays.copyOf it doesn't care about the type...this method just looks at
 * the memory and makes a copy of it. No need to convert an arraylist to an array and try to instantiate it.*/