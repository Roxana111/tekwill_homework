package md.tekwill.homework2605;

public class TeamLeader extends ProductionWorker {

    private double monthlyBonus;
    private double requiredTrainingHours;
    private double attendedTrainingHours;

    public TeamLeader(String name, String number, String hireDate, int shift, double payRate, double monthlyBonus, double required, double completed) {
        super(name, number, hireDate, shift, payRate);
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = required;
        this.attendedTrainingHours = completed;
    }

    public TeamLeader(TeamLeader teamlead) {
        super(teamlead.getName(), teamlead.getNumber(), teamlead.getHireDate(), teamlead.getShift(), teamlead.getPayRate());
        this.monthlyBonus = teamlead.getMonthlyBonus();
        this.requiredTrainingHours = getRequiredTrainingHours();
        this.attendedTrainingHours = getAttendedTrainingHours();
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

    public double getAttendedTrainingHours() {
        return attendedTrainingHours;
    }

    public void setAttendedTrainingHours(double hours) {
        this.attendedTrainingHours = hours;
    }

}
