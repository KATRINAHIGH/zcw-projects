package com.zipcodewilmington.assessment1.part3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwnerTest {
    @Test
    public void constructorTest() {
        // Given
        String expectedName = "George";
        Pet expectedPet = new Dog();

        // When
        PetOwner po = new PetOwner(expectedName, expectedPet);
        String actualName = po.getName();
        Pet actualPet = po.getPets()[0];

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedPet, actualPet);
    }

    @Test
    public void addPetTest1() {
        // Given
        Pet expected = new Dog();
        PetOwner po = new PetOwner("", null);

        // When
        po.addPet(expected);
        Pet actual = po.getPets()[0];

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void addPetTest2() {
        // Given
        Pet newPet = new Dog();
        PetOwner po = new PetOwner("", null);

        // When
        po.addPet(newPet);

        // Then
        boolean outcome = po.isOwnerOf(newPet);
        Assert.assertTrue(outcome);
    }

    @Test
    public void removePetTest() {
        // Given
        Pet newPet = new Dog();
        PetOwner po = new PetOwner("", newPet);
        Pet expected = null;

        // When
        po.removePet(newPet);
        Pet actual = po.getPets()[0];

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isOwnerOfTest() {
        // Given
        Pet newPet = new Dog();
        Pet anotherPet = new Dog();
        PetOwner po = new PetOwner("", newPet);

        // When
        boolean outcome = po.isOwnerOf(newPet);
        boolean poOwnsAnotherPet = po.isOwnerOf(anotherPet);

        // Then
        Assert.assertTrue(outcome);
        Assert.assertFalse(poOwnsAnotherPet);
    }


    @Test
    public void getYoungestPetAgeTest() {
        // Given
        int expected = 1;
        Pet oneYearOldPuppy = new Dog(expected);
        Pet twoYearOldKitten = new Cat(2);
        PetOwner po = new PetOwner("", oneYearOldPuppy, twoYearOldKitten);

        // When
        int actual = po.getYoungetPetAge();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getOldestPetAgeTest() {
        // Given
        int expected = 2;
        Pet oneYearOldPuppy = new Dog(1);
        Pet twoYearOldKitten = new Cat(expected);
        PetOwner po = new PetOwner("", oneYearOldPuppy, twoYearOldKitten);

        // When
        int actual = po.getOldestPetAge();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAveragePetAgeTest() {
        // Given
        Float expected = 3F;
        Pet oneYearOldPuppy = new Dog(4);
        Pet twoYearOldKitten = new Cat(2);
        PetOwner po = new PetOwner("", oneYearOldPuppy, twoYearOldKitten);

        // When
        Float actual = po.getAveragePetAge();

        // Then
        Assert.assertEquals(expected, actual, 0.05);
    }

    @Test
    public void getNumberOfPetsTest() {
        // Given
        Integer expected = 2;
        Pet oneYearOldPuppy = new Dog(4);
        Pet twoYearOldKitten = new Cat(2);
        PetOwner po = new PetOwner("", oneYearOldPuppy, twoYearOldKitten);

        // When
        Integer actual = po.getNumberOfPets();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        // Given
        String expected = "Pet owner name";
        PetOwner po = new PetOwner(expected);

        // When
        String actual = po.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPets() {
        // Given
        Pet oneYearOldPuppy = new Dog(4);
        Pet twoYearOldKitten = new Cat(2);
        Pet[] pets = { oneYearOldPuppy, twoYearOldKitten };
        PetOwner po = new PetOwner("", oneYearOldPuppy, twoYearOldKitten);
        List<Pet> petList = Arrays.asList(po.getPets());

        // When
        // Then
        for(Pet pet : pets) {
            Assert.assertTrue(petList.contains(pet));
        }
    }
}
