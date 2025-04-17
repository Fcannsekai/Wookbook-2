package org.example;

public class Main {
    public static void main(String[] args) {
        HighScoreCalculator calculator = new HighScoreCalculator();
        calculator.promptUserInput();
        calculator.parseInput();
        calculator.printWinner();
    }
}








