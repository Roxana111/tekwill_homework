package md.tekwill.homework3105.exercise1;

public class CargoShip extends Ship {
    private int tonnage;

    public CargoShip(String name, String year, int tonnage) {
        super(name, year);
        this.tonnage = tonnage;
    }

    public void setCargoCapacity(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getCargoCapacity() {
        return tonnage;
    }

    @Override
    public String toString() {
        return "Cargo Ship -" + super.getShipName() + " tonnage " + tonnage;
    }

}
