# TableUtilities
* Ensure each of the test cases in the class [TableUtilitiesTest](https://github.com/Zipcoder/CR-MicroLabs-Loops-NumbersTrianglesTables/blob/master/src/test/java/io/zipcoder/microlabs/mastering_loops/TableUtilitiesTest.java) successfully passes upon completion of each of the method stubs in the class [TableUtilities](https://github.com/Zipcoder/CR-MicroLabs-Loops-NumbersTrianglesTables/blob/master/src/main/java/io/zipcoder/microlabs/mastering_loops/TableUtilities.java).
    * `String getLargeMultiplicationTable()`
    * `String getSmallMultiplicationTable()`
    * `String getMultiplicationTable(int width)`




    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    






<br><br><br><br>
## `String getSmallMultiplicationTable()`
* **Description**
    * Generate a `String` representation of a multiplication table whose dimensions are `4` by `4`
	
### Example 1
* Sample Script

    ```
    // : Given    
    // : When
    String outcome = TableUtilities.getSmallMultiplicationTable();
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
      1 |  2 |  3 |  4 |
      2 |  4 |  6 |  8 |
      3 |  6 |  9 | 12 |
      4 |  8 | 12 | 16 |
    ```







    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
<br><br><br><br>
## `String getLargeMultiplicationTable()`
* **Description**
    * Generate a `String` representation of a multiplication table whose dimensions are `9` by `9`

	
### Example
* Sample Script

    ```
    // : Given    
    // : When
    String outcome = TableUtilities.getLargeMultiplicationTable();
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 |
    2 |  4 |  6 |  8 | 10 | 12 | 14 | 16 | 18 | 20 |
    3 |  6 |  9 | 12 | 15 | 18 | 21 | 24 | 27 | 30 |
    4 |  8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 | 40 |
    5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 | 50 |
    6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 | 60 |
    7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 | 70 |
    8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 | 80 |
    9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 | 90 |
   10 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 |100 |
    ```
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
<br><br><br><br>
## `String getMultiplicationTable(int width)`
* **Description**
    * Given one integer, `width`, generate a `String` representation of a multiplication table whose dimensions are `width` by `width`

	
### Example 1
* Sample Script

    ```
    // : Given
    int n = 3;
    
    // : When
    String outcome = TableUtilities.getMultiplicationTable(n);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
      1 |  2 |  3 |
      2 |  4 |  6 |
      3 |  6 |  9 |
    ```



### Example 2
* Sample Script

    ```
    // : Given
    int n = 6;
    
    // : When
    String outcome = TableUtilities.getMultiplicationTable(n);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
     1 |  2 |  3 |  4 |  5 |  6 |
     2 |  4 |  6 |  8 | 10 | 12 |
     3 |  6 |  9 | 12 | 15 | 18 |
     4 |  8 | 12 | 16 | 20 | 24 |
     5 | 10 | 15 | 20 | 25 | 30 |
     6 | 12 | 18 | 24 | 30 | 36 |
    ```
