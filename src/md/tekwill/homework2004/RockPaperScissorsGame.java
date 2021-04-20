package md.tekwill.homework2004;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static String findCompChoice(Random rand) {
        int numberWordChoice = rand.nextInt(3) + 1;
        String compChoice = "";
        if (numberWordChoice == 1) {
            compChoice = "rock";
        } else if (numberWordChoice == 2) {
            compChoice = "paper";
        } else if (numberWordChoice == 3) {
            compChoice = "scissors";
        }
        return compChoice;
    }

    public static void menu() {
        System.out.println("The choices are:\n 1.rock \n 2.paper \n 3.scissors");
    }

    public static String finduserChoice(Scanner in) {
        System.out.println("Please enter your choice!");
        String userChoice = in.nextLine();
        return userChoice;
    }

    public static String theWinneris(String compChoice, String userChoice) {
        String statement1 = "The rock smashes the scissors";
        String statement2 = "The scissors cuts the paper";
        String statement3 = "The paper wraps the rock";
        String sentence;
        String statement = "";
        String winner = "Nobody";
        if (compChoice.equals("rock") && (userChoice.equalsIgnoreCase("scissors"))) {
            winner = "Computer";
            statement = statement1;
        } else if (userChoice.equalsIgnoreCase("rock") && (compChoice.equals("scissors"))) {
            winner = "User";
            statement = statement1;
        }

        if (compChoice.equals("scissors") && (userChoice.equalsIgnoreCase("paper"))) {
            winner = "Computer";
            statement = statement2;
        } else if (userChoice.equalsIgnoreCase("scissors") && (compChoice.equals("paper"))) {
            winner = "User";
            statement = statement2;
        }

        if (compChoice.equals("paper") && (userChoice.equalsIgnoreCase("rock"))) {
            winner = "Computer";
            statement = statement3;
        } else if (userChoice.equalsIgnoreCase("paper") && (compChoice.equals("rock"))) {
            winner = "User";
            statement = statement3;
        }
        sentence = winner + " won " + statement;
        return sentence;

    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        menu();
        String compChoice = findCompChoice(rand);
        String userChoice = finduserChoice(in);
        System.out.println("The computer chose " + compChoice);
        String winner = theWinneris(compChoice, userChoice);
        System.out.println(winner);
        while (winner.equals("Nobody won ")) {
            System.out.println("It's a tie! Try again");
            menu();
            compChoice = findCompChoice(rand);
            userChoice = finduserChoice(in);
            winner = theWinneris(compChoice, userChoice);
            System.out.println("The computer chose " + compChoice);
            System.out.println(winner);
        }
    }
}
