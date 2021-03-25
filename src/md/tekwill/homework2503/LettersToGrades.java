package md.tekwill.homework2503;

import java.util.Scanner;

public class LettersToGrades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letter = in.nextLine();
        int number;
        if (letter.equalsIgnoreCase("A")){
            number = 4;
            System.out.println("The numeric value for grade " + letter + " is " + number);
        } else if (letter.equalsIgnoreCase("B")) {
            number = 3;
            System.out.println("The numeric value for grade " + letter + " is " + number);
        } else if (letter.equalsIgnoreCase("C")) {
            number = 2;
            System.out.println("The numeric value for grade " + letter + " is " + number);
        } else if (letter.equalsIgnoreCase("D")) {
            number = 1;
            System.out.println("The numeric value for grade " + letter + " is " + number);
        } else if (letter.equalsIgnoreCase("F")) {
            number = 0;
            System.out.println("The numeric value for grade " + letter + " is " + number);
        } else {
            System.out.println(letter + " is an invalid grade");
        }
    }
}