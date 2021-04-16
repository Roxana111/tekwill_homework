package md.tekwill.homework1504;

import java.util.Scanner;

public class UpperCaseLettersCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = in.nextLine();
        int upper = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isUpperCase(sentence.charAt(i)))
                upper++;
        }
        System.out.print("The number of uppercase letters is " + upper);
    }
}
