package md.tekwill.homework2703;

import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of calories: ");
        float calories = in.nextFloat();
        System.out.print("Enter fat amount in grams: ");
        float fat = in.nextFloat();
        float caloriesfat = fat * 9f;
        float calpercentage = (100f * caloriesfat / calories);
        System.out.println("The percentage of calories from fat is :" + calpercentage + "%");
        if (caloriesfat < calories * 30f / 100f)
            System.out.println("Food is low in fat");
        else
            System.out.println("Food has a decent amount of fat");
    }

}
