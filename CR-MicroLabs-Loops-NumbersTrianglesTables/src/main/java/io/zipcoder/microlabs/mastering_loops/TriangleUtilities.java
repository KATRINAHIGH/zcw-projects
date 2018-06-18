package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        String triangleContainer = "";

        for (int row=1; row < numberOfRows; row++)
        {
            for (int column=0; column<row; column++)
            {
               triangleContainer += "*";
            }
            triangleContainer += "\n";
        }
        return triangleContainer;
    }

    public static String getRow(int numberOfStars) {

        String triangleContainer = "";

        for (int row=0; row < numberOfStars; row++)
        {
            triangleContainer += "*";
        }
        return triangleContainer;
    }

    public static String getSmallTriangle() {

        return getTriangle(5);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);
    }
}
