package md.tekwill.homework2805.secondpart;

public abstract class Employee {
    String name;
    double age;
    double hourRate;

    public abstract double salary(double hours);

    public Employee(String name, double age, double hourRate) {
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }

    public Employee(String name, double age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name= " + name + " age = " + age + " hourRate= " + hourRate;
    }
}
