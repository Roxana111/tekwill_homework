package md.tekwill.homework1805;

import java.util.ArrayList;

public class CapitalizePlurals {
    public static void main(String[] args) {
        ArrayList<String> plurals = new ArrayList<>();
        plurals.add("trees");
        plurals.add("cup");
        plurals.add("Pencils");
        plurals.add("school");
        plurals.add("bananas");
        plurals.add("apple");

        ArrayList<String> string3 = new ArrayList<>();

        for (String plural : plurals) {
            if (plural.endsWith("s")) {
                string3.add(plural.toUpperCase());
            } else {
                string3.add(plural);
            }


        }

        System.out.println(plurals+" => "+string3);
    }
}
