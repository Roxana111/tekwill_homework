package md.tekwill.homework1805;

import java.util.ArrayList;

public class CompareTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<String> string1 = new ArrayList<>();
        string1.add("Something");
        string1.add("is");
        string1.add("wrong");
        ArrayList<String> string2 = new ArrayList<>();
        string2.add("Something");
        string2.add("is");
        string2.add("right");
        ArrayList<String> string3 = new ArrayList<>();
        for (String strings : string1) {
            string3.add(string2.contains(strings) ? "Same" : "Not the same");
        }
        System.out.println(string1 + " , " + string2 + " <=> " + string3);
    }
}

