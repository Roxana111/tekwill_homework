package md.tekwill.homework0904;

import java.util.Scanner;

public class TotalNrOfDuplicateElementsInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array: ");
        int size = in.nextInt();
        int[] myArray = new int[size];
        int count = 0;
        System.out.println("Input " + myArray.length + " elements in the array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("element -" + i + ":");
            myArray[i] = in.nextInt();
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
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("\nTotal number of duplicate elements found in the array is: " + count);
    }
}
