package io.zipcoder;

public class Reptile extends PetClass {

    public Reptile(String name) {

        super(name);
    }

    @Override
    public String speak() {

        return "Hiss!";
    }
}
