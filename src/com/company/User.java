package com.company;


import java.util.Scanner;

public class User {
    private Scanner inputScanner;

    public User() {
        inputScanner = new Scanner(System.in);
    }

    public Move getMove() throws IllegalArgumentException {

        System.out.println("Rock Paper Scissors?");
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        {
            try {
                Move input = Move.valueOf(userInput.toUpperCase());
                switch (input) {

                    case ROCK:
                        return Move.ROCK;
                    case SCISSORS:
                        return Move.SCISSORS;
                    case PAPER:
                        return Move.PAPER;

                }

                throw new IllegalArgumentException();

            } catch (IllegalArgumentException e) {
                System.out.println("Oopsie, try another one, пацан!");

            }
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
