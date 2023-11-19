package com.github.zipcodewilmington.casino.games.BlackJack;


import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.games.GameUtils.CardClass.Cards;
import com.github.zipcodewilmington.casino.games.GameUtils.CardClass.NumberValue;
import com.github.zipcodewilmington.casino.games.GameUtils.CardClass.Suit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BlackJackGameTest {
   private int playerBet;
private BlackJackGame blackJackGame;
private BlackJackPlayer blackJackPlayer;
private CasinoAccount casinoAccount;
;
@Before
public void setup(){
    casinoAccount =new CasinoAccount(null, null,0);
    blackJackPlayer = new BlackJackPlayer(casinoAccount);
    blackJackGame = new BlackJackGame(blackJackPlayer);

}
    @Test
    public void testIfThePlayerBet100PotIncressBy100() {

        playerBet = 100; // I want to bet



         blackJackGame.bet(playerBet); // the instance.method( what you calling on)
        int actual = blackJackGame.getBlackJackPot();
        int expected = 100;
        Assert.assertEquals(expected, actual);// assert that the bet is coming back ass expected.
    }
    @Test
    public void testIfThePlayerBet500PotIncressBy500() {


        playerBet = 500; // I want to bet



        blackJackGame.bet(playerBet); // the instance.method( what you calling on)
        int actual = blackJackGame.getBlackJackPot();
        int expected = 500;
        Assert.assertEquals(expected, actual);// assert that the bet is coming back ass expected.
    }
     @Test
    public void testIntPlayerGetsTwoCards(){

        blackJackGame.init();// init method
        int actual = blackJackPlayer.getPlayerHand().size();
        int expected = 2;
        Assert.assertEquals(expected , actual);

     }
    @Test
    public void testIntdealerGetsTwoCards(){

        blackJackGame.init();// init method
        int actual = blackJackGame.getBlackJackDealer().getDealerHand().size();
        int expected = 2;
        Assert.assertEquals(expected , actual);

    }
@Test
    public void playerWiningHand(){
    ArrayList<Cards> a = new ArrayList<>();
    ArrayList<Cards> b = new ArrayList<>();

    Cards card1 = new  Cards  (Suit.HEARTS, NumberValue.EIGHT);
    Cards card2 = new  Cards (Suit.CLUBS, NumberValue.EIGHT);
    a.add(card1);
    a.add(card2);
    Cards card3 = new Cards( Suit.SPADES, NumberValue.THREE);
    Cards card4 = new Cards( Suit.DIAMONDS, NumberValue.TWO);
    b.add(card3);
    b.add(card4);

    String actual = blackJackGame.compareHand(a,b);
    String expected = "player Wins";
    Assert.assertEquals(expected,actual);
}

    @Test
    public void dealerWiningHand(){
        ArrayList<Cards> a = new ArrayList<>();
        ArrayList<Cards> b = new ArrayList<>();

        Cards card1 = new  Cards  (Suit.HEARTS, NumberValue.EIGHT);
        Cards card2 = new  Cards (Suit.CLUBS, NumberValue.EIGHT);
        a.add(card1);
        a.add(card2);
        Cards card3 = new Cards( Suit.SPADES, NumberValue.JACK);
        Cards card4 = new Cards( Suit.DIAMONDS, NumberValue.ACE);
        b.add(card3);
        b.add(card4);

        String actual = blackJackGame.compareHand(a,b);
        String expected = "Dealer Wins";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void tieHand(){
        ArrayList<Cards> a = new ArrayList<>();
        ArrayList<Cards> b = new ArrayList<>();

        Cards card1 = new  Cards  (Suit.HEARTS, NumberValue.ACE);
        Cards card2 = new  Cards (Suit.CLUBS, NumberValue.JACK);
        a.add(card1);
        a.add(card2);
        Cards card3 = new Cards( Suit.SPADES, NumberValue.JACK);
        Cards card4 = new Cards( Suit.DIAMONDS, NumberValue.ACE);
        b.add(card3);
        b.add(card4);

        String actual = blackJackGame.compareHand(a,b);
        String expected = "tie game";
        Assert.assertEquals(expected,actual);
    }



}
//
//
//    @Test
//    public void testHitMethod(){
//
//      Deck deck = new Deck();//new item add to array
//        HitMethod();// draw (pop) the card of the deck
//        int deckStart = deck.size();// test if card been taken from the deck.
//
//        int deckAfterHitMethod = deckStart -1;// deck after hit(Draw (pop))
//
//        int actual = 0;
//
//        int expected =deckAfterHitMethod;
//
//        assertEquals( expected, actual);
//    }
//
//    @Test
//    public void testStandMethod(){
//        StandMethod();
//        ArrayList thierHand = playerHand || dealerHand;
//        int startingSize = thierHand.size();
//        int handSize = thierHand.size(); // checking if card add to plaver hand
//        int excepted = startingSize;
//
//
//        Assert.assertEquals(handSize,excepted); // checking that we get two cards when the game start.
//        // skip your turn.
//     // check for no change in
//     //deck size And the player hand.
//    }
//
//    @Test
//    public void TestaddOneCardToAHand(){
//        addOneCardToDealerHand();
//        ArrayList <Cards> dealerHand;
//        int startingSize = dealerHand.size();
//        int actual; // checking if card add to plaver hand
//        int excepted = startingSize +1;
//
//
//        Assert.assertEquals(actual,excepted);  // checking that we get two cards when the game start.
//    }
//
//    @Test
//    public void TestaddOneCardToPlayerHand(){
//        addOneCardToPlayerHand();
//        ArrayList <Cards> playerHand;
//        int startingSize = playerHand.size();
//        int actual= 0; // checking if card add to plaver hand
//        int excepted = startingSize +1;
//
//
//        Assert.assertEquals(actual,excepted); // checking that we get two cards when the game start.
//    }
//
//    @Test
//    public void TestIfPlayerHandBust(){
//        PlayerHandBust();
//        Cards card1 = new Cards(Suit.DIAMONDS, NumberValue.EIGHT);
//        Cards card2 = new Cards(Suit.CLUBS, NumberValue.SEVEN);
//        Cards card3 = new Cards(Suit.SPADES, NumberValue.SIX);
//        Cards card4 = new Cards(Suit.HEARTS, NumberValue.KING);
//        // who lost
//        ArrayList <Cards>  playerHand.add(card2 , card4, card3 , card1);
//        int Bust = playerHandValue > 21;
//        actual;
//        excepted = playerHand;
//        Assert.assertEquals(actual,excepted);
//        // if someone is over 21.
//
//    }
//    @Test
//    public void TestIfDealerHandBust(){
//        DealerHandBust();
//        Cards card1 = new Cards(Suit.DIAMONDS, NumberValue.TWO);
//        Cards card3 = new Cards(Suit.SPADES, NumberValue.QUEEN);
//        Cards card4 = new Cards(Suit.HEARTS, NumberValue.KING);
//        // who lost
//        ArrayList <Cards>  dealerHand.add(card3 , card1, card4);
//
//        int Bust = dealerHandValue > 21;
//        actual;
//        excepted = dealerHand;
//                Assert.assertEquals(actual,excepted);
//        // if someone is over 21.
//
//    }
//    @Test
//    public void TestPlayerWinner(){
//        PlayerWinner();
//        Cards card1 = new Cards(Suit.DIAMONDS, NumberValue.TWO);
//        Cards card2 = new Cards(Suit.CLUBS, NumberValue.KING);
//        Cards card3 = new Cards(Suit.SPADES, NumberValue.THREE);
//        Cards card4 = new Cards(Suit.HEARTS, NumberValue.QUEEN);
//        // who lost
//        ArrayList <Cards>  dealerHand.add(card3 , card1);
//        ArrayList <Cards>  playerHand.add(card2 , card4);
//        playerWinnerHand = playerHandValue <= 21 && playerHandValue > lowestHandValue;
//        actual;
//        expected = playerWinnerHand;
//        Assert.assertTrue(playerWinnerHand);
//    }
//    @Test
//    public void TestPlayerLost(){
//        PlayerLost();
//        Cards card1 = new Cards(Suit.DIAMONDS, NumberValue.SEVEN);
//        Cards card2 = new Cards(Suit.CLUBS, NumberValue.FIVE);
//        Cards card3 = new Cards(Suit.SPADES, NumberValue.JACK);
//        Cards card4 = new Cards(Suit.HEARTS, NumberValue.KING);
//        // who lost
//        ArrayList <Cards>  dealerHand.add(card3 , card1);
//        ArrayList <Cards>  playerHand.add(card2 , card4);
//        int      dealerWinnerHand = dealerHandValue <=  21 && dealerHandValue > lowestHandValue;
//       int actual;
//       int expected = dealerWinnerHand;
//        Assert.assertTrue(dealerWinnerHand);
//
//    }
//    @Test
//    public void IestPlayerLost(){
//        PlayerLost();// who lost
//        Cards card1 = new Cards(Suit.DIAMONDS, NumberValue.FOUR);
//        Cards card2 = new Cards(Suit.CLUBS, NumberValue.KING);
//        Cards card3 = new Cards(Suit.SPADES, NumberValue.THREE);
//        Cards card4 = new Cards(Suit.HEARTS, NumberValue.TWO);
//        // who lost
//        ArrayList <Cards>  dealerHand.add(card3 , card2);
//        ArrayList <Cards>  playerHand.add(card1 , card4);
//       int playerHandValue = lowestHandValue || bust;
//        int actual;
//        int expected = playerLostHand;
//        Assert.assertTrue(playerLostHand);
//    }
//    public void IestDealerLost(){
//        Cards card1 = new Cards(Suit.DIAMONDS, NumberValue.TWO);
//        Cards card2 = new Cards(Suit.CLUBS, NumberValue.KING);
//        Cards card3 = new Cards(Suit.SPADES, NumberValue.THREE);
//        Cards card4 = new Cards(Suit.HEARTS, NumberValue.KING);
//        // who lost
//        ArrayList <Cards>  dealerHand.add(card3 , card1);
//        ArrayList <Cards>  playerHand.add(card2 , card4);
//     int   dealerHandValue = lowestHandValue || bust;
//        DealerLost();
//       int actual;
//       int expected = dealerLostHand;
//        Assert.assertTrue(dealerLostHand);
//    }
//@Test
//public void TestIfItsATieGame(){
//        // if hands value is equal to each other.
//    Cards card1 = new Cards(Suit.DIAMONDS, NumberValue.ACE);
//    Cards card2 = new Cards(Suit.DIAMONDS, NumberValue.KING);
//    Cards card3 = new Cards(Suit.SPADES, NumberValue.ACE);
//    Cards card4 = new Cards(Suit.SPADES, NumberValue.KING);
//
//    ArrayList <Cards>  dealerHand.add(card1 ,card2);
//    ArrayList <Cards> playerHand.add(card3 , card4);
//tieGame();
//    int TieValue =  dealerHandValue = playerHandValue ;
//
//    Assert.assertTrue(TieValue);
//
//    }
//
//    @test
//    public void testTheAceValueIfItOne(){
//        Cards card1 = new Cards(Suit.DIAMONDS, NumberValue.ACE);
//        Cards card2 = new Cards(Suit.CLUBS, NumberValue.KING);
//        Cards card4 = new Cards(Suit.HEARTS, NumberValue.KING);
//
//        ArrayList <Cards> dealerHand.add( card1 ,card2, card4);
//        aceValue();
//        int actual = 0;
//        int expcted= 1;
//        assertEquals(expcted, actual);
//    }
//
//    @test
//    public void testTheAceValueIfItOne(){
//        Cards card1 = new Cards(Suit.DIAMONDS, NumberValue.ACE);
//        Cards card2 = new Cards(Suit.CLUBS, NumberValue.KING);
//
//        ArrayList <Cards>  dealerHand.add( card1 ,card2);
//        aceValue();
//        int actual = 0;
//        int expcted= 11;
//        assertEquals(expcted, actual);
//    }
//
//}
