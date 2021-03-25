package md.tekwill.homework2503;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        float a = in.nextFloat();
        System.out.print("\nInput the 2nd number: ");
        float b = in.nextFloat();
        System.out.print("\nInput the 3rd number: ");
        float c = in.nextFloat();
        if (a > b && a > c) {
            System.out.println("The greatest: " + a);
        } else if (b > a && b > c) {
            System.out.println("The greatest: " + b);
        } else
            System.out.println("The greatest: " + c);

    }
}