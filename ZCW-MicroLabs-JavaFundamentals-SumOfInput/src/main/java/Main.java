/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner stdin = new Scanner( System.in );

        int num;      // The user's name, as entered by the user.

        System.out.print("Please enter a whole number greater than 1: ");
        num = Integer.parseInt(stdin.nextLine());

        if(num < 0) {
            System.out.println("Sorry, number can't be negative");
        }else{
            int sumNum = num * (num + 1)/2;
            System.out.println("Sum of all numbers from 1 to " + num + " is" + " " + sumNum);
        }
    }
}
