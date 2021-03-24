package md.tekwill.homework2503;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Input number: ");
        float number = in.nextFloat();
        if (number > 0.0F) {
            System.out.print(number + " is positive");
        }
        else if (number < 0.0F) {
            System.out.println(number + " is negative");
        }
        else
            System.out.println(number + " is equal to 0");
        }

}