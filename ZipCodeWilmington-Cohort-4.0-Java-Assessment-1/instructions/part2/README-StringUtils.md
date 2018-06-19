# StringUtils
* Ensure each of the test cases in the class [StringUtils]() successfully passes upon completion of each of the method stubs in the class [StringUtilsTest]().
    * `String[] getWords(String sentence)`
    * `String getFirstWord(String sentence)`
    * `String reverseFirstWord(String sentence)` 
    * `String reverseFirstWordThenCamelCase(String sentence)`
    * `String removeCharacterAtIndex(String str, int index)`
    






<br><br><br><br>
## `String[] getWords(String sentence)`
* **Description**
    * Given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence.

### Example
* Sample Script

    ```
   // Given 
   MultiplesDeleter deleter = new MultiplesDeleter();
    Integer[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    // When
    Integer[] outcome = q1.deleteEvens(inputArray);

    // Then
    String outcomeStr = Arrays.toString(outcome);
    System.out.println(outcomeStr);
    ```



* Sample Output

    ```
    [1, 3, 5, 7, 9]
    ```
    
    
    
    
    
    
    


<br><br><br><br>
## `String getFirstWord(String sentence)`
* **Description**
    * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence

### Example
* Sample Script

    ```
    // Given 
    Integer[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    // When
    Integer[] outcome = deleter.deleteOdds(inputArray);

    // Then
    String outcomeStr = Arrays.toString(outcome);
    System.out.println(outcomeStr);
    ```



* Sample Output

    ```
    [2, 4, 6, 8, 10]
    ```
    
    
    
    

    

<br><br><br><br>
## `String reverseFirstWord(String sentence)`
* **Description**
    * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order.

### Example
* Sample Script

    ```
   // Given 
    Integer[] inputArray = { 3, 6, 9, 12, 15, 4, 7, 10, 13, 16};

    // When
    Integer[] outcome = deleter.deleteMultiplesOf3(inputArray);

    // Then
    String outcomeStr = Arrays.toString(outcome);
    System.out.println(outcomeStr);
    ```



* Sample Output

    ```
    [4, 7, 10, 13, 16]
    ```
    
    
    
    

<br><br><br><br>
## `String reverseFirstWordThenCamelCase(String sentence)`
* **Description**
    * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized.

### Example
* Sample Script

    ```
   // Given
    Integer multiple = 6;
    Integer[] inputArray = { 6, 12, 18, 24, 30, 4, 7, 10, 13, 16};

    // When
    Integer[] outcome = deleter.deleteMultiplesOfN(inputArray, multiple);

    // Then
    String outcomeStr = Arrays.toString(outcome);
    System.out.println(outcomeStr);
    ```



* Sample Output

    ```
    [4, 7, 10, 13, 16]
    ```



  
    

<br><br><br><br>
## `String removeCharacterAtIndex(String str, int index)`
* **Description**
    * given a string and index, return an identical string excluding the character at the specified index.

### Example
* Sample Script

    ```
   // Given
    Integer multiple = 6;
    Integer[] inputArray = { 6, 12, 18, 24, 30, 4, 7, 10, 13, 16};

    // When
    Integer[] outcome = deleter.deleteMultiplesOfN(inputArray, multiple);

    // Then
    String outcomeStr = Arrays.toString(outcome);
    System.out.println(outcomeStr);
    ```



* Sample Output

    ```
    [4, 7, 10, 13, 16]
    ```
