package io.zipcoder;

import org.junit.Assert;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClassroomTest {
    @Test
    public void testConstructor_returnsMaxNumStudentsPreDefined() {
        Classroom testClassRoom = new Classroom();
        int expected = 30;
        int actual = testClassRoom.getStudents().length;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testConstructor_UpdatesMaxNumStudents() {
        Classroom testClassRoom = new Classroom(20);
        int expected = 20;
        int actual = testClassRoom.getStudents().length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor_EmptyClassroom_ReturnsNothing() {
        Student[] students = new Student[0];
        Classroom testClassroom = new Classroom(students);
        Student[] expected = {};
        Student[] actual = testClassroom.getStudents();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testgetAverageExamScore(){
        //Arrange
        Double[] sallyScores = { 100.0, 150.0 };
        Double[] samScores = { 225.0, 25.0 };
        Student sally = new Student("Sally", "Lapp", sallyScores);
        Student sam = new Student("Sam", "Emerson", samScores);
        Student[] students = new Student[]{sally,sam};
        Classroom classroom = new Classroom(students);
        //Act
        double actual = classroom.getAverageExamScore();
        //Assert
        Assert.assertTrue(125.00 == actual);

    }

    @Test
    public void testAddStudent(){
        //Arrange
        Double[] billScores = { 225.0, 25.0 };
        Student bill = new Student("Bill", "DimSum", billScores);
        Classroom testClassroom = new Classroom(1);
        Student[] expected = {bill};
        //Act
        testClassroom.addStudent(bill);
        Student[] actual = testClassroom.getStudents();
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveStudent(){
        //Arrange
        Double[] sallyScores = { 100.0, 150.0 };
        Double[] samScores = { 225.0, 25.0 };
        Double[] tomScores = { 100.0, 25.0, 50.00 };
        Student sally = new Student("Sally", "Lapp", sallyScores);
        Student sam = new Student("Sam", "Emerson", samScores);
        Student tom = new Student("Tom", "Lip", tomScores);
        Student[] students = new Student[]{sally,sam,tom};
        Classroom classroom = new Classroom(students);
        //Act
        classroom.removeStudent("Sally", "Lapp");
        double expected = 61.0;
        double actual = classroom.getAverageExamScore();
        //Assert
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testRemoveStudent_NoStudent(){
        Double[] student1Scores = { 65.0, 65.0 };
        Double[] student2Scores = { 75.0, 80.0 };
        Double[] student3Scores = { 75.0, 80.0 };
        Student student1 = new Student("Mel", "Hammer", student1Scores);
        Student student2 = new Student("Kyle", "Ant", student2Scores);
        Student student3 = new Student("Katrina", "High", student3Scores);
        Student[] students = {student1, student2, student3};
        Classroom testClassroom = new Classroom(students);

        Boolean actual = testClassroom.removeStudent("Linda", "Lou");

        Assert.assertFalse(actual);
    }

    @Test
    public void getStudentsByScoreTest_SameScore(){
        Double[] student1Scores = { 65.0, 65.0 };
        Double[] student2Scores = { 75.0, 80.0 };
        Double[] student3Scores = { 75.0, 80.0 };
        Student student1 = new Student("Mel", "Hammer", student1Scores);
        Student student2 = new Student("Kyle", "Ant", student2Scores);
        Student student3 = new Student("Katrina", "High", student3Scores);
        Student[] students = {student1, student2, student3};
        Classroom testClassroom = new Classroom(students);

        Student[] expected = {student2, student3, student1};
        Student[] actual = testClassroom.getStudentsByScore();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStudentsByScoreTest_SameName(){
        Double[] student1Scores = { 65.0, 65.0 };
        Double[] student2Scores = { 75.0, 80.0 };
        Double[] student3Scores = { 100.0, 1000.0 };
        Student student1 = new Student("Mel", "Hammer", student1Scores);
        Student student2 = new Student("Kyle", "Ant", student2Scores);
        Student student3 = new Student("Katrina", "Ant", student3Scores);
        Student[] students = {student1, student2, student3};
        Classroom testClassroom = new Classroom(students);

        Student[] expected = {student3, student2, student1};
        Student[] actual = testClassroom.getStudentsByScore();

        Assert.assertEquals(expected, actual);
    }

}

