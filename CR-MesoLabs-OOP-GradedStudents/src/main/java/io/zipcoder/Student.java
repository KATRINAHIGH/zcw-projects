package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;

//Using comparator interface for method in classroom put type being compare in <>
public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        /**converted array of doubles to an ArrayList class and used asList method
         * potential future issues. THis solution will not allow you to dynamically
         * change the size of the list*/
        this.examScores = new ArrayList(Arrays.asList(testScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getTestScores() {
        return examScores;
    }

    public int getNumberofExamsTaken() {
        //.size returns number of elements in an arraylist
        return examScores.size();
    }


    public String getExamScores() {
        //take an array list and transform it into a string
        StringBuilder listScores = new StringBuilder();
        Formatter prettyPrint = new Formatter(listScores);
        // Append all doubles in StringBuilder to the StringBuilder.
        for (Double studentScore : this.examScores) {
            prettyPrint.format("Exam %d: %.2f%n", (this.examScores.indexOf(studentScore)) + 1, studentScore);
        }
        //trim removes whitespace at end
        return listScores.toString().trim();
    }

    public void addExamScore(double examScore) {
        //add new test score to the list using .add method
        this.examScores.add(examScore);

    }


    public void setExamScore(int examNum, double updateScore) {
        //updates an existing score using index and .set method
        this.examScores.set(examNum - 1, updateScore);
    }


    public double getAverageExamScore() {
        //Gets average of all exam Scores for a student
        double sum = 0.00;
        for (Double studentScore : this.examScores) {
            sum += studentScore;
        }
        return Math.round(sum / this.examScores.size());

    }

    @Override
    public String toString() {
        StringBuilder studentRecord = new StringBuilder();
        Formatter prettyPrint = new Formatter(studentRecord);
        prettyPrint.format("Student Name: %s %s%nAverage Score: %s%nExam Scores:%n%s%n",
                this.getFirstName(), this.getLastName(), this.getAverageExamScore(), this.getExamScores());
        return studentRecord.toString().trim();
    }

    /**the function used to sort the collections of students, if we implement comparator Student
     that means we have  a function that compares one student to another. This function could be in
     Classroom or student but makes more sense here because its comparing Object of type student
     Note tried to use comparator but didn't work nicely with sort. Changed to comparable and compareTo
     sort is working now look into why this is because I don't completely understand*/
    @Override
    public int compareTo(Student s) {
        //-1 means whats on left is less than whats on right(our comparing value)
        if(this.getAverageExamScore() > s.getAverageExamScore()){
            return -1;
        }
        //1 means whats on left is greater than whats on rigth(our comparing value)
        if(this.getAverageExamScore() < s.getAverageExamScore()){
            return 1;
        }
        //we cant compare any more cus equal so we let it fall through and do a string comparison
        return this.getLastName().compareTo(s.getLastName());
    }
}

