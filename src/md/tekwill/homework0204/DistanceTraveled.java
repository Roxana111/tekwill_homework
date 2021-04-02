package md.tekwill.homework0204;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the speed in miles per hour: ");
        double speed = in.nextDouble();
        System.out.print("Enter the time in hours: ");
        int time = in.nextInt();
        double distance;
        System.out.println("Hour  Distance Travelled\n----\t-------");
        for (int hours = 1; hours <= time; hours++) {
            distance = (hours * speed);
            System.out.println(hours + "\t  " + distance);
        }

    }
}
