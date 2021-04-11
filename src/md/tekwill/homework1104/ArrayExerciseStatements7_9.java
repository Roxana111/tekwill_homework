package md.tekwill.homework1104;

import java.util.Scanner;

public class ArrayExerciseStatements7_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Consider a 2x3 integer array t
        // a) Write a statement that declares and creates t.
        int t[][] = new int[2][3];
        //b) How many rows does t have?
        // t has 2 rows
        //c) How many columns does t have?
        // t has 3 columns
        //d) How many elements does t have?
        // t has 6 elements (multiply 2 by 3)
        //e)Write access expressions for all the elements in row 1 of t.
        //t[1][0],t[1][1],t[1][2];
        //f)Write access expressions for all the elements in column 2 of t.
        //t[0][2],t[1][2]
        //g)Write a single statement that sets the element of t in row 0 and column 1 to zero
        t[0][1] = 0;
        //h)Write individual statements to initialize each element of t to zero
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;
        //i) Write a nested for statement that initializes each element of t to zero
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = 0;
            }
        }
        //j) Write a nested for statement that inputs the values for the elements of t from the user
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = in.nextInt();
            }
        }
        //k) Write a series of statements that determines and displays the smallest value in t.
        int min=t[0][0];
        for (int i = 0; i < t.length; i++){
            for (int j = 0; j < t[i].length; j++){
                if(min>t[i][j]){
                    min=t[i][j];
                }
            }
        }
        System.out.println(min);
        //l) Write a single printf statement that displays the elements of first row
        System.out.printf("%d %d %d\n",t[0][0],t[0][1],t[0][2]);
        //m)Write a statement that totals the elements of the third column of t.Do not use repetition
        int sum=t[0][2]+t[1][2];
        //n)Write a series of statements that displays the contents of t in tabular format. List column indices as headings across the top, and list the row indices at the left of each row.
        System.out.println("\t0\t1\t2");
        for(int i=0;i<t.length;i++){
            System.out.print(i);
            for(int j=0;j<t[i].length;j++)
                System.out.print("\t"+t[i][j]);
                System.out.println();

        }
    }
}
