package md.tekwill.homework1305;

import java.util.Scanner;

public class SentenceCapitalizer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String sentence = in.nextLine();
        String capitalizedSentence = "";
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (i == 0 || (i >= 2 && isPreviousCharacterASentenceEnder(sentence, i))) {
                capitalizedSentence += Character.toUpperCase(c);
            } else {
                capitalizedSentence += c;
            }
        }
        System.out.println(capitalizedSentence);

    }

    private static boolean isPreviousCharacterASentenceEnder(String sentence, int i) {
        boolean twoCharsBehindIsEndingSentence = sentence.charAt(i - 2) == '.'
                || sentence.charAt(i - 2) == '!'
                || sentence.charAt(i - 2) == '?';
        boolean previousCharIsEndingSentence = sentence.charAt(i - 1) == '.'
                || sentence.charAt(i - 1) == '!'
                || sentence.charAt(i - 1) == '?';
        boolean previousCharIsNotALetter = !Character.isLetter(sentence.charAt(i - 1));
        return (twoCharsBehindIsEndingSentence && previousCharIsNotALetter) || previousCharIsEndingSentence;

    }

}



