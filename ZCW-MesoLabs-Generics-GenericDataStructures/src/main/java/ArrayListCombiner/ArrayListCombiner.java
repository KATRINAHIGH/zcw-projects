package ArrayListCombiner;

import java.util.ArrayList;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner {

    public static <E> void extendCombiner (ArrayList<E> first, ArrayList<? extends E> second){
        first.addAll(second);
    }

    public static <E> void superCombiner (ArrayList<? super E> first, ArrayList<E> second){
        first.addAll(second);
    }
}


//ArrayListCombiner -- Write two methods, superCombiner and extendCombiner, which each take two arraylists and
//        append all of the items from the second to the first. superCombiner should use ? super E and extendCombiner
//        should use ? extends E.

//All the tests pass with this as the superCombiner but it's not done as asked
//public static <E> void superCombiner (ArrayList<E> first, ArrayList<? extends E> second){
//        first.addAll(second);

