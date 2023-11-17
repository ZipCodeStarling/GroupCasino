package com.github.zipcodewilmington.casino.games.BlackJack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BlackJackPlayer {
    @Before
    public void Setup(){

    }

    @Test
    public void TestBlackJackDealerConstructor(){
        BlackJackDealer blackJackDealer = new BlackJackDealer();
        Assert.assertNotNull(blackJackDealer);
    }

    @Test
    public void TestIfDealerCanBetBack(){
      // I want to have the deal bet back;
        // geter and setter
        // asserted value
    }
    @Test
    public void TestDealerHandIsEmpty(){
        // want the player hand to be a private class in the Player
        // hand is a arrayList of cards that is empty,
        //im checking if the array was created and Empty

    }
}
