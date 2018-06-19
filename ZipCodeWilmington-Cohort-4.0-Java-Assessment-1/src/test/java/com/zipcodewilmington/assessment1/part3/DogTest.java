package com.zipcodewilmington.assessment1.part3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class DogTest {
    @Test
    public void nullaryConstructorTest() {
        // Given
        PetOwner expectedOwner = null;
        String expectedName = "Dog name";
        Integer expectedAge = 0;
        Dog dog = new Dog();

        // When
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();
        PetOwner actualOwner = dog.getOwner();


        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void constructorWithNameTest() {
        // Given
        String expectedName = "Name of Dog";
        Integer expectedAge = 0;
        Dog dog = new Dog(expectedName);

        // When
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();


        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void constructorWithAgeTest() {
        // Given
        String expectedName = "Dog name";
        Integer expectedAge = Integer.MAX_VALUE;
        Dog dog = new Dog(expectedAge);

        // When
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();


        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void constructorWithNameAndAgeTest() {
        // Given
        String expectedName = "Name of Dog";
        Integer expectedAge = Integer.MAX_VALUE;
        Dog dog = new Dog(expectedName, expectedAge);

        // When
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();


        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        // Given
        Dog dog = new Dog();
        String expected = "Bark";

        // When
        String actual = dog.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }
}