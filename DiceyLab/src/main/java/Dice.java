
import java.util.Random;

public class Dice {

    private int numOfDice;
    private int rollMax;
    private int rollMin;

    public Dice() {
        this(1);
    }

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
        this.rollMax = this.numOfDice * 6;
        this.rollMin = this.numOfDice;
    }

    public int getRollMax() {
        return rollMax;
    }

    public int getRollMin() {
        return rollMin;
    }

    /**
     * Create a random number from 1 to 6 for each dice you roll
     * sum all of the random numbers up and that equals total for that roll
     */
    public int tossAndSum() {
        int sumOfRoll = 0;
        for (int i = 0; i < numOfDice; i++) {
            sumOfRoll += (int) (Math.random() * 6) + 1;
        }
        return sumOfRoll;
    }

    public static void main(String[] args) {
        Dice dice = new Dice(2); // for craps
        Dice dice2 = new Dice(5); // for yatzee

        Integer toss = dice.tossAndSum();
        Integer toss2 = dice2.tossAndSum();

        System.out.println(toss);
        System.out.println(toss2);
    }
}
