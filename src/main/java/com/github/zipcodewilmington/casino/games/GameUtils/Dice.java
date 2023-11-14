package com.github.zipcodewilmington.casino.games.GameUtils;

import java.util.Random;

public class Dice {

    private int value1;
    private int value2;
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
    private String [] face1;
    private String [] face2;
    public Dice(){
        this.rand = new Random();
        this.value1 = 0;
        this.value2 = 0;
        this.face1 = diceFace[0];
        this.face2 = diceFace[0];
    }

    public int rollDice(){
        int value1 = rand.nextInt(6) + 1;
        generateDice(value1);
        return value1;
    }
    public int rollTwoDice(){
        int value1 = rand.nextInt(6) + 1;
        int value2 = rand.nextInt(6) + 1;
        generateDice(value1);
        generateDice(value2);
        return value1 + value2;
    }

    public void generateDice (int value){
        face1 = diceFace[value - 1];
        face2 = diceFace[value - 1];
    }

    public int getValue(){
        return this.value1;
    }
    public int getValue2(){
        return this.value2;
    }
}
