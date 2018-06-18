package com.zipcodewilmington;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        return getNumberOfOccurrences(array, value) > 0;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] result = new String[array.length];
        int resultIndex = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[resultIndex] = array[i];
            resultIndex += 1;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        return Arrays.equals(array, reverse(array));

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        boolean[] switches = new boolean[26];

        for (int i = 0 ; i < array.length; i++) {
            String elementOfArray = array[i];
            elementOfArray = elementOfArray.toUpperCase();
            for (int j = 0; j < elementOfArray.length(); j++) {
                int ascii = elementOfArray.charAt(j) - 65;
                if (ascii >= 0 && ascii < 26) {
                    switches[ascii] = true;
                }
            }
        }

        for (int k = 0; k < 26; k++) {
            if (!switches[k]) {
                return false;
            }
        }
        return true;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int valOccurs = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                valOccurs++;
            }
        }
        return valOccurs;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        int newArraySize = array.length - getNumberOfOccurrences(array, valueToRemove);
        String[] resultArray = new String[newArraySize];
        int newArrayIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(valueToRemove)) {
                newArrayIndex++;
            } else {
                resultArray[i - newArrayIndex] = array[i];
            }
        }
        return resultArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int newArraySize = array.length - duplicatesCount(array);
        String[] resultArray = new String[newArraySize];
        int resultArrayIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || !array[i].equals(array[i - 1])) {
                resultArray[resultArrayIndex] = array[i];
                resultArrayIndex++;
            }
        }
        return resultArray;
    }

    public static int duplicatesCount(String[] array) {

        int dupCount = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1])) {
                dupCount++;
            }
        }
        return dupCount;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        int newArraySize = array.length - duplicatesCount(array);
        String[] resultArray = new String[newArraySize];
        int resultArrayIndex = 0;
        String concatStr = array[0];
        String currStr = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i].equals(currStr)){
                concatStr += currStr;
            }else{
                resultArray[resultArrayIndex] = concatStr;
                resultArrayIndex++;
                concatStr = array[i];
                currStr = array[i];
            }
        }
        resultArray[resultArrayIndex] = concatStr;
        return resultArray;
    }
}
