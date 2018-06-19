# Classroom Objects Lab
* **Purpose** - to demonstrate the use of [Java classes](https://docs.oracle.com/javase/tutorial/java/concepts/class.html) and [data encapsulation](https://en.wikipedia.org/wiki/Data_encapsulation).
* **Objective** - to create a `Classroom` which manipulates a composite `List` of `Student` objects which contain data detailing their `firstName`, `lastName`, and `examScores`.
* **Restrictions** - Ensure unit positive and negative unit tests exist per feature of the application



## Part 1; Create class `Student`
* Create a class `Student`.









<br><br><br><br><br>

### Part 1.1; Defining instance variables
* To create a programmatic representation of a `Student`, begin by declaring an instance variable for each of the previously mentioned properties:
	* `String firstName`
		* a collection of characters representative of a first name.
	* `String lastName`
		* a collection of characters representative of a last name.
	* `ArrayList<Double> examScores`
		* a dynamic collection of decimal values representative of test scores.















<br><br><br><br><br>

### Part 1.2; Defining construction
* Define a `Student` constructor whose parameters are used to initalize its instance variables.
* The `Student` constructor has expected parameters of
	* `String` representative of a `firstName` 
	* `String` representative of a `lastName`
	* `Double[]` representative of a collection of `testScores`
















<br><br><br><br><br>

### Part 1.3; Defining methods

* **Getters and Setters**
	* Define a [getter and setter](https://en.wikipedia.org/wiki/Mutator_method#Java_example) for each of the instance variables declared in the `Student` class.
		* **Note:** There should not be a `setter` for the `testScore`. This object's [state](https://cs.stackexchange.com/questions/6536/definition-of-the-state-of-an-object-in-oop) will be [mutated](https://en.wikibooks.org/wiki/Scheme_Programming/Mutability) via a `takeExam` method mentioned below.
		* Additionally, define a getter, `getNumberOfExamsTaken()`, which returns the total number of exams taken by this student.











<br><br><br><br><br>

* **Define method `getExamScores()`**
	* `Student` should define a method which returns a string representation of all exams taken.

		* Sample Script:
		
			```
			// : Given
			String firstName = "Leon";
			String lastName = "Hunter";
			Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
			Student student = new Student(firstName, lastName, examScores);
			
			// When
			String output = student.getExamScores();
			
			// Then
			System.out.println(output);
			```
		* Sample Output
		
			```
			Exam Scores:
				Exam 1 -> 100
				Exam 2 -> 95
				Exam 3 -> 123
				Exam 4 -> 96
			```







<br><br><br><br><br>

* **Define method `addExamScore(double examScore)`**
	* `Student` should define a method named `addExamScore` which uses a `double` parameter to add an `examScore` to its composite List `examScores`.

		* Sample Script:
		
			```
			// : Given
			String firstName = "Leon";
			String lastName = "Hunter";
			Double[] examScores = { };
			Student student = new Student(firstName, lastName, examScores);
			
			// When
			student.addExamScore(100.0);
			String output = student.getExamScores();
			
			// Then
			System.out.println(output);
			```
		* Sample Output
		
			```
			Exam Scores:
				Exam 1 -> 100
			```











<br><br><br><br><br>

* **Define method `setExamScore(int examNumber, double newScore)`**
	* `Student` should define a method named `setExamScore` which uses an `int` parameter to identify an exam in the list, and a `double` parameter to re-assign the respective value.

		* Sample Script:
		
			```
			// : Given
			String firstName = "Leon";
			String lastName = "Hunter";
			Double[] examScores = { 100.0 };
			Student student = new Student(firstName, lastName, examScores);
			
			// When
			student.setExamScore(1, 150.0);
			String output = student.getExamScores();
			
			// Then
			System.out.println(output);
			```
		* Sample Output
		
			```
			Exam Scores:
				Exam 1 -> 150
			```
 
 
 
 
 
 
 
<br><br><br><br><br>

* **Define method `getAverageExamScore()`**
	* `Student` should define a method named `getAverageExamScore()` which returns the sum of the `examScore` list divided by its `size`.


		* Sample Script:
		
			```
			// : Given
			String firstName = "Leon";
			String lastName = "Hunter";
			Double[] examScores = { 100.0, 150.0, 250.0, 0 };
			Student student = new Student(firstName, lastName, examScores);
			
			// When
			double output = student.getAverageExamScore();
			
			// Then
			System.out.println(output);
			```
		* Sample Output
		
			```
			125
			```
			
			


<br><br><br><br><br>

* **Define method `toString()`**
	* `Student` should [override](https://docs.oracle.com/javase/tutorial/java/IandI/override.html) the `toString` method by returning a clean `String` representation of the person.


		* Sample Script:
		
			```
			// : Given
			String firstName = "Leon";
			String lastName = "Hunter";
			Double[] examScores = { 100.0, 150.0, 250.0, 0 };
			Student student = new Student(firstName, lastName, examScores);
			
			// When
			double output = student.toString();
			
			// Then
			System.out.println(output);
			```
		* Sample Output
		
			```
			Student Name: Leon Hunter
			> Average Score: 125
			> Exam Scores:
			    Exam 1 -> 100
			    Exam 2 -> 150
			    Exam 3 -> 250
			    Exam 4 -> 0
			```
			
			
			
			
			
<br><br><br><br><br>
<br><br><br><br><br>
<br><br><br><br><br>

## Part 2; Create class `Classroom`
* Create a class `Classroom`

<br><br><br><br><br>

### Part 2.1; Defining instance variables
* To create a programmatic representation of a `Classroom` begin by declaring an instance variable for each of its properties:
	* `Student[] students`
		* a collection of student objects















<br><br><br><br><br>

### Part 2.2; Defining construction
* Define a `Classroom` constructor whose parameters are used to initalize its instance variable. The class `Classroom` should support 3 different ways of being constructed.
	
	1. The class `Classroom` should define a constructor which takes an argument of an `int` representative of the `maxNumberOfStudents` that this `Classroom` can hold.
	
	2. The class `Classroom` should define an additional constructor which takes an argument of `Student[]` representative of the collection of `Student` objects this `Classroom` will store.
	
	3. The class `Classroom` should define a [nullary constructor](https://en.wikipedia.org/wiki/Nullary_constructor) which initializes the composite `students` object to be an empty array of 30 `Student` objects.















<br><br><br><br><br>

### Part 2.3; Defining methods

* **Define method `getStudents()`**
	* Define a getter which returns the composite `students` object.	












<br><br><br><br><br>

* **Define method `getAverageExamScore()`**
	* Define a getter which returns the sum of all exams divded by the number of students.


		* Sample Script:
		
			```
			// : Given
			Double[] s1Scores = { 100.0, 150.0 }
			Double[] s2Scores = { 225.0, 25.0 }
			
			Student s1 = new Student("student", "one", s1Scores);
			Student s2 = new Student("student", "two", s2Scores);
			
			Student[] students = new Student{s1,s2};
			Classroom classroom = new Classroom(students);
			
			// When
			double output = classroom.getAverageExamScore();
			
			// Then
			System.out.println(output);
			```
		* Sample Output
		
			```
			125.0
			```











<br><br><br><br><br>

* **Define method `addStudent(Student student)`**
	* Define a method which uses a `Student` parameter to add a `Student` object to the composite `students` list.


		* Sample Script:
		
			```
			// : Given
			int maxNumberOfStudents = 1;
			Classroom classroom = new Classroom(maxNumberOfStudents);
			Double[] examScores = { 100.0, 150.0, 250.0, 0 };
			Student student = new Student("Leon", "Hunter", examScores);			
			// When
			String[] preEnrollment = classroom.getStudents();
			classroom.add(s1);
			String[] postEnrollment = classroom.getStudents();
			
			// Then
			String preEnrollmentAsString = Arrays.toString(preEnrollment);
			String postEnrollmentAsString = Arrays.toString(postEnrollment);

			System.out.println("===========================");
			System.out.println(preEnrollmentAsString);
			System.out.println("===========================");
			System.out.println(postEnrollmentAsString);
			```
		* Sample Output
		
			```
			===========================
			[]
			===========================
			[Student Name: Leon Hunter
			> Average Score: 125
			> Exam Scores:
			    Exam 1 -> 100
			    Exam 2 -> 150
			    Exam 3 -> 250
			    Exam 4 -> 0]
			```
			
			





<br><br><br><br><br>

* **Define method `removeStudent(String firstName, String lastName)`**
	* The class `Classroom` should define a method which uses a `firstName` and `lastName` parameter to identify and remove the respective student from composite `students` object.
	* Ensure the array is re-ordered after the removal; Null values should be located in the final indices of the array.





<br><br><br><br><br>

* **Define method `getStudentsByScore()`**
	* The class `Classroom` should define a method `getStudentsByScore()` which returns an array representation of `Student` objects sorted in descending order by score. 
	* If two students have the same class average, order them lexigraphically.




<br><br><br><br><br>

* **Define method `getGradeBook()`**
	* The class `Classroom` should define a method `getGradeBook()` which returns a mapping of `Student` objects to a respective letter grade determined by creating a [grading curve](https://en.wikipedia.org/wiki/Grading_on_a_curve) such that
		* An `A` is awarded to students whose class average is in the upper 10th percentile.
		* A `B` is awarded to students whose class average falls between the 25th and 29th percentile.
		* A `C` is awarded to students whose class average falls between the 30th and 50th percentile.
		* A `D` is awarded to students whose class average falls between the 51st and 89th percentile.
		* An `F` is awarded to students whose class average is in the lower 10th percentile.
