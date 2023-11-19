package com.github.zipcodewilmington.casino.games.BlackJack;


import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.games.GameUtils.CardClass.Cards;

import java.util.ArrayList;

public class BlackJackPlayer {
    private static int playerBet = 0;
    private CasinoAccount casinoAccount;

    private ArrayList<Cards> playerHand;


    public BlackJackPlayer(CasinoAccount casinoAccount) {

        this.casinoAccount = casinoAccount;
        playerHand = new ArrayList<>();
    }
    public void addToHand(Cards card){
        playerHand.add(card);
    }

    public ArrayList<Cards> getPlayerHand() {
        return playerHand;
    }

@Override
public String toString(){
        String jawn = "";

        for(Cards cards: playerHand) {
            jawn += cards.getSuit() + " "+ cards.getNumberValue().getSecondaryValue() + " ";
        }
        return jawn;
}
//    @Override
//    public CasinoAccount getArcadeAccount() {
//        return casinoAccount;
//    }
//
//    @Override
//    public <SomeReturnType> SomeReturnType play() {
//        return null;
//    }
}
