package com.github.zipcodewilmington.casino.games.GameUtils;

import java.util.Random;

public class Dice {

    private int value;
    private Random rand;

    private static final String[][] diceFace = {
            {
                    "+-------+",
                    "|       |",
                    "|   ●   |",
                    "|       |",
                    "+-------+",
            }, {
                    "+-------+",
                    "| ●     |",
                    "|       |",
                    "|     ● |",
                    "+-------+",
            }, {
                    "+-------+",
                    "| ●     |",
                    "|   ●   |",
                    "|     ● |",
                    "+-------+",
            }, {
                    "+-------+",
                    "| ●   ● |",
                    "|       |",
                    "| ●   ● |",
                    "+-------+",
            }, {
                    "+-------+",
                    "| ●   ● |",
                    "|   ●   |",
                    "| ●   ● |",
                    "+-------+",
            }, {
                    "+-------+",
                    "| ●   ● |",
                    "| ●   ● |",
                    "| ●   ● |",
                    "+-------+",
            }
};
    private String [] face;
    public Dice(){
        this.rand = new Random();
    }

    public int rollDice(){
        int value = rand.nextInt(6) + 1;
        generateDice(value);
        return getValue();
    }

    public void generateDice (int value){
        this.face = this.diceFace[value - 1];
    }
    public String[] getDice(){
        return this.face;
    }

    public int getValue(){
        return this.value;
    }
}
