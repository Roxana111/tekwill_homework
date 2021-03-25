package md.tekwill.homework2503;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 1-10 : ");
        int number = in.nextInt();
        String roman;
        if (number == 1) {
            roman = "I";
            System.out.print("Roman equivalent of " + number + " is: " + roman);
        } else if (number == 2) {
            roman = "II";
            System.out.print("Roman equivalent of " + number + " is: " + roman);
        } else if (number == 3) {
            roman = "III";
            System.out.print("Roman equivalent of " + number + " is: " + roman);
        } else if (number == 4) {
            roman = "IV";
            System.out.print("Roman equivalent of " + number + " is: " + roman);
        } else if (number == 5) {
            roman = "V";
            System.out.print("Roman equivalent of " + number + " is: " + roman);
        } else if (number == 6) {
            roman = "VI";
            System.out.print("Roman equivalent of " + number + " is: " + roman);
        } else if (number == 7) {
            roman = "VII";
            System.out.print("Roman equivalent of " + number + " is: " + roman);
        } else if (number == 8) {
            roman = "VIII";
            System.out.print("Roman equivalent of " + number + " is: " + roman);
        } else if (number == 9) {
            roman = "IX";
            System.out.print("Roman equivalent of " + number + " is: " + roman);
        } else if (number == 10) {
            roman = "X";
            System.out.print("Roman equivalent of " + number + " is: " + roman);
        } else System.out.print("Error");
    }
}
