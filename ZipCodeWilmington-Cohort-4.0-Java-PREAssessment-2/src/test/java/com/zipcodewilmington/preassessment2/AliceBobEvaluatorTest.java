package com.zipcodewilmington.preassessment2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 3/3/18.
 */
public class AliceBobEvaluatorTest {
    @Test
    public void testLeon() {
        // Given
        String input = "Leon";
        AliceBobEvaluator abc = new AliceBobEvaluator(input);

        // When
        boolean isAlice = abc.isAlice();
        boolean isBob = abc.isBob();

        // Then
        Assert.assertFalse(isAlice);
        Assert.assertFalse(isBob);
    }

    @Test
    public void testWilhem() {
        // Given
        String input = "Tariq";
        AliceBobEvaluator abc = new AliceBobEvaluator(input);

        // When
        boolean isAlice = abc.isAlice();
        boolean isBob = abc.isBob();

        // Then
        Assert.assertFalse(isAlice);
        Assert.assertFalse(isBob);
    }

    @Test
    public void testBob() {
        // Given
        String input = "Bob";
        AliceBobEvaluator abc = new AliceBobEvaluator(input);

        // When
        boolean isAlice = abc.isAlice();
        boolean isBob = abc.isBob();

        // Then
        Assert.assertFalse(isAlice);
        Assert.assertTrue(isBob);
    }


    @Test
    public void testAlice() {
        // Given
        String input = "Alice";
        AliceBobEvaluator abc = new AliceBobEvaluator(input);

        // When
        boolean isAlice = abc.isAlice();
        boolean isBob = abc.isBob();

        // Then
        Assert.assertTrue(isAlice);
        Assert.assertFalse(isBob);
    }
}