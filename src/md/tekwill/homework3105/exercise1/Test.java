package md.tekwill.homework3105.exercise1;


public class Test {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new CargoShip("Titanic", "1901", 40000);
        ships[1] = new Ship("Concordia", "2008");
        ships[2] = new CruiseShip("Lusitania", "1900", 10000);
        for (Ship ship : ships) {
            System.out.println(ship.toString());
        }

    }
}
