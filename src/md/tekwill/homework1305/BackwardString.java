package md.tekwill.homework1305;

import java.util.Scanner;

public class BackwardString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String sentence = in.nextLine();
        reverse(sentence);
    }

    public static void reverse(String string) {
        System.out.println("Reversed string: ");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(string.length() - 1 - i));
        }

    }
}
