package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {

    private E first;
    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }


    public E getFirst() {
        return this.first;
    }

    public E getSecond() {
        return this.second;
    }

    @SuppressWarnings("unchecked")
    public E min() {
        if (first.compareTo(second) > 0) {
            return second;
        }
        return first;
    }
    @SuppressWarnings("unchecked")
    public E max() {
        if (first.compareTo(second) < 0) {
            return second;
        }
        return first;
    }


}


//Pair -- This is a multi-step one:
//        Create a Pair that stores a pair of elements of type E.
//        Create two methods, min and max, that return the largest and smallest of the Pair.



