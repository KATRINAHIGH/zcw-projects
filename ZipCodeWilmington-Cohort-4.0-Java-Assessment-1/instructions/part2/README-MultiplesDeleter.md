# MultiplesDeleter
* Ensure each of the test cases in the class [MultiplesDeleter]() successfully passes upon completion of each of the method stubs in the class [MultiplesDeleterTest]().
    * `Integer[] deleteEvens(Integer[] intArray)`
    * `Integer[] deleteOdds(Integer[] intArray)`
    * `Integer[] deleteMultiplesOf3(Integer[] intArray)` 
    * `Integer[] deleteMultiplesOfN(Integer[] intArray)`
    






<br><br><br><br>
## `Integer[] deleteEvens(Integer[] intArray)`
* **Description**
    * Given an array of integers, named `ints` return an identical array with odds removed.

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
## `Integer[] deleteOdds(Integer[] intArray)`
* **Description**
    * Given an array of integers, named `ints` return an identical array with odds removed

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
## `Integer[] deleteMultiplesOf3(Integer[] ints)`
* **Description**
    * Given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed.

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
## `Integer[] deleteMultiplesOfN(Integer[] ints, int multiple)`
* **Description**
    * Given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed.

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
