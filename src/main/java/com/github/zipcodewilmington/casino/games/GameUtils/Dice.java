package com.github.zipcodewilmington.casino.games.GameUtils;

import java.util.Random;

public class Dice {

    private int value;
    private Random rand;

    private static final String[][] diceFace = {};

    public Dice(){
        this.rand = new Random();
    }

    public int rollDice(){
        int value = rand.nextInt(6) + 1;
        return getValue();
    }

    public int getValue(){
        return this.value;
    }
}
