package md.tekwill.homework2503;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = in.nextLine().charAt(0);
        int number;
        if (letter == 'a' || letter == 'A' || letter == 'b' || letter == 'B' || letter == 'c' || letter == 'C') {
            number = 2;
            System.out.print("The corresponding number is " + number);
        } else if (letter == 'd' || letter == 'D' || letter == 'e' || letter == 'E' || letter == 'f' || letter == 'F') {
            number = 3;
            System.out.print("The corresponding number is " + number);
        } else if (letter == 'g' || letter == 'G' || letter == 'h' || letter == 'H' || letter == 'i' || letter == 'I') {
            number = 4;
            System.out.print("The corresponding number is " + number);
        } else if (letter == 'j' || letter == 'J' || letter == 'k' || letter == 'K' || letter == 'l' || letter == 'L') {
            number = 5;
            System.out.print("The corresponding number is " + number);
        } else if (letter == 'm' || letter == 'M' || letter == 'n' || letter == 'N' || letter == 'o' || letter == 'O') {
            number = 6;
            System.out.print("The corresponding number is " + number);
        } else if (letter == 'p' || letter == 'P' || letter == 'q' || letter == 'Q' || letter == 'r' || letter == 'R' ||
                letter == 's' || letter == 'S') {
            number = 7;
            System.out.print("The corresponding number is " + number);
        } else if (letter == 't' || letter == 'T' || letter == 'u' || letter == 'U' || letter == 'v' || letter == 'V') {
            number = 8;
            System.out.print("The corresponding number is " + number);
        } else if (letter == 'w' || letter == 'W' || letter == 'x' || letter == 'X' || letter == 'y' || letter == 'Y' ||
                letter == 'z' || letter == 'Z') {
            number = 9;
            System.out.print("The corresponding number is " + number);
        } else {
            System.out.println("Not an international standard letter");
        }

    }
}

