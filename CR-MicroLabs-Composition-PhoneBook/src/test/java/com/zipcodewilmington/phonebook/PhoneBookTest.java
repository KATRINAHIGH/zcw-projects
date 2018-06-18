package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

    private static PhoneBook testPhoneBook;

    public void setUp() {
        testPhoneBook = new PhoneBook();
    }

    @Test
    public void recordShouldAddToPhoneBook() {
        PhoneBook pb = new PhoneBook();
        pb.addNameAndNumber("Julia", "7173248976");
        String expectedValue = pb.retrieveNumbersByName("Julia");
        Assert.assertEquals(expectedValue, "7173248976");
    }

    @Test
    public void recordShouldAddMultipleNumbersToPerson() {
        PhoneBook pb = new PhoneBook();
        pb.addNameAndNumber("Julia", "7173248976");
        pb.addNameAndNumber("Julia", "7173331234");
        pb.addNameAndNumber("Julia", "7174561234");
        String actualValue = pb.retrieveNumbersByName("Julia");
        Assert.assertEquals( "7173248976, 7173331234, 7174561234" ,actualValue);
    }

    @Test
    public void ShouldRetrieveNumbersByName() {
        PhoneBook pb = new PhoneBook();
        pb.addNameAndNumber("Sam", "7173247777");
        String expectedValue = pb.retrieveNumbersByName("Sam");
        Assert.assertEquals(expectedValue, "7173247777");
    }

    @Test
    public void ShouldRetrieveMultipleNumbersByName() {
        PhoneBook pb = new PhoneBook();
        pb.addNameAndNumber("Sam", "7173247777");
        pb.addNameAndNumber("Sam", "7173243333");
        pb.addNameAndNumber("Sam", "7173242222");
        String actualValue = pb.retrieveNumbersByName("Sam");
        Assert.assertEquals( "7173247777, 7173243333, 7173242222", actualValue);
    }


    @Test
    public void shouldRetrieveNameByNumber() {
        PhoneBook pb = new PhoneBook();
        pb.addNameAndNumber("Sam", "7173247777");
        String expectedValue = pb.retrieveNameByNumber("7173247777");
        Assert.assertEquals(expectedValue, "Sam");
    }


    @Test
    public void recordShouldDeleteFromPhoneBook() {
        PhoneBook pb = new PhoneBook();
        pb.addNameAndNumber("Julia", "7173247777");
        pb.deleteNameAndNumber("Julia");
        String expectedValue = pb.listAllNames();
        Assert.assertEquals(expectedValue, "");
    }

    @Test
    public void recordShouldDeleteFromPhoneBookForPersonWithMultipleNumbers() {
        PhoneBook pb = new PhoneBook();
        pb.addNameAndNumber("Julia", "7173247777");
        pb.addNameAndNumber("Julia", "7173246666");
        pb.addNameAndNumber("Julia", "717326666");
        pb.deleteNameAndNumber("Julia");
        String expectedValue = pb.listAllNames();
        Assert.assertEquals(expectedValue, "");
    }


    @Test
    public void shouldlistAllNamesAlphabeticalOrder() {
        PhoneBook pb = new PhoneBook();
        pb.addNameAndNumber("Sally", "7173243456");
        pb.addNameAndNumber("Adam", "7173244567");
        pb.addNameAndNumber("Chance", "7173247891");
        pb.addNameAndNumber("Zach", "7173242345");
        pb.addNameAndNumber("Wally", "7173242345");
        String actual = pb.listAllNames();
        String testList = "Name: Adam\nName: Chance\nName: Sally\nName: Wally\nName: Zach\n";
        Assert.assertEquals(testList, actual);
    }


    @Test
    public void shouldlistAllNamesAndNumbers() {

        PhoneBook pb = new PhoneBook();
        pb.addNameAndNumber("Sally", "7173243456");
        pb.addNameAndNumber("Adam", "7173244567");
        pb.addNameAndNumber("Chance", "7173247891");
        pb.addNameAndNumber("Zach", "7173242345");
        pb.addNameAndNumber("Wally", "7173242345");
        pb.addNameAndNumber("Wally", "7173243333");
        pb.addNameAndNumber("Wally", "7173244444");
        String actual = pb.listAllNames();
        String testList = "Name: Adam\nName: Chance\nName: Sally\nName: Wally\nName: Zach\n";
        Assert.assertEquals(testList, actual);
    }


}