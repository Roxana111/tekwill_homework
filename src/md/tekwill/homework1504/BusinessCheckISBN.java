package md.tekwill.homework1504;

import java.util.Scanner;

public class BusinessCheckISBN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String code = in.nextLine();
        if (code.length() != 12) {
            System.out.println(code + "is an invalid input!");
        }
        int checksum = 0;
        if (code.length() == 12) {
            for (int i = 0; i < code.length(); i++) {
                if (i % 2 == 0) {
                    checksum += 3 * Integer.parseInt(String.valueOf(code.charAt(i)));
                } else {
                    checksum += Integer.parseInt(String.valueOf(code.charAt(i)));
                }
            }
            checksum = 10 - checksum % 10;
            System.out.println("The ISBN-13 number is " + code + (checksum == 10 ? 0 : checksum));
        }
    }
}
