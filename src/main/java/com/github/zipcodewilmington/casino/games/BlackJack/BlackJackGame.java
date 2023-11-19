package com.github.zipcodewilmington.casino.games.BlackJack;
import com.github.zipcodewilmington.casino.games.GameUtils.CardClass.Cards;
import com.github.zipcodewilmington.casino.games.GameUtils.CardClass.Deck;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackGame {
    private BlackJackPlayer  blackjackplayer;
    private BlackJackDealer blackJackDealer;
    private Deck deck;
private Scanner scanner;

    public BlackJackGame(BlackJackPlayer blackJackPlayer){
    this.blackjackplayer = blackJackPlayer;
        blackJackDealer = new BlackJackDealer();
        scanner = new Scanner(System.in);
    }

    public BlackJackDealer getBlackJackDealer() {
        return blackJackDealer;
    }

    private int blackJackPot;
    public void bet(int playerbet){

        blackJackPot += playerbet;
    }


    public int getBlackJackPot() { //geting
        return blackJackPot;
    }

    public void init() {
        deck = new Deck();
        deck.shuffle();

        Cards cardOnTable = deck.draw();
        blackjackplayer.addToHand(cardOnTable);

        Cards cardOnTable1 = deck.draw();
        blackJackDealer.addToHand(cardOnTable1);

        Cards cardOnTable2 = deck.draw();
        blackJackDealer.addToHand(cardOnTable2);

        Cards cardOnTable3 = deck.draw();
        blackjackplayer.addToHand(cardOnTable3);
    }

    public String compareHand(ArrayList<Cards>   playerHand, ArrayList<Cards> dealerHand) {
        int playerHandValue = 0;
        int dealerHandValue = 0;
        for (Cards card : playerHand) {// playerhand [obj's] .number.secondaryValue add up
            playerHandValue += card.getNumberValue().getSecondaryValue();
        }

        for (Cards card : dealerHand) {// dealerhand [obj's] .number.secondaryValue add up
            dealerHandValue += card.getNumberValue().getSecondaryValue();
        }

        if (playerHandValue > dealerHandValue) {// their number value compared in int
          // System.out.println( " P hand" + playerHandValue + "d hand " + dealerHandValue );
            return "player Wins";
        } else if (playerHandValue < dealerHandValue) {
           // System.out.println( " P hand" + playerHandValue + "d hand " + dealerHandValue );
            return "Dealer Wins";
        } else {
            //System.out.println( " P hand" + playerHandValue + "d hand " + dealerHandValue );
            return "tie game";
            // higher number wins.
        }
    }
    public void playRound(){
        System.out.println(" Welcome to Black Jack ");
        init();// start of the game
        System.out.println("here you hand Player!\n" +blackjackplayer.toString());

        System.out.println(" please Enter your Bet Here:");
        int playerBet = scanner.nextInt();
        bet( playerBet);

        System.out.println(compareHand(blackjackplayer.getPlayerHand(),blackJackDealer.getDealerHand()));

    }
}

