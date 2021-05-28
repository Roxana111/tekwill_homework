package md.tekwill.homework2805.firstpart;
import md.tekwill.homework2805.secondpart.Printable;

public class Rectangle extends Shape implements Printable{
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * (length + height);
    }

    @Override
    public void print(){
        System.out.println(this);
    }
}
