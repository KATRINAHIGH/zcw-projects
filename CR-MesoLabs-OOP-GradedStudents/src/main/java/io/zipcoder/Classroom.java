package io.zipcoder;

import java.util.*;

public class Classroom {

    private Student[] students;

    HashMap<Student, String> gradeBook = new HashMap<>();

    //take an argument of int which holds max number of students
    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    //default constructor
    public Classroom(Student[] students) {
        this.students = students;
    }

    //nullary constructor max number of students predifined
    public Classroom() {
        this(30);
    }


    //define getter returns composite student object
    public Student[] getStudents() {
        return students;
    }


    public double getAverageExamScore() {
        //An array of Student objects with firstName and lastName are strings and scores are an array list of doubles
        //use getTestScores to retrieve all scores from each student
        //loop through students array retrieve all test scores for each student, sum those tests and
        // keep track of total number of tests taken by each student getTestScores() getNumberofExamsTaken(
        double sumOfAllExamsStudentAverages = 0.00;
        for (Student student : students) {
            if (student != null) {
                sumOfAllExamsStudentAverages += student.getAverageExamScore();
            }
        }
        return Math.round(sumOfAllExamsStudentAverages / students.length);
    }

    /**
     * for loop creates an array the size of the class and assigns their reference to the array elements.
     * Now we can add student to the array. Check to see if value at element is null, if so this is the next
     * empty spot in the array and add new student there. return true if successful and false if not
     * Getting confused with student, students, Student..renaming
     */
    public Boolean addStudent(Student newStudent) {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] == null) {
                this.students[i] = newStudent;
                return true;
            }
        }
        return false;
    }

    /**
     * identify and remove the respective student from composite students object. Ensure array
     * is re-ordered after the removal. all null values located at end of array
     */
    public Boolean removeStudent(String firstName, String lastName) {
        //convert array to arraylist, unfortanetly loose control of size if max is important must refactor
        //loop through array to find first does student exit, second what index does student exist at
        //store student object to remove from converted list later because can't iterate over a list that is changing'
        Student studentToBeRemoved = null;
        //loop through an array of type Student
        for (Student currentStudent : this.students) {
            if (currentStudent.getFirstName().equals(firstName) && currentStudent.getLastName().equals(lastName)) {
                studentToBeRemoved = currentStudent;
                break;
            }
        }
        //
        if (studentToBeRemoved == null) {
            return false;
        }
        //Arrays.asList can't be modified so must put in wrapper ArrayList<>
        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(this.students));
        studentsList.remove(studentToBeRemoved);
        //converting arraylist this.students back to an array
        this.students = studentsList.toArray(this.students);
        return true;
    }

    /**
     * returns an array representation of Student objects sorted in descending order by averagescore
     * If two students have the same class average, order them aphabetically by last name.
     * Use a compartor interface, define what it means to be greater then the other, so it sorts them thats
     * how it figures them out
     */
    public Student[] getStudentsByScore() {
        //covert students to arraylist
        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(this.students));
        //call collections.sort
        Collections.sort(studentsList);
        //return underlying array
        return studentsList.toArray(this.students);
    }

    //letter grade determined by creating grading curve
    //returns mapping of Student objects to letter grade
    //letter grade determined by creating grading curve
    //I can get students by total average scores
    //sort everyone by score then return top 10 percent as an a
    public HashMap<Student, String> getGradeBook() {
        //

        return null;
    }


}

