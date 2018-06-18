/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Please provide a whole number: ");
        int usersNum = Integer.parseInt(stdin.nextLine());
        System.out.print("Would like the sum or product of all numbers between 1 and " + usersNum + " ?");
        String operationChoice = stdin.nextLine();

        if (operationChoice.equals("product")) {
            int totalProduct = 1;
            for (int i = 1; i <= usersNum; i++) {
                totalProduct *= i;
            }
            System.out.println("The product of all the numbers between 1 and " + usersNum + " is " + totalProduct);
        } else {
            int totalSum = 0;
            for (int i = 1; i <= usersNum; i++) {
                totalSum += i;
            }
            System.out.println("The sum of all the numbers between 1 and " + usersNum + " is " + totalSum);
        }
    }
}
