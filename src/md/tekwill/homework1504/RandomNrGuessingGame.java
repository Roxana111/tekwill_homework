package md.tekwill.homework1504;

import java.util.Scanner;
import java.util.Random;

public class RandomNrGuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randomNr;
        int guess;
        do {
            System.out.println("Enter your guess between 1-50 ");
            guess = in.nextInt();
            randomNr = rand.nextInt(50);
            randomNr += 1;
            if (guess > randomNr) {
                System.out.println("Too high, try again!");
            } else if (randomNr > guess) {
                System.out.println("Too low, try again!");
            } else {
                System.out.println("You're right!");
            }

        }
        while (guess != randomNr);
    }
}
