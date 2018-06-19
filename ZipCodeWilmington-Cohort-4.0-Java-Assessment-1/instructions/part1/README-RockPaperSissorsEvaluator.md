# RockPaperScissorsEvaluator

* Ensure each of the test cases in the class [RockPaperScissorsEvaluatorTest]() successfully passes upon completion of each of the method stubs in the class [RockPaperScissorsEvaluator]().
    * `String getWinningMove(String handSign)` 
    * `String getLosingMove(String handSign)`
    * `String getWinner(String handSignOfPlayer1, String handSignOfPlayer2)` 
    






<br><br><br><br>

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Rock-paper-scissors.svg/300px-Rock-paper-scissors.svg.png" class="center">

## `String getWinningMove(String handSign)`
* **Description**
    * Given a String representative of a hand sign, named `handSign`, in [Rock Paper Scissors](https://en.wikipedia.org/wiki/Rock-paper-scissors), return the String representation of the hand sign which would defeat the respective `handSign`.
### Example
* Sample Script

    ```
    // : Given
    RockPaperScissors rps = new RockPaperScissors();
    String input = "rock";
    
    // : When
    String outcome = rps.getWinningMove(input);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    paper
    ```
    
    
    
    
    
    
    


<br><br><br><br>
## `String getLosingMove(String handSign)`
* **Description**
    * Given a String representative of a hand sign, named `handSign`, in [Rock Paper Scissors](https://en.wikipedia.org/wiki/Rock-paper-scissors), return the String representation of the hand sign which would be defeated by the respective `handSign`.
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
## `String getWinner(String handSignOfPlayer1, String handSignOfPlayer2)`
* **Description**
    * Given two Strings, named `handSignOfPlayer1`, and `handSignOfPlayer2`, representative of the hand signs of two Rock Paper Scissor players, return the String representation of the hand sign which would be the victor.
### Example
* Sample Script

    ```
    // : Given
    RockPaperScissors rps = new RockPaperScissors();
    String handSignOfPlayer1 = "rock";
    String handSignOfPlayer2 = "paper";
    
    // : When
    String outcome = rps.getWinner(handSignOfPlayer1, handSignOfPlayer2);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    paper
    ```
