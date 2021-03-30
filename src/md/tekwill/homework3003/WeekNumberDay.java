package md.tekwill.homework3003;

import java.util.Scanner;

public class WeekNumberDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input week number(1-7): ");
        int number = in.nextInt();
        switch (number) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Input a valid weekday number!");
                break;
        }
    }
}
