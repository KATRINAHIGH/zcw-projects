package io.zipcoder;

import java.util.ArrayList;
import java.util.Map;

public class Problem2 {

    ArrayList<Integer> fibNums;

    public Problem2() {
        this.fibNums = new ArrayList<Integer>();
    }

    /**
     * Use iteration to produce fibonnaci series and return in string format
     * @param n upperBound for fibonnaci series
     * @return the Fibonacci series as a string up to the value of n
     */
 //   public String fibonacciIteration(int n) {
//        ArrayList<Integer> fibNums = new ArrayList<Integer>();
//        int firstNum = 0;
//        int secondNum = 1;
//
//        while (true) {
//            if (firstNum < n) {
//                fibNums.add(firstNum);
//                firstNum += secondNum;
//                secondNum = firstNum - secondNum;
//            } else {
//                break;
//            }
//        }
//        return fibNums.toString().replace("[", "").replace("]", "");
//    }

        public void fibonacciIteration(int n) {
        int firstNum = 0;
        int secondNum = 1;

        while (true) {
            if (firstNum < n) {
                fibNums.add(firstNum);
                firstNum += secondNum;
                secondNum = firstNum - secondNum;
            } else {
                break;
            }
        }
    }


    /**
     * Use recursion to produce fibonnaci series and return in string format
     * @param n upperBound for fibonnaci series
     * @return the Fibonacci series as a string up to the value of n
     */
    public int fibonacciRecursion(int n) {
//I need a statment that will close the loop.
        fibNums.add(n);
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    @Override
    public String toString(){
        return fibNums.toString().replace("[", "").replace("]", "");
    }
}





