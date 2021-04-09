package md.tekwill.homework0904;

import java.util.Scanner;

public class SumOfElementsOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array: ");
        int size = in.nextInt();
        int[] myArray = new int[size];
        int sum = 0;
        System.out.println("Input " + size + " elements in the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("element -" + i + ":");
            myArray[i] = in.nextInt();
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

        for (int number : myArray) {
            sum += number;
        }
        System.out.print("\nSum of all elements stored in the array is: " + sum);
    }

}
