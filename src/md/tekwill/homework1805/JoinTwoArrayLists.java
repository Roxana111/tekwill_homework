package md.tekwill.homework1805;

import java.util.ArrayList;

public class JoinTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<String> string1 = new ArrayList<>();
        string1.add("1");
        string1.add("2");
        string1.add("3");
        ArrayList<String> string2 = new ArrayList<>();
        string2.add("3");
        string2.add("4");
        string2.add("5");
        ArrayList<String> string3 = new ArrayList<>();
        string3.addAll(string1);
        string3.addAll(string2);
        System.out.println(string1 + " + " + string2 + " = " + string3);

    }
}
