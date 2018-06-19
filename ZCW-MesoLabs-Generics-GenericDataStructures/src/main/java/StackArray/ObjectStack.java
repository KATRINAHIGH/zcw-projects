package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class ObjectStack<E> {

    private Object[] elements;
    private int top;
    private final static int EMPTY = -1;
    private final static int DEFAULT_Capacity = 10;

    public ObjectStack() {
        this(DEFAULT_Capacity);
    }

    public ObjectStack(int initialCapacity) {
        elements = new Object[initialCapacity];
        top = EMPTY;
    }

    public boolean isEmpty() {

        return (top == EMPTY);
    }

    @SuppressWarnings("unchecked")
    public Object pop() {
        if (top == EMPTY) {
            throw new IndexOutOfBoundsException();
        }
        return elements[top--];
    }

    public void push(Object o) {

        elements[++top] = o;
    }

}




