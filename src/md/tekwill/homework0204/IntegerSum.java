package md.tekwill.homework0204;

import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first number :");
        int a = in.nextInt();
        System.out.print("enter the second number :");
        int b = in.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.print("sum between " + a + " and " + b + " is " + sum);


    }

}
