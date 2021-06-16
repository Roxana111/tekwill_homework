package md.tekwill.homework0306;

import java.util.Scanner;
import java.util.Random;

public class ArrayIndexOutOfBoundsEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = getArr();
        System.out.println("enter the index of the array: ");
        try {
            System.out.println("The element on the chosen index is: " + arr[in.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Oops! Out of Bounds!");
        }

    }

    public static int[] getArr() {
        Random random = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt()+1;
        }
        return arr;
    }
}
