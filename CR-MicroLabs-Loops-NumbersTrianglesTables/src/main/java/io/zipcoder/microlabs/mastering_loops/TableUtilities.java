package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder matrix = new StringBuilder();

        for(int row = 1; row <= tableSize; row++) {
            for(int col = 1; col <= tableSize; col++){
                matrix.append(String.format("%3d |", row * col));
            }
            matrix.append("\n");
        }
        return matrix.toString();
    }
}


