package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    private String name;

    public AliceBobEvaluator(String name) {
        this.name = name;
    }

    public Boolean isAlice(){
        return this.name.equalsIgnoreCase("Alice");
    }

    public Boolean isBob(){
        return this.name.equalsIgnoreCase("Bob");
    }
}
