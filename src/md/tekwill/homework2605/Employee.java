package md.tekwill.homework2605;

public class Employee {
    private String name;
    private String number;
    private String hireDate;


    public Employee(String name, String number, String hireDate) {
        this.name = name;
        this.number = number;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }


}
