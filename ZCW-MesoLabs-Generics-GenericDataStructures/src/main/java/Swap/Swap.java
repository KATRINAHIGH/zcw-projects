package Swap;

/**
 * Keep this.  Just make it so the tests pass.
 */
public class Swap {
    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }
}
