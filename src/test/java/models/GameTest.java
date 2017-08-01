package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class GameTest {
    @Test
    public void pickWinner_shouldBeAString_true() throws Exception {
        Game testGame = new Game();
        String theWinner =  testGame.pickWinner("hello", "one");
        assertEquals(true, theWinner instanceof String);
    }
    @Test
    public void pickWinner_shouldPrintNobodyForTie_String() throws Exception {
        Game testGame = new Game();
        String theWinner =  testGame.pickWinner("hello", "hello");
        assertEquals("Nobody", theWinner);
    }
    @Test
    public void pickWinner_playerTwoWinsWithRock() throws Exception {
        Game testGame = new Game();
        String theWinner =  testGame.pickWinner("rock", "paper");
        assertEquals("Player 2 wins!", theWinner);
    }
    @Test
    public void pickWinner_playerOneWinsWithRock() throws Exception {
        Game testGame = new Game();
        String theWinner =  testGame.pickWinner("rock", "scissors");
        assertEquals("Player 1 wins!", theWinner);
    }
    @Test
    public void pickWinner_playerOneWinsScissors() throws Exception {
        Game testGame = new Game();
        String theWinner =  testGame.pickWinner("scissors", "paper");
        assertEquals("Player 1 wins!", theWinner);
    }
    @Test
    public void pickWinner_playerTwoWinsScissors() throws Exception {
        Game testGame = new Game();
        String theWinner =  testGame.pickWinner("paper", "scissors");
        assertEquals("Player 2 wins!", theWinner);
    }
    @Test
    public void pickWinner_playerOneWinsPaper() throws Exception {
        Game testGame = new Game();
        String theWinner =  testGame.pickWinner("paper", "rock");
        assertEquals("Player 1 wins!", theWinner);
    }
    @Test
    public void pickWinner_playerTwoWinsPaper() throws Exception {
        Game testGame = new Game();
        String theWinner =  testGame.pickWinner("rock", "paper");
        assertEquals("Player 2 wins!", theWinner);
    }
}