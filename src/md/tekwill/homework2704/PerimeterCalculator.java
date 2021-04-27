package md.tekwill.homework2704;


public class PerimeterCalculator {


    public static double calculate(double radius) {
        return (2 * Math.PI * radius);    //perimeter of circle
    }

    public static double calculate(int squarelength) {
        return (4 * squarelength);       //perimeter of square
    }

    public static double calculate(int lengthrec, int widthrec) {
        return (2 * (lengthrec + widthrec));//perimeter of rectangle
    }

    public static double calculate(int triangleEdge1, int triangleEdge2, int triangleEdge3) {
        return (triangleEdge1 + triangleEdge2 + triangleEdge3); //perimeter of triangle
    }

    public static double calculate(int quadrilength1, int quadrilength2, int quadrilength3, int quadrilength4) {

        return (quadrilength1 + quadrilength2 + quadrilength3 + quadrilength4);//perimeter of quadrilateral
    }


}

