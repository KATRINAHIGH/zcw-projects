package io.zipcoder;

public class Dog extends PetClass {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Woof";
    }
}
