package Pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
@SuppressWarnings("unchecked")
public class Arrays {


    public Arrays() {
    }


    public static <E extends Comparable> Pair<E> firstLast(ArrayList<E> a) {
        return new Pair<E>(a.get(0), a.get(a.size() - 1));
    }


    public static <E extends Comparable> Comparable max(ArrayList<E> a ){
        return Collections.max(a);

    }

    public static <E extends Comparable> Comparable min(ArrayList<E> a) {
        return Collections.min(a);
    }

    public static <E extends Comparable> Pair minMax(ArrayList<E> a) {
               return new Pair(Collections.min(a), Collections.max(a));
                 }
}



//        Create a utility class called Arrays and, in that, create a method
//        public static <___> Pair<E> firstLast(ArrayList<___> a)
//        That returns a Pair containing the first and last element of the array.
//        NOTE: The <___> is there because you need to fill in the blank.
//        In Arrays make two methods, min and max that returns the smallest and largest elements in the ArrayList.
//        In Arrays make a minMax function that returns a Pair with the minimum and maximum values of the ArrayList.

