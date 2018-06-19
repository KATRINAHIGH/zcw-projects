package StackArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E>  {

    private ArrayList<E> elements;

    public Stack() {

        this.elements = new ArrayList();
    }

    /**
     * @return true if this list contains no elements
     */
    public boolean isEmpty() {
        return this.elements.size() == 0;
    }

    /**
     * Pushes an item onto the top of this stack. This has exactly the same effect as:
     * addElement(item)
     * @param item the item to be pushed onto this stack.
     *   //should return the item argument.
     */
    public void push(E item) {
        elements.add(item);
    }

    /*
    *Removes the object at the top of this stack
    *returns that object as the value of this function.
     */
    public E pop() throws IndexOutOfBoundsException{
        return this.elements.remove(this.elements.size() - 1);
    }
}


