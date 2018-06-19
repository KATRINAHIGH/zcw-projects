# ArrayUtils
* Ensure each of the test cases in the class [Arrayutils]() successfully passes upon completion of each of the method stubs in the class [ArrayutilsTest]().
    * `Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount)` 
    * `Object[] removeValue(Object[] objectArray, Object objectToRemove)`
    * `Object getMostCommon(Object[] objectArray)` 
    * `Object getLeastCommon(Object[] objectArray)`
    * `Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd)`
    






<br><br><br><br>
## `Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount)`
* **Description**
    * Given an array of objects of any `type` and an `object` of the same `type`, return the number of times the `object` occurs in the array.

### Example
* Sample Script

    ```
   // Given
        Integer valueToEvaluate = 7;
        Integer expected = 3;
        Integer[] inputArray = {1, 2, 7, 8, 4, 5, 7, 0, 9, 8, 7};

        // When
        Integer outcome = ArrayUtils.getNumberOfOccurrences(inputArray, valueToEvaluate);

        // Then
        System.out.println(outcome);
    ```



* Sample Output

    ```
    3
    ```
    
    
    
    
    
    
    


<br><br><br><br>
## `Object[] removeValue(Object[] objectArray, Object objectToRemove)`
* **Description**
    * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`

### Example
* Sample Script

    ```
    // : Given
    RockPaperScissors rps = new RockPaperScissors();
    String input = "rock";
    
    // : When
    String outcome = rps.getLosingMove(input);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    scissors
    ```
    
    
    
    

    

<br><br><br><br>
## `Object getMostCommon(Object[] objectArray)`
* **Description**
    * Given an array of objects, named `objectArray` return the most frequently occuring object in the array.

### Example
* Sample Script

    ```
   // Given
    Integer expected = 1;
    Integer[] inputArray = {1,1,1,1,2,2,2,3,3,4};

    // When
    Integer outcome = ArrayUtils.getMostCommon(inputArray);

    // Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    1
    ```
    
    
    
    

<br><br><br><br>
## `Object getLeastCommon(Object[] objectArray)`
* **Description**
    * Given an array of objects, named `objectArray` return the least frequently occuring object in the array.

### Example
* Sample Script

    ```
   // Given
    Integer expected = 4;
    Integer[] inputArray = {1,1,1,1,2,2,2,3,3,4};

    // When
    Integer outcome = ArrayUtils.getMostCommon(inputArray);

    // Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    4
    ```
    














<br><br><br><br>

## `Object mergeArrays(Object[] objectArray)`
* **Description**
    * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`

### Example

* Sample Script

    ```
   // Given
    Integer[] objectArray = {1,1,1,2,2,2};
    Integer[] objectArrayToAdd = {3,3,3,4,4,4};

    // When
    Integer[] outcome = (Integer[]) ArrayUtils.mergeArrays(array1, array2);

    // Then
    String outcomeStr = Arrays.toString(outcome);
    System.out.println(outcomeStr);
    ```



* Sample Output

    ```
    [1,1,1,2,2,2,3,3,3,4,4,4]
    ```
