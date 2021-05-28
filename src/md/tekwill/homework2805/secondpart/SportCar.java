package md.tekwill.homework2805.secondpart;

public class SportCar implements Printable {
    private String name;
    private int number;

    public SportCar(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString(){
        return "SportCar: "+"Name= "+name +" Number = "+number;
    }
    @Override
    public void print(){
        System.out.println(this);
    }
}
