package com.zipcodewilmington.javazipbook1;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
/**
 *
 * @author Katrina High
 */
public class RandomExcercise {



    RandomExcercise() {
    }

    public static void exercise() {

        /// return a number that is within the range of values (negative and positive) of the int and long data types
        Random randFun = new Random();
        for (int j=0;j < 5;j++)
        {
            System.out.printf("%12d ",rand.nextInt());
            System.out.print(rand.nextLong());
            System.out.println();
        }

        /**Picking random numbers from a certain range (e.g., between 1 to 40 inclusively
        the nextInt() method can also accept an int parameter. It denotes the upper limit for the range of numbers.
        the upper limit number is not included as one of the numbers that can be picked.
        nextInt() method works from zero upwards.
         The following will only pick a random number from 0 to 39 inclusively.*/

        Random rand = new Random();
        rand.nextInt(40);

        //to pick a number between 1 to 40 inclusively add one to the result:

         Random rand = new Random();
         int pickedNumber = rand.nextInt(40) + 1;


        /**range starts from a higher number than one you will need to
        minus the starting number from the upper limit number and then add one.
                add the starting number to the result of the nextInt() method.
                For example, to pick a number from 5 to 35 inclusively,
         the upper limit number will be 35-5+1=31 and 5 needs to be added to the result*/

        Random rand = new Random();
        int pickedNumber = rand.nextInt(31) + 5;
    }

    public static void print() {

    }
}
