package com.zipcodewilmington;

import com.zipcodewilmington.exceptions.InvalidPhoneNumberFormatException;
import com.zipcodewilmington.phone.PhoneNumber;
import com.zipcodewilmington.phone.PhoneNumberFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by leon on 5/9/17.
 */
public class PhoneNumberFactoryTest {

    @Test(expected = InvalidPhoneNumberFormatException.class)
    public void testInvalidPhoneNumberFormatException() throws InvalidPhoneNumberFormatException {
        PhoneNumberFactory.createPhoneNumber("-1");
    }

    @Test
    public void testCreatePhoneNumberSafely() {
        // : Given
        int areaCode = 0;
        int centralOfficeCode = 0;
        int phoneLineCode = 0;

        // : When
        PhoneNumber phoneNumber = PhoneNumberFactory.createPhoneNumberSafely(areaCode, centralOfficeCode, phoneLineCode);

        // : Then
        Assert.assertEquals(null, phoneNumber);
    }

    @Test
    public void testGetAreaCode() {
        // : Given
        Integer areaCode = 302;
        int centralOfficeCode = 312;
        int phoneLineCode = 5555;

        // : When
        PhoneNumber phoneNumber = PhoneNumberFactory.createPhoneNumberSafely(areaCode, centralOfficeCode, phoneLineCode);

        // : Then
        Assert.assertEquals(phoneNumber.getAreaCode(), areaCode.toString());
    }

    @Test
    public void testGetCentralOfficeCode() {
        // : Given
        int areaCode = 302;
        Integer centralOfficeCode = 312;
        int phoneLineCode = 5555;

        // : When
        PhoneNumber phoneNumber = PhoneNumberFactory.createPhoneNumberSafely(areaCode, centralOfficeCode, phoneLineCode);

        // : Then
        Assert.assertEquals(phoneNumber.getCentralOfficeCode(), centralOfficeCode.toString());
    }


    @Test
    public void testPhoneLineCode() {
        // : Given
        int areaCode = 302;
        int centralOfficeCode = 312;
        Integer phoneLineCode = 5555;

        // : When
        PhoneNumber phoneNumber = PhoneNumberFactory.createPhoneNumberSafely(areaCode, centralOfficeCode, phoneLineCode);

        // : Then
        Assert.assertEquals(phoneNumber.getPhoneLineCode(), phoneLineCode.toString());
    }

    @Test
    public void testCreateRandomPhoneNumber() {
        for (int i = 0; i < 999; i++) {
            // : Given
            // : When
            PhoneNumber phoneNumber = PhoneNumberFactory.createRandomPhoneNumber();

            // : Then
            Assert.assertTrue(phoneNumber != null);
        }
    }
}