package md.tekwill.homework2605;

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee("Roxana", "111-M", "05/26/2021");
        System.out.println(e);
        ProductionWorker work = new ProductionWorker("Harry", "222-R", "08/11/2019", 2, 120.00);
        System.out.println(work);
        ShiftSupervisor supers = new ShiftSupervisor("John", "444-S", "03/11/2008", 3200, 200);
        System.out.println(supers);
        TeamLeader teams = new TeamLeader("Garry", "555-K", "09/08/2017", 1, 130.00, 120, 50, 23);
        System.out.println(teams);
    }
}
