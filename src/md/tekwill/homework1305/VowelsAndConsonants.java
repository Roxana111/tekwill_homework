package md.tekwill.homework1305;


import java.util.Scanner;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        VowelsAndConsonants.run();
    }


    public static void run() {

        boolean x = false;
        do {
            System.out.println("a. Count the numbers of vowels in the string");
            System.out.println("b. Count the number of consonants in the string ");
            System.out.println("c. Count both the vowels and consonants: ");
            System.out.println("d. Enter another string: ");
            System.out.println("e. Exit the program ");
            Scanner in = new Scanner(System.in);
            String sentence = in.nextLine();
            switch (sentence.toLowerCase()) {

                case "a":

                    System.out.println("Enter the string: ");
                    String string1 = in.nextLine();
                    System.out.println("number of vowels:" + vowelCount(string1));
                    break;
                case "b":
                    System.out.println("Enter the string: ");
                    String string2 = in.nextLine();
                    System.out.println("number of consonants:" + consonantCount(string2));
                    break;
                case "c":
                    System.out.println("Enter the string: ");
                    String string3 = in.nextLine();
                    System.out.println("number of consonants:" + consonantCount(string3) + "\n number of vowels:" + vowelCount(string3));
                    break;
                case "d":
                    in.nextLine();
                    break;
                case "e":
                    x = true;
                    break;
                default:
                    System.out.println("please enter \"a\",\"b\",\"c\",\"d\" or \"e\"");
                    break;
            }
        } while (!x);
    }

    public static int vowelCount(String str) {
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O' || ch == 'U' || ch == 'u') {
                vowels++;
            }
        }
        return vowels;
    }

    public static int consonantCount(String str) {
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O' || ch == 'U' || ch == 'u') {
                System.out.println("");
            } else if (ch != ' ') {
                consonants++;
            }
        }
        return consonants;
    }

}