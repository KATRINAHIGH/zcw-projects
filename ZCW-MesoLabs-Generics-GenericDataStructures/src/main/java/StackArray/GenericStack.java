package StackArray;

//import com.sun.java.util.jar.pack.ConstantPool;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {

    private Object[] elements;
    private int top;
    private final static int EMPTY = -1;
    private final static int DEFAULT_Capacity = 10;

    public GenericStack() {

        this(DEFAULT_Capacity);
    }

    public GenericStack(int initialCapacity) {
        elements =  new Object [initialCapacity];
             top = EMPTY;
    }

    public boolean isEmpty(){

        return (top == EMPTY);
    }

    @SuppressWarnings("uncheck")
    public E pop(){
        if (top == EMPTY){
            throw new IndexOutOfBoundsException();
        }
        return (E)elements[top--];
    }

    public void push(E e) {
        elements[++top] = e;
    }
}


