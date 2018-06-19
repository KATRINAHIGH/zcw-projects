# Generics MicroLabs
The microlabs for the Generics chapter are all grouped together.  So, you need to work through them package by package.
The following list is the package name followed by a quick description of the assignment.
1. StackArrayList -- Implement `Stack<E>` to use an ArrayList as a stack.  You need to make the `push`, `pop`, and
`isEmpty` functions.
2. StackArray -- Implement `Stack<E>` to use an array as a stack.  You'll need to potentially grow the array in the 
`push` method.  Do this first with an `E[]` array, and then again with an `Object[]` array.  Both should compile
without warnings and pass the tests.
3. Table -- Implemented for you is Entry<K, V>.  
Implement Table<K,V> so that it manages an ArrayList of Entry<K,V>.  You must implement
    * `get` which takes a key and returns either the entry from the ArrayList with that key, or null if none is found.
    * `put` which takes a key and value and sets the value in the ArrayList to Entry(key, value);
        * Remember, a key point to exactly one value
    * `remove` which takes a key and removes it from the ArrayList if it's in there.  It's a void method; no return type.
4. TableNested -- Take the previous microlab, and make Entry a nested class.  Think about if it'll need to be generic
or not.
5. Swap -- Get the test to pass.  Look at the specific values being passed in to help you figure it out.  Modify the
tests, not the code.
6. ArrayListCombiner -- Write two methods, `superCombiner` and `extendCombiner`, which each take two arraylists and append
all of the items from the second to the first.  `superCombiner` should use `? super E` and `extendCombiner` should use 
`? extends E`.
7. MapFunc -- Make a `map` method that takes an ArrayList and a `Function<T,R>` object and returns an arraylist 
containing all of the elements of the first with the function applied to them.
8. Pair -- This is a multi-step one:
    1. Create a Pair<E> that stores a pair of elements of type `E`.
    2. Create two methods, `min` and `max`, that return the largest and smallest of the `Pair`.
    3. Create a utility class called `Arrays` and, in that, create a method
    <br>`public static <___> Pair<E> firstLast(ArrayList<___> a)`<br>
    That returns a Pair containing the first and last element of the array.  <br>NOTE: The `<___>` is there because you
    need to fill in the blank.
    4. In `Arrays` make two methods, `min` and `max` that returns the smallest and largest elements in the ArrayList.
    5. In `Arrays` make a `minMax` function that returns a `Pair` with the minimum and maximum values of the ArrayList.