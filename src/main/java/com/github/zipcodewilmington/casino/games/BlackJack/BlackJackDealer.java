package com.github.zipcodewilmington.casino.games.BlackJack;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.games.GameUtils.CardClass.Cards;

import java.util.ArrayList;

public class BlackJackDealer {
private int  dealerBet;
private ArrayList<Cards> dealerHand;
    public BlackJackDealer(){
        dealerHand = new ArrayList<>();


    }
public int DealerBet() {
    this.dealerBet = (int) (Math.random() * 100);
    // create a beat that random base of the player bet.
return 0;
}

    public ArrayList<Cards> getDealerHand() {
        return dealerHand;

    }

    public void addToHand(Cards cardOnTable1) {
        dealerHand.add(cardOnTable1);
    }
}



