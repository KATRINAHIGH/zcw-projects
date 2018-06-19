package io.zipcoder;

import java.lang.Comparable;

public abstract class PetClass implements Comparable<PetClass> {
    //Since the Petclass has an abstract method, need to declare this class abstract.

    //The Pet class must have a name field with setters and getters.
    String name;

    public PetClass(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    //The Pet class must have a speak method that each subclass overrides.
    //abstract method

    /**
     * All the child classes should override this method. There is no point to implement this
     * method in parent class. Making this method abstract would be a good choice because making
     * it abstract will force subclasses to implement this method (or will get compile error)
     */
    public abstract String speak();

    @Override
    public int compareTo(PetClass other) {
        int equality = this.name.compareTo(other.name);
        if (equality != 0) {
            return equality;
        }
        return this.getClass().getSimpleName().compareTo(other.name.getClass().getSimpleName());
    }

}


/**
 * Notes on Comparable and CompareTo().
 * To sort an Object by its property, you have to make the Object implement the Comparable interface
 * and override the compareTo() method.A comparable object is capable of comparing itself with another object.
 * The class itself must implements the java.lang.Comparable interface to compare its instances. When comparing strings
 * we have 3 possible outcomes. Int of 0 which means the strings are equal. Int of -1 means string
 * on the left is greater lexigraphically than whats on the right(comparing value). Int of 1 means
 * whats on the left is smaller lexigraphically than whats on the right(comparing value).
 * In this case I compared the current instance of the objects name to the previous(or next instance of the object..
 * code for compareTo does that). if it's 0 it falls through to the second return statement. if returns 1 or -1 then
 * it returns that value.
 * The second return statement compares class Name. If pets name is equal will compare classname.
 */





