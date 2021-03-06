package md.tekwill.homework0904;

import java.util.Scanner;

public class AscendingOrderArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array: ");
        int size = in.nextInt();
        int t;
        int[] myArray = new int[size];
        System.out.println("Input " + myArray.length + " elements in the array:");
        int k = 0;
        while (k < myArray.length) {
            System.out.print("element -" + k + ":");
            myArray[k] = in.nextInt();
            k++;
        }
        System.out.println("or another representation would be: ");
        for (int i = 0; i < myArray.length; i++) {

            if (i == 0) {
                System.out.print("[");
            }
            System.out.print(myArray[i]);
            if (i == myArray.length - 1) {
                System.out.print("]");
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    t = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = t;
                }
            }
        }
        System.out.print("Elements of array in ascending order: ");
        for (int j : myArray) {
            System.out.print(j + " ");
        }
    }
}
