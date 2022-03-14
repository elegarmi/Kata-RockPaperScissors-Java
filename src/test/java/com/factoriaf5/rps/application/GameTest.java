package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import com.factoriaf5.rps.models.*;

import org.junit.Test;

public class GameTest {
    
    @Test
    public void justASimpleTest() {
        assertTrue(true);
    }

    @Test
    public void isRock() {
        // Given
        Rock rock = new Rock();
        String expected = "Rock";

        // When
        String rockName = rock.getName();

        // Then
        assertEquals(expected, rockName);
    }

    @Test
    public void isPaper() {
        // Given
        Paper paper = new Paper();
        String expected = "Paper";

        // When
        String paperName = paper.getName();

        // Then
        assertEquals(expected, paperName);
    }

    @Test
    public void isScissors() {
        // Given
        Scissors scissors = new Scissors();
        String expected = "Scissors";

        // When
        String scissorsName = scissors.getName();

        // Then
        assertEquals(expected, scissorsName);
    }

    @Test
    public void test_paper_wins_rock() {
        // Given
        Game game = new Game();
        Paper element1 = new Paper();
        Rock element2 = new Rock();
        String expected = element1.getName() + " wins";

        // When
        String actual = game.play(element1.getName(), element2.getName());

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test_rock_wins_scissors() {
        // Given
        Game game = new Game();
        Rock element1 = new Rock();
        Scissors element2 = new Scissors();
        String expected = element1.getName() + " wins";

        // When
        
        String actual = game.play(element1.getName(), element2.getName());

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test_scissors_wins_paper() {
        Game game = new Game();
        Scissors element1 = new Scissors();
        Paper element2 = new Paper();
        String expected = element1.getName() + " wins";

        // When
        String actual = game.play(element1.getName(), element2.getName());

        // Then
        assertEquals(expected, actual);
    }
}
