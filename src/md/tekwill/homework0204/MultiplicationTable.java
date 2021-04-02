package md.tekwill.homework0204;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter the range up to which you want to display the multiplication table: ");
        int b = in.nextInt();
        int i;
        for (i = 1; i <= b; i++) {


            System.out.println(a + " x " + i + " = " + a * i);
        }
    }
}
