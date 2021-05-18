package md.tekwill.homework1805;

import java.util.ArrayList;

public class BothListsCommonElements {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(4);
        array1.add(8);
        array1.add(9);
        array1.add(11);
        array1.add(15);
        array1.add(17);
        array1.add(28);
        array1.add(41);
        array1.add(59);
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(4);
        array2.add(7);
        array2.add(11);
        array2.add(17);
        array2.add(19);
        array2.add(23);
        array2.add(28);
        array2.add(37);
        array2.add(59);
        array2.add(81);
        ArrayList<Integer> array3 = new ArrayList<>();
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    array3.add(i);
                    break;
                }
            }
        }
        System.out.println(array1 + ", " + array2 + " => " + array3);
    }
}
