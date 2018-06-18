package io.zipcoder.microlabs.mastering_loops;
import java.lang.*;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {


        StringBuilder evenNum = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                evenNum.append(i);
            }
        }
        return evenNum.toString();
    }


    public static String getOddNumbers(int start, int stop) {

        StringBuilder oddNum = new StringBuilder();
        for (int i = start; i <= stop; i++) {
            if (i % 2 != 0) {
                oddNum.append(i);
            }
        }
        return oddNum.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        StringBuilder sqNum = new StringBuilder();

        for (int i = start; i < stop; i+=step) {
            sqNum.append(Math.round(Math.pow(i, 2)));
        }
        return sqNum.toString();
    }


    public static String getRange(int start, int stop, int step) {

        StringBuilder rangeNum = new StringBuilder();

        for (int i = start; i < stop; i+=step) {
            rangeNum.append(i);
        }
        return rangeNum.toString();

    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        StringBuilder exponentNum = new StringBuilder();

        for (int i = start; i < stop; i+=step) {
            exponentNum.append(Math.round(Math.pow(i, exponent)));
        }
        return exponentNum.toString();
    }
}
