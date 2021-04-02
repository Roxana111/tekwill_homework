package md.tekwill.homework0204;

import java.util.Scanner;

public class EntryCummulativeSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int entrynumber = in.nextInt();
        int sum = 0;
        for (; entrynumber != 0; ) {
            sum += entrynumber;
            System.out.print("Total sum is : " + sum);
            System.out.print("\nenter another number");
            entrynumber = in.nextInt();
        }
    }
}
