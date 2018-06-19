# BasicStringUtils
* Ensure each of the test cases in the class [BasicStringUtilsTest]() successfully passes upon completion of each of the method stubs in the class [BasicStringUtils]().
    * `String camelCase(String)` 
    * `String reverse(String)`
    * `String reverseThenCamelCase(String)` 
    * `String removeFirstAndLastCharacter(String)` 
    * `String invertCasing(String)`
    






<br><br><br><br>
## `String camelCase(String str)`
* **Description**
    * Given a string, `str`, return an identical String with the first character capitalized.
### Example
* Sample Script

    ```
    // : Given
    String input = "jumping jacks";
    
    // : When
    String outcome = BasicStringUtils.camelCase(input);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    Jumping jacks
    ```













<br><br><br><br>
## `String reverse(String str)`
* **Description**
    * Given a string array `str`, return a string with identical contents, in the reverse order

### Example
* Sample Script

    ```
    // : Given
    String input = "Leon";
    
    // : When
    String outcome = BasicStringUtils.reverse(input);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    noeL
    ```









<br><br><br><br>
## `String reverseThenCamelCase(String str)`
* **Description**
    * Given a string, `str`, return a string with identical contents, in reverse order, with first character capitalized
### Example
* Sample Script

    ```
    // : Given
    String input = "Leon";
    
    // : When
    String outcome = BasicStringUtils.reverseThenCamelCase(input);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    NoeL
    ```
    
    
    
    
    
    




<br><br><br><br>
## `String removeFirstAndLastCharacter(String str)`
* **Description**
    * Given a string, `str`, return a string with identical contents excluding first and last character.
### Example
* Sample Script

    ```
    // : Given
    String input = "Jack Jumpz;
    
    // : When
    String outcome = BasicStringUtils.removeFirstAndLastCharacter(input);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    ack jump
    ```
    
    
    
    
    

    
    
    
    
