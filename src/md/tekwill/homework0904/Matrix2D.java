package md.tekwill.homework0904;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int multiArray[][] = new int[3][3];
        System.out.println("Input elements in the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("element [" + i + "]" + "[" + j + "] :");
                multiArray[i][j] = in.nextInt();

            }
        }
        System.out.println("or another representation would be: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(Arrays.toString(multiArray[i]) + " ");
        }
        System.out.println();
        System.out.println("The matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}

