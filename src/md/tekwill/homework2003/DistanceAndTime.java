package md.tekwill.homework2003;
import java.util.Scanner;
public class DistanceAndTime {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        float  totalTimeSeconds,totalTimeHours,distancekm, distancemiles;
        float mps, kph, mph;

        System.out.println("Input distance in meters: ");
        int distancemeter=in.nextInt();

        System.out.println("Input hour:");
        int hour=in.nextInt();

        System.out.println("Input minutes: ");
        int minutes=in.nextInt();

        System.out.println ("Input seconds:");
        int seconds=in.nextInt();

        distancekm=distancemeter/1000f;
        distancemiles=distancemeter/1609f;
        totalTimeSeconds=(hour*3600f)+(minutes*60f)+seconds;
        totalTimeHours=hour+(minutes/60f)+(seconds/3600f);
        mps=distancemeter/totalTimeSeconds;
        kph=distancekm/totalTimeHours;
        mph=distancemiles/totalTimeHours;
        System.out.println("Your speed in meters/second is "+mps);
        System.out.println("Your speed in km/h is "+kph);
        System.out.println("Your speed in miles/h is "+mph);


    }
}
