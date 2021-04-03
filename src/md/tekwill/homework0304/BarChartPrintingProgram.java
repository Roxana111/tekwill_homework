package md.tekwill.homework0304;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        System.out.print("\nEnter an integer between 1-30: ");
        int number1 = in.nextInt();
        System.out.print("\nEnter an integer between 1-30: ");
        int number2 = in.nextInt();
        System.out.print("\nEnter an integer between 1-30: ");
        int number3 = in.nextInt();
        System.out.print("\nEnter an integer between 1-30: ");
        int number4 = in.nextInt();
        System.out.print("\nEnter an integer between 1-30: ");
        int number5 = in.nextInt();

        if (number1 >= 1 && number1 <= 30) {
            for (int i = 1; i <= number1; i++) {
                System.out.print("*");
            }
            System.out.println();
        } else {
            System.out.println("out of limits");
        }

        if (number2 >= 1 && number2 <= 30) {
            for (int i = 1; i <= number2; i++) {
                System.out.print("*");
            }
            System.out.println();
        } else {
            System.out.println("out of limits");
        }

        if (number3 >= 1 && number3 <= 30) {
            for (int i = 1; i <= number3; i++) {
                System.out.print("*");
            }
            System.out.println();
        } else {
            System.out.println("out of limits");
        }

        if (number4 >= 1 && number4 <= 30) {
            for (int i = 1; i <= number4; i++) {
                System.out.print("*");
            }
            System.out.println();
        } else {
            System.out.println("out of limits");
        }

        if (number5 >= 1 && number5 <= 30) {
            for (int i = 1; i <= number5; i++) {
                System.out.print("*");
            }
            System.out.println();
        } else {
            System.out.println("out of limits");
        }
    }
}
