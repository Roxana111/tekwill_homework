package md.tekwill.homework2703;

import java.util.Scanner;

public class InternetServiceProvider {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the letter of the package you have purchased: ");
        String letter = in.nextLine();
        System.out.print("Enter number of hours you have used: ");
        int hours = in.nextInt();
        float bill;
        if (letter.equalsIgnoreCase("A")) {
            if (hours > 10f) {
                bill = 9.95f + 2f * (hours - 10f);
                System.out.println("Your monthly bill is: " + bill + "$");
            } else {
                bill = 9.95f;
                System.out.println("Your monthly bill is: " + bill + "$");
            }
        } else if (letter.equalsIgnoreCase("B")) {
            if (hours > 20f) {
                bill = 13.95f + (hours - 20f);
                System.out.println("Your monthly bill is: " + bill + "$");
            } else {
                bill = 13.95f;
                System.out.println("Your monthly bill is: " + bill + "$");
            }
        } else if (letter.equalsIgnoreCase("C")) {
            bill = 19.95f;
            System.out.println("Your monthly bill is: " + bill + "$");
        }
        else {
            System.out.println("Please enter the right letter of the corresponding package!");
        }
    }
}
