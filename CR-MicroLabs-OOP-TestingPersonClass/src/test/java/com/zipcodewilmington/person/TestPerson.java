package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        Person person = new Person();

        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        String expected = "Leon";
        Person person = new Person(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        int expected = 5;
        Person person = new Person(expected);
        person.setAge(expected);
        int actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        Integer expectedAge = 5;
        String expectedName = "Leon";

        Person person = new Person(expectedName, expectedAge);

        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        Person person = new Person();
        String expected = "Leon";
        person.setName(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        Person person = new Person();
        person.setAge(5);
        int actual = person.getAge();
        Assert.assertEquals(5, actual);
    }

    @Test
    public void testSetMarriedStatus() {
        Person person = new Person();
        person.setMarriedStatus(true);
        Boolean actual = person.getMarriedStatus();
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testSetHasChildren() {
        Person person = new Person();
        person.setHasChildren(false);
        Boolean actual = person.getHasChildren();
        Assert.assertEquals(false, actual);
    }

    public void testSetIsEmployed() {
        Person person = new Person();
        person.setIsEmployed(true);
        Boolean actual = person.getIsEmployed();
        Assert.assertEquals(true, actual);
    }

    public void testSetSocialSecurityNum() {
        Person person = new Person();
        int expected = 1234567899;
        person.setSocialSecurityNum(expected);
        int actual = person.getSocialSecurityNum();
        Assert.assertEquals(expected, actual);
    }

    public void testSetDriversLicense() {
        Person person = new Person();
        int expected = 1234567899;
        person.setdriversLicense(expected);
        int actual = person.getSocialSecurityNum();
        Assert.assertEquals(expected, actual);
    }

}