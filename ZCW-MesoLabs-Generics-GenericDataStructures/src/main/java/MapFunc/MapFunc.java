package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T, R> ArrayList<R> map(ArrayList<T> arr, Function<T, R> mapfunc) {
        ArrayList outputArray = new ArrayList<>();
        for (T val : arr) {
            R applyFuncVal = mapfunc.apply(val);
            outputArray.add(applyFuncVal);
        }
        return outputArray;
    }

}

//MapFunc -- Make a map method that takes an ArrayList and a Function<T,R> object and returns an arraylist
////        containing all of the elements of the first with the function applied to them.

