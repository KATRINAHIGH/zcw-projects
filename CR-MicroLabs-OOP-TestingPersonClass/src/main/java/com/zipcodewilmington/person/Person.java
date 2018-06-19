package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */

/**
 * Add 5 different fields to Person Class
 * each method has appropriate testing in test person
 */
public class Person {
    //fields are mostly kept private accessed through getter and setter. Encapsulated
    private String name;
    private int age;
    private Boolean marriedStatus;
    private Boolean hasChildren;
    private Boolean isEmployed;
    private int socialSecurityNum;
    private int driversLicense;

    /**
     * constructor is a method which is called when an object of the class is instantiated
     * It is used to set default values to the attributes of the class.
     * The name of the constructor is the same as the class name and no return type. they can be overridden.
     */
    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    /**
     * this refers to current class instance variable.
     * resolves problem of ambiguity between instance variables and params
     */
    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    //Each constructor has to have a different number of params
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //Overload Constructor
    public Person(Boolean marriedStatus, Boolean hasChildren, Boolean isEmployed, int socialSecurityNum, int driversLicense) {
        this.marriedStatus = marriedStatus;
        this.hasChildren = hasChildren;
        this.isEmployed = isEmployed;
        this.socialSecurityNum = socialSecurityNum;
        this.driversLicense = driversLicense;
    }

    /**
     * a setter is a method that updates value of a variable.
     * naming convention set or get + variableName
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarriedStatus(Boolean marriedStatus) {
        this.marriedStatus = marriedStatus;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public void setIsEmployed(Boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public void setSocialSecurityNum(int socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
    }

    public void setdriversLicense(int driversLicense) {
        this.driversLicense = driversLicense;
    }

    /**
     * Getter is a method returning the value of a
     * private variable the return type is same as the data
     * type of the variable it is returning
     */
    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Boolean getMarriedStatus() {
        return this.marriedStatus;
    }

    public Boolean getHasChildren() {
        return this.hasChildren;
    }

    public Boolean getIsEmployed() {
        return this.isEmployed;
    }

    public int getSocialSecurityNum() {
        return this.socialSecurityNum;
    }

    public int getdriversLicense() {
        return this.driversLicense;
    }

}

