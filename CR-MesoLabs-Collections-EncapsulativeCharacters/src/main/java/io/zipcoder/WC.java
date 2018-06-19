package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private Iterator<String> stringIterator;
    private TreeMap<String, Integer> map;

    public WC(String fileName) {
        try {
            this.stringIterator = new Scanner(new FileReader(fileName));
            this.map = new TreeMap<String, Integer>();
            this.parseAndCountWords();
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    private void parseAndCountWords() {
        while (this.stringIterator.hasNext()) {
            String s = this.stringIterator.next().toLowerCase().replaceAll("[^\\w]", "");
            Integer count = this.map.getOrDefault(s, 0);
            this.map.put(s, count+1);
        }
    }


    public String toString() {
        ArrayList<Map.Entry<String, Integer>> sortedValues = new ArrayList<>();
        this.map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(sortedValues::add);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : sortedValues) {
            sb.append(entry.getKey()).append(" = ").append(entry.getValue()).append("\n");
        }

        return sb.toString();
    }

    public void print() {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        //WC wc = new WC("/Users/kaitrinahigh/Downloads/47366-0.txt");
        WC testFile = new WC("/Users/kaitrinahigh/Dev/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/someTextFile.txt");
        testFile.print();

    }
}








