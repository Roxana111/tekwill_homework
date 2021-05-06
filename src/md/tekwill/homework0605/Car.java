package md.tekwill.homework0605;

public class Car {
    String brand;
    String color;
    double price;
    boolean quality;
    int nrOfSeats;


    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean getQuality() {
        return quality;
    }

    public int getNrOfSeats() {
        return nrOfSeats;
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setQuality(boolean newQuality) {
        quality = newQuality;
    }

    public void setNrOfSeats(int newNrOfSeats) {
        nrOfSeats = newNrOfSeats;
    }

    //first exercise
    public Car() {
        brand = "Ford";
    }

    //add as many constructors as possible
    public Car(double newPrice) {
        this(newPrice, "blue", false);
    }

    public Car(String newBrand) {
        this();
    }

    public Car(boolean newQuality, int newNrOfSeats) {
        this(7500);
        quality = newQuality;
        nrOfSeats = newNrOfSeats;
    }

    public Car(double newPrice, String newColor, boolean newQuality) {
        this(3000, "green", true, 6, "BMW");
    }

    public Car(double newPrice, String newColor, boolean newQuality, int newNrOfSeats, String newBrand) {
        price = newPrice;
        color = newColor;
        quality = newQuality;
        nrOfSeats = newNrOfSeats;
        brand = newBrand;
    }

    static void run() {
        System.out.println("Car is running...");
    }

}
