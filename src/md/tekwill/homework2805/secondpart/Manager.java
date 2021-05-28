package md.tekwill.homework2805.secondpart;

public class Manager extends Employee implements Printable{
    public Manager(String name, double age){
        super(name, age);
    }
    public Manager(String name, double age, double hourRate){
        super(name, age, hourRate);
    }
  @Override
    public double salary(double hours) {
        return hours * this.hourRate;
    }
    @Override
  public void print(){
    System.out.println(this);
 }

}
