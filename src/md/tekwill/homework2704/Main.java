package md.tekwill.homework2704;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of first triangle edge");
        int triangleEdge1 = in.nextInt();
        System.out.println("Enter length of second triangle edge");
        int triangleEdge2 = in.nextInt();
        System.out.println("Enter length of third triangle edge");
        int triangleEdge3 = in.nextInt();
        System.out.println("Perimeter of triangle is " + PerimeterCalculator.calculate(triangleEdge1, triangleEdge2, triangleEdge3));

        System.out.println("Enter square length");
        int squarelength = in.nextInt();
        System.out.println("Perimeter of square is " + PerimeterCalculator.calculate(squarelength));

        System.out.println("Enter quadrilateral first length");
        int quadrilength1 = in.nextInt();
        System.out.println("Enter quadrilateral second length");
        int quadrilength2 = in.nextInt();
        System.out.println("Enter quadrilateral third length");
        int quadrilength3 = in.nextInt();
        System.out.println("Enter quadrilateral fourth length");
        int quadrilength4 = in.nextInt();
        System.out.println("Perimeter of quadrilateral is " + PerimeterCalculator.calculate(quadrilength1, quadrilength2, quadrilength3, quadrilength4));

        System.out.println("Enter rectangle length");
        int lengthrec = in.nextInt();
        System.out.println("Enter rectangle width");
        int widthrec = in.nextInt();
        System.out.println("Perimeter of rectangle is " + PerimeterCalculator.calculate(lengthrec, widthrec));

        System.out.println("Enter circle radius");
        double radius = in.nextDouble();
        System.out.println("Perimeter of circle is " + PerimeterCalculator.calculate(radius));


    }

}
