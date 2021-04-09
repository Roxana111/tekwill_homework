package md.tekwill.homework0904;

import java.util.Scanner;

public class MaxandMinInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array: ");
        int size = in.nextInt();
        int[] myArray = new int[size];
        System.out.println("Input " + size + " elements in the array:");
        int k = 0;
        while (k < size) {
            System.out.print("element -" + k + ":");
            myArray[k] = in.nextInt();
            k++;
        }
        System.out.println("or another representation would be: ");
        for (int i = 0; i < size; i++) {

            if (i == 0) {
                System.out.print("[");
            }
            System.out.print(myArray[i]);
            if (i == size - 1) {
                System.out.print("]");
            } else {
                System.out.print(", ");
            }
        }
        int max = myArray[0];
        for (int i = 1; i < size; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        int min = myArray[0];
        for (int i = 1; i < size; i++) {
            if (min > myArray[i]) {
                min = myArray[i];
            }
        }
        System.out.print("\nMaximum element is: " + max);
        System.out.print("\nMinimum element is: " + min);
    }
}