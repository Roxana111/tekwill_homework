package md.tekwill.homework2004;

import java.util.Scanner;
import java.util.Random;

public class ESPGame {
    public static String findCompChoice(Random rand) {
        int numberColorChoice = rand.nextInt(5);
        String compChoice = "";
        if (numberColorChoice == 0) {
            compChoice = "Red";
        } else if (numberColorChoice == 1) {
            compChoice = "Green";
        } else if (numberColorChoice == 2) {
            compChoice = "Blue";
        } else if (numberColorChoice == 3) {
            compChoice = "Orange";
        } else if (numberColorChoice == 4) {
            compChoice = "Yellow";
        }

        return compChoice;
    }

    public static String finduserChoice(Scanner in) {
        System.out.println("Please enter your choice and guess the computer's color!");
        String userChoice = in.nextLine();
        return userChoice;
    }

    public static boolean colorComparison(String compChoice, String userChoice) {
        if (compChoice.equalsIgnoreCase(userChoice)) {
            return true;
        } else {
            return false;
        }
    }

    public static void findCorrectGuesses(int numberOfCorrectGuesses) {
        System.out.println("the user guessed " + numberOfCorrectGuesses + " times");
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        String compChoice;
        String userChoice;
        int numberOfCorrectGuesses = 0;


        for (int i = 1; i <= 10; i++) {
            compChoice = findCompChoice(rand);
            userChoice = finduserChoice(in);
            System.out.println("The computer chose " + compChoice);
            if (colorComparison(compChoice, userChoice)) {
                numberOfCorrectGuesses++;
            }
        }
        findCorrectGuesses(numberOfCorrectGuesses);
    }
}
