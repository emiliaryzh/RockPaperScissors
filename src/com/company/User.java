package com.company;


import java.util.Scanner;

public class User {
    private Scanner inputScanner;

    public User() {
        inputScanner = new Scanner(System.in);
    }

    public Move getMove() {
        System.out.println("Rock Paper Scissors?");
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        Move input = Move.valueOf(userInput.toUpperCase());

        switch (input) {
            case ROCK:
                return Move.ROCK;
            case SCISSORS:
                return Move.SCISSORS;
            case PAPER:
                return Move.PAPER;

        }


        return getMove();

    }

    public boolean playAgain() {
        System.out.println("Wanna play again?");
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.equalsIgnoreCase("yes");
    }
}
