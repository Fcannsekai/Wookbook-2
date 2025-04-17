
package org.example;

import java.util.Scanner;

public class HighScoreCalculator {

    Scanner scanner = new Scanner(System.in);

    private String input;
    private String teamOneName;
    private String teamTwoName;
    private int teamOneScore;
    private int teamTwoScore;

    // Getters and Setters are optional for this but im going to get in the practice of using them.
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getTeamOneName() {
        return teamOneName;
    }

    public void setTeamOneName(String teamOneName) {
        this.teamOneName = teamOneName;
    }

    public String getTeamTwoName() {
        return teamTwoName;
    }

    public void setTeamTwoName(String teamTwoName) {
        this.teamTwoName = teamTwoName;
    }

    public int getTeamOneScore() {
        return teamOneScore;
    }

    public void setTeamOneScore(int teamOneScore) {
        this.teamOneScore = teamOneScore;
    }

    public int getTeamTwoScore() {
        return teamTwoScore;
    }

    public void setTeamTwoScore(int teamTwoScore) {
        this.teamTwoScore = teamTwoScore;
    }

    public void promptUserInput() {
        System.out.println("Enter team names and team scores EX: Mavericks:Kings|121:109");
        this.input = scanner.nextLine();
    }

    public void parseInput() {
        if (input == null || input.isEmpty()) {
            System.out.println("No input provided.");
            return;
        }

        String[] parts = input.split("\\|");
        if (parts.length != 2) {
            System.out.println("Invalid format. Use TeamOne:TeamTwo|ScoreOne:ScoreTwo");
            return;
        }

        String[] teams = parts[0].split(":");
        if (teams.length != 2) {
            System.out.println("Invalid team format.");
            return;
        }

        this.teamOneName = teams[0];
        this.teamTwoName = teams[1];

        String[] scores = parts[1].split(":");
        if (scores.length != 2) {
            System.out.println("Invalid score format.");
            return;
        }

        try {
            this.teamOneScore = Integer.parseInt(scores[0]);
            this.teamTwoScore = Integer.parseInt(scores[1]);
        } catch (NumberFormatException e) {
            System.out.println("Scores must be valid integers.");
        }
    }


    public void printWinner() {
        System.out.println();    // this code here should print out the results

        if (teamOneScore > teamTwoScore) {
            System.out.println("Winner: " + teamOneName);
        } else if (teamTwoScore > teamOneScore) {
            System.out.println("Winner: " + teamTwoName);
        } else {
            System.out.println("It's a tie between " + teamOneName + " and " + teamTwoName);
        }
    }
}