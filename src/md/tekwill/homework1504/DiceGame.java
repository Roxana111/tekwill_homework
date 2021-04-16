package md.tekwill.homework1504;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int totalNrOfTurns = 10;
        int compDie;
        int userDie;
        int compScore = 0;
        int userScore = 0;
        for (int i = 1; i <= totalNrOfTurns; i++) {
            compDie = rand.nextInt(6) + 1;
            userDie = rand.nextInt(6) + 1;
            if (compDie > userDie) {
                compScore++;
                System.out.println("Computer won turn number " + i);
            } else if (userDie > compDie) {
                userScore++;
                System.out.println("User won turn number " + i);
            } else {
                System.out.println("Turn number " + i + " is a tie!");
            }
        }
        if (compScore > userScore) {
            System.out.println("The Computer is the grand winner. " + compScore + " turns won out of " + totalNrOfTurns);
        } else if (compScore < userScore) {
            System.out.println("The user is the grand winner. " + userScore + " turns won out of " + totalNrOfTurns);
        } else if (compScore == userScore) {
            System.out.println("It's a tie! The computer won " + compScore + "and the user won " + userScore);
        }
    }
}
