package md.tekwill.homework1504;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        int[] store = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < store.length; i++) {
            System.out.print("Enter today's sales for store " + (i + 1) + " ");
            store[i] = in.nextInt();
        }
        System.out.println("\nSales Bar Chart");
        for (int i = 0; i < store.length; i++) {
            System.out.print("Store " + (i + 1));
            for (int j = 0; j < store[i] / 100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
