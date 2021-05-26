package md.tekwill.homework2605;

public class TeamLeader extends ProductionWorker {

    private double monthlyBonus;
    private double requiredTrainingHours;
    private double completedTrainingHours;

    public TeamLeader(String name, String number, String hireDate, int shift, double payRate, double monthlyBonus, double required, double completed) {
        super(name, number, hireDate, shift, payRate);
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = required;
        this.completedTrainingHours = completed;
    }

    public TeamLeader(TeamLeader teamlead) {
        super(teamlead.getName(), teamlead.getNumber(), teamlead.getHireDate(), teamlead.getShift(), teamlead.getPayRate());
        this.monthlyBonus = teamlead.getMonthlyBonus();
        this.requiredTrainingHours = getRequiredTrainingHours();
        this.completedTrainingHours = getCompletedTrainingHours();
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double bonus) {
        this.monthlyBonus = bonus;
    }

    public double getRequiredTrainingHours() {
        return requiredTrainingHours;
    }

    public void setRequiredTrainingHours(double hours) {
        this.requiredTrainingHours = hours;
    }

    public double getCompletedTrainingHours() {
        return completedTrainingHours;
    }

    public void setCompletedTrainingHours(double hours) {
        this.completedTrainingHours = hours;
    }

}
