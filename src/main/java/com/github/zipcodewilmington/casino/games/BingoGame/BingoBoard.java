package com.github.zipcodewilmington.casino.games.BingoGame;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

// Visual of bingo board array style w/ rows and columns
// multidimensional structure - String[][] / List<List<String>>
// index     0     1    2    3    4
//   0      [B14, I13, N22, G12, O15],
//   1      [B14, I13, N22, G12, O15],
//   2      [B14, I13, N22, G12, O15],


// list structure - String[] / List<String>
// index    0    1    2    3    4
// value   [B14, I13, N22, G12, O15]

// map structure - Map<String, Boolean>  (key=string // value=boolean)
//        [        key,value      index
//                (B14,true),   - 0
//                (I13,true),   - 1
//                (N22,false),  - 2
//                (G12,true),   - 3
//                (O15,true)    - 5
//



public class BingoBoard {
    private final Map<String, Boolean> bingoValues;


    // Creating HashMap that has random values to place on bingo board
    public BingoBoard() {
        this.bingoValues = new HashMap<>();
        final String[] bingoLetters = "BINGO".split("");
        for (String letter : bingoLetters) {
            for (int i = 0; i < 5; i++) {
               String bingoValue;
               do {
                   final Integer randomValue = ThreadLocalRandom.current().nextInt(1, 75);
                   bingoValue = letter + randomValue;
               } while (bingoValues.keySet().contains(bingoValue));
               bingoValues.put(bingoValue, false);

            }
        }

    }


    // Checking to see if there is a winner in only columns or rows, no diagonal.
    public boolean isWinner() {
        final String[] bingoLetters = "BINGO".split(""); // Bingo header and it's splitting each letter to create columns
        for (int currentBingoRowIndex = 0; currentBingoRowIndex < bingoLetters.length; currentBingoRowIndex++) {
            final String letter = bingoLetters[currentBingoRowIndex];

            // Column Evaluation
            final Character currentBingoLetter = letter.charAt(0);
            final List<String> currentBingoColumn = getColumn(currentBingoLetter);
            final List<Boolean> columnValues = getValueOfKeys(currentBingoColumn);
            final int numberOfUniqueColumns = new HashSet<>(columnValues).size();
            final boolean hasCellsMarkedColumn = columnValues.get(0);
            final boolean isHomogenousColumn = numberOfUniqueColumns == 1;
            final boolean isWinningAtLeastOneColumn = isHomogenousColumn && hasCellsMarkedColumn;

            // Row Evaluation
            final List<String> currentBingoRow = getRow(currentBingoRowIndex);
            final List<Boolean> rowValues = getValueOfKeys(currentBingoRow);
            final int numberOfUniqueRowValues = new HashSet<>(rowValues).size();
            final boolean hasCellsMarkedRow = rowValues.get(0);
            final boolean isHomogenousRow = numberOfUniqueRowValues == 1;
            final boolean isWinningAtLeastOneRow = isHomogenousRow && hasCellsMarkedRow;

            // Conclusion
            final boolean isWinning = isWinningAtLeastOneColumn || isWinningAtLeastOneRow;
            if (isWinning) {
                return  true;
            }
        }
        return false;
    }
//    public List<String> getColumn(char b) {
//        return null;
//    }
//
//    public boolean isWinner() {
//        return false;
//    }
//
//    public void markBoard(String s) {
//    }
//
//    public List<String> getRow(int bingoRow) {
//        return null;
//    }
//
//    public List<List<String>> getMatrix() {
//        return null;
//    }
}
