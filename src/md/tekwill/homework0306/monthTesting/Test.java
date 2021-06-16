package md.tekwill.homework0306.monthTesting;

public class Test {
    public static void main(String[] args) {

        Month m = new Month();

        try {
            m.setMonthName("hey");
        } catch (InvalidMonthNameException exception) {
            System.out.println(exception.getMessage());
        }
      

        try {
            m.setMonthNumber(10);
        } catch (InvalidMonthNumberException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(m);
    }
}

