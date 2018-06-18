/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        Random random = new Random();
        int mysteryNum = random.nextInt(50) + 1;
        int usersGuess = -1;
        int totalGuesses = 0;

        while (usersGuess != mysteryNum) {

            System.out.print("Guess a mystery number between 1 and 50.");
            usersGuess = Integer.parseInt(stdin.nextLine());
            totalGuesses++;
            if (usersGuess < mysteryNum) {

                System.out.println("Too low, please try again");

            } else if (usersGuess > mysteryNum) {

                System.out.println("Too high, please try again");

            } else {
                System.out.println("You found the mystery number " +
                        mysteryNum + " in " + totalGuesses + " tries.");
            }

        }
    }
}
