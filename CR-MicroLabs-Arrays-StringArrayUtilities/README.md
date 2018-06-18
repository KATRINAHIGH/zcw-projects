## Building Utility Class for String Array Objects
* **Objective**
    * Ensure [StringArrayUtilsTest](https://github.com/Zipcoder/CR-MicroLabs-Arrays-StringArrayUtilities/blob/master/src/test/java/com/zipcodewilmington/StringArrayUtilsTest.java) passes each test by completing the methods [stubbed out](https://en.wikipedia.org/wiki/Method_stub) in the class [StringArrayUtils](https://github.com/Zipcoder/CR-MicroLabs-Arrays-StringArrayUtilities/blob/master/src/main/java/com/zipcodewilmington/StringArrayUtils.java)
        * `String getFirstElement(String[] array)`
        * `String getSecondElement(String[] array)`
        * `String getLastElement(String[] array)`
        * `String getSecondToLastElement(String[] array)`
        * `boolean contains(String[] array, String value)`
        * `String[] reverse(String[] array)`
        * `boolean isPalindromic(String[] array)`
        * `boolean isPangramic(String[] array)`
        * `int getNumberOfOccurrences(String[] array, String value)`
        * `String[] removeValue(String[] array, String value)`
        * `String[] removeConsecutiveDuplicates(String[] array, String value)`
        * `String[] packConsecutiveDuplicates(String[] array, String value)`
        
* **Purpose**
    * To establish greater familiarity with loops and arrays.
    * To demonstrate the implementation of a [Utility class](https://www.quora.com/What-is-a-utility-class)
    
    



































<br><br><br><br>
## `String getFirstElement(String[] array)`
* **Description**
    * Given an array of `String` objects, return the first element of the array.

### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    
    // : When
    String outcome = StringArrayUtils.getFirstElement(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    quick
    ```
    
    
### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    
    // : When
    String outcome = StringArrayUtils.getFirstElement(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    brown
    ```





### Example 3
* Sample Script

    ```
    // : Given
    String[] array = {"fox", "jumps", "over", "the", "lazy", "dog"};
    
    // : When
    String outcome = StringArrayUtils.getFirstElement(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    fox
    ```























<br><br><br><br>
## `String getSecondElement(String[] array)`
* **Description**
   * Given an array of `String` objects, return the first element of the array.

### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    
    // : When
    String outcome = StringArrayUtils.getSecondElement(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    quick
    ```
    
    
### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};    
    // : When
    String outcome = StringArrayUtils.getFirstElement(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    brown
    ```


### Example 3
* Sample Script

    ```
    // : Given
    String[] array = {"brown", "fox", "jumps", "over", "the", "lazy", "dog"};    
    // : When
    String outcome = StringArrayUtils.getFirstElement(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    fox
    ```


































<br><br><br><br>
## `String getLastElement(String[] array)`
* **Description**
   * Given an array of `String` objects, return the last element of the array.

### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    
    // : When
    String outcome = StringArrayUtils.getLastElement(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    dog
    ```
    
    
### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy"};
    
    // : When
    String outcome = StringArrayUtils.getLastElement(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    lazy
    ```





### Example 3
* Sample Script

    ```
    // : Given
    String[] array = {"the", "quick", "brown", "fox", "jumps", "over"};
    
    // : When
    String outcome = StringArrayUtils.getLastElement(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    the
    ```
    
    
    































<br><br><br><br>
## `String getSecondToLastElement(String[] array)`
* **Description**
   * Given an array of `String` objects, return the next-to-last element of the array.

### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    
    // : When
    String outcome = StringArrayUtils.getSecondToLastElement(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    lazy
    ```
    
    
### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "lazy"};
    
    // : When
    boolean outcome = StringArrayUtils.getNextToLastElement(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    over
    ```





### Example 3
* Sample Script

    ```
    // : Given
    String[] array = {"the", "quick", "brown", "fox", "jumps", "over"};
    
    // : When
    boolean outcome = StringArrayUtils.getNextToLastElement(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    jumps
    ```
    
    
    
    
    


























<br><br><br><br>
## `boolean contains(String[] array, String value)`
* **Description**
   * Given an array of `String` objects named `array` and a `String` object named `value`<br>return true if `value` appears in `arrays`.

### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    
    // : When
    boolean outcome = StringArrayUtils.contains(array, "the");
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    true
    ```
    
    
    

### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    
    // : When
    boolean outcome = StringArrayUtils.contains(array, "potatoes");
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    false
    ```












































<br><br><br><br>
## `String[] reverse(String[] array)`
* **Description**
   * Given an array of `String` objects, return an array with identical contents in reverse order.

### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    
    // : When
    boolean outcome = StringArrayUtils.contains(array, "the");
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    [dog, lazy, the, over, jumps, fox, brown, quick, the]
    ```
    
    
    

### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"Pack", "my", "box", "with", "five", "dozen", "liquor", "jugs"};
    
    // : When
    boolean outcome = StringArrayUtils.contains(array, "potatoes");
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    [jugs, liquor, dozen, five, with, box, my, Pack]
    ```




    

### Example 3
* Sample Script

    ```
    // : Given
    String[] array = {"The", "quick", "onyx", "goblin", "jumps", "over", "the", "lazy", "dwarf"};
    
    // : When
    boolean outcome = StringArrayUtils.contains(array, "potatoes");
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    [dwarf, lazy, the, over, jumps, goblin, onyx, quick, The]
    ```






























<br><br><br><br>
## `boolean isPalindromic(String[] array)`
* **Description**
    * A [palindrome](http://www.dictionary.com/browse/palindromic) is a sequence that is the same backwards and forwards.
    * Given an array of `String` objects, return `true` if the array is palindromic.
        
### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"a", "b", "c", "b", "a"}
    
    // : When
    boolean outcome = StringArrayUtils.isPalindrome(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output
    ```
    true
    ```
    
    
        
### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"Is this a plaindrome?", "This is a plaindrome", "Is this a palindrome?"}
    
    // : When
    boolean outcome = StringArrayUtils.isPalindrome(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output
    ```
    true
    ```
    
        


        
### Example 3
* Sample Script

    ```
    // : Given
    String[] array = {"Is this a plaindrome?", "This is not a plaindrome", "Is this a palindrome?", "This is not a palindrome"}
    
    // : When
    boolean outcome = StringArrayUtils.isPalindrome(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output
    ```
    false
    ```


































<br><br><br><br>
## `boolean isPangramic(String[] array)`
* **Description**
    * A [pangram](http://www.dictionary.com/browse/pangram) is a sequence that contains all letters of the alphabet.
    * Given an array of `String` objects, return `true` if the array is palindromic.
        
### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"The quick brown", "Fox jumps over", "The lazy dog"}
    
    // : When
    boolean outcome = StringArrayUtils.isPangramic(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output
    ```
    true
    ```
    
    
### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"The", "quick", "onyx", "goblin", "jumps", "over", "the", "lazy", "dwarf"};
    
    // : When
    boolean outcome = StringArrayUtils.isPangramic(array);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output
    ```
    true
    ```
   

















 















<br><br><br><br>
## `int getNumberOfOccurrences(String[] array, String value)`
* **Description**
    * Given an array of `String` objects named `array` and a `String` object named `value`<br>return the number of times `value` appears in `arrays`

### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    int numberOfOccurrences = StringArrayUtils.getNumberOfOccurrences(array, "bba");
    
    // : Then
    System.out.println(numberOfOccurrences);
    ```



* Sample Output

    ```
    4
    ```
    
    
    

### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    int numberOfOccurrences = StringArrayUtils.getNumberOfOccurrences(array, "bbb");
    
    // : Then
    System.out.println(numberOfOccurrences);
    ```



* Sample Output

    ```
    2
    ```
    

### Example 3
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    int numberOfOccurrences = StringArrayUtils.getNumberOfOccurrences(array, "baa");
    
    // : Then
    System.out.println(numberOfOccurrences);
    ```



* Sample Output

    ```
    1
    ```

































<br><br><br><br>
## `String[] removeConsecutiveDuplicates(String[] array, String value)`
* **Description**
    * Given an array of `String` objects, return an array of Strings with conseuctive duplicates removed.
        
        

### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```



* Sample Output
    ```
    [aba, baa, bab, bba, bbb];
    ```




### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "zzz", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```



* Sample Output
    ```
    [aba, baa, bab, bba, zzz, bba, bbb];
    ```




### Example 3
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "zzz", "bba", "bba", "bba", "bbb", "bbb", "aba", "bbb"};
    
    // : When
    String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```



* Sample Output
    ```
    [aba, baa, bab, bba, zzz, bba, aba, bbb];
    ```





































<br><br><br><br>
## `String[] packConsecutiveDuplicates(String[] array)`
* **Description**
    * Given an array of `char` objects, return an array of Strings with consecutive duplicates placed in an array.
        

### Example 1
* Sample Script

    ```
    // : Given
	String[] array = {"a", "a", "a", "a", "b", "c", "c", "a", "a", "d"};
	
    // : When
    String[] actual = StringArrayUtils.packConsecutiveDuplicates(array);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```



* Sample Output
    ```
    [aaa, b, cc, aa, d, eee];
    ```


### Example 2
* Sample Script

    ```
    // : Given
	String[] array = {"t", "t", "q", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e"}; 
	
    // : When
    String[] actual = StringArrayUtils.packConsecutiveDuplicates(array);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```



* Sample Output
    ```
    [tt, q, aaa, b, cc, aa, d, eee];
    ```


### Example 3
* Sample Script

    ```
    // : Given
	String[] array = {"m", "o", "o", "n", "m", "a", "n"}
	
    // : When
    String[] actual = StringArrayUtils.packConsecutiveDuplicates(array);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```



* Sample Output
    ```
    [m, oo, n, m, a, n];
    ```



























<br><br><br><br>
## `String[] removeValues(String[] array, String valueToRemove)`
* **Description**
    * Given an array of `String` objects named `array` and a `String` object named `valueToRemove`<br>create and return an array containing identical contents excluding objects whose value is equivalent to `valueToRemove`. Ensure that the length of the newly created array has been resized based on the removal of the undesired elements. 
        
### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    String[] actual = StringArrayUtils.removeValues(array, "aba");
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```

* Sample Output
    ```
    [baa, bab, bba, bba, bba, bba, bbb, bbb};
    ```
    
    

### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    String[] actual = StringArrayUtils.removeValues(array, "bba");
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```



* Sample Output
    ```
    [aba, aba, baa, bab, bbb, bbb];
    ```
    
    

### Example 3
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    String[] actual = StringArrayUtils.removeValues(array, "bbb");
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```



* Sample Output
    ```
    [aba, aba, baa, bab, bba, bba, bba, bba];
    ```

















