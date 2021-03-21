package md.tekwill.homework2003;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double celsius,fahrenheit=212;

        System.out.println("Input a degree in Fahrenheit:"+fahrenheit);
        celsius=(fahrenheit-32)*5/9;
        System.out.println(fahrenheit +" degree Fahrenheit is equal to "+celsius+ " in Celsius");
    }
}
