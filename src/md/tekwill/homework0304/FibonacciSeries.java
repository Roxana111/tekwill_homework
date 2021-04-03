package md.tekwill.homework0304;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,t1=0,t2=1,nextTerm;
        System.out.print("Input number of terms: ");
        int numberOfTerms=in.nextInt();
        System.out.println("Fibonacci series: ");
        for(i=1;i<=numberOfTerms;i++){
            System.out.print(t1+" ");
            nextTerm=t1+t2;
            t1=t2;
            t2=nextTerm;

        }

    }
}
