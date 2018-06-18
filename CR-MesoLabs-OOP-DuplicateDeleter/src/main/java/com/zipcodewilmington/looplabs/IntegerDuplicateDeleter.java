package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */


public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Integer[] resultArray = new Integer[0];
        for (int i = 0; i < this.array.length; i++) {
            if (getNumberOfOccurrences(this.array, this.array[i]) < maxNumberOfDuplications) {
                int currentIndex = resultArray.length;
                resultArray = Arrays.copyOf(resultArray, currentIndex + 1);
                resultArray[currentIndex] = this.array[i];

            }
        }
        return resultArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] resultArray = new Integer[0];
        for (int i = 0; i < this.array.length; i++) {
            if (getNumberOfOccurrences(this.array, this.array[i]) != exactNumberOfDuplications) {
                int currentIndex = resultArray.length;
                resultArray = Arrays.copyOf(resultArray, currentIndex + 1);
                resultArray[currentIndex] = this.array[i];
            }
        }
        return resultArray;
    }

    /**
     * @param inputArray array of String objects
     * @param value      value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    private int getNumberOfOccurrences(Integer[] inputArray, Integer value) {

        int valOccurs = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals(value)) {
                valOccurs++;
            }
        }
        return valOccurs;
    }
}

