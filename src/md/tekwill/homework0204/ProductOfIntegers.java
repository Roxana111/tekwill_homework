package md.tekwill.homework0204;


public class ProductOfIntegers {
    public static void main(String[] args) {

        int product = 1;
        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }
        System.out.print("product is " + product);


    }
}
