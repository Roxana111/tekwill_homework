package md.tekwill.homework3003;

import java.util.Scanner;

public class PressedKeyDetector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input key: ");
        String key = in.nextLine();
        switch (key) {
            case "a":
                System.out.println("You pressed 'a' character");
                break;
            case "b":
                System.out.println("You pressed 'b' character");
                break;
            case "c":
                System.out.println("You pressed 'c' character");
                break;
            case "d":
                System.out.println("You pressed 'd' character");
                break;
            case "e":
                System.out.println("You pressed 'e' character");
                break;
            case "1":
                System.out.println("You pressed \"1\" ");
                break;
            case "2":
                System.out.println("You pressed \"2\" ");
                break;
            case "3":
                System.out.println("You pressed \"3\" ");
                break;
            case "4":
                System.out.println("You pressed \"4\" ");
                break;
            case "5":
                System.out.println("You pressed \"5\"");
                break;
            default:
                System.out.print("Unable to detect the pressed key! try again");
                break;
        }
    }
}
