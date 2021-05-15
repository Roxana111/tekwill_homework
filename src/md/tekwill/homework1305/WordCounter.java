package md.tekwill.homework1305;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String sentence = in.nextLine();
        System.out.print("Word count: " + wordCount(sentence));
    }

    public static int wordCount(String string) {
        int count = 1;
        for (int i = 0; i < string.length(); i++) {
            if ((string.charAt(i) == ' ') && (string.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        return count;


    }
}
