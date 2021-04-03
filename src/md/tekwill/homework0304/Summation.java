package md.tekwill.homework0304;

public class Summation {
    public static void main(String[] args) {
        float sum = 0f;
        for (int i = 1; i <= 624; i++) {
            sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
        System.out.print("sum of the series is: "+sum );
    }
}
