package md.tekwill.homework3105.exercise3;

public class Test {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(1, 2, 10, 10);
        point1.moveLeft();//0 2
        System.out.println(point1);
        point1.moveUp(); //0 3
        System.out.println(point1);
        point1.moveDown();//0 2
        System.out.println(point1);
        point1.moveRight();//1 2
        System.out.println(point1);

       MovableCircle circle1 = new MovableCircle(2,3,13,13,4);
        System.out.println(circle1);
    }
}