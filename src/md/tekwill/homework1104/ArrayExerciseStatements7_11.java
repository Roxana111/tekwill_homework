package md.tekwill.homework1104;

public class ArrayExerciseStatements7_11 {
    public static void main(String[] args) {
        //a)Set the 10 elements of integer array counts to zero
        int[] myArray = new int[10];
        //b)Add 1 to each of the 15 elements of integer array bonus
        int bonus[];
        bonus = new int[15];
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] += 1;
        }
        //c) Display the 5 values of integer array bestScores in column format
        int bestScores[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < bestScores.length; i++) {
            System.out.println("\t" + bestScores[i]);
        }

    }
}
