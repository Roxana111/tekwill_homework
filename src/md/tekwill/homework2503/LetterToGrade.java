package md.tekwill.homework2503;

import java.util.Scanner;

public class LetterToGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char letter = in.nextLine().charAt(0);
        int number;
        if (Character.toUpperCase(letter) == 'A') {
            number = 4;
            System.out.println("The numeric value for grade "+letter +" is " + number);
        } else if (Character.toUpperCase(letter) == 'B') {
            number = 3;
            System.out.println("The numeric value for grade "+letter +" is " + number);
        } else if (Character.toUpperCase(letter) == 'C') {
            number = 2;
            System.out.println("The numeric value for grade "+letter +" is " + number);
        } else if (Character.toUpperCase(letter) == 'D') {
            number = 1;
            System.out.println("The numeric value for grade "+letter +" is " + number);
        } else if (Character.toUpperCase(letter) == 'F') {
            number = 0;
            System.out.println("The numeric value for grade "+letter +" is " + number);
        } else {
            System.out.println(letter + " is an invalid grade");
        }

    }
}
