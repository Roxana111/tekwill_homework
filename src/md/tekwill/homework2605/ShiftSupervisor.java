package md.tekwill.homework2605;

public class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double bonus;

    public ShiftSupervisor(String name, String number, String hireDate, double salary, double bonus) {
        super(name, number, hireDate);
        this.annualSalary = salary;
        this.bonus = bonus;
    }

    public ShiftSupervisor(ShiftSupervisor shiftSuper) {
        super(shiftSuper.getName(), shiftSuper.getNumber(), shiftSuper.getHireDate());
        this.annualSalary = shiftSuper.annualSalary;
        this.bonus = shiftSuper.bonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double newSalary) {
        this.annualSalary = newSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double newBonus) {
        this.bonus = newBonus;
    }


}
