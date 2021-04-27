package md.tekwill.homework2704;

import java.util.Scanner;

public class PerimeterCalculator {

    public static void main(String[] args) {
        new PerimeterCalculator().process();
    }

    public static double findperimeter(int number, double pi, double radius) {
        return (number * pi * radius);    //perimeter of circle
    }

    public static double findperimeter(int number2, double length) {
        return (number2 * length);       //perimeter of square
    }

    public static double findperimeter(int number3, int lengthrec, int widthrec) {
        return (number3 * (lengthrec + widthrec));//perimter of rectangle
    }

    public static double findperimeter(double base, double height, double hypothenuse) {
        return (base + height + hypothenuse); //perimeter of triangle
    }

    public double findperimeter(double alength, double blength, double clength, double dlength) {

        return (alength + blength + clength + dlength);//perimeter of quadrilateral
    }

    private void process() {
        final int number = 2;
        final int number2 = 4;
        final int number3 = 2;
        final double pi = Math.PI;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter square length");
        double length = in.nextDouble();
        System.out.println("Enter rectangle length");
        int lengthrec = in.nextInt();
        System.out.println("Enter rectangle width");
        int widthrec = in.nextInt();
        System.out.println("Enter circle radius");
        int radius = in.nextInt();
        System.out.println("Enter triangle base");
        double base = in.nextDouble();
        System.out.println("Enter triangle hypothenuse");
        double hypothenuse = in.nextDouble();
        System.out.println("Enter triangle height");
        double height = in.nextDouble();
        System.out.println("Enter quadrilateral first length");
        double alength = in.nextDouble();
        System.out.println("Enter quadrilateral second length");
        double blength = in.nextDouble();
        System.out.println("Enter quadrilateral third length");
        double clength = in.nextDouble();
        System.out.println("Enter quadrilateral fourth length");
        double dlength = in.nextDouble();
        System.out.println("perimeter of circle is " + findperimeter(number, pi, radius));
        System.out.println("perimeter of square is " + findperimeter(number2, length));
        System.out.println("perimeter of quadrilateral is " + findperimeter(alength, blength, clength, dlength));
        System.out.println("perimeter of triangle is " + findperimeter(base, height, hypothenuse));
        System.out.println("perimeter of rectangle is " + findperimeter(number3, lengthrec, widthrec));
    }
}
