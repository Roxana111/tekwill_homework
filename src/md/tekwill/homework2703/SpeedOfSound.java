package md.tekwill.homework2703;

import java.util.Scanner;

public class SpeedOfSound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"air\", \"water\", or \"steel\": ");
        String medium = in.nextLine();
        System.out.print("Enter the distance in feet in " + medium + ":");
        float distance = in.nextFloat();
        float time;
        float speedair = 1100f;
        float speedwater = 4900f;
        float speedsteel = 16400f;
        if (medium.equalsIgnoreCase("air")) {
            time = distance / speedair;
            System.out.print("The amount of time to travel in " + medium + " is " + time + " seconds");
        } else if (medium.equalsIgnoreCase("water")) {
            time = distance / speedwater;
            System.out.print("The amount of time to travel in " + medium + " is " + time + " seconds");
        } else if (medium.equalsIgnoreCase("steel")) {
            time = distance / speedsteel;
            System.out.print("The amount of time to travel in " + medium + " is " + time + " seconds");
        } else {
            System.out.println("Please enter one of the specified mediums! ");
        }
    }
}
