package md.tekwill.homework3003;

import java.util.Scanner;

public class MonthAndDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input month number: ");
        int month = in.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Total number of days = 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Total number of days = 30");
                break;
            case 2:
                System.out.print("Total number of days is 29 or 28");
                break;
            default:
                System.out.print("Invalid input! Please enter month number from 1-12");
                break;

        }

    }
}
