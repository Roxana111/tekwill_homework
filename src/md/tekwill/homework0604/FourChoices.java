package md.tekwill.homework0604;

import java.util.Scanner;

public class FourChoices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter one of the following choices\n");
        System.out.println("c)carnivore\t p)pianist\t t)tree\t  g)game\n");
        boolean x = false;
        do {

            String option = in.nextLine();
            switch (option.toLowerCase()) {
                case "c":
                    x = true;
                    System.out.println("The lion is a carnivore.");
                    break;
                case "t":
                    x = true;
                    System.out.println("A maple is a tree.");
                    break;
                case "p":
                    x = true;
                    System.out.println("Ludwig van Beethoven was one of the greatest pianists of all time.");
                    break;
                case "g":
                    x = true;
                    System.out.println("Monopoly is one of the most popular games in the world.");
                    break;
                default:
                    System.out.println("please enter \"c\",\"t\",\"p\" or \"g\"");
                    break;
            }


        } while (!x);
    }
}