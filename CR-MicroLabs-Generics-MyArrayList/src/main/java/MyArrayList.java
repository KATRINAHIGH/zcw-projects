import java.util.Arrays;

public class MyArrayList<E> {

    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] inputArray;


    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int capacity) {
        this.inputArray = new Object[capacity];
        this.size = 0;
    }

    /**
     * @return current number of elements in this list
     */
    public int size() {
        return size;
    }

    /**
     * @return true if this list contains no elements
     */
    public Boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    /**
     * Increases the capacity of the ArrayList instance, if necessary,
     * to ensure that it can hold at least the number of elements
     */
    private void ensureCapacity() {
        if (size >= this.inputArray.length) {
            int newCapacity = this.inputArray.length + DEFAULT_CAPACITY;
            this.inputArray = Arrays.copyOf(this.inputArray, newCapacity);
        }
    }

    /**
     * Appends the specified element to the end of this list
     *
     * @param addMe element to be appended to this list
     * @return true if appended and false if not appended
     */
    public Boolean add(E addMe) {
        ensureCapacity();
        this.inputArray[size++] = addMe;
        return true;
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position(if any) and any subsequent
     * elements to the right(adds 1 to the other indices).
     *
     * @param index at which specified element is to be inserted
     * @param addMe element to be inserted to this list
     * @return true if appended and false if not appended
     */
    public Boolean add(int index, E addMe) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is too large or negative");
        }
        int length = size() - index;
        ensureCapacity();
        System.arraycopy(this.inputArray, index, this.inputArray, index + 1, length);
        this.inputArray[index] = addMe;
        return true;
    }

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left(subtracts one from their indices).
     *
     * @param index of element to be removed
     * @return the element that was removed from the list
     */
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is too large or negative");
        }
        E storePreviousElement = (E) this.inputArray[index];
        int length = size() - index;
        if (length > 0) {
            System.arraycopy(this.inputArray, index + 1, this.inputArray, index, length);
            this.inputArray[size--] = null;
        }
        return storePreviousElement;
    }

    /**
     * Returns the element at the specified position in this list
     *
     * @param index of element to return
     * @return element at the specified position in this list
     */
    @SuppressWarnings("unchecked")
    public E get(Integer index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is too large or negative");
        }
        return (E) this.inputArray[index];
    }

    /**
     * Removes all of the elements from this list
     * The list will be empty after this call returns.
     */
    public void clear() {
        this.inputArray = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /**
     * @param element to be checked
     * @return true if list contains the specified element.
     */
    public Boolean contains(E element) {
        for (Object obj : this.inputArray) {
            if (obj != null && obj.equals(element))
                return true;
        }
        return false;
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     *
     * @param index   of the element to replace
     * @param element to be stored at the specified position
     * @return the element previously at the specified position
     */
    @SuppressWarnings("unchecked")
    public E set(int index, E element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is too large or negative");
        }
        E storePreviousElement = (E) this.inputArray[index];
        this.inputArray[index] = element;
        return storePreviousElement;
    }

}


