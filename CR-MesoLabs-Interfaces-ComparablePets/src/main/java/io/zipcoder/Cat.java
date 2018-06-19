package io.zipcoder;

public class Cat extends PetClass {

    //Constructor uses super keyword to invoke constructor of parent class
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Meow";
    }

    /* 1.super keyword, It is used inside a subclass method definition to call a method  defined in the super class.
     * Private methods of the super-class can't be called. Only public and protected methods of the super-class can
     * be called by the super keyword.
     * 2.super keyword is also used by class constructors to invoke constructors of its parent class**/
}


