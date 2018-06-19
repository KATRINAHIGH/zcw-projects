import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;


public class MySet<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] inputArray;
    private int size;

    public MySet() {
        this(DEFAULT_CAPACITY);
    }

    public MySet(int capacity) {
        this.inputArray = new Object[capacity];
        this.size = 0;
    }


    /**
     * Get set size
     *
     * @return current number of elements in this list
     */
    public int size() {
        return this.size;
    }

    /**
     * Add Object o to set
     *
     * @param element - object to be added to this set
     * @return true if this set did not already contain the specified element. false if set already contains element
     * and leaves the set unchanged
     */
    public boolean add(E element) {
        if (element == null) {
            throw new NullPointerException("Specified element can't be null");
        }
        if (this.contains(element)) {
            return false;
        }

        this.ensureCapacity();
        this.inputArray[this.size++] = element;

        return true;
    }

    /**
     * Check if set is empty
     *
     * @return true if this set contains no elements
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * @param element to be checked
     * @return true if this set contains the specified element
     */
    public Boolean contains(E element) {
        if (element == null) {
            throw new NullPointerException("Specified element can't be null");
        }
        for (int i = 0; i < this.size; i++) {
            if (this.inputArray[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Removes the specified element from this set if it is present
     *
     * @param element - element to be removed from this set, if present
     * @return true if this set contained the specified element
     */
    public boolean remove(E element) {
        if (element == null) {
            throw new NullPointerException("Specified element can't be null");
        }
        boolean canRemove = false;
        int indexOf = 0;
        for (int i = 0; i < this.inputArray.length; i++) {
            if (this.inputArray[i] != null && this.inputArray[i].equals(element)) {
                indexOf = i;
                canRemove = true;
                break;
            }
        }

        if (canRemove) {
            this.inputArray[indexOf] = null;
            this.inputArray = shiftAllNullsToEnd(this.inputArray);
            this.size--;
        }

        return canRemove;
    }

    /**
     * Adds all of the elements in the specified collection to this set if they're not already present
     * returns false if ANY element could not be added.  If the specified collection is also a set, the
     * addAll operation effectively modifies this set so that its value is the union of the two sets.
     *
     * @param container collection containing elements to be added to this set
     * @return true if this set changed as a result of the call
     */
    public boolean addAll(Collection<E> container) {
        boolean allAdded = container.size() > 0;
        for (E obj : container) {
            if (!this.add(obj)) {
                allAdded = false;
            }
        }
        return allAdded;
    }

    /**
     * @param container collection to be checked for containment in this set
     * @return true if this set contains all of the elements of the specified collection.
     * If the specified collection is also a set, this method returns true if it is a subset of this set.
     */
    public boolean containsAll(Collection<E> container) {
        for (E obj : container) {
            if (!this.contains(obj)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Remove all elements from set except those in c, keeps matching elements
     *
     * @param container collection containing elements to be retained in this set
     * @return true if this set changed as a result of the call.
     */
    public boolean retainAll(Collection<E> container) {
        for (int i = 0; i < this.inputArray.length; i++) {
            if (!container.contains(this.inputArray[i])) {
                this.inputArray[i] = null;
                this.size--;
            }
        }
        this.inputArray = shiftAllNullsToEnd(this.inputArray);
        return true;
    }

    /**
     * Remove all elements that are also in c
     * @param container collection containing elements to be removed from this set
     * @return true if ANY elements are removed
     */
    public boolean removeAll(Collection<E> container) {
        boolean anyRemoved = false;
        for (E obj : container) {
            if (this.remove(obj)) {
                anyRemoved = true;
            }
        }
        return anyRemoved;
    }

    /**
     * Removes all of the elements from this set
     * The set will be empty after this call returns.
     */
    public void clear() {
        this.inputArray = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /**
     * Get array representation of set
     * makes a copy of input array and removes all the nulls.
     *
     * @return array with only elements
     */
    @SuppressWarnings("unchecked")
    public E[] toArray(E[] in) {
        Object[] t = trimTrailingNull(this.inputArray);
        return (E[]) Arrays.copyOf(t, t.length, in.getClass());
    }

    /**
     * @param arr array to be altered assumed that all non-null values are contiguous starting at index 0
     * @return array with with trailing nulls removed
     * Do not make generic, internal to class,
     */
    @SuppressWarnings("unchecked")
    private static Object[] trimTrailingNull(Object[] arr) {
        int lastNotNull = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                lastNotNull++;
            } else {
                break;
            }
        }
        if (lastNotNull == 0) {
            return new Object[0];
        }

        Object[] trimmed = new Object[lastNotNull];
        for (int i = 0; i < lastNotNull; i++) {
            trimmed[i] = arr[i];
        }

        return trimmed;
    }

    /**
     * Shift all null values to the end and make non-null values contiguous starting at index 0
     *
     * @param arr array to be altered
     * @return array altered
     * Do not make generic, internal to class, everything internal is object, everything external is type
     */
    private static Object[] shiftAllNullsToEnd(Object[] arr) {
        int j = 0;
        Object[] result = new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                result[j++] = arr[i];
            }
        }

        return result;
    }

    /**
     * Increases the capacity of the backing array, if necessary,
     * to ensure that it can hold at least the number of elements
     */
    private void ensureCapacity() {
        if (this.size >= this.inputArray.length) {
            int newCapacity = this.inputArray.length + DEFAULT_CAPACITY;
            this.inputArray = Arrays.copyOf(this.inputArray, newCapacity);
        }
    }

}




