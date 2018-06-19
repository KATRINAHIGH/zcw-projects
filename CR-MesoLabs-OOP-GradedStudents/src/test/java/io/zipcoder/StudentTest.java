package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    private Student zipCoder;

    @Before
    public void setup() {
        Double[] defaultExamScores = {75.00, 80.00, 94.00};
        this.zipCoder = new Student("defaultFn","defaultLn", defaultExamScores);
    }


    @Test
    public void testDefaultStudentConstructor_returnsNothing() {
        //Arrange: Given
        String expectedFirstName = "";
        String expectedLastName = "";
        Double[] examScores = {};
        Student zipCoder = new Student(expectedFirstName, expectedLastName, examScores);

        //Act: When
        String actualFn = zipCoder.getFirstName();
        String actuaLn = zipCoder.getLastName();

        //Assert:Then
        Assert.assertEquals(expectedFirstName, actualFn);
        Assert.assertEquals(expectedLastName, actuaLn);
    }

    @Test
    public void testConstructor_returnsFirstName() {
        //Arrange
        Double[] examScores = {67.0, 74.0, 85.0};
        Student zipCoder = new Student("Katrina", "High", examScores);
        //Act
        String actual = zipCoder.getFirstName();
        //Assert
        Assert.assertEquals("Katrina", actual);
    }

    @Test
    public void testConstructor_returnsLastName() {
        //Arrange
        Double[] examScores = {67.0, 74.0, 85.0};
        Student zipCoder = new Student("Katrina", "High", examScores);
        //Act
        String actual = zipCoder.getLastName();
        //Assert
        Assert.assertEquals("High", actual);
    }

    @Test
    public void testConstructor_returnsExamScores() {
        //Arrange:
        //Declare and initialize array: array prints its memory address
        Double[] examScores = {67.0, 74.0, 85.0};
        //converted array of doubles to an ArrayList class and used asList method
        ArrayList<Double> expected = new ArrayList(Arrays.asList(examScores));
        Student zipCoder = new Student("Katrina", "High", examScores);
        //Act
        ArrayList<Double> actual = zipCoder.getTestScores();
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor_returnsFN_LN_ExamScores() {
        //Arrange
        Double[] examScores = {67.0, 74.0, 85.0};
        ArrayList<Double> expected = new ArrayList(Arrays.asList(examScores));
        Student zipCoder = new Student("Katrina", "High", examScores);
        //Act
        String actualFn = zipCoder.getFirstName();
        String actualLn = zipCoder.getLastName();
        ArrayList<Double> actualScores = zipCoder.getTestScores();
        //Assert
        Assert.assertEquals("Katrina", actualFn);
        Assert.assertEquals("High", actualLn);
        Assert.assertEquals(expected, actualScores);
    }

    @Test
    public void testSetFirstName() {
        //Arrange
        String expectedFn = "Bob";
        //Act
        zipCoder.setFirstName(expectedFn);
        String actual = zipCoder.getFirstName();
        //Assert
        Assert.assertEquals(expectedFn, actual);
    }

    @Test
    public void testSetLastName() {
        //Arrange
        String expectedLn = "Mighty";
        //Act
        zipCoder.setLastName(expectedLn);
        String actual = zipCoder.getLastName();
        //Assert
        Assert.assertEquals(expectedLn, actual);
    }

    @Test
    public void testGetNumberOfExamsTaken() {
        //Arrange
        int expectedNumExams = 3;
        //Act
        int actual = zipCoder.getNumberofExamsTaken();
        //Assert
        Assert.assertEquals(expectedNumExams, actual);
    }
    @Test
    public void testGetExamScores(){
        //Arrange
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);
        //Act
        String actual = student.getExamScores();
        //Assert
        Assert.assertEquals("Exam 1: 100.00\nExam 2: 95.00\nExam 3: 123.00\nExam 4: 96.00", actual);
    }

    @Test
    public void testAddExamScore(){
        //Arrange
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {};
        Student student = new Student(firstName, lastName, examScores);
        //Act
        student.addExamScore(100.00);
        String actual = student.getExamScores();
        //Assert
        Assert.assertEquals("Exam 1: 100.00", actual);
    }

    @Test
    public void testSetExamScore(){
        //Arrange
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.00};
        Student student = new Student(firstName, lastName, examScores);
        //Act
        student.setExamScore(1, 150.00);
        String actual = student.getExamScores();
        //Assert
        Assert.assertEquals("Exam 1: 150.00", actual);
    }

    @Test
    public void testGetAverageExamScore(){
        //Arrange
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.00, 150.00, 250.00, 0.00};
        Student student = new Student(firstName, lastName, examScores);
        double expected = 125.00;
        //Act
        double actual = student.getAverageExamScore();
        //Assert
        Assert.assertTrue(actual == expected);

    }

    @Test
    public void testToString(){
        //Arrange
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student("Leon", "Hunter", examScores);
        String expected = "Student Name: Leon Hunter\n" +
                "Average Score: 104.0\n" +
                "Exam Scores:\n" +
                "Exam 1: 100.00\n" +
                "Exam 2: 95.00\n" +
                "Exam 3: 123.00\n" +
                "Exam 4: 96.00";

        //Act
        String actual = student.toString();
        //Assert
        Assert.assertEquals(expected, actual);

    }

}

/**
 *
 * List<Element> list = Arrays.asList(array);
 * This will work fine. But some caveats:
 * <p>
 * The list returned from asList has fixed size. So, if you want to be
 * able to add or remove elements from the returned list in your code,
 * you'll need to wrap it in a new ArrayList. Otherwise you'll get an
 * UnsupportedOperationException.
 * The list returned from asList() is backed by the original array.
 * If you modify the original array, the list will be modified as well. This may be surprising.
 **/



