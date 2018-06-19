package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {
    public Thing<String> name;
    public Thing<Integer> age;
    public Thing<Date> birthDate;

    public Person(String name, int age, Date birthDate) {
        this.name = new Thing<String>(name);
        this.age = new Thing<Integer>(age);
        this.birthDate = new Thing<Date>(birthDate);
    }

}
