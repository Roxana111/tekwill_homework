package md.tekwill.homework2605;

public class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String name, String number, String hireDate, int shift, double payRate) {
        super(name, number, hireDate);
        this.shift = shift;
        this.hourlyPayRate = payRate;
    }

    public ProductionWorker(ProductionWorker productWork) {
        super(productWork.getName(), productWork.getNumber(), productWork.getHireDate());
        this.shift = productWork.getShift();
        this.hourlyPayRate = productWork.getPayRate();
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int newShift) {
        this.shift = newShift;
    }

    public double getPayRate() {
        return hourlyPayRate;
    }

    public void setPayRate(double newPayRate) {
        this.hourlyPayRate = newPayRate;
    }

}
