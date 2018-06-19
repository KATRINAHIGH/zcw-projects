package com.zipcodewilmington.preassessment2;

public class Thing<T> {

    private T value;

    public Thing(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}


/**
 * First, You have to create your own generic type/class that has a getValue method that can apply to anything.
 * a. Declare the class using the following syntax:
 * class name<T1, T2, ..., Tn>  The type parameter section, delimited by angle brackets (<>), follows the class name. It
 * specifies the type parameters (also called type variables).  You can create as many types as you want.
 * In our case you only need one type. The type introduced into the angle brackets can now be used anywhere
 * inside your class.
 * For our example, we will call our class "public class Thing<T>"
 *
 * b. Update the body of your code to utilize the type you just created. For instance, if you have an
 * instance variable that was of "public String name" it would now be "public T name"
 *
 * c. In our case all we want the body of the code to do is utilize a generic getter that will return any value.
 *
 * private T value;  ---our generic instance variable
 *
 * public Thing(T value){ this.value = value} ---create constructor that takes a value of any type, Makes sense to have
 * the value passed into the constructor parameter and not just a nullary constructor because the value is the central
 * part of the class and you will always need it. The class is of no value without it.
 *
 * public T getValue(){return this.value} ---create a generic getter that retrieves a value of any type
 *
 *
 * Second, Create a Person class as usual
 *
 * public Class Person ---nothing changes here
 *
 * instantiate your instance variables utilizing the type you just created in the other class.
 * This is syntactically similar to when we change types in an arrayList.
 * public Thing<String> name;
 * public Thing<Integer> age;
 * public Thing<Date> birthdate;
 *
 * create your constructor utilizing the types you just passed into the diamond brackets for each variable.
 * public Person(String name, int age, Date birthDate){
 *
 *
 * now assign the current instance value of Person class(this.name) to an instance of Thing class with <Type of choice>
 *     and value of choice. Essentially we are creating a new object of Thing and assigning it to name
 * this.name = new Thing<String>(name);
 this.age = new Thing<Integer>(age);
 this.birthDate = new Thing<Date>(birthDate);
 */