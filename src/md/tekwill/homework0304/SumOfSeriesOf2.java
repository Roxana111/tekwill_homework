package md.tekwill.homework0304;

import java.util.Scanner;

public class SumOfSeriesOf2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = in.nextInt();
        int k = 0, sum = 0;
        for (int i = 1; i <= num; i++) {
            k = (k * 10) + 2;
            sum += k;
        }
        System.out.print("Sum is equal to: " + sum);
    }
}
