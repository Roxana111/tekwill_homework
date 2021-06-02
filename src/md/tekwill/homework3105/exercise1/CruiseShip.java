package md.tekwill.homework3105.exercise1;

public class CruiseShip extends Ship {
    int maxPassengers;

    public CruiseShip(String name, String year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public String toString() {
        return "Cruise Ship: " + super.getShipName() + " max nr of passengers " + maxPassengers;
    }

}
