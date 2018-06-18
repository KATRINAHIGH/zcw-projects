import java.util.Formatter;

public class Simulation {
    //numberOfDies to throw
    private int numOfDies;
    //numberOfTosses to run
    private int numOfTosses;
    //make Bin a property so easier to print
    private Bins results;


    public Simulation(int numOfDies, int numOfTosses) {
        this.numOfDies = numOfDies;
        this.numOfTosses = numOfTosses;
    }

    //Create a simulation where two dies are thrown one million times.Keep track of all results.
    public void runSimulation() {
        Dice dice = new Dice(numOfDies);
        results = new Bins(dice.getRollMin(), dice.getRollMax());
        for (int i = 0; i <= numOfTosses; i++) {
            Integer rollValue = dice.tossAndSum();
            results.incrementBin(rollValue);
        }
    }

    @Override
    public String toString() {
        Formatter outPut = new Formatter();
        for (Integer binKey : results.keepTrack.keySet()) {
            float ratio = (float) results.keepTrack.get(binKey) / (float) numOfTosses;
            int starCount = (int) (ratio * 100);
            //Create a new string, create char array to num of stars want, it defaults to nulls, replace with asterisks
            String stars = new String(new char[starCount]).replace("\0", "*");
            outPut.format("%d : %d: %.2f: %s%n", binKey, results.keepTrack.get(binKey), ratio, stars);
        }
        return outPut.toString();
    }

    public void printResults() {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();

    }
}





