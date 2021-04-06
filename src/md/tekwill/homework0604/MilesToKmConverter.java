package md.tekwill.homework0604;

public class MilesToKmConverter {
    public static void main(String[] args) {
        float kmPerMile = 1.609f;
        System.out.println("Miles     Kilometers");
        int i = 1;
        while (i <= 10) {
            System.out.println(i + "\t      " + (i * kmPerMile));
            i++;
        }

    }
}
