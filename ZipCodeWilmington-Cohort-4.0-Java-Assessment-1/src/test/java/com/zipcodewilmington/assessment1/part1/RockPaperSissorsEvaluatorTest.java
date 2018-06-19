package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluatorTest {
    @Test
    public void getWinningMoveTest() {
        // Given
        String input = "rock";
        String expected = "paper";
        RockPaperSissorsEvaluator rps = new RockPaperSissorsEvaluator();

        // When
        String actual = rps.getWinningMove(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLosingMoveTest() {
        // Given
        String input = "rock";
        String expected = "scissors";
        RockPaperSissorsEvaluator rps = new RockPaperSissorsEvaluator();

        // When
        String actual = rps.getLosingMove(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWinnerTest() {
        // Given
        String input1 = "rock";
        String input2 = "scissors";
        String expected = "rock";
        RockPaperSissorsEvaluator rps = new RockPaperSissorsEvaluator();

        // When
        String actual = rps.getWinner(input1, input2);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
