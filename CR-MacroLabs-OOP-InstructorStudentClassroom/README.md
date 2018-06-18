# Leon's Lengthy Learner Lab 
* **Purpose** - to demonstrate the use of [Java interfaces](http://tutorials.jenkov.com/java/interfaces.html#java-interface-example)
* **Objective** - to implement a `ZipCodeWilmington` class which _mediates_ a _composite_ `Students` and `Instructors` _singleton_ reference.


### Part 1.1 - Create `Person` Class
* Create a `Person` class.
	* The class should declare a `final` field named `id` of type `long`.
	* The class should declare a field named `name` of type `String`.	
	* `Person` constructor should have a parameter of type `long` which sets the `id` field to the respective value.
	* The class should define a `getId()` method which returns the `Person` object's `id` field.
	* The class should define a `getName()` method which returns the `Person` object's `name` field.
	* The class should define a `setName()` method which sets the `Person` object's `name` field.

-
### Part 1.0 - Test `Person`
* Create a `TestPerson` class.
	* Create a `testConstructor` method which ensures that a `Person` object's `id` field is being set upon construction.
	* Create a `testSetName` method which ensures that a `Person` object's `name` variable is being set by invoking the `.setName` method.

-
### Part 2.0 - Create `Learner` Interface
* Create a `Learner` interface.
	* `Learner` should declare one method signature:
		* Method name: `learn`
		* Method parameters: `double numberOfHours`
		* Method return-type: `void`

-
### Part 3.1 - Create `Student` Class
* Create a `Student` class such that:
	* `Student` is a subclass of `Person`
	* `Student` implements the `Learner` interface
	* `Student` should have an instance variable `totalStudyTime` of type `double`
	* `Student` should have a concrete implementation of the `learn` method which increments the `totalStudyTime` variable by the specified `numberOfHours` argument.
	* `Student` should have a `getTotalStudyTime()` method which returns the `totalStudyTime` instance variable.


-
### Part 3.0 - Test `Student`
* Create a `TestStudent` class.
	* Create a `testImplementation` method that asserts that a `Student` is an `instanceof` a `Learner`.
	* Create a `testInheritance` method that asserts that a `Student` is an `instanceof` a `Person`.
	* Create a `testLearn` method that ensures a `Student`'s `totalStudyTime` instance variable is incremented by the specified `numberOfHours` by invoking the `.learn` method.

-
### Part 4.0 - Create `Teacher` Interface
* Create a `Teacher` interface.
	* `Teacher` should declare a `teach` method signature:
		* Method name: `teach`
		* Method parameters:
			* `Learner learner`
			* `double numberOfHours`
		* Method return-type: `void` 

	* `Teacher` should declare a `lecture` method signature:
		* Method name: `lecture`
		* Method parameters:
			* `Learner[] learners`
			* `double numberOfHours`
		* Method return-type: `void`

		
-
### Part 5.1 - Create `Instructor` Class
* Create an `Instructor` class such that:
	* `Instructor` is a subclass of `Person`
	* `Instructor` implements the `Teacher` interface
	* `Instructor` should have a concrete implementation of the `teach` method which invokes the `learn` method on the specified `Learner` object.
	* `Instructor` should have a concrete implementation of the `lecture` method which invokes the `learn` method on each of the elements in the specified array of `Learner` objects.
		* `numberOfHours` should be evenly split amongst the learners.
			* `double numberOfHoursPerLearner = numberOfHours / learners.length;`

-
### Part 5.0 - Test `Instructor`
* Create a `TestInstructor` class.
	* Create a `testImplementation` method that asserts that an `Instructor` is an `instanceof` a `Teacher`.
	* Create a `testInheritance` method that asserts that a `Instructor` is an `instanceof` a `Person`.
	* Create a `testTeach` method that ensures when an `Instructor` invokes the `teach` method, a respective student's `totalStudyTime` instance variable is incremented by the specified `numberOfHours`.
	* Create a `testLecture` method that ensures when an `Instructor` invokes the `lecture` method, a respective array of students' `totalStudyTime` instance variables is incremented by `numberOfHours/students.length`.


-
### Part 6.1 - Create `People` class
* Create a `People` class.
	* The class should instantiate an `ArrayList` field of `Person` objects named `personList`.
	* The class should define a method named `add` which adds a `Person` to the `personList`.
	* The class should define a method named `findById` which makes use of a `long id` parameter to return a `Person` object with the respective `id` field.
	* The class should define a method named `remove` which makes use of a `Person person` parameter to remove a respective `Person` object.
	* The class should define a method named `remove` which makes use of a `long id` parameter to remove a `Person` object with the respective `id` field.
	* The class should define a method named `getCount` which returns the size of `personList`.
	* The class should define a method named `getArray` which returns an array representation of the `personList` field.
	* The class should define a named `removeAll` which clears our `personList` field.
	
-
### Part 6.0 - Test `People`
* Create a `TestPeople` class.
	* Create a `testAdd` method which ensures that our `personList` in our `People` class populated with respective `Person` objects following invokation of the `add` method.
	* Create a `testRemove` method which ensures that the `personList` in a `People` object is **depopulated** with a respective `Person` object following the invokation of the `remove` method.
	* Create a `testFindById` method which ensures that a respective `Person` object with a respective `id` field is returned upon invokation of the `findById` method on a respective `People` object.


-
### Part 7.1 - Create `Students` singleton
* **Note:** The creation of this class will demonstrate an implementation of [singleton design pattern](https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples#eager-initialization).
* Create a `Students` class.
	* The class should be an _unextendable_ subclass of the `People` class.
	* The class should _statically instantiate_ a `final` field named `INSTANCE` of type `Students`.
	* The class should define a _private nullary constructor_ which populates the `INSTANCE` field with respective `Student` representations of your colleagues.
		* Each student should have a _relatively_ unique `id` field.
	* The class should define a `getInstance` method which returns the `INSTANCE` field.
	
	

-
### Part 7.0 - Test `Students` singleton
* Create a `TestStudents` class.
	* Create a `test` method which ensures that each of the students in your current cohort are in your `Students` singleton.



-
### Part 8.0 - Create and Test `Instructors` singleton
* Use `Part 7` as a reference.
* Create a `Instructors` singleton which represents the set of instructors at ZipCodeWilmington.
* Create a `TestInstructors` class.


-
### Part 9.1 - Create `ZipCodeWilmington` Class
* Create a `ZipCodeWilmington` singleton.
	* The class should declare a field that references the instance of `Students` called `students`.
	* The class should declare a field that references the instance of `Instructors` called `instructors`.
	* The class should define a method `hostLecture` which makes use of a `Teacher teacher, double numberOfHours` parameter to host a `lecture` to the composite `people` field in the `students` reference.
	* The class should define a method `hostLecture` which makes use of a `long id, double numberOfHours` parameter to identify a respective `Instructor` to host a `lecture` to the composite `people` field in the `cohort` reference.

-
### Part 9.0 - Test `ZipCodeWilmington`
* Create a `TestZipCodeWilmington` class.
	* Create a `testHostLecture` method which ensures that each of the `Student`'s `totalStudyTime` instance variable is incremented by the specified `numberOfHours` upon invoking the `hostLecture` method.









-
# Notice the Design Flaw - Odd Casting Issues
* You may have noticed that the `findById`, and `hostLecture` methods require an intermediate [casting trick](https://stackoverflow.com/questions/5289393/casting-variables-in-java).
* To remedy this issue, we can _generify_ the `People` class.

-
### Part 10.1 - Modify `People` class
* [Parameterize](https://stackoverflow.com/questions/12551674/what-is-meant-by-parameterized-type) the `People` signature to enforce that it is a container for objects of type `E` such that `E` is a subclass of `Person`.
* Modify the class signature to declare this class _abstract_.
	* An [abstract class](http://www.javacoffeebreak.com/faq/faq0084.html) cannot be instantiated; Its concrete implementation is deferred to its subclass.
* Modify `people` field to enforce that is a container of objects of type `E`.
* Modify the `add` method to ensure that it handles object of type `E`.
* Modify the `findById` method to ensure that it returns an object of type `E`.
* Modify the `getArray` method signature by declaring it `abstract` of return tyoe `E`.
	* An abstract method is a subclass's contractual agreement to the deferment of an implementation of a respective method.

-
### Part 10.2 - Modify `People` subclasses
* Modify the `Students` class signature to ensure that it is a subclass of `People` of parameterized type `Student`.
* Modify the `Instructors` class signature to ensure that it is a subclass of `People` of parameterized type `Instructor`.
* Provide concrete implementations of the `getArray` method in each of these classes.

-
### Part 10.3 - Refactor `ZipCodeWilmington` class
* Refactor the `hostLecture` method in the `ZipCodeWilmington` class by removing any intermediate _casting trick(s)_.

-
### Part 10.0 - Test refactored classes.
* Ensure that the `TestStudents`, `TestInstructors`, `TestPeople`, `TestZipCodeWilmington` classes were not affected by the refactor.






-
# Notice the Design Flaw - Non-Intuitive Orientation
* You may have noticed that `findById` makes it difficult to intuitively identify _which_ `Person` object is being returned. To remedy this issue, we can make use of an `enum` which manipulates a composite `instructor` object.

-
### Part 11.1 - Create `Educator` enum
* Create an enum named `Educator`.
	* The enum should implement `Teacher`.
	* The enum should have an enumeration for each of the instructors represented in the `Instructors` class.
	* Upon construction each enumeration of the enum should instantiate a respective `Instructor` and assign it to a final `instructor` field upon construction. The `instructor` should be added to the `Instructors` singleton.
	* Calls to the `teach` and `lecture` method should be differed to the composite `instructor` reference.
	* The enum should have a `double timeWorked` field which keeps track of the hours that the `Educator` has taught.

-
### Part 11.0 - Test `Educator`
* Use `Part 5` as a reference.


-
### Part 12.0 - Test `ZipCodeWilmington`
* Ensure the `hostLecture` method can handle objects of type `Educator`.
