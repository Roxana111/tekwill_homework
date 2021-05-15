package md.tekwill.homework1305;

import java.util.Scanner;

public class PasswordVerifier {
    public static void main(String[] args) {
        String string;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your password: ");
        string = in.nextLine();

        if (PasswordVerifier.validPassword(string)) {
            System.out.println("Your password is valid!");
        } else {
            System.out.println("Your password is invalid. Try again!");

        }
    }

    public static boolean validPassword(String password) {
        int passLength = 6;
        boolean valid = false;
        valid = password.length() >= passLength && containsUpperCase(password) && containsLowerCase(password) && containsDigit(password);
        return valid;
    }

    private static boolean containsUpperCase(String password) {
        boolean valid= false;
        int i = 0;
        while (i < password.length()) {
            if (Character.isUpperCase(password.charAt(i))) {
                valid = true;
                break;
            }
            i++;
        }
        return valid;

    }

    private static boolean containsLowerCase(String password) {
        boolean valid = false;
        int i = 0;
        while (i < password.length()) {
            if (Character.isLowerCase(password.charAt(i))) {
                valid = true;
                break;
            }
            i++;
        }
        return valid;
    }

    private static boolean containsDigit(String password) {
        boolean valid= false;
        int i = 0;
        while (i < password.length()) {
            if ((Character.isDigit(password.charAt(i)))) {
                valid = true;
                break;
            }
            i++;
        }
        return valid;
    }
}


