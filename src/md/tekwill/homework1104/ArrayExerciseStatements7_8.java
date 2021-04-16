package md.tekwill.homework1104;


public class ArrayExerciseStatements7_8 {
    public static void main(String[] args) {
        //a) Display the value of element 6 of array f
        // System.out.print(f[6]);
        //b) Initialize each of the five elements of one-dimensional integer array g to 8
        //int g[]={8,8,8,8,8};
        //c) Total the element of floating-point array c
        int c[] = new int[100];
        int sum = 0;
        for (int j : c) {
            sum += j;
        }
        //d) Copy 11-element array a into the first portion of array b, which contains 34 elements"
        int a[] = new int[11];
        int b[] = new int[34];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        //e) Determine and display the smallest and largest values contained in 99-element floating-point array w.
        float w[] = new float[99];
        float min = w[0];
        float max = w[0];
        for (float v : w) {
            if (min > v) {
                min = v;
            } else if (max < v) {
                max = v;
            }
        }

        System.out.println("largest value is: " + max);
        System.out.println("smallest value is: " + min);
    }

}


