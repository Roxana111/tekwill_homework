package md.tekwill.homework2003;
import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double celsius;
        Scanner in= new Scanner (System.in);
        System.out.println("Input a degree in Fahrenheit:");
        double fahrenheit=in.nextDouble();
        celsius=(fahrenheit-32)*5/9;
        System.out.println(fahrenheit +" degree Fahrenheit is equal to "+celsius+ " in Celsius");
    }
}
