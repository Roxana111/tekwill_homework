package md.tekwill.homework3003;

import java.util.Scanner;

public class HouseholdChores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input code: ");
        int code = in.nextInt();
        switch (code) {
            case 0:
                System.out.println("You've enabled the lights in the bathroom");
                break;
            case 1:
                System.out.println("You've disabled the lights in the bathroom");
                break;
            case 2:
                System.out.println("You've turned on the TV in the livingroom");
                break;
            case 3:
                System.out.println("You've turned off the TV in the livingroom");
                break;
            case 4:
                System.out.println("You've enabled the lights in the bedroom");
                break;
            case 5:
                System.out.println("You've disabled the lights in the bedroom");
                break;
            case 6:
                System.out.println("You've turned on the dishwasher in the kitchen");
                break;
            case 7:
                System.out.println("You've turned off the dishwasher in the kitchen");
                break;
            case 8:
                System.out.println("You've activated the house security system");
                break;
            case 9:
                System.out.println("You've deactivated the house security system");
                break;
            default:
                System.out.print("Enter an available code!");

        }
    }
}
