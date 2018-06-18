# TriangleUtilities
* Ensure each of the test cases in the class [TriangleUtilitiesTest](https://github.com/Zipcoder/CR-MicroLabs-Loops-NumbersTrianglesTables/blob/master/src/test/java/io/zipcoder/microlabs/mastering_loops/TriangleUtilitiesTest.java) successfully passes upon completion of each of the method stubs in the class [TriangleUtilities](https://github.com/Zipcoder/CR-MicroLabs-Loops-NumbersTrianglesTables/blob/master/src/main/java/io/zipcoder/microlabs/mastering_loops/TriangleUtilities.java).
    * `String getSmallMultiplicationTable()`
    * `String getLargeMultiplicationTable()`
    * `String getMultiplicationTable(int tableSize)`
    

<br><br><br><br>
## `String getRow(int width)`
* **Description**
    * In the class, `Triangles` Write a method that returns a `String` representation of a row of asterisks whose length is equal to the `width` specified.
    
### Example
* Sample Script

    ```
    // : Given
    int width = 10;
    
    // : When
    String outcome = Triangles.getRow(width);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    **********
    ```
    
    
    
    
    
    








<br><br><br><br>
## `String getSmallTriangle()`
* **Description**
    * In the class, `Triangles` Write a method that returns a `String` representation of a small triangle, whose base height and base width is 4 asterisks.
    
### Example
* Sample Script

    ```
    // : Given
    // : When
    String outcome = Triangles.getSmallTriangle();
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    *
    **
    ***
    ****
    
    ```
    
    
    
    
    
    

<br><br><br><br>
## `String getLargeTriangle()`
* **Description**
    * Write a method that returns a `String` representation of a large triangle, whose base height and base width is 10 asterisks.
    
### Example
* Sample Script

    ```
    // : Given
    // : When
    String outcome = Triangles.getLargeTriangle();
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    *
    **
    ***
    ****
    *****
    ******
    *******
    ********
    *********
    
    ```







<br><br><br><br>
## `String getTriangle(int n)`
* **Description**
    * Given one integer, `n`, generate a `String` representation of a triangle whose base height and width is equal to `n`.

	
### Example
* Sample Script

    ```
    // : Given
    int numberOfRows = 15;
    
    // : When
    String outcome = Triangles.createTriangle(numberOfRows);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    *
    **
    ***
    ****
    *****
    ******
    *******
    ********
    *********
    **********
    ***********
    ************
    *************
    **************
    
    ```
