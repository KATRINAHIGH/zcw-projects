package com.zipcodewilmington.preassessment2;

import org.junit.Assert;

public enum AliceBobEnum {

    ALICE("ALICE"),
    BOB("BOB");

    private final String name;

    AliceBobEnum(String name){
        this.name = name;
    }

    public String getCatchPhrase(){
        return String.format("Hey, my name is %s!", this.name);
    }

    public Boolean isAlice(){
        return this.name.equals("ALICE");
    }

    public Boolean isBob() {
        return this.name.equals("BOB");
    }
}

/**Enum fields and methods
 As you can see in this example we have a field name for each of the constant,
 along with a method getName() which is basically a getter method for this field.
 When we define a constant like this ALICE("ALICE"),
 it calls the enum constructor with the passed argument.
 This way the passed value is set as an value for the field of the corresponding enum’s constant
 [ALICE(“ALICE”) => Would call constructor AliceBobEnum(“ALICE”) => this.name = name => this.name = “ALICE” =>
 name field of constant ALICE is set to “ALICE”].

 Important points to Note:

 1) While defining Enums, the constants should be declared first, prior to any fields or methods.
 2) When there are fields and methods declared inside Enum, the list of enum constants must end with a semicolon(;)*/