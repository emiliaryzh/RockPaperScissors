package com.company;

public class Main {
    User user;
    Computer computer;
    int userScore;
    int computerScore;
    int numberOfGames;

    public Main() {
        user = new User();
        computer = new Computer();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;


    }


    public void startGame()  {

        System.out.println("Rock, Paper, Scissors!");
        Move userMove = user.getMove();
        Move computerMove = computer.getMove();
        System.out.println("Your turn " + userMove + ".");
        System.out.println("Computer's turn " + computerMove + ".\n");

        int compareMoves = userMove.compareMoves(computerMove);

        switch (compareMoves) {
            case 0:
                System.out.println("It's a draw!");
                break;
            case 1:
                System.out.println(userMove + " beats " + computerMove + ". You won!");
                userScore++;
                break;
            case 2:
                System.out.println(computerMove + " beats " + userMove + ". You loose:(");
                computerScore++;
                break;


        }
        numberOfGames++;

        if (user.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }
    }

    public void printGameStats() {
        int wins = userScore;
        int losses = computerScore;
        int ties = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;

        System.out.print("+");
        printDashes(68);
        System.out.println("+");

        System.out.printf("| %6s | %6s | %6s | %12s | %14s |\n",
                "WINS", "LOSSES", "DRAWS", "GAMES PLAYED", "PERCENTAGE WON");

        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");

        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
                wins, losses, ties, numberOfGames, percentageWon * 100);

        System.out.print("+");
        printDashes(68);
        System.out.println("+");


    }

    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }

    public static void main(String[] args)  {
        Main game = new Main();
        game.startGame();

    }

}


