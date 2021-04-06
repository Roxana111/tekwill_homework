package md.tekwill.homework0604;

import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int students = in.nextInt();
        System.out.println("Enter each student's name and score: ");
        int highestscore = 0;
        String highestscorename = "";
        int i = 1;
        while (i <= students) {
            System.out.print("\nName: ");
            String name = in.next();
            System.out.print("Score: ");
            int score = in.nextInt();
            if (score > highestscore) {
                highestscore = score;
                highestscorename = name;
            }
            i++;
        }
        System.out.println("Student with the highest score is: " + highestscorename);
    }

}
