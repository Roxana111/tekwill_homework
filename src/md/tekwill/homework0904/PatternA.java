package md.tekwill.homework0904;

import java.util.Arrays;

public class PatternA {
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

            System.out.println();
        }
        System.out.println();

    }
}

//for (int i = 1; i <= 4; i++) {
// for (int j = 1; j < i; j++) {
//System.out.print("0 ");
// }
//System.out.print("1 ");
//for (int k = i; k < 4; k++) {
//  System.out.print("0 ");
//}
//System.out.println();