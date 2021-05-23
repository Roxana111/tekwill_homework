package md.tekwill.homework2105;

public class ManagerTestEquality {
    public static void main(String[] args) {
        Manager john = new Manager("John", "Social Media");
        Manager johnSameReference = john;
        Manager johnOtherReference = new Manager("John", "Social Media");

        System.out.println(john.equals(johnSameReference));//true
        System.out.println(john.equals(johnOtherReference));//false before rewriting the equal method //true after rewriting it

    }

}
