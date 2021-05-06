package md.tekwill.homework0605;

public class TestCar {
    public static void main(String[] args) {
        //car 1
        Car c1=new Car();
        c1.price = 20000;
        c1.color= "black";
        c1.quality=true;
        c1.nrOfSeats=5;
        c1.brand="VOLVO";
        System.out.println("1. Car passport:\n price is "+c1.price+ "$"+"\n color: "+c1.color+"\n quality: "+c1.quality+"\n number of Seats: "+c1.nrOfSeats+"\n brand: "+c1.brand);

        //car 2
        Car c2=new Car();
        c2.setPrice(8000);
        c2.setColor("white");
        c2.setQuality(false);
        c2.setNrOfSeats(2);
        c2.setBrand("TOYOTA");
        System.out.println("2. Car passport:\n price is: "+c2.getPrice()+"$"+"\n color: "+c2.getColor()+ "\n quality: "+ c2.getQuality()+ "\n number of Seats: "+c2.getNrOfSeats()+ "\n brand: "+c2.getBrand());

        //car 3
        Car c3=new Car(100000,"red",true,4, "Ferrari");
        System.out.println("3. Car passport:\n price is:"+c3.getPrice()+"$"+"\n color: "+c3.getColor()+ "\n quality: "+ c3.getQuality()+ "\n number of Seats: "+c3.getNrOfSeats()+ "\n brand: "+c3.getBrand());

        //first exercise
        Car ford=new Car();
        String brand =ford.getBrand();
        System.out.println(brand);
        Car.run();
    }
}
