package com.zipcodewilmington.preassessment2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 3/4/18.
 */
public class AliceBobEnumTest {
    @Test
    public void testAliceName() {
        // Given
        AliceBobEnum alice = AliceBobEnum.ALICE;
        String expected = "ALICE";

        // When
        String actual = alice.name();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testBobName() {
        // Given
        AliceBobEnum bob = AliceBobEnum.BOB;
        String expected = "BOB";

        // When
        String actual = bob.name();

        // Then
        Assert.assertEquals(expected, actual);
    }



  @Test
    public void testAliceCatchPhrase() {
        // Given
        AliceBobEnum alice = AliceBobEnum.ALICE;
        String expected = "Hey, my name is ALICE!";

        // When
        String actual = alice.getCatchPhrase();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testBobCatchPhrase() {
        // Given
        AliceBobEnum bob = AliceBobEnum.BOB;
        String expected = "Hey, my name is BOB!";

        // When
        String actual = bob.getCatchPhrase();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAliceIsAlice() {
        // Given
        AliceBobEnum alice = AliceBobEnum.ALICE;

        // When
        boolean outcome = alice.isAlice();

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void testAliceIsBob() {
        // Given
        AliceBobEnum alice = AliceBobEnum.ALICE;

        // When
        boolean outcome = alice.isBob();

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void testBobIsBob() {
        // Given
        AliceBobEnum bob = AliceBobEnum.BOB;

        // When
        boolean outcome = bob.isBob();

        // Then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testBobIsAlice() {
        // Given
        AliceBobEnum bob = AliceBobEnum.BOB;

        // When
        boolean outcome = bob.isAlice();

        // Then
        Assert.assertFalse(outcome);
    }


}
