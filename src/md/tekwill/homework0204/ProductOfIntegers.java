package md.tekwill.homework0204;


public class ProductOfIntegers {
    public static void main(String[] args) {

        int product = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                product *= i;
            }
        }
        System.out.print("product is " + product);


    }
}
