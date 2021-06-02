package md.tekwill.homework3105.exercise1;

public class Ship {
    private String name;
    private String year;

    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getShipName() {
        return name;
    }

    public void setShipName(String name) {
        this.name = name;
    }

    public String getShipYear() {
        return year;
    }

    public void setShipYear(String year) {
        this.year = year;
    }

    public String toString() {
        return "Ship " + name + " year " + year;
    }

}
