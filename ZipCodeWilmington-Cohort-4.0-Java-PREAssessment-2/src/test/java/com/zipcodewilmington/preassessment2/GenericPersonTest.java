package com.zipcodewilmington.preassessment2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by leon on 3/4/18.
 */
public class GenericPersonTest {
    private String expectedName;
    private int expectedAge;
    private Date expectedBirthDate;
    private Person person;

    @Before
    public void setup() {
        // Given
        this.expectedName = "Leon";
        this.expectedAge = 24;
        this.expectedBirthDate = new Date(System.currentTimeMillis());
        this.person = new Person(expectedName, expectedAge, expectedBirthDate);
    }

    @Test
    public void testGetName() {
        // When
        String actualName = person.name.getValue();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void testGetAge() {
        // When
        int actualName = person.age.getValue();

        // Then
        Assert.assertEquals(expectedAge, actualName);
    }


    @Test
    public void testGetBirthDate() {
        // When
        Date actualName = person.birthDate.getValue();

        // Then
        Assert.assertEquals(expectedBirthDate, actualName);
    }
}
