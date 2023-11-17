package com.github.zipcodewilmington.casino.games.BlackJack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackPlayerTest {
@Before// to set up all my test methods once done writing my test,
public void setup() {

    //do Stuff
}

    @Test
    public void TestBlackPlayerConstructor(){
        BlackJackPlayer blackJackPlayer = new BlackJackPlayer();

        Assert.assertNotNull(blackJackPlayer);
    }

    @Test
    public void TestIfThePlayerCanBet(){
    // I want to have the player bet
        // getter & Setter
        // assert expected value.
        // assert that the bet is coming back ass expected.
    }

    @Test
    public void testingIfPlayerHandIEmpty(){
    // want the player hand to be a private class in the Player
    // hand is a arrayList of cards that is empty,
    //im checking if the array was created and Empty
    }

}