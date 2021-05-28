package md.tekwill.homework2805.secondpart;

public class Clerk extends Employee {
    public Clerk(String name, double age, double hourRate) {
        super(name, age, hourRate);
    }

    @Override
    public double salary(double hours) {
        return hours * this.hourRate;
    }
}
