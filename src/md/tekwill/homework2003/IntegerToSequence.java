package md.tekwill.homework2003;

public class IntegerToSequence {
    public static void main(String[] args) {
        int number=123456;
        System.out.println("Input six non-negative digits: "+number);
        int a=number/100000;
        int b=(number/10000)%10;
        int c=(number/1000)%10;
        int d=(number/100)%10;
        int e=(number/10)%10;
        int f=number%10;
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);


    }
}
