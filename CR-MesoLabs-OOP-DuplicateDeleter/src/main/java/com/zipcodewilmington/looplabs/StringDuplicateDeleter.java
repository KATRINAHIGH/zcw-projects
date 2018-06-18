package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        String[] resultArray = new String[0];
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String[] resultArray = new String[0];
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
    private int getNumberOfOccurrences(String[] inputArray, String value) {

        int valOccurs = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals(value)) {
                valOccurs++;
            }
        }
        return valOccurs;
    }

}

