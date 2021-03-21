package md.tekwill.homework2003;

public class DistanceAndTime {
    public static void main(String[] args){
        int distancemeter=2500, hour=5, minutes=56, seconds=23;
        float  totalTimeSeconds,totalTimeHours,distancekm, distancemiles;
        float mps, kph, mph;
        System.out.println("Input distance in meters: "+distancemeter);
        System.out.println("Input hour:" +hour);
        System.out.println ("Input seconds:" +seconds);
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
